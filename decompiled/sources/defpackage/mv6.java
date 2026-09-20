package defpackage;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: mv6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mv6 extends AbstractMap {
    public static final /* synthetic */ int B = 0;
    public volatile ds A;
    public final int w;
    public List x = Collections.EMPTY_LIST;
    public Map y = Collections.EMPTY_MAP;
    public boolean z;

    public mv6(int i) {
        this.w = i;
    }

    public final int a(Comparable comparable) {
        int i;
        int size = this.x.size();
        int i2 = size - 1;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((qv6) this.x.get(i2)).w);
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
            int compareTo2 = comparable.compareTo(((qv6) this.x.get(i4)).w);
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

    public final Iterable c() {
        if (this.y.isEmpty()) {
            return ed1.K;
        }
        return this.y.entrySet();
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

    public final SortedMap e() {
        b();
        if (this.y.isEmpty() && !(this.y instanceof TreeMap)) {
            this.y = new TreeMap();
        }
        return (SortedMap) this.y;
    }

    public final Set entrySet() {
        if (this.A == null) {
            this.A = new ds(2, this);
        }
        return this.A;
    }

    /* renamed from: f */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int a = a(comparable);
        if (a >= 0) {
            return ((qv6) this.x.get(a)).setValue(obj);
        }
        b();
        boolean isEmpty = this.x.isEmpty();
        int i = this.w;
        if (isEmpty && !(this.x instanceof ArrayList)) {
            this.x = new ArrayList(i);
        }
        int i2 = -(a + 1);
        if (i2 >= i) {
            return e().put(comparable, obj);
        }
        if (this.x.size() == i) {
            qv6 qv6 = (qv6) this.x.remove(i - 1);
            e().put(qv6.w, qv6.x);
        }
        this.x.add(i2, new qv6(this, comparable, obj));
        return null;
    }

    public final Object g(int i) {
        b();
        Object obj = ((qv6) this.x.remove(i)).x;
        if (!this.y.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.x;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new qv6(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        if (a >= 0) {
            return ((qv6) this.x.get(a)).x;
        }
        return this.y.get(comparable);
    }

    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        if (a >= 0) {
            return g(a);
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
