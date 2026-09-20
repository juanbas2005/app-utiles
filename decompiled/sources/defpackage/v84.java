package defpackage;

import android.view.accessibility.AccessibilityManager;

/* renamed from: v84  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class v84 implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final ed5 w = u55.p(Boolean.FALSE);

    public final void onTouchExplorationStateChanged(boolean z) {
        this.w.setValue(Boolean.valueOf(z));
    }
}
