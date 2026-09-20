package defpackage;

import android.database.sqlite.SQLiteProgram;

/* renamed from: pr2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class pr2 implements k87 {
    public final SQLiteProgram w;

    public pr2(SQLiteProgram sQLiteProgram) {
        sQLiteProgram.getClass();
        this.w = sQLiteProgram;
    }

    public final void W(double d, int i) {
        this.w.bindDouble(i, d);
    }

    public final void close() {
        this.w.close();
    }

    public final void f(long j, int i) {
        this.w.bindLong(i, j);
    }

    public final void h(int i, byte[] bArr) {
        this.w.bindBlob(i, bArr);
    }

    public final void m(int i) {
        this.w.bindNull(i);
    }

    public final void n() {
        this.w.clearBindings();
    }

    public final void r(int i, String str) {
        str.getClass();
        this.w.bindString(i, str);
    }
}
