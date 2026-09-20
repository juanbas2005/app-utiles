package defpackage;

import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.util.List;

/* renamed from: th6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class th6 extends ty1 implements us3, dk6 {
    public xf f0;
    public eh2 g0;
    public final am6 h0;
    public final rl1 i0;
    public final zh6 j0;
    public final v70 k0;
    public final vk2 l0;
    public final s41 m0;
    public ph6 n0;
    public rh6 o0;
    public en4 p0;
    public cl7 q0;

    /* JADX WARNING: type inference failed for: r0v5, types: [cc0, ll4, vo1] */
    /* JADX WARNING: Illegal instructions before constructor call */
    public th6(xf xfVar, fc0 fc0, eh2 eh2, ap4 ap4, z75 z75, uh6 uh6, boolean z, boolean z2) {
        super(mh6.a, r9, ap4, z75);
        eh2 eh22;
        boolean z3 = z;
        this.f0 = xfVar;
        this.g0 = eh2;
        am6 am6 = new am6(18);
        this.h0 = am6;
        rl1 rl1 = new rl1(new tj1(new br4((tp1) mh6.d)));
        this.i0 = rl1;
        xf xfVar2 = this.f0;
        eh2 eh23 = this.g0;
        if (eh23 == null) {
            eh22 = rl1;
        } else {
            eh22 = eh23;
        }
        z75 z752 = z75;
        uh6 uh62 = uh6;
        boolean z4 = z2;
        zh6 zh6 = new zh6(uh62, xfVar2, eh22, z752, z4, am6, this, new oh6(this, 0));
        this.j0 = zh6;
        v70 v70 = new v70(9, zh6, z3);
        this.k0 = v70;
        vk2 vk2 = new vk2(2, (gs2) null, 10);
        V0(vk2);
        this.l0 = vk2;
        z75 z753 = z75;
        boolean z5 = z2;
        s41 s41 = new s41(z753, zh6, z5, fc0, new oh6(this, 1));
        V0(s41);
        this.m0 = s41;
        V0(new zx4(v70, am6));
        ? ll4 = new ll4();
        ll4.K = s41;
        V0(ll4);
    }

    public final boolean B(KeyEvent keyEvent) {
        float f;
        long floatToRawIntBits;
        float f2;
        boolean z = false;
        if (!this.O || ((!os3.a(rd3.x(keyEvent), os3.D) && !os3.a(uq3.f(keyEvent.getKeyCode()), os3.C)) || rd3.A(keyEvent) != 2 || keyEvent.isCtrlPressed())) {
            return false;
        }
        if (this.j0.d == z75.w) {
            z = true;
        }
        s41 s41 = this.m0;
        if (z) {
            int W0 = (int) (s41.W0() & 4294967295L);
            if (os3.a(uq3.f(keyEvent.getKeyCode()), os3.C)) {
                f2 = (float) W0;
            } else {
                f2 = -((float) W0);
            }
            floatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f2)));
        } else {
            int W02 = (int) (s41.W0() >> 32);
            if (os3.a(uq3.f(keyEvent.getKeyCode()), os3.C)) {
                f = (float) W02;
            } else {
                f = -((float) W02);
            }
            floatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32);
        }
        ar7.H(J0(), (e81) null, (r81) null, new rh6(this, floatToRawIntBits, (f61) null, 0), 3);
        return true;
    }

    public final void D0(ok6 ok6) {
        if (this.O && (this.n0 == null || this.o0 == null)) {
            this.n0 = new ph6(0, this);
            this.o0 = new rh6(this, (f61) null);
        }
        ph6 ph6 = this.n0;
        if (ph6 != null) {
            yr3[] yr3Arr = mk6.a;
            ok6.f(zj6.d, new h4((String) null, ph6));
        }
        rh6 rh6 = this.o0;
        if (rh6 != null) {
            yr3[] yr3Arr2 = mk6.a;
            ok6.f(zj6.e, rh6);
        }
    }

    public final boolean K0() {
        return false;
    }

    public final void N0() {
        if (this.J) {
            tp1 tp1 = rc9.O0(this).T;
            rl1 rl1 = this.i0;
            rl1.getClass();
            rl1.a = new tj1(new br4(tp1));
        }
        en4 en4 = this.p0;
        if (en4 != null) {
            en4.c = rc9.O0(this).T;
        }
        cl7 cl7 = this.q0;
        if (cl7 != null) {
            cl7.c = rc9.O0(this).T;
        }
    }

    public final Object c1(sy1 sy1, sy1 sy12) {
        zh6 zh6 = this.j0;
        Object g = zh6.g(hq4.x, new ii3((Object) sy1, (Object) zh6, (f61) null, 21), sy12);
        if (g == p81.w) {
            return g;
        }
        return vs7.a;
    }

    public final void d() {
        I();
        if (this.J) {
            tp1 tp1 = rc9.O0(this).T;
            rl1 rl1 = this.i0;
            rl1.getClass();
            rl1.a = new tj1(new br4(tp1));
        }
        en4 en4 = this.p0;
        if (en4 != null) {
            en4.c = rc9.O0(this).T;
        }
        cl7 cl7 = this.q0;
        if (cl7 != null) {
            cl7.c = rc9.O0(this).T;
        }
    }

    public final void i1(dy1 dy1) {
        ar7.H(this.h0.F(), (e81) null, (r81) null, new k05(dy1, this, (f61) null, 13), 3);
    }

    public final boolean j(KeyEvent keyEvent) {
        return false;
    }

    public final boolean n1() {
        boolean z;
        zh6 zh6 = this.j0;
        if (zh6.a.a()) {
            return true;
        }
        xf xfVar = zh6.b;
        if (xfVar != null) {
            z = xfVar.e();
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }

    public final void q1(xf xfVar, fc0 fc0, eh2 eh2, ap4 ap4, z75 z75, uh6 uh6, boolean z, boolean z2) {
        boolean z3;
        eh2 eh22;
        boolean z4 = true;
        boolean z5 = false;
        if (this.O != z) {
            this.k0.x = z;
            z3 = true;
        } else {
            z3 = false;
        }
        if (eh2 == null) {
            eh22 = this.i0;
        } else {
            eh22 = eh2;
        }
        zh6 zh6 = this.j0;
        if (!sg3.e(zh6.a, uh6)) {
            zh6.a = uh6;
            z5 = true;
        }
        zh6.b = xfVar;
        if (zh6.d != z75) {
            zh6.d = z75;
            z5 = true;
        }
        if (zh6.e != z2) {
            zh6.e = z2;
        } else {
            z4 = z5;
        }
        zh6.c = eh22;
        zh6.f = this.h0;
        s41 s41 = this.m0;
        s41.K = z75;
        s41.M = z2;
        s41.N = fc0;
        this.f0 = xfVar;
        this.g0 = eh2;
        nf6 nf6 = mh6.a;
        z75 z752 = zh6.d;
        z75 z753 = z75.w;
        if (z752 != z753) {
            z753 = z75.x;
        }
        p1(nf6, z, ap4, z753, z4);
        if (z3) {
            this.n0 = null;
            this.o0 = null;
            g75.D(this);
        }
    }

    public final void y(kk5 kk5, lk5 lk5, long j) {
        zh6 zh6;
        int i;
        kk5 kk52 = kk5;
        lk5 lk52 = lk5;
        List list = kk52.a;
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            } else if (((Boolean) this.N.y(new wk5(((qk5) list.get(i2)).i))).booleanValue()) {
                super.y(kk5, lk5, j);
                break;
            } else {
                i2++;
            }
        }
        if (this.O) {
            if (this.W == null) {
                kv2 kv2 = new kv2(this);
                V0(kv2);
                this.W = kv2;
            }
            lk5 lk53 = lk5.w;
            zh6 zh62 = this.j0;
            if (lk52 == lk53 && kk52.f == 6) {
                if (this.p0 == null) {
                    zh6 = zh62;
                    this.p0 = new en4(zh6, new f96(4, (Object) ViewConfiguration.get(su0.K(this).getContext())), new ew0(2, this, th6.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4, 1), rc9.O0(this).T);
                } else {
                    zh6 = zh62;
                }
                en4 en4 = this.p0;
                if (en4 != null) {
                    o81 J0 = J0();
                    if (en4.h == null) {
                        en4.h = ar7.H(J0, (e81) null, (r81) null, new ju1(en4, (f61) null, 23), 3);
                    }
                }
            } else {
                zh6 = zh62;
            }
            en4 en42 = this.p0;
            lk5 lk54 = lk5.x;
            if (en42 != null && kk52.f == 6) {
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        if (lk52 == lk53 && en42.d) {
                            en42.f(kk52);
                            i05.a(kk52);
                        }
                        if (lk52 == lk54 && !en42.d && en42.f(kk52)) {
                            i05.a(kk52);
                        }
                    } else if (((qk5) list.get(i3)).c()) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            if (lk52 == lk53 && ((i = kk52.f) == 10 || i == 11 || i == 12)) {
                if (this.q0 == null) {
                    this.q0 = new cl7(zh6, new ew0(2, this, th6.class, "onTrackpadScrollStopped", "onTrackpadScrollStopped-TH1AsA0(J)V", 4, 2), rc9.O0(this).T);
                }
                cl7 cl7 = this.q0;
                if (cl7 != null) {
                    o81 J02 = J0();
                    if (cl7.g == null) {
                        cl7.g = ar7.H(J02, (e81) null, (r81) null, new ng(cl7, (f61) null, 23), 3);
                    }
                }
            }
            cl7 cl72 = this.q0;
            if (cl72 != null) {
                int i4 = kk52.f;
                if (i4 == 10 || i4 == 11 || i4 == 12) {
                    int size3 = list.size();
                    int i5 = 0;
                    while (i5 < size3) {
                        if (!((qk5) list.get(i5)).c()) {
                            i5++;
                        } else {
                            return;
                        }
                    }
                    if (lk52 == lk53 && cl72.d) {
                        cl72.d(kk52);
                        i05.a(kk52);
                    }
                    if (lk52 == lk54 && !cl72.d && cl72.d(kk52)) {
                        i05.a(kk52);
                    }
                }
            }
        }
    }

    public final void h1(long j) {
    }
}
