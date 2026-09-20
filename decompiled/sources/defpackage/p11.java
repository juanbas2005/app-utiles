package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: p11  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class p11 extends a3 {
    public static final Parcelable.Creator<p11> CREATOR = new g39(8);
    public final int A;
    public final int[] B;
    public final g96 w;
    public final boolean x;
    public final boolean y;
    public final int[] z;

    public p11(g96 g96, boolean z2, boolean z3, int[] iArr, int i, int[] iArr2) {
        this.w = g96;
        this.x = z2;
        this.y = z3;
        this.z = iArr;
        this.A = i;
        this.B = iArr2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        h75.E(parcel, 1, this.w, i);
        h75.K(parcel, 2, 4);
        parcel.writeInt(this.x ? 1 : 0);
        h75.K(parcel, 3, 4);
        parcel.writeInt(this.y ? 1 : 0);
        h75.D(parcel, 4, this.z);
        h75.K(parcel, 5, 4);
        parcel.writeInt(this.A);
        h75.D(parcel, 6, this.B);
        h75.O(parcel, M);
    }
}
