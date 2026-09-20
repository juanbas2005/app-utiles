package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: p52  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class p52 implements Set, ar3 {
    public final /* synthetic */ int w;
    public final tp4 x;

    public p52(tp4 tp4, int i) {
        this.w = i;
        tp4.getClass();
        switch (i) {
            case 1:
                this.x = tp4;
                return;
            default:
                this.x = tp4;
                return;
        }
    }

    public final boolean add(Object obj) {
        switch (this.w) {
            case b85.b:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final boolean addAll(Collection collection) {
        switch (this.w) {
            case b85.b:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final void clear() {
        switch (this.w) {
            case b85.b:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final boolean contains(Object obj) {
        int i = this.w;
        tp4 tp4 = this.x;
        switch (i) {
            case b85.b:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return sg3.e(tp4.g(entry.getKey()), entry.getValue());
            default:
                return tp4.c(obj);
        }
    }

    public final boolean containsAll(Collection collection) {
        int i = this.w;
        tp4 tp4 = this.x;
        collection.getClass();
        switch (i) {
            case b85.b:
                Iterable<Map.Entry> iterable = collection;
                if (!((Collection) iterable).isEmpty()) {
                    for (Map.Entry entry : iterable) {
                        if (!sg3.e(tp4.g(entry.getKey()), entry.getValue())) {
                            return false;
                        }
                    }
                }
                return true;
            default:
                Iterable<Object> iterable2 = collection;
                if (!((Collection) iterable2).isEmpty()) {
                    for (Object c : iterable2) {
                        if (!tp4.c(c)) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    public final boolean isEmpty() {
        switch (this.w) {
            case b85.b:
                return this.x.i();
            default:
                return this.x.i();
        }
    }

    public final Iterator iterator() {
        switch (this.w) {
            case b85.b:
                return t75.y(new o52(this, (f61) null, 0));
            default:
                return t75.y(new o52(this, (f61) null, 1));
        }
    }

    public final boolean remove(Object obj) {
        switch (this.w) {
            case b85.b:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final boolean removeAll(Collection collection) {
        switch (this.w) {
            case b85.b:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final boolean retainAll(Collection collection) {
        switch (this.w) {
            case b85.b:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final int size() {
        switch (this.w) {
            case b85.b:
                return this.x.e;
            default:
                return this.x.e;
        }
    }

    public final Object[] toArray(Object[] objArr) {
        switch (this.w) {
            case b85.b:
                objArr.getClass();
                return rc9.X0(this, objArr);
            default:
                objArr.getClass();
                return rc9.X0(this, objArr);
        }
    }

    public final Object[] toArray() {
        switch (this.w) {
            case b85.b:
                return rc9.W0(this);
            default:
                return rc9.W0(this);
        }
    }
}
