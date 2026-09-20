package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: iv8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class iv8 extends a3 {
    public static final Parcelable.Creator<iv8> CREATOR = new ki8(21);
    public final String A;
    public final long w;
    public final long x;
    public final boolean y;
    public final Bundle z;

    public iv8(long j, long j2, boolean z2, Bundle bundle, String str) {
        this.w = j;
        this.x = j2;
        this.y = z2;
        this.z = bundle;
        this.A = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        h75.K(parcel, 1, 8);
        parcel.writeLong(this.w);
        h75.K(parcel, 2, 8);
        parcel.writeLong(this.x);
        h75.K(parcel, 3, 4);
        parcel.writeInt(this.y ? 1 : 0);
        h75.z(parcel, 7, this.z);
        h75.F(parcel, 8, this.A);
        h75.O(parcel, M);
    }
}
