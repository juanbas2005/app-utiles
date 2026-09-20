package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: wp4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wp4 implements lr3, Set, ar3 {
    public final up4 w;
    public final up4 x;

    public wp4(up4 up4) {
        this.w = up4;
        this.x = up4;
    }

    public final boolean add(Object obj) {
        return this.x.a(obj);
    }

    public final boolean addAll(Collection collection) {
        collection.getClass();
        up4 up4 = this.x;
        int i = up4.d;
        for (Object k : collection) {
            up4.k(k);
        }
        if (i != up4.d) {
            return true;
        }
        return false;
    }

    public final void clear() {
        this.x.b();
    }

    public final boolean contains(Object obj) {
        return this.w.c(obj);
    }

    public final boolean containsAll(Collection collection) {
        collection.getClass();
        for (Object c : collection) {
            if (!this.w.c(c)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wp4.class != obj.getClass()) {
            return false;
        }
        return this.w.equals(((wp4) obj).w);
    }

    public final int hashCode() {
        return this.w.hashCode();
    }

    public final boolean isEmpty() {
        return this.w.g();
    }

    public final Iterator iterator() {
        return new bv2(this);
    }

    public final boolean remove(Object obj) {
        return this.x.l(obj);
    }

    public final boolean removeAll(Collection collection) {
        collection.getClass();
        up4 up4 = this.x;
        int i = up4.d;
        for (Object i2 : collection) {
            up4.i(i2);
        }
        if (i != up4.d) {
            return true;
        }
        return false;
    }

    public final boolean retainAll(Collection collection) {
        collection.getClass();
        up4 up4 = this.x;
        Object[] objArr = up4.b;
        int i = up4.d;
        long[] jArr = up4.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!dt0.q0(collection, objArr[i5])) {
                                up4.m(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        if (i != up4.d) {
            return true;
        }
        return false;
    }

    public final int size() {
        return this.w.d;
    }

    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return rc9.X0(this, objArr);
    }

    public final String toString() {
        return this.w.toString();
    }

    public final Object[] toArray() {
        return rc9.W0(this);
    }
}
