package kotlinx.datetime;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 K2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0002LMB\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006BE\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\u000fBE\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0010\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\u0011B\u0019\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0005\u0010\u0016BE\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0007H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u0018\u0010)\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0000H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u001fH\u0002¢\u0006\u0004\b0\u00101R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0004¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b3\u00104R\u0011\u0010\b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b5\u0010%R\u001a\u00109\u001a\u00020\u00078FX\u0004¢\u0006\f\u0012\u0004\b7\u00108\u001a\u0004\b6\u0010%R\u0011\u0010\t\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u001a\u0010:R\u001a\u0010\u0018\u001a\u00020\u00078FX\u0004¢\u0006\f\u0012\u0004\b<\u00108\u001a\u0004\b;\u0010%R\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b=\u0010%R\u0011\u0010@\u001a\u00020>8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010?R\u0011\u0010B\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bA\u0010%R\u0011\u0010\u000b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bC\u0010%R\u0011\u0010\f\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bD\u0010%R\u0011\u0010\r\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bE\u0010%R\u0011\u0010\u000e\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bF\u0010%R\u0011\u0010\u0013\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0011\u0010\u0015\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\bI\u0010J¨\u0006N"}, d2 = {"Lkotlinx/datetime/LocalDateTime;", "", "Ljava/io/Serializable;", "Ljava/time/LocalDateTime;", "value", "<init>", "(Ljava/time/LocalDateTime;)V", "", "year", "month", "day", "hour", "minute", "second", "nanosecond", "(IIIIIII)V", "Lyl4;", "(ILyl4;IIIII)V", "Lkotlinx/datetime/LocalDate;", "date", "Lkotlinx/datetime/LocalTime;", "time", "(Lkotlinx/datetime/LocalDate;Lkotlinx/datetime/LocalTime;)V", "Ljava/time/Month;", "dayOfMonth", "(ILjava/time/Month;IIIII)V", "getMonth", "()Ljava/time/Month;", "Ljava/time/DayOfWeek;", "getDayOfWeek", "()Ljava/time/DayOfWeek;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "compareTo", "(Lkotlinx/datetime/LocalDateTime;)I", "Ljava/io/ObjectInputStream;", "ois", "Lvs7;", "readObject", "(Ljava/io/ObjectInputStream;)V", "writeReplace", "()Ljava/lang/Object;", "Ljava/time/LocalDateTime;", "getValue$kotlinx_datetime", "()Ljava/time/LocalDateTime;", "getYear", "getMonthNumber", "getMonthNumber$annotations", "()V", "monthNumber", "()Lyl4;", "getDayOfMonth", "getDayOfMonth$annotations", "getDay", "Lij1;", "()Lij1;", "dayOfWeek", "getDayOfYear", "dayOfYear", "getHour", "getMinute", "getSecond", "getNanosecond", "getDate", "()Lkotlinx/datetime/LocalDate;", "getTime", "()Lkotlinx/datetime/LocalTime;", "Companion", "z94", "aa4", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable(with = ea4.class)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class LocalDateTime implements Comparable<LocalDateTime>, java.io.Serializable {
    public static final z94 Companion = new Object();
    /* access modifiers changed from: private */
    public static final LocalDateTime MAX;
    /* access modifiers changed from: private */
    public static final LocalDateTime MIN;
    private static final long serialVersionUID = 0;
    private final java.time.LocalDateTime value;

    /* JADX WARNING: type inference failed for: r0v0, types: [z94, java.lang.Object] */
    static {
        java.time.LocalDateTime n = java.time.LocalDateTime.MIN;
        n.getClass();
        MIN = new LocalDateTime(n);
        java.time.LocalDateTime w = java.time.LocalDateTime.MAX;
        w.getClass();
        MAX = new LocalDateTime(w);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public LocalDateTime(LocalDate localDate, LocalTime localTime) {
        this(r1);
        localDate.getClass();
        localTime.getClass();
        java.time.LocalDateTime o = java.time.LocalDateTime.of(localDate.getValue$kotlinx_datetime(), localTime.getValue$kotlinx_datetime());
        o.getClass();
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("kotlinx.datetime.LocalDateTime must be deserialized via kotlinx.datetime.Ser");
    }

    private final Object writeReplace() {
        return new kl6(4, this);
    }

    public int compareTo(LocalDateTime localDateTime) {
        localDateTime.getClass();
        return this.value.compareTo(q94.s(localDateTime.value));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalDateTime) || !sg3.e(this.value, ((LocalDateTime) obj).value)) {
            return false;
        }
        return true;
    }

    public final LocalDate getDate() {
        LocalDate m = this.value.toLocalDate();
        m.getClass();
        return new LocalDate(m);
    }

    public final int getDay() {
        return this.value.getDayOfMonth();
    }

    public final int getDayOfMonth() {
        return this.value.getDayOfMonth();
    }

    public final ij1 getDayOfWeek() {
        DayOfWeek k = this.value.getDayOfWeek();
        k.getClass();
        return (ij1) ij1.x.get(k.getValue() - 1);
    }

    public final int getDayOfYear() {
        return this.value.getDayOfYear();
    }

    public final int getHour() {
        return this.value.getHour();
    }

    public final int getMinute() {
        return this.value.getMinute();
    }

    /* renamed from: getMonth  reason: collision with other method in class */
    public final yl4 m61getMonth() {
        Month q = this.value.getMonth();
        q.getClass();
        return ag8.J(q);
    }

    public final int getMonthNumber() {
        return this.value.getMonthValue();
    }

    public final int getNanosecond() {
        return this.value.getNano();
    }

    public final int getSecond() {
        return this.value.getSecond();
    }

    public final LocalTime getTime() {
        LocalTime p = this.value.toLocalTime();
        p.getClass();
        return new LocalTime(p);
    }

    public final java.time.LocalDateTime getValue$kotlinx_datetime() {
        return this.value;
    }

    public final int getYear() {
        return this.value.getYear();
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        String g = this.value.toString();
        g.getClass();
        return g;
    }

    public final Month getMonth() {
        Month q = this.value.getMonth();
        q.getClass();
        return q;
    }

    @fq1
    public static /* synthetic */ void getDayOfMonth$annotations() {
    }

    @fq1
    public static /* synthetic */ void getMonthNumber$annotations() {
    }

    /* renamed from: getDayOfWeek  reason: collision with other method in class */
    public final DayOfWeek m60getDayOfWeek() {
        DayOfWeek k = this.value.getDayOfWeek();
        k.getClass();
        return k;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LocalDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, hl1 hl1) {
        this(i, i2, i3, i4, i5, (i8 & 32) != 0 ? 0 : i6, (i8 & 64) != 0 ? 0 : i7);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public LocalDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this(r2);
        try {
            java.time.LocalDateTime of = java.time.LocalDateTime.of(i, i2, i3, i4, i5, i6, i7);
            of.getClass();
        } catch (DateTimeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LocalDateTime(int i, yl4 yl4, int i2, int i3, int i4, int i5, int i6, int i7, hl1 hl1) {
        this(i, yl4, i2, i3, i4, (i7 & 32) != 0 ? 0 : i5, (i7 & 64) != 0 ? 0 : i6);
    }

    public LocalDateTime(java.time.LocalDateTime localDateTime) {
        localDateTime.getClass();
        this.value = localDateTime;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LocalDateTime(int i, Month month, int i2, int i3, int i4, int i5, int i6, int i7, hl1 hl1) {
        this(i, month, i2, i3, i4, (i7 & 32) != 0 ? 0 : i5, (i7 & 64) != 0 ? 0 : i6);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @fq1
    public LocalDateTime(int i, Month month, int i2, int i3, int i4, int i5, int i6) {
        this(i, ag8.J(month), i2, i3, i4, i5, i6);
        month.getClass();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LocalDateTime(int i, yl4 yl4, int i2, int i3, int i4, int i5, int i6) {
        this(i, yl4.ordinal() + 1, i2, i3, i4, i5, i6);
        yl4.getClass();
    }
}
