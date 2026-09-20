package defpackage;

import android.app.Application;
import android.app.PictureInPictureUiState;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import cu.lestebang.utiletecsa.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: rv0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class rv0 extends qv0 implements a68, ry2, if6, w45, sv4, e9, z45 {
    public z58 A;
    public final ov0 B;
    public final z97 C;
    public final AtomicInteger D;
    public final pv0 E;
    public final CopyOnWriteArrayList F;
    public final CopyOnWriteArrayList G;
    public final CopyOnWriteArrayList H;
    public final CopyOnWriteArrayList I;
    public final CopyOnWriteArrayList J;
    public final CopyOnWriteArrayList K;
    public final CopyOnWriteArrayList L;
    public boolean M;
    public boolean N;
    public final z97 O;
    public final z97 P;
    public final z97 Q;
    public final uw2 x;
    public final cf4 y = new cf4((Runnable) new hv0(this, 1));
    public final kg5 z;

    /* JADX WARNING: type inference failed for: r0v0, types: [uw2, java.lang.Object] */
    public rv0() {
        ? obj = new Object();
        obj.a = new CopyOnWriteArraySet();
        this.x = obj;
        kg5 kg5 = new kg5(new hf6(this, new hx4(18, this)));
        this.z = kg5;
        this.B = new ov0(this);
        this.C = new z97(new iv0(this, 1));
        this.D = new AtomicInteger();
        this.E = new pv0(this);
        this.F = new CopyOnWriteArrayList();
        this.G = new CopyOnWriteArrayList();
        this.H = new CopyOnWriteArrayList();
        this.I = new CopyOnWriteArrayList();
        this.J = new CopyOnWriteArrayList();
        this.K = new CopyOnWriteArrayList();
        this.L = new CopyOnWriteArrayList();
        this.O = new z97(new iv0(this, 2));
        w54 w54 = this.w;
        if (w54 != null) {
            w54.x0(new kv0(this, 0));
            this.w.x0(new kv0(this, 1));
            this.w.x0(new ky5(1, this));
            kg5.F();
            cf6.b(this);
            ((kg5) kg5.y).K("android:support:activity-result", new lv0(0, this));
            m(new mv0(this, 0));
            this.P = new z97(new iv0(this, 3));
            this.Q = new z97(new iv0(this, 4));
            return;
        }
        h.s("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        throw null;
    }

    public static void l(rv0 rv0) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!sg3.e(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!sg3.e(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        n();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.B.a(decorView);
        super.addContentView(view, layoutParams);
    }

    public final v45 b() {
        return (v45) this.Q.getValue();
    }

    public w58 c() {
        return (w58) this.P.getValue();
    }

    public final to4 d() {
        Bundle bundle;
        to4 to4 = new to4(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = to4.a;
        if (application != null) {
            linkedHashMap.put(v58.d, getApplication());
        }
        linkedHashMap.put(cf6.a, this);
        linkedHashMap.put(cf6.b, this);
        Intent intent = getIntent();
        if (intent != null) {
            bundle = intent.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            linkedHashMap.put(cf6.c, bundle);
        }
        return to4;
    }

    public final pv0 e() {
        return this.E;
    }

    public final z58 g() {
        if (getApplication() != null) {
            if (this.A == null) {
                nv0 nv0 = (nv0) getLastNonConfigurationInstance();
                if (nv0 != null) {
                    this.A = nv0.a;
                }
                if (this.A == null) {
                    this.A = new z58();
                }
            }
            z58 z58 = this.A;
            z58.getClass();
            return z58;
        }
        h.s("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        return null;
    }

    public final rv4 getNavigationEventDispatcher() {
        return b().b().c;
    }

    public final kg5 h() {
        return (kg5) this.z.y;
    }

    public final void i(v31 v31) {
        v31.getClass();
        this.F.add(v31);
    }

    public final void j(v31 v31) {
        v31.getClass();
        this.F.remove(v31);
    }

    public final in8 k() {
        return this.w;
    }

    public final void m(b55 b55) {
        uw2 uw2 = this.x;
        uw2.getClass();
        rv0 rv0 = (rv0) uw2.b;
        if (rv0 != null) {
            b55.a(rv0);
        }
        ((CopyOnWriteArraySet) uw2.a).add(b55);
    }

    public final void n() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        decorView6.getClass();
        decorView6.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    public final a9 o(r8 r8Var, hj8 hj8) {
        pv0 pv0 = this.E;
        pv0.getClass();
        String str = "activity_rq#" + this.D.getAndIncrement();
        LinkedHashMap linkedHashMap = pv0.c;
        w54 w54 = this.w;
        if (w54.E.compareTo(k54.z) < 0) {
            pv0.d(str);
            z8 z8Var = (z8) linkedHashMap.get(str);
            if (z8Var == null) {
                z8Var = new z8(w54);
            }
            x8 x8Var = new x8(pv0, str, r8Var, hj8);
            z8Var.a.x0(x8Var);
            z8Var.b.add(x8Var);
            linkedHashMap.put(str, z8Var);
            return new a9(pv0, str, hj8, 0);
        }
        StringBuilder sb = new StringBuilder("LifecycleOwner ");
        sb.append(this);
        k54 k54 = w54.E;
        sb.append(" is attempting to register while current state is ");
        sb.append(k54);
        sb.append(". LifecycleOwners must call register before they are STARTED.");
        throw new IllegalStateException(sb.toString().toString());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.E.a(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public final void onBackPressed() {
        ((iv1) this.O.getValue()).a();
    }

    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator it = this.F.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((v31) it.next()).accept(configuration);
        }
    }

    public void onCreate(Bundle bundle) {
        this.z.G(bundle);
        uw2 uw2 = this.x;
        uw2.getClass();
        uw2.b = this;
        Iterator it = ((CopyOnWriteArraySet) uw2.a).iterator();
        while (it.hasNext()) {
            ((b55) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = w46.x;
        u46.b(this);
        getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.y.y).iterator();
        while (it.hasNext()) {
            ((kq2) it.next()).a.k();
        }
        return true;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.y.y).iterator();
            while (it.hasNext()) {
                if (((kq2) it.next()).a.p()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: finally extract failed */
    public final void onMultiWindowModeChanged(boolean z2, Configuration configuration) {
        configuration.getClass();
        this.M = true;
        try {
            super.onMultiWindowModeChanged(z2, configuration);
            this.M = false;
            Iterator it = this.I.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((v31) it.next()).accept(new do4(z2));
            }
        } catch (Throwable th) {
            this.M = false;
            throw th;
        }
    }

    public void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator it = this.H.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((v31) it.next()).accept(intent);
        }
    }

    public void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.y.y).iterator();
        while (it.hasNext()) {
            ((kq2) it.next()).a.q();
        }
        super.onPanelClosed(i, menu);
    }

    /* JADX INFO: finally extract failed */
    public final void onPictureInPictureModeChanged(boolean z2, Configuration configuration) {
        configuration.getClass();
        this.N = true;
        try {
            super.onPictureInPictureModeChanged(z2, configuration);
            this.N = false;
            Iterator it = this.J.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((v31) it.next()).accept(new ug5(z2));
            }
        } catch (Throwable th) {
            this.N = false;
            throw th;
        }
    }

    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        n63 n63;
        pictureInPictureUiState.getClass();
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            pictureInPictureUiState.isStashed();
            pictureInPictureUiState.isTransitioningToPip();
            n63 = new n63(5);
        } else if (i >= 31) {
            pictureInPictureUiState.isStashed();
            n63 = new n63(5);
        } else {
            n63 = new n63(5);
        }
        Iterator it = this.K.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((v31) it.next()).accept(n63);
        }
    }

    public final boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.y.y).iterator();
        while (it.hasNext()) {
            ((kq2) it.next()).a.t();
        }
        return true;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (!this.E.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [nv0, java.lang.Object] */
    public final Object onRetainNonConfigurationInstance() {
        nv0 nv0;
        z58 z58 = this.A;
        if (z58 == null && (nv0 = (nv0) getLastNonConfigurationInstance()) != null) {
            z58 = nv0.a;
        }
        if (z58 == null) {
            return null;
        }
        ? obj = new Object();
        obj.a = z58;
        return obj;
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        w54 w54 = this.w;
        if (w54 != null) {
            w54.h1(k54.y);
        }
        super.onSaveInstanceState(bundle);
        this.z.H(bundle);
    }

    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.G.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((v31) it.next()).accept(Integer.valueOf(i));
        }
    }

    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.L.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final void reportFullyDrawn() {
        try {
            if (f55.p()) {
                Trace.beginSection(f55.v("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            rr2 rr2 = (rr2) this.C.getValue();
            synchronized (rr2.a) {
                rr2.b = true;
                Iterator it = rr2.c.iterator();
                while (it.hasNext()) {
                    ((sr2) it.next()).b();
                }
                rr2.c.clear();
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public void setContentView(int i) {
        n();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.B.a(decorView);
        super.setContentView(i);
    }

    public final void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public void setContentView(View view) {
        n();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.B.a(decorView);
        super.setContentView(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        n();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.B.a(decorView);
        super.setContentView(view, layoutParams);
    }

    public final void onMultiWindowModeChanged(boolean z2) {
        if (!this.M) {
            Iterator it = this.I.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((v31) it.next()).accept(new do4(z2));
            }
        }
    }

    public final void onPictureInPictureModeChanged(boolean z2) {
        if (!this.N) {
            Iterator it = this.J.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((v31) it.next()).accept(new ug5(z2));
            }
        }
    }
}
