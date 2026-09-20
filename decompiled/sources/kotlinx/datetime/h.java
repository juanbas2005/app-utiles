package kotlinx.datetime;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class h {
    public static final YearMonth a(lf8 lf8, long j) {
        lf8.getClass();
        long j2 = j / 12;
        if ((j ^ 12) < 0 && j2 * 12 != j) {
            j2--;
        }
        r94 r94 = LocalDate.Companion;
        r94.getClass();
        int year = LocalDate.MIN.getYear();
        r94.getClass();
        if (j2 > ((long) LocalDate.MAX.getYear()) || ((long) year) > j2) {
            r94.getClass();
            int year2 = LocalDate.MIN.getYear();
            r94.getClass();
            throw new IllegalArgumentException(("Year " + j2 + " is out of range: " + year2 + ".." + LocalDate.MAX.getYear()).toString());
        }
        long j3 = j % 12;
        return new YearMonth((int) j2, ((int) (j3 + (12 & (((j3 ^ 12) & ((-j3) | j3)) >> 63)))) + 1);
    }

    public static final long b(YearMonth yearMonth) {
        return (((long) yearMonth.getYear()) * 12) + ((long) (yearMonth.getMonthNumber$kotlinx_datetime() - 1));
    }
}
