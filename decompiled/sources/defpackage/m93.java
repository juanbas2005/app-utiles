package defpackage;

import java.util.ListIterator;

/* renamed from: m93  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class m93 extends at7 implements ListIterator {
    public final int x;
    public int y;
    public final q93 z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m93(q93 q93, int i) {
        super(0);
        int size = q93.size();
        g75.m(i, size);
        this.x = size;
        this.y = i;
        this.z = q93;
    }

    public final Object a(int i) {
        return this.z.get(i);
    }

    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        if (this.y < this.x) {
            return true;
        }
        return false;
    }

    public final boolean hasPrevious() {
        if (this.y > 0) {
            return true;
        }
        return false;
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.y;
            this.y = i + 1;
            return a(i);
        }
        rf2.c();
        return null;
    }

    public final int nextIndex() {
        return this.y;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.y - 1;
            this.y = i;
            return a(i);
        }
        rf2.c();
        return null;
    }

    public final int previousIndex() {
        return this.y - 1;
    }

    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
