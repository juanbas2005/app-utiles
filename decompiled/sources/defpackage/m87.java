package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.lang.reflect.Method;

/* renamed from: m87  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class m87 extends o87 {
    public final Object A;
    public final /* synthetic */ int z = 1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m87(ir2 ir2, String str) {
        super(ir2, str);
        ir2.getClass();
        str.getClass();
        this.A = ir2.l(str);
    }

    public final void F(int i, String str) {
        int i2 = this.z;
        Object obj = this.A;
        switch (i2) {
            case b85.b:
                str.getClass();
                ((n87) obj).F(i, str);
                return;
            case 1:
                str.getClass();
                a();
                ((qr2) obj).r(i, str);
                return;
            default:
                str.getClass();
                a();
                l55.w(25, "column index out of range");
                throw null;
        }
    }

    public boolean J() {
        switch (this.z) {
            case b85.b:
                return ((n87) this.A).J();
            default:
                return super.J();
        }
    }

    public final void K(double d) {
        int i = this.z;
        Object obj = this.A;
        switch (i) {
            case b85.b:
                ((n87) obj).K(d);
                return;
            case 1:
                a();
                ((qr2) obj).W(d, 3);
                return;
            default:
                a();
                l55.w(25, "column index out of range");
                throw null;
        }
    }

    public final String R(int i) {
        switch (this.z) {
            case b85.b:
                return ((n87) this.A).R(i);
            case 1:
                a();
                l55.w(21, "no row");
                throw null;
            default:
                a();
                l55.w(21, "no row");
                throw null;
        }
    }

    public final void close() {
        int i = this.z;
        Object obj = this.A;
        switch (i) {
            case b85.b:
                ((n87) obj).close();
                return;
            case 1:
                ((qr2) obj).close();
                this.y = true;
                return;
            default:
                this.y = true;
                return;
        }
    }

    public final void f(long j, int i) {
        int i2 = this.z;
        Object obj = this.A;
        switch (i2) {
            case b85.b:
                ((n87) obj).f(j, i);
                return;
            case 1:
                a();
                ((qr2) obj).f(j, i);
                return;
            default:
                a();
                l55.w(25, "column index out of range");
                throw null;
        }
    }

    public final byte[] getBlob(int i) {
        switch (this.z) {
            case b85.b:
                return ((n87) this.A).getBlob(i);
            case 1:
                a();
                l55.w(21, "no row");
                throw null;
            default:
                a();
                l55.w(21, "no row");
                throw null;
        }
    }

    public final int getColumnCount() {
        switch (this.z) {
            case b85.b:
                return ((n87) this.A).getColumnCount();
            case 1:
                a();
                return 0;
            default:
                a();
                return 0;
        }
    }

    public final String getColumnName(int i) {
        switch (this.z) {
            case b85.b:
                return ((n87) this.A).getColumnName(i);
            case 1:
                a();
                l55.w(21, "no row");
                throw null;
            default:
                a();
                l55.w(21, "no row");
                throw null;
        }
    }

    public final double getDouble(int i) {
        switch (this.z) {
            case b85.b:
                return ((n87) this.A).getDouble(i);
            case 1:
                a();
                l55.w(21, "no row");
                throw null;
            default:
                a();
                l55.w(21, "no row");
                throw null;
        }
    }

    public final long getLong(int i) {
        switch (this.z) {
            case b85.b:
                return ((n87) this.A).getLong(i);
            case 1:
                a();
                l55.w(21, "no row");
                throw null;
            default:
                a();
                l55.w(21, "no row");
                throw null;
        }
    }

    public final void h(int i, byte[] bArr) {
        int i2 = this.z;
        Object obj = this.A;
        switch (i2) {
            case b85.b:
                ((n87) obj).h(i, bArr);
                return;
            case 1:
                a();
                ((qr2) obj).h(i, bArr);
                return;
            default:
                a();
                l55.w(25, "column index out of range");
                throw null;
        }
    }

    public final boolean i0() {
        int i = this.z;
        ir2 ir2 = this.w;
        Object obj = this.A;
        switch (i) {
            case b85.b:
                n87 n87 = (n87) obj;
                boolean i0 = n87.i0();
                if (n87.R(0).equalsIgnoreCase("wal")) {
                    ir2.w.enableWriteAheadLogging();
                } else {
                    ir2.w.disableWriteAheadLogging();
                }
                return i0;
            case 1:
                a();
                ((qr2) obj).x.execute();
                return false;
            default:
                int ordinal = ((l87) obj).ordinal();
                if (ordinal == 0) {
                    ir2.B();
                    ir2.o();
                } else if (ordinal == 1) {
                    ir2.o();
                } else if (ordinal == 2) {
                    ir2.a();
                } else if (ordinal == 3) {
                    ir2.k();
                } else if (ordinal == 4) {
                    SQLiteDatabase sQLiteDatabase = ir2.w;
                    nz3 nz3 = ir2.A;
                    if (((Method) nz3.getValue()) != null) {
                        nz3 nz32 = ir2.z;
                        if (((Method) nz32.getValue()) != null) {
                            Method method = (Method) nz3.getValue();
                            method.getClass();
                            Method method2 = (Method) nz32.getValue();
                            method2.getClass();
                            Object invoke = method2.invoke(sQLiteDatabase, (Object[]) null);
                            if (invoke != null) {
                                method.invoke(invoke, new Object[]{0, null, 0, null});
                            } else {
                                h.s("Required value was null.");
                            }
                        }
                    }
                    ir2.a();
                } else {
                    h.c();
                }
                return false;
        }
    }

    public final boolean isNull(int i) {
        switch (this.z) {
            case b85.b:
                return ((n87) this.A).isNull(i);
            case 1:
                a();
                l55.w(21, "no row");
                throw null;
            default:
                a();
                l55.w(21, "no row");
                throw null;
        }
    }

    public final void m(int i) {
        int i2 = this.z;
        Object obj = this.A;
        switch (i2) {
            case b85.b:
                ((n87) obj).m(i);
                return;
            case 1:
                a();
                ((qr2) obj).m(i);
                return;
            default:
                a();
                l55.w(25, "column index out of range");
                throw null;
        }
    }

    public void n() {
        int i = this.z;
        Object obj = this.A;
        switch (i) {
            case b85.b:
                ((n87) obj).n();
                return;
            case 1:
                a();
                ((qr2) obj).n();
                return;
            default:
                super.n();
                return;
        }
    }

    public void reset() {
        switch (this.z) {
            case b85.b:
                ((n87) this.A).reset();
                return;
            default:
                super.reset();
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m87(ir2 ir2, String str, n87 n87) {
        super(ir2, str);
        ir2.getClass();
        str.getClass();
        this.A = n87;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m87(ir2 ir2, String str, l87 l87) {
        super(ir2, str);
        ir2.getClass();
        str.getClass();
        this.A = l87;
    }
}
