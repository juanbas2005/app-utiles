package defpackage;

import java.util.ListIterator;

/* renamed from: f2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class f2 extends e2 implements ListIterator {
    public final /* synthetic */ h2 z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f2(h2 h2Var, int i) {
        super(0, h2Var);
        this.z = h2Var;
        int f = h2Var.f();
        if (i < 0 || i > f) {
            h.l(b81.l(i, f, "index: ", ", size: "));
            throw null;
        } else {
            this.x = i;
        }
    }

    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean hasPrevious() {
        if (this.x > 0) {
            return true;
        }
        return false;
    }

    public final int nextIndex() {
        return this.x;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.x - 1;
            this.x = i;
            return this.z.get(i);
        }
        rf2.c();
        return null;
    }

    public final int previousIndex() {
        return this.x - 1;
    }

    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
