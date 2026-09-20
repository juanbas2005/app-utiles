package defpackage;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;

/* renamed from: hd  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hd implements p4 {
    public final AccessibilityManager a;

    public hd(Context context) {
        Object systemService = context.getSystemService("accessibility");
        systemService.getClass();
        this.a = (AccessibilityManager) systemService;
    }
}
