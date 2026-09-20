package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: qu8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qu8 extends wt8 {
    public static final qu8 F = new qu8(nu8.D, hu8.x);
    public final transient mt8 E;

    static {
        vs8 vs8 = mt8.A;
    }

    public qu8(mt8 mt8, Comparator comparator) {
        super(comparator);
        this.E = mt8;
    }

    public final int A(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.E, obj, this.C);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        if (z) {
            return binarySearch + 1;
        }
        return binarySearch;
    }

    public final int B(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.E, obj, this.C);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        if (z) {
            return binarySearch;
        }
        return binarySearch + 1;
    }

    public final qu8 C(int i, int i2) {
        mt8 mt8 = this.E;
        if (i == 0) {
            if (i2 == mt8.size()) {
                return this;
            }
            i = 0;
        }
        Comparator comparator = this.C;
        if (i < i2) {
            return new qu8(mt8.subList(i, i2), comparator);
        }
        return wt8.z(comparator);
    }

    public final Object ceiling(Object obj) {
        int B = B(obj, true);
        mt8 mt8 = this.E;
        if (B == mt8.size()) {
            return null;
        }
        return mt8.get(B);
    }

    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.E, obj, this.C) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public final boolean containsAll(Collection collection) {
        if (collection instanceof eu8) {
            collection = ((eu8) collection).a();
        }
        Comparator comparator = this.C;
        if (!b85.x(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        vs8 z = this.E.listIterator(0);
        Iterator it = collection.iterator();
        if (z.hasNext()) {
            Object next = it.next();
            Object next2 = z.next();
            while (true) {
                try {
                    int compare = comparator.compare(next2, next);
                    if (compare >= 0) {
                        if (compare != 0) {
                            break;
                        } else if (!it.hasNext()) {
                            return true;
                        } else {
                            next = it.next();
                        }
                    } else if (!z.hasNext()) {
                        break;
                    } else {
                        next2 = z.next();
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
        }
        return false;
    }

    public final int d(Object[] objArr) {
        return this.E.d(objArr);
    }

    public final Iterator descendingIterator() {
        return this.E.v().listIterator(0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            mt8 mt8 = this.E;
            if (mt8.size() == set.size()) {
                if (isEmpty()) {
                    return true;
                }
                Comparator comparator = this.C;
                if (!b85.x(comparator, set)) {
                    return containsAll(set);
                }
                Iterator it = set.iterator();
                try {
                    vs8 z = mt8.listIterator(0);
                    while (z.hasNext()) {
                        Object next = z.next();
                        Object next2 = it.next();
                        if (next2 != null) {
                            if (comparator.compare(next, next2) != 0) {
                            }
                        }
                    }
                    return true;
                } catch (ClassCastException | NoSuchElementException unused) {
                }
            }
        }
        return false;
    }

    public final int f() {
        return this.E.f();
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.E.get(0);
        }
        rf2.c();
        return null;
    }

    public final Object floor(Object obj) {
        int A = A(obj, true) - 1;
        if (A == -1) {
            return null;
        }
        return this.E.get(A);
    }

    public final Object higher(Object obj) {
        int B = B(obj, false);
        mt8 mt8 = this.E;
        if (B == mt8.size()) {
            return null;
        }
        return mt8.get(B);
    }

    public final /* synthetic */ Iterator iterator() {
        return this.E.listIterator(0);
    }

    public final int k() {
        return this.E.k();
    }

    public final Object last() {
        if (!isEmpty()) {
            mt8 mt8 = this.E;
            return mt8.get(mt8.size() - 1);
        }
        rf2.c();
        return null;
    }

    public final Object lower(Object obj) {
        int A = A(obj, false) - 1;
        if (A == -1) {
            return null;
        }
        return this.E.get(A);
    }

    public final at7 n() {
        return this.E.listIterator(0);
    }

    public final Object[] p() {
        return this.E.p();
    }

    public final int size() {
        return this.E.size();
    }

    public final mt8 v() {
        return this.E;
    }
}
