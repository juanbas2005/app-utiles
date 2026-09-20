package defpackage;

import kotlinx.datetime.YearMonth;

/* renamed from: uf8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class uf8 implements zr3 {
    public static final uf8 a = new Object();
    public static final po5 b = b85.b("kotlinx.datetime.YearMonth");

    public final Object deserialize(ok1 ok1) {
        return lf8.a(YearMonth.Companion, ok1.t());
    }

    public final ll6 getDescriptor() {
        return b;
    }

    public final void serialize(j42 j42, Object obj) {
        YearMonth yearMonth = (YearMonth) obj;
        yearMonth.getClass();
        j42.D(yearMonth.toString());
    }
}
