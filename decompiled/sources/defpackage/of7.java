package defpackage;

import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: of7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class of7 extends k4 {
    public final TextInputLayout z;

    public of7(TextInputLayout textInputLayout) {
        this.z = textInputLayout;
    }

    public final void d(View view, c5 c5Var) {
        Editable editable;
        boolean z2;
        String str;
        AccessibilityNodeInfo accessibilityNodeInfo = c5Var.a;
        this.w.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.z;
        EditText editText = textInputLayout.getEditText();
        if (editText != null) {
            editable = editText.getText();
        } else {
            editable = null;
        }
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean isEmpty = TextUtils.isEmpty(editable);
        boolean isEmpty2 = TextUtils.isEmpty(hint);
        boolean z3 = textInputLayout.R0;
        boolean isEmpty3 = TextUtils.isEmpty(error);
        if (!isEmpty3 || !TextUtils.isEmpty(counterOverflowDescription)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!isEmpty2) {
            str = hint.toString();
        } else {
            str = "";
        }
        r27 r27 = textInputLayout.x;
        gq gqVar = r27.x;
        if (gqVar.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(gqVar);
            accessibilityNodeInfo.setTraversalAfter(gqVar);
        } else {
            accessibilityNodeInfo.setTraversalAfter(r27.z);
        }
        if (!isEmpty) {
            c5Var.l(editable);
        } else if (!TextUtils.isEmpty(str)) {
            c5Var.l(str);
            if (!z3 && placeholderText != null) {
                c5Var.l(str + ", " + placeholderText);
            }
        } else if (placeholderText != null) {
            c5Var.l(placeholderText);
        }
        if (!TextUtils.isEmpty(str)) {
            int i = Build.VERSION.SDK_INT;
            if (i < 26) {
                if (!isEmpty) {
                    str = editable + ", " + str;
                }
                c5Var.l(str);
            } else if (i >= 26) {
                accessibilityNodeInfo.setHintText(str);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", str);
            }
            if (i >= 26) {
                accessibilityNodeInfo.setShowingHintText(isEmpty);
            } else {
                c5Var.h(4, isEmpty);
            }
        }
        if (editable == null || editable.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z2) {
            if (isEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        gq gqVar2 = textInputLayout.G.y;
        if (gqVar2 != null) {
            accessibilityNodeInfo.setLabelFor(gqVar2);
        }
        textInputLayout.y.b().m(c5Var);
    }

    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.z.y.b().n(accessibilityEvent);
    }
}
