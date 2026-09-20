package defpackage;

import android.os.Trace;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: nc7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nc7 extends ll4 implements my3, gz1, dk6 {
    public vl K;
    public tg7 L;
    public dl2 M;
    public vr2 N;
    public int O;
    public boolean P;
    public int Q;
    public int R;
    public List S;
    public vr2 T;
    public vr2 U;
    public Map V;
    public rn4 W;
    public lc7 X;
    public mc7 Y;

    public final void D0(ok6 ok6) {
        lc7 lc7 = this.X;
        if (lc7 == null) {
            lc7 = new lc7(this, 0);
            this.X = lc7;
        }
        vl vlVar = this.K;
        yr3[] yr3Arr = mk6.a;
        ok6.f(jk6.C, sg3.D(vlVar));
        mc7 mc7 = this.Y;
        if (mc7 != null) {
            vl vlVar2 = mc7.b;
            nk6 nk6 = jk6.D;
            yr3[] yr3Arr2 = mk6.a;
            yr3 yr3 = yr3Arr2[16];
            ok6.f(nk6, vlVar2);
            boolean z = mc7.c;
            nk6 nk62 = jk6.E;
            yr3 yr32 = yr3Arr2[17];
            ok6.f(nk62, Boolean.valueOf(z));
        }
        ok6.f(zj6.l, new h4((String) null, new lc7(this, 1)));
        ok6.f(zj6.m, new h4((String) null, new lc7(this, 2)));
        ok6.f(zj6.n, new h4((String) null, new hx4(29, this)));
        mk6.a(ok6, lc7);
    }

    public final boolean K0() {
        return false;
    }

    public final rn4 V0() {
        if (this.W == null) {
            this.W = new rn4(this.K, this.L, this.M, this.O, this.P, this.Q, this.R, this.S);
        }
        rn4 rn4 = this.W;
        rn4.getClass();
        return rn4;
    }

    public final rn4 W0(tp1 tp1) {
        rn4 rn4;
        mc7 mc7 = this.Y;
        if (mc7 == null || !mc7.c || (rn4 = mc7.d) == null) {
            rn4 V0 = V0();
            V0.d(tp1);
            return V0;
        }
        rn4.d(tp1);
        return rn4;
    }

    public final int Z(dd4 dd4, gh4 gh4, int i) {
        return W0(dd4).a(i, dd4.getLayoutDirection());
    }

    public final mh4 c(oh4 oh4, gh4 gh4, long j) {
        Trace.beginSection("TextAnnotatedStringNode:measure");
        try {
            rn4 W0 = W0(oh4);
            boolean c = W0.c(j, oh4.getLayoutDirection());
            bg7 bg7 = W0.n;
            if (bg7 != null) {
                long j2 = bg7.c;
                bg7.b.a.b();
                if (c) {
                    su0.A(this);
                    vr2 vr2 = this.N;
                    if (vr2 != null) {
                        vr2.y(bg7);
                    }
                    Map map = this.V;
                    if (map == null) {
                        map = new LinkedHashMap(2);
                    }
                    map.put(nb.a, Integer.valueOf(Math.round(bg7.d)));
                    map.put(nb.b, Integer.valueOf(Math.round(bg7.e)));
                    this.V = map;
                }
                vr2 vr22 = this.T;
                if (vr22 != null) {
                    vr22.y(bg7.f);
                }
                int i = (int) (j2 >> 32);
                int i2 = (int) (j2 & 4294967295L);
                eh5 y = gh4.y(x91.x(i, i, i2, i2));
                Map map2 = this.V;
                map2.getClass();
                return oh4.d0(i, i2, map2, new ws(y, 12));
            }
            throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: " + W0);
        } finally {
            Trace.endSection();
        }
    }

    public final int f(dd4 dd4, gh4 gh4, int i) {
        return l55.f(W0(dd4).e(dd4.getLayoutDirection()).e());
    }

    public final int i0(dd4 dd4, gh4 gh4, int i) {
        return W0(dd4).a(i, dd4.getLayoutDirection());
    }

    public final void p0(wy3 wy3) {
        boolean z;
        List list;
        if (this.J) {
            qk0 D = wy3.w.x.D();
            rn4 W0 = W0(wy3);
            bg7 bg7 = W0.n;
            if (bg7 != null) {
                bg7 bg72 = bg7;
                pn4 pn4 = bg72.b;
                boolean z2 = false;
                if (!bg72.d() || this.O == 3) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    long j = bg72.c;
                    ly5 c = z85.c(0, (((long) Float.floatToRawIntBits((float) ((int) (j >> 32)))) << 32) | (((long) Float.floatToRawIntBits((float) ((int) (j & 4294967295L)))) & 4294967295L));
                    D.h();
                    qk0.q(D, c);
                }
                try {
                    yy6 yy6 = this.L.a;
                    rd7 rd7 = yy6.m;
                    if (rd7 == null) {
                        rd7 = rd7.b;
                    }
                    rd7 rd72 = rd7;
                    lq6 lq6 = yy6.n;
                    if (lq6 == null) {
                        lq6 = lq6.d;
                    }
                    lq6 lq62 = lq6;
                    iz1 iz1 = yy6.p;
                    if (iz1 == null) {
                        iz1 = rd2.a;
                    }
                    iz1 iz12 = iz1;
                    kc0 c2 = yy6.a.c();
                    if (c2 != null) {
                        pn4.j(D, c2, this.L.a.a.a(), lq62, rd72, iz12);
                    } else {
                        long j2 = jt0.g;
                        if (j2 == 16) {
                            if (this.L.b() != 16) {
                                j2 = this.L.b();
                            } else {
                                j2 = jt0.b;
                            }
                        }
                        pn4.i(D, j2, lq62, rd72, iz12);
                    }
                    if (z) {
                        D.p();
                    }
                    mc7 mc7 = this.Y;
                    if (mc7 == null || !mc7.c) {
                        z2 = i35.j(this.K);
                    }
                    if (z2 || ((list = this.S) != null && !list.isEmpty())) {
                        wy3.a();
                    }
                } catch (Throwable th) {
                    Throwable th2 = th;
                    if (z) {
                        D.p();
                    }
                    throw th2;
                }
            } else {
                ku4.t("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: ", W0);
            }
        }
    }

    public final int s0(dd4 dd4, gh4 gh4, int i) {
        return l55.f(W0(dd4).e(dd4.getLayoutDirection()).d());
    }
}
