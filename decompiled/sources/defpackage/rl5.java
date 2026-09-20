package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;

/* renamed from: rl5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rl5 extends ql5 {
    public final void h(View view, Rect rect) {
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        rect.set(((WindowManager) systemService).getCurrentWindowMetrics().getBounds());
    }
}
