package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: z52  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class z52 extends aq0 {
    public final oq0 C;
    public final y52 D;
    public final t05 E;
    public final rm F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z52(kb4 kb4, ql4 ql4, fu6 fu6, uq4 uq4, t05 t05, rm rmVar, sy6 sy6) {
        super(kb4, ql4, uq4, sy6);
        if (kb4 == null) {
            A0(6);
            throw null;
        } else if (ql4 == null) {
            A0(7);
            throw null;
        } else if (fu6 == null) {
            A0(8);
            throw null;
        } else if (uq4 == null) {
            A0(9);
            throw null;
        } else if (t05 != null) {
            this.F = rmVar;
            this.C = new oq0(this, Collections.EMPTY_LIST, Collections.singleton(fu6), kb4);
            this.D = new y52(this, kb4);
            this.E = t05;
        } else {
            A0(10);
            throw null;
        }
    }

    public static /* synthetic */ void A0(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 14:
            case h75.g:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 14:
            case h75.g:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case h75.g:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case h75.g:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
            case 12:
                objArr[2] = "<init>";
                break;
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case h75.g:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 14:
            case h75.g:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    public static z52 C0(kb4 kb4, ql4 ql4, uq4 uq4, ib4 ib4, rm rmVar, sy6 sy6) {
        if (kb4 == null) {
            A0(0);
            throw null;
        } else if (ql4 == null) {
            A0(1);
            throw null;
        } else if (uq4 == null) {
            A0(2);
            throw null;
        } else if (ib4 != null) {
            return new z52(kb4, ql4, ql4.g0(), uq4, ib4, rmVar, sy6);
        } else {
            A0(3);
            throw null;
        }
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
        A0(20);
        throw null;
    }

    public final rm getAnnotations() {
        rm rmVar = this.F;
        if (rmVar != null) {
            return rmVar;
        }
        A0(21);
        throw null;
    }

    public final boolean j() {
        return false;
    }

    public final Collection l() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        A0(16);
        throw null;
    }

    public final wo7 n() {
        oq0 oq0 = this.C;
        if (oq0 != null) {
            return oq0;
        }
        A0(17);
        throw null;
    }

    public final fl4 o() {
        return fl4.x;
    }

    public final ji4 o0(ax3 ax3) {
        y52 y52 = this.D;
        if (y52 != null) {
            return y52;
        }
        A0(14);
        throw null;
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
        return "enum entry " + getName();
    }

    public final List u0() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        A0(22);
        throw null;
    }

    public final iq0 v() {
        return iq0.z;
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
