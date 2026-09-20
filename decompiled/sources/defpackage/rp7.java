package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: rp7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rp7 extends r3 {
    public final ArrayList G;
    public boolean H;

    /* JADX WARNING: Illegal instructions before constructor call */
    public rp7(vj1 vj1, rm rmVar, boolean z, k28 k28, uq4 uq4, int i, kb4 kb4) {
        super(r1, vj1, rmVar, r4, k28, z, i, r8);
        pe2 pe2 = pe2.O;
        if (vj1 == null) {
            v0(19);
            throw null;
        } else if (rmVar == null) {
            v0(20);
            throw null;
        } else if (k28 == null) {
            v0(21);
            throw null;
        } else if (uq4 == null) {
            v0(22);
            throw null;
        } else if (kb4 != null) {
            uq4 uq42 = uq4;
            kb4 kb42 = kb4;
            this.G = new ArrayList(1);
            this.H = false;
        } else {
            v0(25);
            throw null;
        }
    }

    public static rp7 h1(vj1 vj1, rm rmVar, boolean z, k28 k28, uq4 uq4, int i, kb4 kb4) {
        if (vj1 == null) {
            v0(6);
            throw null;
        } else if (rmVar == null) {
            v0(7);
            throw null;
        } else if (k28 == null) {
            v0(8);
            throw null;
        } else if (uq4 == null) {
            v0(9);
            throw null;
        } else if (kb4 != null) {
            return new rp7(vj1, rmVar, z, k28, uq4, i, kb4);
        } else {
            v0(11);
            throw null;
        }
    }

    public static rp7 i1(j0 j0Var, k28 k28, uq4 uq4, int i, kb4 kb4) {
        qm qmVar = me6.x;
        if (kb4 != null) {
            j0 j0Var2 = j0Var;
            rp7 h1 = h1(j0Var2, qmVar, false, k28, uq4, i, kb4);
            fu6 n = ts1.e(j0Var2).n();
            if (!h1.H) {
                if (!gr8.N(n)) {
                    h1.G.add(n);
                }
                if (!h1.H) {
                    h1.H = true;
                    return h1;
                }
                h.s("Type parameter descriptor is already initialized: ".concat(h1.j1()));
                return null;
            }
            h.s("Type parameter descriptor is already initialized: ".concat(h1.j1()));
            return null;
        }
        v0(4);
        throw null;
    }

    public static /* synthetic */ void v0(int i) {
        String str;
        int i2;
        Throwable th;
        if (i == 5 || i == 28) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i == 5 || i == 28) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 7:
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case h75.g:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
            case 12:
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
            case 14:
            case h75.g:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 5 || i == 28) {
            th = new IllegalStateException(format);
        } else {
            th = new IllegalArgumentException(format);
        }
        throw th;
    }

    public final List g1() {
        if (this.H) {
            ArrayList arrayList = this.G;
            if (arrayList != null) {
                return arrayList;
            }
            v0(28);
            throw null;
        }
        h.s("Type parameter descriptor is not initialized: ".concat(j1()));
        return null;
    }

    public final String j1() {
        return getName() + " declared in " + rs1.f(r());
    }
}
