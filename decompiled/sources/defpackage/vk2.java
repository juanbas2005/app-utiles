package defpackage;

import android.os.Trace;

/* renamed from: vk2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vk2 extends ll4 implements ry0, h35, ol4, vo1 {
    public final gs2 K;
    public boolean L;
    public boolean M;
    public final int N;
    public cf4 O;

    public vk2(int i, gs2 gs2, int i2) {
        i = (i2 & 1) != 0 ? 1 : i;
        this.K = (i2 & 4) != 0 ? null : gs2;
        this.N = i;
    }

    public final boolean K0() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0040  */
    public final void O0() {
        cf4 cf4;
        int ordinal = a1().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                ((je) rc9.P0(this)).getFocusOwner();
                bb0.i0(this);
            } else if (ordinal != 2) {
                if (ordinal != 3) {
                    h.c();
                    return;
                }
            }
            cf4 = this.O;
            if (cf4 != null) {
                cf4.E();
            }
            this.O = null;
        }
        lk2 lk2 = (lk2) ((je) rc9.P0(this)).getFocusOwner();
        lk2.c(8, true, false);
        lk2.d.a();
        cf4 = this.O;
        if (cf4 != null) {
        }
        this.O = null;
    }

    public final void P0() {
        if (a1().a()) {
            ((lk2) ((je) rc9.P0(this)).getFocusOwner()).c(8, true, true);
        }
    }

    /* JADX WARNING: type inference failed for: r5v22, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v45, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    public final boolean V0() {
        eq4 eq4;
        lk2 lk2;
        sk2 sk2;
        o00 o00;
        lk2 lk22;
        boolean z;
        int i;
        eq4 eq42;
        Boolean bool;
        int i2;
        int i3;
        o00 o002;
        int ordinal = we.I(this).ordinal();
        if (ordinal == 0) {
            lk2 lk23 = (lk2) ((je) rc9.P0(this)).getFocusOwner();
            vk2 g = lk23.g();
            sk2 a1 = a1();
            if (g == this) {
                W0(a1, a1);
                return true;
            } else if (g != null || ((lk2) ((je) rc9.P0(this)).getFocusOwner()).a.D()) {
                if (g != null) {
                    eq4 = new eq4(new vk2[16]);
                    if (!g.w.J) {
                        yb3.b("visitAncestors called on an unattached node");
                    }
                    ll4 ll4 = g.w.A;
                    uy3 O0 = rc9.O0(g);
                    while (O0 != null) {
                        if ((((ll4) O0.a0.g).z & 1024) != 0) {
                            while (ll4 != null) {
                                if ((ll4.y & 1024) != 0) {
                                    ll4 ll42 = ll4;
                                    eq4 eq43 = null;
                                    while (ll42 != null) {
                                        if (ll42 instanceof vk2) {
                                            eq4.b((vk2) ll42);
                                            ll42 = rc9.j(eq43);
                                        } else {
                                            if ((ll42.y & 1024) != 0 && (ll42 instanceof wo1)) {
                                                int i4 = 0;
                                                for (ll4 ll43 = ((wo1) ll42).L; ll43 != null; ll43 = ll43.B) {
                                                    if ((ll43.y & 1024) != 0) {
                                                        i4++;
                                                        if (i4 == 1) {
                                                            ll42 = ll43;
                                                        } else {
                                                            if (eq43 == null) {
                                                                eq43 = new eq4(new ll4[16]);
                                                            }
                                                            if (ll42 != null) {
                                                                eq43.b(ll42);
                                                                ll42 = null;
                                                            }
                                                            eq43.b(ll43);
                                                        }
                                                    }
                                                }
                                                if (i4 == 1) {
                                                }
                                            }
                                            ll42 = rc9.j(eq43);
                                        }
                                    }
                                }
                                ll4 = ll4.A;
                            }
                        }
                        O0 = O0.v();
                        if (O0 == null || (o002 = O0.a0) == null) {
                            ll4 = null;
                        } else {
                            ll4 = (ib7) o002.f;
                        }
                    }
                } else {
                    eq4 = null;
                }
                vk2[] vk2Arr = new vk2[16];
                vk2[] vk2Arr2 = new vk2[16];
                if (!this.w.J) {
                    yb3.b("visitAncestors called on an unattached node");
                }
                ll4 ll44 = this.w.A;
                uy3 O02 = rc9.O0(this);
                int i5 = 0;
                int i6 = 0;
                boolean z2 = true;
                while (O02 != null) {
                    if ((((ll4) O02.a0.g).z & 1024) != 0) {
                        while (ll44 != null) {
                            if ((ll44.y & 1024) != 0) {
                                ll4 ll45 = ll44;
                                eq4 eq44 = null;
                                while (ll45 != null) {
                                    if (ll45 instanceof vk2) {
                                        vk2 vk2 = (vk2) ll45;
                                        if (eq4 != null) {
                                            bool = Boolean.valueOf(eq4.k(vk2));
                                        } else {
                                            bool = null;
                                        }
                                        if (sg3.e(bool, Boolean.TRUE)) {
                                            int i7 = i5 + 1;
                                            if (vk2Arr.length < i7) {
                                                int length = vk2Arr.length;
                                                lk22 = lk2;
                                                ? r1 = new Object[Math.max(i7, length * 2)];
                                                i3 = i7;
                                                System.arraycopy(vk2Arr, 0, r1, 0, length);
                                                vk2Arr = r1;
                                            } else {
                                                lk22 = lk2;
                                                i3 = i7;
                                            }
                                            vk2Arr[i5] = vk2;
                                            i5 = i3;
                                        } else {
                                            lk22 = lk2;
                                            int i8 = i6 + 1;
                                            if (vk2Arr2.length < i8) {
                                                int length2 = vk2Arr2.length;
                                                ? r5 = new Object[Math.max(i8, length2 * 2)];
                                                i2 = i8;
                                                System.arraycopy(vk2Arr2, 0, r5, 0, length2);
                                                vk2Arr2 = r5;
                                            } else {
                                                i2 = i8;
                                            }
                                            vk2Arr2[i6] = vk2;
                                            i6 = i2;
                                        }
                                        if (vk2 == g) {
                                            z2 = false;
                                        }
                                        z = false;
                                    } else {
                                        lk22 = lk2;
                                        z = true;
                                    }
                                    if (z && (ll45.y & 1024) != 0 && (ll45 instanceof wo1)) {
                                        int i9 = 0;
                                        for (ll4 ll46 = ((wo1) ll45).L; ll46 != null; ll46 = ll46.B) {
                                            if ((ll46.y & 1024) != 0) {
                                                int i10 = i9 + 1;
                                                if (i10 == 1) {
                                                    ll45 = ll46;
                                                    i = i10;
                                                } else {
                                                    if (eq44 == null) {
                                                        i = i10;
                                                        eq42 = new eq4(new ll4[16]);
                                                    } else {
                                                        i = i10;
                                                        eq42 = eq44;
                                                    }
                                                    if (ll45 != null) {
                                                        eq42.b(ll45);
                                                        ll45 = null;
                                                    }
                                                    eq42.b(ll46);
                                                    eq44 = eq42;
                                                }
                                                i9 = i;
                                            }
                                        }
                                        if (i9 == 1) {
                                            lk2 = lk22;
                                        }
                                    }
                                    ll45 = rc9.j(eq44);
                                    lk2 = lk22;
                                }
                            }
                            ll44 = ll44.A;
                            lk2 = lk2;
                        }
                    }
                    lk2 lk24 = lk2;
                    O02 = O02.v();
                    if (O02 == null || (o00 = O02.a0) == null) {
                        ll44 = null;
                    } else {
                        ll44 = (ib7) o00.f;
                    }
                    lk23 = lk24;
                }
                lk2 lk25 = lk2;
                if (!z2 || g == null || we.K(g, false)) {
                    i35.o(this, new kh(6, this));
                    int ordinal2 = a1().ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 != 1) {
                            if (ordinal2 != 2) {
                                if (ordinal2 != 3) {
                                    h.c();
                                    return false;
                                }
                            }
                        }
                        ((lk2) ((je) rc9.P0(this)).getFocusOwner()).j(this);
                    }
                    sk2 sk22 = sk2.y;
                    sk2 sk23 = sk2.w;
                    if (z2 && g != null) {
                        g.W0(sk23, sk22);
                    }
                    sk2 sk24 = sk2.x;
                    if (eq4 != null) {
                        int i11 = eq4.y - 1;
                        Object[] objArr = eq4.w;
                        if (i11 < objArr.length) {
                            while (true) {
                                if (i11 < 0) {
                                    break;
                                }
                                vk2 vk22 = (vk2) objArr[i11];
                                if (lk25.g() != this) {
                                    break;
                                }
                                vk22.W0(sk24, sk22);
                                i11--;
                            }
                        }
                    }
                    int i12 = i6 - 1;
                    if (i12 < vk2Arr2.length) {
                        while (true) {
                            if (i12 < 0) {
                                break;
                            }
                            vk2 vk23 = vk2Arr2[i12];
                            if (lk25.g() != this) {
                                break;
                            }
                            if (vk23 == g) {
                                sk2 = sk23;
                            } else {
                                sk2 = sk22;
                            }
                            vk23.W0(sk2, sk24);
                            i12--;
                        }
                    }
                    if (lk25.g() == this) {
                        W0(a1, sk23);
                        if (lk25.g() != this) {
                            return false;
                        }
                        return true;
                    }
                }
                return false;
            }
        } else if (ordinal != 1) {
            if (ordinal == 2) {
                return true;
            }
            if (ordinal != 3) {
                h.c();
                return false;
            }
        }
        return false;
    }

    public final void W0(sk2 sk2, sk2 sk22) {
        o00 o00;
        gs2 gs2;
        lk2 lk2 = (lk2) ((je) rc9.P0(this)).getFocusOwner();
        vk2 g = lk2.g();
        if (!sk2.equals(sk22) && (gs2 = this.K) != null) {
            gs2.H(sk2, sk22);
        }
        ll4 ll4 = this.w;
        if (!ll4.J) {
            yb3.b("visitAncestors called on an unattached node");
        }
        ll4 ll42 = this.w;
        uy3 O0 = rc9.O0(this);
        while (O0 != null) {
            if ((((ll4) O0.a0.g).z & 5120) != 0) {
                while (ll42 != null) {
                    int i = ll42.y;
                    if ((i & 5120) != 0) {
                        if (ll42 != ll4 && (i & 1024) != 0) {
                            return;
                        }
                        if ((i & 4096) != 0) {
                            ll4 ll43 = ll42;
                            eq4 eq4 = null;
                            while (ll43 != null) {
                                if (ll43 instanceof ck2) {
                                    ck2 ck2 = (ck2) ll43;
                                    if (g == lk2.g()) {
                                        ck2.D(sk22);
                                    }
                                } else if ((ll43.y & 4096) != 0 && (ll43 instanceof wo1)) {
                                    int i2 = 0;
                                    for (ll4 ll44 = ((wo1) ll43).L; ll44 != null; ll44 = ll44.B) {
                                        if ((ll44.y & 4096) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                ll43 = ll44;
                                            } else {
                                                if (eq4 == null) {
                                                    eq4 = new eq4(new ll4[16]);
                                                }
                                                if (ll43 != null) {
                                                    eq4.b(ll43);
                                                    ll43 = null;
                                                }
                                                eq4.b(ll44);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                ll43 = rc9.j(eq4);
                            }
                        }
                    }
                    ll42 = ll42.A;
                }
            }
            O0 = O0.v();
            if (O0 == null || (o00 = O0.a0) == null) {
                ll42 = null;
            } else {
                ll42 = (ib7) o00.f;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [mk2, java.lang.Object] */
    public final mk2 X0() {
        boolean z;
        o00 o00;
        boolean z2;
        ? obj = new Object();
        obj.a = true;
        ok2 ok2 = ok2.b;
        obj.b = ok2;
        obj.c = ok2;
        obj.d = ok2;
        obj.e = ok2;
        obj.f = ok2;
        obj.g = ok2;
        obj.h = ok2;
        obj.i = ok2;
        obj.j = ce.Y;
        obj.k = ce.Z;
        obj.l = d63.C;
        int i = this.N;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            if (((sc3) ((uc3) ((tc3) h49.w(this, xy0.m))).a.getValue()).a == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            z = !z2;
        } else if (i == 2) {
            z = false;
        } else {
            h.s("Unknown Focusability");
            return null;
        }
        obj.a = z;
        ll4 ll4 = this.w;
        if (!ll4.J) {
            yb3.b("visitAncestors called on an unattached node");
        }
        ll4 ll42 = this.w;
        uy3 O0 = rc9.O0(this);
        loop0:
        while (O0 != null) {
            if ((((ll4) O0.a0.g).z & 3072) != 0) {
                while (ll42 != null) {
                    int i2 = ll42.y;
                    if ((i2 & 3072) != 0) {
                        if (ll42 != ll4 && (i2 & 1024) != 0) {
                            break loop0;
                        } else if ((i2 & 2048) != 0) {
                            eq4 eq4 = null;
                            ll4 ll43 = ll42;
                            while (ll43 != null) {
                                if (!(ll43 instanceof e40)) {
                                    if ((ll43.y & 2048) != 0 && (ll43 instanceof wo1)) {
                                        int i3 = 0;
                                        for (ll4 ll44 = ((wo1) ll43).L; ll44 != null; ll44 = ll44.B) {
                                            if ((ll44.y & 2048) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    ll43 = ll44;
                                                } else {
                                                    if (eq4 == null) {
                                                        eq4 = new eq4(new ll4[16]);
                                                    }
                                                    if (ll43 != null) {
                                                        eq4.b(ll43);
                                                        ll43 = null;
                                                    }
                                                    eq4.b(ll44);
                                                }
                                            }
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    ll43 = rc9.j(eq4);
                                } else {
                                    kl4 kl4 = ((e40) ll43).K;
                                    yb3.b("applyFocusProperties called on wrong node");
                                    kl4.getClass();
                                    ku4.a();
                                    return null;
                                }
                            }
                            continue;
                        } else {
                            continue;
                        }
                    }
                    ll42 = ll42.A;
                }
            }
            O0 = O0.v();
            if (O0 == null || (o00 = O0.a0) == null) {
                ll42 = null;
            } else {
                ll42 = (ib7) o00.f;
            }
        }
        return obj;
    }

    public final ly5 Y0(dy3 dy3) {
        ly5 ly5 = X0().l;
        if (ly5 != d63.C) {
            if (dy3 == null) {
                return ly5;
            }
            return ly5.i(dy3.O(rc9.N0(this), 0));
        } else if (dy3 != null) {
            return dy3.Q(rc9.N0(this), false);
        } else {
            return z85.c(0, pv8.O(rc9.N0(this).y));
        }
    }

    public final b24 Z0() {
        o00 o00;
        ol4 ol4;
        if (!this.w.J) {
            yb3.b("visitAncestors called on an unattached node");
        }
        ll4 ll4 = this.w.A;
        uy3 O0 = rc9.O0(this);
        while (true) {
            if (O0 == null) {
                break;
            }
            if ((((ll4) O0.a0.g).z & 8388640) != 0) {
                while (ll4 != null) {
                    int i = ll4.y;
                    if ((i & 8388640) != 0) {
                        if ((8388608 & i) != 0) {
                            if (!(ll4 instanceof b24)) {
                                if (ll4 instanceof wo1) {
                                    ll4 = null;
                                    for (ll4 ll42 = ((wo1) ll4).L; ll42 != null; ll42 = ll42.B) {
                                        if (ll42 instanceof b24) {
                                            ll4 = ll42;
                                        }
                                    }
                                } else {
                                    ll4 = null;
                                }
                            }
                            b24 b24 = (b24) ll4;
                            if (b24 != null) {
                                return b24;
                            }
                        } else if ((i & 32) != 0) {
                            if (ll4 instanceof ol4) {
                                ol4 = ll4;
                            } else if (ll4 instanceof wo1) {
                                ol4 = null;
                                for (ll4 ll43 = ((wo1) ll4).L; ll43 != null; ll43 = ll43.B) {
                                    if (ll43 instanceof ol4) {
                                        ol4 = ll43;
                                    }
                                }
                            } else {
                                ol4 = null;
                            }
                            ol4 ol42 = ol4;
                            if (ol42 != null) {
                                ol42.V();
                            }
                        }
                    }
                    ll4 = ll4.A;
                }
            }
            O0 = O0.v();
            if (O0 == null || (o00 = O0.a0) == null) {
                ll4 = null;
            } else {
                ll4 = (ib7) o00.f;
            }
        }
        return null;
    }

    public final sk2 a1() {
        vk2 g;
        o00 o00;
        boolean z = this.J;
        sk2 sk2 = sk2.y;
        if (!z || (g = ((lk2) ((je) rc9.P0(this)).getFocusOwner()).g()) == null) {
            return sk2;
        }
        if (this == g) {
            return sk2.w;
        }
        if (g.J) {
            if (!g.w.J) {
                yb3.b("visitAncestors called on an unattached node");
            }
            ll4 ll4 = g.w.A;
            uy3 O0 = rc9.O0(g);
            while (O0 != null) {
                if ((((ll4) O0.a0.g).z & 1024) != 0) {
                    while (ll4 != null) {
                        if ((ll4.y & 1024) != 0) {
                            ll4 ll42 = ll4;
                            eq4 eq4 = null;
                            while (ll42 != null) {
                                if (ll42 instanceof vk2) {
                                    if (this == ((vk2) ll42)) {
                                        return sk2.x;
                                    }
                                } else if ((ll42.y & 1024) != 0 && (ll42 instanceof wo1)) {
                                    int i = 0;
                                    for (ll4 ll43 = ((wo1) ll42).L; ll43 != null; ll43 = ll43.B) {
                                        if ((ll43.y & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
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
                                    if (i == 1) {
                                    }
                                }
                                ll42 = rc9.j(eq4);
                            }
                            continue;
                        }
                        ll4 = ll4.A;
                    }
                }
                O0 = O0.v();
                if (O0 == null || (o00 = O0.a0) == null) {
                    ll4 = null;
                } else {
                    ll4 = (ib7) o00.f;
                }
            }
        }
        return sk2;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, h06] */
    public final void b1() {
        int ordinal = a1().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return;
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    h.c();
                    return;
                }
                return;
            }
        }
        ? obj = new Object();
        i35.o(this, new ae(4, obj, this));
        Object obj2 = obj.w;
        if (obj2 == null) {
            sg3.a0("focusProperties");
            throw null;
        } else if (!((mk2) obj2).a) {
            ((lk2) ((je) rc9.P0(this)).getFocusOwner()).c(8, true, true);
        }
    }

    public final boolean c1(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            if (X0().a) {
                return V0();
            }
            boolean l = t75.l(this, i, new xc4(i));
            Trace.endSection();
            return l;
        } finally {
            Trace.endSection();
        }
    }

    public final void m0() {
        b1();
    }

    public final void N0() {
    }
}
