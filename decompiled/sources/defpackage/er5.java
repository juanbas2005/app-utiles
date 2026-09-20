package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: er5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class er5 extends j28 implements cr5 {
    public final boolean B;
    public hb4 C;
    public sr2 D;
    public final fl4 E;
    public us1 F;
    public Collection G;
    public final cr5 H;
    public final int I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public List O;
    public qz3 P;
    public qz3 Q;
    public ArrayList R;
    public fr5 S;
    public jr5 T;
    public lc2 U;
    public lc2 V;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public er5(vj1 vj1, cr5 cr5, rm rmVar, fl4 fl4, us1 us1, boolean z, uq4 uq4, int i, sy6 sy6, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        super(vj1, rmVar, uq4, (vw3) null, sy6);
        int i2 = i;
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
        } else if (i2 == 0) {
            v0(5);
            throw null;
        } else if (sy6 != null) {
            this.B = z;
            this.G = null;
            this.O = Collections.EMPTY_LIST;
            this.E = fl4;
            this.F = us1;
            this.H = cr5 == null ? this : cr5;
            this.I = i2;
            this.J = z2;
            this.K = z3;
            this.L = z4;
            this.M = z5;
            this.N = z6;
        } else {
            v0(6);
            throw null;
        }
    }

    public static er5 g1(vj1 vj1, fl4 fl4, us1 us1, boolean z, uq4 uq4, int i, sy6 sy6) {
        qm qmVar = me6.x;
        if (vj1 == null) {
            v0(7);
            throw null;
        } else if (us1 == null) {
            v0(10);
            throw null;
        } else if (uq4 == null) {
            v0(11);
            throw null;
        } else if (i == 0) {
            v0(12);
            throw null;
        } else if (sy6 != null) {
            return new er5(vj1, (cr5) null, qmVar, fl4, us1, z, uq4, i, sy6, false, false, false, false, false);
        } else {
            v0(13);
            throw null;
        }
    }

    public static xs2 i1(dq7 dq7, ar5 ar5) {
        if (ar5 != null) {
            xs2 xs2 = ar5.H;
            if (xs2 != null) {
                return xs2.h(dq7);
            }
            return null;
        }
        v0(31);
        throw null;
    }

    public static /* synthetic */ void v0(int i) {
        String str;
        int i2;
        Throwable th;
        if (!(i == 28 || i == 38 || i == 39 || i == 41 || i == 42)) {
            switch (i) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i == 28 || i == 38 || i == 39 || i == 41 || i == 42)) {
            switch (i) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    i2 = 3;
                    break;
            }
        }
        i2 = 2;
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
            case 20:
                objArr[0] = "visibility";
                break;
            case 4:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 35:
                objArr[0] = "kind";
                break;
            case 6:
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
            case 37:
                objArr[0] = "source";
                break;
            case 14:
                objArr[0] = "inType";
                break;
            case h75.g /*15*/:
            case 17:
                objArr[0] = "outType";
                break;
            case 16:
            case 18:
                objArr[0] = "typeParameters";
                break;
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case 38:
            case 39:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                break;
            case 27:
                objArr[0] = "originalSubstitutor";
                break;
            case 29:
                objArr[0] = "copyConfiguration";
                break;
            case 30:
                objArr[0] = "substitutor";
                break;
            case 31:
                objArr[0] = "accessorDescriptor";
                break;
            case 32:
                objArr[0] = "newOwner";
                break;
            case 33:
                objArr[0] = "newModality";
                break;
            case 34:
                objArr[0] = "newVisibility";
                break;
            case 36:
                objArr[0] = "newName";
                break;
            case 40:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 28) {
            objArr[1] = "getSourceToUseForCopy";
        } else if (i == 38) {
            objArr[1] = "getOriginal";
        } else if (i == 39) {
            objArr[1] = "getKind";
        } else if (i == 41) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i != 42) {
            switch (i) {
                case 21:
                    objArr[1] = "getTypeParameters";
                    break;
                case 22:
                    objArr[1] = "getContextReceiverParameters";
                    break;
                case 23:
                    objArr[1] = "getReturnType";
                    break;
                case 24:
                    objArr[1] = "getModality";
                    break;
                case 25:
                    objArr[1] = "getVisibility";
                    break;
                case 26:
                    objArr[1] = "getAccessors";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
            case 12:
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                objArr[2] = "create";
                break;
            case 14:
                objArr[2] = "setInType";
                break;
            case h75.g /*15*/:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "setType";
                break;
            case 20:
                objArr[2] = "setVisibility";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case 38:
            case 39:
            case 41:
            case 42:
                break;
            case 27:
                objArr[2] = "substitute";
                break;
            case 29:
                objArr[2] = "doSubstitute";
                break;
            case 30:
            case 31:
                objArr[2] = "getSubstitutedInitialSignatureDescriptor";
                break;
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 40:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i == 28 || i == 38 || i == 39 || i == 41 || i == 42)) {
            switch (i) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    th = new IllegalArgumentException(format);
                    break;
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    public boolean B() {
        return this.K;
    }

    public final boolean H() {
        return this.L;
    }

    public final boolean K() {
        return this.N;
    }

    public final e21 O() {
        hb4 hb4 = this.C;
        if (hb4 != null) {
            return (e21) hb4.b();
        }
        return null;
    }

    public final Object P(zj1 zj1, Object obj) {
        return zj1.E(this, obj);
    }

    public final qz3 W() {
        return this.P;
    }

    /* renamed from: a */
    public final cr5 e1() {
        cr5 cr5 = this.H;
        this = this;
        if (cr5 != this) {
            this = cr5.a();
        }
        if (this != null) {
            return this;
        }
        v0(38);
        throw null;
    }

    public final boolean a0() {
        return this.B;
    }

    public final qz3 b0() {
        return this.Q;
    }

    public final fr5 c() {
        return this.S;
    }

    public final lc2 c0() {
        return this.V;
    }

    public final jr5 d() {
        return this.T;
    }

    public final us1 f() {
        us1 us1 = this.F;
        if (us1 != null) {
            return us1;
        }
        v0(25);
        throw null;
    }

    public final lc2 f0() {
        return this.U;
    }

    /* renamed from: f1 */
    public final er5 e0(vj1 vj1, fl4 fl4, us1 us1) {
        dr5 dr5 = new dr5(this);
        if (vj1 != null) {
            dr5.a = vj1;
            dr5.d = null;
            dr5.b = fl4;
            if (us1 != null) {
                dr5.c = us1;
                dr5.e = 2;
                dr5.g = false;
                er5 b = dr5.b();
                if (b != null) {
                    return b;
                }
                v0(42);
                throw null;
            }
            dr5.a(8);
            throw null;
        }
        dr5.a(0);
        throw null;
    }

    public final List getTypeParameters() {
        ArrayList arrayList = this.R;
        if (arrayList != null) {
            return arrayList;
        }
        ku4.t("typeParameters == null for ", this);
        return null;
    }

    public final cr5 h(dq7 dq7) {
        if (dq7 != null) {
            bq7 bq7 = dq7.a;
            if (bq7.e()) {
                return this;
            }
            dr5 dr5 = new dr5(this);
            dr5.f = bq7;
            dr5.d = e1();
            return dr5.b();
        }
        v0(27);
        throw null;
    }

    public final List h0() {
        List list = this.O;
        if (list != null) {
            return list;
        }
        v0(22);
        throw null;
    }

    public er5 h1(vj1 vj1, fl4 fl4, us1 us1, cr5 cr5, int i, uq4 uq4) {
        if (vj1 == null) {
            v0(32);
            throw null;
        } else if (fl4 == null) {
            v0(33);
            throw null;
        } else if (us1 == null) {
            v0(34);
            throw null;
        } else if (i == 0) {
            v0(35);
            throw null;
        } else if (uq4 != null) {
            return new er5(vj1, cr5, getAnnotations(), fl4, us1, this.B, uq4, i, sy6.j, this.J, B(), this.L, m(), this.N);
        } else {
            v0(36);
            throw null;
        }
    }

    public final boolean i0() {
        return this.J;
    }

    public final void j1(fr5 fr5, jr5 jr5, lc2 lc2, lc2 lc22) {
        this.S = fr5;
        this.T = jr5;
        this.U = lc2;
        this.V = lc22;
    }

    public final vw3 k() {
        vw3 b = b();
        if (b != null) {
            return b;
        }
        v0(23);
        throw null;
    }

    public final void k1(hb4 hb4, sr2 sr2) {
        if (sr2 != null) {
            this.D = sr2;
            if (hb4 == null) {
                hb4 = (hb4) sr2.b();
            }
            this.C = hb4;
            return;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"compileTimeInitializerFactory", "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl", "setCompileTimeInitializer"}));
    }

    public boolean m() {
        return this.M;
    }

    public final void m0(Collection collection) {
        if (collection != null) {
            this.G = collection;
        } else {
            v0(40);
            throw null;
        }
    }

    public final void m1(vw3 vw3, List list, qz3 qz3, qz3 qz32, List list2) {
        if (vw3 == null) {
            v0(17);
            throw null;
        } else if (list == null) {
            v0(18);
            throw null;
        } else if (list2 != null) {
            this.A = vw3;
            this.R = new ArrayList(list);
            this.Q = qz32;
            this.P = qz3;
            this.O = list2;
        } else {
            v0(19);
            throw null;
        }
    }

    public final fl4 o() {
        fl4 fl4 = this.E;
        if (fl4 != null) {
            return fl4;
        }
        v0(24);
        throw null;
    }

    public final Collection s() {
        Collection collection = this.G;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        v0(41);
        throw null;
    }

    public final boolean s0() {
        return false;
    }

    public final int u() {
        int i = this.I;
        if (i != 0) {
            return i;
        }
        v0(39);
        throw null;
    }

    public final ArrayList y() {
        ArrayList arrayList = new ArrayList(2);
        fr5 fr5 = this.S;
        if (fr5 != null) {
            arrayList.add(fr5);
        }
        jr5 jr5 = this.T;
        if (jr5 != null) {
            arrayList.add(jr5);
        }
        return arrayList;
    }

    public Object z(jt1 jt1) {
        return null;
    }

    public void l1(vw3 vw3) {
    }
}
