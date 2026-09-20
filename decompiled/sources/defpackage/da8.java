package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import cu.lestebang.utiletecsa.R;
import java.util.List;

/* renamed from: da8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class da8 extends ga8 {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final sb2 f = new sb2();
    public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void e(ha8 ha8, View view) {
        us0 j = j(view);
        if (j != null) {
            j.d(ha8);
            if (j.w == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(ha8, viewGroup.getChildAt(i));
            }
        }
    }

    public static void f(View view, ha8 ha8, db8 db8, boolean z) {
        us0 j = j(view);
        if (j != null) {
            j.x = db8;
            if (!z) {
                j.e(ha8);
                if (j.w == 0) {
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), ha8, db8, z);
            }
        }
    }

    public static void g(View view, db8 db8, List list) {
        us0 j = j(view);
        if (j != null) {
            db8 = j.f(db8, list);
            if (j.w == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), db8, list);
            }
        }
    }

    public static void h(View view, ha8 ha8, k68 k68) {
        us0 j = j(view);
        if (j != null) {
            j.g(ha8, k68);
            if (j.w == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                h(viewGroup.getChildAt(i), ha8, k68);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        if (view.getTag(R.id.tag_on_apply_window_listener) != null) {
            return windowInsets;
        }
        return view.onApplyWindowInsets(windowInsets);
    }

    public static us0 j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof ca8) {
            return ((ca8) tag).a;
        }
        return null;
    }
}
