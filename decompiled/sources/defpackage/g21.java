package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: g21  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class g21 implements al6 {
    public final AtomicReference a;

    public g21(al6 al6) {
        this.a = new AtomicReference(al6);
    }

    public final Iterator iterator() {
        al6 al6 = (al6) this.a.getAndSet((Object) null);
        if (al6 != null) {
            return al6.iterator();
        }
        h.s("This sequence can be consumed only once.");
        return null;
    }
}
