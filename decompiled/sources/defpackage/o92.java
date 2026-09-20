package defpackage;

import java.util.WeakHashMap;

/* renamed from: o92  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class o92 {
    public final /* synthetic */ ok2 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ aq4 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ gy6 g;
    public final /* synthetic */ aq4 h;
    public final /* synthetic */ vr2 i;
    public final /* synthetic */ bd5 j;
    public final /* synthetic */ bd5 k;

    public o92(ok2 ok2, boolean z, aq4 aq4, String str, String str2, String str3, gy6 gy6, aq4 aq42, vr2 vr2, bd5 bd5, bd5 bd52) {
        this.a = ok2;
        this.b = z;
        this.c = aq4;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = gy6;
        this.h = aq42;
        this.i = vr2;
        this.j = bd5;
        this.k = bd52;
    }

    public static ml4 b(o92 o92, ml4 ml4) {
        ml4 s = uq3.s(ml4, o92.a);
        aq4 aq4 = o92.h;
        ml4 d2 = s.d(new e92(new wi(aq4, 22)));
        boolean z = o92.b;
        m92 m92 = new m92(o92.i, aq4, z);
        aq4 aq42 = o92.c;
        String str = o92.d;
        String str2 = o92.e;
        String str3 = o92.f;
        gy6 gy6 = o92.g;
        return d2.d(ck6.a(t49.V(d97.a(jl4.w, m92, new wf(2, m92)), new e3(m92, z, aq42)), false, new m0(z, str, str2, str3, m92, gy6)));
    }

    public final void a(boolean z, sr2 sr2, ml4 ml4, gh6 gh6, boolean z2, pq6 pq6, long j2, float f2, fw0 fw0, yt2 yt2, int i2, int i3) {
        int i4;
        int i5;
        boolean z3;
        float f3;
        long j3;
        pq6 pq62;
        boolean z4;
        gh6 gh62;
        ml4 ml42;
        gh6 gh63;
        boolean z5;
        jl4 jl4;
        ml4 ml43;
        boolean z6;
        ml4 ml44;
        int i6;
        int i7;
        boolean z7 = z;
        yt2 yt22 = yt2;
        yt22.g0(-126848451);
        int i8 = 2;
        if (yt22.h(z7)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i9 = i2 | i4 | 919168384;
        fw0 fw02 = fw0;
        if ((i3 & 6) == 0) {
            if (yt22.i(fw02)) {
                i8 = 4;
            }
            i5 = i3 | i8;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            if (yt22.g(this)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i5 |= i7;
        }
        if ((306783379 & i9) == 306783378 && (i5 & 19) == 18) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (yt22.V(i9 & 1, z3)) {
            yt22.a0();
            if ((i2 & 1) == 0 || yt22.C()) {
                gh6 Y = t49.Y(yt22);
                float f4 = ui4.a;
                pq6 a2 = hr6.a(uq3.e, yt22);
                long e2 = st0.e(uq3.c, yt22);
                float f5 = ui4.a;
                pq62 = a2;
                jl4 = jl4.w;
                j3 = e2;
                z5 = true;
                f3 = f5;
                gh63 = Y;
            } else {
                yt22.Y();
                jl4 = ml4;
                gh63 = gh6;
                z5 = z2;
                pq62 = pq6;
                j3 = j2;
                f3 = f2;
            }
            yt22.s();
            Object Q = yt22.Q();
            d63 d63 = ay0.a;
            if (Q == d63) {
                ed5 ed5 = new ed5(vs7.a, d63.G);
                yt22.o0(ed5);
                Q = ed5;
            }
            aq4 aq4 = (aq4) Q;
            tp1 tp1 = (tp1) yt22.k(xy0.h);
            WeakHashMap weakHashMap = ib8.w;
            int i10 = n63.h(yt22).f.e().b;
            if (z7) {
                yt22.e0(629975788);
                Object Q2 = yt22.Q();
                if (Q2 == d63) {
                    ml43 = jl4;
                    Q2 = new wi(aq4, 21);
                    yt22.o0(Q2);
                } else {
                    ml43 = jl4;
                }
                ie1.g((sr2) Q2, yt22, 6);
                yt22.r(false);
            } else {
                ml43 = jl4;
                yt22.e0(630061317);
                yt22.r(false);
            }
            Object Q3 = yt22.Q();
            if (Q3 == d63) {
                Q3 = new dq4(Boolean.FALSE);
                yt22.o0(Q3);
            }
            dq4 dq4 = (dq4) Q3;
            boolean z8 = z5;
            dq4.y.setValue(Boolean.valueOf(z7));
            if (((Boolean) dq4.x.getValue()).booleanValue() || ((Boolean) dq4.y.getValue()).booleanValue()) {
                yt22.e0(630372588);
                boolean g2 = yt22.g(tp1) | yt22.e(i10);
                Object Q4 = yt22.Q();
                if (g2 || Q4 == d63) {
                    Q4 = new p92(i10, tp1, aq4);
                    yt22.o0(Q4);
                }
                p92 p92 = (p92) Q4;
                ((g92) this.h.getValue()).getClass();
                ((Boolean) this.c.getValue()).getClass();
                if (!((Boolean) b96.N(0, 7, yt22).getValue()).booleanValue()) {
                    i6 = 393248;
                } else {
                    i6 = 393216;
                }
                z6 = z8;
                dq4 dq42 = dq4;
                ml44 = ml43;
                vh.a(p92, sr2, new tl5(i6, true), su0.J(2063119149, new h92(this, ml44, z6, dq42, p92, gh63, pq62, j3, f3, fw02), yt22), yt22, 3120, 0);
                yt22.r(false);
            } else {
                yt22.e0(631534437);
                yt22.r(false);
                ml44 = ml43;
                z6 = z8;
            }
            ml42 = ml44;
            gh62 = gh63;
            z4 = z6;
        } else {
            yt22.Y();
            ml42 = ml4;
            gh62 = gh6;
            z4 = z2;
            pq62 = pq6;
            j3 = j2;
            f3 = f2;
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new i92(this, z7, sr2, ml42, gh62, z4, pq62, j3, f3, fw0, i2, i3);
        }
    }
}
