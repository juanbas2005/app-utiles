package defpackage;

/* renamed from: ef5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ef5 implements fw5 {
    public boolean A;
    public long B;
    public final py6 w;
    public final tc0 x;
    public pi6 y;
    public int z;

    public ef5(py6 py6) {
        int i;
        this.w = py6;
        tc0 c = py6.c();
        this.x = c;
        pi6 pi6 = c.w;
        this.y = pi6;
        if (pi6 != null) {
            i = pi6.b;
        } else {
            i = -1;
        }
        this.z = i;
    }

    public final void close() {
        this.A = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        if (r3 == r5.b) goto L_0x0024;
     */
    public final long y(tc0 tc0, long j) {
        pi6 pi6;
        if (!this.A) {
            int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            if (i >= 0) {
                pi6 pi62 = this.y;
                tc0 tc02 = this.x;
                if (pi62 != null) {
                    pi6 pi63 = tc02.w;
                    if (pi62 == pi63) {
                        int i2 = this.z;
                        pi63.getClass();
                    }
                    h.s("Peek source is invalid because upstream source was used");
                    return 0;
                }
                if (i == 0) {
                    return 0;
                }
                if (!this.w.j(this.B + 1)) {
                    return -1;
                }
                if (this.y == null && (pi6 = tc02.w) != null) {
                    this.y = pi6;
                    this.z = pi6.b;
                }
                long min = Math.min(j, tc02.y - this.B);
                long j2 = this.B;
                long j3 = j2 + min;
                rj1.o(tc02.y, j2, j3);
                if (j2 != j3) {
                    long j4 = j3 - j2;
                    tc0.y += j4;
                    pi6 pi64 = tc02.w;
                    while (true) {
                        pi64.getClass();
                        long j5 = (long) (pi64.c - pi64.b);
                        if (j2 < j5) {
                            break;
                        }
                        j2 -= j5;
                        pi64 = pi64.f;
                    }
                    while (j4 > 0) {
                        pi64.getClass();
                        pi6 e = pi64.e();
                        int i3 = e.b + ((int) j2);
                        e.b = i3;
                        e.c = Math.min(i3 + ((int) j4), e.c);
                        if (tc0.w == null) {
                            tc0.w = e;
                            tc0.x = e;
                        } else {
                            pi6 pi65 = tc0.x;
                            pi65.getClass();
                            pi65.d(e);
                            tc0.x = e;
                        }
                        j4 -= (long) (e.c - e.b);
                        pi64 = pi64.f;
                        j2 = 0;
                    }
                }
                this.B += min;
                return min;
            }
            h.j(f21.g(j, "byteCount (", ") < 0"));
            return 0;
        }
        h.s("Source is closed.");
        return 0;
    }
}
