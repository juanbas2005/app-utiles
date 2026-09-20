package defpackage;

import android.view.accessibility.AccessibilityEvent;

/* renamed from: ne  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ne extends wx3 implements vr2 {
    public final /* synthetic */ int x;
    public final /* synthetic */ oe y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ne(oe oeVar, int i) {
        super(1);
        this.x = i;
        this.y = oeVar;
    }

    public final Object y(Object obj) {
        int i = this.x;
        oe oeVar = this.y;
        switch (i) {
            case b85.b:
                je jeVar = oeVar.z;
                return Boolean.valueOf(jeVar.getParent().requestSendAccessibilityEvent(jeVar, (AccessibilityEvent) obj));
            default:
                dh6 dh6 = (dh6) obj;
                if (dh6.x.contains(dh6)) {
                    r95 snapshotObserver = oeVar.z.getSnapshotObserver();
                    snapshotObserver.a.e(dh6, oeVar.k0, new ae(1, dh6, oeVar));
                }
                return vs7.a;
        }
    }
}
