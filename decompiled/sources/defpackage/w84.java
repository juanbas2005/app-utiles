package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import java.util.List;

/* renamed from: w84  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class w84 implements AccessibilityManager.AccessibilityStateChangeListener, a37 {
    public final u84 A;
    public final boolean w;
    public final boolean x;
    public final ed5 y = u55.p(Boolean.FALSE);
    public final v84 z;

    public w84(boolean z2, boolean z3, boolean z4) {
        v84 v84;
        this.w = z3;
        this.x = z4;
        u84 u84 = null;
        if (z2) {
            v84 = new v84();
        } else {
            v84 = null;
        }
        this.z = v84;
        if ((z3 || z4) && Build.VERSION.SDK_INT >= 33) {
            u84 = new u84(this);
        }
        this.A = u84;
    }

    public static boolean b(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i = 0; i < size; i++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i).getSettingsActivityName();
            if (settingsActivityName != null && d57.x0(settingsActivityName, "SwitchAccess", true)) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i = 0; i < size; i++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i).getSettingsActivityName();
            if (settingsActivityName != null && d57.x0(settingsActivityName, "VoiceAccess", true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0036, code lost:
        if (((java.lang.Boolean) r2.a.getValue()).booleanValue() == true) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
        if (((java.lang.Boolean) r2.b.getValue()).booleanValue() == true) goto L_0x004f;
     */
    public final Object getValue() {
        boolean z2;
        if (((Boolean) this.y.getValue()).booleanValue()) {
            z2 = true;
            v84 v84 = this.z;
            if (v84 == null || !((Boolean) v84.w.getValue()).booleanValue()) {
                boolean z3 = this.w;
                u84 u84 = this.A;
                if (z3) {
                    if (u84 != null) {
                    }
                }
                if (this.x) {
                    if (u84 != null) {
                    }
                }
            }
            return Boolean.valueOf(z2);
        }
        z2 = false;
        return Boolean.valueOf(z2);
    }

    public final void onAccessibilityStateChanged(boolean z2) {
        this.y.setValue(Boolean.valueOf(z2));
    }
}
