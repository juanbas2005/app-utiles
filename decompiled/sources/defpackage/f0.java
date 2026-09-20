package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: f0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class f0 extends h0 {
    public final Object q(Object obj, Throwable th) {
        dt dtVar = (dt) obj;
        ListenableFuture apply = dtVar.apply(th);
        g75.k(apply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", dtVar);
        return apply;
    }

    public final void r(Object obj) {
        n((ListenableFuture) obj);
    }
}
