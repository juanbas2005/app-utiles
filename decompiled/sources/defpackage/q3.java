package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: q3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class q3 extends n3 {
    public final pe2 y;
    public final /* synthetic */ r3 z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q3(r3 r3Var, kb4 kb4, pe2 pe2) {
        super(kb4);
        if (kb4 != null) {
            this.z = r3Var;
            this.y = pe2;
            return;
        }
        i(0);
        throw null;
    }

    public static /* synthetic */ void i(int i) {
        String str;
        int i2;
        Throwable th;
        if (i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                break;
            case 6:
                objArr[0] = "type";
                break;
            case 7:
                objArr[0] = "supertypes";
                break;
            case 9:
                objArr[0] = "classifier";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 1) {
            objArr[1] = "computeSupertypes";
        } else if (i == 2) {
            objArr[1] = "getParameters";
        } else if (i == 3) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i == 4) {
            objArr[1] = "getBuiltIns";
        } else if (i == 5) {
            objArr[1] = "getSupertypeLoopChecker";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
        } else {
            objArr[1] = "processSupertypesWithoutCycles";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                break;
            case 6:
                objArr[2] = "reportSupertypeLoopError";
                break;
            case 7:
                objArr[2] = "processSupertypesWithoutCycles";
                break;
            case 9:
                objArr[2] = "isSameClassifier";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) {
            th = new IllegalStateException(format);
        } else {
            th = new IllegalArgumentException(format);
        }
        throw th;
    }

    public final Collection a() {
        List g1 = this.z.g1();
        if (g1 != null) {
            return g1;
        }
        i(1);
        throw null;
    }

    public final vw3 b() {
        return z62.c(x62.C, new String[0]);
    }

    public final pe2 c() {
        pe2 pe2 = this.y;
        if (pe2 != null) {
            return pe2;
        }
        i(5);
        throw null;
    }

    public final boolean f(vq0 vq0) {
        if (!(vq0 instanceof qp7)) {
            return false;
        }
        c0 c0Var = c0.z;
        if (pe2.C.p(this.z, (qp7) vq0, true, c0Var)) {
            return true;
        }
        return false;
    }

    public final fv3 g() {
        fv3 e = ts1.e(this.z);
        if (e != null) {
            return e;
        }
        i(4);
        throw null;
    }

    public final List getParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        i(2);
        throw null;
    }

    public final List h(List list) {
        List f1 = this.z.f1(list);
        if (f1 != null) {
            return f1;
        }
        i(8);
        throw null;
    }

    public final String toString() {
        return this.z.getName().w;
    }

    public final vq0 u() {
        return this.z;
    }

    public final boolean y() {
        return true;
    }
}
