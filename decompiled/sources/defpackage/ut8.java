package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: ut8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ut8 extends nt8 implements NavigableMap {
    public static final ut8 B;
    public final transient ut8 A;
    public final transient qu8 y;
    public final transient mt8 z;

    static {
        qu8 z2 = wt8.z(hu8.x);
        vs8 vs8 = mt8.A;
        B = new ut8(z2, nu8.D, (ut8) null);
    }

    public ut8(qu8 qu8, mt8 mt8, ut8 ut8) {
        this.y = qu8;
        this.z = mt8;
        this.A = ut8;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: java.util.Set} */
    /* JADX WARNING: Multi-variable type inference failed */
    public static ut8 b(TreeMap treeMap) {
        boolean z2;
        hu8 hu8 = hu8.x;
        Comparator comparator = treeMap.comparator();
        int i = 1;
        int i2 = 0;
        if (comparator == null || hu8 == comparator) {
            z2 = true;
        } else {
            z2 = false;
        }
        Set entrySet = treeMap.entrySet();
        if (!(entrySet instanceof Collection)) {
            Iterator it = entrySet.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            entrySet = arrayList;
        }
        Map.Entry[] entryArr = (Map.Entry[]) entrySet.toArray(nt8.x);
        int length = entryArr.length;
        if (length == 0) {
            return c(hu8);
        }
        if (length != 1) {
            Object[] objArr = new Object[length];
            Object[] objArr2 = new Object[length];
            if (z2) {
                while (i2 < length) {
                    Map.Entry entry = entryArr[i2];
                    Objects.requireNonNull(entry);
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    i75.r(key, value);
                    objArr[i2] = key;
                    objArr2[i2] = value;
                    i2++;
                }
            } else {
                Arrays.sort(entryArr, 0, length, new zf8(5));
                Map.Entry entry2 = entryArr[0];
                Objects.requireNonNull(entry2);
                Object key2 = entry2.getKey();
                objArr[0] = key2;
                Object value2 = entry2.getValue();
                objArr2[0] = value2;
                i75.r(objArr[0], value2);
                while (i < length) {
                    Map.Entry entry3 = entryArr[i - 1];
                    Objects.requireNonNull(entry3);
                    Map.Entry entry4 = entryArr[i];
                    Objects.requireNonNull(entry4);
                    Object key3 = entry4.getKey();
                    Object value3 = entry4.getValue();
                    i75.r(key3, value3);
                    objArr[i] = key3;
                    objArr2[i] = value3;
                    if (hu8.compare(key2, key3) != 0) {
                        i++;
                        key2 = key3;
                    } else {
                        throw new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(entry3) + " and " + String.valueOf(entry4));
                    }
                }
            }
            return new ut8(new qu8(mt8.x(length, objArr), hu8), mt8.x(length, objArr2), (ut8) null);
        }
        Map.Entry entry5 = entryArr[0];
        Objects.requireNonNull(entry5);
        Object key4 = entry5.getKey();
        Object value4 = entry5.getValue();
        Object[] objArr3 = {key4};
        int i3 = 0;
        while (i3 < 1) {
            if (objArr3[i3] != null) {
                i3++;
            } else {
                ku4.j(hl6.k(i3, "at index "));
                return null;
            }
        }
        qu8 qu8 = new qu8(mt8.x(1, objArr3), hu8);
        Object[] objArr4 = {value4};
        while (i2 < 1) {
            if (objArr4[i2] != null) {
                i2++;
            } else {
                ku4.j(hl6.k(i2, "at index "));
                return null;
            }
        }
        return new ut8(qu8, mt8.x(1, objArr4), (ut8) null);
    }

    public static ut8 c(Comparator comparator) {
        if (hu8.x == comparator) {
            return B;
        }
        qu8 z2 = wt8.z(comparator);
        vs8 vs8 = mt8.A;
        return new ut8(z2, nu8.D, (ut8) null);
    }

    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    public final Object ceilingKey(Object obj) {
        Map.Entry ceilingEntry = ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return ceilingEntry.getKey();
    }

    public final Comparator comparator() {
        return this.y.C;
    }

    public final /* synthetic */ NavigableSet descendingKeySet() {
        return this.y.descendingSet();
    }

    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        lu8 lu8;
        ut8 ut8 = this.A;
        if (ut8 != null) {
            return ut8;
        }
        boolean isEmpty = isEmpty();
        qu8 qu8 = this.y;
        if (!isEmpty) {
            return new ut8((qu8) qu8.descendingSet(), this.z.v(), this);
        }
        Comparator comparator = qu8.C;
        if (comparator instanceof lu8) {
            lu8 = (lu8) comparator;
        } else {
            lu8 = new rs8(comparator);
        }
        return c(lu8.a());
    }

    /* renamed from: e */
    public final ut8 headMap(Object obj, boolean z2) {
        obj.getClass();
        return h(0, this.y.A(obj, z2));
    }

    /* renamed from: f */
    public final ut8 subMap(Object obj, boolean z2, Object obj2, boolean z3) {
        obj.getClass();
        obj2.getClass();
        if (this.y.C.compare(obj, obj2) <= 0) {
            return headMap(obj2, z3).tailMap(obj, z2);
        }
        h.q(h75.J("expected fromKey <= toKey but %s > %s", obj, obj2));
        return null;
    }

    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().v().get(0);
    }

    public final Object firstKey() {
        return this.y.first();
    }

    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    public final Object floorKey(Object obj) {
        Map.Entry floorEntry = floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return floorEntry.getKey();
    }

    /* renamed from: g */
    public final ut8 tailMap(Object obj, boolean z2) {
        obj.getClass();
        return h(this.y.B(obj, z2), this.z.size());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        if (r4 < 0) goto L_0x0005;
     */
    public final Object get(Object obj) {
        int i;
        qu8 qu8 = this.y;
        if (obj != null) {
            try {
                i = Collections.binarySearch(qu8.E, obj, qu8.C);
            } catch (ClassCastException unused) {
            }
        }
        i = -1;
        if (i == -1) {
            return null;
        }
        return this.z.get(i);
    }

    public final ut8 h(int i, int i2) {
        mt8 mt8 = this.z;
        if (i == 0) {
            if (i2 == mt8.size()) {
                return this;
            }
            i = 0;
        }
        qu8 qu8 = this.y;
        if (i == i2) {
            return c(qu8.C);
        }
        return new ut8(qu8.C(i, i2), mt8.subList(i, i2), (ut8) null);
    }

    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    public final Object higherKey(Object obj) {
        Map.Entry higherEntry = higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return higherEntry.getKey();
    }

    public final /* synthetic */ Set keySet() {
        return this.y;
    }

    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().v().get(this.z.size() - 1);
    }

    public final Object lastKey() {
        return this.y.last();
    }

    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    public final Object lowerKey(Object obj) {
        Map.Entry lowerEntry = lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return lowerEntry.getKey();
    }

    public final /* synthetic */ NavigableSet navigableKeySet() {
        return this.y;
    }

    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    public final int size() {
        return this.z.size();
    }

    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    public final /* synthetic */ Collection values() {
        return this.z;
    }
}
