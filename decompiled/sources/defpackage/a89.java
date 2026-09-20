package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: a89  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class a89 extends a3 {
    public static final Parcelable.Creator<a89> CREATOR = new g39(12);
    public final int A;
    public final long B;
    public String C;
    public final long w;
    public byte[] x;
    public final String y;
    public final Bundle z;

    public a89(long j, byte[] bArr, String str, Bundle bundle, int i, long j2, String str2) {
        this.w = j;
        this.x = bArr;
        this.y = str;
        this.z = bundle;
        this.A = i;
        this.B = j2;
        this.C = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        h75.K(parcel, 1, 8);
        parcel.writeLong(this.w);
        h75.A(parcel, 2, this.x);
        h75.F(parcel, 3, this.y);
        h75.z(parcel, 4, this.z);
        h75.K(parcel, 5, 4);
        parcel.writeInt(this.A);
        h75.K(parcel, 6, 8);
        parcel.writeLong(this.B);
        h75.F(parcel, 7, this.C);
        h75.O(parcel, M);
    }
}
