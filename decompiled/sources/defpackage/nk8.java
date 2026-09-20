package defpackage;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;

/* renamed from: nk8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class nk8 extends AbstractCollection implements Serializable {
    public static final Object[] x = new Object[0];
    public static final Object[] y = new Object[0];
    public static final Object[] z = new Object[0];
    public final /* synthetic */ int w;

    public /* synthetic */ nk8(int i) {
        this.w = i;
    }

    public final boolean add(Object obj) {
        switch (this.w) {
            case b85.b:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean addAll(Collection collection) {
        switch (this.w) {
            case b85.b:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        switch (this.w) {
            case b85.b:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public int d(Object[] objArr) {
        at7 n = n();
        int i = 0;
        while (n.hasNext()) {
            objArr[i] = n.next();
            i++;
        }
        return i;
    }

    public int f() {
        throw new UnsupportedOperationException();
    }

    public Object[] g() {
        switch (this.w) {
            case b85.b:
                return null;
            default:
                return null;
        }
    }

    public int k() {
        switch (this.w) {
            case b85.b:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public int l() {
        switch (this.w) {
            case b85.b:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public abstract at7 n();

    public abstract int o(Object[] objArr);

    public Object[] p() {
        return null;
    }

    public final boolean remove(Object obj) {
        switch (this.w) {
            case b85.b:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean removeAll(Collection collection) {
        switch (this.w) {
            case b85.b:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean retainAll(Collection collection) {
        switch (this.w) {
            case b85.b:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public abstract int s(Object[] objArr);

    public final Spliterator spliterator() {
        switch (this.w) {
            case b85.b:
                return Spliterators.spliterator(this, 1296);
            case 1:
                return Spliterators.spliterator(this, 1296);
            default:
                return Spliterators.spliterator(this, 1296);
        }
    }

    public final Object[] toArray(Object[] objArr) {
        switch (this.w) {
            case b85.b:
                objArr.getClass();
                int size = size();
                int length = objArr.length;
                if (length < size) {
                    Object[] g = g();
                    if (g != null) {
                        return Arrays.copyOfRange(g, k(), l(), objArr.getClass());
                    }
                    if (length != 0) {
                        objArr = Arrays.copyOf(objArr, 0);
                    }
                    objArr = Arrays.copyOf(objArr, size);
                } else if (length > size) {
                    objArr[size] = null;
                }
                s(objArr);
                return objArr;
            case 1:
                objArr.getClass();
                int size2 = size();
                int length2 = objArr.length;
                if (length2 < size2) {
                    Object[] g2 = g();
                    if (g2 != null) {
                        return Arrays.copyOfRange(g2, k(), l(), objArr.getClass());
                    }
                    if (length2 != 0) {
                        objArr = Arrays.copyOf(objArr, 0);
                    }
                    objArr = Arrays.copyOf(objArr, size2);
                } else if (length2 > size2) {
                    objArr[size2] = null;
                }
                o(objArr);
                return objArr;
            default:
                objArr.getClass();
                int size3 = size();
                int length3 = objArr.length;
                if (length3 < size3) {
                    Object[] p = p();
                    if (p != null) {
                        return Arrays.copyOfRange(p, k(), f(), objArr.getClass());
                    }
                    if (length3 != 0) {
                        objArr = Arrays.copyOf(objArr, 0);
                    }
                    objArr = Arrays.copyOf(objArr, size3);
                } else if (length3 > size3) {
                    objArr[size3] = null;
                }
                d(objArr);
                return objArr;
        }
    }

    public final Object[] toArray() {
        switch (this.w) {
            case b85.b:
                return toArray(x);
            case 1:
                return toArray(y);
            default:
                return toArray(z);
        }
    }
}
