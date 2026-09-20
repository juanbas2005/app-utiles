package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: o2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class o2 extends h2 {
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final boolean containsAll(Collection collection) {
        Iterable<Object> iterable = collection;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object contains : iterable) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public abstract o2 g(int i, Object obj);

    public final Iterator iterator() {
        return listIterator(0);
    }

    public abstract o2 k(Object obj);

    public o2 l(Collection collection) {
        hg5 n = n();
        n.addAll(collection);
        return n.k();
    }

    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public abstract hg5 n();

    public abstract o2 o(n2 n2Var);

    public abstract o2 p(int i);

    public abstract o2 s(int i, Object obj);

    public final List subList(int i, int i2) {
        return new p93(this, i, i2);
    }
}
