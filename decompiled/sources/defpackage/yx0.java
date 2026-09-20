package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import cu.lestebang.utiletecsa.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: yx0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yx0 {
    public final View a;
    public boolean b;
    public ky0 c;
    public t54 d;
    public if6 e;
    public a68 f;
    public final a93 g;
    public final r56 h;
    public final Configuration i;
    public final aq4 j;
    public final hd k;
    public final hj l;
    public final td m;
    public final sd n;
    public final cl2 o;
    public final aq4 p;
    public final my2 q;
    public final jj r;
    public final wy3 s;
    public final k44 t;
    public final uk0 u;
    public int v;
    public final kh w;
    public final xx0 x;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        r6 = r4.h;
     */
    public yx0(yx0 yx0, View view, ky0 ky0, t54 t54, if6 if6, a68 a68) {
        Context context;
        a93 a93;
        Configuration configuration;
        aq4 aq4;
        hd hdVar;
        hj hjVar;
        td tdVar;
        sd sdVar;
        cl2 cl2;
        aq4 aq42;
        my2 my2;
        jj jjVar;
        uk0 uk0;
        wy3 wy3;
        View view2;
        View view3 = null;
        if (yx0 == null || (view2 = yx0.a) == null) {
            context = null;
        } else {
            context = view2.getContext();
        }
        boolean e2 = sg3.e(context, view.getContext());
        this.a = view;
        this.c = ky0;
        this.d = t54;
        this.e = if6;
        this.f = a68;
        if (e2) {
            yx0.getClass();
            a93 = yx0.g;
        } else {
            a93 = new a93();
        }
        this.g = a93;
        r56 r56 = (yx0 == null || r56 == null) ? new r56() : r56;
        this.h = r56;
        if (e2) {
            yx0.getClass();
            configuration = yx0.i;
        } else {
            configuration = new Configuration(view.getContext().getResources().getConfiguration());
        }
        this.i = configuration;
        if (e2) {
            yx0.getClass();
            aq4 = yx0.j;
        } else {
            aq4 = u55.p(new Configuration(configuration));
        }
        this.j = aq4;
        if (e2) {
            yx0.getClass();
            hdVar = yx0.k;
        } else {
            hdVar = new hd(view.getContext());
        }
        this.k = hdVar;
        if (e2) {
            yx0.getClass();
            hjVar = yx0.l;
        } else {
            hjVar = new hj(view.getContext());
        }
        this.l = hjVar;
        if (e2) {
            yx0.getClass();
            tdVar = yx0.m;
        } else {
            tdVar = new td(view.getContext());
        }
        this.m = tdVar;
        if (e2) {
            yx0.getClass();
            sdVar = yx0.n;
        } else {
            sdVar = new sd(tdVar);
        }
        this.n = sdVar;
        if (e2) {
            yx0.getClass();
            cl2 = yx0.o;
        } else {
            view.getContext();
            cl2 = new kw5(19);
        }
        this.o = cl2;
        if (e2) {
            yx0.getClass();
            aq42 = yx0.p;
        } else {
            aq42 = new ed5(x91.v(view.getContext()), pe2.L);
        }
        this.p = aq42;
        if (view == (yx0 != null ? yx0.a : view3)) {
            my2 = yx0.q;
        } else {
            my2 = new ij5(view);
        }
        this.q = my2;
        if (e2) {
            yx0.getClass();
            jjVar = yx0.r;
        } else {
            jjVar = new jj(ViewConfiguration.get(view.getContext()));
        }
        this.r = jjVar;
        this.s = (yx0 == null || (wy3 = yx0.s) == null) ? new wy3() : wy3;
        this.t = new k44();
        this.u = (yx0 == null || (uk0 = yx0.u) == null) ? new uk0() : uk0;
        this.w = new kh(3, this);
        this.x = new xx0(this);
    }

    public final void a(je jeVar, gs2 gs2, yt2 yt2, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        Set set;
        String str;
        View view;
        Object obj;
        je jeVar2 = jeVar;
        gs2 gs22 = gs2;
        yt2 yt22 = yt2;
        int i6 = i2;
        yt22.g0(123858079);
        if (yt22.i(jeVar2)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i3 | i6;
        if (yt22.i(gs22)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i8 = i7 | i4;
        if (yt22.i(this)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i9 = i8 | i5;
        boolean z2 = false;
        if ((i9 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i9 & 1, z)) {
            Object tag = jeVar2.getTag(R.id.inspection_slot_table_set);
            LinkedHashMap linkedHashMap = null;
            if (!(tag instanceof Set) || ((tag instanceof ar3) && !(tag instanceof lr3))) {
                set = null;
            } else {
                set = (Set) tag;
            }
            if (set == null) {
                ViewParent parent = jeVar2.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                } else {
                    view = null;
                }
                if (view != null) {
                    obj = view.getTag(R.id.inspection_slot_table_set);
                } else {
                    obj = null;
                }
                if (!(obj instanceof Set) || ((obj instanceof ar3) && !(obj instanceof lr3))) {
                    set = null;
                } else {
                    set = (Set) obj;
                }
            }
            if (set != null) {
                set.add(yt22.z());
                yt22.q = true;
                yt22.C = true;
                yt22.c.g();
                yt22.H.g();
                jv6 jv6 = yt22.I;
                gv6 gv6 = jv6.a;
                jv6.e = gv6.F;
                jv6.f = gv6.G;
            }
            Object Q = yt22.Q();
            Object obj2 = ay0.a;
            if (Q == obj2) {
                f();
                if6 if6 = this.e;
                if6.getClass();
                ViewParent parent2 = jeVar2.getParent();
                parent2.getClass();
                View view2 = (View) parent2;
                Object tag2 = view2.getTag(R.id.compose_view_saveable_id_tag);
                if (tag2 instanceof String) {
                    str = (String) tag2;
                } else {
                    str = null;
                }
                if (str == null) {
                    str = String.valueOf(view2.getId());
                }
                String y = b81.y("SaveableStateRegistry:", str);
                kg5 h2 = if6.h();
                Bundle i10 = h2.i(y);
                if (i10 != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str2 : i10.keySet()) {
                        ArrayList parcelableArrayList = i10.getParcelableArrayList(str2);
                        parcelableArrayList.getClass();
                        linkedHashMap.put(str2, parcelableArrayList);
                    }
                }
                ce ceVar = ce.T;
                t37 t37 = te6.a;
                se6 se6 = new se6(linkedHashMap, ceVar);
                if (h2.x(y) == null) {
                    try {
                        h2.K(y, new lv0(1, se6));
                        z2 = true;
                    } catch (IllegalArgumentException unused) {
                    }
                }
                Object nw1 = new nw1(se6, new ow1(z2, h2, y));
                yt22.o0(nw1);
                Q = nw1;
            }
            nw1 nw12 = (nw1) Q;
            boolean i11 = yt22.i(nw12);
            Object Q2 = yt22.Q();
            if (i11 || Q2 == obj2) {
                Q2 = new pb(9, nw12);
                yt22.o0(Q2);
            }
            t49.e(vs7.a, (vr2) Q2, yt22);
            yy0 yy0 = xy0.y;
            boolean booleanValue = ((Boolean) yt22.k(yy0)).booleanValue() | jeVar2.getScrollCaptureInProgress$ui();
            boolean g2 = yt22.g(jeVar2.getView());
            Object Q3 = yt22.Q();
            if (g2 || Q3 == obj2) {
                Q3 = new j68(jeVar2.getView());
                yt22.o0(Q3);
            }
            j68 j68 = (j68) Q3;
            boolean g3 = yt22.g(jeVar2.getView());
            Object Q4 = yt22.Q();
            if (g3 || Q4 == obj2) {
                Q4 = new ni(jeVar2.getView());
                yt22.o0(Q4);
            }
            ju5 a2 = ha4.a.a(c());
            hu5 hu5 = oa4.a;
            f();
            if6 if62 = this.e;
            if62.getClass();
            t49.d(new ju5[]{a2, hu5.a(if62), ye.d.a(this.g), ye.e.a(this.h), xy0.w.a((ny6) Q4), ye.b.a(jeVar2.getContext()), ld3.a.a(set), ye.a.a(jeVar2.getConfiguration()), te6.a.a(nw12), ye.f.a(jeVar2.getView()), yy0.a(Boolean.valueOf(booleanValue)), xy0.u.a(jeVar2.getViewConfiguration()), o23.a.a(j68)}, su0.J(1317454175, new wx0(jeVar2, this, gs22), yt22), yt22, 56);
        } else {
            yt22.Y();
        }
        yx5 v2 = yt22.v();
        if (v2 != null) {
            v2.d = new wx0(this, jeVar2, gs22, i6);
        }
    }

    public final void b() {
        int i2 = this.v - 1;
        this.v = i2;
        if (i2 < 0) {
            Log.e("ComposeViewContext", "View count has dropped below 0");
            this.v = 0;
        }
        if (this.v == 0) {
            View view = this.a;
            Context context = view.getContext();
            xx0 xx0 = this.x;
            context.unregisterComponentCallbacks(xx0);
            k44 k44 = this.t;
            if (k44.b == null) {
                k44.a = null;
            }
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(xx0);
        }
    }

    public final t54 c() {
        f();
        t54 t54 = this.d;
        t54.getClass();
        return t54;
    }

    public final void d() {
        int i2 = this.v + 1;
        this.v = i2;
        if (i2 == 1) {
            View view = this.a;
            Context context = view.getContext();
            xx0 xx0 = this.x;
            context.registerComponentCallbacks(xx0);
            e(view.getResources().getConfiguration());
            boolean hasWindowFocus = view.hasWindowFocus();
            k44 k44 = this.t;
            k44.c.setValue(Boolean.valueOf(hasWindowFocus));
            ed5 ed5 = k44.b;
            kh khVar = this.w;
            if (ed5 == null) {
                k44.a = khVar;
            }
            if (ed5 != null) {
                ed5.setValue(khVar.b());
            }
            view.getViewTreeObserver().addOnWindowFocusChangeListener(xx0);
        }
    }

    public final void e(Configuration configuration) {
        int updateFrom = this.i.updateFrom(configuration);
        if (updateFrom != 0) {
            Iterator it = this.g.a.entrySet().iterator();
            while (it.hasNext()) {
                y83 y83 = (y83) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (y83 == null || Configuration.needNewResources(updateFrom, y83.b)) {
                    it.remove();
                }
            }
            this.j.setValue(new Configuration(configuration));
            r56 r56 = this.h;
            synchronized (r56) {
                r56.a.c();
            }
            if ((268435456 & updateFrom) != 0) {
                this.p.setValue(x91.v(this.a.getContext()));
            }
            if ((805248384 & updateFrom) != 0) {
                k44 k44 = this.t;
                kh khVar = this.w;
                ed5 ed5 = k44.b;
                if (ed5 != null) {
                    ed5.setValue(khVar.b());
                }
            }
        }
    }

    public final void f() {
        if (!this.b) {
            this.b = true;
            ky0 ky0 = this.c;
            View view = this.a;
            if (ky0 == null) {
                ky0 a2 = ac8.a(view);
                if (a2 == null) {
                    ViewParent parent = view.getParent();
                    while (a2 == null && (parent instanceof View)) {
                        View view2 = (View) parent;
                        a2 = ac8.a(view2);
                        parent = z85.k(view2);
                    }
                }
                if (a2 == null) {
                    a2 = ac8.b(view);
                }
                this.c = a2;
            }
            if (this.d == null) {
                t54 o2 = i95.o(view);
                if (o2 != null) {
                    this.d = o2;
                } else {
                    h.s("Composed into a View which doesn't propagate ViewTreeLifecycleOwner!");
                    return;
                }
            }
            if (this.e == null) {
                if6 g2 = w95.g(view);
                if (g2 != null) {
                    this.e = g2;
                } else {
                    h.s("Composed into a View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                    return;
                }
            }
            if (this.f == null) {
                this.f = aa5.g(view);
            }
        }
    }
}
