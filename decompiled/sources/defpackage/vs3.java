package defpackage;

import android.view.KeyEvent;

/* renamed from: vs3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vs3 extends ll4 implements us3 {
    public vr2 K;
    public vr2 L;

    public final boolean B(KeyEvent keyEvent) {
        vr2 vr2 = this.K;
        if (vr2 != null) {
            return ((Boolean) vr2.y(new qs3(keyEvent))).booleanValue();
        }
        return false;
    }

    public final boolean j(KeyEvent keyEvent) {
        vr2 vr2 = this.L;
        if (vr2 != null) {
            return ((Boolean) vr2.y(new qs3(keyEvent))).booleanValue();
        }
        return false;
    }
}
