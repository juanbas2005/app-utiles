package defpackage;

import java.util.UUID;

/* renamed from: bc9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bc9 extends tb9 {
    public static final bc9 C;

    /* JADX WARNING: type inference failed for: r0v0, types: [bc9, tb9] */
    static {
        UUID randomUUID = UUID.randomUUID();
        C = new tb9("<skip trace>", randomUUID, qb9.a(randomUUID), ec9.e, vb9.c());
    }

    public final jc9 S(String str, fc9 fc9, ic9 ic9) {
        throw new IllegalStateException("Can't create child trace for no trace!");
    }

    public final fc9 i() {
        return ec9.e;
    }
}
