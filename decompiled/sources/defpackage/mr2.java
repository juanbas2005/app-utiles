package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.io.File;
import java.util.UUID;

/* renamed from: mr2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mr2 extends SQLiteOpenHelper {
    public static final /* synthetic */ int D = 0;
    public boolean A;
    public final hp5 B;
    public boolean C;
    public final Context w;
    public final ji8 x;
    public final qa y;
    public final boolean z;

    /* JADX WARNING: Illegal instructions before constructor call */
    public mr2(Context context, String str, ji8 ji8, qa qaVar, boolean z2) {
        super(r1, r2, (SQLiteDatabase.CursorFactory) null, qaVar.x, new jr2(qaVar, ji8));
        String str2;
        context.getClass();
        qaVar.getClass();
        Context context2 = context;
        String str3 = str;
        this.w = context2;
        this.x = ji8;
        this.y = qaVar;
        this.z = z2;
        if (str3 == null) {
            str2 = UUID.randomUUID().toString();
            str2.getClass();
        } else {
            str2 = str3;
        }
        this.B = new hp5(str2, context2.getCacheDir(), false);
    }

    public final ir2 a(boolean z2) {
        boolean z3;
        hp5 hp5 = this.B;
        try {
            if (this.C || getDatabaseName() == null) {
                z3 = false;
            } else {
                z3 = true;
            }
            hp5.a(z3);
            this.A = false;
            SQLiteDatabase l = l(z2);
            if (this.A) {
                close();
                ir2 a = a(z2);
                hp5.b();
                return a;
            }
            ir2 k = k(l);
            hp5.b();
            return k;
        } catch (Throwable th) {
            hp5.b();
            throw th;
        }
    }

    public final void close() {
        hp5 hp5 = this.B;
        try {
            hp5.a(hp5.a);
            super.close();
            this.x.x = null;
            this.C = false;
        } finally {
            hp5.b();
        }
    }

    public final ir2 k(SQLiteDatabase sQLiteDatabase) {
        ji8 ji8 = this.x;
        ji8.getClass();
        ir2 ir2 = (ir2) ji8.x;
        if (ir2 != null && ir2.w.equals(sQLiteDatabase)) {
            return ir2;
        }
        ir2 ir22 = new ir2(sQLiteDatabase);
        ji8.x = ir22;
        return ir22;
    }

    public final SQLiteDatabase l(boolean z2) {
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z3 = this.C;
        Context context = this.w;
        if (!(databaseName == null || z3 || (parentFile = context.getDatabasePath(databaseName).getParentFile()) == null)) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        if (z2) {
            try {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                writableDatabase.getClass();
                return writableDatabase;
            } catch (Throwable th) {
                th = th;
                if (th instanceof kr2) {
                    kr2 kr2 = (kr2) th;
                    int ordinal = kr2.w.ordinal();
                    th = kr2.x;
                    if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
                        throw th;
                    } else if (ordinal != 4) {
                        h.c();
                        return null;
                    } else if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                }
                if (!(th instanceof SQLiteException) || databaseName == null || !this.z) {
                    throw th;
                }
                context.deleteDatabase(databaseName);
                if (z2) {
                    try {
                        SQLiteDatabase writableDatabase2 = getWritableDatabase();
                        writableDatabase2.getClass();
                        return writableDatabase2;
                    } catch (kr2 e) {
                        throw e.x;
                    }
                } else {
                    SQLiteDatabase readableDatabase = getReadableDatabase();
                    readableDatabase.getClass();
                    return readableDatabase;
                }
            }
        } else {
            SQLiteDatabase readableDatabase2 = getReadableDatabase();
            readableDatabase2.getClass();
            return readableDatabase2;
        }
    }

    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        boolean z2 = this.A;
        qa qaVar = this.y;
        if (!z2 && qaVar.x != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            k(sQLiteDatabase);
            qaVar.getClass();
        } catch (Throwable th) {
            throw new kr2(lr2.w, th);
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        try {
            ((dq1) this.y.y).j(new h87(k(sQLiteDatabase)));
        } catch (Throwable th) {
            throw new kr2(lr2.x, th);
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.A = true;
        try {
            this.y.i(k(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new kr2(lr2.z, th);
        }
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.A) {
            try {
                qa qaVar = this.y;
                ir2 k = k(sQLiteDatabase);
                dq1 dq1 = (dq1) qaVar.y;
                dq1.l(new h87(k));
                dq1.i = k;
            } catch (Throwable th) {
                throw new kr2(lr2.A, th);
            }
        }
        this.C = true;
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.A = true;
        try {
            this.y.i(k(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new kr2(lr2.y, th);
        }
    }
}
