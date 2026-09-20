package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: j28  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class j28 extends yj1 implements i28 {
    public vw3 A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j28(vj1 vj1, rm rmVar, uq4 uq4, vw3 vw3, sy6 sy6) {
        super(vj1, rmVar, uq4, sy6);
        if (vj1 == null) {
            v0(0);
            throw null;
        } else if (rmVar == null) {
            v0(1);
            throw null;
        } else if (uq4 == null) {
            v0(2);
            throw null;
        } else if (sy6 != null) {
            this.A = vw3;
        } else {
            v0(3);
            throw null;
        }
    }

    public static /* synthetic */ void v0(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    public boolean E() {
        return false;
    }

    public final List S() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        v0(6);
        throw null;
    }

    public final vw3 b() {
        vw3 vw3 = this.A;
        if (vw3 != null) {
            return vw3;
        }
        v0(4);
        throw null;
    }

    public qz3 b0() {
        return null;
    }

    public List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        v0(8);
        throw null;
    }

    public List h0() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        v0(9);
        throw null;
    }

    public vw3 k() {
        vw3 b = b();
        if (b != null) {
            return b;
        }
        v0(10);
        throw null;
    }
}
