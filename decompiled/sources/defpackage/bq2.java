package defpackage;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import cu.lestebang.utiletecsa.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bq2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class bq2 implements ComponentCallbacks, View.OnCreateContextMenuListener, t54, a68, ry2, if6 {
    public static final Object s0 = new Object();
    public String A = UUID.randomUUID().toString();
    public Bundle B;
    public bq2 C;
    public String D = null;
    public int E;
    public Boolean F = null;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public int O;
    public rq2 P;
    public dq2 Q;
    public rq2 R = new rq2();
    public bq2 S;
    public int T;
    public int U;
    public String V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public final boolean Z = true;
    public boolean a0;
    public ViewGroup b0;
    public View c0;
    public boolean d0;
    public boolean e0 = true;
    public aq2 f0;
    public boolean g0;
    public LayoutInflater h0;
    public boolean i0;
    public String j0;
    public k54 k0;
    public w54 l0;
    public br2 m0;
    public final bp4 n0;
    public jf6 o0;
    public kg5 p0;
    public final ArrayList q0;
    public final yp2 r0;
    public int w = -1;
    public Bundle x;
    public SparseArray y;
    public Bundle z;

    public bq2() {
        new ge(8, (Object) this);
        this.k0 = k54.A;
        this.n0 = new bp4();
        new AtomicInteger();
        this.q0 = new ArrayList();
        this.r0 = new yp2(this);
        r();
    }

    public View A(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void B() {
        this.a0 = true;
    }

    public void C() {
        this.a0 = true;
    }

    public void D() {
        this.a0 = true;
    }

    public LayoutInflater E(Bundle bundle) {
        dq2 dq2 = this.Q;
        if (dq2 != null) {
            eq2 eq2 = dq2.P;
            LayoutInflater cloneInContext = eq2.getLayoutInflater().cloneInContext(eq2);
            cloneInContext.setFactory2(this.R.f);
            return cloneInContext;
        }
        h.s("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        return null;
    }

    public void G() {
        this.a0 = true;
    }

    public void H() {
        this.a0 = true;
    }

    public void J(Bundle bundle) {
        this.a0 = true;
    }

    public void K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.R.S();
        this.N = true;
        this.m0 = new br2(this, g(), new y0(15, this));
        View A2 = A(layoutInflater, viewGroup);
        this.c0 = A2;
        br2 br2 = this.m0;
        if (A2 != null) {
            br2.e();
            if (rq2.L(3)) {
                Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.c0 + " for Fragment " + this);
            }
            View view = this.c0;
            br2 br22 = this.m0;
            view.getClass();
            view.setTag(R.id.view_tree_lifecycle_owner, br22);
            View view2 = this.c0;
            br2 br23 = this.m0;
            view2.getClass();
            view2.setTag(R.id.view_tree_view_model_store_owner, br23);
            View view3 = this.c0;
            br2 br24 = this.m0;
            view3.getClass();
            view3.setTag(R.id.view_tree_saved_state_registry_owner, br24);
            this.n0.i(this.m0);
        } else if (br2.A == null) {
            this.m0 = null;
        } else {
            h.s("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    public final Context L() {
        Context n = n();
        if (n != null) {
            return n;
        }
        rf2.h(this, " not attached to a context.", "Fragment ");
        return null;
    }

    public final View M() {
        View view = this.c0;
        if (view != null) {
            return view;
        }
        rf2.h(this, " did not return a View from onCreateView() or this was called before onCreateView().", "Fragment ");
        return null;
    }

    public final void N(int i, int i2, int i3, int i4) {
        if (this.f0 != null || i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
            j().b = i;
            j().c = i2;
            j().d = i3;
            j().e = i4;
        }
    }

    public final void O(Bundle bundle) {
        boolean z2;
        rq2 rq2 = this.P;
        if (rq2 != null) {
            if (rq2 == null) {
                z2 = false;
            } else {
                z2 = rq2.Q();
            }
            if (z2) {
                h.s("Fragment already added and state has been saved");
                return;
            }
        }
        this.B = bundle;
    }

    public mp7 a() {
        return new zp2(this);
    }

    public final w58 c() {
        Application application = null;
        if (this.P != null) {
            if (this.o0 == null) {
                Context context = L().getApplicationContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else if (context instanceof Application) {
                        application = (Application) context;
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                if (application == null && rq2.L(3)) {
                    Log.d("FragmentManager", "Could not find Application instance from Context " + L().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
                }
                this.o0 = new jf6(application, this, this.B);
            }
            return this.o0;
        }
        h.s("Can't access ViewModels from detached fragment");
        return null;
    }

    public final to4 d() {
        Application application;
        Context applicationContext = L().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            } else if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            } else {
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        if (application == null && rq2.L(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + L().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        to4 to4 = new to4(0);
        LinkedHashMap linkedHashMap = to4.a;
        if (application != null) {
            linkedHashMap.put(v58.d, application);
        }
        linkedHashMap.put(cf6.a, this);
        linkedHashMap.put(cf6.b, this);
        Bundle bundle = this.B;
        if (bundle != null) {
            linkedHashMap.put(cf6.c, bundle);
        }
        return to4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return false;
        }
        return true;
    }

    public final z58 g() {
        if (this.P == null) {
            h.s("Can't access ViewModels from detached fragment");
            return null;
        } else if (o() != 1) {
            HashMap hashMap = this.P.O.d;
            z58 z58 = (z58) hashMap.get(this.A);
            if (z58 != null) {
                return z58;
            }
            z58 z582 = new z58();
            hashMap.put(this.A, z582);
            return z582;
        } else {
            h.s("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            return null;
        }
    }

    public final kg5 h() {
        return (kg5) this.p0.y;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [aq2, java.lang.Object] */
    public final aq2 j() {
        if (this.f0 == null) {
            ? obj = new Object();
            Object obj2 = s0;
            obj.g = obj2;
            obj.h = obj2;
            obj.i = obj2;
            obj.j = 1.0f;
            obj.k = null;
            this.f0 = obj;
        }
        return this.f0;
    }

    public final in8 k() {
        return this.l0;
    }

    public final eq2 l() {
        dq2 dq2 = this.Q;
        if (dq2 == null) {
            return null;
        }
        return dq2.L;
    }

    public final rq2 m() {
        if (this.Q != null) {
            return this.R;
        }
        rf2.h(this, " has not been attached yet.", "Fragment ");
        return null;
    }

    public final Context n() {
        dq2 dq2 = this.Q;
        if (dq2 == null) {
            return null;
        }
        return dq2.M;
    }

    public final int o() {
        k54 k54 = this.k0;
        if (k54 == k54.x || this.S == null) {
            return k54.ordinal();
        }
        return Math.min(k54.ordinal(), this.S.o());
    }

    public final void onConfigurationChanged(Configuration configuration) {
        this.a0 = true;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        eq2 l = l();
        if (l != null) {
            l.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        } else {
            rf2.h(this, " not attached to an activity.", "Fragment ");
        }
    }

    public final void onLowMemory() {
        this.a0 = true;
    }

    public final rq2 p() {
        rq2 rq2 = this.P;
        if (rq2 != null) {
            return rq2;
        }
        rf2.h(this, " not associated with a fragment manager.", "Fragment ");
        return null;
    }

    public final String q(int i) {
        return L().getResources().getString(i);
    }

    public final void r() {
        this.l0 = new w54(this, true);
        this.p0 = new kg5(new hf6(this, new hx4(18, this)));
        this.o0 = null;
        ArrayList arrayList = this.q0;
        yp2 yp2 = this.r0;
        if (arrayList.contains(yp2)) {
            return;
        }
        if (this.w >= 0) {
            yp2.a();
        } else {
            arrayList.add(yp2);
        }
    }

    public final void s() {
        r();
        this.j0 = this.A;
        this.A = UUID.randomUUID().toString();
        this.G = false;
        this.H = false;
        this.J = false;
        this.K = false;
        this.M = false;
        this.O = 0;
        this.P = null;
        this.R = new rq2();
        this.Q = null;
        this.T = 0;
        this.U = 0;
        this.V = null;
        this.W = false;
        this.X = false;
    }

    public final boolean t() {
        if (this.Q == null || !this.G) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.A);
        if (this.T != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.T));
        }
        if (this.V != null) {
            sb.append(" tag=");
            sb.append(this.V);
        }
        sb.append(")");
        return sb.toString();
    }

    public final boolean u() {
        boolean z2;
        if (this.W) {
            return true;
        }
        rq2 rq2 = this.P;
        if (rq2 != null) {
            bq2 bq2 = this.S;
            rq2.getClass();
            if (bq2 == null) {
                z2 = false;
            } else {
                z2 = bq2.u();
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public final boolean v() {
        if (this.O > 0) {
            return true;
        }
        return false;
    }

    public void w() {
        this.a0 = true;
    }

    public void x(int i, int i2, Intent intent) {
        if (rq2.L(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void y(Context context) {
        eq2 eq2;
        this.a0 = true;
        dq2 dq2 = this.Q;
        if (dq2 == null) {
            eq2 = null;
        } else {
            eq2 = dq2.L;
        }
        if (eq2 != null) {
            this.a0 = true;
        }
    }

    public void z(Bundle bundle) {
        Bundle bundle2;
        this.a0 = true;
        Bundle bundle3 = this.x;
        if (!(bundle3 == null || (bundle2 = bundle3.getBundle("childFragmentManager")) == null)) {
            this.R.Y(bundle2);
            rq2 rq2 = this.R;
            rq2.H = false;
            rq2.I = false;
            rq2.O.g = false;
            rq2.u(1);
        }
        rq2 rq22 = this.R;
        if (rq22.v < 1) {
            rq22.H = false;
            rq22.I = false;
            rq22.O.g = false;
            rq22.u(1);
        }
    }

    public void F(Bundle bundle) {
    }

    public void I(View view) {
    }
}
