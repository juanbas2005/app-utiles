package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: cs7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cs7 implements Collection, ar3 {
    public final short[] w;

    public /* synthetic */ cs7(short[] sArr) {
        this.w = sArr;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof bs7)) {
            return false;
        }
        short s = ((bs7) obj).w;
        short[] sArr = this.w;
        int length = sArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (s == sArr[i]) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterable iterable = collection;
        if (((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object next : iterable) {
            if (next instanceof bs7) {
                short s = ((bs7) next).w;
                short[] sArr = this.w;
                int length = sArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        continue;
                        break;
                    } else if (s == sArr[i]) {
                        continue;
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cs7)) {
            return false;
        }
        if (!this.w.equals(((cs7) obj).w)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.w);
    }

    public final boolean isEmpty() {
        if (this.w.length == 0) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return new e2(7, this.w);
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return this.w.length;
    }

    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return rc9.X0(this, objArr);
    }

    public final String toString() {
        return "UShortArray(storage=" + Arrays.toString(this.w) + ')';
    }

    public final Object[] toArray() {
        return rc9.W0(this);
    }
}
