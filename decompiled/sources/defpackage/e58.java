package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import cu.lestebang.utiletecsa.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: e58  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class e58 {
    public static WeakHashMap a = null;
    public static Field b = null;
    public static boolean c = false;
    public static final int[] d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    public static final r48 e = new Object();
    public static final t48 f = new t48();

    public static c68 a(View view) {
        if (a == null) {
            a = new WeakHashMap();
        }
        c68 c68 = (c68) a.get(view);
        if (c68 != null) {
            return c68;
        }
        c68 c682 = new c68(view);
        a.put(view, c682);
        return c682;
    }

    public static void b(View view, db8 db8) {
        WindowInsets windowInsets;
        WindowInsets f2 = db8.f();
        if (f2 != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                windowInsets = b58.a(view, f2);
            } else {
                windowInsets = u48.a(view, f2);
            }
            if (!windowInsets.equals(f2)) {
                db8.g(view, windowInsets);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [d58, java.lang.Object] */
    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = d58.d;
        d58 d58 = (d58) view.getTag(R.id.tag_unhandled_key_event_manager);
        d58 d582 = d58;
        if (d58 == null) {
            ? obj = new Object();
            obj.a = null;
            obj.b = null;
            obj.c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, obj);
            d582 = obj;
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = d582.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = d58.d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (d582.a == null) {
                            d582.a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = d58.d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                d582.a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    d582.a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View a2 = d582.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a2 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (d582.b == null) {
                    d582.b = new SparseArray();
                }
                d582.b.put(keyCode, new WeakReference(a2));
            }
        }
        if (a2 != null) {
            return true;
        }
        return false;
    }

    public static View.AccessibilityDelegate d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return a58.a(view);
        }
        if (c) {
            return null;
        }
        if (b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                c = true;
                return null;
            }
        }
        try {
            Object obj = b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            c = true;
            return null;
        }
    }

    public static CharSequence e(View view) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            obj = z48.a(view);
        } else {
            obj = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(obj)) {
                obj = null;
            }
        }
        return (CharSequence) obj;
    }

    public static ArrayList f(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] g(ap apVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            return c58.a(apVar);
        }
        return (String[]) apVar.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void h(View view, int i) {
        boolean z;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            if (e(view) == null || !view.isShown() || view.getWindowVisibility() != 0) {
                z = false;
            } else {
                z = true;
            }
            int i2 = 32;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z) {
                    i2 = 2048;
                }
                obtain.setEventType(i2);
                obtain.setContentChangeTypes(i);
                if (z) {
                    obtain.getText().add(e(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                obtain2.setContentChangeTypes(i);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(e(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e2);
                }
            }
        }
    }

    public static x41 i(View view, x41 x41) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + x41 + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return c58.b(view, x41);
        }
        zg7 zg7 = (zg7) view.getTag(R.id.tag_on_receive_content_listener);
        h55 h55 = e;
        if (zg7 != null) {
            x41 a2 = zg7.a(view, x41);
            if (a2 == null) {
                return null;
            }
            if (view instanceof h55) {
                h55 = (h55) view;
            }
            return h55.a(a2);
        }
        if (view instanceof h55) {
            h55 = (h55) view;
        }
        return h55.a(x41);
    }

    public static void j(View view, int i) {
        ArrayList f2 = f(view);
        for (int i2 = 0; i2 < f2.size(); i2++) {
            if (((w4) f2.get(i2)).a() == i) {
                f2.remove(i2);
                return;
            }
        }
    }

    public static void k(View view, w4 w4Var, t5 t5Var) {
        k4 k4Var;
        w4 w4Var2 = new w4((Object) null, w4Var.b, (CharSequence) null, t5Var, w4Var.c);
        View.AccessibilityDelegate d2 = d(view);
        if (d2 == null) {
            k4Var = null;
        } else if (d2 instanceof j4) {
            k4Var = ((j4) d2).a;
        } else {
            k4Var = new k4(d2);
        }
        if (k4Var == null) {
            k4Var = new k4();
        }
        m(view, k4Var);
        j(view, w4Var2.a());
        f(view).add(w4Var2);
        h(view, 0);
    }

    public static void l(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            a58.b(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void m(View view, k4 k4Var) {
        j4 j4Var;
        if (k4Var == null && (d(view) instanceof j4)) {
            k4Var = new k4();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        if (k4Var == null) {
            j4Var = null;
        } else {
            j4Var = k4Var.x;
        }
        view.setAccessibilityDelegate(j4Var);
    }

    public static void n(View view, CharSequence charSequence) {
        boolean z;
        new s48(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).g(view, charSequence);
        t48 t48 = f;
        if (charSequence != null) {
            WeakHashMap weakHashMap = t48.w;
            if (!view.isShown() || view.getWindowVisibility() != 0) {
                z = false;
            } else {
                z = true;
            }
            weakHashMap.put(view, Boolean.valueOf(z));
            view.addOnAttachStateChangeListener(t48);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(t48);
                return;
            }
            return;
        }
        t48.w.remove(view);
        view.removeOnAttachStateChangeListener(t48);
        view.getViewTreeObserver().removeOnGlobalLayoutListener(t48);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: ea8} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, android.view.View$OnApplyWindowInsetsListener] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    public static void o(View view, us0 us0) {
        ? r2 = 0;
        if (Build.VERSION.SDK_INT >= 30) {
            if (us0 != null) {
                r2 = new ea8(us0);
            }
            view.setWindowInsetsAnimationCallback(r2);
            return;
        }
        PathInterpolator pathInterpolator = da8.e;
        if (us0 != null) {
            r2 = new ca8(view, us0);
        }
        view.setTag(R.id.tag_window_insets_animation_callback, r2);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(r2);
        }
    }
}
