package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: q45  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class q45 extends tv4 {
    public final g30 h;
    public boolean i = true;

    public q45(g30 g30, r45 r45) {
        super(r45, g30.b, 0);
        this.h = g30;
    }

    public final void c() {
        g30 g30 = this.h;
        switch (g30.d) {
            case b85.b:
                ((f1) g30.e).k();
                return;
            case 1:
                rq2 rq2 = (rq2) g30.e;
                if (rq2.L(3)) {
                    Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + rq2);
                }
                if (rq2.L(3)) {
                    Log.d("FragmentManager", "cancelBackStackTransition for transition " + rq2.h);
                }
                q30 q30 = rq2.h;
                if (q30 != null) {
                    q30.r = false;
                    q30.d();
                    q30 q302 = rq2.h;
                    y0 y0Var = new y0(16, rq2);
                    if (q302.p == null) {
                        q302.p = new ArrayList();
                    }
                    q302.p.add(y0Var);
                    rq2.h.e(false, true);
                    rq2.i = true;
                    rq2.A(true);
                    rq2.F();
                    rq2.i = false;
                    rq2.h = null;
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void d() {
        g30 g30 = this.h;
        switch (g30.d) {
            case b85.b:
                ((f1) g30.e).l();
                return;
            case 1:
                rq2 rq2 = (rq2) g30.e;
                if (rq2.L(3)) {
                    Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + rq2);
                }
                g30 g302 = rq2.j;
                ArrayList arrayList = rq2.n;
                rq2.i = true;
                rq2.A(true);
                rq2.i = false;
                if (rq2.h != null) {
                    if (!arrayList.isEmpty()) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet(rq2.G(rq2.h));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (it.next() == null) {
                                Iterator it2 = linkedHashSet.iterator();
                                if (it2.hasNext()) {
                                    bq2 bq2 = (bq2) it2.next();
                                    throw null;
                                }
                            } else {
                                ku4.a();
                                return;
                            }
                        }
                    }
                    Iterator it3 = rq2.h.a.iterator();
                    while (it3.hasNext()) {
                        bq2 bq22 = ((ar2) it3.next()).b;
                        if (bq22 != null) {
                            bq22.I = false;
                        }
                    }
                    Iterator it4 = rq2.f(new ArrayList(Collections.singletonList(rq2.h)), 0, 1).iterator();
                    while (it4.hasNext()) {
                        un1 un1 = (un1) it4.next();
                        ArrayList arrayList2 = un1.c;
                        if (rq2.L(3)) {
                            Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
                        }
                        un1.k(arrayList2);
                        un1.c(arrayList2);
                    }
                    Iterator it5 = rq2.h.a.iterator();
                    while (it5.hasNext()) {
                        bq2 bq23 = ((ar2) it5.next()).b;
                        if (bq23 != null && bq23.b0 == null) {
                            rq2.g(bq23).k();
                        }
                    }
                    rq2.h = null;
                    rq2.i0();
                    if (rq2.L(3)) {
                        Log.d("FragmentManager", "Op is being set to null");
                        Log.d("FragmentManager", "OnBackPressedCallback enabled=" + g302.b + " for  FragmentManager " + rq2);
                        return;
                    }
                    return;
                } else if (g302.b) {
                    if (rq2.L(3)) {
                        Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                    }
                    rq2.T();
                    return;
                } else {
                    if (rq2.L(3)) {
                        Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                    }
                    rq2.g.b().a();
                    return;
                }
            case 2:
                ((iu4) g30.e).c();
                return;
            default:
                ((lf) g30.e).y(g30);
                return;
        }
    }

    public final void e(qv4 qv4) {
        e30 e30 = new e30(qv4);
        g30 g30 = this.h;
        switch (g30.d) {
            case b85.b:
                ((f1) g30.e).m(e30);
                return;
            case 1:
                rq2 rq2 = (rq2) g30.e;
                if (rq2.L(2)) {
                    Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + rq2);
                }
                if (rq2.h != null) {
                    Iterator it = rq2.f(new ArrayList(Collections.singletonList(rq2.h)), 0, 1).iterator();
                    while (it.hasNext()) {
                        un1 un1 = (un1) it.next();
                        un1.getClass();
                        if (rq2.L(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + e30.c);
                        }
                        ArrayList arrayList = un1.c;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            it0.h0(arrayList2, ((gz6) it2.next()).k);
                        }
                        List b1 = dt0.b1(dt0.g1(arrayList2));
                        int size = b1.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            ((fz6) b1.get(i2)).c(e30, un1.a);
                        }
                    }
                    Iterator it3 = rq2.n.iterator();
                    if (it3.hasNext()) {
                        throw pb4.g(it3);
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void f(qv4 qv4) {
        qv4.getClass();
        new e30(qv4);
        g30 g30 = this.h;
        switch (g30.d) {
            case b85.b:
                ((f1) g30.e).n();
                return;
            case 1:
                rq2 rq2 = (rq2) g30.e;
                if (rq2.L(3)) {
                    Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + rq2);
                }
                rq2.x();
                rq2.y(new qq2(rq2), false);
                return;
            default:
                return;
        }
    }

    public final void j(boolean z) {
        boolean z2;
        this.i = z;
        if (!z || !this.h.b) {
            z2 = false;
        } else {
            z2 = true;
        }
        i(z2);
    }
}
