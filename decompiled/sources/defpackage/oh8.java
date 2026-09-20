package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: oh8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class oh8 extends a3 {
    public static final Parcelable.Creator<oh8> CREATOR = new zc5(22);
    public final int w;
    public final m11 x;
    public final th8 y;

    public oh8(int i, m11 m11, th8 th8) {
        this.w = i;
        this.x = m11;
        this.y = th8;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        h75.K(parcel, 1, 4);
        parcel.writeInt(this.w);
        h75.E(parcel, 2, this.x, i);
        h75.E(parcel, 3, this.y, i);
        h75.O(parcel, M);
    }
}
