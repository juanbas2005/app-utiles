package defpackage;

/* renamed from: lb3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lb3 {
    public final eq4 a = new eq4(new jb3[16]);
    public final ed5 b = u55.p(Boolean.FALSE);
    public long c = Long.MIN_VALUE;
    public final ed5 d = u55.p(Boolean.TRUE);

    public final void a(int i, yt2 yt2) {
        int i2;
        boolean z;
        yt2.g0(-318043801);
        if (yt2.i(this)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i3 & 1, z)) {
            Object Q = yt2.Q();
            d63 d63 = ay0.a;
            if (Q == d63) {
                Q = u55.p((Object) null);
                yt2.o0(Q);
            }
            aq4 aq4 = (aq4) Q;
            if (((Boolean) this.d.getValue()).booleanValue() || ((Boolean) this.b.getValue()).booleanValue()) {
                yt2.e0(-144841960);
                boolean i4 = yt2.i(this);
                Object Q2 = yt2.Q();
                if (i4 || Q2 == d63) {
                    Q2 = new ng((Object) aq4, (Object) this, (f61) null, 10);
                    yt2.o0(Q2);
                }
                t49.h((gs2) Q2, yt2, this);
                yt2.r(false);
            } else {
                yt2.e0(-143455237);
                yt2.r(false);
            }
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new yg(i, 14, this);
        }
    }
}
