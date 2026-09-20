package defpackage;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: lv6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lv6 extends AbstractMap {
    public static final /* synthetic */ int C = 0;
    public volatile ds A;
    public Map B;
    public final int w;
    public List x = Collections.EMPTY_LIST;
    public Map y;
    public boolean z;

    public lv6(int i) {
        this.w = i;
        Map map = Collections.EMPTY_MAP;
        this.y = map;
        this.B = map;
    }

    public final int a(Comparable comparable) {
        int i;
        int size = this.x.size();
        int i2 = size - 1;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((pv6) this.x.get(i2)).w);
            if (compareTo > 0) {
                i = size + 1;
                return -i;
            } else if (compareTo == 0) {
                return i2;
            }
        }
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = comparable.compareTo(((pv6) this.x.get(i4)).w);
            if (compareTo2 < 0) {
                i2 = i4 - 1;
            } else if (compareTo2 <= 0) {
                return i4;
            } else {
                i3 = i4 + 1;
            }
        }
        i = i3 + 1;
        return -i;
    }

    public final void b() {
        if (this.z) {
            ku4.p();
        }
    }

    public final Map.Entry c(int i) {
        return (Map.Entry) this.x.get(i);
    }

    public final void clear() {
        b();
        if (!this.x.isEmpty()) {
            this.x.clear();
        }
        if (!this.y.isEmpty()) {
            this.y.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (a(comparable) >= 0 || this.y.containsKey(comparable)) {
            return true;
        }
        return false;
    }

    public final Iterable e() {
        if (this.y.isEmpty()) {
            return fd1.i;
        }
        return this.y.entrySet();
    }

    public final Set entrySet() {
        if (this.A == null) {
            this.A = new ds(1, this);
        }
        return this.A;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lv6)) {
            return super.equals(obj);
        }
        lv6 lv6 = (lv6) obj;
        int size = size();
        if (size == lv6.size()) {
            int size2 = this.x.size();
            if (size2 != lv6.x.size()) {
                return ((AbstractSet) entrySet()).equals(lv6.entrySet());
            }
            int i = 0;
            while (i < size2) {
                if (c(i).equals(lv6.c(i))) {
                    i++;
                }
            }
            if (size2 != size) {
                return this.y.equals(lv6.y);
            }
            return true;
        }
        return false;
    }

    public final SortedMap f() {
        b();
        if (this.y.isEmpty() && !(this.y instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.y = treeMap;
            this.B = treeMap.descendingMap();
        }
        return (SortedMap) this.y;
    }

    /* renamed from: g */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int a = a(comparable);
        if (a >= 0) {
            return ((pv6) this.x.get(a)).setValue(obj);
        }
        b();
        boolean isEmpty = this.x.isEmpty();
        int i = this.w;
        if (isEmpty && !(this.x instanceof ArrayList)) {
            this.x = new ArrayList(i);
        }
        int i2 = -(a + 1);
        if (i2 >= i) {
            return f().put(comparable, obj);
        }
        if (this.x.size() == i) {
            pv6 pv6 = (pv6) this.x.remove(i - 1);
            f().put(pv6.w, pv6.x);
        }
        this.x.add(i2, new pv6(this, comparable, obj));
        return null;
    }

    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        if (a >= 0) {
            return ((pv6) this.x.get(a)).x;
        }
        return this.y.get(comparable);
    }

    public final Object h(int i) {
        b();
        Object obj = ((pv6) this.x.remove(i)).x;
        if (!this.y.isEmpty()) {
            Iterator it = f().entrySet().iterator();
            List list = this.x;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new pv6(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    public final int hashCode() {
        int size = this.x.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((pv6) this.x.get(i2)).hashCode();
        }
        if (this.y.size() > 0) {
            return this.y.hashCode() + i;
        }
        return i;
    }

    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        if (a >= 0) {
            return h(a);
        }
        if (this.y.isEmpty()) {
            return null;
        }
        return this.y.remove(comparable);
    }

    public final int size() {
        return this.y.size() + this.x.size();
    }
}
