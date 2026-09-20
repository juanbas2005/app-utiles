package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@Deprecated
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class GoogleSignInAccount extends a3 implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new zc5(18);
    public final Uri A;
    public String B;
    public final long C;
    public final String D;
    public final List E;
    public final String F;
    public final String G;
    public final HashSet H = new HashSet();
    public final String w;
    public final String x;
    public final String y;
    public final String z;

    public GoogleSignInAccount(String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.w = str;
        this.x = str2;
        this.y = str3;
        this.z = str4;
        this.A = uri;
        this.B = str5;
        this.C = j;
        this.D = str6;
        this.E = arrayList;
        this.F = str7;
        this.G = str8;
    }

    public static GoogleSignInAccount f(String str) {
        Uri uri;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        if (!TextUtils.isEmpty(optString)) {
            uri = Uri.parse(optString);
        } else {
            uri = null;
        }
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String optString2 = jSONObject.optString("id");
        if (jSONObject.has("tokenId")) {
            str2 = jSONObject.optString("tokenId");
        } else {
            str2 = null;
        }
        if (jSONObject.has("email")) {
            str3 = jSONObject.optString("email");
        } else {
            str3 = null;
        }
        if (jSONObject.has("displayName")) {
            str4 = jSONObject.optString("displayName");
        } else {
            str4 = null;
        }
        if (jSONObject.has("givenName")) {
            str5 = jSONObject.optString("givenName");
        } else {
            str5 = null;
        }
        if (jSONObject.has("familyName")) {
            str6 = jSONObject.optString("familyName");
        } else {
            str6 = null;
        }
        String string = jSONObject.getString("obfuscatedIdentifier");
        z65.h(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(optString2, str2, str3, str4, uri, (String) null, parseLong, string, new ArrayList(hashSet), str5, str6);
        if (jSONObject.has("serverAuthCode")) {
            str7 = jSONObject.optString("serverAuthCode");
        }
        googleSignInAccount.B = str7;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.D.equals(this.D)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.E);
        hashSet.addAll(googleSignInAccount.H);
        HashSet hashSet2 = new HashSet(this.E);
        hashSet2.addAll(this.H);
        if (hashSet.equals(hashSet2)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        HashSet hashSet = new HashSet(this.E);
        hashSet.addAll(this.H);
        return ((this.D.hashCode() + 527) * 31) + hashSet.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        h75.F(parcel, 2, this.w);
        h75.F(parcel, 3, this.x);
        h75.F(parcel, 4, this.y);
        h75.F(parcel, 5, this.z);
        h75.E(parcel, 6, this.A, i);
        h75.F(parcel, 7, this.B);
        h75.K(parcel, 8, 8);
        parcel.writeLong(this.C);
        h75.F(parcel, 9, this.D);
        h75.I(parcel, 10, this.E);
        h75.F(parcel, 11, this.F);
        h75.F(parcel, 12, this.G);
        h75.O(parcel, M);
    }
}
