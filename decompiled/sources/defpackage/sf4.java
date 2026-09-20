package defpackage;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: sf4  reason: default package */
public abstract class sf4 extends tf4 {
    public static Object U(Object obj, Map map) {
        map.getClass();
        if (map instanceof of4) {
            return ((of4) map).d();
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static Map V(yb5... yb5Arr) {
        if (yb5Arr.length <= 0) {
            return b42.w;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(tf4.F(yb5Arr.length));
        Y(linkedHashMap, yb5Arr);
        return linkedHashMap;
    }

    public static final Map W(LinkedHashMap linkedHashMap) {
        int size = linkedHashMap.size();
        if (size == 0) {
            return b42.w;
        }
        if (size != 1) {
            return linkedHashMap;
        }
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        singletonMap.getClass();
        return singletonMap;
    }

    public static LinkedHashMap X(Map map, Map map2) {
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static void Y(AbstractMap abstractMap, yb5[] yb5Arr) {
        for (yb5 yb5 : yb5Arr) {
            abstractMap.put(yb5.w, yb5.x);
        }
    }

    public static List Z(Map map) {
        map.getClass();
        int size = map.size();
        a42 a42 = a42.w;
        if (size == 0) {
            return a42;
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return a42;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return sg3.D(new yb5(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new yb5(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new yb5(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    public static Map a0(List list) {
        list.getClass();
        int size = list.size();
        if (size == 0) {
            return b42.w;
        }
        if (size != 1) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(tf4.F(list.size()));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                yb5 yb5 = (yb5) it.next();
                linkedHashMap.put(yb5.w, yb5.x);
            }
            return linkedHashMap;
        }
        yb5 yb52 = (yb5) list.get(0);
        yb52.getClass();
        Map singletonMap = Collections.singletonMap(yb52.w, yb52.x);
        singletonMap.getClass();
        return singletonMap;
    }

    public static Map b0(Map map) {
        map.getClass();
        int size = map.size();
        if (size == 0) {
            return b42.w;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        singletonMap.getClass();
        return singletonMap;
    }
}
