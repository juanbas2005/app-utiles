package defpackage;

import java.util.Iterator;

/* renamed from: p55  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class p55 extends is {
    public final um w;
    public final int x;

    public p55(int i, um umVar) {
        this.w = umVar;
        this.x = i;
    }

    public final int f() {
        return 1;
    }

    public final void g(int i, um umVar) {
        throw new IllegalStateException();
    }

    public final Object get(int i) {
        if (i == this.x) {
            return this.w;
        }
        return null;
    }

    public final Iterator iterator() {
        return new el6(2, this);
    }
}
