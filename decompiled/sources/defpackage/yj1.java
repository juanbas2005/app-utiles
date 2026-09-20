package defpackage;

/* renamed from: yj1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class yj1 extends wj1 implements xj1 {
    public final vj1 y;
    public final sy6 z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yj1(vj1 vj1, rm rmVar, uq4 uq4, sy6 sy6) {
        super(rmVar, uq4);
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
            this.y = vj1;
            this.z = sy6;
        } else {
            v0(3);
            throw null;
        }
    }

    public static /* synthetic */ void v0(int i) {
        String str;
        int i2;
        Throwable th;
        if (i == 4 || i == 5 || i == 6) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i == 4 || i == 5 || i == 6) {
            i2 = 2;
        } else {
            i2 = 3;
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
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 4) {
            objArr[1] = "getOriginal";
        } else if (i == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (!(i == 4 || i == 5 || i == 6)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i == 4 || i == 5 || i == 6) {
            th = new IllegalStateException(format);
        } else {
            th = new IllegalArgumentException(format);
        }
        throw th;
    }

    public sy6 e() {
        sy6 sy6 = this.z;
        if (sy6 != null) {
            return sy6;
        }
        v0(6);
        throw null;
    }

    public vj1 r() {
        vj1 vj1 = this.y;
        if (vj1 != null) {
            return vj1;
        }
        v0(5);
        throw null;
    }

    /* renamed from: e1 */
    public xj1 a() {
        return this;
    }
}
