package kotlinx.datetime;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0010R\u0014\u0010\u0018\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0010R\u0014\u0010\u001a\u001a\u00020\u00028PX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\r¨\u0006\u001d"}, d2 = {"Lkotlinx/datetime/DatePeriod;", "Lkotlinx/datetime/DateTimePeriod;", "", "totalMonths", "", "days", "<init>", "(JI)V", "years", "months", "(III)V", "J", "getTotalMonths$kotlinx_datetime", "()J", "I", "getDays", "()I", "getHours", "hours", "getMinutes", "minutes", "getSeconds", "seconds", "getNanoseconds", "nanoseconds", "getTotalNanoseconds$kotlinx_datetime", "totalNanoseconds", "Companion", "fg1", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable(with = hg1.class)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class DatePeriod extends DateTimePeriod {
    public static final fg1 Companion = new Object();
    private final int days;
    private final long totalMonths;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DatePeriod(int i, int i2, int i3, int i4, hl1 hl1) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }

    public int getDays() {
        return this.days;
    }

    public int getHours() {
        return 0;
    }

    public int getMinutes() {
        return 0;
    }

    public int getNanoseconds() {
        return 0;
    }

    public int getSeconds() {
        return 0;
    }

    public long getTotalMonths$kotlinx_datetime() {
        return this.totalMonths;
    }

    public long getTotalNanoseconds$kotlinx_datetime() {
        return 0;
    }

    public DatePeriod(long j, int i) {
        super((hl1) null);
        this.totalMonths = j;
        this.days = i;
    }

    public DatePeriod(int i, int i2, int i3) {
        this(pd8.P(i, i2), i3);
    }
}
