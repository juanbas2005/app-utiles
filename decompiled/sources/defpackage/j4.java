package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import cu.lestebang.utiletecsa.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: j4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class j4 extends View.AccessibilityDelegate {
    public final k4 a;

    public j4(k4 k4Var) {
        this.a = k4Var;
    }

    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.a.a(view, accessibilityEvent);
    }

    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        f96 b = this.a.b(view);
        if (b != null) {
            return (AccessibilityNodeProvider) b.x;
        }
        return null;
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.a.c(view, accessibilityEvent);
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object obj;
        boolean z;
        Object obj2;
        Object obj3;
        int i;
        c5 c5Var = new c5(accessibilityNodeInfo);
        WeakHashMap weakHashMap = e58.a;
        ClickableSpan[] clickableSpanArr = null;
        Class<Boolean> cls = Boolean.class;
        if (Build.VERSION.SDK_INT >= 28) {
            obj = Boolean.valueOf(z48.c(view));
        } else {
            obj = view.getTag(R.id.tag_screen_reader_focusable);
            if (!cls.isInstance(obj)) {
                obj = null;
            }
        }
        Boolean bool = (Boolean) obj;
        boolean z2 = true;
        if (bool == null || !bool.booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            accessibilityNodeInfo.setScreenReaderFocusable(z);
        } else {
            c5Var.h(1, z);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            obj2 = Boolean.valueOf(z48.b(view));
        } else {
            obj2 = view.getTag(R.id.tag_accessibility_heading);
            if (!cls.isInstance(obj2)) {
                obj2 = null;
            }
        }
        Boolean bool2 = (Boolean) obj2;
        if (bool2 == null || !bool2.booleanValue()) {
            z2 = false;
        }
        if (i2 >= 28) {
            accessibilityNodeInfo.setHeading(z2);
        } else {
            c5Var.h(2, z2);
        }
        CharSequence e = e58.e(view);
        if (i2 >= 28) {
            accessibilityNodeInfo.setPaneTitle(e);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", e);
        }
        if (i2 >= 30) {
            obj3 = b58.b(view);
        } else {
            obj3 = view.getTag(R.id.tag_state_description);
            if (!CharSequence.class.isInstance(obj3)) {
                obj3 = null;
            }
        }
        CharSequence charSequence = (CharSequence) obj3;
        if (i2 >= 30) {
            x4.j(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.a.d(view, c5Var);
        CharSequence text = accessibilityNodeInfo.getText();
        if (i2 < 26) {
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                    if (((WeakReference) sparseArray.valueAt(i3)).get() == null) {
                        arrayList.add(Integer.valueOf(i3));
                    }
                }
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    sparseArray.remove(((Integer) arrayList.get(i4)).intValue());
                }
            }
            if (text instanceof Spanned) {
                clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
            }
            if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                SparseArray sparseArray2 = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    view.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                }
                for (int i5 = 0; i5 < clickableSpanArr.length; i5++) {
                    ClickableSpan clickableSpan = clickableSpanArr[i5];
                    int i6 = 0;
                    while (true) {
                        if (i6 >= sparseArray2.size()) {
                            i = c5.d;
                            c5.d = i + 1;
                            break;
                        } else if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i6)).get())) {
                            i = sparseArray2.keyAt(i6);
                            break;
                        } else {
                            i6++;
                        }
                    }
                    sparseArray2.put(i, new WeakReference(clickableSpanArr[i5]));
                    ClickableSpan clickableSpan2 = clickableSpanArr[i5];
                    Spanned spanned = (Spanned) text;
                    c5Var.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    c5Var.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    c5Var.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    c5Var.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
                }
            }
        }
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i7 = 0; i7 < list.size(); i7++) {
            c5Var.b((w4) list.get(i7));
        }
    }

    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.a.e(view, accessibilityEvent);
    }

    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.a.f(viewGroup, view, accessibilityEvent);
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.a.g(view, i, bundle);
    }

    public final void sendAccessibilityEvent(View view, int i) {
        this.a.h(view, i);
    }

    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.a.i(view, accessibilityEvent);
    }
}
