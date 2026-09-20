package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: z81  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class z81 implements Parcelable {
    public static final Parcelable.Creator<z81> CREATOR = new ri8(10);
    public final String w;
    public final AtomicLong x;

    public z81(Parcel parcel) {
        this.w = parcel.readString();
        this.x = new AtomicLong(parcel.readLong());
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.w);
        parcel.writeLong(this.x.get());
    }

    public z81(String str) {
        this.w = str;
        this.x = new AtomicLong(0);
    }
}
