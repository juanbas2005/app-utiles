package defpackage;

import android.view.KeyEvent;

/* renamed from: pg1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pg1 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ Object y;

    public /* synthetic */ pg1(int i, Object obj, boolean z) {
        this.w = i;
        this.x = z;
        this.y = obj;
    }

    public final Object y(Object obj) {
        int i;
        boolean z;
        boolean z2;
        int i2 = this.w;
        Object obj2 = this.y;
        boolean z3 = this.x;
        switch (i2) {
            case b85.b:
                KeyEvent keyEvent = ((qs3) obj).a;
                ik2 ik2 = (ik2) obj2;
                if (z3) {
                    i = 3;
                } else {
                    i = 4;
                }
                if (dh4.w(keyEvent)) {
                    lk2 lk2 = (lk2) ik2;
                    if (!lk2.h(i, true)) {
                        lk2.h(1, true);
                    }
                    return Boolean.TRUE;
                } else if (!dh4.v(keyEvent)) {
                    return Boolean.FALSE;
                } else {
                    lk2 lk22 = (lk2) ik2;
                    lk22.h(i, true);
                    lk22.h(2, true);
                    return Boolean.TRUE;
                }
            case 1:
                KeyEvent keyEvent2 = ((qs3) obj).a;
                ik2 ik22 = (ik2) obj2;
                if (z3) {
                    z = gi1.p(keyEvent2);
                } else {
                    z = gi1.q(keyEvent2);
                }
                if (z) {
                    ((lk2) ik22).h(1, true);
                    return Boolean.TRUE;
                }
                if (z3) {
                    z2 = gi1.q(keyEvent2);
                } else {
                    z2 = gi1.p(keyEvent2);
                }
                if (!z2) {
                    return Boolean.FALSE;
                }
                ((lk2) ik22).h(2, true);
                return Boolean.TRUE;
            default:
                KeyEvent keyEvent3 = ((qs3) obj).a;
                if (!z3 || !dh4.w(keyEvent3)) {
                    return Boolean.FALSE;
                }
                ((sr2) obj2).b();
                return Boolean.TRUE;
        }
    }
}
