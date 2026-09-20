package defpackage;

import android.view.KeyEvent;

/* renamed from: og1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class og1 implements vr2 {
    public final /* synthetic */ ik2 w;
    public final /* synthetic */ gs2 x;
    public final /* synthetic */ boolean y;

    public og1(ik2 ik2, gs2 gs2, boolean z) {
        this.w = ik2;
        this.x = gs2;
        this.y = z;
    }

    public final Object y(Object obj) {
        int i;
        KeyEvent keyEvent = ((qs3) obj).a;
        boolean w2 = dh4.w(keyEvent);
        gs2 gs2 = this.x;
        ik2 ik2 = this.w;
        if (w2) {
            lk2 lk2 = (lk2) ik2;
            lk2.h(1, true);
            if (gs2 != null) {
                lk2.h(1, true);
            }
            return Boolean.TRUE;
        } else if (!dh4.v(keyEvent) || gs2 == null) {
            return Boolean.FALSE;
        } else {
            if (this.y) {
                i = 4;
            } else {
                i = 3;
            }
            ((lk2) ik2).h(i, true);
            return Boolean.TRUE;
        }
    }
}
