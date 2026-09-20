package defpackage;

import java.util.ArrayList;

/* renamed from: fw0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fw0 implements gs2, hs2, is2, js2, ks2, ls2, ms2, ns2, tr2, ur2, wr2, xr2, yr2, zr2, as2, bs2, cs2, es2, fs2 {
    public ArrayList A;
    public final int w;
    public final boolean x;
    public Object y;
    public yx5 z;

    public fw0(int i, Object obj, boolean z2) {
        this.w = i;
        this.x = z2;
        this.y = obj;
    }

    public final /* bridge */ /* synthetic */ Object C(Object obj, Object obj2, Object obj3, Object obj4) {
        return k(obj, obj2, (yt2) obj3, ((Number) obj4).intValue());
    }

    public final /* bridge */ /* synthetic */ Object D(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, yt2 yt2, Integer num) {
        return f(obj, bool, obj2, obj3, obj4, yt2, num.intValue());
    }

    public final /* bridge */ /* synthetic */ Object F(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return n(obj, obj2, obj3, obj4, (yt2) obj5, ((Number) obj6).intValue());
    }

    public final /* bridge */ /* synthetic */ Object H(Object obj, Object obj2) {
        return a(((Number) obj2).intValue(), (yt2) obj);
    }

    public final /* bridge */ /* synthetic */ Object K(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return l(obj, obj2, obj3, (yt2) obj4, ((Number) obj5).intValue());
    }

    public final Object a(int i, yt2 yt2) {
        int i2;
        yt2.g0(this.w);
        o(yt2);
        if (yt2.g(this)) {
            i2 = su0.e(2, 0);
        } else {
            i2 = su0.e(1, 0);
        }
        int i3 = i | i2;
        Object obj = this.y;
        obj.getClass();
        mp7.Q(2, obj);
        Object H = ((gs2) obj).H(yt2, Integer.valueOf(i3));
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new ew0(2, this, fw0.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, 0);
        }
        return H;
    }

    public final Object e(Object obj, yt2 yt2, int i) {
        int i2;
        yt2.g0(this.w);
        o(yt2);
        if (yt2.g(this)) {
            i2 = su0.e(2, 1);
        } else {
            i2 = su0.e(1, 1);
        }
        Object obj2 = this.y;
        obj2.getClass();
        mp7.Q(3, obj2);
        Object u = ((hs2) obj2).u(obj, yt2, Integer.valueOf(i2 | i));
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new dj7((Object) this, obj, i, 3);
        }
        return u;
    }

    public final Object f(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, yt2 yt2, int i) {
        int i2;
        yt2 yt22 = yt2;
        yt22.g0(this.w);
        o(yt22);
        if (yt22.g(this)) {
            i2 = su0.e(2, 6);
        } else {
            i2 = su0.e(1, 6);
        }
        Object obj5 = this.y;
        obj5.getClass();
        mp7.Q(8, obj5);
        Integer valueOf = Integer.valueOf(i | i2);
        Object D = ((ms2) obj5).D(obj, bool, obj2, obj3, obj4, yt22, valueOf);
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new dw0(this, obj, bool, obj2, obj3, obj4, i);
        }
        return D;
    }

    public final Object k(Object obj, Object obj2, yt2 yt2, int i) {
        int i2;
        yt2.g0(this.w);
        o(yt2);
        if (yt2.g(this)) {
            i2 = su0.e(2, 2);
        } else {
            i2 = su0.e(1, 2);
        }
        Object obj3 = this.y;
        obj3.getClass();
        mp7.Q(4, obj3);
        Object C = ((is2) obj3).C(obj, obj2, yt2, Integer.valueOf(i2 | i));
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new bi(this, obj, obj2, i);
        }
        return C;
    }

    public final Object l(Object obj, Object obj2, Object obj3, yt2 yt2, int i) {
        int i2;
        yt2.g0(this.w);
        o(yt2);
        if (yt2.g(this)) {
            i2 = su0.e(2, 3);
        } else {
            i2 = su0.e(1, 3);
        }
        Object obj4 = this.y;
        obj4.getClass();
        mp7.Q(5, obj4);
        Object obj5 = obj;
        Object obj6 = obj2;
        Object obj7 = obj3;
        yt2 yt22 = yt2;
        Object K = ((js2) obj4).K(obj5, obj6, obj7, yt22, Integer.valueOf(i2 | i));
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new m13(i, 2, this, obj5, obj6, obj7);
        }
        return K;
    }

    public final Object n(Object obj, Object obj2, Object obj3, Object obj4, yt2 yt2, int i) {
        int i2;
        yt2.g0(this.w);
        o(yt2);
        if (yt2.g(this)) {
            i2 = su0.e(2, 4);
        } else {
            i2 = su0.e(1, 4);
        }
        Object obj5 = this.y;
        obj5.getClass();
        mp7.Q(6, obj5);
        Object F = ((ks2) obj5).F(obj, obj2, obj3, obj4, yt2, Integer.valueOf(i | i2));
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new ft(this, obj, obj2, obj3, obj4, i, 1);
        }
        return F;
    }

    public final void o(yt2 yt2) {
        yx5 B;
        if (this.x && (B = yt2.B()) != null) {
            B.b |= 1;
            yx5 yx5 = this.z;
            if (yx5 == null || !yx5.a() || yx5 == B || sg3.e(yx5.c, B.c)) {
                this.z = B;
                return;
            }
            ArrayList arrayList = this.A;
            if (arrayList == null) {
                ArrayList arrayList2 = new ArrayList();
                this.A = arrayList2;
                arrayList2.add(B);
                return;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                yx5 yx52 = (yx5) arrayList.get(i);
                if (yx52 == null || !yx52.a() || yx52 == B || sg3.e(yx52.c, B.c)) {
                    arrayList.set(i, B);
                    return;
                }
            }
            arrayList.add(B);
        }
    }

    public final void p(ds2 ds2) {
        boolean z2;
        if (!sg3.e(this.y, ds2)) {
            if (this.y == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.y = ds2;
            if (!z2 && this.x) {
                yx5 yx5 = this.z;
                if (yx5 != null) {
                    zx5 zx5 = yx5.a;
                    if (zx5 != null) {
                        zx5.p(yx5, (Object) null);
                    }
                    this.z = null;
                }
                ArrayList arrayList = this.A;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        yx5 yx52 = (yx5) arrayList.get(i);
                        zx5 zx52 = yx52.a;
                        if (zx52 != null) {
                            zx52.p(yx52, (Object) null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object u(Object obj, Object obj2, Object obj3) {
        return e(obj, (yt2) obj2, ((Number) obj3).intValue());
    }
}
