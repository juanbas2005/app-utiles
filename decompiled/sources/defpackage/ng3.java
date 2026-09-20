package defpackage;

/* renamed from: ng3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ng3 extends ll4 implements my3 {
    public final /* synthetic */ int K;

    public /* synthetic */ ng3(int i) {
        this.K = i;
    }

    public abstract long V0(gh4 gh4, long j);

    public abstract boolean W0();

    public int Z(dd4 dd4, gh4 gh4, int i) {
        switch (this.K) {
            case b85.b:
                return gh4.c(i);
            default:
                return gh4.c(i);
        }
    }

    public mh4 c(oh4 oh4, gh4 gh4, long j) {
        long V0 = V0(gh4, j);
        if (W0()) {
            V0 = m31.e(j, V0);
        }
        eh5 y = gh4.y(V0);
        return oh4.d0(y.w, y.x, b42.w, new ws(y, 8));
    }

    public int f(dd4 dd4, gh4 gh4, int i) {
        switch (this.K) {
            case b85.b:
                return gh4.v(i);
            default:
                return gh4.v(i);
        }
    }

    public int i0(dd4 dd4, gh4 gh4, int i) {
        switch (this.K) {
            case b85.b:
                return gh4.W(i);
            default:
                return gh4.W(i);
        }
    }

    public int s0(dd4 dd4, gh4 gh4, int i) {
        switch (this.K) {
            case b85.b:
                return gh4.l(i);
            default:
                return gh4.l(i);
        }
    }
}
