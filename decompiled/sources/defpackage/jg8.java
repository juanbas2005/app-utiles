package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: jg8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jg8 extends a3 {
    public static final Parcelable.Creator<jg8> CREATOR = new zc5(19);
    public final boolean A;
    public final int w;
    public final String x;
    public final long y;
    public final int z;

    public jg8(int i, int i2, long j, String str, boolean z2) {
        this.w = i;
        this.x = str;
        this.y = j;
        this.z = i2;
        this.A = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        h75.K(parcel, 1, 4);
        parcel.writeInt(this.w);
        h75.F(parcel, 2, this.x);
        h75.K(parcel, 3, 8);
        parcel.writeLong(this.y);
        h75.K(parcel, 4, 4);
        parcel.writeInt(this.z);
        h75.K(parcel, 5, 4);
        parcel.writeInt(this.A ? 1 : 0);
        h75.O(parcel, M);
    }
}
