package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* renamed from: ui7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ui7 implements Parcelable {
    public static final Parcelable.Creator<ui7> CREATOR = new zc5(13);
    public long w;
    public long x;

    public ui7() {
        this(e(), a());
    }

    public static long a() {
        return SystemClock.elapsedRealtimeNanos() / 1000;
    }

    public static long e() {
        return TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
    }

    public final long b() {
        return new ui7().x - this.x;
    }

    public final long c(ui7 ui7) {
        return ui7.x - this.x;
    }

    public final void d() {
        this.w = e();
        this.x = a();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.w);
        parcel.writeLong(this.x);
    }

    public ui7(long j, long j2) {
        this.w = j;
        this.x = j2;
    }
}
