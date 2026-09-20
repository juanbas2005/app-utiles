package defpackage;

import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: ys2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ys2 implements ws2 {
    public xs2 A;
    public int B;
    public List C;
    public final List D;
    public qz3 E;
    public qz3 F;
    public vw3 G;
    public uq4 H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public a42 N;
    public rm O;
    public boolean P;
    public final LinkedHashMap Q;
    public Boolean R;
    public boolean S;
    public final /* synthetic */ zs2 T;
    public bq7 w;
    public vj1 x;
    public fl4 y;
    public us1 z;

    public ys2(zs2 zs2, bq7 bq7, vj1 vj1, fl4 fl4, us1 us1, int i, List list, List list2, qz3 qz3, vw3 vw3) {
        if (bq7 == null) {
            b(0);
            throw null;
        } else if (vj1 == null) {
            b(1);
            throw null;
        } else if (fl4 == null) {
            b(2);
            throw null;
        } else if (us1 == null) {
            b(3);
            throw null;
        } else if (i == 0) {
            b(4);
            throw null;
        } else if (list == null) {
            b(5);
            throw null;
        } else if (list2 == null) {
            b(6);
            throw null;
        } else if (vw3 != null) {
            this.T = zs2;
            this.A = null;
            this.F = zs2.F;
            this.I = true;
            this.J = false;
            this.K = false;
            this.L = false;
            this.M = zs2.O;
            this.N = null;
            this.O = null;
            this.P = zs2.P;
            this.Q = new LinkedHashMap();
            this.R = null;
            this.S = false;
            this.w = bq7;
            this.x = vj1;
            this.y = fl4;
            this.z = us1;
            this.B = i;
            this.C = list;
            this.D = list2;
            this.E = qz3;
            this.G = vw3;
            this.H = null;
        } else {
            b(7);
            throw null;
        }
    }

    public static /* synthetic */ void b(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 9:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
            case h75.g:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
            case h75.g:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "newOwner";
                break;
            case 2:
                objArr[0] = "newModality";
                break;
            case 3:
                objArr[0] = "newVisibility";
                break;
            case 4:
            case 14:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "newValueParameterDescriptors";
                break;
            case 6:
                objArr[0] = "newContextReceiverParameters";
                break;
            case 7:
                objArr[0] = "newReturnType";
                break;
            case 8:
                objArr[0] = "owner";
                break;
            case 9:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
            case h75.g:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
            case 10:
                objArr[0] = "modality";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 17:
                objArr[0] = "name";
                break;
            case 19:
            case 21:
                objArr[0] = "parameters";
                break;
            case 23:
                objArr[0] = "type";
                break;
            case 25:
                objArr[0] = "contextReceiverParameters";
                break;
            case 35:
                objArr[0] = "additionalAnnotations";
                break;
            case 39:
                objArr[0] = "userDataKey";
                break;
            default:
                objArr[0] = "substitution";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "setOwner";
                break;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                objArr[1] = "setModality";
                break;
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
                objArr[1] = "setVisibility";
                break;
            case h75.g:
                objArr[1] = "setKind";
                break;
            case 16:
                objArr[1] = "setCopyOverrides";
                break;
            case 18:
                objArr[1] = "setName";
                break;
            case 20:
                objArr[1] = "setValueParameters";
                break;
            case 22:
                objArr[1] = "setTypeParameters";
                break;
            case 24:
                objArr[1] = "setReturnType";
                break;
            case 26:
                objArr[1] = "setContextReceiverParameters";
                break;
            case 27:
                objArr[1] = "setExtensionReceiverParameter";
                break;
            case 28:
                objArr[1] = "setDispatchReceiverParameter";
                break;
            case 29:
                objArr[1] = "setOriginal";
                break;
            case 30:
                objArr[1] = "setSignatureChange";
                break;
            case 31:
                objArr[1] = "setPreserveSourceElement";
                break;
            case 32:
                objArr[1] = "setDropOriginalInContainingParts";
                break;
            case 33:
                objArr[1] = "setHiddenToOvercomeSignatureClash";
                break;
            case 34:
                objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                break;
            case 36:
                objArr[1] = "setAdditionalAnnotations";
                break;
            case 38:
                objArr[1] = "setSubstitution";
                break;
            case 40:
                objArr[1] = "putUserData";
                break;
            case 41:
                objArr[1] = "getSubstitution";
                break;
            case 42:
                objArr[1] = "setJustForTypeSubstitution";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
        }
        switch (i) {
            case 8:
                objArr[2] = "setOwner";
                break;
            case 9:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
            case h75.g:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                break;
            case 10:
                objArr[2] = "setModality";
                break;
            case 12:
                objArr[2] = "setVisibility";
                break;
            case 14:
                objArr[2] = "setKind";
                break;
            case 17:
                objArr[2] = "setName";
                break;
            case 19:
                objArr[2] = "setValueParameters";
                break;
            case 21:
                objArr[2] = "setTypeParameters";
                break;
            case 23:
                objArr[2] = "setReturnType";
                break;
            case 25:
                objArr[2] = "setContextReceiverParameters";
                break;
            case 35:
                objArr[2] = "setAdditionalAnnotations";
                break;
            case 37:
                objArr[2] = "setSubstitution";
                break;
            case 39:
                objArr[2] = "putUserData";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 9:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
            case h75.g:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    public final ws2 A(fl4 fl4) {
        if (fl4 != null) {
            this.y = fl4;
            return this;
        }
        b(10);
        throw null;
    }

    public final ws2 B() {
        this.N = a42.w;
        return this;
    }

    public final ws2 C(vw3 vw3) {
        if (vw3 != null) {
            this.G = vw3;
            return this;
        }
        b(23);
        throw null;
    }

    public final ws2 G() {
        this.M = true;
        return this;
    }

    public final ws2 H(vj1 vj1) {
        if (vj1 != null) {
            this.x = vj1;
            return this;
        }
        b(8);
        throw null;
    }

    public final ws2 J(uq4 uq4) {
        if (uq4 != null) {
            this.H = uq4;
            return this;
        }
        b(17);
        throw null;
    }

    public final ws2 N() {
        this.J = true;
        return this;
    }

    public final ws2 a(List list) {
        this.C = list;
        return this;
    }

    public final xs2 build() {
        return this.T.i1(this);
    }

    public final ws2 h(int i) {
        if (i != 0) {
            this.B = i;
            return this;
        }
        b(14);
        throw null;
    }

    public final ws2 i(qz3 qz3) {
        this.F = qz3;
        return this;
    }

    public final ws2 j() {
        this.K = true;
        return this;
    }

    public final ws2 o() {
        this.Q.put(lj3.c0, Boolean.TRUE);
        return this;
    }

    public final ws2 p() {
        this.P = true;
        return this;
    }

    public final ws2 r(rm rmVar) {
        if (rmVar != null) {
            this.O = rmVar;
            return this;
        }
        b(35);
        throw null;
    }

    public final ws2 v(us1 us1) {
        if (us1 != null) {
            this.z = us1;
            return this;
        }
        b(12);
        throw null;
    }

    public final ws2 w() {
        this.I = false;
        return this;
    }
}
