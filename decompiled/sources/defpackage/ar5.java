package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: ar5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ar5 extends yj1 implements xs2 {
    public boolean A;
    public final boolean B;
    public final fl4 C;
    public final cr5 D;
    public final boolean E;
    public final int F;
    public us1 G;
    public xs2 H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ar5(fl4 fl4, us1 us1, cr5 cr5, rm rmVar, uq4 uq4, boolean z, boolean z2, boolean z3, int i, sy6 sy6) {
        super(cr5.r(), rmVar, uq4, sy6);
        if (fl4 == null) {
            v0(0);
            throw null;
        } else if (us1 == null) {
            v0(1);
            throw null;
        } else if (rmVar == null) {
            v0(3);
            throw null;
        } else if (sy6 != null) {
            this.H = null;
            this.C = fl4;
            this.G = us1;
            this.D = cr5;
            this.A = z;
            this.B = z2;
            this.E = z3;
            this.F = i;
        } else {
            v0(5);
            throw null;
        }
    }

    public static /* synthetic */ void v0(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
            case 12:
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
            case 14:
            case h75.g /*15*/:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
            case 12:
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
            case 14:
            case h75.g /*15*/:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
            case 12:
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
            case 14:
            case h75.g /*15*/:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case h75.g /*15*/:
                objArr[1] = "getOverriddenDescriptors";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
            case 12:
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
            case 14:
            case h75.g /*15*/:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
            case 12:
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
            case 14:
            case h75.g /*15*/:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    public final boolean E() {
        return false;
    }

    public final boolean H() {
        return false;
    }

    public final boolean M() {
        return false;
    }

    public final xs2 V() {
        return this.H;
    }

    public final qz3 W() {
        return f1().W();
    }

    public final qz3 b0() {
        return f1().b0();
    }

    public final ri0 e0(ql4 ql4, fl4 fl4, us1 us1) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    public final us1 f() {
        us1 us1 = this.G;
        if (us1 != null) {
            return us1;
        }
        v0(11);
        throw null;
    }

    public final cr5 f1() {
        cr5 cr5 = this.D;
        if (cr5 != null) {
            return cr5;
        }
        v0(13);
        throw null;
    }

    public final ArrayList g1(boolean z) {
        Object obj;
        ArrayList arrayList = new ArrayList(0);
        for (cr5 cr5 : f1().s()) {
            if (z) {
                obj = cr5.c();
            } else {
                obj = cr5.d();
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        v0(9);
        throw null;
    }

    public final xs2 h(dq7 dq7) {
        if (dq7 != null) {
            return this;
        }
        v0(7);
        throw null;
    }

    public final List h0() {
        List h0 = f1().h0();
        if (h0 != null) {
            return h0;
        }
        v0(14);
        throw null;
    }

    public final boolean i() {
        return false;
    }

    public final boolean j() {
        return this.E;
    }

    public final boolean l0() {
        return false;
    }

    public final boolean m() {
        return this.B;
    }

    public final void m0(Collection collection) {
        if (collection == null) {
            v0(16);
            throw null;
        }
    }

    public final fl4 o() {
        fl4 fl4 = this.C;
        if (fl4 != null) {
            return fl4;
        }
        v0(10);
        throw null;
    }

    public final boolean q() {
        return false;
    }

    public final boolean q0() {
        return false;
    }

    public final boolean s0() {
        return false;
    }

    public final int u() {
        int i = this.F;
        if (i != 0) {
            return i;
        }
        v0(6);
        throw null;
    }

    public final boolean w() {
        return false;
    }

    public final Object z(jt1 jt1) {
        return null;
    }
}
