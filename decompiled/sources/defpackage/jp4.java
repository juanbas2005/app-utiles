package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: jp4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jp4 implements List, cr3 {
    public final /* synthetic */ int w;
    public final Object x;

    public /* synthetic */ jp4(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }

    public final void add(int i, Object obj) {
        int i2;
        int i3 = this.w;
        Object obj2 = this.x;
        switch (i3) {
            case b85.b:
                lp4 lp4 = (lp4) obj2;
                if (i < 0 || i > (i2 = lp4.b)) {
                    lp4.p(i);
                    throw null;
                }
                int i4 = i2 + 1;
                Object[] objArr = lp4.a;
                if (objArr.length < i4) {
                    lp4.m(i4, objArr);
                }
                Object[] objArr2 = lp4.a;
                int i5 = lp4.b;
                if (i != i5) {
                    qs.K0(i + 1, i, i5, objArr2, objArr2);
                }
                objArr2[i] = obj;
                lp4.b++;
                return;
            default:
                ((eq4) obj2).a(i, obj);
                return;
        }
    }

    public final boolean addAll(int i, Collection collection) {
        int i2 = this.w;
        Object obj = this.x;
        switch (i2) {
            case b85.b:
                collection.getClass();
                lp4 lp4 = (lp4) obj;
                if (i < 0 || i > lp4.b) {
                    lp4.p(i);
                    throw null;
                }
                int i3 = 0;
                if (collection.isEmpty()) {
                    return false;
                }
                int size = collection.size() + lp4.b;
                Object[] objArr = lp4.a;
                if (objArr.length < size) {
                    lp4.m(size, objArr);
                }
                Object[] objArr2 = lp4.a;
                if (i != lp4.b) {
                    qs.K0(collection.size() + i, i, lp4.b, objArr2, objArr2);
                }
                for (Object next : collection) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        objArr2[i3 + i] = next;
                        i3 = i4;
                    } else {
                        sg3.Z();
                        throw null;
                    }
                }
                lp4.b = collection.size() + lp4.b;
                return true;
            default:
                return ((eq4) obj).e(i, collection);
        }
    }

    public final void clear() {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case b85.b:
                ((lp4) obj).d();
                return;
            default:
                ((eq4) obj).g();
                return;
        }
    }

    public final boolean contains(Object obj) {
        int i = this.w;
        Object obj2 = this.x;
        switch (i) {
            case b85.b:
                if (((lp4) obj2).g(obj) >= 0) {
                    return true;
                }
                return false;
            default:
                return ((eq4) obj2).h(obj);
        }
    }

    public final boolean containsAll(Collection collection) {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case b85.b:
                collection.getClass();
                lp4 lp4 = (lp4) obj;
                for (Object g : collection) {
                    if (lp4.g(g) < 0) {
                        return false;
                    }
                }
                return true;
            default:
                eq4 eq4 = (eq4) obj;
                for (Object h : collection) {
                    if (!eq4.h(h)) {
                        return false;
                    }
                }
                return true;
        }
    }

    public final Object get(int i) {
        int i2 = this.w;
        Object obj = this.x;
        switch (i2) {
            case b85.b:
                w25.a(i, this);
                return ((lp4) obj).f(i);
            default:
                fq4.a(i, this);
                return ((eq4) obj).w[i];
        }
    }

    public final int indexOf(Object obj) {
        int i = this.w;
        Object obj2 = this.x;
        switch (i) {
            case b85.b:
                return ((lp4) obj2).g(obj);
            default:
                return ((eq4) obj2).i(obj);
        }
    }

    public final boolean isEmpty() {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case b85.b:
                return ((lp4) obj).h();
            default:
                if (((eq4) obj).y == 0) {
                    return true;
                }
                return false;
        }
    }

    public final Iterator iterator() {
        switch (this.w) {
            case b85.b:
                return new ip4(this, 0, 0);
            default:
                return new ip4(this, 0, 1);
        }
    }

    public final int lastIndexOf(Object obj) {
        int i;
        int i2 = this.w;
        Object obj2 = this.x;
        switch (i2) {
            case b85.b:
                lp4 lp4 = (lp4) obj2;
                Object[] objArr = lp4.a;
                int i3 = lp4.b;
                if (obj == null) {
                    i = i3 - 1;
                    while (-1 < i) {
                        if (objArr[i] != null) {
                            i--;
                        }
                    }
                    return -1;
                }
                int i4 = i3 - 1;
                while (-1 < i) {
                    if (!obj.equals(objArr[i])) {
                        i4 = i - 1;
                    }
                }
                return -1;
                return i;
            default:
                eq4 eq4 = (eq4) obj2;
                Object[] objArr2 = eq4.w;
                for (int i5 = eq4.y - 1; i5 >= 0; i5--) {
                    if (sg3.e(obj, objArr2[i5])) {
                        return i5;
                    }
                }
                return -1;
        }
    }

    public final ListIterator listIterator() {
        switch (this.w) {
            case b85.b:
                return new ip4(this, 0, 0);
            default:
                return new ip4(this, 0, 1);
        }
    }

    public final Object remove(int i) {
        int i2 = this.w;
        Object obj = this.x;
        switch (i2) {
            case b85.b:
                w25.a(i, this);
                return ((lp4) obj).k(i);
            default:
                fq4.a(i, this);
                return ((eq4) obj).l(i);
        }
    }

    public final boolean removeAll(Collection collection) {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case b85.b:
                collection.getClass();
                lp4 lp4 = (lp4) obj;
                int i2 = lp4.b;
                for (Object j : collection) {
                    lp4.j(j);
                }
                if (i2 != lp4.b) {
                    return true;
                }
                return false;
            default:
                eq4 eq4 = (eq4) obj;
                if (!collection.isEmpty()) {
                    int i3 = eq4.y;
                    for (Object k : collection) {
                        eq4.k(k);
                    }
                    if (i3 != eq4.y) {
                        return true;
                    }
                }
                return false;
        }
    }

    public final boolean retainAll(Collection collection) {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case b85.b:
                collection.getClass();
                lp4 lp4 = (lp4) obj;
                int i2 = lp4.b;
                Object[] objArr = lp4.a;
                for (int i3 = i2 - 1; -1 < i3; i3--) {
                    if (!collection.contains(objArr[i3])) {
                        lp4.k(i3);
                    }
                }
                if (i2 != lp4.b) {
                    return true;
                }
                return false;
            default:
                eq4 eq4 = (eq4) obj;
                int i4 = eq4.y;
                for (int i5 = i4 - 1; -1 < i5; i5--) {
                    if (!collection.contains(eq4.w[i5])) {
                        eq4.l(i5);
                    }
                }
                if (i4 != eq4.y) {
                    return true;
                }
                return false;
        }
    }

    public final Object set(int i, Object obj) {
        int i2 = this.w;
        Object obj2 = this.x;
        switch (i2) {
            case b85.b:
                w25.a(i, this);
                return ((lp4) obj2).n(i, obj);
            default:
                fq4.a(i, this);
                Object[] objArr = ((eq4) obj2).w;
                Object obj3 = objArr[i];
                objArr[i] = obj;
                return obj3;
        }
    }

    public final int size() {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case b85.b:
                return ((lp4) obj).b;
            default:
                return ((eq4) obj).y;
        }
    }

    public final List subList(int i, int i2) {
        switch (this.w) {
            case b85.b:
                w25.b(this, i, i2);
                return new kp4(this, i, i2, 0);
            default:
                fq4.b(this, i, i2);
                return new kp4(this, i, i2, 1);
        }
    }

    public final Object[] toArray(Object[] objArr) {
        switch (this.w) {
            case b85.b:
                objArr.getClass();
                return rc9.X0(this, objArr);
            default:
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

    public final ListIterator listIterator(int i) {
        switch (this.w) {
            case b85.b:
                return new ip4(this, i, 0);
            default:
                return new ip4(this, i, 1);
        }
    }

    public final boolean remove(Object obj) {
        int i = this.w;
        Object obj2 = this.x;
        switch (i) {
            case b85.b:
                return ((lp4) obj2).j(obj);
            default:
                return ((eq4) obj2).k(obj);
        }
    }

    public final boolean add(Object obj) {
        int i = this.w;
        Object obj2 = this.x;
        switch (i) {
            case b85.b:
                ((lp4) obj2).a(obj);
                return true;
            default:
                ((eq4) obj2).b(obj);
                return true;
        }
    }

    public final boolean addAll(Collection collection) {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case b85.b:
                collection.getClass();
                lp4 lp4 = (lp4) obj;
                int i2 = lp4.b;
                for (Object a : collection) {
                    lp4.a(a);
                }
                return i2 != lp4.b;
            default:
                eq4 eq4 = (eq4) obj;
                return eq4.e(eq4.y, collection);
        }
    }
}
