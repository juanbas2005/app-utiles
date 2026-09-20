package defpackage;

import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: a46  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class a46 implements u30 {
    public static final AtomicReference a = new AtomicReference();

    public final void a(boolean z) {
        Random random = b46.j;
        synchronized (b46.class) {
            for (nf2 c : b46.k.values()) {
                c.c(z);
            }
        }
    }
}
