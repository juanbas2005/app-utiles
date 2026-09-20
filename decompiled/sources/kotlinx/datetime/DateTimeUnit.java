package kotlinx.datetime;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000f2\u00020\u0001:\u0005\u0010\u0011\u0012\u0013\u0014B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0004¢\u0006\u0004\b\u000b\u0010\u000e\u0001\u0002\u0015\u0016¨\u0006\u0017"}, d2 = {"Lkotlinx/datetime/DateTimeUnit;", "", "<init>", "()V", "", "scalar", "times", "(I)Lkotlinx/datetime/DateTimeUnit;", "value", "", "unit", "formatToString", "(ILjava/lang/String;)Ljava/lang/String;", "", "(JLjava/lang/String;)Ljava/lang/String;", "Companion", "TimeBased", "DateBased", "DayBased", "MonthBased", "kotlinx/datetime/a", "Lkotlinx/datetime/DateTimeUnit$DateBased;", "Lkotlinx/datetime/DateTimeUnit$TimeBased;", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable(with = zi1.class)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class DateTimeUnit {
    /* access modifiers changed from: private */
    public static final MonthBased CENTURY;
    public static final a Companion = new Object();
    /* access modifiers changed from: private */
    public static final DayBased DAY;
    /* access modifiers changed from: private */
    public static final TimeBased HOUR;
    /* access modifiers changed from: private */
    public static final TimeBased MICROSECOND;
    /* access modifiers changed from: private */
    public static final TimeBased MILLISECOND;
    /* access modifiers changed from: private */
    public static final TimeBased MINUTE;
    /* access modifiers changed from: private */
    public static final MonthBased MONTH;
    /* access modifiers changed from: private */
    public static final TimeBased NANOSECOND;
    /* access modifiers changed from: private */
    public static final MonthBased QUARTER;
    /* access modifiers changed from: private */
    public static final TimeBased SECOND;
    /* access modifiers changed from: private */
    public static final DayBased WEEK;
    /* access modifiers changed from: private */
    public static final MonthBased YEAR;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000f¨\u0006\u0017"}, d2 = {"Lkotlinx/datetime/DateTimeUnit$DayBased;", "Lkotlinx/datetime/DateTimeUnit$DateBased;", "", "days", "<init>", "(I)V", "scalar", "times", "(I)Lkotlinx/datetime/DateTimeUnit$DayBased;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "I", "getDays", "Companion", "kotlinx/datetime/c", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable(with = gj1.class)
    /* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
    public static final class DayBased extends DateBased {
        public static final c Companion = new Object();
        private final int days;

        public DayBased(int i) {
            super((hl1) null);
            this.days = i;
            if (i <= 0) {
                h.j(pb4.i(i, "Unit duration must be positive, but was ", " days."));
                throw null;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DayBased) || this.days != ((DayBased) obj).days) {
                return false;
            }
            return true;
        }

        public final int getDays() {
            return this.days;
        }

        public int hashCode() {
            return this.days ^ 65536;
        }

        public DayBased times(int i) {
            return new DayBased(Math.multiplyExact(this.days, i));
        }

        public String toString() {
            int i = this.days;
            if (i % 7 == 0) {
                return formatToString(i / 7, "WEEK");
            }
            return formatToString(i, "DAY");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000f¨\u0006\u0017"}, d2 = {"Lkotlinx/datetime/DateTimeUnit$MonthBased;", "Lkotlinx/datetime/DateTimeUnit$DateBased;", "", "months", "<init>", "(I)V", "scalar", "times", "(I)Lkotlinx/datetime/DateTimeUnit$MonthBased;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "I", "getMonths", "Companion", "kotlinx/datetime/d", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable(with = bm4.class)
    /* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
    public static final class MonthBased extends DateBased {
        public static final d Companion = new Object();
        private final int months;

        public MonthBased(int i) {
            super((hl1) null);
            this.months = i;
            if (i <= 0) {
                h.j(pb4.i(i, "Unit duration must be positive, but was ", " months."));
                throw null;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MonthBased) || this.months != ((MonthBased) obj).months) {
                return false;
            }
            return true;
        }

        public final int getMonths() {
            return this.months;
        }

        public int hashCode() {
            return this.months ^ 131072;
        }

        public MonthBased times(int i) {
            return new MonthBased(Math.multiplyExact(this.months, i));
        }

        public String toString() {
            int i = this.months;
            if (i % 1200 == 0) {
                return formatToString(i / 1200, "CENTURY");
            }
            if (i % 12 == 0) {
                return formatToString(i / 12, "YEAR");
            }
            if (i % 3 == 0) {
                return formatToString(i / 3, "QUARTER");
            }
            return formatToString(i, "MONTH");
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R\u0011\u0010\u001c\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0016¨\u0006\u001f"}, d2 = {"Lkotlinx/datetime/DateTimeUnit$TimeBased;", "Lkotlinx/datetime/DateTimeUnit;", "", "nanoseconds", "<init>", "(J)V", "", "scalar", "times", "(I)Lkotlinx/datetime/DateTimeUnit$TimeBased;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getNanoseconds", "()J", "unitName", "Ljava/lang/String;", "unitScale", "Lu02;", "getDuration-UwyO8pc", "duration", "Companion", "kotlinx/datetime/e", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable(with = di7.class)
    /* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
    public static final class TimeBased extends DateTimeUnit {
        public static final e Companion = new Object();
        private final long nanoseconds;
        private final String unitName;
        private final long unitScale;

        public TimeBased(long j) {
            super((hl1) null);
            this.nanoseconds = j;
            if (j <= 0) {
                h.j(f21.g(j, "Unit duration must be positive, but was ", " ns."));
                throw null;
            } else if (j % 3600000000000L == 0) {
                this.unitName = "HOUR";
                this.unitScale = j / 3600000000000L;
            } else if (j % 60000000000L == 0) {
                this.unitName = "MINUTE";
                this.unitScale = j / 60000000000L;
            } else if (j % 1000000000 == 0) {
                this.unitName = "SECOND";
                this.unitScale = j / 1000000000;
            } else if (j % 1000000 == 0) {
                this.unitName = "MILLISECOND";
                this.unitScale = j / 1000000;
            } else if (j % 1000 == 0) {
                this.unitName = "MICROSECOND";
                this.unitScale = j / 1000;
            } else {
                this.unitName = "NANOSECOND";
                this.unitScale = j;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TimeBased) || this.nanoseconds != ((TimeBased) obj).nanoseconds) {
                return false;
            }
            return true;
        }

        /* renamed from: getDuration-UwyO8pc  reason: not valid java name */
        public final long m53getDurationUwyO8pc() {
            xb4 xb4 = u02.x;
            return gl0.f0(this.nanoseconds, y02.NANOSECONDS);
        }

        public final long getNanoseconds() {
            return this.nanoseconds;
        }

        public int hashCode() {
            long j = this.nanoseconds;
            return ((int) j) ^ ((int) (j >> 32));
        }

        public TimeBased times(int i) {
            return new TimeBased(Math.multiplyExact(this.nanoseconds, (long) i));
        }

        public String toString() {
            return formatToString(this.unitScale, this.unitName);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [kotlinx.datetime.a, java.lang.Object] */
    static {
        TimeBased timeBased = new TimeBased(1);
        NANOSECOND = timeBased;
        TimeBased times = timeBased.times(1000);
        MICROSECOND = times;
        TimeBased times2 = times.times(1000);
        MILLISECOND = times2;
        TimeBased times3 = times2.times(1000);
        SECOND = times3;
        TimeBased times4 = times3.times(60);
        MINUTE = times4;
        HOUR = times4.times(60);
        DayBased dayBased = new DayBased(1);
        DAY = dayBased;
        WEEK = dayBased.times(7);
        MonthBased monthBased = new MonthBased(1);
        MONTH = monthBased;
        QUARTER = monthBased.times(3);
        MonthBased times5 = monthBased.times(12);
        YEAR = times5;
        CENTURY = times5.times(100);
    }

    public /* synthetic */ DateTimeUnit(hl1 hl1) {
        this();
    }

    public final String formatToString(long j, String str) {
        str.getClass();
        if (j == 1) {
            return str;
        }
        return j + '-' + str;
    }

    public abstract DateTimeUnit times(int i);

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lkotlinx/datetime/DateTimeUnit$DateBased;", "Lkotlinx/datetime/DateTimeUnit;", "<init>", "()V", "Companion", "kotlinx/datetime/b", "Lkotlinx/datetime/DateTimeUnit$DayBased;", "Lkotlinx/datetime/DateTimeUnit$MonthBased;", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable(with = of1.class)
    /* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
    public static abstract class DateBased extends DateTimeUnit {
        public static final b Companion = new Object();

        private DateBased() {
            super((hl1) null);
        }

        public /* synthetic */ DateBased(hl1 hl1) {
            this();
        }
    }

    private DateTimeUnit() {
    }

    public final String formatToString(int i, String str) {
        str.getClass();
        if (i == 1) {
            return str;
        }
        return i + '-' + str;
    }
}
