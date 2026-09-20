package defpackage;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: ym8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ym8 extends AbstractMap {
    public volatile ds A;
    public Map B;
    public Object[] w;
    public int x;
    public Map y;
    public boolean z;

    public ym8() {
        Map map = Collections.EMPTY_MAP;
        this.y = map;
        this.B = map;
    }

    public final zm8 a(int i) {
        if (i < this.x) {
            return (zm8) this.w[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final Set b() {
        Set entrySet;
        if (this.y.isEmpty()) {
            entrySet = Collections.EMPTY_SET;
        } else {
            entrySet = this.y.entrySet();
        }
        return entrySet;
    }

    /* renamed from: c */
    public final Object put(Comparable comparable, Object obj) {
        g();
        int f = f(comparable);
        if (f >= 0) {
            return ((zm8) this.w[f]).setValue(obj);
        }
        g();
        if (this.w == null) {
            this.w = new Object[16];
        }
        int i = -(f + 1);
        if (i >= 16) {
            return h().put(comparable, obj);
        }
        if (this.x == 16) {
            zm8 zm8 = (zm8) this.w[15];
            this.x = 15;
            h().put(zm8.w, zm8.x);
        }
        Object[] objArr = this.w;
        int length = objArr.length;
        System.arraycopy(objArr, i, objArr, i + 1, 15 - i);
        this.w[i] = new zm8(this, comparable, obj);
        this.x++;
        return null;
    }

    public final void clear() {
        g();
        if (this.x != 0) {
            this.w = null;
            this.x = 0;
        }
        if (!this.y.isEmpty()) {
            this.y.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (f(comparable) >= 0 || this.y.containsKey(comparable)) {
            return true;
        }
        return false;
    }

    public final Object e(int i) {
        g();
        Object[] objArr = this.w;
        Object obj = ((zm8) objArr[i]).x;
        System.arraycopy(objArr, i + 1, objArr, i, (this.x - i) - 1);
        this.x--;
        if (!this.y.isEmpty()) {
            Iterator it = h().entrySet().iterator();
            Object[] objArr2 = this.w;
            int i2 = this.x;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i2] = new zm8(this, (Comparable) entry.getKey(), entry.getValue());
            this.x++;
            it.remove();
        }
        return obj;
    }

    public final Set entrySet() {
        if (this.A == null) {
            this.A = new ds(4, this);
        }
        return this.A;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ym8)) {
            return super.equals(obj);
        }
        ym8 ym8 = (ym8) obj;
        int size = size();
        if (size == ym8.size()) {
            int i = this.x;
            if (i != ym8.x) {
                return entrySet().equals(ym8.entrySet());
            }
            int i2 = 0;
            while (i2 < i) {
                if (a(i2).equals(ym8.a(i2))) {
                    i2++;
                }
            }
            if (i != size) {
                return this.y.equals(ym8.y);
            }
            return true;
        }
        return false;
    }

    public final int f(Comparable comparable) {
        int i = this.x;
        int i2 = i - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((zm8) this.w[i2]).w);
            if (compareTo > 0) {
                return -(i + 1);
            }
            if (compareTo == 0) {
                return i2;
            }
        }
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = comparable.compareTo(((zm8) this.w[i4]).w);
            if (compareTo2 < 0) {
                i2 = i4 - 1;
            } else if (compareTo2 <= 0) {
                return i4;
            } else {
                i3 = i4 + 1;
            }
        }
        return -(i3 + 1);
    }

    public final void g() {
        if (this.z) {
            ku4.p();
        }
    }

    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int f = f(comparable);
        if (f >= 0) {
            return ((zm8) this.w[f]).x;
        }
        return this.y.get(comparable);
    }

    public final SortedMap h() {
        g();
        if (this.y.isEmpty() && !(this.y instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.y = treeMap;
            this.B = treeMap.descendingMap();
        }
        return (SortedMap) this.y;
    }

    public final int hashCode() {
        int i = this.x;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += this.w[i3].hashCode();
        }
        if (this.y.size() > 0) {
            return this.y.hashCode() + i2;
        }
        return i2;
    }

    public final Object remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int f = f(comparable);
        if (f >= 0) {
            return e(f);
        }
        if (this.y.isEmpty()) {
            return null;
        }
        return this.y.remove(comparable);
    }

    public final int size() {
        return this.y.size() + this.x;
    }
}
