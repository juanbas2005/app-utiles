package defpackage;

import java.util.ArrayList;

/* renamed from: oj3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class oj3 extends er5 implements ei3 {
    public final boolean W;
    public final yb5 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oj3(vj1 vj1, rm rmVar, fl4 fl4, us1 us1, boolean z, uq4 uq4, sy6 sy6, cr5 cr5, int i, boolean z2, yb5 yb5) {
        super(vj1, cr5, rmVar, fl4, us1, z, uq4, i, sy6, false, false, false, false, false);
        if (vj1 == null) {
            v0(0);
            throw null;
        } else if (rmVar == null) {
            v0(1);
            throw null;
        } else if (fl4 == null) {
            v0(2);
            throw null;
        } else if (us1 == null) {
            v0(3);
            throw null;
        } else if (uq4 == null) {
            v0(4);
            throw null;
        } else if (sy6 == null) {
            v0(5);
            throw null;
        } else if (i != 0) {
            this.W = z2;
            this.X = yb5;
        } else {
            v0(6);
            throw null;
        }
    }

    public static oj3 n1(vj1 vj1, u04 u04, us1 us1, boolean z, uq4 uq4, sa6 sa6, boolean z2) {
        if (vj1 == null) {
            v0(7);
            throw null;
        } else if (uq4 != null) {
            return new oj3(vj1, u04, fl4.x, us1, z, uq4, sa6, (cr5) null, 1, z2, (yb5) null);
        } else {
            v0(11);
            throw null;
        }
    }

    public static /* synthetic */ void v0(int i) {
        String str;
        int i2;
        Throwable th;
        if (i != 21) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 21) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case h75.g:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
            case 12:
                objArr[2] = "create";
                break;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
            case 14:
            case h75.g:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 21) {
            th = new IllegalArgumentException(format);
        } else {
            th = new IllegalStateException(format);
        }
        throw th;
    }

    public final boolean B() {
        vw3 b = b();
        if (!this.W) {
            return false;
        }
        b.getClass();
        if (((!fv3.G(b) && !zt7.a(b)) || iq7.e(b)) && !fv3.H(b)) {
            return false;
        }
        tm tmVar = ep7.a;
        up2 up2 = nn3.q;
        up2.getClass();
        if (!rc9.X(b, up2) || fv3.H(b)) {
            return true;
        }
        return false;
    }

    public final boolean E() {
        return false;
    }

    public final er5 h1(vj1 vj1, fl4 fl4, us1 us1, cr5 cr5, int i, uq4 uq4) {
        if (vj1 == null) {
            v0(13);
            throw null;
        } else if (fl4 == null) {
            v0(14);
            throw null;
        } else if (us1 == null) {
            v0(15);
            throw null;
        } else if (i == 0) {
            v0(16);
            throw null;
        } else if (uq4 != null) {
            return new oj3(vj1, getAnnotations(), fl4, us1, this.B, uq4, sy6.j, cr5, i, this.W, this.X);
        } else {
            v0(17);
            throw null;
        }
    }

    public final ei3 t0(vw3 vw3, ArrayList arrayList, vw3 vw32, yb5 yb5) {
        cr5 cr5;
        vw3 vw33;
        fr5 fr5;
        jr5 jr5;
        jr5 jr52;
        fr5 fr52;
        vw3 vw34 = vw3;
        qz3 qz3 = null;
        if (e1() == this) {
            cr5 = null;
        } else {
            cr5 = e1();
        }
        oj3 oj3 = new oj3(r(), getAnnotations(), o(), f(), this.B, getName(), e(), cr5, u(), this.W, yb5);
        fr5 fr53 = this.S;
        if (fr53 != null) {
            rm annotations = fr53.getAnnotations();
            fl4 o = fr53.o();
            us1 f = fr53.f();
            boolean z = fr53.A;
            boolean z2 = fr53.B;
            boolean z3 = fr53.E;
            int u = u();
            if (cr5 == null) {
                fr52 = null;
            } else {
                fr52 = cr5.c();
            }
            fr5 fr54 = new fr5(oj3, annotations, o, f, z, z2, z3, u, fr52, fr53.e());
            fr54.H = fr53.H;
            vw33 = vw32;
            fr54.I = vw33;
            fr5 = fr54;
        } else {
            vw33 = vw32;
            fr5 = null;
        }
        jr5 jr53 = this.T;
        if (jr53 != null) {
            rm annotations2 = jr53.getAnnotations();
            fl4 o2 = jr53.o();
            us1 f2 = jr53.f();
            boolean z4 = jr53.A;
            boolean z5 = jr53.B;
            boolean z6 = jr53.E;
            int u2 = u();
            if (cr5 == null) {
                jr52 = null;
            } else {
                jr52 = cr5.d();
            }
            jr5 = new jr5(oj3, annotations2, o2, f2, z4, z5, z6, u2, jr52, jr53.e());
            jr5.H = jr5.H;
            h28 h28 = (h28) jr53.S().get(0);
            if (h28 != null) {
                jr5.I = h28;
            } else {
                jr5.v0(6);
                throw null;
            }
        } else {
            jr5 = null;
        }
        oj3.j1(fr5, jr5, this.U, this.V);
        sr2 sr2 = this.D;
        if (sr2 != null) {
            oj3.k1(this.C, sr2);
        }
        oj3.m0(s());
        if (vw34 != null) {
            qz3 = fd1.B(this, vw34, me6.x);
        }
        oj3.m1(vw33, getTypeParameters(), this.P, qz3, a42.w);
        return oj3;
    }

    public final Object z(jt1 jt1) {
        yb5 yb5 = this.X;
        if (yb5 == null || !((jt1) yb5.w).equals(jt1)) {
            return null;
        }
        return yb5.x;
    }

    public final void l1(vw3 vw3) {
    }
}
