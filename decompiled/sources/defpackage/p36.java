package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: p36  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class p36 extends v93 {
    public static final p36 D = new p36(i36.A, er4.w);
    public final transient q93 C;

    static {
        m93 m93 = q93.x;
    }

    public p36(q93 q93, Comparator comparator) {
        super(comparator);
        this.C = q93;
    }

    public final Object ceiling(Object obj) {
        int z = z(obj, true);
        q93 q93 = this.C;
        if (z == q93.size()) {
            return null;
        }
        return q93.get(z);
    }

    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.C, obj, this.z) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public final boolean containsAll(Collection collection) {
        if (collection instanceof mo4) {
            collection = ((mo4) collection).h();
        }
        Comparator comparator = this.z;
        if (!z65.E(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        at7 o = o();
        Iterator it = collection.iterator();
        m93 m93 = (m93) o;
        if (!m93.hasNext()) {
            return false;
        }
        Object next = it.next();
        Object next2 = m93.next();
        while (true) {
            try {
                int compare = comparator.compare(next2, next);
                if (compare < 0) {
                    if (!m93.hasNext()) {
                        return false;
                    }
                    next2 = m93.next();
                } else if (compare == 0) {
                    if (!it.hasNext()) {
                        return true;
                    }
                    next = it.next();
                } else if (compare > 0) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }
    }

    public final q93 d() {
        return this.C;
    }

    public final Iterator descendingIterator() {
        return this.C.x().listIterator(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a A[Catch:{ ClassCastException | NoSuchElementException -> 0x004d }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004b A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (this.C.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        Comparator comparator = this.z;
        if (!z65.E(comparator, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            at7 o = o();
            do {
                m93 m93 = (m93) o;
                if (!m93.hasNext()) {
                    next = m93.next();
                    next2 = it.next();
                    if (next2 == null || comparator.compare(next, next2) != 0) {
                        return false;
                    }
                    m93 m932 = (m93) o;
                    if (!m932.hasNext()) {
                        return true;
                    }
                }
            } while (comparator.compare(next, next2) != 0);
            return false;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    public final int f(Object[] objArr) {
        return this.C.f(objArr);
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.C.get(0);
        }
        rf2.c();
        return null;
    }

    public final Object floor(Object obj) {
        int y = y(obj, true) - 1;
        if (y == -1) {
            return null;
        }
        return this.C.get(y);
    }

    public final Object[] g() {
        return this.C.g();
    }

    public final Object higher(Object obj) {
        int z = z(obj, false);
        q93 q93 = this.C;
        if (z == q93.size()) {
            return null;
        }
        return q93.get(z);
    }

    public final int k() {
        return this.C.k();
    }

    public final int l() {
        return this.C.l();
    }

    public final Object last() {
        if (!isEmpty()) {
            q93 q93 = this.C;
            return q93.get(q93.size() - 1);
        }
        rf2.c();
        return null;
    }

    public final Object lower(Object obj) {
        int y = y(obj, false) - 1;
        if (y == -1) {
            return null;
        }
        return this.C.get(y);
    }

    public final boolean n() {
        return this.C.n();
    }

    public final at7 o() {
        return this.C.listIterator(0);
    }

    public final int size() {
        return this.C.size();
    }

    public final p36 x(int i, int i2) {
        q93 q93 = this.C;
        if (i == 0 && i2 == q93.size()) {
            return this;
        }
        Comparator comparator = this.z;
        if (i < i2) {
            return new p36(q93.subList(i, i2), comparator);
        }
        if (er4.w != comparator) {
            return new p36(i36.A, comparator);
        }
        return D;
    }

    public final int y(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.C, obj, this.z);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        if (z) {
            return binarySearch + 1;
        }
        return binarySearch;
    }

    public final int z(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.C, obj, this.z);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        if (z) {
            return binarySearch;
        }
        return binarySearch + 1;
    }
}
