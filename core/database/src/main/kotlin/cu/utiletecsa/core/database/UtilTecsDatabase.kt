package cu.utiletecsa.core.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import cu.utiletecsa.security.CryptoEngine

/**
 * Base de datos local (SQLite) de UtilEs.
 *
 * Esquema equivalente al de la app original (`JetpackDatabase`) con la mitigación
 * clave de la auditoría: la columna `encrypted_password` de `nauta_accounts` se
 * escribe SIEMPRE cifrada con [CryptoEngine] (AES-GCM + AndroidKeyStore), nunca
 * en claro, y el fichero de BD no se exporta con backups (allowBackup=false en
 * el manifest de :app).
 */
class UtilTecsDatabase private constructor(context: Context) :
    SQLiteOpenHelper(context, DB_NAME, null, DB_VERSION) {

    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL(
            """
            CREATE TABLE IF NOT EXISTS nauta_accounts (
                email TEXT NOT NULL PRIMARY KEY,
                encrypted_password TEXT NOT NULL,
                last_used INTEGER NOT NULL DEFAULT 0
            )
            """.trimIndent(),
        )
        db.execSQL(
            """
            CREATE TABLE IF NOT EXISTS ussd_responses (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                ussd_code TEXT NOT NULL,
                value TEXT NOT NULL,
                timestamp INTEGER NOT NULL
            )
            """.trimIndent(),
        )
        db.execSQL(
            "CREATE INDEX IF NOT EXISTS idx_ussd_responses_code ON ussd_responses(ussd_code)",
        )
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        // Esquema inicial (v1): sin migraciones pendientes.
    }

    // ---------------------------------------------------------------- nauta

    /** Inserta o actualiza una cuenta Nauta; la contraseña se cifra aquí dentro. */
    fun upsertNautaAccount(email: String, plaintextPassword: String, crypto: CryptoEngine, now: Long) {
        val db = writableDatabase
        db.execSQL(
            "INSERT OR REPLACE INTO nauta_accounts (email, encrypted_password, last_used) VALUES (?, ?, ?)",
            arrayOf(email, crypto.encryptString(plaintextPassword, ALIAS_NAUTA), now),
        )
    }

    /** Recupera la contraseña descifrada de una cuenta Nauta, o null si no existe. */
    fun getNautaPassword(email: String, crypto: CryptoEngine): String? {
        readableDatabase.rawQuery(
            "SELECT encrypted_password FROM nauta_accounts WHERE email = ? LIMIT 1",
            arrayOf(email),
        ).use { cursor ->
            if (!cursor.moveToFirst()) return null
            val token = cursor.getString(0)
            return runCatching { crypto.decryptString(token, ALIAS_NAUTA) }.getOrNull()
        }
    }

    fun listNautaAccounts(): List<Pair<String, Long>> {
        val out = mutableListOf<Pair<String, Long>>()
        readableDatabase.rawQuery(
            "SELECT email, last_used FROM nauta_accounts ORDER BY last_used DESC",
            null,
        ).use { cursor ->
            while (cursor.moveToNext()) out += cursor.getString(0) to cursor.getLong(1)
        }
        return out
    }

    fun deleteNautaAccount(email: String) {
        writableDatabase.execSQL("DELETE FROM nauta_accounts WHERE email = ?", arrayOf(email))
    }

    // --------------------------------------------------------------- ussd

    fun insertUssdResponse(code: String, value: String, timestamp: Long) {
        writableDatabase.execSQL(
            "INSERT INTO ussd_responses (ussd_code, value, timestamp) VALUES (?, ?, ?)",
            arrayOf(code, value, timestamp),
        )
    }

    fun latestUssdResponse(code: String): String? {
        readableDatabase.rawQuery(
            "SELECT value FROM ussd_responses WHERE ussd_code = ? ORDER BY timestamp DESC LIMIT 1",
            arrayOf(code),
        ).use { cursor ->
            return if (cursor.moveToFirst()) cursor.getString(0) else null
        }
    }

    companion object {
        private const val DB_NAME = "utiletecsa.db"
        private const val DB_VERSION = 1
        private const val ALIAS_NAUTA = "utiletecsa_nauta_key"

        @Volatile
        private var instance: UtilTecsDatabase? = null

        fun get(context: Context): UtilTecsDatabase =
            instance ?: synchronized(this) {
                instance ?: UtilTecsDatabase(context.applicationContext).also { instance = it }
            }
    }
}
