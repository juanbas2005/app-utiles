package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: wp0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class wp0 extends zs2 implements s31 {
    public final boolean Z;

    /* JADX WARNING: Illegal instructions before constructor call */
    public wp0(ql4 ql4, s31 s31, rm rmVar, boolean z, int i, sy6 sy6) {
        super(r2, r3, ql4, s31, oz6.e, sy6);
        if (ql4 == null) {
            v0(0);
            throw null;
        } else if (rmVar == null) {
            v0(1);
            throw null;
        } else if (i == 0) {
            v0(2);
            throw null;
        } else if (sy6 != null) {
            rm rmVar2 = rmVar;
            int i2 = i;
            this.Z = z;
        } else {
            v0(3);
            throw null;
        }
    }

    public static /* synthetic */ void v0(int i) {
        String str;
        int i2;
        Throwable th;
        if (!(i == 21 || i == 27)) {
            switch (i) {
                case h75.g:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i == 21 || i == 27)) {
            switch (i) {
                case h75.g:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    i2 = 3;
                    break;
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 5:
            case 8:
            case 25:
                objArr[0] = "annotations";
                break;
            case 2:
            case 24:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 9:
            case 26:
                objArr[0] = "source";
                break;
            case 10:
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
            case 14:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "typeParameterDescriptors";
                break;
            case h75.g:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                break;
            case 20:
                objArr[0] = "originalSubstitutor";
                break;
            case 22:
                objArr[0] = "overriddenDescriptors";
                break;
            case 23:
                objArr[0] = "newOwner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 21) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i != 27) {
            switch (i) {
                case h75.g:
                case 16:
                    objArr[1] = "calculateContextReceiverParameters";
                    break;
                case 17:
                    objArr[1] = "getContainingDeclaration";
                    break;
                case 18:
                    objArr[1] = "getConstructedClass";
                    break;
                case 19:
                    objArr[1] = "getOriginal";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "create";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSynthesized";
                break;
            case 10:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
            case 12:
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
            case 14:
                objArr[2] = "initialize";
                break;
            case h75.g:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
                break;
            case 20:
                objArr[2] = "substitute";
                break;
            case 22:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 23:
            case 24:
            case 25:
            case 26:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i == 21 || i == 27)) {
            switch (i) {
                case h75.g:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    th = new IllegalArgumentException(format);
                    break;
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    public final Object P(zj1 zj1, Object obj) {
        return zj1.M(this, obj);
    }

    public final ri0 e0(ql4 ql4, fl4 fl4, us1 us1) {
        return (wp0) f1(ql4, fl4, us1);
    }

    public final void m0(Collection collection) {
        if (collection == null) {
            v0(22);
            throw null;
        }
    }

    /* renamed from: q1 */
    public wp0 h1(int i, rm rmVar, vj1 vj1, xs2 xs2, uq4 uq4, sy6 sy6) {
        if (vj1 == null) {
            v0(23);
            throw null;
        } else if (i == 0) {
            v0(24);
            throw null;
        } else if (rmVar == null) {
            v0(25);
            throw null;
        } else if (i == 1 || i == 4) {
            return new wp0((ql4) vj1, this, rmVar, this.Z, 1, sy6);
        } else {
            StringBuilder sb = new StringBuilder("Attempt at creating a constructor that is not a declaration: \ncopy from: ");
            sb.append(this);
            sb.append("\nnewOwner: ");
            sb.append(vj1);
            String E = b81.E(i);
            sb.append("\nkind: ");
            sb.append(E);
            throw new IllegalStateException(sb.toString());
        }
    }

    public final ql4 r1() {
        ql4 s1 = r();
        if (s1 != null) {
            return s1;
        }
        v0(18);
        throw null;
    }

    public final Collection s() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        v0(21);
        throw null;
    }

    /* renamed from: s1 */
    public final ql4 r() {
        ql4 ql4 = (ql4) super.r();
        if (ql4 != null) {
            return ql4;
        }
        v0(17);
        throw null;
    }

    /* renamed from: t1 */
    public final wp0 e1() {
        wp0 wp0 = (wp0) super.a();
        if (wp0 != null) {
            return wp0;
        }
        v0(19);
        throw null;
    }

    public final void u1(List list, us1 us1) {
        if (list == null) {
            v0(13);
            throw null;
        } else if (us1 != null) {
            v1(list, us1, r().u0());
        } else {
            v0(14);
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003e  */
    public final void v1(List list, us1 us1, List list2) {
        qz3 qz3;
        ql4 s1;
        List list3;
        if (list == null) {
            v0(10);
            throw null;
        } else if (us1 == null) {
            v0(11);
            throw null;
        } else if (list2 != null) {
            ql4 s12 = r();
            if (s12.p()) {
                vj1 r = s12.r();
                if (r instanceof ql4) {
                    qz3 = ((ql4) r).Q();
                    s1 = r();
                    if (s1.t().isEmpty()) {
                        list3 = s1.t();
                        if (list3 == null) {
                            v0(15);
                            throw null;
                        }
                    } else {
                        list3 = Collections.EMPTY_LIST;
                        if (list3 == null) {
                            v0(16);
                            throw null;
                        }
                    }
                    k1((qz3) null, qz3, list3, list2, list, (vw3) null, fl4.x, us1);
                }
            }
            qz3 = null;
            s1 = r();
            if (s1.t().isEmpty()) {
            }
            k1((qz3) null, qz3, list3, list2, list, (vw3) null, fl4.x, us1);
        } else {
            v0(12);
            throw null;
        }
    }

    /* renamed from: w1 */
    public final wp0 h(dq7 dq7) {
        if (dq7 != null) {
            return (wp0) super.h(dq7);
        }
        v0(20);
        throw null;
    }
}
