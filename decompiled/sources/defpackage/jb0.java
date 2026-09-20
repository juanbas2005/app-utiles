package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;

/* renamed from: jb0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jb0 implements ib0, vb8 {
    public static final jb0 w = new Object();
    public static final jb0 x = new Object();

    public qb8 b(Activity activity, up1 up1) {
        up1.getClass();
        ib0.b.getClass();
        return new qb8(new gb0(hb0.a().s(activity)), up1.f(activity));
    }

    public qb8 h(Context context, up1 up1) {
        up1.getClass();
        float f = context.getResources().getDisplayMetrics().density;
        Rect bounds = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new qb8(bounds, f);
    }

    public Rect s(Activity activity) {
        Rect bounds = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return bounds;
    }
}
