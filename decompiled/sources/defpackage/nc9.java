package defpackage;

import android.os.SystemClock;

/* renamed from: nc9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nc9 extends a35 {
    public final /* synthetic */ int f;

    public /* synthetic */ nc9(int i) {
        this.f = i;
    }

    public final long l() {
        switch (this.f) {
            case b85.b:
                return SystemClock.elapsedRealtimeNanos();
            default:
                return SystemClock.elapsedRealtime() * 1000000;
        }
    }
}
