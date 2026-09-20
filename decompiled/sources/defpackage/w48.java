package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import cu.lestebang.utiletecsa.R;

/* renamed from: w48  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class w48 {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static db8 b(View view, db8 db8, Rect rect) {
        WindowInsets f = db8.f();
        if (f != null) {
            return db8.g(view, view.computeSystemWindowInsets(f, rect));
        }
        rect.setEmpty();
        return db8;
    }

    public static void c(View view, l45 l45) {
        v48 v48;
        if (l45 != null) {
            v48 = new v48(view, l45);
        } else {
            v48 = null;
        }
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, v48);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null) {
            if (v48 != null) {
                view.setOnApplyWindowInsetsListener(v48);
            } else {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
            }
        }
    }
}
