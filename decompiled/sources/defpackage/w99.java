package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: w99  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class w99 extends a3 {
    public static final Parcelable.Creator<w99> CREATOR = new g39(16);
    public final long A;
    public final boolean w;
    public final String x;
    public final int y;
    public final int z;

    public w99(int i, int i2, long j, String str, boolean z2) {
        this.w = z2;
        this.x = str;
        this.y = i75.q(i) - 1;
        this.z = k75.n(i2) - 1;
        this.A = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        h75.K(parcel, 1, 4);
        parcel.writeInt(this.w ? 1 : 0);
        h75.F(parcel, 2, this.x);
        h75.K(parcel, 3, 4);
        parcel.writeInt(this.y);
        h75.K(parcel, 4, 4);
        parcel.writeInt(this.z);
        h75.K(parcel, 5, 8);
        parcel.writeLong(this.A);
        h75.O(parcel, M);
    }
}
