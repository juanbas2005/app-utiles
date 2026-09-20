package defpackage;

import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: c71  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class c71 {
    private volatile /* synthetic */ Object current = b42.w;

    static {
        AtomicReferenceFieldUpdater.newUpdater(c71.class, Object.class, "current");
    }

    public final Object a(xb4 xb4) {
        xb4.getClass();
        return ((Map) this.current).get(xb4);
    }
}
