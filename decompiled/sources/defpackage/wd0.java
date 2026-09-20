package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: wd0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class wd0 {
    public static final Map a;
    public static final LinkedHashMap b;
    public static final Set c;
    public static final Set d;

    static {
        vp2 vp2 = m27.j;
        yb5 yb5 = new yb5(vp2.a(uq4.e("name")).i(), n27.d);
        yb5 yb52 = new yb5(vp2.a(uq4.e("ordinal")).i(), uq4.e("ordinal"));
        yb5 yb53 = new yb5(kl8.e(m27.C, "size"), uq4.e("size"));
        up2 up2 = m27.G;
        String str = "length";
        String str2 = str;
        Map V = sf4.V(yb5, yb52, yb53, new yb5(kl8.e(up2, "size"), uq4.e("size")), new yb5(m27.e.a(uq4.e("length")).i(), uq4.e("length")), new yb5(kl8.e(up2, "keys"), uq4.e("keySet")), new yb5(kl8.e(up2, "values"), uq4.e("values")), new yb5(kl8.e(up2, "entries"), uq4.e("entrySet")), new yb5(kl8.e(m27.a0, "size"), uq4.e(str)), new yb5(kl8.e(m27.b0, "size"), uq4.e(str2)), new yb5(kl8.e(m27.c0, "size"), uq4.e(str2)));
        a = V;
        Iterable<Map.Entry> entrySet = V.entrySet();
        ArrayList arrayList = new ArrayList(et0.e0(entrySet, 10));
        for (Map.Entry entry : entrySet) {
            arrayList.add(new yb5(((up2) entry.getKey()).a.g(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            yb5 yb54 = (yb5) it.next();
            uq4 uq4 = (uq4) yb54.x;
            Object obj = linkedHashMap.get(uq4);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(uq4, obj);
            }
            ((List) obj).add((uq4) yb54.w);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(tf4.F(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), dt0.r0((Iterable) entry2.getValue()));
        }
        b = linkedHashMap2;
        Map map = a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : map.entrySet()) {
            String str3 = tj3.a;
            gq0 h = tj3.h(((up2) entry3.getKey()).b().a);
            h.getClass();
            linkedHashSet.add(h.a().a((uq4) entry3.getValue()));
        }
        Set keySet = a.keySet();
        c = keySet;
        Iterable<up2> iterable = keySet;
        ArrayList arrayList2 = new ArrayList(et0.e0(iterable, 10));
        for (up2 up22 : iterable) {
            arrayList2.add(up22.a.g());
        }
        d = dt0.g1(arrayList2);
    }
}
