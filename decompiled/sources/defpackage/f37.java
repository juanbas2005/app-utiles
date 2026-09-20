package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: f37  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class f37 extends d3 {
    public final AtomicReference a = new AtomicReference((Object) null);

    public final boolean a(c3 c3Var) {
        d37 d37 = (d37) c3Var;
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(e37.a);
        return true;
    }

    public final f61[] b(c3 c3Var) {
        d37 d37 = (d37) c3Var;
        this.a.set((Object) null);
        return bb0.a;
    }
}
