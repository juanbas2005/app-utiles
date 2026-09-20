package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: mz6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class mz6 {
    public static final ArrayList a;
    public static final ArrayList b;
    public static final Map c;
    public static final LinkedHashMap d;
    public static final Set e;
    public static final Set f;
    public static final iz6 g;
    public static final Map h;
    public static final LinkedHashMap i;
    public static final HashSet j;
    public static final LinkedHashMap k;

    static {
        Iterable<String> r1 = qs.r1(new String[]{"containsAll", "removeAll", "retainAll"});
        ArrayList arrayList = new ArrayList(et0.e0(r1, 10));
        for (String i2 : r1) {
            arrayList.add(ts2.i("java/util/Collection", i2, "Ljava/util/Collection;", zo3.BOOLEAN.y));
        }
        a = arrayList;
        ArrayList arrayList2 = new ArrayList(et0.e0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((iz6) it.next()).e);
        }
        b = arrayList2;
        ArrayList arrayList3 = a;
        ArrayList arrayList4 = new ArrayList(et0.e0(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((iz6) it2.next()).b.b());
        }
        String concat = "java/util/".concat("Collection");
        zo3 zo3 = zo3.BOOLEAN;
        String str = zo3.y;
        String str2 = zo3.y;
        iz6 i3 = ts2.i(concat, "contains", "Ljava/lang/Object;", str);
        lz6 lz6 = lz6.z;
        yb5 yb5 = new yb5(i3, lz6);
        yb5 yb52 = new yb5(ts2.i("java/util/".concat("Collection"), "remove", "Ljava/lang/Object;", str2), lz6);
        yb5 yb53 = new yb5(ts2.i("java/util/".concat("Map"), "containsKey", "Ljava/lang/Object;", str2), lz6);
        yb5 yb54 = new yb5(ts2.i("java/util/".concat("Map"), "containsValue", "Ljava/lang/Object;", str2), lz6);
        yb5 yb55 = new yb5(ts2.i("java/util/".concat("Map"), "remove", "Ljava/lang/Object;Ljava/lang/Object;", str2), lz6);
        yb5 yb56 = new yb5(ts2.i("java/util/".concat("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), lz6.A);
        iz6 i4 = ts2.i("java/util/".concat("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        lz6 lz62 = lz6.x;
        yb5 yb57 = new yb5(i4, lz62);
        yb5 yb58 = new yb5(ts2.i("java/util/".concat("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), lz62);
        String concat2 = "java/util/".concat("List");
        zo3 zo32 = zo3.INT;
        String str3 = "remove";
        iz6 i5 = ts2.i(concat2, "indexOf", "Ljava/lang/Object;", zo32.y);
        lz6 lz63 = lz6.y;
        Map V = sf4.V(yb5, yb52, yb53, yb54, yb55, yb56, yb57, yb58, new yb5(i5, lz63), new yb5(ts2.i("java/util/".concat("List"), "lastIndexOf", "Ljava/lang/Object;", zo32.y), lz63));
        c = V;
        LinkedHashMap linkedHashMap = new LinkedHashMap(tf4.F(V.size()));
        for (Map.Entry entry : V.entrySet()) {
            linkedHashMap.put(((iz6) entry.getKey()).e, entry.getValue());
        }
        d = linkedHashMap;
        LinkedHashSet<iz6> o = wn6.o(c.keySet(), a);
        ArrayList arrayList5 = new ArrayList(et0.e0(o, 10));
        for (iz6 iz6 : o) {
            arrayList5.add(iz6.b);
        }
        e = dt0.g1(arrayList5);
        ArrayList arrayList6 = new ArrayList(et0.e0(o, 10));
        for (iz6 iz62 : o) {
            arrayList6.add(iz62.e);
        }
        f = dt0.g1(arrayList6);
        zo3 zo33 = zo3.INT;
        String str4 = zo33.y;
        String str5 = zo33.y;
        iz6 i6 = ts2.i("java/util/List", "removeAt", str4, "Ljava/lang/Object;");
        g = i6;
        yb5 yb59 = new yb5(ts2.h("java/lang/".concat("Number"), m75.w, zo3.BYTE.y), uq4.e("byteValue"));
        yb5 yb510 = new yb5(ts2.h("java/lang/".concat("Number"), m75.v, zo3.SHORT.y), uq4.e("shortValue"));
        yb5 yb511 = new yb5(ts2.h("java/lang/".concat("Number"), m75.u, str5), uq4.e("intValue"));
        yb5 yb512 = new yb5(ts2.h("java/lang/".concat("Number"), m75.t, zo3.LONG.y), uq4.e("longValue"));
        yb5 yb513 = new yb5(ts2.h("java/lang/".concat("Number"), m75.s, zo3.FLOAT.y), uq4.e("floatValue"));
        yb5 yb514 = new yb5(ts2.h("java/lang/".concat("Number"), m75.r, zo3.DOUBLE.y), uq4.e("doubleValue"));
        String str6 = "get";
        yb5 yb515 = yb514;
        yb5 yb516 = yb59;
        yb5 yb517 = yb510;
        String str7 = "addAndGet";
        yb5 yb518 = new yb5(ts2.i("java/util/concurrent/atomic/".concat("AtomicInteger"), "fetchAndAdd", "I", "I"), uq4.e("getAndAdd"));
        yb5 yb519 = new yb5(ts2.i("java/util/concurrent/atomic/".concat("AtomicInteger"), "addAndFetch", "I", "I"), uq4.e(str7));
        yb5 yb520 = yb511;
        yb5 yb521 = yb512;
        yb5 yb522 = new yb5(ts2.i("java/util/concurrent/atomic/".concat("AtomicLong"), "load", "", "J"), uq4.e(str6));
        yb5 yb523 = new yb5(ts2.i("java/util/concurrent/atomic/".concat("AtomicLong"), "store", "J", "V"), uq4.e("set"));
        yb5 yb524 = new yb5(ts2.i("java/util/concurrent/atomic/".concat("AtomicLong"), "exchange", "J", "J"), uq4.e("getAndSet"));
        yb5 yb525 = new yb5(ts2.i("java/util/concurrent/atomic/".concat("AtomicLong"), "fetchAndAdd", "J", "J"), uq4.e("getAndAdd"));
        yb5 yb526 = new yb5(ts2.i("java/util/concurrent/atomic/".concat("AtomicLong"), "addAndFetch", "J", "J"), uq4.e(str7));
        yb5 yb527 = yb525;
        yb5 yb528 = new yb5(ts2.i("java/util/concurrent/atomic/".concat("AtomicBoolean"), "load", "", "Z"), uq4.e(str6));
        yb5 yb529 = new yb5(ts2.i("java/util/concurrent/atomic/".concat("AtomicBoolean"), "store", "Z", "V"), uq4.e("set"));
        yb5 yb530 = new yb5(ts2.i("java/util/concurrent/atomic/".concat("AtomicBoolean"), "exchange", "Z", "Z"), uq4.e("getAndSet"));
        yb5 yb531 = new yb5(ts2.i("java/util/concurrent/atomic/".concat("AtomicReference"), "load", "", "Ljava/lang/Object;"), uq4.e(str6));
        yb5 yb532 = new yb5(ts2.i("java/util/concurrent/atomic/".concat("AtomicReference"), "store", "Ljava/lang/Object;", "V"), uq4.e("set"));
        yb5 yb533 = new yb5(ts2.i("java/util/concurrent/atomic/".concat("AtomicReference"), "exchange", "Ljava/lang/Object;", "Ljava/lang/Object;"), uq4.e("getAndSet"));
        yb5 yb534 = yb530;
        yb5 yb535 = new yb5(ts2.i("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "loadAt", "I", "I"), uq4.e(str6));
        yb5 yb536 = yb524;
        yb5 yb537 = new yb5(ts2.i("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "storeAt", "II", "V"), uq4.e("set"));
        yb5 yb538 = yb513;
        yb5 yb539 = new yb5(ts2.i("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "exchangeAt", "II", "I"), uq4.e("getAndSet"));
        String str8 = "compareAndSet";
        yb5 yb540 = new yb5(ts2.i("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "compareAndSetAt", "III", "Z"), uq4.e(str8));
        yb5 yb541 = yb531;
        yb5 yb542 = new yb5(ts2.i("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "fetchAndAddAt", "II", "I"), uq4.e("getAndAdd"));
        yb5 yb543 = new yb5(ts2.i("java/util/concurrent/atomic/".concat("AtomicLongArray"), "loadAt", "I", "J"), uq4.e(str6));
        yb5 yb544 = new yb5(ts2.i("java/util/concurrent/atomic/".concat("AtomicLongArray"), "storeAt", "IJ", "V"), uq4.e("set"));
        yb5 yb545 = new yb5(ts2.i("java/util/concurrent/atomic/".concat("AtomicLongArray"), "exchangeAt", "IJ", "J"), uq4.e("getAndSet"));
        yb5 yb546 = new yb5(ts2.i("java/util/concurrent/atomic/".concat("AtomicLongArray"), "compareAndSetAt", "IJJ", "Z"), uq4.e(str8));
        yb5 yb547 = new yb5(ts2.i("java/util/concurrent/atomic/".concat("AtomicLongArray"), "fetchAndAddAt", "IJ", "J"), uq4.e("getAndAdd"));
        yb5 yb548 = new yb5(ts2.i("java/util/concurrent/atomic/".concat("AtomicLongArray"), "addAndFetchAt", "IJ", "J"), uq4.e(str7));
        yb5 yb549 = new yb5(ts2.i("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "loadAt", "I", "Ljava/lang/Object;"), uq4.e(str6));
        yb5 yb550 = yb547;
        yb5 yb551 = yb517;
        yb5 yb552 = yb520;
        yb5 yb553 = yb521;
        yb5 yb554 = yb522;
        yb5 yb555 = yb523;
        yb5 yb556 = yb536;
        yb5 yb557 = yb538;
        yb5 yb558 = yb532;
        yb5 yb559 = yb540;
        yb5 yb560 = yb541;
        yb5 yb561 = new yb5(ts2.i("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "addAndFetchAt", "II", "I"), uq4.e(str7));
        yb5 yb562 = yb542;
        yb5 yb563 = yb543;
        yb5 yb564 = yb544;
        yb5 yb565 = yb545;
        yb5 yb566 = yb546;
        yb5 yb567 = yb548;
        yb5 yb568 = yb549;
        Map V2 = sf4.V(yb516, yb551, yb552, yb553, yb557, yb515, new yb5(i6, uq4.e(str3)), new yb5(ts2.i("java/lang/".concat("CharSequence"), "get", str5, zo3.CHAR.y), uq4.e("charAt")), new yb5(ts2.i("java/util/concurrent/atomic/".concat("AtomicInteger"), "load", "", "I"), uq4.e("get")), new yb5(ts2.i("java/util/concurrent/atomic/".concat("AtomicInteger"), "store", "I", "V"), uq4.e("set")), new yb5(ts2.i("java/util/concurrent/atomic/".concat("AtomicInteger"), "exchange", "I", "I"), uq4.e("getAndSet")), yb518, yb519, yb554, yb555, yb556, yb527, yb526, yb528, yb529, yb534, yb560, yb558, yb533, yb535, yb537, yb539, yb559, yb562, yb561, yb563, yb564, yb565, yb566, yb550, yb567, yb568, new yb5(ts2.i("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "storeAt", "ILjava/lang/Object;", "V"), uq4.e("set")), new yb5(ts2.i("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "exchangeAt", "ILjava/lang/Object;", "Ljava/lang/Object;"), uq4.e("getAndSet")), new yb5(ts2.i("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "compareAndSetAt", "ILjava/lang/Object;Ljava/lang/Object;", "Z"), uq4.e(str8)));
        h = V2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(tf4.F(V2.size()));
        for (Map.Entry entry2 : V2.entrySet()) {
            linkedHashMap2.put(((iz6) entry2.getKey()).e, entry2.getValue());
        }
        i = linkedHashMap2;
        Map map = h;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : map.entrySet()) {
            iz6 iz63 = (iz6) entry3.getKey();
            uq4 uq4 = (uq4) entry3.getValue();
            String str9 = iz63.a;
            String str10 = iz63.c;
            String str11 = iz63.d;
            uq4.getClass();
            linkedHashSet.add(str9 + '.' + (uq4 + '(' + str10 + ')' + str11));
        }
        HashSet hashSet = new HashSet();
        for (iz6 iz64 : h.keySet()) {
            hashSet.add(iz64.b);
        }
        j = hashSet;
        Iterable<Map.Entry> entrySet = h.entrySet();
        ArrayList arrayList7 = new ArrayList(et0.e0(entrySet, 10));
        for (Map.Entry entry4 : entrySet) {
            arrayList7.add(new yb5(((iz6) entry4.getKey()).b, entry4.getValue()));
        }
        int F = tf4.F(et0.e0(arrayList7, 10));
        if (F < 16) {
            F = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(F);
        Iterator it3 = arrayList7.iterator();
        while (it3.hasNext()) {
            yb5 yb569 = (yb5) it3.next();
            linkedHashMap3.put((uq4) yb569.x, (uq4) yb569.w);
        }
        k = linkedHashMap3;
    }
}
