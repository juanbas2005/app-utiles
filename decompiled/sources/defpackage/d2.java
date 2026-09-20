package defpackage;

/* renamed from: d2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class d2 extends r3 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d2(kb4 kb4, vj1 vj1, rm rmVar, uq4 uq4, k28 k28, boolean z, int i, pe2 pe2) {
        super(kb4, vj1, rmVar, uq4, k28, z, i, pe2);
        if (kb4 == null) {
            v0(0);
            throw null;
        } else if (vj1 == null) {
            v0(1);
            throw null;
        } else if (pe2 != null) {
        } else {
            v0(6);
            throw null;
        }
    }

    public static /* synthetic */ void v0(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public final String toString() {
        String str;
        String str2 = "";
        if (this.B) {
            str = "reified ";
        } else {
            str = str2;
        }
        if (I() != k28.y) {
            str2 = I() + " ";
        }
        return str + str2 + getName();
    }
}
