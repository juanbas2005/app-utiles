package defpackage;

/* renamed from: b40  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class b40 extends ll4 implements gz1, h35, dk6 {
    public long K;
    public kc0 L;
    public float M;
    public pq6 N;
    public long O;
    public ey3 P;
    public n85 Q;
    public pq6 R;
    public n85 S;

    public final void D0(ok6 ok6) {
        mk6.g(ok6, this.N);
    }

    public final boolean h() {
        return false;
    }

    public final void m0() {
        this.O = 9205357640488583168L;
        this.P = null;
        this.Q = null;
        this.R = null;
        rc9.e0(this);
    }

    public final void p0(wy3 wy3) {
        n85 n85;
        tk0 tk0 = wy3.w;
        if (this.N == gr8.h) {
            if (!jt0.c(this.K, jt0.g)) {
                hz1.f0(wy3, this.K, 0, 0, 0.0f, 126);
            }
            kc0 kc0 = this.L;
            if (kc0 != null) {
                hz1.q(wy3, kc0, 0, 0, this.M, (iz1) null, (lt0) null, 118);
            }
        } else {
            if (!wu6.a(tk0.e(), this.O) || wy3.getLayoutDirection() != this.P || !sg3.e(this.R, this.N)) {
                i35.o(this, new f5(5, this, wy3));
                n85 = this.S;
                this.S = null;
            } else {
                n85 = this.Q;
                n85.getClass();
            }
            this.Q = n85;
            this.O = tk0.e();
            this.P = wy3.getLayoutDirection();
            this.R = this.N;
            n85.getClass();
            if (!jt0.c(this.K, jt0.g)) {
                o85.e(wy3, n85, this.K);
            }
            kc0 kc02 = this.L;
            if (kc02 != null) {
                o85.d(wy3, n85, kc02, this.M, 56);
            }
        }
        wy3.a();
    }
}
