package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: s29  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class s29 extends a3 {
    public static final Parcelable.Creator<s29> CREATOR = new g39(6);
    public Bundle w;
    public cc2[] x;
    public int y;
    public p11 z;

    public final void writeToParcel(Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        h75.z(parcel, 1, this.w);
        h75.H(parcel, 2, this.x, i);
        int i2 = this.y;
        h75.K(parcel, 3, 4);
        parcel.writeInt(i2);
        h75.E(parcel, 4, this.z, i);
        h75.O(parcel, M);
    }
}
