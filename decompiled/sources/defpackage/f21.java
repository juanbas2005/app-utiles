package defpackage;

import kotlin.KotlinNothingValueException;

/* renamed from: f21  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract /* synthetic */ class f21 {
    public static boolean a(int i, int i2, int i3) {
        switch (i) {
            case 1:
                if (((i2 + i3) & 1) == 0) {
                    return true;
                }
                return false;
            case 2:
                if ((i2 & 1) == 0) {
                    return true;
                }
                return false;
            case 3:
                if (i3 % 3 == 0) {
                    return true;
                }
                return false;
            case 4:
                if ((i2 + i3) % 3 == 0) {
                    return true;
                }
                return false;
            case 5:
                if ((((i3 / 3) + (i2 / 2)) & 1) == 0) {
                    return true;
                }
                return false;
            case 6:
                if ((i2 * i3) % 6 == 0) {
                    return true;
                }
                return false;
            case 7:
                if ((i2 * i3) % 6 < 3) {
                    return true;
                }
                return false;
            default:
                if (((((i2 * i3) % 3) + i2 + i3) & 1) == 0) {
                    return true;
                }
                return false;
        }
    }

    public static /* synthetic */ int b(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    if (i == 4) {
                        return 4;
                    }
                    throw null;
                }
            }
        }
        return i2;
    }

    public static /* synthetic */ boolean c(int i) {
        if (i == 1 || i == 2) {
            return false;
        }
        if (i == 3 || i == 4) {
            return true;
        }
        throw null;
    }

    public static int d(float f, int i, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static int e(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static String f(long j, String str) {
        return str + j;
    }

    public static String g(long j, String str, String str2) {
        return str + j + str2;
    }

    public static String h(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String i(String str, StringBuilder sb) {
        return str + sb;
    }

    public static String j(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static String k(StringBuilder sb, long j, String str) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static String l(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String m(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static StringBuilder n(String str, float f, String str2, float f2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(f);
        sb.append(str2);
        sb.append(f2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder o(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [kotlin.KotlinNothingValueException, java.lang.RuntimeException] */
    public static KotlinNothingValueException p(String str) {
        bc3.b(str);
        return new RuntimeException();
    }

    public static void q(int i, int i2, int i3, int i4, int i5) {
        uq3.f(i);
        uq3.f(i2);
        uq3.f(i3);
        uq3.f(i4);
        uq3.f(i5);
    }

    public static void r(int i, fw0 fw0, yt2 yt2, boolean z) {
        fw0.H(yt2, Integer.valueOf(i));
        yt2.r(z);
    }

    public static void s(int i, yt2 yt2, ck ckVar, yt2 yt22, ce ceVar) {
        g75.Q(ckVar, yt2, Integer.valueOf(i));
        g75.O(yt22, ceVar);
    }

    public static void t(ui7 ui7, sy4 sy4, sy4 sy42) {
        sy4.i(ui7.b());
        ty4.c(sy42);
    }

    public static /* synthetic */ void u(Object obj) {
        if (obj != null) {
            ku4.a();
        }
    }

    public static void v(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static boolean w(o03 o03, int i, d37 d37, Object obj) {
        return d37.i(obj, new is7(i, o03));
    }

    public static /* synthetic */ String x(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }
}
