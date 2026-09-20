package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: fr5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fr5 extends ar5 {
    public vw3 I;
    public final fr5 J;

    /* JADX WARNING: Illegal instructions before constructor call */
    public fr5(cr5 cr5, rm rmVar, fl4 fl4, us1 us1, boolean z, boolean z2, boolean z3, int i, fr5 fr5, sy6 sy6) {
        super(r2, r3, cr5, rmVar, uq4.g("<get-" + cr5.getName() + ">"), z, z2, z3, i, sy6);
        fr5 fr52;
        if (rmVar == null) {
            v0(1);
            throw null;
        } else if (fl4 == null) {
            v0(2);
            throw null;
        } else if (us1 == null) {
            v0(3);
            throw null;
        } else if (i == 0) {
            v0(4);
            throw null;
        } else if (sy6 != null) {
            fl4 fl42 = fl4;
            us1 us12 = us1;
            if (fr5 != null) {
                fr52 = fr5;
            } else {
                fr52 = this;
            }
            this.J = fr52;
        } else {
            v0(5);
            throw null;
        }
    }

    public static /* synthetic */ void v0(int i) {
        String str;
        int i2;
        Throwable th;
        if (i == 6 || i == 7 || i == 8) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i == 6 || i == 7 || i == 8) {
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
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i == 7) {
            objArr[1] = "getValueParameters";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (!(i == 6 || i == 7 || i == 8)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i == 6 || i == 7 || i == 8) {
            th = new IllegalStateException(format);
        } else {
            th = new IllegalArgumentException(format);
        }
        throw th;
    }

    public final Object P(zj1 zj1, Object obj) {
        return zj1.d(this, obj);
    }

    public final List S() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        v0(7);
        throw null;
    }

    /* renamed from: h1 */
    public final fr5 e1() {
        fr5 fr5 = this.J;
        if (fr5 != null) {
            return fr5;
        }
        v0(8);
        throw null;
    }

    public final void i1(vw3 vw3) {
        if (vw3 == null) {
            vw3 = f1().b();
        }
        this.I = vw3;
    }

    public final vw3 k() {
        return this.I;
    }

    public final Collection s() {
        return g1(true);
    }
}
