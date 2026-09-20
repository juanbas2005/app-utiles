package defpackage;

import java.util.Iterator;

/* renamed from: rc4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rc4 implements Iterator, ar3 {
    public final long w;
    public final long x;
    public boolean y;
    public long z;

    public rc4(long j, long j2, long j3) {
        this.w = j3;
        this.x = j2;
        boolean z2 = false;
        if (j3 <= 0 ? j >= j2 : j <= j2) {
            z2 = true;
        }
        this.y = z2;
        this.z = !z2 ? j2 : j;
    }

    public final boolean hasNext() {
        return this.y;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return Long.valueOf(nextLong());
    }

    public final long nextLong() {
        long j = this.z;
        if (j != this.x) {
            this.z = this.w + j;
            return j;
        } else if (this.y) {
            this.y = false;
            return j;
        } else {
            rf2.c();
            return 0;
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
