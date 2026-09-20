package defpackage;

/* renamed from: xk2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xk2 extends wo1 implements dk6, aw2, ry0, h35, ln7 {
    public static final hz2 S = new hz2(29);
    public ap4 M;
    public final vr2 N;
    public dk2 O;
    public o24 P;
    public xz4 Q;
    public final vk2 R;

    public xk2(ap4 ap4, int i, o0 o0Var) {
        this.M = ap4;
        this.N = o0Var;
        vk2 vk2 = new vk2(i, new yv(2, this, xk2.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 0, 2), 10);
        V0(vk2);
        this.R = vk2;
    }

    public final void D0(ok6 ok6) {
        boolean a = this.R.a1().a();
        yr3[] yr3Arr = mk6.a;
        nk6 nk6 = jk6.l;
        yr3 yr3 = mk6.a[4];
        ok6.f(nk6, Boolean.valueOf(a));
        ok6.f(zj6.w, new h4((String) null, new yd(0, this, xk2.class, "requestFocus", "requestFocus()Z", 0, 0, 10)));
    }

    public final boolean K0() {
        return false;
    }

    public final void P0() {
        o24 o24 = this.P;
        if (o24 != null) {
            o24.b();
        }
        this.P = null;
    }

    public final void Y0(ap4 ap4, df3 df3) {
        mw1 mw1;
        if (this.J) {
            el3 el3 = (el3) ((ig0) J0()).x.a0(me6.E);
            if (el3 != null) {
                mw1 = el3.v(new m0(19, ap4, df3));
            } else {
                mw1 = null;
            }
            ar7.H(J0(), (e81) null, (r81) null, new p0(ap4, df3, mw1, (f61) null, 21), 3);
            return;
        }
        ap4.c(df3);
    }

    public final void Z0(ap4 ap4) {
        dk2 dk2;
        if (!sg3.e(this.M, ap4)) {
            ap4 ap42 = this.M;
            if (!(ap42 == null || (dk2 = this.O) == null)) {
                ap42.c(new ek2(dk2));
            }
            this.O = null;
            this.M = ap4;
        }
    }

    public final void b0(xz4 xz4) {
        this.Q = xz4;
        if (this.R.a1().a()) {
            boolean z = xz4.c1().J;
            d63 d63 = yk2.K;
            if (z) {
                xz4 xz42 = this.Q;
                if (xz42 != null && xz42.c1().J && this.J) {
                    h75.g(this, d63);
                }
            } else if (this.J) {
                h75.g(this, d63);
            }
        }
    }

    public final Object m() {
        return S;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, h06] */
    public final void m0() {
        ? obj = new Object();
        i35.o(this, new f5(20, obj, this));
        o24 o24 = (o24) obj.w;
        if (this.R.a1().a()) {
            o24 o242 = this.P;
            if (o242 != null) {
                o242.b();
            }
            if (o24 != null) {
                o24.a();
            } else {
                o24 = null;
            }
            this.P = o24;
        }
    }
}
