package kotlinx.datetime;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.time.DateTimeException;
import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001-B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B-\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0016J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010\u0016J\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010'R\u0011\u0010\b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b(\u0010\u0016R\u0011\u0010\t\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b)\u0010\u0016R\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b*\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b+\u0010\u0016¨\u0006."}, d2 = {"Lkotlinx/datetime/LocalTime;", "", "Ljava/io/Serializable;", "Ljava/time/LocalTime;", "value", "<init>", "(Ljava/time/LocalTime;)V", "", "hour", "minute", "second", "nanosecond", "(IIII)V", "Ljava/io/ObjectInputStream;", "ois", "Lvs7;", "readObject", "(Ljava/io/ObjectInputStream;)V", "", "writeReplace", "()Ljava/lang/Object;", "toSecondOfDay", "()I", "toMillisecondOfDay", "", "toNanosecondOfDay", "()J", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "compareTo", "(Lkotlinx/datetime/LocalTime;)I", "Ljava/time/LocalTime;", "getValue$kotlinx_datetime", "()Ljava/time/LocalTime;", "getHour", "getMinute", "getSecond", "getNanosecond", "Companion", "qa4", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable(with = ua4.class)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class LocalTime implements Comparable<LocalTime>, java.io.Serializable {
    public static final qa4 Companion = new Object();
    /* access modifiers changed from: private */
    public static final LocalTime MAX;
    /* access modifiers changed from: private */
    public static final LocalTime MIN;
    private static final long serialVersionUID = 0;
    private final java.time.LocalTime value;

    /* JADX WARNING: type inference failed for: r0v0, types: [qa4, java.lang.Object] */
    static {
        java.time.LocalTime n = java.time.LocalTime.MIN;
        n.getClass();
        MIN = new LocalTime(n);
        java.time.LocalTime y = java.time.LocalTime.MAX;
        y.getClass();
        MAX = new LocalTime(y);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public LocalTime(int i, int i2, int i3, int i4) {
        this(r1);
        try {
            java.time.LocalTime of = java.time.LocalTime.of(i, i2, i3, i4);
            of.getClass();
        } catch (DateTimeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("kotlinx.datetime.LocalTime must be deserialized via kotlinx.datetime.Ser");
    }

    private final Object writeReplace() {
        return new kl6(3, this);
    }

    public int compareTo(LocalTime localTime) {
        localTime.getClass();
        return this.value.compareTo(localTime.value);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalTime) || !sg3.e(this.value, ((LocalTime) obj).value)) {
            return false;
        }
        return true;
    }

    public final int getHour() {
        return this.value.getHour();
    }

    public final int getMinute() {
        return this.value.getMinute();
    }

    public final int getNanosecond() {
        return this.value.getNano();
    }

    public final int getSecond() {
        return this.value.getSecond();
    }

    public final java.time.LocalTime getValue$kotlinx_datetime() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public final int toMillisecondOfDay() {
        return (int) (this.value.toNanoOfDay() / 1000000);
    }

    public final long toNanosecondOfDay() {
        return this.value.toNanoOfDay();
    }

    public final int toSecondOfDay() {
        return this.value.toSecondOfDay();
    }

    public String toString() {
        String h = this.value.toString();
        h.getClass();
        return h;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LocalTime(int i, int i2, int i3, int i4, int i5, hl1 hl1) {
        this(i, i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
    }

    public LocalTime(java.time.LocalTime localTime) {
        localTime.getClass();
        this.value = localTime;
    }
}
