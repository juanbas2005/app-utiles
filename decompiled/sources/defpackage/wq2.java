package defpackage;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.strictmode.Violation;
import cu.lestebang.utiletecsa.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: wq2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wq2 {
    public final jz0 a;
    public final am6 b;
    public final bq2 c;
    public boolean d = false;
    public int e = -1;

    public wq2(jz0 jz0, am6 am6, ClassLoader classLoader, lq2 lq2, Bundle bundle) {
        this.a = jz0;
        this.b = am6;
        vq2 vq2 = (vq2) bundle.getParcelable("state");
        bq2 a2 = lq2.a(vq2.w);
        a2.A = vq2.x;
        a2.J = vq2.y;
        a2.L = vq2.z;
        a2.M = true;
        a2.T = vq2.A;
        a2.U = vq2.B;
        a2.V = vq2.C;
        a2.Y = vq2.D;
        a2.H = vq2.E;
        a2.X = vq2.F;
        a2.W = vq2.G;
        a2.k0 = k54.values()[vq2.H];
        a2.D = vq2.I;
        a2.E = vq2.J;
        a2.e0 = vq2.K;
        this.c = a2;
        a2.x = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a2.O(bundle2);
        if (rq2.L(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a2);
        }
    }

    public final void a() {
        Bundle bundle;
        boolean L = rq2.L(3);
        bq2 bq2 = this.c;
        if (L) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + bq2);
        }
        Bundle bundle2 = bq2.x;
        if (bundle2 != null) {
            bundle2.getBundle("savedInstanceState");
        }
        bq2.R.S();
        bq2.w = 3;
        bq2.a0 = false;
        bq2.w();
        if (bq2.a0) {
            if (rq2.L(3)) {
                Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + bq2);
            }
            if (bq2.c0 != null) {
                Bundle bundle3 = bq2.x;
                if (bundle3 != null) {
                    bundle = bundle3.getBundle("savedInstanceState");
                } else {
                    bundle = null;
                }
                SparseArray sparseArray = bq2.y;
                if (sparseArray != null) {
                    bq2.c0.restoreHierarchyState(sparseArray);
                    bq2.y = null;
                }
                bq2.a0 = false;
                bq2.J(bundle);
                if (!bq2.a0) {
                    rf2.g(bq2, " did not call through to super.onViewStateRestored()");
                    return;
                } else if (bq2.c0 != null) {
                    bq2.m0.a(j54.ON_CREATE);
                }
            }
            bq2.x = null;
            rq2 rq2 = bq2.R;
            rq2.H = false;
            rq2.I = false;
            rq2.O.g = false;
            rq2.u(4);
            this.a.m(bq2, false);
            return;
        }
        rf2.g(bq2, " did not call through to super.onActivityCreated()");
    }

    public final void b() {
        bq2 bq2;
        View view;
        View view2;
        bq2 bq22;
        bq2 bq23 = this.c;
        View view3 = bq23.b0;
        while (true) {
            bq2 = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(R.id.fragment_container_view_tag);
            if (tag instanceof bq2) {
                bq22 = (bq2) tag;
            } else {
                bq22 = null;
            }
            if (bq22 != null) {
                bq2 = bq22;
                break;
            }
            ViewParent parent = view3.getParent();
            if (parent instanceof View) {
                view3 = (View) parent;
            } else {
                view3 = null;
            }
        }
        bq2 bq24 = bq23.S;
        if (!(bq2 == null || bq2 == bq24)) {
            int i = bq23.U;
            yq2 yq2 = zq2.a;
            StringBuilder sb = new StringBuilder("Attempting to nest fragment ");
            sb.append(bq23);
            sb.append(" within the view of parent fragment ");
            sb.append(bq2);
            sb.append(" via container with ID ");
            zq2.b(new Violation(bq23, hl6.n(sb, i, " without using parent's childFragmentManager")));
            zq2.a(bq23).getClass();
        }
        ArrayList arrayList = (ArrayList) this.b.x;
        ViewGroup viewGroup = bq23.b0;
        int i2 = -1;
        if (viewGroup != null) {
            int indexOf = arrayList.indexOf(bq23);
            int i3 = indexOf - 1;
            while (true) {
                if (i3 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        bq2 bq25 = (bq2) arrayList.get(indexOf);
                        if (bq25.b0 == viewGroup && (view = bq25.c0) != null) {
                            i2 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    bq2 bq26 = (bq2) arrayList.get(i3);
                    if (bq26.b0 == viewGroup && (view2 = bq26.c0) != null) {
                        i2 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i3--;
                }
            }
        }
        bq23.b0.addView(bq23.c0, i2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: wq2} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void c() {
        boolean L = rq2.L(3);
        bq2 bq2 = this.c;
        if (L) {
            Log.d("FragmentManager", "moveto ATTACHED: " + bq2);
        }
        bq2 bq22 = bq2.C;
        wq2 wq2 = null;
        am6 am6 = this.b;
        if (bq22 != null) {
            wq2 wq22 = (wq2) ((HashMap) am6.y).get(bq22.A);
            if (wq22 != null) {
                bq2.D = bq2.C.A;
                bq2.C = null;
                wq2 = wq22;
            } else {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(bq2);
                bq2 bq23 = bq2.C;
                sb.append(" declared target fragment ");
                sb.append(bq23);
                sb.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb.toString());
            }
        } else {
            String str = bq2.D;
            if (str != null && (wq2 = ((HashMap) am6.y).get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(bq2);
                sb2.append(" declared target fragment ");
                h.s(f21.l(sb2, bq2.D, " that does not belong to this FragmentManager!"));
                return;
            }
        }
        if (wq2 != null) {
            wq2.k();
        }
        rq2 rq2 = bq2.P;
        bq2.Q = rq2.w;
        bq2.S = rq2.y;
        jz0 jz0 = this.a;
        jz0.v(bq2, false);
        ArrayList arrayList = bq2.q0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((yp2) it.next()).a();
        }
        arrayList.clear();
        bq2.R.b(bq2.Q, bq2.a(), bq2);
        bq2.w = 0;
        bq2.a0 = false;
        bq2.y(bq2.Q.M);
        if (bq2.a0) {
            Iterator it2 = bq2.P.p.iterator();
            while (it2.hasNext()) {
                ((uq2) it2.next()).a();
            }
            rq2 rq22 = bq2.R;
            rq22.H = false;
            rq22.I = false;
            rq22.O.g = false;
            rq22.u(0);
            jz0.n(bq2, false);
            return;
        }
        rf2.g(bq2, " did not call through to super.onAttach()");
    }

    public final int d() {
        int i;
        int i2;
        bq2 bq2 = this.c;
        if (bq2.P == null) {
            return bq2.w;
        }
        int i3 = this.e;
        int ordinal = bq2.k0.ordinal();
        int i4 = 0;
        if (ordinal == 1) {
            i3 = Math.min(i3, 0);
        } else if (ordinal == 2) {
            i3 = Math.min(i3, 1);
        } else if (ordinal == 3) {
            i3 = Math.min(i3, 5);
        } else if (ordinal != 4) {
            i3 = Math.min(i3, -1);
        }
        if (bq2.J) {
            boolean z = bq2.K;
            int i5 = this.e;
            if (z) {
                i3 = Math.max(i5, 2);
                View view = bq2.c0;
                if (view != null && view.getParent() == null) {
                    i3 = Math.min(i3, 2);
                }
            } else {
                i3 = i5 < 4 ? Math.min(i3, bq2.w) : Math.min(i3, 1);
            }
        }
        if (bq2.L && bq2.b0 == null) {
            i3 = Math.min(i3, 4);
        }
        if (!bq2.G) {
            i3 = Math.min(i3, 1);
        }
        ViewGroup viewGroup = bq2.b0;
        if (viewGroup != null) {
            un1 i6 = un1.i(viewGroup, bq2.p());
            gz6 f = i6.f(bq2);
            if (f != null) {
                i = f.b;
            } else {
                i = 0;
            }
            gz6 g = i6.g(bq2);
            if (g != null) {
                i4 = g.b;
            }
            if (i == 0) {
                i2 = -1;
            } else {
                i2 = hz6.a[b81.B(i)];
            }
            if (!(i2 == -1 || i2 == 1)) {
                i4 = i;
            }
        }
        if (i4 == 2) {
            i3 = Math.min(i3, 6);
        } else if (i4 == 3) {
            i3 = Math.max(i3, 3);
        } else if (bq2.H) {
            if (bq2.v()) {
                i3 = Math.min(i3, 1);
            } else {
                i3 = Math.min(i3, -1);
            }
        }
        if (bq2.d0 && bq2.w < 5) {
            i3 = Math.min(i3, 4);
        }
        if (bq2.I) {
            i3 = Math.max(i3, 3);
        }
        if (rq2.L(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i3 + " for " + bq2);
        }
        return i3;
    }

    public final void e() {
        Bundle bundle;
        Bundle bundle2;
        boolean L = rq2.L(3);
        bq2 bq2 = this.c;
        if (L) {
            Log.d("FragmentManager", "moveto CREATED: " + bq2);
        }
        Bundle bundle3 = bq2.x;
        if (bundle3 != null) {
            bundle = bundle3.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        if (!bq2.i0) {
            jz0 jz0 = this.a;
            jz0.w(bq2, false);
            bq2.R.S();
            bq2.w = 1;
            bq2.a0 = false;
            bq2.l0.x0(new ky5(3, bq2));
            bq2.z(bundle);
            bq2.i0 = true;
            if (bq2.a0) {
                bq2.l0.f1(j54.ON_CREATE);
                jz0.o(bq2, false);
                return;
            }
            rf2.g(bq2, " did not call through to super.onCreate()");
            return;
        }
        bq2.w = 1;
        Bundle bundle4 = bq2.x;
        if (bundle4 != null && (bundle2 = bundle4.getBundle("childFragmentManager")) != null) {
            bq2.R.Y(bundle2);
            rq2 rq2 = bq2.R;
            rq2.H = false;
            rq2.I = false;
            rq2.O.g = false;
            rq2.u(1);
        }
    }

    public final void f() {
        Bundle bundle;
        String str;
        bq2 bq2 = this.c;
        if (!bq2.J) {
            if (rq2.L(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + bq2);
            }
            Bundle bundle2 = bq2.x;
            ViewGroup viewGroup = null;
            if (bundle2 != null) {
                bundle = bundle2.getBundle("savedInstanceState");
            } else {
                bundle = null;
            }
            LayoutInflater E = bq2.E(bundle);
            bq2.h0 = E;
            ViewGroup viewGroup2 = bq2.b0;
            if (viewGroup2 != null) {
                viewGroup = viewGroup2;
            } else {
                int i = bq2.U;
                if (i != 0) {
                    if (i != -1) {
                        viewGroup = (ViewGroup) bq2.P.x.g0(i);
                        if (viewGroup == null) {
                            if (!bq2.M && !bq2.L) {
                                try {
                                    str = bq2.L().getResources().getResourceName(bq2.U);
                                } catch (Resources.NotFoundException unused) {
                                    str = "unknown";
                                }
                                throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(bq2.U) + " (" + str + ") for fragment " + bq2);
                            }
                        } else if (!(viewGroup instanceof FragmentContainerView)) {
                            yq2 yq2 = zq2.a;
                            zq2.b(new Violation(bq2, "Attempting to add fragment " + bq2 + " to container " + viewGroup + " which is not a FragmentContainerView"));
                            zq2.a(bq2).getClass();
                        }
                    } else {
                        rf2.q(bq2, " for a container view with no id", "Cannot create fragment ");
                        return;
                    }
                }
            }
            bq2.b0 = viewGroup;
            bq2.K(E, viewGroup, bundle);
            if (bq2.c0 != null) {
                if (rq2.L(3)) {
                    Log.d("FragmentManager", "moveto VIEW_CREATED: " + bq2);
                }
                bq2.c0.setSaveFromParentEnabled(false);
                bq2.c0.setTag(R.id.fragment_container_view_tag, bq2);
                if (viewGroup != null) {
                    b();
                }
                if (bq2.W) {
                    bq2.c0.setVisibility(8);
                }
                boolean isAttachedToWindow = bq2.c0.isAttachedToWindow();
                View view = bq2.c0;
                if (isAttachedToWindow) {
                    WeakHashMap weakHashMap = e58.a;
                    view.requestApplyInsets();
                } else {
                    view.addOnAttachStateChangeListener(new fg(4, view));
                }
                Bundle bundle3 = bq2.x;
                if (bundle3 != null) {
                    bundle3.getBundle("savedInstanceState");
                }
                bq2.I(bq2.c0);
                bq2.R.u(2);
                this.a.C(bq2, bq2.c0, false);
                int visibility = bq2.c0.getVisibility();
                bq2.j().j = bq2.c0.getAlpha();
                if (bq2.b0 != null && visibility == 0) {
                    View findFocus = bq2.c0.findFocus();
                    if (findFocus != null) {
                        bq2.j().k = findFocus;
                        if (rq2.L(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + bq2);
                        }
                    }
                    bq2.c0.setAlpha(0.0f);
                }
            }
            bq2.w = 2;
        }
    }

    public final void g() {
        boolean z;
        boolean z2;
        bq2 y;
        boolean L = rq2.L(3);
        bq2 bq2 = this.c;
        if (L) {
            Log.d("FragmentManager", "movefrom CREATED: " + bq2);
        }
        boolean z3 = true;
        if (!bq2.H || bq2.v()) {
            z = false;
        } else {
            z = true;
        }
        am6 am6 = this.b;
        if (z) {
            am6.R(bq2.A, (Bundle) null);
        }
        if (!z) {
            tq2 tq2 = (tq2) am6.A;
            if (tq2.b.containsKey(bq2.A) && tq2.e) {
                z2 = tq2.f;
            } else {
                z2 = true;
            }
            if (!z2) {
                String str = bq2.D;
                if (!(str == null || (y = am6.y(str)) == null || !y.Y)) {
                    bq2.C = y;
                }
                bq2.w = 0;
                return;
            }
        }
        dq2 dq2 = bq2.Q;
        if (dq2 != null) {
            z3 = ((tq2) am6.A).f;
        } else {
            eq2 eq2 = dq2.M;
            if (eq2 != null) {
                z3 = true ^ eq2.isChangingConfigurations();
            }
        }
        if (z || z3) {
            ((tq2) am6.A).e(bq2, false);
        }
        bq2.R.l();
        bq2.l0.f1(j54.ON_DESTROY);
        bq2.w = 0;
        bq2.a0 = false;
        bq2.i0 = false;
        bq2.B();
        if (bq2.a0) {
            this.a.p(bq2, false);
            Iterator it = am6.C().iterator();
            while (it.hasNext()) {
                wq2 wq2 = (wq2) it.next();
                if (wq2 != null) {
                    bq2 bq22 = wq2.c;
                    if (bq2.A.equals(bq22.D)) {
                        bq22.C = bq2;
                        bq22.D = null;
                    }
                }
            }
            String str2 = bq2.D;
            if (str2 != null) {
                bq2.C = am6.y(str2);
            }
            am6.M(this);
            return;
        }
        rf2.g(bq2, " did not call through to super.onDestroy()");
    }

    public final void h() {
        View view;
        boolean L = rq2.L(3);
        bq2 bq2 = this.c;
        if (L) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + bq2);
        }
        ViewGroup viewGroup = bq2.b0;
        if (!(viewGroup == null || (view = bq2.c0) == null)) {
            viewGroup.removeView(view);
        }
        bq2.R.u(1);
        if (bq2.c0 != null) {
            br2 br2 = bq2.m0;
            br2.e();
            if (br2.A.E.compareTo(k54.y) >= 0) {
                bq2.m0.a(j54.ON_DESTROY);
            }
        }
        bq2.w = 1;
        bq2.a0 = false;
        bq2.C();
        if (bq2.a0) {
            cz6 cz6 = ((i94) hv2.N0(bq2).x).b;
            int f = cz6.f();
            for (int i = 0; i < f; i++) {
                ((h94) cz6.g(i)).k();
            }
            bq2.N = false;
            this.a.D(bq2, false);
            bq2.b0 = null;
            bq2.c0 = null;
            bq2.m0 = null;
            bq2.n0.i((Object) null);
            bq2.K = false;
            return;
        }
        rf2.g(bq2, " did not call through to super.onDestroyView()");
    }

    public final void i() {
        boolean z;
        boolean L = rq2.L(3);
        bq2 bq2 = this.c;
        if (L) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + bq2);
        }
        bq2.w = -1;
        bq2.a0 = false;
        bq2.D();
        bq2.h0 = null;
        if (bq2.a0) {
            rq2 rq2 = bq2.R;
            if (!rq2.J) {
                rq2.l();
                bq2.R = new rq2();
            }
            this.a.r(bq2, false);
            bq2.w = -1;
            bq2.Q = null;
            bq2.S = null;
            bq2.P = null;
            if (!bq2.H || bq2.v()) {
                tq2 tq2 = (tq2) this.b.A;
                if (tq2.b.containsKey(bq2.A) && tq2.e) {
                    z = tq2.f;
                } else {
                    z = true;
                }
                if (!z) {
                    return;
                }
            }
            if (rq2.L(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + bq2);
            }
            bq2.s();
            return;
        }
        rf2.g(bq2, " did not call through to super.onDetach()");
    }

    public final void j() {
        Bundle bundle;
        bq2 bq2 = this.c;
        if (bq2.J && bq2.K && !bq2.N) {
            if (rq2.L(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + bq2);
            }
            Bundle bundle2 = bq2.x;
            if (bundle2 != null) {
                bundle = bundle2.getBundle("savedInstanceState");
            } else {
                bundle = null;
            }
            LayoutInflater E = bq2.E(bundle);
            bq2.h0 = E;
            bq2.K(E, (ViewGroup) null, bundle);
            View view = bq2.c0;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                bq2.c0.setTag(R.id.fragment_container_view_tag, bq2);
                if (bq2.W) {
                    bq2.c0.setVisibility(8);
                }
                Bundle bundle3 = bq2.x;
                if (bundle3 != null) {
                    bundle3.getBundle("savedInstanceState");
                }
                bq2.I(bq2.c0);
                bq2.R.u(2);
                this.a.C(bq2, bq2.c0, false);
                bq2.w = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        am6 am6 = this.b;
        boolean z = this.d;
        bq2 bq2 = this.c;
        if (!z) {
            try {
                this.d = true;
                boolean z2 = false;
                while (true) {
                    int d2 = d();
                    int i = bq2.w;
                    int i2 = 3;
                    if (d2 != i) {
                        if (d2 <= i) {
                            switch (i - 1) {
                                case -1:
                                    i();
                                    break;
                                case b85.b:
                                    g();
                                    break;
                                case 1:
                                    h();
                                    bq2.w = 1;
                                    break;
                                case 2:
                                    bq2.K = false;
                                    bq2.w = 2;
                                    break;
                                case 3:
                                    if (rq2.L(3)) {
                                        Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + bq2);
                                    }
                                    if (bq2.c0 != null && bq2.y == null) {
                                        o();
                                    }
                                    if (!(bq2.c0 == null || (viewGroup2 = bq2.b0) == null)) {
                                        un1 i3 = un1.i(viewGroup2, bq2.p());
                                        if (rq2.L(2)) {
                                            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + bq2);
                                        }
                                        i3.d(1, 3, this);
                                    }
                                    bq2.w = 3;
                                    break;
                                case 4:
                                    q();
                                    break;
                                case 5:
                                    bq2.w = 5;
                                    break;
                                case 6:
                                    l();
                                    break;
                            }
                        } else {
                            switch (i + 1) {
                                case b85.b:
                                    c();
                                    break;
                                case 1:
                                    e();
                                    break;
                                case 2:
                                    j();
                                    f();
                                    break;
                                case 3:
                                    a();
                                    break;
                                case 4:
                                    if (!(bq2.c0 == null || (viewGroup3 = bq2.b0) == null)) {
                                        un1 i4 = un1.i(viewGroup3, bq2.p());
                                        int visibility = bq2.c0.getVisibility();
                                        if (visibility == 0) {
                                            i2 = 2;
                                        } else if (visibility == 4) {
                                            i2 = 4;
                                        } else if (visibility != 8) {
                                            throw new IllegalArgumentException("Unknown visibility " + visibility);
                                        }
                                        if (rq2.L(2)) {
                                            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + bq2);
                                        }
                                        i4.d(i2, 2, this);
                                    }
                                    bq2.w = 4;
                                    break;
                                case 5:
                                    p();
                                    break;
                                case 6:
                                    bq2.w = 6;
                                    break;
                                case 7:
                                    n();
                                    break;
                            }
                        }
                        z2 = true;
                    } else {
                        if (!z2 && i == -1 && bq2.H && !bq2.v()) {
                            if (rq2.L(3)) {
                                Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + bq2);
                            }
                            ((tq2) am6.A).e(bq2, true);
                            am6.M(this);
                            if (rq2.L(3)) {
                                Log.d("FragmentManager", "initState called for fragment: " + bq2);
                            }
                            bq2.s();
                        }
                        if (bq2.g0) {
                            if (!(bq2.c0 == null || (viewGroup = bq2.b0) == null)) {
                                un1 i5 = un1.i(viewGroup, bq2.p());
                                if (bq2.W) {
                                    if (rq2.L(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + bq2);
                                    }
                                    i5.d(3, 1, this);
                                } else {
                                    if (rq2.L(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + bq2);
                                    }
                                    i5.d(2, 1, this);
                                }
                            }
                            rq2 rq2 = bq2.P;
                            if (rq2 != null && bq2.G && rq2.M(bq2)) {
                                rq2.G = true;
                            }
                            bq2.g0 = false;
                            bq2.R.o();
                        }
                        this.d = false;
                        return;
                    }
                }
            } catch (Throwable th) {
                this.d = false;
                throw th;
            }
        } else if (rq2.L(2)) {
            Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + bq2);
        }
    }

    public final void l() {
        boolean L = rq2.L(3);
        bq2 bq2 = this.c;
        if (L) {
            Log.d("FragmentManager", "movefrom RESUMED: " + bq2);
        }
        bq2.R.u(5);
        if (bq2.c0 != null) {
            bq2.m0.a(j54.ON_PAUSE);
        }
        bq2.l0.f1(j54.ON_PAUSE);
        bq2.w = 6;
        bq2.a0 = false;
        bq2.a0 = true;
        if (bq2.a0) {
            this.a.s(bq2, false);
        } else {
            rf2.g(bq2, " did not call through to super.onPause()");
        }
    }

    public final void m(ClassLoader classLoader) {
        bq2 bq2 = this.c;
        Bundle bundle = bq2.x;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            if (bq2.x.getBundle("savedInstanceState") == null) {
                bq2.x.putBundle("savedInstanceState", new Bundle());
            }
            try {
                bq2.y = bq2.x.getSparseParcelableArray("viewState");
                bq2.z = bq2.x.getBundle("viewRegistryState");
                vq2 vq2 = (vq2) bq2.x.getParcelable("state");
                if (vq2 != null) {
                    bq2.D = vq2.I;
                    bq2.E = vq2.J;
                    bq2.e0 = vq2.K;
                }
                if (!bq2.e0) {
                    bq2.d0 = true;
                }
            } catch (BadParcelableException e2) {
                throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + bq2, e2);
            }
        }
    }

    public final void n() {
        View view;
        String str;
        boolean L = rq2.L(3);
        bq2 bq2 = this.c;
        if (L) {
            Log.d("FragmentManager", "moveto RESUMED: " + bq2);
        }
        aq2 aq2 = bq2.f0;
        if (aq2 == null) {
            view = null;
        } else {
            view = aq2.k;
        }
        if (view != null) {
            if (view != bq2.c0) {
                ViewParent parent = view.getParent();
                while (true) {
                    if (parent == null) {
                        break;
                    } else if (parent == bq2.c0) {
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
            }
            boolean requestFocus = view.requestFocus();
            if (rq2.L(2)) {
                StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                sb.append(view);
                sb.append(" ");
                if (requestFocus) {
                    str = "succeeded";
                } else {
                    str = "failed";
                }
                sb.append(str);
                sb.append(" on Fragment ");
                sb.append(bq2);
                sb.append(" resulting in focused view ");
                sb.append(bq2.c0.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        bq2.j().k = null;
        bq2.R.S();
        bq2.R.A(true);
        bq2.w = 7;
        bq2.a0 = false;
        bq2.a0 = true;
        if (bq2.a0) {
            w54 w54 = bq2.l0;
            j54 j54 = j54.ON_RESUME;
            w54.f1(j54);
            if (bq2.c0 != null) {
                bq2.m0.A.f1(j54);
            }
            rq2 rq2 = bq2.R;
            rq2.H = false;
            rq2.I = false;
            rq2.O.g = false;
            rq2.u(7);
            this.a.y(bq2, false);
            this.b.R(bq2.A, (Bundle) null);
            bq2.x = null;
            bq2.y = null;
            bq2.z = null;
            return;
        }
        rf2.g(bq2, " did not call through to super.onResume()");
    }

    public final void o() {
        bq2 bq2 = this.c;
        if (bq2.c0 != null) {
            if (rq2.L(2)) {
                Log.v("FragmentManager", "Saving view state for fragment " + bq2 + " with view " + bq2.c0);
            }
            SparseArray sparseArray = new SparseArray();
            bq2.c0.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                bq2.y = sparseArray;
            }
            Bundle bundle = new Bundle();
            bq2.m0.B.H(bundle);
            if (!bundle.isEmpty()) {
                bq2.z = bundle;
            }
        }
    }

    public final void p() {
        boolean L = rq2.L(3);
        bq2 bq2 = this.c;
        if (L) {
            Log.d("FragmentManager", "moveto STARTED: " + bq2);
        }
        bq2.R.S();
        bq2.R.A(true);
        bq2.w = 5;
        bq2.a0 = false;
        bq2.G();
        if (bq2.a0) {
            w54 w54 = bq2.l0;
            j54 j54 = j54.ON_START;
            w54.f1(j54);
            if (bq2.c0 != null) {
                bq2.m0.A.f1(j54);
            }
            rq2 rq2 = bq2.R;
            rq2.H = false;
            rq2.I = false;
            rq2.O.g = false;
            rq2.u(5);
            this.a.A(bq2, false);
            return;
        }
        rf2.g(bq2, " did not call through to super.onStart()");
    }

    public final void q() {
        boolean L = rq2.L(3);
        bq2 bq2 = this.c;
        if (L) {
            Log.d("FragmentManager", "movefrom STARTED: " + bq2);
        }
        rq2 rq2 = bq2.R;
        rq2.I = true;
        rq2.O.g = true;
        rq2.u(4);
        if (bq2.c0 != null) {
            bq2.m0.a(j54.ON_STOP);
        }
        bq2.l0.f1(j54.ON_STOP);
        bq2.w = 4;
        bq2.a0 = false;
        bq2.H();
        if (bq2.a0) {
            this.a.B(bq2, false);
        } else {
            rf2.g(bq2, " did not call through to super.onStop()");
        }
    }

    public wq2(jz0 jz0, am6 am6, bq2 bq2) {
        this.a = jz0;
        this.b = am6;
        this.c = bq2;
    }

    public wq2(jz0 jz0, am6 am6, bq2 bq2, Bundle bundle) {
        this.a = jz0;
        this.b = am6;
        this.c = bq2;
        bq2.y = null;
        bq2.z = null;
        bq2.O = 0;
        bq2.K = false;
        bq2.G = false;
        bq2 bq22 = bq2.C;
        bq2.D = bq22 != null ? bq22.A : null;
        bq2.C = null;
        bq2.x = bundle;
        bq2.B = bundle.getBundle("arguments");
    }
}
