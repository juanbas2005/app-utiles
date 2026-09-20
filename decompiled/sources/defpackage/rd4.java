package defpackage;

import android.view.View;

/* renamed from: rd4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rd4 extends ll4 implements aw2, gz1, dk6, h35 {
    public sn K;
    public cf7 L;
    public mj5 M;
    public View N;
    public tp1 O;
    public lj5 P;
    public final ed5 Q = new ed5((Object) null, d63.G);
    public oq1 R;
    public long S = 9205357640488583168L;
    public we3 T;
    public ad0 U;

    public rd4(sn snVar, cf7 cf7, mj5 mj5) {
        this.K = snVar;
        this.L = cf7;
        this.M = mj5;
    }

    public final void D0(ok6 ok6) {
        ok6.f(sd4.a, new qd4(this, 1));
    }

    public final void N0() {
        m0();
        this.U = rj1.c(0, 7, (vc0) null);
        ar7.H(J0(), (e81) null, r81.z, new ot(this, (f61) null, 15), 1);
    }

    public final void O0() {
        lj5 lj5 = this.P;
        if (lj5 != null) {
            ((nj5) lj5).b();
        }
        this.P = null;
    }

    public final long V0() {
        if (this.R == null) {
            this.R = u55.i(new qd4(this, 2));
        }
        oq1 oq1 = this.R;
        if (oq1 != null) {
            return ((l35) oq1.getValue()).a;
        }
        return 9205357640488583168L;
    }

    public final void W0() {
        lj5 lj5 = this.P;
        if (lj5 != null) {
            ((nj5) lj5).b();
        }
        View view = this.N;
        if (view == null) {
            view = su0.K(this);
        }
        this.N = view;
        tp1 tp1 = this.O;
        if (tp1 == null) {
            tp1 = rc9.O0(this).T;
        }
        this.O = tp1;
        this.P = this.M.b(view, tp1);
        Y0();
    }

    public final void X0() {
        tp1 tp1 = this.O;
        if (tp1 == null) {
            tp1 = rc9.O0(this).T;
            this.O = tp1;
        }
        long j = ((l35) this.K.y(tp1)).a;
        if ((j & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & V0()) == 9205357640488583168L) {
            this.S = 9205357640488583168L;
            lj5 lj5 = this.P;
            if (lj5 != null) {
                ((nj5) lj5).b();
                return;
            }
            return;
        }
        this.S = l35.e(V0(), j);
        if (this.P == null) {
            W0();
        }
        lj5 lj52 = this.P;
        if (lj52 != null) {
            lj52.a(this.S, 9205357640488583168L);
        }
        Y0();
    }

    public final void Y0() {
        tp1 tp1;
        lj5 lj5 = this.P;
        if (lj5 != null && (tp1 = this.O) != null) {
            nj5 nj5 = (nj5) lj5;
            long c = nj5.c();
            we3 we3 = this.T;
            if (we3 == null || c != we3.a) {
                this.L.y(new px1(tp1.p(pv8.O(nj5.c()))));
                this.T = new we3(nj5.c());
            }
        }
    }

    public final void b0(xz4 xz4) {
        this.Q.setValue(xz4);
    }

    public final void m0() {
        i35.o(this, new qd4(this, 0));
    }

    public final void p0(wy3 wy3) {
        wy3.a();
        ad0 ad0 = this.U;
        if (ad0 != null) {
            ad0.c(vs7.a);
        }
    }
}
