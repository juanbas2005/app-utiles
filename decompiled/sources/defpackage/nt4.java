package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: nt4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nt4 {
    public static final k26 m = new k26("^[a-zA-Z]+[+\\w\\-.]*:");
    public static final k26 n = new k26("\\{(.+?)\\}");
    public static final k26 o = new k26("http[s]?://");
    public static final k26 p = new k26(".*");
    public static final k26 q = new k26("([^/]*?|)");
    public static final k26 r = new k26("^[^?#]+\\?([^#]*).*");
    public final String a;
    public final ArrayList b;
    public final String c;
    public final z97 d = new z97(new kt4(this, 0));
    public final z97 e = new z97(new kt4(this, 1));
    public final nz3 f;
    public boolean g;
    public final nz3 h;
    public final nz3 i;
    public final nz3 j;
    public final z97 k;
    public final boolean l;

    public nt4(String str) {
        this.a = str;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        boolean z = false;
        kt4 kt4 = new kt4(this, 2);
        i44 i44 = i44.x;
        this.f = rg3.y(i44, kt4);
        this.h = rg3.y(i44, new kt4(this, 3));
        this.i = rg3.y(i44, new kt4(this, 4));
        this.j = rg3.y(i44, new kt4(this, 5));
        this.k = new z97(new kt4(this, 6));
        new z97(new kt4(this, 7));
        StringBuilder sb = new StringBuilder("^");
        if (!m.w.matcher(str).find()) {
            String pattern = o.w.pattern();
            pattern.getClass();
            sb.append(pattern);
        }
        Pattern compile = Pattern.compile("(\\?|#|$)");
        compile.getClass();
        Matcher matcher = compile.matcher(str);
        matcher.getClass();
        xf4 g2 = t35.g(matcher, 0, str);
        if (g2 != null) {
            a(str.substring(0, g2.b().w), arrayList, sb);
            if (!p.w.matcher(sb).find() && !q.w.matcher(sb).find()) {
                z = true;
            }
            this.l = z;
            sb.append("($|(\\?(.)*)|(#(.)*))");
        }
        this.c = h(sb.toString());
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb) {
        int i2 = 0;
        for (xf4 a2 = k26.a(n, str); a2 != null; a2 = a2.c()) {
            uf4 g2 = a2.c.g(1);
            g2.getClass();
            arrayList.add(g2.a);
            if (a2.b().w > i2) {
                String quote = Pattern.quote(str.substring(i2, a2.b().w));
                quote.getClass();
                sb.append(quote);
            }
            String pattern = q.w.pattern();
            pattern.getClass();
            sb.append(pattern);
            i2 = a2.b().x + 1;
        }
        if (i2 < str.length()) {
            String quote2 = Pattern.quote(str.substring(i2));
            quote2.getClass();
            sb.append(quote2);
        }
    }

    public static void g(Bundle bundle, String str, String str2, xs4 xs4) {
        if (xs4 != null) {
            bv4 bv4 = xs4.a;
            str.getClass();
            bv4.e(bundle, str, bv4.c(str2));
            return;
        }
        str.getClass();
        bundle.putString(str, str2);
    }

    public static String h(String str) {
        if (d57.x0(str, "\\Q", false) && d57.x0(str, "\\E", false)) {
            return k57.s0(str, ".*", "\\E.*\\Q");
        }
        if (d57.x0(str, "\\.\\*", false)) {
            return k57.s0(str, "\\.\\*", ".*");
        }
        return str;
    }

    public final int b(Uri uri) {
        if (uri == null) {
            return 0;
        }
        List<String> pathSegments = uri.getPathSegments();
        Uri parse = Uri.parse(this.a);
        parse.getClass();
        return dt0.B0(pathSegments, parse.getPathSegments()).size();
    }

    public final ArrayList c() {
        ArrayList arrayList = new ArrayList();
        for (mt4 mt4 : ((Map) this.f.getValue()).values()) {
            it0.h0(arrayList, mt4.b);
        }
        return dt0.M0(dt0.M0(this.b, arrayList), (List) this.i.getValue());
    }

    public final Bundle d(Uri uri, LinkedHashMap linkedHashMap) {
        xf4 d2;
        xf4 d3;
        String str;
        uri.getClass();
        linkedHashMap.getClass();
        k26 k26 = (k26) this.d.getValue();
        if (!(k26 == null || (d2 = k26.d(uri.toString())) == null)) {
            Bundle j2 = tf4.j((yb5[]) Arrays.copyOf(new yb5[0], 0));
            if (e(d2, j2, linkedHashMap) && (!((Boolean) this.e.getValue()).booleanValue() || f(uri, j2, linkedHashMap))) {
                String fragment = uri.getFragment();
                k26 k262 = (k26) this.k.getValue();
                if (!(k262 == null || (d3 = k262.d(String.valueOf(fragment))) == null)) {
                    List list = (List) this.i.getValue();
                    ArrayList arrayList = new ArrayList(et0.e0(list, 10));
                    int i2 = 0;
                    for (Object next : list) {
                        int i3 = i2 + 1;
                        if (i2 >= 0) {
                            String str2 = (String) next;
                            uf4 g2 = d3.c.g(i3);
                            if (g2 != null) {
                                str = Uri.decode(g2.a);
                                str.getClass();
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                str = "";
                            }
                            try {
                                g(j2, str2, str, (xs4) linkedHashMap.get(str2));
                                arrayList.add(vs7.a);
                                i2 = i3;
                            } catch (IllegalArgumentException unused) {
                            }
                        } else {
                            sg3.Z();
                            throw null;
                        }
                    }
                }
                if (!gl0.a0(linkedHashMap, new lt4(0, j2)).isEmpty()) {
                    return null;
                }
                return j2;
            }
        }
        return null;
    }

    public final boolean e(xf4 xf4, Bundle bundle, Map map) {
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(et0.e0(arrayList, 10));
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i3 = i2 + 1;
            String str = null;
            if (i2 >= 0) {
                String str2 = (String) next;
                uf4 g2 = xf4.c.g(i3);
                if (g2 != null) {
                    str = Uri.decode(g2.a);
                    str.getClass();
                }
                if (str == null) {
                    str = "";
                }
                try {
                    g(bundle, str2, str, (xs4) map.get(str2));
                    arrayList2.add(vs7.a);
                    i2 = i3;
                } catch (IllegalArgumentException unused) {
                    return false;
                }
            } else {
                sg3.Z();
                throw null;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof nt4)) {
            return false;
        }
        if (this.a.equals(((nt4) obj).a)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00be A[SYNTHETIC] */
    public final boolean f(Uri uri, Bundle bundle, Map map) {
        xf4 xf4;
        String str;
        Object obj;
        boolean z;
        bv4 bv4;
        String query;
        Map map2 = map;
        for (Map.Entry entry : ((Map) this.f.getValue()).entrySet()) {
            mt4 mt4 = (mt4) entry.getValue();
            Uri uri2 = uri;
            List<String> queryParameters = uri2.getQueryParameters((String) entry.getKey());
            if (this.g && (query = uri2.getQuery()) != null && !query.equals(uri2.toString())) {
                queryParameters = sg3.D(query);
            }
            vs7 vs7 = vs7.a;
            boolean z2 = false;
            Bundle j2 = tf4.j((yb5[]) Arrays.copyOf(new yb5[0], 0));
            Iterator it = mt4.b.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                xs4 xs4 = (xs4) map2.get(str2);
                if (xs4 != null) {
                    bv4 = xs4.a;
                } else {
                    bv4 = null;
                }
                if ((bv4 instanceof ct0) && !xs4.c) {
                    ct0 ct0 = (ct0) bv4;
                    ct0.e(j2, str2, ct0.g());
                }
            }
            for (String str3 : queryParameters) {
                String str4 = mt4.a;
                if (str4 != null) {
                    Pattern compile = Pattern.compile(str4);
                    compile.getClass();
                    str3.getClass();
                    Matcher matcher = compile.matcher(str3);
                    matcher.getClass();
                    if (matcher.matches()) {
                        xf4 = new xf4(matcher, str3);
                        if (xf4 != null) {
                            return z2;
                        }
                        ArrayList arrayList = mt4.b;
                        ArrayList arrayList2 = new ArrayList(et0.e0(arrayList, 10));
                        Iterator it2 = arrayList.iterator();
                        int i2 = z2;
                        while (true) {
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                int i3 = i2 + 1;
                                if (i2 >= 0) {
                                    String str5 = (String) next;
                                    uf4 g2 = xf4.c.g(i3);
                                    if (g2 != null) {
                                        str = g2.a;
                                    } else {
                                        str = null;
                                    }
                                    if (str == null) {
                                        str = "";
                                    }
                                    xs4 xs42 = (xs4) map2.get(str5);
                                    try {
                                        str5.getClass();
                                        if (!j2.containsKey(str5)) {
                                            g(j2, str5, str, xs42);
                                            obj = vs7;
                                        } else {
                                            if (!j2.containsKey(str5)) {
                                                z = true;
                                            } else {
                                                if (xs42 != null) {
                                                    bv4 bv42 = xs42.a;
                                                    try {
                                                        Object a2 = bv42.a(str5, j2);
                                                        if (j2.containsKey(str5)) {
                                                            bv42.e(j2, str5, bv42.d(str, a2));
                                                        } else {
                                                            throw new IllegalArgumentException("There is no previous value in this savedState.");
                                                        }
                                                    } catch (IllegalArgumentException unused) {
                                                        obj = vs7;
                                                        arrayList2.add(obj);
                                                        i2 = i3;
                                                        z2 = false;
                                                    }
                                                }
                                                z = false;
                                            }
                                            obj = Boolean.valueOf(z);
                                        }
                                    } catch (IllegalArgumentException unused2) {
                                        obj = vs7;
                                        arrayList2.add(obj);
                                        i2 = i3;
                                        z2 = false;
                                    }
                                    arrayList2.add(obj);
                                    i2 = i3;
                                    z2 = false;
                                } else {
                                    sg3.Z();
                                    throw null;
                                }
                            }
                        }
                    }
                }
                xf4 = null;
                if (xf4 != null) {
                }
            }
            bundle.putAll(j2);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 961;
    }
}
