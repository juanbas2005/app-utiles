package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ar0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ar0 extends a3 {
    public static final Parcelable.Creator<ar0> CREATOR = new ri8(6);
    public final boolean w;

    public ar0(boolean z) {
        this.w = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int M = h75.M(parcel, 20293);
        h75.K(parcel, 1, 4);
        parcel.writeInt(this.w ? 1 : 0);
        h75.O(parcel, M);
    }
}
