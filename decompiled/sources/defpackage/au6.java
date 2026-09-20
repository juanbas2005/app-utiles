package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: au6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class au6 extends zs2 {
    /* JADX WARNING: Illegal instructions before constructor call */
    public au6(vj1 vj1, au6 au6, rm rmVar, uq4 uq4, int i, sy6 sy6) {
        super(r3, r1, r5, au6, r7, sy6);
        if (vj1 == null) {
            v0(0);
            throw null;
        } else if (rmVar == null) {
            v0(1);
            throw null;
        } else if (uq4 == null) {
            v0(2);
            throw null;
        } else if (i == 0) {
            v0(3);
            throw null;
        } else if (sy6 != null) {
            rm rmVar2 = rmVar;
            vj1 vj12 = vj1;
            int i2 = i;
            uq4 uq42 = uq4;
        } else {
            v0(4);
            throw null;
        }
    }

    public static au6 q1(ql4 ql4, uq4 uq4, int i, sy6 sy6) {
        qm qmVar = me6.x;
        if (ql4 == null) {
            v0(5);
            throw null;
        } else if (uq4 == null) {
            v0(7);
            throw null;
        } else if (i == 0) {
            v0(8);
            throw null;
        } else if (sy6 != null) {
            return new au6(ql4, (au6) null, qmVar, uq4, i, sy6);
        } else {
            v0(9);
            throw null;
        }
    }

    public static /* synthetic */ void v0(int i) {
        String str;
        int i2;
        Throwable th;
        if (i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = "source";
                break;
            case 10:
            case h75.g /*15*/:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 13 || i == 18 || i == 23) {
            objArr[1] = "initialize";
        } else if (i == 24) {
            objArr[1] = "getOriginal";
        } else if (i == 29) {
            objArr[1] = "copy";
        } else if (i != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
            case 12:
            case 14:
            case h75.g /*15*/:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) {
            th = new IllegalStateException(format);
        } else {
            th = new IllegalArgumentException(format);
        }
        throw th;
    }

    public zs2 h1(int i, rm rmVar, vj1 vj1, xs2 xs2, uq4 uq4, sy6 sy6) {
        if (vj1 == null) {
            v0(25);
            throw null;
        } else if (i == 0) {
            v0(26);
            throw null;
        } else if (rmVar != null) {
            au6 au6 = (au6) xs2;
            if (uq4 == null) {
                uq4 = getName();
            }
            uq4 uq42 = uq4;
            int i2 = i;
            return new au6(vj1, au6, rmVar, uq42, i2, sy6);
        } else {
            v0(27);
            throw null;
        }
    }

    public ws2 r0() {
        return l1(dq7.b);
    }

    /* renamed from: r1 */
    public final au6 e1() {
        au6 au6 = (au6) super.a();
        if (au6 != null) {
            return au6;
        }
        v0(24);
        throw null;
    }

    /* renamed from: s1 */
    public final au6 k1(qz3 qz3, qz3 qz32, List list, List list2, List list3, vw3 vw3, fl4 fl4, us1 us1) {
        if (list == null) {
            v0(14);
            throw null;
        } else if (list2 == null) {
            v0(15);
            throw null;
        } else if (list3 == null) {
            v0(16);
            throw null;
        } else if (us1 != null) {
            return t1(qz3, qz32, list, list2, list3, vw3, fl4, us1, (Map) null);
        } else {
            v0(17);
            throw null;
        }
    }

    public au6 t1(qz3 qz3, qz3 qz32, List list, List list2, List list3, vw3 vw3, fl4 fl4, us1 us1, Map map) {
        if (list == null) {
            v0(19);
            throw null;
        } else if (list2 == null) {
            v0(20);
            throw null;
        } else if (list3 == null) {
            v0(21);
            throw null;
        } else if (us1 != null) {
            super.k1(qz3, qz32, list, list2, list3, vw3, fl4, us1);
            if (map != null && !map.isEmpty()) {
                this.Y = new LinkedHashMap(map);
            }
            return this;
        } else {
            v0(22);
            throw null;
        }
    }
}
