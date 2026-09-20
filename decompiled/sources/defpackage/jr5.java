package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: jr5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jr5 extends ar5 {
    public h28 I;
    public final jr5 J;

    /* JADX WARNING: Illegal instructions before constructor call */
    public jr5(cr5 cr5, rm rmVar, fl4 fl4, us1 us1, boolean z, boolean z2, boolean z3, int i, jr5 jr5, sy6 sy6) {
        super(r2, r3, cr5, rmVar, uq4.g("<set-" + cr5.getName() + ">"), z, z2, z3, i, sy6);
        jr5 jr52;
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
            if (jr5 != null) {
                jr52 = jr5;
            } else {
                jr52 = this;
            }
            this.J = jr52;
        } else {
            v0(5);
            throw null;
        }
    }

    public static h28 h1(jr5 jr5, vw3 vw3, rm rmVar) {
        if (vw3 == null) {
            v0(8);
            throw null;
        } else if (rmVar != null) {
            return new h28(jr5, (h28) null, 0, rmVar, oz6.g, vw3, false, false, false, (vw3) null, sy6.j);
        } else {
            v0(9);
            throw null;
        }
    }

    public static /* synthetic */ void v0(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 10:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
            case 12:
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 10:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
            case 12:
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 9:
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
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
            case 12:
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
            case 12:
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 10:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
            case 12:
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    public final Object P(zj1 zj1, Object obj) {
        return zj1.k(this, obj);
    }

    public final List S() {
        h28 h28 = this.I;
        if (h28 != null) {
            List singletonList = Collections.singletonList(h28);
            if (singletonList != null) {
                return singletonList;
            }
            v0(11);
            throw null;
        }
        throw new IllegalStateException();
    }

    /* renamed from: i1 */
    public final jr5 e1() {
        jr5 jr5 = this.J;
        if (jr5 != null) {
            return jr5;
        }
        v0(13);
        throw null;
    }

    public final vw3 k() {
        return ts1.e(this).x();
    }

    public final Collection s() {
        return g1(false);
    }
}
