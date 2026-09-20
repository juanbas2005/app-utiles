package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: yx6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yx6 implements Parcelable, n37, List, RandomAccess, cr3 {
    public static final Parcelable.Creator<yx6> CREATOR = new xx6(0);
    public k37 w;

    public yx6(o2 o2Var) {
        ix6 j = nx6.j();
        k37 k37 = new k37(j.g(), o2Var);
        if (!(j instanceof ew2)) {
            k37.b = new k37(1, o2Var);
        }
        this.w = k37;
    }

    public final boolean add(Object obj) {
        int i;
        o2 o2Var;
        ix6 j;
        boolean m;
        do {
            synchronized (rj1.D) {
                k37 k37 = this.w;
                k37.getClass();
                k37 k372 = (k37) nx6.h(k37);
                i = k372.d;
                o2Var = k372.c;
            }
            o2Var.getClass();
            o2 k = o2Var.k(obj);
            if (k.equals(o2Var)) {
                return false;
            }
            k37 k373 = this.w;
            k373.getClass();
            synchronized (nx6.c) {
                j = nx6.j();
                m = rj1.m((k37) nx6.w(k373, this, j), i, k, true);
            }
            nx6.n(j, this);
        } while (!m);
        return true;
    }

    public final boolean addAll(Collection collection) {
        int i;
        o2 o2Var;
        ix6 j;
        boolean m;
        do {
            synchronized (rj1.D) {
                k37 k37 = this.w;
                k37.getClass();
                k37 k372 = (k37) nx6.h(k37);
                i = k372.d;
                o2Var = k372.c;
            }
            o2Var.getClass();
            o2 l = o2Var.l(collection);
            if (sg3.e(l, o2Var)) {
                return false;
            }
            k37 k373 = this.w;
            k373.getClass();
            synchronized (nx6.c) {
                j = nx6.j();
                m = rj1.m((k37) nx6.w(k373, this, j), i, l, true);
            }
            nx6.n(j, this);
        } while (!m);
        return true;
    }

    public final void clear() {
        ix6 j;
        k37 k37 = this.w;
        k37.getClass();
        synchronized (nx6.c) {
            j = nx6.j();
            k37 k372 = (k37) nx6.w(k37, this, j);
            synchronized (rj1.D) {
                k372.c = kv6.x;
                k372.d++;
                k372.e++;
            }
        }
        nx6.n(j, this);
    }

    public final boolean contains(Object obj) {
        return rj1.w(this).c.contains(obj);
    }

    public final boolean containsAll(Collection collection) {
        return rj1.w(this).c.containsAll(collection);
    }

    public final int describeContents() {
        return 0;
    }

    public final Object get(int i) {
        return rj1.w(this).c.get(i);
    }

    public final p37 getFirstStateRecord() {
        return this.w;
    }

    public final int indexOf(Object obj) {
        return rj1.w(this).c.indexOf(obj);
    }

    public final boolean isEmpty() {
        return rj1.w(this).c.isEmpty();
    }

    public final Iterator iterator() {
        return listIterator();
    }

    public final int lastIndexOf(Object obj) {
        return rj1.w(this).c.lastIndexOf(obj);
    }

    public final ListIterator listIterator() {
        return new d03(this, 0);
    }

    public final void prependStateRecord(p37 p37) {
        p37.b = this.w;
        this.w = (k37) p37;
    }

    public final boolean remove(Object obj) {
        int i;
        o2 o2Var;
        o2 o2Var2;
        ix6 j;
        boolean m;
        do {
            synchronized (rj1.D) {
                k37 k37 = this.w;
                k37.getClass();
                k37 k372 = (k37) nx6.h(k37);
                i = k372.d;
                o2Var = k372.c;
            }
            o2Var.getClass();
            int indexOf = o2Var.indexOf(obj);
            if (indexOf != -1) {
                o2Var2 = o2Var.p(indexOf);
            } else {
                o2Var2 = o2Var;
            }
            if (o2Var2.equals(o2Var)) {
                return false;
            }
            k37 k373 = this.w;
            k373.getClass();
            synchronized (nx6.c) {
                j = nx6.j();
                m = rj1.m((k37) nx6.w(k373, this, j), i, o2Var2, true);
            }
            nx6.n(j, this);
        } while (!m);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        int i;
        o2 o2Var;
        ix6 j;
        boolean m;
        do {
            synchronized (rj1.D) {
                k37 k37 = this.w;
                k37.getClass();
                k37 k372 = (k37) nx6.h(k37);
                i = k372.d;
                o2Var = k372.c;
            }
            o2Var.getClass();
            o2 o = o2Var.o(new n2(0, collection));
            if (sg3.e(o, o2Var)) {
                return false;
            }
            k37 k373 = this.w;
            k373.getClass();
            synchronized (nx6.c) {
                j = nx6.j();
                m = rj1.m((k37) nx6.w(k373, this, j), i, o, true);
            }
            nx6.n(j, this);
        } while (!m);
        return true;
    }

    public final boolean retainAll(Collection collection) {
        return rj1.B(this, new n2(2, collection));
    }

    public final Object set(int i, Object obj) {
        int i2;
        o2 o2Var;
        ix6 j;
        boolean m;
        Object obj2 = get(i);
        do {
            synchronized (rj1.D) {
                k37 k37 = this.w;
                k37.getClass();
                k37 k372 = (k37) nx6.h(k37);
                i2 = k372.d;
                o2Var = k372.c;
            }
            o2Var.getClass();
            o2 s = o2Var.s(i, obj);
            if (s.equals(o2Var)) {
                break;
            }
            k37 k373 = this.w;
            k373.getClass();
            synchronized (nx6.c) {
                j = nx6.j();
                m = rj1.m((k37) nx6.w(k373, this, j), i2, s, false);
            }
            nx6.n(j, this);
        } while (!m);
        return obj2;
    }

    public final int size() {
        return rj1.w(this).c.f();
    }

    public final List subList(int i, int i2) {
        boolean z;
        if (i < 0 || i > i2 || i2 > size()) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            vm5.a("fromIndex or toIndex are out of bounds");
        }
        return new h67(this, i, i2);
    }

    public final Object[] toArray() {
        return rc9.W0(this);
    }

    public final String toString() {
        k37 k37 = this.w;
        k37.getClass();
        o2 o2Var = ((k37) nx6.h(k37)).c;
        int hashCode = hashCode();
        return "SnapshotStateList(value=" + o2Var + ")@" + hashCode;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        o2 o2Var = rj1.w(this).c;
        int f = o2Var.f();
        parcel.writeInt(f);
        for (int i2 = 0; i2 < f; i2++) {
            parcel.writeValue(o2Var.get(i2));
        }
    }

    public final Object[] toArray(Object[] objArr) {
        return rc9.X0(this, objArr);
    }

    public final ListIterator listIterator(int i) {
        return new d03(this, i);
    }

    public yx6() {
        this(kv6.x);
    }

    public final void add(int i, Object obj) {
        int i2;
        o2 o2Var;
        ix6 j;
        boolean m;
        do {
            synchronized (rj1.D) {
                k37 k37 = this.w;
                k37.getClass();
                k37 k372 = (k37) nx6.h(k37);
                i2 = k372.d;
                o2Var = k372.c;
            }
            o2Var.getClass();
            o2 g = o2Var.g(i, obj);
            if (!g.equals(o2Var)) {
                k37 k373 = this.w;
                k373.getClass();
                synchronized (nx6.c) {
                    j = nx6.j();
                    m = rj1.m((k37) nx6.w(k373, this, j), i2, g, true);
                }
                nx6.n(j, this);
            } else {
                return;
            }
        } while (!m);
    }

    public final boolean addAll(int i, Collection collection) {
        return rj1.B(this, new k04(i, collection));
    }

    public final Object remove(int i) {
        int i2;
        o2 o2Var;
        ix6 j;
        boolean m;
        Object obj = get(i);
        do {
            synchronized (rj1.D) {
                k37 k37 = this.w;
                k37.getClass();
                k37 k372 = (k37) nx6.h(k37);
                i2 = k372.d;
                o2Var = k372.c;
            }
            o2Var.getClass();
            o2 p = o2Var.p(i);
            if (p.equals(o2Var)) {
                break;
            }
            k37 k373 = this.w;
            k373.getClass();
            synchronized (nx6.c) {
                j = nx6.j();
                m = rj1.m((k37) nx6.w(k373, this, j), i2, p, true);
            }
            nx6.n(j, this);
        } while (!m);
        return obj;
    }
}
