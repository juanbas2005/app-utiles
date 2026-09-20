package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* renamed from: uv6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class uv6 implements Iterator {
    public boolean w;
    public final int x;
    public final /* synthetic */ vv6 y;

    public uv6(vv6 vv6) {
        this.y = vv6;
        this.x = vv6.modCount;
    }

    public final void a() {
        vv6 vv6 = this.y;
        int g = vv6.modCount;
        int i = this.x;
        if (g != i) {
            int k = vv6.modCount;
            throw new ConcurrentModificationException("ModCount: " + k + "; expected: " + i);
        }
    }

    public final boolean hasNext() {
        return !this.w;
    }

    public final Object next() {
        if (!this.w) {
            this.w = true;
            a();
            return this.y.x;
        }
        rf2.c();
        return null;
    }

    public final void remove() {
        a();
        this.y.clear();
    }
}
