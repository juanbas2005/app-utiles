package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import org.xml.sax.Attributes;

/* renamed from: pb4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract /* synthetic */ class pb4 {
    public static int a(int i, int i2, int i3, int i4) {
        return vs0.d(i) + i2 + i3 + i4;
    }

    public static int b(int i, int i2, long j) {
        return (Long.hashCode(j) + i) * i2;
    }

    public static int c(tg7 tg7, int i, int i2) {
        return (tg7.hashCode() + i) * i2;
    }

    public static int d(Attributes attributes, int i) {
        return qd6.a(attributes.getLocalName(i)).ordinal();
    }

    public static be5 e(float f, float f2) {
        be5 be5 = new be5();
        be5.j(f, f2);
        return be5;
    }

    public static be5 f(float f, float f2, float f3, float f4) {
        be5 be5 = new be5();
        be5.j(f, f2);
        be5.i(f3, f4);
        return be5;
    }

    public static ClassCastException g(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static String h(char c, String str, String str2) {
        return str + str2 + c;
    }

    public static String i(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String j(jl4 jl4, float f, yt2 yt2, int i, yt2 yt22) {
        k75.a(yt2, yu6.d(jl4, f));
        return l55.u(i, yt22);
    }

    public static String k(String str, int i, String str2, int i2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    public static String l(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String m(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String n(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    public static StringBuilder o(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder p(String str, int i, String str2, int i2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static void q(int i, gs2 gs2, yt2 yt2, boolean z, boolean z2) {
        gs2.H(yt2, Integer.valueOf(i));
        yt2.r(z);
        yt2.r(z2);
    }

    public static void r(int i, HashMap hashMap, String str, int i2, String str2) {
        hashMap.put(str, Integer.valueOf(i));
        hashMap.put(str2, Integer.valueOf(i2));
    }

    public static void s(StringBuilder sb, boolean z, String str, boolean z2, String str2) {
        sb.append(z);
        sb.append(str);
        sb.append(z2);
        sb.append(str2);
    }

    public static boolean t(wp5 wp5, int i, d37 d37, Object obj) {
        return d37.i(obj, new is7(i, wp5));
    }

    public static /* synthetic */ int u(String str) {
        if (str == null) {
            ku4.j("Name is null");
            return 0;
        } else if (str.equals("px")) {
            return 1;
        } else {
            if (str.equals("em")) {
                return 2;
            }
            if (str.equals("ex")) {
                return 3;
            }
            if (str.equals("in")) {
                return 4;
            }
            if (str.equals("cm")) {
                return 5;
            }
            if (str.equals("mm")) {
                return 6;
            }
            if (str.equals("pt")) {
                return 7;
            }
            if (str.equals("pc")) {
                return 8;
            }
            if (str.equals("percent")) {
                return 9;
            }
            h.q("No enum constant com.caverock.androidsvg.SVG.Unit.".concat(str));
            return 0;
        }
    }
}
