package defpackage;

import kotlinx.datetime.LocalTime;
import kotlinx.datetime.UtcOffset;

/* renamed from: ki1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ki1 {
    public static final kw5 b = new kw5(25);
    public final li1 a;

    static {
        Class<ki1> cls = ki1.class;
        qp4 qp4 = new qp4(cls, "monthNumber", "getMonthNumber()Ljava/lang/Integer;", 0);
        c26 c26 = b26.a;
        c26.f(qp4);
        c26.f(new qp4(cls, "day", "getDay()Ljava/lang/Integer;", 0));
        c26.f(new qp4(cls, "dayOfMonth", "getDayOfMonth()Ljava/lang/Integer;", 0));
        c26.f(new qp4(cls, "dayOfYear", "getDayOfYear()Ljava/lang/Integer;", 0));
        c26.f(new qp4(cls, "hour", "getHour()Ljava/lang/Integer;", 0));
        c26.f(new qp4(cls, "hourOfAmPm", "getHourOfAmPm()Ljava/lang/Integer;", 0));
        c26.f(new qp4(cls, "minute", "getMinute()Ljava/lang/Integer;", 0));
        c26.f(new qp4(cls, "second", "getSecond()Ljava/lang/Integer;", 0));
        c26.f(new qp4(cls, "offsetHours", "getOffsetHours()Ljava/lang/Integer;", 0));
        c26.f(new qp4(cls, "offsetMinutesOfHour", "getOffsetMinutesOfHour()Ljava/lang/Integer;", 0));
        c26.f(new qp4(cls, "offsetSecondsOfMinute", "getOffsetSecondsOfMinute()Ljava/lang/Integer;", 0));
    }

    public ki1(li1 li1) {
        li1.getClass();
        this.a = li1;
    }

    public static qd3 a(ki1 ki1) {
        int i;
        ki1.getClass();
        li1 li1 = ki1.a;
        fa3 fa3 = li1.c;
        ba3 ba3 = li1.a;
        da3 da3 = li1.b;
        UtcOffset a2 = fa3.a();
        LocalTime d = da3.d();
        ba3 a3 = ba3.copy();
        ga3 ga3 = a3.a;
        Integer num = ga3.a;
        rf8.a("year", num);
        ga3.a = Integer.valueOf(num.intValue() % 10000);
        try {
            Integer num2 = ba3.a.a;
            num2.getClass();
            long addExact = Math.addExact(Math.multiplyExact((long) (num2.intValue() / 10000), 315569520000L), ((a3.b().toEpochDays() * 86400) + ((long) d.toSecondOfDay())) - ((long) a2.getTotalSeconds()));
            qd3 qd3 = qd3.y;
            Integer num3 = da3.f;
            if (num3 != null) {
                i = num3.intValue();
            } else {
                i = 0;
            }
            qd3 i2 = tz2.i(addExact, (long) i);
            if (i2.w == addExact) {
                return i2;
            }
            throw new IllegalArgumentException("The parsed date is outside the range representable by Instant");
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("The parsed date is outside the range representable by Instant", e);
        }
    }
}
