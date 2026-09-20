package defpackage;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* renamed from: gq2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gq2 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int w = 2;
    public final Object x;
    public final Object y;

    public gq2(ct6 ct6, Activity activity) {
        ct6.getClass();
        this.x = ct6;
        this.y = new WeakReference(activity);
    }

    public final void onViewAttachedToWindow(View view) {
        IBinder iBinder;
        Window window;
        WindowManager.LayoutParams attributes;
        int i = this.w;
        Object obj = this.x;
        Object obj2 = this.y;
        switch (i) {
            case b85.b:
                wq2 wq2 = (wq2) obj;
                bq2 bq2 = wq2.c;
                wq2.k();
                un1.i((ViewGroup) bq2.c0.getParent(), ((hq2) obj2).w).h();
                return;
            case 1:
                view.getClass();
                view.removeOnAttachStateChangeListener(this);
                Activity activity = (Activity) ((WeakReference) obj2).get();
                if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                    iBinder = null;
                } else {
                    iBinder = attributes.token;
                }
                if (activity != null && iBinder != null) {
                    ((ct6) obj).c(iBinder, activity);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        switch (this.w) {
            case b85.b:
                return;
            case 1:
                view.getClass();
                return;
            default:
                ((View) this.x).removeOnAttachStateChangeListener(this);
                ((gy5) this.y).A();
                return;
        }
    }

    public gq2(hq2 hq2, wq2 wq2) {
        this.y = hq2;
        this.x = wq2;
    }

    public gq2(View view, gy5 gy5) {
        this.x = view;
        this.y = gy5;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
