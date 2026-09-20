package defpackage;

/* renamed from: lk  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lk extends ng3 {
    public bm7 L;
    public aq4 M;
    public mk N;
    public long O;

    public final void P0() {
        this.O = -9223372034707292160L;
    }

    public final mh4 c(oh4 oh4, gh4 gh4, long j) {
        long j2;
        eh5 y = gh4.y(j);
        if (oh4.a0()) {
            j2 = (((long) y.w) << 32) | (((long) y.x) & 4294967295L);
        } else {
            bm7 bm7 = this.L;
            int i = y.w;
            if (bm7 == null) {
                j2 = (((long) i) << 32) | (((long) y.x) & 4294967295L);
                this.O = j2;
            } else {
                long j3 = (((long) y.x) & 4294967295L) | (((long) i) << 32);
                am7 a = bm7.a(new kk(this, j3, 0), (Object) null, (ol) null, new kk(this, j3, 1));
                this.N.getClass();
                j2 = ((we3) a.getValue()).a;
                this.O = ((we3) a.getValue()).a;
            }
        }
        return oh4.d0((int) (j2 >> 32), (int) (4294967295L & j2), b42.w, new jk(this, y, j2));
    }
}
