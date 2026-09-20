package defpackage;

import kotlinx.datetime.DateTimePeriod;

/* renamed from: xi1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xi1 implements zr3 {
    public static final xi1 a = new Object();
    public static final po5 b = b85.b("kotlinx.datetime.DateTimePeriod/ISO");

    public final Object deserialize(ok1 ok1) {
        vi1 vi1 = DateTimePeriod.Companion;
        String t = ok1.t();
        vi1.getClass();
        return vi1.a(t);
    }

    public final ll6 getDescriptor() {
        return b;
    }

    public final void serialize(j42 j42, Object obj) {
        DateTimePeriod dateTimePeriod = (DateTimePeriod) obj;
        dateTimePeriod.getClass();
        j42.D(dateTimePeriod.toString());
    }
}
