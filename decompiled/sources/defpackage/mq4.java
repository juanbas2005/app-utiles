package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: mq4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mq4 {
    public final AtomicReference a = new AtomicReference((Object) null);
    public final qq4 b = new qq4();

    public static final void a(mq4 mq4, jq4 jq4) {
        AtomicReference atomicReference = mq4.a;
        while (true) {
            jq4 jq42 = (jq4) atomicReference.get();
            if (jq42 == null || jq4.a.compareTo(jq42.a) >= 0) {
                while (true) {
                    if (atomicReference.compareAndSet(jq42, jq4)) {
                        if (jq42 != null) {
                            jq42.b.o(new CancellationException("Mutation interrupted"));
                            return;
                        }
                        return;
                    } else if (atomicReference.get() != jq42) {
                    }
                }
            } else {
                throw new CancellationException("Current mutation had a higher priority");
            }
        }
    }
}
