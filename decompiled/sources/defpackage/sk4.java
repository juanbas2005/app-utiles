package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: sk4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sk4 extends a3 {
    public static final Parcelable.Creator<sk4> CREATOR = new zc5(23);
    public final long A;
    public final String B;
    public final String C;
    public final int D;
    public final int E;
    public final int w;
    public final int x;
    public final int y;
    public final long z;

    public sk4(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.w = i;
        this.x = i2;
        this.y = i3;
        this.z = j;
        this.A = j2;
        this.B = str;
        this.C = str2;
        this.D = i4;
        this.E = i5;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        h75.K(parcel, 1, 4);
        parcel.writeInt(this.w);
        h75.K(parcel, 2, 4);
        parcel.writeInt(this.x);
        h75.K(parcel, 3, 4);
        parcel.writeInt(this.y);
        h75.K(parcel, 4, 8);
        parcel.writeLong(this.z);
        h75.K(parcel, 5, 8);
        parcel.writeLong(this.A);
        h75.F(parcel, 6, this.B);
        h75.F(parcel, 7, this.C);
        h75.K(parcel, 8, 4);
        parcel.writeInt(this.D);
        h75.K(parcel, 9, 4);
        parcel.writeInt(this.E);
        h75.O(parcel, M);
    }
}
