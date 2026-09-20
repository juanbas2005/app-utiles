package defpackage;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* renamed from: ek5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ek5 extends p2 {
    public final int b() {
        return ThreadLocalRandom.current().nextInt(3, 201);
    }

    public final long d() {
        return ThreadLocalRandom.current().nextLong(1000);
    }

    public final long e() {
        return ThreadLocalRandom.current().nextLong(0, 1000);
    }

    public final Random f() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        current.getClass();
        return current;
    }
}
