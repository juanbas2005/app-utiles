package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: nb2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class nb2 {
    public static final LinkedHashMap a;
    public static final Map b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a = linkedHashMap;
        b(j27.x, a("java.util.ArrayList", "java.util.LinkedList"));
        b(j27.y, a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        b(j27.z, a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        up2 up2 = new up2("java.util.function.Function");
        b(new gq0(up2.b(), up2.a.g()), a("java.util.function.UnaryOperator"));
        up2 up22 = new up2("java.util.function.BiFunction");
        b(new gq0(up22.b(), up22.a.g()), a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new yb5(((gq0) entry.getKey()).a(), ((gq0) entry.getValue()).a()));
        }
        b = sf4.a0(arrayList);
    }

    public static ArrayList a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String up2 : strArr) {
            up2 up22 = new up2(up2);
            arrayList.add(new gq0(up22.b(), up22.a.g()));
        }
        return arrayList;
    }

    public static void b(gq0 gq0, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            gq0 gq02 = (gq0) next;
            a.put(next, gq0);
        }
    }
}
