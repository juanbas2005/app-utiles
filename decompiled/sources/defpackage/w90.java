package defpackage;

/* renamed from: w90  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class w90 extends ll4 implements my3, dk6 {
    public vr2 K;

    public w90(vr2 vr2) {
        this.K = vr2;
    }

    /* JADX INFO: finally extract failed */
    public final void D0(ok6 ok6) {
        pq6 pq6;
        boolean z;
        vr2 vr2;
        xz4 M0 = rc9.M0(this, 2);
        if (!M0.f0) {
            l76 l76 = mp7.D;
            if (l76 == null) {
                mp7.D = new l76();
            } else {
                l76.a();
            }
            l76 l762 = mp7.D;
            l762.getClass();
            l762.P = M0.O.T;
            l762.N = pv8.O(M0.y);
            ix6 h = j45.h();
            if (h != null) {
                vr2 = h.e();
            } else {
                vr2 = null;
            }
            ix6 j = j45.j(h);
            try {
                this.K.y(l762);
                j45.m(h, j, vr2);
                pq6 = l762.K;
                z = l762.L;
            } catch (Throwable th) {
                j45.m(h, j, vr2);
                throw th;
            }
        } else {
            pq6 = M0.d0;
            z = M0.e0;
        }
        if (z) {
            mk6.g(ok6, pq6);
        }
    }

    public final boolean K0() {
        return false;
    }

    public final mh4 c(oh4 oh4, gh4 gh4, long j) {
        eh5 y = gh4.y(j);
        return oh4.d0(y.w, y.x, b42.w, new lh(6, y, this));
    }

    public final boolean h() {
        return false;
    }

    public final String toString() {
        vr2 vr2 = this.K;
        return "BlockGraphicsLayerModifier(block=" + vr2 + ")";
    }
}
