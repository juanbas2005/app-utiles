package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: d5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class d5 extends AccessibilityNodeProvider {
    public final f96 a;

    public d5(f96 f96) {
        this.a = f96;
    }

    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        c5 n = this.a.n(i);
        if (n == null) {
            return null;
        }
        return n.a;
    }

    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.a.getClass();
        return null;
    }

    public final AccessibilityNodeInfo findFocus(int i) {
        c5 x = this.a.x(i);
        if (x == null) {
            return null;
        }
        return x.a;
    }

    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.a.C(i, i2, bundle);
    }
}
