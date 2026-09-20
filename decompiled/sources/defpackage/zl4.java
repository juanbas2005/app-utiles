package defpackage;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: zl4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zl4 implements Comparable, Parcelable {
    public static final Parcelable.Creator<zl4> CREATOR = new ri8(27);
    public final int A;
    public final long B;
    public String C;
    public final Calendar w;
    public final int x;
    public final int y;
    public final int z;

    public zl4(Calendar calendar) {
        calendar.set(5, 1);
        Calendar a = a08.a(calendar);
        this.w = a;
        this.x = a.get(2);
        this.y = a.get(1);
        this.z = a.getMaximum(7);
        this.A = a.getActualMaximum(5);
        this.B = a.getTimeInMillis();
    }

    public static zl4 a(int i, int i2) {
        Calendar c = a08.c((Calendar) null);
        c.set(1, i);
        c.set(2, i2);
        return new zl4(c);
    }

    public static zl4 b(long j) {
        Calendar c = a08.c((Calendar) null);
        c.setTimeInMillis(j);
        return new zl4(c);
    }

    public final String c() {
        if (this.C == null) {
            long timeInMillis = this.w.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = a08.a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.C = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.C;
    }

    public final int compareTo(Object obj) {
        return this.w.compareTo(((zl4) obj).w);
    }

    public final int d(zl4 zl4) {
        if (this.w instanceof GregorianCalendar) {
            return (zl4.x - this.x) + ((zl4.y - this.y) * 12);
        }
        h.q("Only Gregorian calendars are supported.");
        return 0;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl4)) {
            return false;
        }
        zl4 zl4 = (zl4) obj;
        if (this.x == zl4.x && this.y == zl4.y) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.x), Integer.valueOf(this.y)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.y);
        parcel.writeInt(this.x);
    }
}
