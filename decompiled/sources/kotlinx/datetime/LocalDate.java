package kotlinx.datetime;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.Month;
import kotlin.Metadata;
import kotlinx.datetime.DateTimeUnit;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 C2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0002DEB\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B!\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\u000bB!\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\rB!\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0000H\u0002¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\"\u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0007H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u0018\u0010,\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0000H\u0002¢\u0006\u0004\b,\u0010-J\r\u0010/\u001a\u00020.¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0007H\u0001¢\u0006\u0004\b/\u0010(R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0004¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b3\u00104R\u001a\u00108\u001a\u00020\u00078FX\u0004¢\u0006\f\u0012\u0004\b6\u00107\u001a\u0004\b5\u0010(R\u001a\u0010\u000f\u001a\u00020\u00078FX\u0004¢\u0006\f\u0012\u0004\b:\u00107\u001a\u0004\b9\u0010(R\u0011\u0010\b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b;\u0010(R\u0011\u0010\t\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010<R\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b=\u0010(R\u0011\u0010@\u001a\u00020>8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010?R\u0011\u0010B\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bA\u0010(¨\u0006F"}, d2 = {"Lkotlinx/datetime/LocalDate;", "", "Ljava/io/Serializable;", "Ljava/time/LocalDate;", "value", "<init>", "(Ljava/time/LocalDate;)V", "", "year", "month", "day", "(III)V", "Lyl4;", "(ILyl4;I)V", "Ljava/time/Month;", "dayOfMonth", "(ILjava/time/Month;I)V", "Ljava/io/ObjectInputStream;", "ois", "Lvs7;", "readObject", "(Ljava/io/ObjectInputStream;)V", "", "writeReplace", "()Ljava/lang/Object;", "getMonth", "()Ljava/time/Month;", "Ljava/time/DayOfWeek;", "getDayOfWeek", "()Ljava/time/DayOfWeek;", "that", "Lkotlinx/datetime/g;", "rangeTo", "(Lkotlinx/datetime/LocalDate;)Lkotlinx/datetime/g;", "rangeUntil", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "compareTo", "(Lkotlinx/datetime/LocalDate;)I", "", "toEpochDays", "()J", "toEpochDaysJvm", "Ljava/time/LocalDate;", "getValue$kotlinx_datetime", "()Ljava/time/LocalDate;", "getMonthNumber", "getMonthNumber$annotations", "()V", "monthNumber", "getDayOfMonth", "getDayOfMonth$annotations", "getYear", "()Lyl4;", "getDay", "Lij1;", "()Lij1;", "dayOfWeek", "getDayOfYear", "dayOfYear", "Companion", "r94", "s94", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable(with = y94.class)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class LocalDate implements Comparable<LocalDate>, java.io.Serializable {
    public static final r94 Companion = new Object();
    /* access modifiers changed from: private */
    public static final LocalDate MAX;
    /* access modifiers changed from: private */
    public static final LocalDate MIN;
    private static final long serialVersionUID = 0;
    private final java.time.LocalDate value;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, r94] */
    static {
        java.time.LocalDate m = java.time.LocalDate.MIN;
        m.getClass();
        MIN = new LocalDate(m);
        java.time.LocalDate w = java.time.LocalDate.MAX;
        w.getClass();
        MAX = new LocalDate(w);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public LocalDate(int i, int i2, int i3) {
        this(r1);
        try {
            java.time.LocalDate of = java.time.LocalDate.of(i, i2, i3);
            of.getClass();
        } catch (DateTimeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("kotlinx.datetime.LocalDate must be deserialized via kotlinx.datetime.Ser");
    }

    private final Object writeReplace() {
        return new kl6(2, this);
    }

    public int compareTo(LocalDate localDate) {
        localDate.getClass();
        return this.value.compareTo(q94.r(localDate.value));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalDate) || !sg3.e(this.value, ((LocalDate) obj).value)) {
            return false;
        }
        return true;
    }

    public final int getDay() {
        return this.value.getDayOfMonth();
    }

    public final int getDayOfMonth() {
        return this.value.getDayOfMonth();
    }

    public final ij1 getDayOfWeek() {
        DayOfWeek j = this.value.getDayOfWeek();
        j.getClass();
        return (ij1) ij1.x.get(j.getValue() - 1);
    }

    public final int getDayOfYear() {
        return this.value.getDayOfYear();
    }

    /* renamed from: getMonth  reason: collision with other method in class */
    public final yl4 m58getMonth() {
        Month n = this.value.getMonth();
        n.getClass();
        return ag8.J(n);
    }

    public final int getMonthNumber() {
        return this.value.getMonthValue();
    }

    public final java.time.LocalDate getValue$kotlinx_datetime() {
        return this.value;
    }

    public final int getYear() {
        return this.value.getYear();
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [w94, kotlinx.datetime.g] */
    public final g rangeTo(LocalDate localDate) {
        localDate.getClass();
        return new w94(this, localDate);
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [w94, kotlinx.datetime.g] */
    public final g rangeUntil(LocalDate localDate) {
        localDate.getClass();
        g gVar = g.z;
        Companion.getClass();
        if (localDate.equals(MIN)) {
            return g.z;
        }
        DateTimeUnit.Companion.getClass();
        DateTimeUnit.DayBased access$getDAY$cp = DateTimeUnit.DAY;
        access$getDAY$cp.getClass();
        return new w94(this, f.a(localDate, -1, access$getDAY$cp));
    }

    public final int toEpochDays() {
        long f = this.value.toEpochDay();
        if (f > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (f < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) f;
    }

    public String toString() {
        String h = this.value.toString();
        h.getClass();
        return h;
    }

    public final Month getMonth() {
        Month n = this.value.getMonth();
        n.getClass();
        return n;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LocalDate(int i, yl4 yl4, int i2) {
        this(i, yl4.ordinal() + 1, i2);
        yl4.getClass();
    }

    public LocalDate(java.time.LocalDate localDate) {
        localDate.getClass();
        this.value = localDate;
    }

    @fq1
    public static /* synthetic */ void getDayOfMonth$annotations() {
    }

    @fq1
    public static /* synthetic */ void getMonthNumber$annotations() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @fq1
    public LocalDate(int i, Month month, int i2) {
        this(i, ag8.J(month), i2);
        month.getClass();
    }

    /* renamed from: getDayOfWeek  reason: collision with other method in class */
    public final DayOfWeek m57getDayOfWeek() {
        DayOfWeek j = this.value.getDayOfWeek();
        j.getClass();
        return j;
    }

    /* renamed from: toEpochDays  reason: collision with other method in class */
    public final long m59toEpochDays() {
        return this.value.toEpochDay();
    }
}
