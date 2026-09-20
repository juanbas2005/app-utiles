package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: lm8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lm8 extends a3 {
    public static final Parcelable.Creator<lm8> CREATOR = new ki8(7);
    public final long w;
    public final int x;
    public final long y;

    public lm8(int i, long j, long j2) {
        this.w = j;
        this.x = i;
        this.y = j2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        h75.K(parcel, 1, 8);
        parcel.writeLong(this.w);
        h75.K(parcel, 2, 4);
        parcel.writeInt(this.x);
        h75.K(parcel, 3, 8);
        parcel.writeLong(this.y);
        h75.O(parcel, M);
    }
}
