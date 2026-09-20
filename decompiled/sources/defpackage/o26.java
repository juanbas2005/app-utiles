package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o26  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class o26 extends a3 {
    public static final Parcelable.Creator<o26> CREATOR = new g39(20);
    public final String A;
    public int B;
    public final String C;
    public final String w;
    public final String x;
    public final String y;
    public final String z;

    public o26(String str, String str2, String str3, String str4, String str5) {
        this.w = str;
        this.x = str2;
        this.y = str3;
        this.z = str4;
        this.A = str5;
        this.C = "22.0.1";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        h75.F(parcel, 1, this.w);
        h75.F(parcel, 2, this.x);
        h75.F(parcel, 3, this.y);
        h75.F(parcel, 4, this.z);
        h75.F(parcel, 5, this.A);
        int i2 = this.B;
        h75.K(parcel, 6, 4);
        parcel.writeInt(i2);
        h75.F(parcel, 7, this.C);
        h75.O(parcel, M);
    }

    public o26(String str, String str2, String str3, String str4, String str5, int i, String str6) {
        this.w = str;
        this.x = str2;
        this.y = str3;
        this.z = str4;
        this.A = str5;
        this.B = i;
        this.C = str6;
    }
}
