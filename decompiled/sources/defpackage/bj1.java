package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: bj1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bj1 implements Parcelable {
    public static final Parcelable.Creator<bj1> CREATOR = new ri8(15);
    public final long w;

    public bj1(long j) {
        this.w = j;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof bj1) && this.w == ((bj1) obj).w) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.w)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.w);
    }
}
