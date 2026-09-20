package defpackage;

import android.os.Trace;
import java.util.HashMap;

/* renamed from: sg7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sg7 extends ll4 implements my3, gz1, dk6 {
    public String K;
    public tg7 L;
    public dl2 M;
    public int N;
    public boolean O;
    public int P;
    public int Q;
    public HashMap R;
    public mc5 S;
    public qg7 T;
    public rg7 U;

    public final void D0(ok6 ok6) {
        qg7 qg7 = this.T;
        if (qg7 == null) {
            qg7 = new qg7(this, 0);
            this.T = qg7;
        }
        vl vlVar = new vl(this.K);
        yr3[] yr3Arr = mk6.a;
        ok6.f(jk6.C, sg3.D(vlVar));
        rg7 rg7 = this.U;
        if (rg7 != null) {
            boolean z = rg7.c;
            nk6 nk6 = jk6.E;
            yr3[] yr3Arr2 = mk6.a;
            yr3 yr3 = yr3Arr2[17];
            ok6.f(nk6, Boolean.valueOf(z));
            vl vlVar2 = new vl(rg7.b);
            nk6 nk62 = jk6.D;
            yr3 yr32 = yr3Arr2[16];
            ok6.f(nk62, vlVar2);
        }
        ok6.f(zj6.l, new h4((String) null, new qg7(this, 1)));
        ok6.f(zj6.m, new h4((String) null, new qg7(this, 2)));
        ok6.f(zj6.n, new h4((String) null, new fd7(4, (Object) this)));
        mk6.a(ok6, qg7);
    }

    public final boolean K0() {
        return false;
    }

    public final mc5 V0() {
        tg7 tg7 = this.L;
        if (this.S == null) {
            this.S = new mc5(this.K, tg7, this.M, this.N, this.O, this.P, this.Q);
        }
        mc5 mc5 = this.S;
        mc5.getClass();
        return mc5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        if (r3 != null) goto L_0x0014;
     */
    public final int Z(dd4 dd4, gh4 gh4, int i) {
        mc5 mc5;
        rg7 rg7 = this.U;
        if (rg7 != null) {
            if (!rg7.c) {
                rg7 = null;
            }
            if (rg7 != null) {
                mc5 = rg7.d;
            }
        }
        mc5 = V0();
        mc5.d(dd4);
        return mc5.a(i, dd4.getLayoutDirection());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        if (r0 != null) goto L_0x0019;
     */
    public final mh4 c(oh4 oh4, gh4 gh4, long j) {
        mc5 mc5;
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            rg7 rg7 = this.U;
            if (rg7 != null) {
                if (!rg7.c) {
                    rg7 = null;
                }
                if (rg7 != null) {
                    mc5 = rg7.d;
                }
            }
            mc5 = V0();
            mc5.d(oh4);
            boolean b = mc5.b(j, oh4.getLayoutDirection());
            lc5 lc5 = mc5.n;
            if (lc5 != null) {
                lc5.b();
            }
            zg zgVar = mc5.j;
            zgVar.getClass();
            zf7 zf7 = zgVar.d;
            long j2 = mc5.l;
            if (b) {
                su0.A(this);
                HashMap hashMap = this.R;
                if (hashMap == null) {
                    hashMap = new HashMap(2);
                    this.R = hashMap;
                }
                hashMap.put(nb.a, Integer.valueOf(Math.round(zf7.d(0))));
                hashMap.put(nb.b, Integer.valueOf(Math.round(zf7.d(zf7.g - 1))));
            }
            int i = (int) (j2 >> 32);
            int i2 = (int) (j2 & 4294967295L);
            eh5 y = gh4.y(x91.x(i, i, i2, i2));
            HashMap hashMap2 = this.R;
            hashMap2.getClass();
            return oh4.d0(i, i2, hashMap2, new ws(y, 15));
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        if (r2 != null) goto L_0x0014;
     */
    public final int f(dd4 dd4, gh4 gh4, int i) {
        mc5 mc5;
        rg7 rg7 = this.U;
        if (rg7 != null) {
            if (!rg7.c) {
                rg7 = null;
            }
            if (rg7 != null) {
                mc5 = rg7.d;
            }
        }
        mc5 = V0();
        mc5.d(dd4);
        return l55.f(mc5.e(dd4.getLayoutDirection()).e());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        if (r3 != null) goto L_0x0014;
     */
    public final int i0(dd4 dd4, gh4 gh4, int i) {
        mc5 mc5;
        rg7 rg7 = this.U;
        if (rg7 != null) {
            if (!rg7.c) {
                rg7 = null;
            }
            if (rg7 != null) {
                mc5 = rg7.d;
            }
        }
        mc5 = V0();
        mc5.d(dd4);
        return mc5.a(i, dd4.getLayoutDirection());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        if (r0 != null) goto L_0x001a;
     */
    public final void p0(wy3 wy3) {
        mc5 mc5;
        if (this.J) {
            rg7 rg7 = this.U;
            if (rg7 != null) {
                if (!rg7.c) {
                    rg7 = null;
                }
                if (rg7 != null) {
                    mc5 = rg7.d;
                }
            }
            mc5 = V0();
            zg zgVar = mc5.j;
            if (zgVar != null) {
                qk0 D = wy3.w.x.D();
                boolean z = mc5.k;
                if (z) {
                    long j = mc5.l;
                    D.h();
                    D.n(0.0f, 0.0f, (float) ((int) (j >> 32)), (float) ((int) (j & 4294967295L)), 1);
                }
                try {
                    tg7 tg7 = this.L;
                    yy6 yy6 = tg7.a;
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
                    kc0 c = yy6.a.c();
                    if (c != null) {
                        zgVar.g(D, c, tg7.a.a.a(), lq62, rd72, iz12);
                    } else {
                        long j2 = jt0.g;
                        if (j2 == 16) {
                            if (tg7.b() != 16) {
                                j2 = tg7.b();
                            } else {
                                j2 = jt0.b;
                            }
                        }
                        zgVar.f(D, j2, lq62, rd72, iz12);
                    }
                    if (z) {
                        D.p();
                    }
                } catch (Throwable th) {
                    Throwable th2 = th;
                    if (z) {
                        D.p();
                    }
                    throw th2;
                }
            } else {
                mc5 mc52 = this.S;
                rg7 rg72 = this.U;
                bc3.b("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + mc52 + ", textSubstitution=" + rg72 + ")");
                ta1.e();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        if (r2 != null) goto L_0x0014;
     */
    public final int s0(dd4 dd4, gh4 gh4, int i) {
        mc5 mc5;
        rg7 rg7 = this.U;
        if (rg7 != null) {
            if (!rg7.c) {
                rg7 = null;
            }
            if (rg7 != null) {
                mc5 = rg7.d;
            }
        }
        mc5 = V0();
        mc5.d(dd4);
        return l55.f(mc5.e(dd4.getLayoutDirection()).d());
    }
}
