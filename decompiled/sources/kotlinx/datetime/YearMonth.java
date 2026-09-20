package kotlinx.datetime;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;
import kotlin.Metadata;
import kotlinx.datetime.DateTimeUnit;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001:B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u000b¢\u0006\u0004\b\u0005\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u0018\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0007H\u0016¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010'R\u0011\u0010\b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b(\u0010$R\u0014\u0010*\u001a\u00020\u00078@X\u0004¢\u0006\u0006\u001a\u0004\b)\u0010$R\u0011\u0010\t\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u00100\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u00102\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\b1\u0010/R\u0011\u00104\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b3\u0010$R\u0011\u00108\u001a\u0002058F¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006;"}, d2 = {"Lkotlinx/datetime/YearMonth;", "", "Ljava/io/Serializable;", "Ljava/time/YearMonth;", "value", "<init>", "(Ljava/time/YearMonth;)V", "", "year", "month", "(II)V", "Lyl4;", "(ILyl4;)V", "Ljava/io/ObjectInputStream;", "ois", "Lvs7;", "readObject", "(Ljava/io/ObjectInputStream;)V", "", "writeReplace", "()Ljava/lang/Object;", "that", "Lkotlinx/datetime/i;", "rangeTo", "(Lkotlinx/datetime/YearMonth;)Lkotlinx/datetime/i;", "rangeUntil", "other", "compareTo", "(Lkotlinx/datetime/YearMonth;)I", "", "toString", "()Ljava/lang/String;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Ljava/time/YearMonth;", "getValue$kotlinx_datetime", "()Ljava/time/YearMonth;", "getYear", "getMonthNumber$kotlinx_datetime", "monthNumber", "getMonth", "()Lyl4;", "Lkotlinx/datetime/LocalDate;", "getFirstDay", "()Lkotlinx/datetime/LocalDate;", "firstDay", "getLastDay", "lastDay", "getNumberOfDays", "numberOfDays", "Lkotlinx/datetime/g;", "getDays", "()Lkotlinx/datetime/g;", "days", "Companion", "lf8", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable(with = uf8.class)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class YearMonth implements Comparable<YearMonth>, java.io.Serializable {
    public static final lf8 Companion = new Object();
    private static final long serialVersionUID = 0;
    private final java.time.YearMonth value;

    /* JADX WARNING: Illegal instructions before constructor call */
    public YearMonth(int i, yl4 yl4) {
        this(r1);
        yl4.getClass();
        try {
            Month of = Month.of(yl4.ordinal() + 1);
            of.getClass();
            java.time.YearMonth of2 = java.time.YearMonth.of(i, of);
            of2.getClass();
        } catch (DateTimeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("kotlinx.datetime.YearMonth must be deserialized via kotlinx.datetime.Ser");
    }

    private final Object writeReplace() {
        return new kl6(11, this);
    }

    public int compareTo(YearMonth yearMonth) {
        yearMonth.getClass();
        return this.value.compareTo(yearMonth.value);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YearMonth) || !sg3.e(this.value, ((YearMonth) obj).value)) {
            return false;
        }
        return true;
    }

    public final g getDays() {
        return getFirstDay().rangeTo(getLastDay());
    }

    public final LocalDate getFirstDay() {
        LocalDate m = this.value.atDay(1);
        m.getClass();
        return new LocalDate(m);
    }

    public final LocalDate getLastDay() {
        LocalDate d = this.value.atEndOfMonth();
        d.getClass();
        return new LocalDate(d);
    }

    public final yl4 getMonth() {
        Month e = this.value.getMonth();
        e.getClass();
        return ag8.J(e);
    }

    public final int getMonthNumber$kotlinx_datetime() {
        return this.value.getMonthValue();
    }

    public final int getNumberOfDays() {
        return this.value.lengthOfMonth();
    }

    public final java.time.YearMonth getValue$kotlinx_datetime() {
        return this.value;
    }

    public final int getYear() {
        return this.value.getYear();
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [tf8, kotlinx.datetime.i] */
    public final i rangeTo(YearMonth yearMonth) {
        yearMonth.getClass();
        return new tf8(this, yearMonth);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [tf8, kotlinx.datetime.i] */
    public final i rangeUntil(YearMonth yearMonth) {
        yearMonth.getClass();
        i iVar = i.z;
        lf8 lf8 = Companion;
        lf8.getClass();
        LocalDate.Companion.getClass();
        LocalDate access$getMIN$cp = LocalDate.MIN;
        access$getMIN$cp.getClass();
        if (yearMonth.equals(new YearMonth(access$getMIN$cp.getYear(), access$getMIN$cp.getMonth()))) {
            return i.z;
        }
        DateTimeUnit.Companion.getClass();
        DateTimeUnit.MonthBased access$getMONTH$cp = DateTimeUnit.MONTH;
        access$getMONTH$cp.getClass();
        try {
            long multiplyExact = Math.multiplyExact(-1, (long) access$getMONTH$cp.getMonths());
            if (multiplyExact != 0) {
                yearMonth = h.a(lf8, Math.addExact(h.b(yearMonth), multiplyExact));
            }
            return new tf8(this, yearMonth);
        } catch (ArithmeticException e) {
            throw new RuntimeException("Arithmetic overflow when adding -1 of " + access$getMONTH$cp + " to " + yearMonth, e);
        } catch (IllegalArgumentException e2) {
            throw new RuntimeException("Boundaries of YearMonth exceeded when adding -1 of " + access$getMONTH$cp + " to " + yearMonth, e2);
        }
    }

    public String toString() {
        String c = pc7.s(sf8.a.getValue()).format(h08.i(this.value));
        c.getClass();
        return c;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public YearMonth(int i, int i2) {
        this(r1);
        try {
            java.time.YearMonth of = java.time.YearMonth.of(i, i2);
            of.getClass();
        } catch (DateTimeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public YearMonth(java.time.YearMonth yearMonth) {
        yearMonth.getClass();
        this.value = yearMonth;
    }
}
