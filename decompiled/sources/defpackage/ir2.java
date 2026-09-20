package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;

/* renamed from: ir2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ir2 implements Closeable {
    public static final nz3 A;
    public static final String[] x = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] y = new String[0];
    public static final nz3 z;
    public final SQLiteDatabase w;

    static {
        nf1 nf1 = new nf1(13);
        i44 i44 = i44.w;
        z = rg3.y(i44, nf1);
        A = rg3.y(i44, new nf1(14));
    }

    public ir2(SQLiteDatabase sQLiteDatabase) {
        this.w = sQLiteDatabase;
    }

    public final void B() {
        this.w.setTransactionSuccessful();
    }

    public final boolean Z() {
        return this.w.inTransaction();
    }

    public final void a() {
        this.w.beginTransaction();
    }

    public final void close() {
        this.w.close();
    }

    public final boolean isOpen() {
        return this.w.isOpen();
    }

    public final void k() {
        this.w.beginTransactionNonExclusive();
    }

    public final qr2 l(String str) {
        str.getClass();
        SQLiteStatement compileStatement = this.w.compileStatement(str);
        compileStatement.getClass();
        return new qr2(compileStatement);
    }

    public final void o() {
        this.w.endTransaction();
    }

    public final void u(String str) {
        this.w.execSQL(str);
    }

    public final void v(Object[] objArr) {
        this.w.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }
}
