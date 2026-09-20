package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: u79  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class u79 extends a3 {
    public static final Parcelable.Creator<u79> CREATOR = new g39(11);
    public final String w;
    public final long x;
    public final int y;

    public u79(int i, long j, String str) {
        this.w = str;
        this.x = j;
        this.y = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        h75.F(parcel, 1, this.w);
        h75.K(parcel, 2, 8);
        parcel.writeLong(this.x);
        h75.K(parcel, 3, 4);
        parcel.writeInt(this.y);
        h75.O(parcel, M);
    }
}
