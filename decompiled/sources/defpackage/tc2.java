package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: tc2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class tc2 {
    public static final z97 a = new z97(new nf1(10));

    static {
        new z97(new nf1(11));
    }

    public static final q51 a(String str) {
        q51 q51 = q51.e;
        int F0 = d57.F0(str, '.', d57.M0(str, sg3.c0("/\\"), str.length() - 1) + 1, 4);
        List list = a42.w;
        if (F0 != -1) {
            String v = o85.v(d57.R0(str.substring(F0 + 1), "."));
            while (true) {
                if (v.length() <= 0) {
                    break;
                }
                List list2 = (List) ((Map) a.getValue()).get(v);
                if (list2 != null) {
                    list = list2;
                    break;
                }
                v = d57.c1(v, ".", "");
            }
        }
        q51 q512 = (q51) dt0.y0(list);
        if (q512 == null) {
            q512 = l51.e;
        }
        if (q512.a(p51.a)) {
            if (t51.a(q512) == null) {
                Charset charset = mo0.a;
                charset.getClass();
                String name = charset.name();
                name.getClass();
                return q512.c(name);
            }
        } else if (q512.a(n51.b)) {
            if (t51.a(q512) == null) {
                Charset charset2 = mo0.a;
                charset2.getClass();
                String name2 = charset2.name();
                name2.getClass();
                return q512.c(name2);
            }
        } else if (q512.a(l51.a) && ((q512.a(l51.b) || q512.a(l51.d) || q512.a(l51.f) || q512.a(l51.g) || q512.a(l51.h)) && t51.a(q512) == null)) {
            Charset charset3 = mo0.a;
            charset3.getClass();
            String name3 = charset3.name();
            name3.getClass();
            return q512.c(name3);
        }
        return q512;
    }

    public static final LinkedHashMap b(al6 al6) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : al6) {
            Object obj = ((yb5) next).w;
            Object obj2 = linkedHashMap.get(obj);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(obj, obj2);
            }
            ((List) obj2).add(next);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(tf4.F(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Iterable<yb5> iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(et0.e0(iterable, 10));
            for (yb5 yb5 : iterable) {
                arrayList.add(yb5.x);
            }
            linkedHashMap2.put(key, arrayList);
        }
        return linkedHashMap2;
    }
}
