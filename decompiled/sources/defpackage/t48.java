package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: t48  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class t48 implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
    public final WeakHashMap w = new WeakHashMap();

    public final void onGlobalLayout() {
        boolean z;
        int i;
        if (Build.VERSION.SDK_INT < 28) {
            for (Map.Entry entry : this.w.entrySet()) {
                View view = (View) entry.getKey();
                boolean booleanValue = ((Boolean) entry.getValue()).booleanValue();
                if (!view.isShown() || view.getWindowVisibility() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (booleanValue != z) {
                    if (z) {
                        i = 16;
                    } else {
                        i = 32;
                    }
                    e58.h(view, i);
                    entry.setValue(Boolean.valueOf(z));
                }
            }
        }
    }

    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
