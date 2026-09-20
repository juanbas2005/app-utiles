package defpackage;

/* renamed from: ns7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ns7 extends h81 {
    public static final ns7 y = new h81();

    public final void D(e81 e81, Runnable runnable) {
        vf8 vf8 = (vf8) e81.a0(vf8.y);
        if (vf8 != null) {
            vf8.x = true;
        } else {
            kj6.n("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }

    public final h81 n0(int i) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
