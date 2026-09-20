package defpackage;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import com.google.android.material.internal.CheckableImageButton;

/* renamed from: m02  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class m02 implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final /* synthetic */ n02 w;

    public /* synthetic */ m02(n02 n02) {
        this.w = n02;
    }

    public final void onTouchExplorationStateChanged(boolean z) {
        int i;
        n02 n02 = this.w;
        AutoCompleteTextView autoCompleteTextView = n02.h;
        if (autoCompleteTextView != null && autoCompleteTextView.getInputType() == 0) {
            CheckableImageButton checkableImageButton = n02.d;
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            checkableImageButton.setImportantForAccessibility(i);
        }
    }
}
