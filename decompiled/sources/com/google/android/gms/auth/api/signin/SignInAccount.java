package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class SignInAccount extends a3 implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new zc5(26);
    public final String w;
    public final GoogleSignInAccount x;
    public final String y;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.x = googleSignInAccount;
        z65.i(str, "8.3 and 8.4 SDKs require non-null email");
        this.w = str;
        z65.i(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.y = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        h75.F(parcel, 4, this.w);
        h75.E(parcel, 7, this.x, i);
        h75.F(parcel, 8, this.y);
        h75.O(parcel, M);
    }
}
