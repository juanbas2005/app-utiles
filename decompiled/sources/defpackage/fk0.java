package defpackage;

import java.util.concurrent.ScheduledFuture;

/* renamed from: fk0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fk0 implements o05 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ fk0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final String toString() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case b85.b:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) obj) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((vr2) obj).getClass().getSimpleName() + '@' + rj1.t(this) + ']';
            default:
                return "DisposeOnCancel[" + ((mw1) obj) + ']';
        }
    }
}
