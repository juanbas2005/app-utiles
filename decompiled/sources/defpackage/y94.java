package defpackage;

import kotlinx.datetime.LocalDate;

/* renamed from: y94  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class y94 implements zr3 {
    public static final y94 a = new Object();
    public static final po5 b = b85.b("kotlinx.datetime.LocalDate");

    public final Object deserialize(ok1 ok1) {
        return r94.b(LocalDate.Companion, ok1.t());
    }

    public final ll6 getDescriptor() {
        return b;
    }

    public final void serialize(j42 j42, Object obj) {
        LocalDate localDate = (LocalDate) obj;
        localDate.getClass();
        j42.D(localDate.toString());
    }
}
