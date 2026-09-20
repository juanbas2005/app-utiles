package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: d05  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class d05 extends c1 implements el3 {
    public static final d05 x = new c1(me6.E);

    public final CancellationException E() {
        throw new IllegalStateException("This job is always active");
    }

    public final mw1 T(boolean z, boolean z2, vr2 vr2) {
        return f05.w;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final Object j0(h61 h61) {
        throw new UnsupportedOperationException("This job is always active");
    }

    public final boolean l() {
        return true;
    }

    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    public final ap0 u(ll3 ll3) {
        return f05.w;
    }

    public final mw1 v(vr2 vr2) {
        return f05.w;
    }

    public final void o(CancellationException cancellationException) {
    }
}
