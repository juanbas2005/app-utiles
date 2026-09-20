package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;

/* renamed from: vp1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vp1 implements up1, vb8 {
    public static final vp1 w = new Object();
    public static final vp1 x = new Object();

    public qb8 b(Activity activity, up1 up1) {
        up1.getClass();
        ib0.b.getClass();
        return new qb8(new gb0(hb0.a().s(activity)), up1.f(activity));
    }

    public float f(Context context) {
        return ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }

    public qb8 h(Context context, up1 up1) {
        WindowManager windowManager;
        up1.getClass();
        Class cls = WindowManager.class;
        if (context.isUiContext()) {
            windowManager = (WindowManager) context.getSystemService(cls);
        } else {
            windowManager = (WindowManager) context.getApplicationContext().getSystemService(cls);
        }
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new qb8(bounds, windowManager.getCurrentWindowMetrics().getDensity());
    }
}
