package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: cq0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class cq0 extends aq0 {
    public final fl4 C;
    public final iq0 D;
    public final oq0 E;
    public ji4 F;
    public Set G;
    public wp0 H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cq0(vj1 vj1, uq4 uq4, fl4 fl4, iq0 iq0, List list, kb4 kb4) {
        super(kb4, vj1, uq4, sy6.j);
        if (vj1 == null) {
            A0(0);
            throw null;
        } else if (uq4 == null) {
            A0(1);
            throw null;
        } else if (kb4 != null) {
            this.C = fl4;
            this.D = iq0;
            this.E = new oq0(this, Collections.EMPTY_LIST, list, kb4);
        } else {
            A0(6);
            throw null;
        }
    }

    public static /* synthetic */ void A0(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 9:
            case 10:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
            case 14:
            case h75.g /*15*/:
            case 16:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 10:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
            case 14:
            case h75.g /*15*/:
            case 16:
            case 17:
            case 18:
            case 19:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
            case 14:
            case h75.g /*15*/:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                objArr[1] = "getConstructors";
                break;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case h75.g /*15*/:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
        }
        switch (i) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
            case 14:
            case h75.g /*15*/:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 9:
            case 10:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
            case 14:
            case h75.g /*15*/:
            case 16:
            case 17:
            case 18:
            case 19:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    public final void C0(ji4 ji4, Set set, wp0 wp0) {
        this.F = ji4;
        this.G = set;
        this.H = wp0;
    }

    public final boolean H() {
        return false;
    }

    public final ji4 L() {
        return ii4.b;
    }

    public final us1 f() {
        us1 us1 = vs1.e;
        if (us1 != null) {
            return us1;
        }
        A0(17);
        throw null;
    }

    public final rm getAnnotations() {
        return me6.x;
    }

    public final boolean j() {
        return false;
    }

    public final Collection l() {
        Set set = this.G;
        if (set != null) {
            return set;
        }
        A0(11);
        throw null;
    }

    public final wo7 n() {
        oq0 oq0 = this.E;
        if (oq0 != null) {
            return oq0;
        }
        A0(10);
        throw null;
    }

    public final fl4 o() {
        fl4 fl4 = this.C;
        if (fl4 != null) {
            return fl4;
        }
        A0(16);
        throw null;
    }

    public final ji4 o0(ax3 ax3) {
        ji4 ji4 = this.F;
        if (ji4 != null) {
            return ji4;
        }
        A0(13);
        throw null;
    }

    public final boolean p() {
        return false;
    }

    public final wp0 p0() {
        return this.H;
    }

    public final boolean s0() {
        return false;
    }

    public String toString() {
        return "class " + getName();
    }

    public final List u0() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        A0(18);
        throw null;
    }

    public final iq0 v() {
        iq0 iq0 = this.D;
        if (iq0 != null) {
            return iq0;
        }
        A0(15);
        throw null;
    }

    public final y18 v0() {
        return null;
    }

    public final boolean w0() {
        return false;
    }

    public final boolean x0() {
        return false;
    }

    public final boolean y0() {
        return false;
    }

    public final boolean z0() {
        return false;
    }
}
