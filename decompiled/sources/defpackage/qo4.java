package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: qo4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qo4 extends aq0 {
    public final iq0 C;
    public fl4 D;
    public us1 E;
    public oq0 F;
    public ArrayList G;
    public final ArrayList H;
    public final kb4 I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qo4(c42 c42, uq4 uq4, kb4 kb4) {
        super(kb4, c42, uq4, sy6.j);
        if (kb4 != null) {
            this.H = new ArrayList();
            this.I = kb4;
            this.C = iq0.x;
            return;
        }
        A0(4);
        throw null;
    }

    public static /* synthetic */ void A0(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
            case h75.g:
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
            case 5:
            case 7:
            case 8:
            case 10:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
            case h75.g:
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
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
            case h75.g:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                objArr[1] = "getTypeConstructor";
                break;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                objArr[1] = "getConstructors";
                break;
            case h75.g:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
            case h75.g:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
            case h75.g:
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

    public final boolean H() {
        return false;
    }

    public final ji4 L() {
        return ii4.b;
    }

    public final us1 f() {
        us1 us1 = this.E;
        if (us1 != null) {
            return us1;
        }
        A0(10);
        throw null;
    }

    public final rm getAnnotations() {
        return me6.x;
    }

    public final boolean j() {
        return false;
    }

    public final Collection l() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        A0(13);
        throw null;
    }

    public final wo7 n() {
        oq0 oq0 = this.F;
        if (oq0 != null) {
            return oq0;
        }
        A0(11);
        throw null;
    }

    public final fl4 o() {
        fl4 fl4 = this.D;
        if (fl4 != null) {
            return fl4;
        }
        A0(7);
        throw null;
    }

    public final ji4 o0(ax3 ax3) {
        return ii4.b;
    }

    public final boolean p() {
        return false;
    }

    public final wp0 p0() {
        return null;
    }

    public final boolean s0() {
        return false;
    }

    public final String toString() {
        return wj1.d1(this);
    }

    public final List u0() {
        ArrayList arrayList = this.G;
        if (arrayList != null) {
            return arrayList;
        }
        A0(15);
        throw null;
    }

    public final iq0 v() {
        iq0 iq0 = this.C;
        if (iq0 != null) {
            return iq0;
        }
        A0(8);
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
