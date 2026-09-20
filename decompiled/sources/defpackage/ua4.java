package defpackage;

import kotlinx.datetime.LocalTime;

/* renamed from: ua4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ua4 implements zr3 {
    public static final ua4 a = new Object();
    public static final po5 b = b85.b("kotlinx.datetime.LocalTime");

    public final Object deserialize(ok1 ok1) {
        return qa4.b(LocalTime.Companion, ok1.t());
    }

    public final ll6 getDescriptor() {
        return b;
    }

    public final void serialize(j42 j42, Object obj) {
        LocalTime localTime = (LocalTime) obj;
        localTime.getClass();
        j42.D(localTime.toString());
    }
}
