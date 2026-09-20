package defpackage;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import cu.lestebang.utiletecsa.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: k4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class k4 {
    public static final View.AccessibilityDelegate y = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate w;
    public final j4 x;

    public k4(View.AccessibilityDelegate accessibilityDelegate) {
        this.w = accessibilityDelegate;
        this.x = new j4(this);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.w.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public f96 b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.w.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new f96(3, (Object) accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.w.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, c5 c5Var) {
        this.w.onInitializeAccessibilityNodeInfo(view, c5Var.a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.w.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.w.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* JADX WARNING: type inference failed for: r8v11, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    public boolean g(View view, int i, Bundle bundle) {
        ClickableSpan[] clickableSpanArr;
        boolean z;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            clickableSpanArr = null;
            if (i2 >= list.size()) {
                break;
            }
            w4 w4Var = (w4) list.get(i2);
            if (w4Var.a() == i) {
                Class cls = w4Var.c;
                t5 t5Var = w4Var.d;
                if (t5Var != null) {
                    if (cls != null) {
                        try {
                            if (cls.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null) == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        } catch (Exception e) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e);
                        }
                    }
                    z = t5Var.a(view);
                }
            } else {
                i2++;
            }
        }
        z = false;
        if (!z) {
            z = this.w.performAccessibilityAction(view, i, bundle);
        }
        if (z || i != R.id.accessibility_action_clickable_span || bundle == null) {
            return z;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i3)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            if (text instanceof Spanned) {
                clickableSpanArr = ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
            }
            int i4 = 0;
            while (true) {
                if (clickableSpanArr == null || i4 >= clickableSpanArr.length) {
                    break;
                } else if (clickableSpan.equals(clickableSpanArr[i4])) {
                    clickableSpan.onClick(view);
                    z2 = true;
                    break;
                } else {
                    i4++;
                }
            }
        }
        return z2;
    }

    public void h(View view, int i) {
        this.w.sendAccessibilityEvent(view, i);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.w.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public k4() {
        this(y);
    }
}
