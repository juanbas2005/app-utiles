package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import cu.lestebang.utiletecsa.R;

/* renamed from: vv0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class vv0 extends Dialog implements t54, w45, sv4, if6 {
    public w54 w;
    public final kg5 x = new kg5(new hf6(this, new hx4(18, this)));
    public final z97 y = new z97(new uv0(this, 0));
    public final z97 z = new z97(new uv0(this, 1));

    public vv0(Context context, int i) {
        super(context, i);
    }

    public static void a(vv0 vv0) {
        super.onBackPressed();
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        d();
        super.addContentView(view, layoutParams);
    }

    public final v45 b() {
        return (v45) this.z.getValue();
    }

    public final w54 c() {
        w54 w54 = this.w;
        if (w54 != null) {
            return w54;
        }
        w54 w542 = new w54(this, true);
        this.w = w542;
        return w542;
    }

    public final void d() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        Window window4 = getWindow();
        window4.getClass();
        View decorView4 = window4.getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    public final rv4 getNavigationEventDispatcher() {
        return b().b().c;
    }

    public final kg5 h() {
        return (kg5) this.x.y;
    }

    public final in8 k() {
        return c();
    }

    public final void onBackPressed() {
        ((iv1) this.y.getValue()).a();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            v45 b = b();
            OnBackInvokedDispatcher o = getOnBackInvokedDispatcher();
            o.getClass();
            b.c(o);
        }
        this.x.G(bundle);
        c().f1(j54.ON_CREATE);
    }

    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.getClass();
        this.x.H(onSaveInstanceState);
        return onSaveInstanceState;
    }

    public final void onStart() {
        super.onStart();
        c().f1(j54.ON_RESUME);
    }

    public void onStop() {
        c().f1(j54.ON_DESTROY);
        this.w = null;
        super.onStop();
    }

    public void setContentView(View view) {
        view.getClass();
        d();
        super.setContentView(view);
    }

    public void setContentView(int i) {
        d();
        super.setContentView(i);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        d();
        super.setContentView(view, layoutParams);
    }
}
