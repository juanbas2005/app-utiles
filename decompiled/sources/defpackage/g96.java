package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: g96  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class g96 extends a3 {
    public static final Parcelable.Creator<g96> CREATOR = new ki8(8);
    public final int A;
    public final int w;
    public final boolean x;
    public final boolean y;
    public final int z;

    public g96(int i, boolean z2, boolean z3, int i2, int i3) {
        this.w = i;
        this.x = z2;
        this.y = z3;
        this.z = i2;
        this.A = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        h75.K(parcel, 1, 4);
        parcel.writeInt(this.w);
        h75.K(parcel, 2, 4);
        parcel.writeInt(this.x ? 1 : 0);
        h75.K(parcel, 3, 4);
        parcel.writeInt(this.y ? 1 : 0);
        h75.K(parcel, 4, 4);
        parcel.writeInt(this.z);
        h75.K(parcel, 5, 4);
        parcel.writeInt(this.A);
        h75.O(parcel, M);
    }
}
