package defpackage;

/* renamed from: ra5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ra5 extends ll4 implements my3 {
    public la5 K;

    public final mh4 c(oh4 oh4, gh4 gh4, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        float b = this.K.b(oh4.getLayoutDirection());
        float d = this.K.d();
        float c = this.K.c(oh4.getLayoutDirection());
        float a = this.K.a();
        boolean z4 = false;
        if (lx1.a(b, 0.0f) >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (lx1.a(d, 0.0f) >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = z & z2;
        if (lx1.a(c, 0.0f) >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z6 = z5 & z3;
        if (lx1.a(a, 0.0f) >= 0) {
            z4 = true;
        }
        if (!z6 || !z4) {
            wb3.a("Padding must be non-negative");
        }
        int r0 = oh4.r0(b);
        int r02 = oh4.r0(c) + r0;
        int r03 = oh4.r0(d);
        int r04 = oh4.r0(a) + r03;
        eh5 y = gh4.y(m31.i(-r02, -r04, j));
        return oh4.d0(m31.g(j, y.w + r02), m31.f(j, y.x + r04), b42.w, new gd3(y, r0, r03, 2));
    }
}
