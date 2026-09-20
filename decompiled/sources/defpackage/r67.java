package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* renamed from: r67  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class r67 implements Collection, ar3 {
    public final /* synthetic */ int w;
    public final Object x;

    public r67() {
        this.w = 0;
        this.x = x75.a();
    }

    public final boolean add(Object obj) {
        switch (this.w) {
            case b85.b:
                return ((mp4) this.x).a(obj);
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
                ((mp4) this.x).b();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final boolean contains(Object obj) {
        switch (this.w) {
            case b85.b:
                return ((mp4) this.x).c(obj);
            default:
                return ((tp4) this.x).d(obj);
        }
    }

    public final boolean containsAll(Collection collection) {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case b85.b:
                for (Object c : collection) {
                    if (!((mp4) obj).c(c)) {
                        return false;
                    }
                }
                return true;
            default:
                collection.getClass();
                Iterable<Object> iterable = collection;
                if (!((Collection) iterable).isEmpty()) {
                    for (Object d : iterable) {
                        if (!((tp4) obj).d(d)) {
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
                if (((mp4) this.x).g == 0) {
                    return true;
                }
                return false;
            default:
                return ((tp4) this.x).i();
        }
    }

    public final Iterator iterator() {
        switch (this.w) {
            case b85.b:
                mp4 mp4 = (mp4) this.x;
                mp4.getClass();
                return new bv2(new op4(mp4));
            default:
                return t75.y(new o52(this, (f61) null, 3));
        }
    }

    public final boolean remove(Object obj) {
        switch (this.w) {
            case b85.b:
                return ((mp4) this.x).h(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final boolean removeAll(Collection collection) {
        switch (this.w) {
            case b85.b:
                return ((mp4) this.x).h(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final boolean removeIf(Predicate predicate) {
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
                return ((mp4) this.x).j(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final int size() {
        switch (this.w) {
            case b85.b:
                return ((mp4) this.x).g;
            default:
                return ((tp4) this.x).e;
        }
    }

    public final Object[] toArray(Object[] objArr) {
        switch (this.w) {
            case b85.b:
                return rc9.X0(this, objArr);
            default:
                objArr.getClass();
                return rc9.X0(this, objArr);
        }
    }

    public r67(tp4 tp4) {
        this.w = 1;
        tp4.getClass();
        this.x = tp4;
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
