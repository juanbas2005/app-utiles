package defpackage;

import kotlinx.datetime.DatePeriod;

/* renamed from: hg1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hg1 implements zr3 {
    public static final hg1 b = new hg1();
    public static final po5 c = b85.b("kotlinx.datetime.DatePeriod");
    public final /* synthetic */ gg1 a = gg1.a;

    public final Object deserialize(ok1 ok1) {
        return this.a.deserialize(ok1);
    }

    public final ll6 getDescriptor() {
        return c;
    }

    public final void serialize(j42 j42, Object obj) {
        DatePeriod datePeriod = (DatePeriod) obj;
        datePeriod.getClass();
        this.a.getClass();
        j42.D(datePeriod.toString());
    }
}
