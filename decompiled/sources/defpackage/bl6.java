package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: bl6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bl6 implements Iterator, f61, ar3 {
    public int w;
    public Object x;
    public Iterator y;
    public f61 z;

    public final RuntimeException b() {
        int i = this.w;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.w);
    }

    public final void c(f61 f61, Object obj) {
        this.x = obj;
        this.w = 3;
        this.z = f61;
        f61.getClass();
    }

    public final void f(Object obj) {
        o85.q(obj);
        this.w = 4;
    }

    public final boolean hasNext() {
        while (true) {
            int i = this.w;
            if (i != 0) {
                if (i == 1) {
                    Iterator it = this.y;
                    it.getClass();
                    if (it.hasNext()) {
                        this.w = 2;
                        return true;
                    }
                    this.y = null;
                } else if (i == 2 || i == 3) {
                    return true;
                } else {
                    if (i == 4) {
                        return false;
                    }
                    throw b();
                }
            }
            this.w = 5;
            f61 f61 = this.z;
            f61.getClass();
            this.z = null;
            f61.f(vs7.a);
        }
    }

    public final Object next() {
        int i = this.w;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            rf2.c();
            return null;
        } else if (i == 2) {
            this.w = 1;
            Iterator it = this.y;
            it.getClass();
            return it.next();
        } else if (i == 3) {
            this.w = 0;
            Object obj = this.x;
            this.x = null;
            return obj;
        } else {
            throw b();
        }
    }

    public final e81 r() {
        return x32.w;
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
