package defpackage;

import java.util.HashMap;

/* renamed from: ni3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ni3 {
    public static final us1 a;
    public static final us1 b;
    public static final us1 c;
    public static final HashMap d;

    static {
        dk3 dk3 = dk3.z;
        us1 us1 = new us1(dk3, 9);
        a = us1;
        fk3 fk3 = fk3.z;
        us1 us12 = new us1(fk3, 10);
        b = us12;
        ek3 ek3 = ek3.z;
        us1 us13 = new us1(ek3, 11);
        c = us13;
        HashMap hashMap = new HashMap();
        d = hashMap;
        hashMap.put(dk3, us1);
        hashMap.put(fk3, us12);
        hashMap.put(ek3, us13);
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        Throwable th;
        if (i == 5 || i == 6) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i == 5 || i == 6) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i == 5 || i == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i == 2 || i == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (!(i == 5 || i == 6)) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String format = String.format(str, objArr);
        if (i == 5 || i == 6) {
            th = new IllegalStateException(format);
        } else {
            th = new IllegalArgumentException(format);
        }
        throw th;
    }

    public static boolean b(xx5 xx5, ak1 ak1, vj1 vj1) {
        ak1 ak12;
        if (vj1 != null) {
            if (ak1 instanceof ri0) {
                ak12 = rs1.r((ri0) ak1);
            } else {
                int i = rs1.a;
                ak12 = ak1;
            }
            if (c(ak12, vj1)) {
                return true;
            }
            return vs1.c.a(xx5, ak1, vj1);
        }
        a(1);
        throw null;
    }

    public static boolean c(ak1 ak1, vj1 vj1) {
        if (ak1 == null) {
            a(2);
            throw null;
        } else if (vj1 != null) {
            Class<x95> cls = x95.class;
            x95 x95 = (x95) rs1.h(ak1, cls, false);
            x95 x952 = (x95) rs1.h(vj1, cls, false);
            if (x952 == null || x95 == null || !((y95) x95).A.equals(((y95) x952).A)) {
                return false;
            }
            return true;
        } else {
            a(3);
            throw null;
        }
    }
}
