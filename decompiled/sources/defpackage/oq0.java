package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: oq0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class oq0 extends k0 {
    public final Collection A;
    public final ql4 y;
    public final List z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oq0(ql4 ql4, List list, Collection collection, kb4 kb4) {
        super(kb4);
        if (list == null) {
            i(1);
            throw null;
        } else if (collection == null) {
            i(2);
            throw null;
        } else if (kb4 != null) {
            this.y = ql4;
            this.z = Collections.unmodifiableList(new ArrayList(list));
            this.A = Collections.unmodifiableCollection(collection);
        } else {
            i(3);
            throw null;
        }
    }

    public static /* synthetic */ void i(int i) {
        String str;
        int i2;
        Throwable th;
        if (i == 4 || i == 5 || i == 6 || i == 7) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i == 4 || i == 5 || i == 6 || i == 7) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i == 4) {
            objArr[1] = "getParameters";
        } else if (i == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (!(i == 4 || i == 5 || i == 6 || i == 7)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i == 4 || i == 5 || i == 6 || i == 7) {
            th = new IllegalStateException(format);
        } else {
            th = new IllegalArgumentException(format);
        }
        throw th;
    }

    public final Collection a() {
        Collection collection = this.A;
        if (collection != null) {
            return collection;
        }
        i(6);
        throw null;
    }

    public final pe2 c() {
        return pe2.O;
    }

    public final List getParameters() {
        List list = this.z;
        if (list != null) {
            return list;
        }
        i(4);
        throw null;
    }

    public final ql4 j() {
        ql4 ql4 = this.y;
        if (ql4 != null) {
            return ql4;
        }
        i(5);
        throw null;
    }

    public final String toString() {
        return rs1.f(this.y).a;
    }

    public final boolean y() {
        return true;
    }
}
