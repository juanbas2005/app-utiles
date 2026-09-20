package defpackage;

import android.content.ClipDescription;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;

/* renamed from: ze7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ze7 {
    public final zc9 A;
    public boolean B;
    public final ps7 a;
    public v35 b = w18.a;
    public vr2 c = new tm3(9);
    public u44 d;
    public final ed5 e = u55.p(new hf7(7, 0, (String) null));
    public m78 f = g22.M;
    public sr2 g;
    public bs0 h;
    public o81 i;
    public wj5 j;
    public my2 k;
    public ok2 l;
    public final ed5 m;
    public final ed5 n;
    public long o;
    public lg7 p;
    public long q;
    public final ed5 r;
    public final ed5 s;
    public int t;
    public hf7 u;
    public zc9 v;
    public lg7 w;
    public final ed5 x;
    public final kg5 y;
    public final xe7 z;

    public ze7(ps7 ps7) {
        this.a = ps7;
        Boolean bool = Boolean.TRUE;
        this.m = u55.p(bool);
        this.n = u55.p(bool);
        this.o = 0;
        this.q = 0;
        this.r = u55.p((Object) null);
        this.s = u55.p((Object) null);
        this.t = -1;
        this.u = new hf7(7, 0, (String) null);
        this.x = u55.p(Boolean.FALSE);
        kg5 kg5 = new kg5(23, false);
        kg5.y = qj7.w;
        this.y = kg5;
        this.z = new xe7(this);
        this.A = new zc9(this);
    }

    public static final yb5 a(ze7 ze7) {
        String str;
        lg7 lg7;
        vl m2 = ze7.m();
        if (m2 == null || (str = m2.x) == null || (lg7 = ze7.w) == null) {
            return null;
        }
        long j2 = lg7.a;
        return new yb5(str, new lg7(i95.a(ze7.b.p((int) (j2 >> 32)), ze7.b.p((int) (j2 & 4294967295L)))));
    }

    public static final void b(ze7 ze7, lg7 lg7) {
        vl m2;
        String str;
        o81 o81;
        if (lg7 != null) {
            long j2 = lg7.a;
            wj5 wj5 = ze7.j;
            if (wj5 != null && (m2 = ze7.m()) != null && (str = m2.x) != null) {
                v35 v35 = ze7.b;
                long a2 = i95.a(v35.p((int) (j2 >> 32)), v35.p((int) (j2 & 4294967295L)));
                if (str.length() > 0 && !lg7.c(a2) && (o81 = ze7.i) != null) {
                    ar7.H(o81, (e81) null, (r81) null, new r41(wj5, str, a2, lg7, ze7, v35, (f61) null), 3);
                }
            }
        }
    }

    public static final long c(ze7 ze7, hf7 hf7, long j2, boolean z2, boolean z3, lj6 lj6, boolean z4, ny2 ny2) {
        cg7 d2;
        int i2;
        long j3;
        int i3;
        long j4;
        long j5;
        vl vlVar;
        jj6 jj6;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        my2 my2;
        ze7 ze72 = ze7;
        hf7 hf72 = hf7;
        u44 u44 = ze72.d;
        if (u44 == null || (d2 = u44.d()) == null) {
            return lg7.b;
        }
        v35 v35 = ze72.b;
        long j6 = hf72.b;
        vl vlVar2 = hf72.a;
        int i4 = lg7.c;
        long a2 = i95.a(v35.p((int) (j6 >> 32)), ze72.b.p((int) (j6 & 4294967295L)));
        int b2 = d2.b(false, j2);
        if (z3 || z2) {
            i2 = b2;
        } else {
            i2 = (int) (a2 >> 32);
        }
        if (!z3 || z2) {
            j3 = 4294967295L;
            i3 = b2;
        } else {
            j3 = 4294967295L;
            i3 = (int) (a2 & 4294967295L);
        }
        zc9 zc9 = ze72.v;
        int i5 = -1;
        if (z2 || zc9 == null) {
            j4 = j3;
        } else {
            j4 = j3;
            int i6 = ze72.t;
            if (i6 != -1) {
                i5 = i6;
            }
        }
        bg7 bg7 = d2.a;
        if (z2) {
            jj6 = null;
            vlVar = vlVar2;
            j5 = j6;
        } else {
            long j7 = a2;
            j5 = j6;
            int i7 = (int) (j7 >> 32);
            vlVar = vlVar2;
            int i8 = (int) (j7 & j4);
            jj6 = new jj6(new ij6(o55.j(bg7, i7), i7, 1), new ij6(o55.j(bg7, i8), i8, 1), lg7.g(j7));
        }
        boolean z11 = z3;
        zc9 zc92 = new zc9(z11, jj6, new tt2(i2, i3, i5, bg7), 4);
        if (!(jj6 == null || zc9 == null || z11 != zc9.x)) {
            tt2 tt2 = (tt2) zc9.z;
            if (i2 == tt2.b && i3 == tt2.c) {
                return j5;
            }
        }
        ze7 ze73 = ze7;
        ze73.v = zc92;
        ze73.t = b2;
        jj6 f2 = lj6.f(zc92);
        long a3 = i95.a(ze73.b.h(f2.a.b), ze73.b.h(f2.b.b));
        long j8 = j5;
        if (lg7.b(a3, j8)) {
            return j8;
        }
        if (lg7.g(a3) == lg7.g(j8) || !lg7.b(i95.a((int) (a3 & j4), (int) (a3 >> 32)), j8)) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (!lg7.c(a3) || !lg7.c(j8)) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (z4 && vlVar.x.length() > 0 && !z5 && !z6 && ny2 != null && (my2 = ze73.k) != null) {
            ((ij5) my2).a(ny2.a);
        }
        ze73.c.y(e(vlVar, a3));
        ze73.w = new lg7(a3);
        if (!z4) {
            ze73.t(!lg7.c(a3));
        }
        u44 u442 = ze73.d;
        if (u442 != null) {
            u442.q.setValue(Boolean.valueOf(z4));
        }
        u44 u443 = ze73.d;
        if (u443 != null) {
            if (lg7.c(a3) || !k75.m(ze73, true)) {
                z10 = false;
            } else {
                z10 = true;
            }
            u443.m.setValue(Boolean.valueOf(z10));
        }
        u44 u444 = ze73.d;
        if (u444 != null) {
            if (!lg7.c(a3)) {
                z7 = false;
                if (k75.m(ze73, false)) {
                    z9 = true;
                    u444.n.setValue(Boolean.valueOf(z9));
                }
            } else {
                z7 = false;
            }
            z9 = z7;
            u444.n.setValue(Boolean.valueOf(z9));
        } else {
            z7 = false;
        }
        u44 u445 = ze73.d;
        if (u445 != null) {
            if (!lg7.c(a3) || !k75.m(ze73, true)) {
                z8 = z7;
            } else {
                z8 = true;
            }
            u445.o.setValue(Boolean.valueOf(z8));
        }
        return a3;
    }

    public static hf7 e(vl vlVar, long j2) {
        return new hf7(vlVar, j2, (lg7) null);
    }

    public final h27 d(boolean z2) {
        o81 o81 = this.i;
        if (o81 == null) {
            return null;
        }
        return ar7.H(o81, (e81) null, r81.z, new a23(this, z2, (f61) null, 2), 1);
    }

    public final void f() {
        o81 o81 = this.i;
        if (o81 != null) {
            ar7.H(o81, (e81) null, r81.z, new te7(this, (f61) null, 1), 1);
        }
    }

    public final void g(l35 l35) {
        ey2 ey2;
        cg7 cg7;
        int i2;
        if (!lg7.c(n().b)) {
            u44 u44 = this.d;
            if (u44 != null) {
                cg7 = u44.d();
            } else {
                cg7 = null;
            }
            if (l35 == null || cg7 == null) {
                i2 = lg7.e(n().b);
            } else {
                i2 = this.b.h(cg7.b(true, l35.a));
            }
            hf7 a2 = hf7.a(n(), (vl) null, i95.a(i2, i2), 5);
            this.c.y(a2);
            this.w = new lg7(a2.b);
        }
        if (l35 == null || n().a.x.length() <= 0) {
            ey2 = ey2.w;
        } else {
            ey2 = ey2.y;
        }
        q(ey2);
        t(false);
    }

    public final void h(boolean z2) {
        ok2 ok2;
        u44 u44 = this.d;
        if (!(u44 == null || u44.b() || (ok2 = this.l) == null)) {
            ok2.a(ok2);
        }
        this.u = n();
        t(z2);
        q(ey2.x);
    }

    public final l35 i() {
        return (l35) this.s.getValue();
    }

    public final boolean j() {
        return ((Boolean) this.m.getValue()).booleanValue();
    }

    public final boolean k() {
        return ((Boolean) this.n.getValue()).booleanValue();
    }

    public final long l(boolean z2) {
        cg7 d2;
        long j2;
        int i2;
        boolean z3;
        int i3;
        float f2;
        u44 u44 = this.d;
        if (u44 == null || (d2 = u44.d()) == null) {
            return 9205357640488583168L;
        }
        bg7 bg7 = d2.a;
        pn4 pn4 = bg7.b;
        vl m2 = m();
        if (m2 == null) {
            return 9205357640488583168L;
        }
        if (!sg3.e(m2.x, bg7.a.a.x)) {
            return 9205357640488583168L;
        }
        hf7 n2 = n();
        if (z2) {
            long j3 = n2.b;
            int i4 = lg7.c;
            j2 = j3 >> 32;
        } else {
            long j4 = n2.b;
            int i5 = lg7.c;
            j2 = j4 & 4294967295L;
        }
        int p2 = this.b.p((int) j2);
        boolean g2 = lg7.g(n().b);
        long j5 = bg7.c;
        int d3 = pn4.d(p2);
        if (d3 >= pn4.f) {
            return 9205357640488583168L;
        }
        if ((!z2 || g2) && (z2 || !g2)) {
            i2 = Math.max(p2 - 1, 0);
        } else {
            i2 = p2;
        }
        if (bg7.a(i2) == bg7.h(p2)) {
            z3 = true;
        } else {
            z3 = false;
        }
        pn4.l(p2);
        int length = ((vl) pn4.a.x).x.length();
        ArrayList arrayList = pn4.h;
        if (p2 == length) {
            i3 = sg3.x(arrayList);
        } else {
            i3 = tf4.p(p2, arrayList);
        }
        jc5 jc5 = (jc5) arrayList.get(i3);
        zg zgVar = jc5.a;
        int d4 = jc5.d(p2);
        zf7 zf7 = zgVar.d;
        if (z3) {
            f2 = zf7.j(d4, false);
        } else {
            f2 = zf7.k(d4, false);
        }
        float o2 = z65.o(f2, 0.0f, (float) ((int) (j5 >> 32)));
        return (((long) Float.floatToRawIntBits(z65.o(pn4.b(d3), 0.0f, (float) ((int) (j5 & 4294967295L))))) & 4294967295L) | (((long) Float.floatToRawIntBits(o2)) << 32);
    }

    public final vl m() {
        u44 u44 = this.d;
        if (u44 != null) {
            return u44.a.a;
        }
        return null;
    }

    public final hf7 n() {
        return (hf7) this.e.getValue();
    }

    public final void o() {
        h27 h27;
        qd7 qd7 = (qd7) this.y.x;
        if (qd7 != null && (h27 = qd7.Q) != null) {
            h27.o((CancellationException) null);
            qd7.Q = null;
        }
    }

    public final void p() {
        o81 o81 = this.i;
        if (o81 != null) {
            ar7.H(o81, (e81) null, r81.z, new te7(this, (f61) null, 2), 1);
        }
    }

    public final void q(ey2 ey2) {
        u44 u44 = this.d;
        if (u44 != null) {
            if (u44.a() == ey2) {
                u44 = null;
            }
            if (u44 != null) {
                u44.k.setValue(ey2);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void r() {
        vr2 vr2;
        u44 u44;
        jd7 jd7;
        ix6 h2 = j45.h();
        if (h2 != null) {
            vr2 = h2.e();
        } else {
            vr2 = null;
        }
        ix6 j2 = j45.j(h2);
        try {
            if (!k() || ((u44 = this.d) != null && !((Boolean) u44.q.getValue()).booleanValue())) {
                j45.m(h2, j2, vr2);
                return;
            }
            j45.m(h2, j2, vr2);
            kg5 kg5 = this.y;
            if (((qj7) kg5.y) == qj7.w) {
                bc3.c("ToolbarRequester is not initialized.");
            }
            qd7 qd7 = (qd7) kg5.x;
            if (qd7 != null && qd7.J) {
                h27 h27 = qd7.Q;
                if ((h27 == null || !h27.l()) && (jd7 = (jd7) h49.w(qd7, kd7.b)) != null) {
                    qd7.Q = ar7.H(qd7.J0(), (e81) null, r81.z, new pd7(qd7, jd7, (f61) null, 0), 1);
                }
            }
        } catch (Throwable th) {
            j45.m(h2, j2, vr2);
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object s(h61 h61) {
        ye7 ye7;
        int i2;
        boolean z2;
        if (h61 instanceof ye7) {
            ye7 = (ye7) h61;
            int i3 = ye7.C;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ye7.C = i3 - Integer.MIN_VALUE;
                Object obj = ye7.A;
                i2 = ye7.C;
                if (i2 != 0) {
                    o85.q(obj);
                    bs0 bs0 = this.h;
                    if (bs0 != null) {
                        ye7.z = this;
                        ye7.C = 1;
                        ClipDescription primaryClipDescription = ((sd) bs0).a.a().getPrimaryClipDescription();
                        if (primaryClipDescription == null) {
                            z2 = false;
                        } else {
                            z2 = primaryClipDescription.hasMimeType("text/*");
                        }
                        obj = Boolean.valueOf(z2);
                        p81 p81 = p81.w;
                        if (obj == p81) {
                            return p81;
                        }
                    }
                    return vs7.a;
                } else if (i2 == 1) {
                    this = ye7.z;
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Boolean bool = (Boolean) obj;
                bool.getClass();
                this.x.setValue(bool);
                return vs7.a;
            }
        }
        ye7 = new ye7(this, h61);
        Object obj2 = ye7.A;
        i2 = ye7.C;
        if (i2 != 0) {
        }
        Boolean bool2 = (Boolean) obj2;
        bool2.getClass();
        this.x.setValue(bool2);
        return vs7.a;
    }

    public final void t(boolean z2) {
        u44 u44 = this.d;
        if (u44 != null) {
            u44.l.setValue(Boolean.valueOf(z2));
        }
        if (z2) {
            r();
        } else {
            o();
        }
    }
}
