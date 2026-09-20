package defpackage;

import kotlinx.datetime.LocalDateTime;

/* renamed from: ea4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ea4 implements zr3 {
    public static final ea4 a = new Object();
    public static final po5 b = b85.b("kotlinx.datetime.LocalDateTime");

    public final Object deserialize(ok1 ok1) {
        return z94.a(LocalDateTime.Companion, ok1.t());
    }

    public final ll6 getDescriptor() {
        return b;
    }

    public final void serialize(j42 j42, Object obj) {
        LocalDateTime localDateTime = (LocalDateTime) obj;
        localDateTime.getClass();
        j42.D(localDateTime.toString());
    }
}
