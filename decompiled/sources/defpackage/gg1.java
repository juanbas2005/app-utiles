package defpackage;

import kotlinx.datetime.DatePeriod;
import kotlinx.datetime.DateTimePeriod;

/* renamed from: gg1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gg1 implements zr3 {
    public static final gg1 a = new Object();
    public static final po5 b = b85.b("kotlinx.datetime.DatePeriod/ISO");

    /* renamed from: a */
    public final DatePeriod deserialize(ok1 ok1) {
        vi1 vi1 = DateTimePeriod.Companion;
        String t = ok1.t();
        vi1.getClass();
        DateTimePeriod a2 = vi1.a(t);
        if (a2 instanceof DatePeriod) {
            return (DatePeriod) a2;
        }
        throw new IllegalArgumentException(a2 + " is not a date-based period");
    }

    public final ll6 getDescriptor() {
        return b;
    }

    public final void serialize(j42 j42, Object obj) {
        DatePeriod datePeriod = (DatePeriod) obj;
        datePeriod.getClass();
        j42.D(datePeriod.toString());
    }
}
