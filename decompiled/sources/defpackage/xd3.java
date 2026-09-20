package defpackage;

import kotlinx.datetime.Instant;

/* renamed from: xd3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xd3 implements zr3 {
    public static final xd3 a = new Object();
    public static final po5 b = b85.b("kotlinx.datetime.Instant");

    public final Object deserialize(ok1 ok1) {
        long j;
        pd3 pd3 = Instant.Companion;
        String t = ok1.t();
        ni1 ni1 = ii1.a;
        pd3.getClass();
        t.getClass();
        ni1.getClass();
        try {
            qd3 a2 = ki1.a((ki1) ni1.c(t));
            j = a2.w;
            java.time.Instant k = java.time.Instant.ofEpochSecond(j, (long) a2.x);
            k.getClass();
            return new Instant(k);
        } catch (Exception e) {
            if (!(e instanceof ArithmeticException)) {
                if (!fb3.p(e)) {
                    throw e;
                }
            }
            if (j > 0) {
                return Instant.MAX;
            }
            return Instant.MIN;
        } catch (IllegalArgumentException e2) {
            throw new IllegalArgumentException("Failed to parse an instant from '" + t + '\'', e2);
        }
    }

    public final ll6 getDescriptor() {
        return b;
    }

    public final void serialize(j42 j42, Object obj) {
        Instant instant = (Instant) obj;
        instant.getClass();
        j42.D(instant.toString());
    }
}
