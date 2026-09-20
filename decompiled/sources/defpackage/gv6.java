package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: gv6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gv6 implements my0, Iterable, ar3 {
    public int A;
    public final Object B = new Object();
    public boolean C;
    public int D;
    public ArrayList E = new ArrayList();
    public HashMap F;
    public yo4 G;
    public int[] w = new int[0];
    public int x;
    public Object[] y = new Object[0];
    public int z;

    public static final void l(jv6 jv6, int i) {
        while (jv6.v >= 0 && jv6.u <= i) {
            jv6.O();
            jv6.j();
        }
    }

    public final int f(st2 st2) {
        if (this.C) {
            ey0.a("Use active SlotWriter to determine anchor location instead");
        }
        if (!st2.a()) {
            vm5.a("Anchor refers to a group that was removed");
        }
        return st2.a;
    }

    public final void g() {
        this.F = new HashMap();
    }

    public final Iterator iterator() {
        return new ux2(this, 0, this.x);
    }

    public final tp4 k(kr krVar, lp4 lp4) {
        int i;
        Object[] objArr = lp4.a;
        int i2 = lp4.b;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            } else if (!p(hj8.m(((hn4) objArr[i3]).e))) {
                lp4 lp42 = new lp4();
                Object[] objArr2 = lp4.a;
                int i4 = lp4.b;
                for (int i5 = 0; i5 < i4; i5++) {
                    Object obj = objArr2[i5];
                    if (p(hj8.m(((hn4) obj).e))) {
                        lp42.a(obj);
                    }
                }
                lp4 = lp42;
            } else {
                i3++;
            }
        }
        ay5 ay5 = new ay5(14, (Object) this);
        if (lp4.b > 1) {
            Comparable comparable = (Comparable) ay5.y(lp4.f(0));
            int i6 = lp4.b;
            int i7 = 1;
            while (true) {
                if (i7 >= i6) {
                    break;
                }
                Comparable comparable2 = (Comparable) ay5.y(lp4.f(i7));
                if (comparable.compareTo(comparable2) > 0) {
                    lp4 lp43 = new lp4(lp4.b);
                    Object[] objArr3 = lp4.a;
                    int i8 = lp4.b;
                    for (int i9 = 0; i9 < i8; i9++) {
                        lp43.a(objArr3[i9]);
                    }
                    jp4 jp4 = lp43.c;
                    if (jp4 == null) {
                        jp4 = new jp4(0, lp43);
                        lp43.c = jp4;
                    }
                    if (((lp4) jp4.x).b > 1) {
                        ht0.g0(jp4, new la2(0, ay5));
                    }
                    lp4 = lp43;
                } else {
                    i7++;
                    comparable = comparable2;
                }
            }
        }
        if (lp4.h()) {
            tp4 tp4 = bg6.b;
            tp4.getClass();
            return tp4;
        }
        long[] jArr = bg6.a;
        tp4 tp42 = new tp4();
        jv6 o = o();
        try {
            Object[] objArr4 = lp4.a;
            int i10 = lp4.b;
            for (int i11 = 0; i11 < i10; i11++) {
                hn4 hn4 = (hn4) objArr4[i11];
                int c = o.c(hj8.m(hn4.e));
                int G2 = o.G(o.b, c);
                l(o, G2);
                l(o, G2);
                while (true) {
                    i = o.t;
                    if (i == G2) {
                        break;
                    } else if (i == o.u) {
                        break;
                    } else if (G2 < o.u(i) + i) {
                        o.R();
                    } else {
                        o.N();
                    }
                }
                if (i != G2) {
                    ey0.a("Unexpected slot table structure");
                }
                o.R();
                o.a(c - o.t);
                tp42.m(hn4, ey0.c(hn4.c, hn4, o, krVar));
            }
            l(o, Integer.MAX_VALUE);
            o.e(true);
            return tp42;
        } catch (Throwable th) {
            o.e(false);
            throw th;
        }
    }

    public final fv6 n() {
        if (!this.C) {
            this.A++;
            return new fv6(this);
        }
        h.s("Cannot read while a writer is pending");
        return null;
    }

    public final jv6 o() {
        if (this.C) {
            ey0.a("Cannot start a writer when another writer is pending");
        }
        if (this.A > 0) {
            ey0.a("Cannot start a writer when a reader is pending");
        }
        this.C = true;
        this.D++;
        return new jv6(this);
    }

    public final boolean p(st2 st2) {
        int e;
        if (!st2.a() || (e = iv6.e(this.E, st2.a, this.x)) < 0 || !sg3.e(this.E.get(e), st2)) {
            return false;
        }
        return true;
    }

    public final au2 s(int i) {
        st2 st2;
        int i2;
        ArrayList arrayList;
        int e;
        HashMap hashMap = this.F;
        if (hashMap != null) {
            if (this.C) {
                ey0.a("use active SlotWriter to crate an anchor for location instead");
            }
            if (i < 0 || i >= (i2 = this.x) || (e = iv6.e(arrayList, i, i2)) < 0) {
                st2 = null;
            } else {
                st2 = (st2) (arrayList = this.E).get(e);
            }
            if (st2 != null) {
                return (au2) hashMap.get(st2);
            }
        }
        return null;
    }
}
