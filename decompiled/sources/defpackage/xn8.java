package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: xn8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xn8 extends a3 {
    public static final Parcelable.Creator<xn8> CREATOR = new ki8(9);
    public boolean A;
    public String B;
    public final zr8 C;
    public long D;
    public zr8 E;
    public final long F;
    public final zr8 G;
    public String w;
    public String x;
    public z89 y;
    public long z;

    public xn8(xn8 xn8) {
        z65.k(xn8);
        this.w = xn8.w;
        this.x = xn8.x;
        this.y = xn8.y;
        this.z = xn8.z;
        this.A = xn8.A;
        this.B = xn8.B;
        this.C = xn8.C;
        this.D = xn8.D;
        this.E = xn8.E;
        this.F = xn8.F;
        this.G = xn8.G;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        h75.F(parcel, 2, this.w);
        h75.F(parcel, 3, this.x);
        h75.E(parcel, 4, this.y, i);
        long j = this.z;
        h75.K(parcel, 5, 8);
        parcel.writeLong(j);
        boolean z2 = this.A;
        h75.K(parcel, 6, 4);
        parcel.writeInt(z2 ? 1 : 0);
        h75.F(parcel, 7, this.B);
        h75.E(parcel, 8, this.C, i);
        long j2 = this.D;
        h75.K(parcel, 9, 8);
        parcel.writeLong(j2);
        h75.E(parcel, 10, this.E, i);
        h75.K(parcel, 11, 8);
        parcel.writeLong(this.F);
        h75.E(parcel, 12, this.G, i);
        h75.O(parcel, M);
    }

    public xn8(String str, String str2, z89 z89, long j, boolean z2, String str3, zr8 zr8, long j2, zr8 zr82, long j3, zr8 zr83) {
        this.w = str;
        this.x = str2;
        this.y = z89;
        this.z = j;
        this.A = z2;
        this.B = str3;
        this.C = zr8;
        this.D = j2;
        this.E = zr82;
        this.F = j3;
        this.G = zr83;
    }
}
