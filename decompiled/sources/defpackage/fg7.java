package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: fg7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fg7 {
    public final ed5 a = u55.p((Object) null);
    public vl b;
    public final yx6 c;

    public fg7(vl vlVar) {
        ha7 ha7 = new ha7(12);
        vlVar.getClass();
        tl tlVar = new tl(vlVar);
        ArrayList arrayList = tlVar.y;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            List list = (List) ha7.y(((sl) arrayList.get(i)).a(Integer.MIN_VALUE));
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ul ulVar = (ul) list.get(i2);
                arrayList3.add(new sl(ulVar.b, ulVar.c, ulVar.a, ulVar.d));
            }
            it0.h0(arrayList2, arrayList3);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        this.b = tlVar.e();
        this.c = new yx6();
    }

    public static ul c(ul ulVar, bg7 bg7) {
        pn4 pn4 = bg7.b;
        int c2 = pn4.c(pn4.f - 1, false);
        if (ulVar.b < c2) {
            return ul.a(ulVar, (rl) null, Math.min(ulVar.c, c2), 11);
        }
        return null;
    }

    public final void a(int i, yt2 yt2) {
        int i2;
        boolean z;
        char c2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        yy6 yy6;
        yy6 yy62;
        yy6 yy63;
        int i3 = i;
        yt2 yt22 = yt2;
        yt22.g0(1154651354);
        char c3 = 2;
        if (yt22.i(this)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i3;
        boolean z6 = false;
        if ((i4 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i4 & 1, z)) {
            hj hjVar = (hj) yt22.k(xy0.t);
            vl vlVar = this.b;
            List a2 = vlVar.a(vlVar.x.length());
            int size = a2.size();
            int i5 = 0;
            while (i5 < size) {
                ul ulVar = (ul) a2.get(i5);
                int i6 = ulVar.b;
                Object obj = ulVar.a;
                if (i6 != ulVar.c) {
                    yt22.e0(725478935);
                    Object Q = yt22.Q();
                    d63 d63 = ay0.a;
                    if (Q == d63) {
                        Q = b81.e(yt22);
                    }
                    ap4 ap4 = (ap4) Q;
                    c2 = c3;
                    ml4 X = mp7.X(jl4.w, new k77(6, (Object) this, (Object) ulVar));
                    Object Q2 = yt22.Q();
                    if (Q2 == d63) {
                        Q2 = new ha7(13);
                        yt22.o0(Q2);
                    }
                    ml4 z7 = ag8.z(ck6.a(X, z6, (vr2) Q2).d(new mg7(new yv0(15, (Object) this, (Object) ulVar))), ap4);
                    ok5.a.getClass();
                    ml4 y = p25.y(z7, r16.q);
                    boolean i7 = yt22.i(this) | yt22.g(ulVar) | yt22.i(hjVar);
                    Object Q3 = yt22.Q();
                    if (i7 || Q3 == d63) {
                        Q3 = new n17(this, ulVar, hjVar);
                        yt22.o0(Q3);
                    }
                    mb0.a(h49.v(y, ap4, (sr2) Q3), yt22, 0);
                    b74 b74 = (b74) obj;
                    gg7 a3 = b74.a();
                    if (a3 == null || (a3.a == null && a3.b == null && a3.c == null && a3.d == null)) {
                        z2 = false;
                        yt22.e0(728331710);
                        yt22.r(false);
                    } else {
                        yt22.e0(726303039);
                        Object Q4 = yt22.Q();
                        if (Q4 == d63) {
                            Q4 = new c74(ap4);
                            yt22.o0(Q4);
                        }
                        c74 c74 = (c74) Q4;
                        Object Q5 = yt22.Q();
                        yy6 yy64 = null;
                        if (Q5 == d63) {
                            Q5 = new gw6(c74, (f61) null, 6);
                            yt22.o0(Q5);
                        }
                        t49.h((gs2) Q5, yt22, vs7.a);
                        bd5 bd5 = c74.b;
                        bd5 bd52 = c74.b;
                        if ((bd5.d() & 2) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        Boolean valueOf = Boolean.valueOf(z3);
                        if ((bd52.d() & 1) != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        Boolean valueOf2 = Boolean.valueOf(z4);
                        if ((bd52.d() & 4) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        Boolean valueOf3 = Boolean.valueOf(z5);
                        gg7 a4 = b74.a();
                        if (a4 != null) {
                            yy6 = a4.a;
                        } else {
                            yy6 = null;
                        }
                        gg7 a5 = b74.a();
                        if (a5 != null) {
                            yy62 = a5.b;
                        } else {
                            yy62 = null;
                        }
                        gg7 a6 = b74.a();
                        if (a6 != null) {
                            yy63 = a6.c;
                        } else {
                            yy63 = null;
                        }
                        gg7 a7 = b74.a();
                        if (a7 != null) {
                            yy64 = a7.d;
                        }
                        Object[] objArr = {valueOf, valueOf2, valueOf3, yy6, yy62, yy63, yy64};
                        boolean i8 = yt22.i(this) | yt22.g(ulVar);
                        Object Q6 = yt22.Q();
                        if (i8 || Q6 == d63) {
                            Q6 = new k77(this, ulVar, c74);
                            yt22.o0(Q6);
                        }
                        b(objArr, (vr2) Q6, yt22, (i4 << 6) & 896);
                        z2 = false;
                        yt22.r(false);
                    }
                    yt22.r(z2);
                } else {
                    c2 = c3;
                    z2 = z6;
                    yt22.e0(728345598);
                    yt22.r(z2);
                }
                i5++;
                z6 = z2;
                c3 = c2;
            }
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new ph6(i3, 16, this);
        }
    }

    public final void b(Object[] objArr, vr2 vr2, yt2 yt2, int i) {
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        yt2.g0(-2083052099);
        if ((i & 48) == 0) {
            if (yt2.i(vr2)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            if (yt2.i(this)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i2 |= i5;
        }
        yt2.c0(-358306546, Integer.valueOf(objArr.length));
        boolean z2 = false;
        if (yt2.e(objArr.length)) {
            i3 = 4;
        } else {
            i3 = 0;
        }
        int i7 = i2 | i3;
        for (Object i8 : objArr) {
            if (yt2.i(i8)) {
                i4 = 4;
            } else {
                i4 = 0;
            }
            i7 |= i4;
        }
        yt2.r(false);
        if ((i7 & 14) == 0) {
            i7 |= 2;
        }
        if ((i7 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i7 & 1, z)) {
            be5 be5 = new be5(2);
            be5.a(vr2);
            be5.b(objArr);
            ArrayList arrayList = be5.a;
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean i9 = yt2.i(this);
            if ((i7 & 112) == 32) {
                z2 = true;
            }
            boolean z3 = i9 | z2;
            Object Q = yt2.Q();
            if (z3 || Q == ay0.a) {
                Q = new x60(this, vr2, 1);
                yt2.o0(Q);
            }
            t49.g(array, (vr2) Q, yt2);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new bi(i, 20, (Object) this, (Object) objArr, (Object) vr2);
        }
    }
}
