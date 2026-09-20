package kotlinx.datetime;

import java.time.LocalDate;
import kotlinx.datetime.DateTimeUnit;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class f {
    public static final long a = LocalDate.MIN.toEpochDay();
    public static final long b = LocalDate.MAX.toEpochDay();

    static {
        LocalDate unused = LocalDate.MIN;
        LocalDate unused2 = LocalDate.MAX;
    }

    public static final LocalDate a(LocalDate localDate, long j, DateTimeUnit.DayBased dayBased) {
        try {
            long addExact = Math.addExact(localDate.getValue$kotlinx_datetime().toEpochDay(), Math.multiplyExact(j, (long) dayBased.getDays()));
            long j2 = a;
            if (addExact > b || j2 > addExact) {
                q94.t();
                throw q94.i("The resulting day " + addExact + " is out of supported LocalDate range.");
            }
            LocalDate l = LocalDate.ofEpochDay(addExact);
            l.getClass();
            return new LocalDate(l);
        } catch (Exception e) {
            if (fb3.p(e) || (e instanceof ArithmeticException)) {
                throw new RuntimeException("The result of adding " + j + " of " + dayBased + " to " + localDate + " is out of LocalDate range.", e);
            }
            throw e;
        }
    }
}
