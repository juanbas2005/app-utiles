package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: z99  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class z99 extends a3 {
    public static final Parcelable.Creator<z99> CREATOR = new g39(17);
    public final long A;
    public final long B;
    public final String C;
    public final boolean D;
    public final boolean E;
    public final long F;
    public final String G;
    public final long H;
    public final int I;
    public final boolean J;
    public final boolean K;
    public final Boolean L;
    public final long M;
    public final List N;
    public final String O;
    public final String P;
    public final String Q;
    public final boolean R;
    public final long S;
    public final int T;
    public final String U;
    public final int V;
    public final long W;
    public final String X;
    public final String Y;
    public final long Z;
    public final int a0;
    public final long b0;
    public final String w;
    public final String x;
    public final String y;
    public final String z;

    public z99(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z2, boolean z3, String str6, long j4, int i, boolean z4, boolean z5, Boolean bool, long j5, List list, String str7, String str8, String str9, boolean z6, long j6, int i2, String str10, int i3, long j7, String str11, String str12, long j8, int i4, long j9) {
        z65.h(str);
        this.w = str;
        this.x = true == TextUtils.isEmpty(str2) ? null : str2;
        this.y = str3;
        this.F = j;
        this.z = str4;
        this.A = j2;
        this.B = j3;
        this.C = str5;
        this.D = z2;
        this.E = z3;
        this.G = str6;
        this.H = j4;
        this.I = i;
        this.J = z4;
        this.K = z5;
        this.L = bool;
        this.M = j5;
        this.N = list;
        this.O = str7;
        this.P = str8;
        this.Q = str9;
        this.R = z6;
        this.S = j6;
        this.T = i2;
        this.U = str10;
        this.V = i3;
        this.W = j7;
        this.X = str11;
        this.Y = str12;
        this.Z = j8;
        this.a0 = i4;
        this.b0 = j9;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int M2 = h75.M(parcel, 20293);
        h75.F(parcel, 2, this.w);
        h75.F(parcel, 3, this.x);
        h75.F(parcel, 4, this.y);
        h75.F(parcel, 5, this.z);
        h75.K(parcel, 6, 8);
        parcel.writeLong(this.A);
        h75.K(parcel, 7, 8);
        parcel.writeLong(this.B);
        h75.F(parcel, 8, this.C);
        h75.K(parcel, 9, 4);
        parcel.writeInt(this.D ? 1 : 0);
        h75.K(parcel, 10, 4);
        parcel.writeInt(this.E ? 1 : 0);
        h75.K(parcel, 11, 8);
        parcel.writeLong(this.F);
        h75.F(parcel, 12, this.G);
        h75.K(parcel, 14, 8);
        parcel.writeLong(this.H);
        h75.K(parcel, 15, 4);
        parcel.writeInt(this.I);
        h75.K(parcel, 16, 4);
        parcel.writeInt(this.J ? 1 : 0);
        h75.K(parcel, 18, 4);
        parcel.writeInt(this.K ? 1 : 0);
        Boolean bool = this.L;
        if (bool != null) {
            h75.K(parcel, 21, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        h75.K(parcel, 22, 8);
        parcel.writeLong(this.M);
        h75.G(parcel, 23, this.N);
        h75.F(parcel, 25, this.O);
        h75.F(parcel, 26, this.P);
        h75.F(parcel, 27, this.Q);
        h75.K(parcel, 28, 4);
        parcel.writeInt(this.R ? 1 : 0);
        h75.K(parcel, 29, 8);
        parcel.writeLong(this.S);
        h75.K(parcel, 30, 4);
        parcel.writeInt(this.T);
        h75.F(parcel, 31, this.U);
        h75.K(parcel, 32, 4);
        parcel.writeInt(this.V);
        h75.K(parcel, 34, 8);
        parcel.writeLong(this.W);
        h75.F(parcel, 35, this.X);
        h75.F(parcel, 36, this.Y);
        h75.K(parcel, 37, 8);
        parcel.writeLong(this.Z);
        h75.K(parcel, 38, 4);
        parcel.writeInt(this.a0);
        h75.K(parcel, 39, 8);
        parcel.writeLong(this.b0);
        h75.O(parcel, M2);
    }

    public z99(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z2, boolean z3, long j3, String str6, long j4, int i, boolean z4, boolean z5, Boolean bool, long j5, ArrayList arrayList, String str7, String str8, String str9, boolean z6, long j6, int i2, String str10, int i3, long j7, String str11, String str12, long j8, int i4, long j9) {
        this.w = str;
        this.x = str2;
        this.y = str3;
        this.F = j3;
        this.z = str4;
        this.A = j;
        this.B = j2;
        this.C = str5;
        this.D = z2;
        this.E = z3;
        this.G = str6;
        this.H = j4;
        this.I = i;
        this.J = z4;
        this.K = z5;
        this.L = bool;
        this.M = j5;
        this.N = arrayList;
        this.O = str7;
        this.P = str8;
        this.Q = str9;
        this.R = z6;
        this.S = j6;
        this.T = i2;
        this.U = str10;
        this.V = i3;
        this.W = j7;
        this.X = str11;
        this.Y = str12;
        this.Z = j8;
        this.a0 = i4;
        this.b0 = j9;
    }
}
