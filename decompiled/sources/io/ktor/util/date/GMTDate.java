package io.ktor.util.date;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\b\u0018\u0000 F2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002GHBO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010Bg\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJ\u0010\u0010\"\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b%\u0010&Jj\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u0018\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u001bJ\u001a\u0010.\u001a\u00020-2\b\u0010\u0015\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/J'\u00108\u001a\u0002052\u0006\u00100\u001a\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0001¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00109\u001a\u0004\b;\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b<\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010=\u001a\u0004\b>\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b?\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b@\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010A\u001a\u0004\bB\u0010#R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\bC\u0010\u001bR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010D\u001a\u0004\bE\u0010&¨\u0006I"}, d2 = {"Lio/ktor/util/date/GMTDate;", "", "", "seconds", "minutes", "hours", "Ls88;", "dayOfWeek", "dayOfMonth", "dayOfYear", "Lxl4;", "month", "year", "", "timestamp", "<init>", "(IIILs88;IILxl4;IJ)V", "seen0", "Lrl6;", "serializationConstructorMarker", "(IIIILs88;IILxl4;IJLrl6;)V", "other", "compareTo", "(Lio/ktor/util/date/GMTDate;)I", "copy", "()Lio/ktor/util/date/GMTDate;", "component1", "()I", "component2", "component3", "component4", "()Ls88;", "component5", "component6", "component7", "()Lxl4;", "component8", "component9", "()J", "(IIILs88;IILxl4;IJ)Lio/ktor/util/date/GMTDate;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$ktor_utils", "(Lio/ktor/util/date/GMTDate;Lhy0;Lll6;)V", "write$Self", "I", "getSeconds", "getMinutes", "getHours", "Ls88;", "getDayOfWeek", "getDayOfMonth", "getDayOfYear", "Lxl4;", "getMonth", "getYear", "J", "getTimestamp", "Companion", "rt2", "qt2", "ktor-utils"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class GMTDate implements Comparable<GMTDate> {
    /* access modifiers changed from: private */
    public static final nz3[] $childSerializers;
    public static final rt2 Companion = new Object();
    /* access modifiers changed from: private */
    public static final GMTDate START = eg1.b(0L);
    private final int dayOfMonth;
    private final s88 dayOfWeek;
    private final int dayOfYear;
    private final int hours;
    private final int minutes;
    private final xl4 month;
    private final int seconds;
    private final long timestamp;
    private final int year;

    /* JADX WARNING: type inference failed for: r0v0, types: [rt2, java.lang.Object] */
    static {
        nf1 nf1 = new nf1(15);
        i44 i44 = i44.w;
        $childSerializers = new nz3[]{null, null, null, rg3.y(i44, nf1), null, null, rg3.y(i44, new nf1(16)), null, null};
    }

    public /* synthetic */ GMTDate(int i, int i2, int i3, int i4, s88 s88, int i5, int i6, xl4 xl4, int i7, long j, rl6 rl6) {
        if (511 == (i & 511)) {
            this.seconds = i2;
            this.minutes = i3;
            this.hours = i4;
            this.dayOfWeek = s88;
            this.dayOfMonth = i5;
            this.dayOfYear = i6;
            this.month = xl4;
            this.year = i7;
            this.timestamp = j;
            return;
        }
        wn6.x(i, 511, qt2.a.getDescriptor());
        throw null;
    }

    /* access modifiers changed from: private */
    public static final zr3 _childSerializers$_anonymous_() {
        s88[] values = s88.values();
        values.getClass();
        return new a62("io.ktor.util.date.WeekDay", (Enum[]) values);
    }

    /* access modifiers changed from: private */
    public static final zr3 _childSerializers$_anonymous_$0() {
        xl4[] values = xl4.values();
        values.getClass();
        return new a62("io.ktor.util.date.Month", (Enum[]) values);
    }

    public static /* synthetic */ GMTDate copy$default(GMTDate gMTDate, int i, int i2, int i3, s88 s88, int i4, int i5, xl4 xl4, int i6, long j, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i = gMTDate.seconds;
        }
        if ((i7 & 2) != 0) {
            i2 = gMTDate.minutes;
        }
        if ((i7 & 4) != 0) {
            i3 = gMTDate.hours;
        }
        if ((i7 & 8) != 0) {
            s88 = gMTDate.dayOfWeek;
        }
        if ((i7 & 16) != 0) {
            i4 = gMTDate.dayOfMonth;
        }
        if ((i7 & 32) != 0) {
            i5 = gMTDate.dayOfYear;
        }
        if ((i7 & 64) != 0) {
            xl4 = gMTDate.month;
        }
        if ((i7 & 128) != 0) {
            i6 = gMTDate.year;
        }
        if ((i7 & 256) != 0) {
            j = gMTDate.timestamp;
        }
        long j2 = j;
        xl4 xl42 = xl4;
        int i8 = i6;
        int i9 = i4;
        int i10 = i5;
        s88 s882 = s88;
        int i11 = i2;
        return gMTDate.copy(i, i11, i3, s882, i9, i10, xl42, i8, j2);
    }

    public static final /* synthetic */ void write$Self$ktor_utils(GMTDate gMTDate, hy0 hy0, ll6 ll6) {
        nz3[] nz3Arr = $childSerializers;
        hy0.w(0, gMTDate.seconds, ll6);
        hy0.w(1, gMTDate.minutes, ll6);
        hy0.w(2, gMTDate.hours, ll6);
        hy0.o(ll6, 3, (zr3) nz3Arr[3].getValue(), gMTDate.dayOfWeek);
        hy0.w(4, gMTDate.dayOfMonth, ll6);
        hy0.w(5, gMTDate.dayOfYear, ll6);
        hy0.o(ll6, 6, (zr3) nz3Arr[6].getValue(), gMTDate.month);
        hy0.w(7, gMTDate.year, ll6);
        hy0.j(ll6, 8, gMTDate.timestamp);
    }

    public int compareTo(GMTDate gMTDate) {
        gMTDate.getClass();
        return sg3.l(this.timestamp, gMTDate.timestamp);
    }

    public final int component1() {
        return this.seconds;
    }

    public final int component2() {
        return this.minutes;
    }

    public final int component3() {
        return this.hours;
    }

    public final s88 component4() {
        return this.dayOfWeek;
    }

    public final int component5() {
        return this.dayOfMonth;
    }

    public final int component6() {
        return this.dayOfYear;
    }

    public final xl4 component7() {
        return this.month;
    }

    public final int component8() {
        return this.year;
    }

    public final long component9() {
        return this.timestamp;
    }

    public final GMTDate copy(int i, int i2, int i3, s88 s88, int i4, int i5, xl4 xl4, int i6, long j) {
        s88.getClass();
        xl4.getClass();
        return new GMTDate(i, i2, i3, s88, i4, i5, xl4, i6, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GMTDate)) {
            return false;
        }
        GMTDate gMTDate = (GMTDate) obj;
        if (this.seconds == gMTDate.seconds && this.minutes == gMTDate.minutes && this.hours == gMTDate.hours && this.dayOfWeek == gMTDate.dayOfWeek && this.dayOfMonth == gMTDate.dayOfMonth && this.dayOfYear == gMTDate.dayOfYear && this.month == gMTDate.month && this.year == gMTDate.year && this.timestamp == gMTDate.timestamp) {
            return true;
        }
        return false;
    }

    public final int getDayOfMonth() {
        return this.dayOfMonth;
    }

    public final s88 getDayOfWeek() {
        return this.dayOfWeek;
    }

    public final int getDayOfYear() {
        return this.dayOfYear;
    }

    public final int getHours() {
        return this.hours;
    }

    public final int getMinutes() {
        return this.minutes;
    }

    public final xl4 getMonth() {
        return this.month;
    }

    public final int getSeconds() {
        return this.seconds;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final int getYear() {
        return this.year;
    }

    public int hashCode() {
        int e = f21.e(this.hours, f21.e(this.minutes, Integer.hashCode(this.seconds) * 31, 31), 31);
        int e2 = f21.e(this.dayOfYear, f21.e(this.dayOfMonth, (this.dayOfWeek.hashCode() + e) * 31, 31), 31);
        return Long.hashCode(this.timestamp) + f21.e(this.year, (this.month.hashCode() + e2) * 31, 31);
    }

    public String toString() {
        return "GMTDate(seconds=" + this.seconds + ", minutes=" + this.minutes + ", hours=" + this.hours + ", dayOfWeek=" + this.dayOfWeek + ", dayOfMonth=" + this.dayOfMonth + ", dayOfYear=" + this.dayOfYear + ", month=" + this.month + ", year=" + this.year + ", timestamp=" + this.timestamp + ')';
    }

    public final GMTDate copy() {
        return eg1.b((Long) null);
    }

    public GMTDate(int i, int i2, int i3, s88 s88, int i4, int i5, xl4 xl4, int i6, long j) {
        s88.getClass();
        xl4.getClass();
        this.seconds = i;
        this.minutes = i2;
        this.hours = i3;
        this.dayOfWeek = s88;
        this.dayOfMonth = i4;
        this.dayOfYear = i5;
        this.month = xl4;
        this.year = i6;
        this.timestamp = j;
    }
}
