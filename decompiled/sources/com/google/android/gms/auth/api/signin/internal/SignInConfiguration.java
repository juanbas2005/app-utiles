package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class SignInConfiguration extends a3 implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new ki8(3);
    public final String w;
    public final GoogleSignInOptions x;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        z65.h(str);
        this.w = str;
        this.x = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.w.equals(signInConfiguration.w)) {
            GoogleSignInOptions googleSignInOptions = signInConfiguration.x;
            GoogleSignInOptions googleSignInOptions2 = this.x;
            if (googleSignInOptions2 == null) {
                if (googleSignInOptions == null) {
                    return true;
                }
            } else if (!googleSignInOptions2.equals(googleSignInOptions)) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 1 * 31;
        int i3 = 0;
        String str = this.w;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i4 = (i2 + i) * 31;
        GoogleSignInOptions googleSignInOptions = this.x;
        if (googleSignInOptions != null) {
            i3 = googleSignInOptions.hashCode();
        }
        return i4 + i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        h75.F(parcel, 2, this.w);
        h75.E(parcel, 5, this.x, i);
        h75.O(parcel, M);
    }
}
