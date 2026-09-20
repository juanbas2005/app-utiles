package defpackage;

/* renamed from: aq0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class aq0 extends j0 {
    public final vj1 A;
    public final sy6 B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aq0(kb4 kb4, vj1 vj1, uq4 uq4, sy6 sy6) {
        super(kb4, uq4);
        if (kb4 == null) {
            A0(0);
            throw null;
        } else if (vj1 == null) {
            A0(1);
            throw null;
        } else if (uq4 != null) {
            this.A = vj1;
            this.B = sy6;
        } else {
            A0(2);
            throw null;
        }
    }

    public static /* synthetic */ void A0(int i) {
        String str;
        int i2;
        Throwable th;
        if (i == 4 || i == 5) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i == 4 || i == 5) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        Object[] objArr = new Object[i2];
        if (i == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = "source";
        } else if (i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (!(i == 4 || i == 5)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i == 4 || i == 5) {
            th = new IllegalStateException(format);
        } else {
            th = new IllegalArgumentException(format);
        }
        throw th;
    }

    public final sy6 e() {
        sy6 sy6 = this.B;
        if (sy6 != null) {
            return sy6;
        }
        A0(5);
        throw null;
    }

    public boolean m() {
        return false;
    }

    public final vj1 r() {
        vj1 vj1 = this.A;
        if (vj1 != null) {
            return vj1;
        }
        A0(4);
        throw null;
    }
}
