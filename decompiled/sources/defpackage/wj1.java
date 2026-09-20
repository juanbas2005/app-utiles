package defpackage;

/* renamed from: wj1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class wj1 extends in8 implements vj1 {
    public final uq4 x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wj1(rm rmVar, uq4 uq4) {
        super(rmVar);
        if (rmVar == null) {
            v0(0);
            throw null;
        } else if (uq4 != null) {
            this.x = uq4;
        } else {
            v0(1);
            throw null;
        }
    }

    public static String d1(vj1 vj1) {
        try {
            return ms1.e.o(vj1) + "[" + vj1.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(vj1)) + "]";
        } catch (Throwable unused) {
            return vj1.getClass().getSimpleName() + " " + vj1.getName();
        }
    }

    public static /* synthetic */ void v0(int i) {
        String str;
        int i2;
        Throwable th;
        if (i == 2 || i == 3 || i == 5 || i == 6) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i == 2 || i == 3 || i == 5 || i == 6) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 5 || i == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (!(i == 2 || i == 3)) {
            if (i == 4) {
                objArr[2] = "toString";
            } else if (!(i == 5 || i == 6)) {
                objArr[2] = "<init>";
            }
        }
        String format = String.format(str, objArr);
        if (i == 2 || i == 3 || i == 5 || i == 6) {
            th = new IllegalStateException(format);
        } else {
            th = new IllegalArgumentException(format);
        }
        throw th;
    }

    public final uq4 getName() {
        uq4 uq4 = this.x;
        if (uq4 != null) {
            return uq4;
        }
        v0(2);
        throw null;
    }

    public String toString() {
        return d1(this);
    }

    public vj1 a() {
        return this;
    }
}
