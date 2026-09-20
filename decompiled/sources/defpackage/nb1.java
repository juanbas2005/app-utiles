package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: nb1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nb1 extends a3 {
    public static final Parcelable.Creator<nb1> CREATOR = new ri8(13);
    public final String A;
    public final String B;
    public final String w;
    public final Bundle x;
    public final Bundle y;
    public final String z;

    public nb1(String str, Bundle bundle, Bundle bundle2, String str2, String str3, String str4) {
        boolean z2;
        str.getClass();
        bundle.getClass();
        bundle2.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.w = str;
        this.x = bundle;
        this.y = bundle2;
        this.z = str2;
        this.A = str3;
        this.B = str4;
        boolean z3 = true;
        if (d57.I0(str3) || d57.I0(str4)) {
            z2 = false;
        } else {
            z2 = true;
        }
        z3 = (!d57.I0(str) && str3.length() == 0 && str4.length() == 0) ? z3 : false;
        if (!z2 && !z3) {
            StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + String.valueOf(str).length() + 31 + String.valueOf(str3).length() + 19 + 69);
            f21.v(sb, "Either type: ", str, ", or requestType: ", str3);
            h.q(f21.m(sb, " and protocolType: ", str4, " must be specified, but at least one contains an invalid blank value."));
            throw null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int M = h75.M(parcel, 20293);
        h75.F(parcel, 1, this.w);
        h75.z(parcel, 2, this.x);
        h75.z(parcel, 3, this.y);
        h75.F(parcel, 4, this.z);
        h75.F(parcel, 5, this.A);
        h75.F(parcel, 6, this.B);
        h75.O(parcel, M);
    }
}
