package defpackage;

/* renamed from: p60  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class p60 implements jd7 {
    public final fw0 a;
    public final mq4 b = new mq4();
    public final ed5 c = u55.p((Object) null);

    public p60(fw0 fw0) {
        this.a = fw0;
    }

    public final Object a(zc7 zc7, a97 a97) {
        xc xcVar = new xc(this, new o60(zc7), (f61) null, 3);
        mq4 mq4 = this.b;
        mq4.getClass();
        Object L = gl0.L(new p6(hq4.w, mq4, (vr2) xcVar, (f61) null), a97);
        if (L == p81.w) {
            return L;
        }
        return vs7.a;
    }

    public final void b(sr2 sr2, yt2 yt2, int i) {
        int i2;
        boolean z;
        yt2 yt22;
        sr2 sr22;
        yt2.g0(723898654);
        if (yt2.g(this)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i3 = i2 | i;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i3 & 1, z)) {
            o60 o60 = (o60) this.c.getValue();
            if (o60 == null) {
                yx5 v = yt2.v();
                if (v != null) {
                    v.d = new n60(this, sr2, i, 0);
                    return;
                }
                return;
            }
            sr22 = sr2;
            yt22 = yt2;
            this.a.K(o60, o60.a, sr22, yt22, 384);
        } else {
            sr22 = sr2;
            yt22 = yt2;
            yt22.Y();
        }
        yx5 v2 = yt22.v();
        if (v2 != null) {
            v2.d = new n60(this, sr22, i, 1);
        }
    }
}
