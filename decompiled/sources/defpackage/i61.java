package defpackage;

import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: i61  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class i61 extends AtomicBoolean implements OutcomeReceiver {
    public final kk0 w;

    public i61(kk0 kk0) {
        super(false);
        this.w = kk0;
    }

    public final void onError(Throwable th) {
        th.getClass();
        if (compareAndSet(false, true)) {
            this.w.f(new m66(th));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.w.f(obj);
        }
    }

    public final String toString() {
        boolean z = get();
        return "ContinuationOutcomeReceiver(outcomeReceived = " + z + ")";
    }
}
