package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: gt6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gt6 extends a3 {
    public static final Parcelable.Creator<gt6> CREATOR = new ki8(4);
    public final Uri A;
    public final String B;
    public final String C;
    public final String D;
    public final qu5 E;
    public final String w;
    public final String x;
    public final String y;
    public final String z;

    public gt6(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, qu5 qu5) {
        z65.k(str);
        this.w = str;
        this.x = str2;
        this.y = str3;
        this.z = str4;
        this.A = uri;
        this.B = str5;
        this.C = str6;
        this.D = str7;
        this.E = qu5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gt6)) {
            return false;
        }
        gt6 gt6 = (gt6) obj;
        if (!b35.j(this.w, gt6.w) || !b35.j(this.x, gt6.x) || !b35.j(this.y, gt6.y) || !b35.j(this.z, gt6.z) || !b35.j(this.A, gt6.A) || !b35.j(this.B, gt6.B) || !b35.j(this.C, gt6.C) || !b35.j(this.D, gt6.D) || !b35.j(this.E, gt6.E)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        h75.F(parcel, 1, this.w);
        h75.F(parcel, 2, this.x);
        h75.F(parcel, 3, this.y);
        h75.F(parcel, 4, this.z);
        h75.E(parcel, 5, this.A, i);
        h75.F(parcel, 6, this.B);
        h75.F(parcel, 7, this.C);
        h75.F(parcel, 8, this.D);
        h75.E(parcel, 9, this.E, i);
        h75.O(parcel, M);
    }
}
