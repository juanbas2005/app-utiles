package defpackage;

/* renamed from: xd5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xd5 implements h11 {
    public final va6 w;
    public final String x;
    public final gs2 y;
    public final z97 z = new z97(new hx4(5, this));

    public xd5(va6 va6, String str, gs2 gs2) {
        this.w = va6;
        this.x = str;
        this.y = gs2;
    }

    public final void close() {
        z97 z97 = this.z;
        if (z97.a()) {
            ((ua6) z97.getValue()).close();
        }
    }

    public final Object w(boolean z2, gs2 gs2, h61 h61) {
        vd5 vd5;
        wd5 wd5 = (wd5) h61.r().a0(wd5.x);
        if (wd5 != null) {
            vd5 = wd5.w;
        } else {
            vd5 = null;
        }
        if (vd5 != null) {
            return gs2.H(vd5, h61);
        }
        vd5 vd52 = new vd5(this.y, (ua6) this.z.getValue());
        return ar7.e0(new wd5(vd52), new k05(gs2, vd52, (f61) null, 2), h61);
    }
}
