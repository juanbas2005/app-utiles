package defpackage;

import java.util.List;
import java.util.ListIterator;

/* renamed from: n76  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class n76 implements ListIterator, ar3 {
    public final /* synthetic */ int w = 2;
    public final Object x;
    public final /* synthetic */ Object y;

    public n76(vf4 vf4, int i) {
        this.y = vf4;
        this.x = ((List) vf4.x).listIterator(dt0.n0(i, vf4));
    }

    public final void add(Object obj) {
        switch (this.w) {
            case b85.b:
                ListIterator listIterator = (ListIterator) this.x;
                listIterator.add(obj);
                listIterator.previous();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public final boolean hasNext() {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case b85.b:
                return ((ListIterator) obj).hasPrevious();
            case 1:
                return ((ListIterator) obj).hasPrevious();
            default:
                if (((f06) obj).w < ((h67) this.y).z - 1) {
                    return true;
                }
                return false;
        }
    }

    public final boolean hasPrevious() {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case b85.b:
                return ((ListIterator) obj).hasNext();
            case 1:
                return ((ListIterator) obj).hasNext();
            default:
                if (((f06) obj).w >= 0) {
                    return true;
                }
                return false;
        }
    }

    public final Object next() {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case b85.b:
                return ((ListIterator) obj).previous();
            case 1:
                return ((ListIterator) obj).previous();
            default:
                f06 f06 = (f06) obj;
                int i2 = f06.w + 1;
                h67 h67 = (h67) this.y;
                rj1.l(i2, h67.z);
                f06.w = i2;
                return h67.get(i2);
        }
    }

    public final int nextIndex() {
        int previousIndex;
        int size;
        int i = this.w;
        Object obj = this.y;
        Object obj2 = this.x;
        switch (i) {
            case b85.b:
                previousIndex = ((ListIterator) obj2).previousIndex();
                size = ((o76) obj).size();
                break;
            case 1:
                previousIndex = ((ListIterator) obj2).previousIndex();
                size = ((vf4) obj).size();
                break;
            default:
                return ((f06) obj2).w + 1;
        }
        return (size - 1) - previousIndex;
    }

    public final Object previous() {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case b85.b:
                return ((ListIterator) obj).next();
            case 1:
                return ((ListIterator) obj).next();
            default:
                f06 f06 = (f06) obj;
                int i2 = f06.w;
                h67 h67 = (h67) this.y;
                rj1.l(i2, h67.z);
                f06.w = i2 - 1;
                return h67.get(i2);
        }
    }

    public final int previousIndex() {
        int nextIndex;
        int size;
        int i = this.w;
        Object obj = this.y;
        Object obj2 = this.x;
        switch (i) {
            case b85.b:
                nextIndex = ((ListIterator) obj2).nextIndex();
                size = ((o76) obj).size();
                break;
            case 1:
                nextIndex = ((ListIterator) obj2).nextIndex();
                size = ((vf4) obj).size();
                break;
            default:
                return ((f06) obj2).w;
        }
        return (size - 1) - nextIndex;
    }

    public final void remove() {
        switch (this.w) {
            case b85.b:
                ((ListIterator) this.x).remove();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public final void set(Object obj) {
        switch (this.w) {
            case b85.b:
                ((ListIterator) this.x).set(obj);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public n76(o76 o76, int i) {
        this.y = o76;
        this.x = o76.w.listIterator(dt0.n0(i, o76));
    }

    public n76(f06 f06, h67 h67) {
        this.x = f06;
        this.y = h67;
    }
}
