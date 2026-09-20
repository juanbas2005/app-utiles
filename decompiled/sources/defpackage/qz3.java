package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: qz3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qz3 extends wj1 implements pc5 {
    public final xx5 A;
    public final /* synthetic */ int y = 0;
    public final vj1 z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qz3(vj1 vj1, in8 in8, rm rmVar, uq4 uq4) {
        super(rmVar, uq4);
        if (vj1 == null) {
            w0(3);
            throw null;
        } else if (rmVar == null) {
            w0(5);
            throw null;
        } else if (uq4 != null) {
            this.z = vj1;
            this.A = in8;
        } else {
            w0(6);
            throw null;
        }
    }

    public static /* synthetic */ void e1(int i) {
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
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
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
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case 10:
                objArr[1] = "getOriginal";
                break;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
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
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    public static /* synthetic */ void v0(int i) {
        String str;
        int i2;
        Throwable th;
        if (i == 1 || i == 2) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i == 1 || i == 2) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        Object[] objArr = new Object[i2];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i == 1) {
            objArr[1] = "getValue";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (!(i == 1 || i == 2)) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String format = String.format(str, objArr);
        if (i == 1 || i == 2) {
            th = new IllegalStateException(format);
        } else {
            th = new IllegalArgumentException(format);
        }
        throw th;
    }

    public static /* synthetic */ void w0(int i) {
        String str;
        int i2;
        Throwable th;
        if (i == 7 || i == 8) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i == 7 || i == 8) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 4:
                objArr[0] = "value";
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 6:
                objArr[0] = "name";
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 7) {
            objArr[1] = "getValue";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 7 || i == 8) {
            th = new IllegalStateException(format);
        } else {
            th = new IllegalArgumentException(format);
        }
        throw th;
    }

    public final boolean E() {
        return false;
    }

    public final Object P(zj1 zj1, Object obj) {
        return zj1.g(this, obj);
    }

    public final List S() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        e1(7);
        throw null;
    }

    public final vw3 b() {
        vw3 b = f1().b();
        if (b != null) {
            return b;
        }
        e1(6);
        throw null;
    }

    public final qz3 b0() {
        return null;
    }

    public final sy6 e() {
        return sy6.j;
    }

    public final us1 f() {
        us1 us1 = vs1.f;
        if (us1 != null) {
            return us1;
        }
        e1(9);
        throw null;
    }

    public final xx5 f1() {
        int i = this.y;
        xx5 xx5 = this.A;
        switch (i) {
            case b85.b:
                w93 w93 = (w93) xx5;
                if (w93 != null) {
                    return w93;
                }
                v0(1);
                throw null;
            default:
                in8 in8 = (in8) xx5;
                if (in8 != null) {
                    return in8;
                }
                w0(7);
                throw null;
        }
    }

    /* renamed from: g1 */
    public final qz3 h(dq7 dq7) {
        vw3 vw3;
        if (dq7 != null) {
            if (!dq7.a.e()) {
                if (r() instanceof ql4) {
                    vw3 = dq7.h(b(), k28.A);
                } else {
                    vw3 = dq7.h(b(), k28.y);
                }
                if (vw3 == null) {
                    return null;
                }
                if (vw3 != b()) {
                    return new qz3(r(), new in8(vw3), getAnnotations());
                }
            }
            return this;
        }
        e1(3);
        throw null;
    }

    public final List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        e1(5);
        throw null;
    }

    public final vw3 k() {
        return b();
    }

    public final vj1 r() {
        int i = this.y;
        vj1 vj1 = this.z;
        switch (i) {
            case b85.b:
                ql4 ql4 = (ql4) vj1;
                if (ql4 != null) {
                    return ql4;
                }
                v0(2);
                throw null;
            default:
                if (vj1 != null) {
                    return vj1;
                }
                w0(8);
                throw null;
        }
    }

    public final Collection s() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        e1(8);
        throw null;
    }

    public String toString() {
        switch (this.y) {
            case b85.b:
                return "class " + ((ql4) this.z).getName() + "::this";
            default:
                return super.toString();
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public final vj1 m73a() {
        return this;
    }

    public final pi0 a() {
        return this;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public qz3(vj1 vj1, in8 in8, rm rmVar) {
        this(vj1, in8, rmVar, oz6.d);
        if (vj1 == null) {
            w0(0);
            throw null;
        } else if (rmVar != null) {
        } else {
            w0(2);
            throw null;
        }
    }

    public qz3(ql4 ql4) {
        super(me6.x, oz6.d);
        this.z = ql4;
        this.A = new w93(ql4);
    }
}
