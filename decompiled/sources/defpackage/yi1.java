package defpackage;

import kotlinx.datetime.DateTimePeriod;

/* renamed from: yi1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yi1 implements zr3 {
    public static final yi1 b = new yi1();
    public static final po5 c = b85.b("kotlinx.datetime.DateTimePeriod");
    public final /* synthetic */ xi1 a = xi1.a;

    public final Object deserialize(ok1 ok1) {
        this.a.getClass();
        vi1 vi1 = DateTimePeriod.Companion;
        String t = ok1.t();
        vi1.getClass();
        return vi1.a(t);
    }

    public final ll6 getDescriptor() {
        return c;
    }

    public final void serialize(j42 j42, Object obj) {
        DateTimePeriod dateTimePeriod = (DateTimePeriod) obj;
        dateTimePeriod.getClass();
        this.a.getClass();
        j42.D(dateTimePeriod.toString());
    }
}
