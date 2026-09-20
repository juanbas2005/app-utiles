package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: rz4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rz4 extends c05 {
    public final ll4 c;
    public final qa d;
    public final vc4 e = new vc4(2);
    public xz4 f;
    public kk5 g;
    public boolean h;
    public boolean i = true;
    public boolean j = true;

    public rz4(ll4 ll4) {
        this.c = ll4;
        qa qaVar = new qa(7, (byte) 0);
        qaVar.y = new long[2];
        this.d = qaVar;
    }

    public final boolean a(vc4 vc4, dy3 dy3, hv2 hv2, boolean z) {
        qa qaVar;
        vc4 vc42;
        Object obj;
        boolean z2;
        boolean z3;
        kk5 kk5;
        int i2;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int i3;
        int i4;
        boolean z8;
        int i5;
        boolean z9;
        qk5 qk5;
        int i6;
        vc4 vc43 = vc4;
        dy3 dy32 = dy3;
        hv2 hv22 = hv2;
        boolean a = super.a(vc4, dy3, hv2, z);
        ll4 ll4 = this.c;
        boolean z10 = true;
        if (ll4.J) {
            eq4 eq4 = null;
            while (ll4 != null) {
                if (ll4 instanceof tk5) {
                    this.f = rc9.M0((tk5) ll4, 16);
                } else if ((ll4.y & 16) != 0 && (ll4 instanceof wo1)) {
                    int i7 = 0;
                    for (ll4 ll42 = ((wo1) ll4).L; ll42 != null; ll42 = ll42.B) {
                        if ((ll42.y & 16) != 0) {
                            i7++;
                            if (i7 == 1) {
                                ll4 = ll42;
                            } else {
                                if (eq4 == null) {
                                    eq4 = new eq4(new ll4[16]);
                                }
                                if (ll4 != null) {
                                    eq4.b(ll4);
                                    ll4 = null;
                                }
                                eq4.b(ll42);
                            }
                        }
                    }
                    if (i7 == 1) {
                    }
                }
                ll4 = rc9.j(eq4);
            }
            if (this.f != null) {
                int g2 = vc43.g();
                int i8 = 0;
                while (true) {
                    qaVar = this.d;
                    vc42 = this.e;
                    if (i8 >= g2) {
                        break;
                    }
                    long d2 = vc43.d(i8);
                    qk5 qk52 = (qk5) vc43.h(i8);
                    if (qaVar.d(d2)) {
                        boolean z11 = z10;
                        long j2 = qk52.g;
                        long j3 = qk52.c;
                        if ((((j2 & 9223372034707292159L) + 36028792732385279L) & -9223372034707292160L) == 0 && (((j3 & 9223372034707292159L) + 36028792732385279L) & -9223372034707292160L) == 0) {
                            z9 = z11;
                            z8 = a;
                            ArrayList arrayList = new ArrayList(qk52.b().size());
                            List b = qk52.b();
                            i5 = g2;
                            int size = b.size();
                            i4 = i8;
                            int i9 = 0;
                            while (i9 < size) {
                                List list = b;
                                b03 b03 = (b03) b.get(i9);
                                vc4 vc44 = vc42;
                                long j4 = d2;
                                long j5 = b03.b;
                                if ((((j5 & 9223372034707292159L) + 36028792732385279L) & -9223372034707292160L) == 0) {
                                    qk5 = qk52;
                                    long j6 = b03.a;
                                    i6 = size;
                                    xz4 xz4 = this.f;
                                    xz4.getClass();
                                    arrayList.add(new b03(j6, xz4.O(dy32, j5), b03.c, b03.d, b03.e));
                                } else {
                                    i6 = size;
                                    qk5 = qk52;
                                }
                                i9++;
                                size = i6;
                                b = list;
                                vc42 = vc44;
                                d2 = j4;
                                qk52 = qk5;
                            }
                            vc4 vc45 = vc42;
                            long j7 = d2;
                            qk5 qk53 = qk52;
                            xz4 xz42 = this.f;
                            xz42.getClass();
                            long O = xz42.O(dy32, j2);
                            xz4 xz43 = this.f;
                            xz43.getClass();
                            long O2 = xz43.O(dy32, j3);
                            long j8 = qk52.a;
                            long j9 = qk52.b;
                            boolean z12 = qk52.d;
                            long j10 = qk52.f;
                            boolean z13 = qk52.h;
                            int i10 = qk52.i;
                            long j11 = j8;
                            long j12 = qk52.j;
                            float f2 = qk52.e;
                            qk5 qk54 = new qk5(j11, j9, O2, z12, f2, j10, O, z13, i10, arrayList, j12, qk52.k, qk52.l, qk52.n);
                            qk5 qk55 = qk52.q;
                            if (qk55 == null) {
                                qk55 = qk52;
                            }
                            qk54.q = qk55;
                            qk5 qk56 = qk52.q;
                            if (qk56 != null) {
                                qk52 = qk56;
                            }
                            qk54.q = qk52;
                            vc45.e(j7, qk54);
                        } else {
                            z8 = a;
                            i5 = g2;
                            i4 = i8;
                            z9 = z11;
                        }
                    } else {
                        z8 = a;
                        i5 = g2;
                        z9 = z10;
                        i4 = i8;
                    }
                    i8 = i4 + 1;
                    dy32 = dy3;
                    z10 = z9;
                    g2 = i5;
                    a = z8;
                }
                boolean z14 = a;
                boolean z15 = z10;
                vc4 vc46 = vc42;
                if (vc46.g() == 0) {
                    qaVar.x = 0;
                    this.a.g();
                    return z15;
                }
                int i11 = qaVar.x;
                while (true) {
                    i11--;
                    if (-1 >= i11) {
                        break;
                    } else if (vc43.c(((long[]) qaVar.y)[i11]) < 0 && i11 < (i3 = qaVar.x)) {
                        int i12 = i3 - 1;
                        int i13 = i11;
                        while (i13 < i12) {
                            long[] jArr = (long[]) qaVar.y;
                            int i14 = i13 + 1;
                            jArr[i13] = jArr[i14];
                            i13 = i14;
                        }
                        qaVar.x--;
                    }
                }
                ArrayList arrayList2 = new ArrayList(vc46.g());
                int g3 = vc46.g();
                for (int i15 = 0; i15 < g3; i15++) {
                    arrayList2.add(vc46.h(i15));
                }
                kk5 kk52 = new kk5(arrayList2, hv22);
                int size2 = arrayList2.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = arrayList2.get(i16);
                    if (hv22.Q(((qk5) obj).a)) {
                        break;
                    }
                    i16++;
                }
                qk5 qk57 = (qk5) obj;
                if (qk57 != null) {
                    boolean z16 = qk57.d;
                    if (!z) {
                        z2 = false;
                        this.i = false;
                    } else {
                        z2 = false;
                        if (!this.i && (z16 || qk57.h)) {
                            xz4 xz44 = this.f;
                            xz44.getClass();
                            long j13 = xz44.y;
                            long j14 = qk57.c;
                            float intBitsToFloat = Float.intBitsToFloat((int) (j14 >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (j14 & 4294967295L));
                            int i17 = (int) (j13 >> 32);
                            int i18 = (int) (j13 & 4294967295L);
                            if (intBitsToFloat < 0.0f) {
                                z4 = z15;
                            } else {
                                z4 = false;
                            }
                            if (intBitsToFloat > ((float) i17)) {
                                z5 = z15;
                            } else {
                                z5 = false;
                            }
                            boolean z17 = z5 | z4;
                            if (intBitsToFloat2 < 0.0f) {
                                z6 = z15;
                            } else {
                                z6 = false;
                            }
                            boolean z18 = z17 | z6;
                            if (intBitsToFloat2 > ((float) i18)) {
                                z7 = z15;
                            } else {
                                z7 = false;
                            }
                            this.i = !(z7 | z18);
                        }
                    }
                    boolean z19 = this.i;
                    boolean z20 = this.h;
                    int i19 = 5;
                    if (z19 == z20 || !((i2 = kk52.f) == 3 || i2 == 4 || i2 == 5)) {
                        int i20 = kk52.f;
                        if (i20 == 4 && z20 && !this.j) {
                            kk52.f = 3;
                        } else if (i20 == 5 && z19 && z16) {
                            kk52.f = 3;
                        }
                    } else {
                        if (z19) {
                            i19 = 4;
                        }
                        kk52.f = i19;
                    }
                } else {
                    z2 = false;
                }
                if (!z14 && kk52.f == 3 && (kk5 = this.g) != null) {
                    List list2 = kk5.a;
                    int size3 = list2.size();
                    List list3 = kk52.a;
                    if (size3 == list3.size()) {
                        int size4 = list3.size();
                        int i21 = z2;
                        while (true) {
                            if (i21 >= size4) {
                                z3 = z2;
                                break;
                            } else if (!l35.b(((qk5) list2.get(i21)).c, ((qk5) list3.get(i21)).c)) {
                                break;
                            } else {
                                i21++;
                            }
                        }
                        this.g = kk52;
                        return z3;
                    }
                }
                z3 = z15;
                this.g = kk52;
                return z3;
            }
        }
        return true;
    }

    public final void b(hv2 hv2) {
        super.b(hv2);
        kk5 kk5 = this.g;
        if (kk5 != null) {
            this.h = this.i;
            List list = kk5.a;
            int size = list.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                qk5 qk5 = (qk5) list.get(i2);
                boolean z2 = qk5.d;
                long j2 = qk5.a;
                boolean Q = hv2.Q(j2);
                boolean z3 = this.i;
                if ((!z2 && !Q) || (!z2 && !z3)) {
                    this.d.k(j2);
                }
            }
            this.i = false;
            if (kk5.f == 5) {
                z = true;
            }
            this.j = z;
        }
    }

    public final void c() {
        eq4 eq4 = this.a;
        Object[] objArr = eq4.w;
        int i2 = eq4.y;
        for (int i3 = 0; i3 < i2; i3++) {
            ((rz4) objArr[i3]).c();
        }
        ll4 ll4 = this.c;
        eq4 eq42 = null;
        while (ll4 != null) {
            if (ll4 instanceof tk5) {
                ((tk5) ll4).I();
            } else if ((ll4.y & 16) != 0 && (ll4 instanceof wo1)) {
                int i4 = 0;
                for (ll4 ll42 = ((wo1) ll4).L; ll42 != null; ll42 = ll42.B) {
                    if ((ll42.y & 16) != 0) {
                        i4++;
                        if (i4 == 1) {
                            ll4 = ll42;
                        } else {
                            if (eq42 == null) {
                                eq42 = new eq4(new ll4[16]);
                            }
                            if (ll4 != null) {
                                eq42.b(ll4);
                                ll4 = null;
                            }
                            eq42.b(ll42);
                        }
                    }
                }
                if (i4 == 1) {
                }
            }
            ll4 = rc9.j(eq42);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v3, types: [int] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    public final boolean d(hv2 hv2) {
        boolean z;
        uy3 uy3;
        vc4 vc4 = this.e;
        ? r3 = 0;
        if (vc4.g() != 0) {
            ll4 ll4 = this.c;
            if (ll4.J) {
                xz4 xz4 = ll4.D;
                if (xz4 == null || (uy3 = xz4.O) == null) {
                    z = false;
                } else {
                    z = uy3.K();
                }
                if (z) {
                    kk5 kk5 = this.g;
                    kk5.getClass();
                    xz4 xz42 = this.f;
                    xz42.getClass();
                    long j2 = xz42.y;
                    ll4 ll42 = ll4;
                    eq4 eq4 = null;
                    while (ll42 != null) {
                        if (ll42 instanceof tk5) {
                            ((tk5) ll42).y(kk5, lk5.y, j2);
                        } else if ((ll42.y & 16) != 0 && (ll42 instanceof wo1)) {
                            int i2 = 0;
                            for (ll4 ll43 = ((wo1) ll42).L; ll43 != null; ll43 = ll43.B) {
                                if ((ll43.y & 16) != 0) {
                                    i2++;
                                    if (i2 == 1) {
                                        ll42 = ll43;
                                    } else {
                                        if (eq4 == null) {
                                            eq4 = new eq4(new ll4[16]);
                                        }
                                        if (ll42 != null) {
                                            eq4.b(ll42);
                                            ll42 = null;
                                        }
                                        eq4.b(ll43);
                                    }
                                }
                            }
                            if (i2 == 1) {
                            }
                        }
                        ll42 = rc9.j(eq4);
                    }
                    if (ll4.J) {
                        eq4 eq42 = this.a;
                        Object[] objArr = eq42.w;
                        int i3 = eq42.y;
                        while (r3 < i3) {
                            ((rz4) objArr[r3]).d(hv2);
                            r3++;
                        }
                    }
                    r3 = 1;
                }
            }
        }
        b(hv2);
        vc4.a();
        this.f = null;
        return r3;
    }

    public final boolean e(hv2 hv2, boolean z) {
        boolean z2;
        uy3 uy3;
        if (this.e.g() == 0) {
            return false;
        }
        ll4 ll4 = this.c;
        if (ll4.J) {
            xz4 xz4 = ll4.D;
            if (xz4 == null || (uy3 = xz4.O) == null) {
                z2 = false;
            } else {
                z2 = uy3.K();
            }
            if (z2) {
                kk5 kk5 = this.g;
                kk5.getClass();
                xz4 xz42 = this.f;
                xz42.getClass();
                long j2 = xz42.y;
                ll4 ll42 = ll4;
                eq4 eq4 = null;
                while (ll42 != null) {
                    if (ll42 instanceof tk5) {
                        ((tk5) ll42).y(kk5, lk5.w, j2);
                    } else if ((ll42.y & 16) != 0 && (ll42 instanceof wo1)) {
                        int i2 = 0;
                        for (ll4 ll43 = ((wo1) ll42).L; ll43 != null; ll43 = ll43.B) {
                            if ((ll43.y & 16) != 0) {
                                i2++;
                                if (i2 == 1) {
                                    ll42 = ll43;
                                } else {
                                    if (eq4 == null) {
                                        eq4 = new eq4(new ll4[16]);
                                    }
                                    if (ll42 != null) {
                                        eq4.b(ll42);
                                        ll42 = null;
                                    }
                                    eq4.b(ll43);
                                }
                            }
                        }
                        if (i2 == 1) {
                        }
                    }
                    ll42 = rc9.j(eq4);
                }
                if (ll4.J) {
                    eq4 eq42 = this.a;
                    Object[] objArr = eq42.w;
                    int i3 = eq42.y;
                    for (int i4 = 0; i4 < i3; i4++) {
                        this.f.getClass();
                        ((rz4) objArr[i4]).e(hv2, z);
                    }
                }
                if (ll4.J) {
                    eq4 eq43 = null;
                    while (ll4 != null) {
                        if (ll4 instanceof tk5) {
                            ((tk5) ll4).y(kk5, lk5.x, j2);
                        } else if ((ll4.y & 16) != 0 && (ll4 instanceof wo1)) {
                            int i5 = 0;
                            for (ll4 ll44 = ((wo1) ll4).L; ll44 != null; ll44 = ll44.B) {
                                if ((ll44.y & 16) != 0) {
                                    i5++;
                                    if (i5 == 1) {
                                        ll4 = ll44;
                                    } else {
                                        if (eq43 == null) {
                                            eq43 = new eq4(new ll4[16]);
                                        }
                                        if (ll4 != null) {
                                            eq43.b(ll4);
                                            ll4 = null;
                                        }
                                        eq43.b(ll44);
                                    }
                                }
                            }
                            if (i5 == 1) {
                            }
                        }
                        ll4 = rc9.j(eq43);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(long j2, lp4 lp4) {
        qa qaVar = this.d;
        if (qaVar.d(j2) && lp4.g(this) < 0) {
            qaVar.k(j2);
            this.e.f(j2);
        }
        eq4 eq4 = this.a;
        Object[] objArr = eq4.w;
        int i2 = eq4.y;
        for (int i3 = 0; i3 < i2; i3++) {
            ((rz4) objArr[i3]).f(j2, lp4);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.c + ", children=" + this.a + ", pointerIds=" + this.d + ")";
    }
}
