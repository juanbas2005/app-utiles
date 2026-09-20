package defpackage;

import android.database.Cursor;
import java.util.Arrays;

/* renamed from: n87  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class n87 extends o87 {
    public long[] A = new long[0];
    public double[] B = new double[0];
    public String[] C = new String[0];
    public byte[][] D = new byte[0][];
    public Cursor E;
    public int[] z = new int[0];

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n87(ir2 ir2, String str) {
        super(ir2, str);
        ir2.getClass();
        str.getClass();
    }

    public static void o(Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            l55.w(25, "column index out of range");
            throw null;
        }
    }

    public final void F(int i, String str) {
        str.getClass();
        a();
        k(3, i);
        this.z[i] = 3;
        this.C[i] = str;
    }

    public final void K(double d) {
        a();
        k(2, 3);
        this.z[3] = 2;
        this.B[3] = d;
    }

    public final String R(int i) {
        a();
        Cursor u = u();
        o(u, i);
        String string = u.getString(i);
        string.getClass();
        return string;
    }

    public final void close() {
        if (!this.y) {
            n();
            reset();
        }
        this.y = true;
    }

    public final void f(long j, int i) {
        a();
        k(1, i);
        this.z[i] = 1;
        this.A[i] = j;
    }

    public final byte[] getBlob(int i) {
        a();
        Cursor u = u();
        o(u, i);
        byte[] blob = u.getBlob(i);
        blob.getClass();
        return blob;
    }

    public final int getColumnCount() {
        a();
        l();
        Cursor cursor = this.E;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    public final String getColumnName(int i) {
        a();
        l();
        Cursor cursor = this.E;
        if (cursor != null) {
            o(cursor, i);
            String columnName = cursor.getColumnName(i);
            columnName.getClass();
            return columnName;
        }
        h.s("Required value was null.");
        return null;
    }

    public final double getDouble(int i) {
        a();
        Cursor u = u();
        o(u, i);
        return u.getDouble(i);
    }

    public final long getLong(int i) {
        a();
        Cursor u = u();
        o(u, i);
        return u.getLong(i);
    }

    public final void h(int i, byte[] bArr) {
        a();
        k(4, i);
        this.z[i] = 4;
        this.D[i] = bArr;
    }

    public final boolean i0() {
        a();
        l();
        Cursor cursor = this.E;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        h.s("Required value was null.");
        return false;
    }

    public final boolean isNull(int i) {
        a();
        Cursor u = u();
        o(u, i);
        return u.isNull(i);
    }

    public final void k(int i, int i2) {
        int i3 = i2 + 1;
        int[] iArr = this.z;
        if (iArr.length < i3) {
            this.z = Arrays.copyOf(iArr, i3);
        }
        if (i == 1) {
            long[] jArr = this.A;
            if (jArr.length < i3) {
                this.A = Arrays.copyOf(jArr, i3);
            }
        } else if (i == 2) {
            double[] dArr = this.B;
            if (dArr.length < i3) {
                this.B = Arrays.copyOf(dArr, i3);
            }
        } else if (i == 3) {
            String[] strArr = this.C;
            if (strArr.length < i3) {
                this.C = (String[]) Arrays.copyOf(strArr, i3);
            }
        } else if (i == 4) {
            byte[][] bArr = this.D;
            if (bArr.length < i3) {
                this.D = (byte[][]) Arrays.copyOf(bArr, i3);
            }
        }
    }

    public final void l() {
        if (this.E == null) {
            br4 br4 = new br4(16, (Object) this);
            ir2 ir2 = this.w;
            ir2.getClass();
            Cursor rawQueryWithFactory = ir2.w.rawQueryWithFactory(new gr2(new ch(1, br4)), ((n87) br4.x).x, ir2.y, (String) null);
            rawQueryWithFactory.getClass();
            this.E = rawQueryWithFactory;
        }
    }

    public final void m(int i) {
        a();
        k(5, i);
        this.z[i] = 5;
    }

    public final void n() {
        a();
        this.z = new int[0];
        this.A = new long[0];
        this.B = new double[0];
        this.C = new String[0];
        this.D = new byte[0][];
    }

    public final void reset() {
        a();
        Cursor cursor = this.E;
        if (cursor != null) {
            cursor.close();
        }
        this.E = null;
    }

    public final Cursor u() {
        Cursor cursor = this.E;
        if (cursor != null) {
            return cursor;
        }
        l55.w(21, "no row");
        throw null;
    }
}
