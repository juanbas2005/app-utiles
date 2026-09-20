package defpackage;

import java.io.Closeable;

/* renamed from: xr0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xr0 implements Closeable {
    public final au w;
    public final Object x;
    public final vr2 y;
    public sr2 z = new o(20);

    public xr0(au auVar, Object obj, vr2 vr2) {
        auVar.getClass();
        obj.getClass();
        this.w = auVar;
        this.x = obj;
        this.y = vr2;
    }

    public final void close() {
        this.z.b();
    }
}
