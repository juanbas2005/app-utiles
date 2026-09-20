package defpackage;

import java.util.List;

/* renamed from: c03  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class c03 {
    public final dy3 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final lp4 f = new lp4();
    public final c05 g = new c05();
    public final dp4 h = new dp4(10);

    public c03(dy3 dy3) {
        this.a = dy3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: rz4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r16v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    public final void a(long j, List list, boolean z) {
        dp4 dp4;
        long[] jArr;
        int i;
        long[] jArr2;
        rz4 rz4;
        rz4 rz42;
        long j2 = j;
        int size = list.size();
        c05 c05 = this.g;
        rz4 rz43 = c05;
        boolean z2 = true;
        int i2 = 0;
        while (true) {
            dp4 = this.h;
            if (i2 >= size) {
                break;
            }
            ll4 ll4 = (ll4) list.get(i2);
            if (ll4.J) {
                ll4.I = new ae(5, this, ll4);
                if (z2) {
                    eq4 eq4 = rz43.a;
                    Object[] objArr = eq4.w;
                    int i3 = eq4.y;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            rz42 = null;
                            break;
                        }
                        ? r16 = objArr[i4];
                        if (sg3.e(r16.c, ll4)) {
                            rz42 = r16;
                            break;
                        }
                        i4++;
                    }
                    rz4 = rz42;
                    if (rz4 != null) {
                        rz4.i = true;
                        rz4.d.b(j2);
                        if (z) {
                            Object d2 = dp4.d(j2);
                            if (d2 == null) {
                                d2 = new lp4();
                                dp4.g(j2, d2);
                            }
                            ((lp4) d2).a(rz4);
                        }
                        rz43 = rz4;
                    } else {
                        z2 = false;
                    }
                }
                rz4 = new rz4(ll4);
                rz4.d.b(j2);
                if (z) {
                    Object d3 = dp4.d(j2);
                    if (d3 == null) {
                        d3 = new lp4();
                        dp4.g(j2, d3);
                    }
                    ((lp4) d3).a(rz4);
                }
                rz43.a.b(rz4);
                rz43 = rz4;
            }
            i2++;
        }
        if (z) {
            long[] jArr3 = dp4.b;
            Object[] objArr2 = dp4.c;
            long[] jArr4 = dp4.a;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i5 = 0;
                while (true) {
                    long j3 = jArr4[i5];
                    if ((((~j3) << 7) & j3 & -9187201950435737472L) != -9187201950435737472L) {
                        int i6 = 8;
                        int i7 = 8 - ((~(i5 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((255 & j3) < 128) {
                                int i9 = (i5 << 3) + i8;
                                long j4 = jArr3[i9];
                                lp4 lp4 = (lp4) objArr2[i9];
                                eq4 eq42 = c05.a;
                                i = i6;
                                Object[] objArr3 = eq42.w;
                                int i10 = eq42.y;
                                jArr2 = jArr3;
                                for (int i11 = 0; i11 < i10; i11++) {
                                    ((rz4) objArr3[i11]).f(j4, lp4);
                                }
                            } else {
                                jArr2 = jArr3;
                                i = i6;
                            }
                            j3 >>= i;
                            i8++;
                            i6 = i;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        if (i7 != i6) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                    jArr3 = jArr;
                }
            }
        }
        dp4.a();
    }

    public final boolean b(hv2 hv2, boolean z) {
        dy3 dy3 = this.a;
        c05 c05 = this.g;
        boolean a2 = c05.a((vc4) hv2.y, dy3, hv2, z);
        eq4 eq4 = c05.a;
        if (!a2) {
            return false;
        }
        boolean z2 = true;
        this.b = true;
        Object[] objArr = eq4.w;
        int i = eq4.y;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            if (((rz4) objArr[i2]).e(hv2, z) || z3) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        Object[] objArr2 = eq4.w;
        int i3 = eq4.y;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            if (((rz4) objArr2[i4]).d(hv2) || z4) {
                z4 = true;
            } else {
                z4 = false;
            }
        }
        c05.b(hv2);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.b = false;
        if (this.e) {
            this.e = false;
            lp4 lp4 = this.f;
            int i5 = lp4.b;
            for (int i6 = 0; i6 < i5; i6++) {
                d((ll4) lp4.f(i6));
            }
            lp4.d();
        }
        if (this.c) {
            this.c = false;
            c();
        }
        if (this.d) {
            this.d = false;
            c05.a.g();
        }
        return z2;
    }

    public final void c() {
        if (this.b) {
            this.c = true;
            return;
        }
        c05 c05 = this.g;
        eq4 eq4 = c05.a;
        Object[] objArr = eq4.w;
        int i = eq4.y;
        for (int i2 = 0; i2 < i; i2++) {
            ((rz4) objArr[i2]).c();
        }
        if (this.d) {
            this.d = true;
        } else {
            c05.a.g();
        }
    }

    public final void d(ll4 ll4) {
        if (this.b) {
            this.e = true;
            this.f.a(ll4);
            return;
        }
        c05 c05 = this.g;
        lp4 lp4 = c05.b;
        lp4.d();
        lp4.a(c05);
        while (lp4.i()) {
            c05 c052 = (c05) lp4.k(lp4.b - 1);
            int i = 0;
            while (true) {
                eq4 eq4 = c052.a;
                if (i < eq4.y) {
                    rz4 rz4 = (rz4) eq4.w[i];
                    if (sg3.e(rz4.c, ll4)) {
                        c052.a.k(rz4);
                        rz4.c();
                    } else {
                        lp4.a(rz4);
                        i++;
                    }
                }
            }
        }
    }
}
