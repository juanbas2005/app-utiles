package defpackage;

/* renamed from: qg3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qg3 extends ng3 {
    public mg3 L;
    public boolean M;

    public final long V0(gh4 gh4, long j) {
        int i;
        if (this.L == mg3.w) {
            i = gh4.l(k31.g(j));
        } else {
            i = gh4.v(k31.g(j));
        }
        if (i < 0) {
            i = 0;
        }
        if (i < 0) {
            ac3.a("width must be >= 0");
        }
        return m31.h(i, i, 0, Integer.MAX_VALUE);
    }

    public final boolean W0() {
        return this.M;
    }

    public final int f(dd4 dd4, gh4 gh4, int i) {
        if (this.L == mg3.w) {
            return gh4.l(i);
        }
        return gh4.v(i);
    }

    public final int s0(dd4 dd4, gh4 gh4, int i) {
        if (this.L == mg3.w) {
            return gh4.l(i);
        }
        return gh4.v(i);
    }
}
