package defpackage;

import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;

/* renamed from: lk2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lk2 implements ik2 {
    public final je a;
    public final je b;
    public final vk2 c = new vk2(2, (gs2) null, 14);
    public final gk2 d;
    public final jk2 e;
    public ep4 f;
    public final lp4 g;
    public vk2 h;

    public lk2(je jeVar, je jeVar2) {
        this.a = jeVar;
        this.b = jeVar2;
        this.d = new gk2(this, jeVar2);
        this.e = new jk2(this);
        this.g = new lp4(1);
    }

    public final boolean b(boolean z) {
        o00 o00;
        if (g() != null) {
            vk2 g2 = g();
            j((vk2) null);
            if (g2 != null) {
                sk2 sk2 = sk2.w;
                sk2 sk22 = sk2.y;
                g2.W0(sk2, sk22);
                if (!g2.w.J) {
                    yb3.b("visitAncestors called on an unattached node");
                }
                ll4 ll4 = g2.w.A;
                uy3 O0 = rc9.O0(g2);
                while (O0 != null) {
                    if ((((ll4) O0.a0.g).z & 1024) != 0) {
                        while (ll4 != null) {
                            if ((ll4.y & 1024) != 0) {
                                ll4 ll42 = ll4;
                                eq4 eq4 = null;
                                while (ll42 != null) {
                                    if (ll42 instanceof vk2) {
                                        ((vk2) ll42).W0(sk2.x, sk22);
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
        }
        return true;
    }

    public final boolean c(int i, boolean z, boolean z2) {
        boolean z3 = true;
        if (!z) {
            int ordinal = we.G(this.c).ordinal();
            if (ordinal == 0) {
                b(z);
            } else if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
                z3 = false;
            } else {
                h.c();
                return false;
            }
        } else {
            b(z);
        }
        if (z3 && z2) {
            d();
        }
        return z3;
    }

    public final void d() {
        je jeVar = this.a;
        if (jeVar.isFocused() || jeVar.hasFocus()) {
            jeVar.clearFocus();
        } else if (jeVar.hasFocus()) {
            View findFocus = jeVar.findFocus();
            if (findFocus != null) {
                findFocus.clearFocus();
            }
            jeVar.clearFocus();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0057, code lost:
        if (r7 == null) goto L_0x0059;
     */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x016f A[Catch:{ all -> 0x02ee }] */
    public final boolean e(KeyEvent keyEvent, sr2 sr2) {
        ll4 ll4;
        int i;
        o00 o00;
        boolean z;
        ll4 ll42;
        o00 o002;
        ll4 ll43;
        o00 o003;
        vk2 vk2 = this.c;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.d.e) {
                System.out.println("FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                return false;
            } else if (!k(keyEvent)) {
                Trace.endSection();
                return false;
            } else {
                vk2 i0 = bb0.i0(vk2);
                if (i0 != null) {
                    if (!i0.w.J) {
                        yb3.b("visitLocalDescendants called on an unattached node");
                    }
                    ll4 ll44 = i0.w;
                    if ((ll44.z & 9216) != 0) {
                        ll4 ll45 = ll44.B;
                        ll4 = null;
                        while (true) {
                            if (ll45 == null) {
                                break;
                            }
                            int i2 = ll45.y;
                            if ((i2 & 9216) != 0) {
                                if ((i2 & 1024) != 0) {
                                    break;
                                }
                                ll4 = ll45;
                            }
                            ll45 = ll45.B;
                        }
                    } else {
                        ll4 = null;
                    }
                }
                if (i0 != null) {
                    if (!i0.w.J) {
                        yb3.b("visitAncestors called on an unattached node");
                    }
                    ll4 ll46 = i0.w;
                    uy3 O0 = rc9.O0(i0);
                    loop1:
                    while (true) {
                        if (O0 == null) {
                            ll43 = null;
                            break;
                        }
                        if ((((ll4) O0.a0.g).z & 8192) != 0) {
                            while (ll46 != null) {
                                if ((ll46.y & 8192) != 0) {
                                    eq4 eq4 = null;
                                    ll43 = ll46;
                                    while (ll43 != null) {
                                        if (ll43 instanceof us3) {
                                            break loop1;
                                        }
                                        if ((ll43.y & 8192) != 0 && (ll43 instanceof wo1)) {
                                            int i3 = 0;
                                            for (ll4 ll47 = ((wo1) ll43).L; ll47 != null; ll47 = ll47.B) {
                                                if ((ll47.y & 8192) != 0) {
                                                    i3++;
                                                    if (i3 == 1) {
                                                        ll43 = ll47;
                                                    } else {
                                                        if (eq4 == null) {
                                                            eq4 = new eq4(new ll4[16]);
                                                        }
                                                        if (ll43 != null) {
                                                            eq4.b(ll43);
                                                            ll43 = null;
                                                        }
                                                        eq4.b(ll47);
                                                    }
                                                }
                                            }
                                            if (i3 == 1) {
                                            }
                                        }
                                        ll43 = rc9.j(eq4);
                                    }
                                    continue;
                                }
                                ll46 = ll46.A;
                            }
                        }
                        O0 = O0.v();
                        if (O0 == null || (o003 = O0.a0) == null) {
                            ll46 = null;
                        } else {
                            ll46 = (ib7) o003.f;
                        }
                    }
                    us3 us3 = (us3) ll43;
                    if (us3 != null) {
                        ll4 = ((ll4) us3).w;
                        if (ll4 != null) {
                            if (!ll4.w.J) {
                                yb3.b("visitAncestors called on an unattached node");
                            }
                            ll4 ll48 = ll4.w.A;
                            uy3 O02 = rc9.O0(ll4);
                            ArrayList arrayList = null;
                            while (O02 != null) {
                                if ((((ll4) O02.a0.g).z & 8192) != 0) {
                                    while (ll48 != null) {
                                        if ((ll48.y & 8192) != 0) {
                                            ll4 ll49 = ll48;
                                            eq4 eq42 = null;
                                            while (ll49 != null) {
                                                if (ll49 instanceof us3) {
                                                    if (arrayList == null) {
                                                        arrayList = new ArrayList();
                                                    }
                                                    arrayList.add(ll49);
                                                    z = false;
                                                } else {
                                                    z = true;
                                                }
                                                if (z && (ll49.y & 8192) != 0 && (ll49 instanceof wo1)) {
                                                    int i4 = 0;
                                                    for (ll4 ll410 = ((wo1) ll49).L; ll410 != null; ll410 = ll410.B) {
                                                        if ((ll410.y & 8192) != 0) {
                                                            i4++;
                                                            if (i4 == 1) {
                                                                ll49 = ll410;
                                                            } else {
                                                                if (eq42 == null) {
                                                                    eq42 = new eq4(new ll4[16]);
                                                                }
                                                                if (ll49 != null) {
                                                                    eq42.b(ll49);
                                                                    ll49 = null;
                                                                }
                                                                eq42.b(ll410);
                                                            }
                                                        }
                                                    }
                                                    if (i4 == 1) {
                                                    }
                                                }
                                                ll49 = rc9.j(eq42);
                                            }
                                        }
                                        ll48 = ll48.A;
                                    }
                                }
                                O02 = O02.v();
                                if (O02 == null || (o00 = O02.a0) == null) {
                                    ll48 = null;
                                } else {
                                    ll48 = (ib7) o00.f;
                                }
                            }
                            if (arrayList != null && arrayList.size() - 1 >= 0) {
                                while (true) {
                                    int i5 = i - 1;
                                    if (((us3) arrayList.get(i)).j(keyEvent)) {
                                        Trace.endSection();
                                        return true;
                                    } else if (i5 >= 0) {
                                        i = i5;
                                    }
                                }
                            }
                            ll4 ll411 = ll4.w;
                            eq4 eq43 = null;
                            while (ll411 != null) {
                                if (ll411 instanceof us3) {
                                    if (((us3) ll411).j(keyEvent)) {
                                        Trace.endSection();
                                        return true;
                                    }
                                } else if ((ll411.y & 8192) != 0 && (ll411 instanceof wo1)) {
                                    int i6 = 0;
                                    for (ll4 ll412 = ((wo1) ll411).L; ll412 != null; ll412 = ll412.B) {
                                        if ((ll412.y & 8192) != 0) {
                                            i6++;
                                            if (i6 == 1) {
                                                ll411 = ll412;
                                            } else {
                                                if (eq43 == null) {
                                                    eq43 = new eq4(new ll4[16]);
                                                }
                                                if (ll411 != null) {
                                                    eq43.b(ll411);
                                                    ll411 = null;
                                                }
                                                eq43.b(ll412);
                                            }
                                        }
                                    }
                                    if (i6 == 1) {
                                    }
                                }
                                ll411 = rc9.j(eq43);
                            }
                            if (((Boolean) sr2.b()).booleanValue()) {
                                Trace.endSection();
                                return true;
                            }
                            ll4 ll413 = ll4.w;
                            eq4 eq44 = null;
                            while (ll413 != null) {
                                if (ll413 instanceof us3) {
                                    if (((us3) ll413).B(keyEvent)) {
                                        Trace.endSection();
                                        return true;
                                    }
                                } else if ((ll413.y & 8192) != 0 && (ll413 instanceof wo1)) {
                                    int i7 = 0;
                                    for (ll4 ll414 = ((wo1) ll413).L; ll414 != null; ll414 = ll414.B) {
                                        if ((ll414.y & 8192) != 0) {
                                            i7++;
                                            if (i7 == 1) {
                                                ll413 = ll414;
                                            } else {
                                                if (eq44 == null) {
                                                    eq44 = new eq4(new ll4[16]);
                                                }
                                                if (ll413 != null) {
                                                    eq44.b(ll413);
                                                    ll413 = null;
                                                }
                                                eq44.b(ll414);
                                            }
                                        }
                                    }
                                    if (i7 == 1) {
                                    }
                                }
                                ll413 = rc9.j(eq44);
                            }
                            if (arrayList != null) {
                                int size = arrayList.size();
                                for (int i8 = 0; i8 < size; i8++) {
                                    if (((us3) arrayList.get(i8)).B(keyEvent)) {
                                        Trace.endSection();
                                        return true;
                                    }
                                }
                            }
                        }
                        Trace.endSection();
                        return false;
                    }
                }
                if (!vk2.w.J) {
                    yb3.b("visitAncestors called on an unattached node");
                }
                ll4 ll415 = vk2.w.A;
                uy3 O03 = rc9.O0(vk2);
                loop5:
                while (true) {
                    if (O03 == null) {
                        ll42 = null;
                        break;
                    }
                    if ((((ll4) O03.a0.g).z & 8192) != 0) {
                        while (ll415 != null) {
                            if ((ll415.y & 8192) != 0) {
                                ll42 = ll415;
                                eq4 eq45 = null;
                                while (ll42 != null) {
                                    if (ll42 instanceof us3) {
                                        break loop5;
                                    }
                                    if ((ll42.y & 8192) != 0 && (ll42 instanceof wo1)) {
                                        int i9 = 0;
                                        for (ll4 ll416 = ((wo1) ll42).L; ll416 != null; ll416 = ll416.B) {
                                            if ((ll416.y & 8192) != 0) {
                                                i9++;
                                                if (i9 == 1) {
                                                    ll42 = ll416;
                                                } else {
                                                    if (eq45 == null) {
                                                        eq45 = new eq4(new ll4[16]);
                                                    }
                                                    if (ll42 != null) {
                                                        eq45.b(ll42);
                                                        ll42 = null;
                                                    }
                                                    eq45.b(ll416);
                                                }
                                            }
                                        }
                                        if (i9 == 1) {
                                        }
                                    }
                                    ll42 = rc9.j(eq45);
                                }
                                continue;
                            }
                            ll415 = ll415.A;
                        }
                    }
                    O03 = O03.v();
                    if (O03 == null || (o002 = O03.a0) == null) {
                        ll415 = null;
                    } else {
                        ll415 = (ib7) o002.f;
                    }
                }
                us3 us32 = (us3) ll42;
                if (us32 != null) {
                    ll4 = ((ll4) us32).w;
                } else {
                    ll4 = null;
                }
                if (ll4 != null) {
                }
                Trace.endSection();
                return false;
            }
        } finally {
            Trace.endSection();
        }
    }

    public final Boolean f(int i, ly5 ly5, vr2 vr2) {
        boolean z;
        vk2 vk2;
        o00 o00;
        int i2 = i;
        ly5 ly52 = ly5;
        vr2 vr22 = vr2;
        vk2 vk22 = this.c;
        vk2 i0 = bb0.i0(vk22);
        int i3 = 4;
        je jeVar = this.b;
        boolean z2 = false;
        if (i0 != null) {
            ey3 layoutDirection = jeVar.getLayoutDirection();
            mk2 X0 = i0.X0();
            ok2 ok2 = X0.h;
            ok2 ok22 = X0.i;
            if (i2 == 1) {
                ok2 = X0.b;
            } else if (i2 == 2) {
                ok2 = X0.c;
            } else if (i2 == 5) {
                ok2 = X0.d;
            } else if (i2 == 6) {
                ok2 = X0.e;
            } else if (i2 == 3) {
                int ordinal = layoutDirection.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        ok2 = ok22;
                    } else {
                        h.c();
                        return null;
                    }
                }
                if (ok2 == ok2.b) {
                    ok2 = null;
                }
                if (ok2 == null) {
                    ok2 = X0.f;
                }
            } else if (i2 == 4) {
                int ordinal2 = layoutDirection.ordinal();
                if (ordinal2 == 0) {
                    ok2 = ok22;
                } else if (ordinal2 != 1) {
                    h.c();
                    return null;
                }
                if (ok2 == ok2.b) {
                    ok2 = null;
                }
                if (ok2 == null) {
                    ok2 = X0.g;
                }
            } else if (i2 == 7 || i2 == 8) {
                lk2 lk2 = (lk2) ((je) rc9.P0(i0)).getFocusOwner();
                vk2 g2 = lk2.g();
                if (i2 == 7) {
                    X0.j.getClass();
                } else {
                    X0.k.getClass();
                }
                if (g2 != lk2.g()) {
                    ok2 = ok2.d;
                } else {
                    ok2 = ok2.b;
                }
            } else {
                h.s("invalid FocusDirection");
                return null;
            }
            ok2 ok23 = ok2.c;
            if (!sg3.e(ok2, ok23)) {
                if (sg3.e(ok2, ok2.d)) {
                    vk2 i02 = bb0.i0(vk22);
                    if (i02 != null) {
                        return (Boolean) vr22.y(i02);
                    }
                } else {
                    ok2 ok24 = ok2.b;
                    if (!sg3.e(ok2, ok24)) {
                        if (ok2 == ok24) {
                            h.s("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        } else if (ok2 != ok23) {
                            eq4 eq4 = ok2.a;
                            int i4 = eq4.y;
                            if (i4 == 0) {
                                System.out.println("FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                            } else {
                                Object[] objArr = eq4.w;
                                boolean z3 = false;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    qk2 qk2 = (qk2) objArr[i5];
                                    if (!((ll4) qk2).w.J) {
                                        yb3.b("visitChildren called on an unattached node");
                                    }
                                    eq4 eq42 = new eq4(new ll4[16]);
                                    ll4 ll4 = ((ll4) qk2).w;
                                    ll4 ll42 = ll4.B;
                                    if (ll42 == null) {
                                        rc9.h(eq42, ll4);
                                    } else {
                                        eq42.b(ll42);
                                    }
                                    while (true) {
                                        int i6 = eq42.y;
                                        if (i6 == 0) {
                                            break;
                                        }
                                        ll4 ll43 = (ll4) eq42.l(i6 - 1);
                                        if ((ll43.z & 1024) == 0) {
                                            rc9.h(eq42, ll43);
                                        } else {
                                            while (true) {
                                                if (ll43 == null) {
                                                    continue;
                                                    break;
                                                } else if ((ll43.y & 1024) != 0) {
                                                    eq4 eq43 = null;
                                                    while (ll43 != null) {
                                                        if (ll43 instanceof vk2) {
                                                            if (((Boolean) vr22.y((vk2) ll43)).booleanValue()) {
                                                                z3 = true;
                                                                break;
                                                            }
                                                        } else if ((ll43.y & 1024) != 0 && (ll43 instanceof wo1)) {
                                                            int i7 = 0;
                                                            for (ll4 ll44 = ((wo1) ll43).L; ll44 != null; ll44 = ll44.B) {
                                                                if ((ll44.y & 1024) != 0) {
                                                                    i7++;
                                                                    if (i7 == 1) {
                                                                        ll43 = ll44;
                                                                    } else {
                                                                        if (eq43 == null) {
                                                                            eq43 = new eq4(new ll4[16]);
                                                                        }
                                                                        if (ll43 != null) {
                                                                            eq43.b(ll43);
                                                                            ll43 = null;
                                                                        }
                                                                        eq43.b(ll44);
                                                                    }
                                                                }
                                                            }
                                                            if (i7 == 1) {
                                                            }
                                                        }
                                                        ll43 = rc9.j(eq43);
                                                    }
                                                    continue;
                                                } else {
                                                    ll43 = ll43.B;
                                                }
                                            }
                                        }
                                    }
                                }
                                z2 = z3;
                            }
                            return Boolean.valueOf(z2);
                        } else {
                            h.s("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                    }
                }
            }
            return null;
        }
        i0 = null;
        ey3 layoutDirection2 = jeVar.getLayoutDirection();
        zj zjVar = new zj(i0, this, vr22, 2);
        if (i2 == 1 || i2 == 2) {
            if (i2 == 1) {
                z = o55.h(vk22, zjVar);
            } else if (i2 == 2) {
                z = o55.c(vk22, zjVar);
            } else {
                h.s("This function should only be used for 1-D focus search");
                return null;
            }
            return Boolean.valueOf(z);
        } else if (i2 == 3 || i2 == 4 || i2 == 5 || i2 == 6) {
            return t75.L(i2, zjVar, vk22, ly52);
        } else {
            if (i2 == 7) {
                int ordinal3 = layoutDirection2.ordinal();
                if (ordinal3 != 0) {
                    if (ordinal3 == 1) {
                        i3 = 3;
                    } else {
                        h.c();
                        return null;
                    }
                }
                vk2 i03 = bb0.i0(vk22);
                if (i03 != null) {
                    return t75.L(i3, zjVar, i03, ly52);
                }
                return null;
            } else if (i2 == 8) {
                vk2 i04 = bb0.i0(vk22);
                if (i04 != null) {
                    if (!i04.w.J) {
                        yb3.b("visitAncestors called on an unattached node");
                    }
                    ll4 ll45 = i04.w.A;
                    uy3 O0 = rc9.O0(i04);
                    loop5:
                    while (true) {
                        if (O0 == null) {
                            break;
                        }
                        if ((((ll4) O0.a0.g).z & 1024) != 0) {
                            while (ll45 != null) {
                                if ((ll45.y & 1024) != 0) {
                                    ll4 ll46 = ll45;
                                    eq4 eq44 = null;
                                    while (ll46 != null) {
                                        if (ll46 instanceof vk2) {
                                            vk2 vk23 = (vk2) ll46;
                                            if (vk23.X0().a) {
                                                vk2 = vk23;
                                                break loop5;
                                            }
                                        } else if ((ll46.y & 1024) != 0 && (ll46 instanceof wo1)) {
                                            int i8 = 0;
                                            for (ll4 ll47 = ((wo1) ll46).L; ll47 != null; ll47 = ll47.B) {
                                                if ((ll47.y & 1024) != 0) {
                                                    i8++;
                                                    if (i8 == 1) {
                                                        ll46 = ll47;
                                                    } else {
                                                        if (eq44 == null) {
                                                            eq44 = new eq4(new ll4[16]);
                                                        }
                                                        if (ll46 != null) {
                                                            eq44.b(ll46);
                                                            ll46 = null;
                                                        }
                                                        eq44.b(ll47);
                                                    }
                                                }
                                            }
                                            if (i8 == 1) {
                                            }
                                            ll46 = rc9.j(eq44);
                                        }
                                        ll46 = rc9.j(eq44);
                                    }
                                    continue;
                                }
                                ll45 = ll45.A;
                            }
                        }
                        O0 = O0.v();
                        if (O0 == null || (o00 = O0.a0) == null) {
                            ll45 = null;
                        } else {
                            ll45 = (ib7) o00.f;
                        }
                    }
                    if (!(vk2 == null || vk2 == vk22)) {
                        z2 = ((Boolean) zjVar.y(vk2)).booleanValue();
                    }
                    return Boolean.valueOf(z2);
                }
                vk2 = null;
                z2 = ((Boolean) zjVar.y(vk2)).booleanValue();
                return Boolean.valueOf(z2);
            } else {
                throw new IllegalStateException("Focus search invoked with invalid FocusDirection ".concat(bk2.a(i2)).toString());
            }
        }
    }

    public final vk2 g() {
        vk2 vk2 = this.h;
        if (vk2 == null || !vk2.J) {
            return null;
        }
        return vk2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, h06] */
    public final boolean h(int i, boolean z) {
        boolean z2;
        ? obj = new Object();
        obj.w = Boolean.FALSE;
        vk2 g2 = g();
        Boolean f2 = f(i, this.a.getEmbeddedViewFocusRect(), new kk2(i, obj));
        if (!sg3.e(f2, Boolean.TRUE) || g2 == g()) {
            if (!(f2 == null || obj.w == null)) {
                if (!f2.booleanValue() || !((Boolean) obj.w).booleanValue()) {
                    if ((i == 1 || i == 2) && z && c(i, false, false)) {
                        Boolean f3 = f(i, (ly5) null, new fe(i, 3));
                        if (f3 != null) {
                            z2 = f3.booleanValue();
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean i(int i) {
        boolean z = false;
        if (!c(i, false, false)) {
            return false;
        }
        Boolean f2 = f(i, (ly5) null, new fe(i, 2));
        if (f2 != null) {
            z = f2.booleanValue();
        }
        if (!z) {
            d();
        }
        return z;
    }

    public final void j(vk2 vk2) {
        vk2 vk22 = this.h;
        this.h = vk2;
        lp4 lp4 = this.g;
        Object[] objArr = lp4.a;
        int i = lp4.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((hk2) objArr[i2]).b(vk22, vk2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0099, code lost:
        r33 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00a3, code lost:
        if (((r8 & ((~r8) << 6)) & -9187201950435737472L) == r33) goto L_0x02c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00a5, code lost:
        r0 = r4.b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00ab, code lost:
        if (r4.e != 0) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00bc, code lost:
        if (((r4.a[r0 >> 3] >> ((r0 & 7) << 3)) & 255) != 254) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00be, code lost:
        r37 = true;
        r39 = 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00c4, code lost:
        r0 = r4.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00c6, code lost:
        if (r0 <= 8) goto L_0x0206;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00dd, code lost:
        if (java.lang.Long.compare((((long) r4.d) * 32) ^ Long.MIN_VALUE, (((long) r0) * 25) ^ Long.MIN_VALUE) > 0) goto L_0x0206;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00df, code lost:
        r0 = r4.a;
        r6 = r4.c;
        r12 = r4.b;
        r13 = (r6 + 7) >> 3;
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00eb, code lost:
        if (r14 >= r13) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ed, code lost:
        r8 = r0[r14] & -9187201950435737472L;
        r0[r14] = ((~r8) + (r8 >>> 7)) & -72340172838076674L;
        r14 = r14 + 1;
        r5 = r5;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0108, code lost:
        r15 = r5;
        r18 = r6;
        r39 = 128;
        r5 = defpackage.qs.Z0(r0);
        r6 = r5 - 1;
        r13 = 72057594037927935L;
        r0[r6] = (r0[r6] & 72057594037927935L) | -72057594037927936L;
        r0[r5] = r0[0];
        r5 = r18;
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0129, code lost:
        if (r6 == r5) goto L_0x01f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x012b, code lost:
        r8 = r6 >> 3;
        r9 = (r6 & 7) << 3;
        r22 = (r0[r8] >> r9) & 255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0139, code lost:
        if (r22 != 128) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x013b, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0140, code lost:
        if (r22 == 254) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0143, code lost:
        r18 = java.lang.Long.hashCode(r12[r6]) * r28;
        r18 = r18 ^ (r18 << 16);
        r22 = r13;
        r13 = r18 >>> 7;
        r14 = r4.b(r13);
        r13 = r13 & r5;
        r29 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0165, code lost:
        if ((((r14 - r13) & r5) / 8) != (((r6 - r13) & r5) / 8)) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0167, code lost:
        r15 = r7;
        r0[r8] = (r0[r8] & (~(255 << r9))) | (((long) (r18 & 127)) << r9);
        r0[r0.length - (r15 ? 1 : 0)] = (r0[0] & r22) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r7 = r15;
        r13 = r22;
        r15 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x018a, code lost:
        r15 = r7;
        r27 = r8;
        r7 = r14 >> 3;
        r25 = r0[r7];
        r8 = (r14 & 7) << 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x019b, code lost:
        if (((r25 >> r8) & 255) != 128) goto L_0x01c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x019d, code lost:
        r35 = r5;
        r36 = r6;
        r0[r7] = (r25 & (~(255 << r8))) | (((long) (r18 & 127)) << r8);
        r0[r27] = (r0[r27] & (~(255 << r9))) | (128 << r9);
        r12[r14] = r12[r36];
        r12[r36] = r33;
        r6 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x01c5, code lost:
        r35 = r5;
        r36 = r6;
        r0[r7] = (r25 & (~(255 << r8))) | (((long) (r18 & 127)) << r8);
        r5 = r12[r14];
        r12[r14] = r12[r36];
        r12[r36] = r5;
        r6 = r36 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01e2, code lost:
        r0[r0.length - (r15 ? 1 : 0)] = (r0[0] & r22) | Long.MIN_VALUE;
        r6 = r6 + r15;
        r7 = r15;
        r13 = r22;
        r15 = r29;
        r5 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01f6, code lost:
        r15 = r7;
        r4.e = defpackage.bg6.a(r4.c) - r4.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0202, code lost:
        r37 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0206, code lost:
        r15 = true;
        r39 = 128;
        r0 = defpackage.bg6.b(r4.c);
        r5 = r4.a;
        r6 = r4.b;
        r7 = r4.c;
        r4.c(r0);
        r0 = r4.a;
        r8 = r4.b;
        r9 = r4.c;
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0220, code lost:
        if (r12 >= r7) goto L_0x0202;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0230, code lost:
        if (((r5[r12 >> 3] >> ((r12 & 7) << 3)) & 255) >= 128) goto L_0x0272;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0232, code lost:
        r13 = r6[r12];
        r16 = java.lang.Long.hashCode(r13) * r28;
        r16 = r16 ^ (r16 << 16);
        r37 = r15;
        r15 = r4.b(r16 >>> 7);
        r17 = r0;
        r0 = r16 & 127;
        r16 = r5;
        r18 = r6;
        r5 = (long) r0;
        r0 = r15 >> 3;
        r19 = (r15 & 7) << 3;
        r5 = (r17[r0] & (~(255 << r19))) | (r5 << r19);
        r17[r0] = r5;
        r17[(((r15 - 7) & r9) + (r9 & 7)) >> 3] = r5;
        r8[r15] = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0272, code lost:
        r17 = r0;
        r16 = r5;
        r18 = r6;
        r37 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x027a, code lost:
        r12 = r12 + 1;
        r5 = r16;
        r0 = r17;
        r6 = r18;
        r15 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0285, code lost:
        r0 = r4.b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0289, code lost:
        r14 = r0;
        r4.d++;
        r0 = r4.e;
        r3 = r4.a;
        r5 = r14 >> 3;
        r6 = r3[r5];
        r8 = (r14 & 7) << 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x02a2, code lost:
        if (((r6 >> r8) & 255) != r39) goto L_0x02a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x02a4, code lost:
        r21 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x02a6, code lost:
        r4.e = r0 - r21;
        r0 = r4.c;
        r6 = (r6 & (~(255 << r8))) | (r10 << r8);
        r3[r5] = r6;
        r3[(((r14 - 7) & r0) + (r0 & 7)) >> 3] = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x034c, code lost:
        if (((r6 & ((~r6) << 6)) & -9187201950435737472L) == 0) goto L_0x037c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x034e, code lost:
        r10 = -1;
     */
    public final boolean k(KeyEvent keyEvent) {
        int i;
        long j;
        boolean z;
        int i2;
        long x = rd3.x(keyEvent);
        int A = rd3.A(keyEvent);
        int i3 = -862048943;
        long j2 = 0;
        char c2 = 8;
        int i4 = 0;
        boolean z2 = true;
        if (A == 2) {
            ep4 ep4 = this.f;
            if (ep4 == null) {
                ep4 = new ep4(3);
                this.f = ep4;
            }
            ep4 ep42 = ep4;
            int hashCode = Long.hashCode(x) * -862048943;
            int i5 = hashCode ^ (hashCode << 16);
            int i6 = i5 >>> 7;
            int i7 = i5 & 127;
            int i8 = ep42.c;
            int i9 = i6 & i8;
            int i10 = 0;
            loop0:
            while (true) {
                long[] jArr = ep42.a;
                int i11 = i9 >> 3;
                int i12 = (i9 & 7) << 3;
                long j3 = (jArr[i11] >>> i12) | ((jArr[i11 + 1] << (64 - i12)) & ((-((long) i12)) >> 63));
                int i13 = i3;
                long j4 = (long) i7;
                long j5 = j3 ^ (j4 * 72340172838076673L);
                long j6 = (j5 - 72340172838076673L) & (~j5) & -9187201950435737472L;
                while (true) {
                    if (j6 == j2) {
                        break;
                    }
                    i2 = (i9 + (Long.numberOfTrailingZeros(j6) >> 3)) & i8;
                    long j7 = j2;
                    if (ep42.b[i2] == x) {
                        z = true;
                        break loop0;
                    }
                    j6 &= j6 - 1;
                    j2 = j7;
                }
                i10 += 8;
                i9 = (i9 + i10) & i8;
                i3 = i13;
                j2 = j;
            }
            ep42.b[i2] = x;
            return z;
        } else if (A != 1) {
            return true;
        } else {
            ep4 ep43 = this.f;
            if (ep43 == null || !ep43.a(x)) {
                return false;
            }
            ep4 ep44 = this.f;
            if (ep44 != null) {
                int hashCode2 = Long.hashCode(x) * -862048943;
                int i14 = hashCode2 ^ (hashCode2 << 16);
                int i15 = i14 & 127;
                int i16 = ep44.c;
                int i17 = i14 >>> 7;
                loop5:
                while (true) {
                    int i18 = i17 & i16;
                    long[] jArr2 = ep44.a;
                    int i19 = i18 >> 3;
                    int i20 = (i18 & 7) << 3;
                    long j8 = ((jArr2[i19 + 1] << (64 - i20)) & ((-((long) i20)) >> 63)) | (jArr2[i19] >>> i20);
                    long j9 = (((long) i15) * 72340172838076673L) ^ j8;
                    long j10 = (~j9) & (j9 - 72340172838076673L) & -9187201950435737472L;
                    while (true) {
                        if (j10 == 0) {
                            break;
                        }
                        i = ((Long.numberOfTrailingZeros(j10) >> 3) + i18) & i16;
                        if (ep44.b[i] == x) {
                            break loop5;
                        }
                        j10 &= j10 - 1;
                    }
                    i4 += 8;
                    i17 = i18 + i4;
                }
                if (i >= 0) {
                    ep44.d--;
                    long[] jArr3 = ep44.a;
                    int i21 = ep44.c;
                    int i22 = i >> 3;
                    int i23 = (i & 7) << 3;
                    long j11 = (jArr3[i22] & (~(255 << i23))) | (254 << i23);
                    jArr3[i22] = j11;
                    jArr3[(((i - 7) & i21) + (i21 & 7)) >> 3] = j11;
                    return true;
                }
            }
            return true;
        }
    }
}
