package defpackage;

import java.util.ArrayList;

/* renamed from: fi3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fi3 extends wp0 implements ei3 {
    public Boolean a0;
    public Boolean b0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fi3(ql4 ql4, fi3 fi3, rm rmVar, boolean z, int i, sy6 sy6) {
        super(ql4, fi3, rmVar, z, i, sy6);
        if (ql4 == null) {
            v0(0);
            throw null;
        } else if (rmVar == null) {
            v0(1);
            throw null;
        } else if (i == 0) {
            v0(2);
            throw null;
        } else if (sy6 != null) {
            this.a0 = null;
            this.b0 = null;
        } else {
            v0(3);
            throw null;
        }
    }

    public static /* synthetic */ void v0(int i) {
        String str;
        int i2;
        Throwable th;
        if (i == 11 || i == 18) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i == 11 || i == 18) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 5:
            case 9:
            case h75.g /*15*/:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
            case 18:
                break;
            case 12:
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
            case 14:
            case h75.g /*15*/:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 11 || i == 18) {
            th = new IllegalStateException(format);
        } else {
            th = new IllegalArgumentException(format);
        }
        throw th;
    }

    public static fi3 x1(ql4 ql4, rm rmVar, boolean z, sa6 sa6) {
        if (ql4 != null) {
            return new fi3(ql4, (fi3) null, rmVar, z, 1, sa6);
        }
        v0(4);
        throw null;
    }

    public final boolean E() {
        return this.b0.booleanValue();
    }

    public final /* bridge */ /* synthetic */ zs2 h1(int i, rm rmVar, vj1 vj1, xs2 xs2, uq4 uq4, sy6 sy6) {
        vj1 vj12 = vj1;
        int i2 = i;
        return y1(vj12, xs2, i2, rmVar, sy6);
    }

    public final void n1(boolean z) {
        this.a0 = Boolean.valueOf(z);
    }

    public final void o1(boolean z) {
        this.b0 = Boolean.valueOf(z);
    }

    public final /* bridge */ /* synthetic */ wp0 q1(int i, rm rmVar, vj1 vj1, xs2 xs2, uq4 uq4, sy6 sy6) {
        vj1 vj12 = vj1;
        int i2 = i;
        return y1(vj12, xs2, i2, rmVar, sy6);
    }

    public final ei3 t0(vw3 vw3, ArrayList arrayList, vw3 vw32, yb5 yb5) {
        qz3 B;
        vw3 vw33 = vw3;
        yb5 yb52 = yb5;
        fi3 y1 = y1(r(), (xs2) null, u(), getAnnotations(), e());
        if (vw33 == null) {
            B = null;
        } else {
            B = fd1.B(y1, vw33, me6.x);
        }
        qz3 qz3 = B;
        y1.k1(qz3, this.F, a42.w, getTypeParameters(), wn6.f(arrayList, S(), y1), vw32, o(), f());
        if (yb52 != null) {
            y1.m1((jt1) yb52.w, yb52.x);
        }
        return y1;
    }

    public final fi3 y1(vj1 vj1, xs2 xs2, int i, rm rmVar, sy6 sy6) {
        if (vj1 == null) {
            v0(7);
            throw null;
        } else if (i == 0) {
            v0(8);
            throw null;
        } else if (rmVar == null) {
            v0(9);
            throw null;
        } else if (sy6 == null) {
            v0(10);
            throw null;
        } else if (i == 1 || i == 4) {
            ql4 ql4 = (ql4) vj1;
            fi3 fi3 = (fi3) xs2;
            if (i != 0) {
                fi3 fi32 = new fi3(ql4, fi3, rmVar, this.Z, i, sy6);
                Boolean bool = this.a0;
                bool.getClass();
                fi32.a0 = bool;
                Boolean bool2 = this.b0;
                bool2.getClass();
                fi32.b0 = bool2;
                return fi32;
            }
            v0(13);
            throw null;
        } else {
            StringBuilder sb = new StringBuilder("Attempt at creating a constructor that is not a declaration: \ncopy from: ");
            sb.append(this);
            sb.append("\nnewOwner: ");
            sb.append(vj1);
            String E = b81.E(i);
            sb.append("\nkind: ");
            sb.append(E);
            throw new IllegalStateException(sb.toString());
        }
    }
}
