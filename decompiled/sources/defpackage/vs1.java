package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* renamed from: vs1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class vs1 {
    public static final us1 a;
    public static final us1 b;
    public static final us1 c;
    public static final us1 d;
    public static final us1 e;
    public static final us1 f;
    public static final us1 g;
    public static final us1 h;
    public static final us1 i;
    public static final us1 j;
    public static final me6 k = new me6(26);
    public static final td0 l = new td0(27);
    public static final g22 m = new g22(27);
    public static final ul4 n;
    public static final HashMap o;

    static {
        ul4 ul4;
        b78 b78 = b78.z;
        us1 us1 = new us1(b78, 0);
        a = us1;
        c78 c78 = c78.z;
        us1 us12 = new us1(c78, 1);
        b = us12;
        d78 d78 = d78.z;
        us1 us13 = new us1(d78, 2);
        c = us13;
        y68 y68 = y68.z;
        us1 us14 = new us1(y68, 3);
        d = us14;
        e78 e78 = e78.z;
        us1 us15 = new us1(e78, 4);
        e = us15;
        a78 a78 = a78.z;
        us1 us16 = new us1(a78, 5);
        f = us16;
        x68 x68 = x68.z;
        us1 us17 = new us1(x68, 6);
        g = us17;
        z68 z68 = z68.z;
        x68 x682 = x68;
        us1 us18 = new us1(z68, 7);
        h = us18;
        us1 us19 = us18;
        f78 f78 = f78.z;
        z68 z682 = z68;
        us1 us110 = new us1(f78, 8);
        i = us110;
        Collections.unmodifiableSet(qs.r1(new us1[]{us1, us12, us14, us16}));
        f78 f782 = f78;
        HashMap hashMap = new HashMap(6);
        hashMap.put(us12, 0);
        hashMap.put(us1, 0);
        hashMap.put(us14, 1);
        hashMap.put(us13, 1);
        hashMap.put(us15, 2);
        Collections.unmodifiableMap(hashMap);
        j = us15;
        try {
            Iterator it = Arrays.asList(new ul4[0]).iterator();
            if (it.hasNext()) {
                ul4 = (ul4) it.next();
            } else {
                ul4 = ul4.a;
            }
            n = ul4;
            HashMap hashMap2 = new HashMap();
            o = hashMap2;
            hashMap2.put(b78, us1);
            hashMap2.put(c78, us12);
            hashMap2.put(d78, us13);
            hashMap2.put(y68, us14);
            hashMap2.put(e78, us15);
            hashMap2.put(a78, us16);
            hashMap2.put(x682, us17);
            hashMap2.put(z682, us19);
            hashMap2.put(f782, us110);
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static /* synthetic */ void a(int i2) {
        String str;
        int i3;
        Throwable th;
        if (i2 != 16) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i2 != 16) {
            i3 = 3;
        } else {
            i3 = 2;
        }
        Object[] objArr = new Object[i3];
        if (!(i2 == 1 || i2 == 3 || i2 == 5 || i2 == 7)) {
            switch (i2) {
                case 9:
                    break;
                case 10:
                case 12:
                    objArr[0] = "first";
                    break;
                case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                case ry4.PERF_SESSIONS_FIELD_NUMBER:
                    objArr[0] = "second";
                    break;
                case 14:
                case h75.g:
                    objArr[0] = "visibility";
                    break;
                case 16:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
        }
        objArr[0] = "from";
        if (i2 != 16) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
        } else {
            objArr[1] = "toDescriptorVisibility";
        }
        switch (i2) {
            case 2:
            case 3:
                objArr[2] = "isVisibleIgnoringReceiver";
                break;
            case 4:
            case 5:
                objArr[2] = "isVisibleWithAnyReceiver";
                break;
            case 6:
            case 7:
                objArr[2] = "inSameFile";
                break;
            case 8:
            case 9:
                objArr[2] = "findInvisibleMember";
                break;
            case 10:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                objArr[2] = "compareLocal";
                break;
            case 12:
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
                objArr[2] = "compare";
                break;
            case 14:
                objArr[2] = "isPrivate";
                break;
            case h75.g:
                objArr[2] = "toDescriptorVisibility";
                break;
            case 16:
                break;
            default:
                objArr[2] = "isVisible";
                break;
        }
        String format = String.format(str, objArr);
        if (i2 != 16) {
            th = new IllegalArgumentException(format);
        } else {
            th = new IllegalStateException(format);
        }
        throw th;
    }

    public static Integer b(us1 us1, us1 us12) {
        if (us1 != null) {
            h8 h8Var = us1.a;
            if (us12 != null) {
                h8 h8Var2 = us12.a;
                Integer a2 = h8Var.a(h8Var2);
                if (a2 != null) {
                    return a2;
                }
                Integer a3 = h8Var2.a(h8Var);
                if (a3 != null) {
                    return Integer.valueOf(-a3.intValue());
                }
                return null;
            }
            a(13);
            throw null;
        }
        a(12);
        throw null;
    }

    public static ak1 c(xx5 xx5, ak1 ak1, vj1 vj1) {
        ak1 c2;
        if (ak1 == null) {
            a(8);
            throw null;
        } else if (vj1 != null) {
            ak1 ak12 = (ak1) ak1.a();
            while (ak12 != null && ak12.f() != f) {
                if (!ak12.f().a(xx5, ak12, vj1)) {
                    return ak12;
                }
                ak12 = (ak1) rs1.h(ak12, ak1.class, true);
            }
            if (!(ak1 instanceof mo7) || (c2 = c(xx5, ((mo7) ak1).b0, vj1)) == null) {
                return null;
            }
            return c2;
        } else {
            a(9);
            throw null;
        }
    }

    public static boolean d(ak1 ak1, vj1 vj1) {
        if (vj1 != null) {
            me6 e2 = rs1.e(vj1);
            if (e2 == me6.M || e2 != rs1.e(ak1)) {
                return false;
            }
            return true;
        }
        a(7);
        throw null;
    }

    public static boolean e(us1 us1) {
        if (us1 == null) {
            a(14);
            throw null;
        } else if (us1 == a || us1 == b) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean f(ri0 ri0, vj1 vj1) {
        if (ri0 == null) {
            a(2);
            throw null;
        } else if (vj1 == null) {
            a(3);
            throw null;
        } else if (c(l, ri0, vj1) == null) {
            return true;
        } else {
            return false;
        }
    }

    public static us1 g(h8 h8Var) {
        if (h8Var != null) {
            us1 us1 = (us1) o.get(h8Var);
            if (us1 != null) {
                return us1;
            }
            kj6.o("Inapplicable visibility: ", h8Var);
            return null;
        }
        a(15);
        throw null;
    }
}
