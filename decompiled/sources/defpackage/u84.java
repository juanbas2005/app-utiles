package defpackage;

import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;

/* renamed from: u84  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class u84 implements AccessibilityManager$AccessibilityServicesStateChangeListener {
    public final ed5 a;
    public final ed5 b;

    public u84(w84 w84) {
        Boolean bool = Boolean.FALSE;
        this.a = u55.p(bool);
        this.b = u55.p(bool);
    }

    public final void onAccessibilityServicesStateChanged(AccessibilityManager accessibilityManager) {
        this.a.setValue(Boolean.valueOf(w84.b(accessibilityManager)));
        this.b.setValue(Boolean.valueOf(w84.c(accessibilityManager)));
    }
}
