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

/* renamed from: nv6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nv6 extends AbstractMap {
    public static final /* synthetic */ int B = 0;
    public Map A;
    public List w;
    public Map x;
    public boolean y;
    public volatile ds z;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.AbstractMap, nv6] */
    public static nv6 g() {
        ? abstractMap = new AbstractMap();
        abstractMap.w = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        abstractMap.x = map;
        abstractMap.A = map;
        return abstractMap;
    }

    public final int a(Comparable comparable) {
        int i;
        int size = this.w.size();
        int i2 = size - 1;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((rv6) this.w.get(i2)).w);
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
            int compareTo2 = comparable.compareTo(((rv6) this.w.get(i4)).w);
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
        if (this.y) {
            ku4.p();
        }
    }

    public final Map.Entry c(int i) {
        return (Map.Entry) this.w.get(i);
    }

    public final void clear() {
        b();
        if (!this.w.isEmpty()) {
            this.w.clear();
        }
        if (!this.x.isEmpty()) {
            this.x.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (a(comparable) >= 0 || this.x.containsKey(comparable)) {
            return true;
        }
        return false;
    }

    public final Set e() {
        Set entrySet;
        if (this.x.isEmpty()) {
            entrySet = Collections.EMPTY_SET;
        } else {
            entrySet = this.x.entrySet();
        }
        return entrySet;
    }

    public final Set entrySet() {
        if (this.z == null) {
            this.z = new ds(3, this);
        }
        return this.z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nv6)) {
            return super.equals(obj);
        }
        nv6 nv6 = (nv6) obj;
        int size = size();
        if (size == nv6.size()) {
            int size2 = this.w.size();
            if (size2 != nv6.w.size()) {
                return ((AbstractSet) entrySet()).equals(nv6.entrySet());
            }
            int i = 0;
            while (i < size2) {
                if (c(i).equals(nv6.c(i))) {
                    i++;
                }
            }
            if (size2 != size) {
                return this.x.equals(nv6.x);
            }
            return true;
        }
        return false;
    }

    public final SortedMap f() {
        b();
        if (this.x.isEmpty() && !(this.x instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.x = treeMap;
            this.A = treeMap.descendingMap();
        }
        return (SortedMap) this.x;
    }

    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        if (a >= 0) {
            return ((rv6) this.w.get(a)).x;
        }
        return this.x.get(comparable);
    }

    /* renamed from: h */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int a = a(comparable);
        if (a >= 0) {
            return ((rv6) this.w.get(a)).setValue(obj);
        }
        b();
        if (this.w.isEmpty() && !(this.w instanceof ArrayList)) {
            this.w = new ArrayList(16);
        }
        int i = -(a + 1);
        if (i >= 16) {
            return f().put(comparable, obj);
        }
        if (this.w.size() == 16) {
            rv6 rv6 = (rv6) this.w.remove(15);
            f().put(rv6.w, rv6.x);
        }
        this.w.add(i, new rv6(this, comparable, obj));
        return null;
    }

    public final int hashCode() {
        int size = this.w.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((rv6) this.w.get(i2)).hashCode();
        }
        if (this.x.size() > 0) {
            return this.x.hashCode() + i;
        }
        return i;
    }

    public final Object i(int i) {
        b();
        Object obj = ((rv6) this.w.remove(i)).x;
        if (!this.x.isEmpty()) {
            Iterator it = f().entrySet().iterator();
            List list = this.w;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new rv6(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        if (a >= 0) {
            return i(a);
        }
        if (this.x.isEmpty()) {
            return null;
        }
        return this.x.remove(comparable);
    }

    public final int size() {
        return this.x.size() + this.w.size();
    }
}
