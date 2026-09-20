package defpackage;

/* renamed from: jg3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jg3 extends ng3 {
    public mg3 L;
    public boolean M;

    public final long V0(gh4 gh4, long j) {
        int i;
        if (this.L == mg3.w) {
            i = gh4.W(k31.h(j));
        } else {
            i = gh4.c(k31.h(j));
        }
        if (i < 0) {
            i = 0;
        }
        if (i < 0) {
            ac3.a("height must be >= 0");
        }
        return m31.h(0, Integer.MAX_VALUE, i, i);
    }

    public final boolean W0() {
        return this.M;
    }

    public final int Z(dd4 dd4, gh4 gh4, int i) {
        if (this.L == mg3.w) {
            return gh4.W(i);
        }
        return gh4.c(i);
    }

    public final int i0(dd4 dd4, gh4 gh4, int i) {
        if (this.L == mg3.w) {
            return gh4.W(i);
        }
        return gh4.c(i);
    }
}
