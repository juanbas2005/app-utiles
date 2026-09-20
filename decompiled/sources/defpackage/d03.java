package defpackage;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* renamed from: d03  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class d03 implements ListIterator, ar3 {
    public final Object A;
    public final /* synthetic */ int w = 0;
    public int x;
    public int y;
    public int z;

    public d03(yx6 yx6, int i) {
        this.A = yx6;
        this.x = i - 1;
        this.y = -1;
        this.z = rj1.x(yx6);
    }

    public void a() {
        if (((m74) this.A).A.modCount != this.z) {
            throw new ConcurrentModificationException();
        }
    }

    public final void add(Object obj) {
        int i = this.w;
        Object obj2 = this.A;
        switch (i) {
            case b85.b:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                m74 m74 = (m74) obj2;
                int i2 = this.x;
                this.x = i2 + 1;
                m74.add(i2, obj);
                this.y = -1;
                this.z = m74.modCount;
                return;
            case 2:
                b();
                n74 n74 = (n74) obj2;
                int i3 = this.x;
                this.x = i3 + 1;
                n74.add(i3, obj);
                this.y = -1;
                this.z = n74.modCount;
                return;
            default:
                c();
                yx6 yx6 = (yx6) obj2;
                yx6.add(this.x + 1, obj);
                this.y = -1;
                this.x++;
                this.z = rj1.x(yx6);
                return;
        }
    }

    public void b() {
        if (((n74) this.A).modCount != this.z) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        if (rj1.x((yx6) this.A) != this.z) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean hasNext() {
        int i = this.w;
        Object obj = this.A;
        switch (i) {
            case b85.b:
                if (this.x < this.z) {
                    return true;
                }
                return false;
            case 1:
                if (this.x < ((m74) obj).y) {
                    return true;
                }
                return false;
            case 2:
                if (this.x < ((n74) obj).x) {
                    return true;
                }
                return false;
            default:
                if (this.x < ((yx6) obj).size() - 1) {
                    return true;
                }
                return false;
        }
    }

    public final boolean hasPrevious() {
        switch (this.w) {
            case b85.b:
                if (this.x > this.y) {
                    return true;
                }
                return false;
            case 1:
                if (this.x > 0) {
                    return true;
                }
                return false;
            case 2:
                if (this.x > 0) {
                    return true;
                }
                return false;
            default:
                if (this.x >= 0) {
                    return true;
                }
                return false;
        }
    }

    public final Object next() {
        int i = this.w;
        Object obj = this.A;
        switch (i) {
            case b85.b:
                lp4 lp4 = ((f03) obj).w;
                int i2 = this.x;
                this.x = i2 + 1;
                Object f = lp4.f(i2);
                f.getClass();
                return (ll4) f;
            case 1:
                a();
                int i3 = this.x;
                m74 m74 = (m74) obj;
                if (i3 < m74.y) {
                    this.x = i3 + 1;
                    this.y = i3;
                    return m74.w[m74.x + i3];
                }
                rf2.c();
                return null;
            case 2:
                b();
                int i4 = this.x;
                n74 n74 = (n74) obj;
                if (i4 < n74.x) {
                    this.x = i4 + 1;
                    this.y = i4;
                    return n74.w[i4];
                }
                rf2.c();
                return null;
            default:
                c();
                int i5 = this.x + 1;
                this.y = i5;
                yx6 yx6 = (yx6) obj;
                rj1.l(i5, yx6.size());
                Object obj2 = yx6.get(i5);
                this.x = i5;
                return obj2;
        }
    }

    public final int nextIndex() {
        switch (this.w) {
            case b85.b:
                return this.x - this.y;
            case 1:
                return this.x;
            case 2:
                return this.x;
            default:
                return this.x + 1;
        }
    }

    public final Object previous() {
        int i = this.w;
        Object obj = this.A;
        switch (i) {
            case b85.b:
                lp4 lp4 = ((f03) obj).w;
                int i2 = this.x - 1;
                this.x = i2;
                Object f = lp4.f(i2);
                f.getClass();
                return (ll4) f;
            case 1:
                a();
                int i3 = this.x;
                if (i3 > 0) {
                    int i4 = i3 - 1;
                    this.x = i4;
                    this.y = i4;
                    m74 m74 = (m74) obj;
                    return m74.w[m74.x + i4];
                }
                rf2.c();
                return null;
            case 2:
                b();
                int i5 = this.x;
                if (i5 > 0) {
                    int i6 = i5 - 1;
                    this.x = i6;
                    this.y = i6;
                    return ((n74) obj).w[i6];
                }
                rf2.c();
                return null;
            default:
                c();
                yx6 yx6 = (yx6) obj;
                rj1.l(this.x, yx6.size());
                int i7 = this.x;
                this.y = i7;
                this.x--;
                return yx6.get(i7);
        }
    }

    public final int previousIndex() {
        int i;
        switch (this.w) {
            case b85.b:
                return (this.x - this.y) - 1;
            case 1:
                i = this.x;
                break;
            case 2:
                i = this.x;
                break;
            default:
                return this.x;
        }
        return i - 1;
    }

    public final void remove() {
        int i = this.w;
        Object obj = this.A;
        switch (i) {
            case b85.b:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                m74 m74 = (m74) obj;
                a();
                int i2 = this.y;
                if (i2 != -1) {
                    m74.g(i2);
                    this.x = this.y;
                    this.y = -1;
                    this.z = m74.modCount;
                    return;
                }
                h.s("Call next() or previous() before removing element from the iterator.");
                return;
            case 2:
                n74 n74 = (n74) obj;
                b();
                int i3 = this.y;
                if (i3 != -1) {
                    n74.g(i3);
                    this.x = this.y;
                    this.y = -1;
                    this.z = n74.modCount;
                    return;
                }
                h.s("Call next() or previous() before removing element from the iterator.");
                return;
            default:
                c();
                yx6 yx6 = (yx6) obj;
                yx6.remove(this.y);
                this.x--;
                this.y = -1;
                this.z = rj1.x(yx6);
                return;
        }
    }

    public final void set(Object obj) {
        int i = this.w;
        Object obj2 = this.A;
        switch (i) {
            case b85.b:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                int i2 = this.y;
                if (i2 != -1) {
                    ((m74) obj2).set(i2, obj);
                    return;
                } else {
                    h.s("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            case 2:
                b();
                int i3 = this.y;
                if (i3 != -1) {
                    ((n74) obj2).set(i3, obj);
                    return;
                } else {
                    h.s("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            default:
                yx6 yx6 = (yx6) obj2;
                c();
                int i4 = this.y;
                if (i4 >= 0) {
                    yx6.set(i4, obj);
                    this.z = rj1.x(yx6);
                    return;
                }
                h.s("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                return;
        }
    }

    public d03(n74 n74, int i) {
        this.A = n74;
        this.x = i;
        this.y = -1;
        this.z = n74.modCount;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d03(f03 f03, int i, int i2) {
        this(f03, (i2 & 1) != 0 ? 0 : i, 0, f03.w.b);
    }

    public d03(f03 f03, int i, int i2, int i3) {
        this.A = f03;
        this.x = i;
        this.y = i2;
        this.z = i3;
    }

    public d03(m74 m74, int i) {
        this.A = m74;
        this.x = i;
        this.y = -1;
        this.z = m74.modCount;
    }
}
