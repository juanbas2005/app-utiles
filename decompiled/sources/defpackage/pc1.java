package defpackage;

import java.security.SecureRandom;

/* renamed from: pc1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pc1 extends oc1 {
    public final SecureRandom c;

    public pc1(SecureRandom secureRandom) {
        this.c = secureRandom;
    }

    public final int a() {
        return this.c.nextInt();
    }

    public final long c() {
        return this.c.nextLong();
    }
}
