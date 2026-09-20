package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

@Deprecated
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class GoogleSignInOptions extends a3 implements ym, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR = new zc5(20);
    public static final GoogleSignInOptions G;
    public static final Scope H;
    public static final Scope I;
    public static final Scope J = new Scope(1, "https://www.googleapis.com/auth/games");
    public static final zf8 K = new zf8(2);
    public final boolean A;
    public final boolean B;
    public final String C;
    public final String D;
    public final ArrayList E;
    public final String F;
    public final int w;
    public final ArrayList x;
    public final Account y;
    public final boolean z;

    static {
        Scope scope = new Scope(1, "profile");
        new Scope(1, "email");
        Scope scope2 = new Scope(1, "openid");
        H = scope2;
        Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        I = scope3;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        hashSet.add(scope2);
        hashSet.add(scope);
        if (hashSet.contains(J)) {
            Scope scope4 = I;
            if (hashSet.contains(scope4)) {
                hashSet.remove(scope4);
            }
        }
        G = new GoogleSignInOptions(3, new ArrayList(hashSet), (Account) null, false, false, false, (String) null, (String) null, hashMap, (String) null);
        HashSet hashSet2 = new HashSet();
        HashMap hashMap2 = new HashMap();
        hashSet2.add(scope3);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        if (hashSet2.contains(J)) {
            Scope scope5 = I;
            if (hashSet2.contains(scope5)) {
                hashSet2.remove(scope5);
            }
        }
        new GoogleSignInOptions(3, new ArrayList(hashSet2), (Account) null, false, false, false, (String) null, (String) null, hashMap2, (String) null);
    }

    public GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z2, boolean z3, boolean z4, String str, String str2, HashMap hashMap, String str3) {
        this.w = i;
        this.x = arrayList;
        this.y = account;
        this.z = z2;
        this.A = z3;
        this.B = z4;
        this.C = str;
        this.D = str2;
        this.E = new ArrayList(hashMap.values());
        this.F = str3;
    }

    public static GoogleSignInOptions f(String str) {
        String str2;
        Account account;
        String str3;
        String str4 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        if (jSONObject.has("accountName")) {
            str2 = jSONObject.optString("accountName");
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            account = new Account(str2, "com.google");
        } else {
            account = null;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        boolean z2 = jSONObject.getBoolean("idTokenRequested");
        boolean z3 = jSONObject.getBoolean("serverAuthRequested");
        boolean z4 = jSONObject.getBoolean("forceCodeForRefreshToken");
        if (jSONObject.has("serverClientId")) {
            str3 = jSONObject.optString("serverClientId");
        } else {
            str3 = null;
        }
        if (jSONObject.has("hostedDomain")) {
            str4 = jSONObject.optString("hostedDomain");
        }
        return new GoogleSignInOptions(3, arrayList, account, z2, z3, z4, str3, str4, new HashMap(), (String) null);
    }

    public static HashMap g(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                tw2 tw2 = (tw2) it.next();
                hashMap.put(Integer.valueOf(tw2.x), tw2);
            }
        }
        return hashMap;
    }

    public final boolean equals(Object obj) {
        String str = this.C;
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            ArrayList arrayList = googleSignInOptions.x;
            String str2 = googleSignInOptions.C;
            if (!this.E.isEmpty()) {
                return false;
            }
            if (!googleSignInOptions.E.isEmpty()) {
                return false;
            }
            ArrayList arrayList2 = this.x;
            if (arrayList2.size() != new ArrayList(arrayList).size()) {
                return false;
            }
            if (!arrayList2.containsAll(new ArrayList(arrayList))) {
                return false;
            }
            Account account = this.y;
            Account account2 = googleSignInOptions.y;
            if (account == null) {
                if (account2 != null) {
                    return false;
                }
            } else if (!account.equals(account2)) {
                return false;
            }
            if (TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(str2)) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (this.B == googleSignInOptions.B && this.z == googleSignInOptions.z && this.A == googleSignInOptions.A && TextUtils.equals(this.F, googleSignInOptions.F)) {
                return true;
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.x;
        int size = arrayList2.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.add(((Scope) arrayList2.get(i4)).x);
        }
        Collections.sort(arrayList);
        int hashCode = (arrayList.hashCode() + (1 * 31)) * 31;
        Account account = this.y;
        if (account == null) {
            i = 0;
        } else {
            i = account.hashCode();
        }
        int i5 = (hashCode + i) * 31;
        String str = this.C;
        if (str == null) {
            i2 = 0;
        } else {
            i2 = str.hashCode();
        }
        int i6 = (((((((i5 + i2) * 31) + (this.B ? 1 : 0)) * 31) + (this.z ? 1 : 0)) * 31) + (this.A ? 1 : 0)) * 31;
        String str2 = this.F;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return i6 + i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        h75.K(parcel, 1, 4);
        parcel.writeInt(this.w);
        h75.I(parcel, 2, new ArrayList(this.x));
        h75.E(parcel, 3, this.y, i);
        h75.K(parcel, 4, 4);
        parcel.writeInt(this.z ? 1 : 0);
        h75.K(parcel, 5, 4);
        parcel.writeInt(this.A ? 1 : 0);
        h75.K(parcel, 6, 4);
        parcel.writeInt(this.B ? 1 : 0);
        h75.F(parcel, 7, this.C);
        h75.F(parcel, 8, this.D);
        h75.I(parcel, 9, this.E);
        h75.F(parcel, 10, this.F);
        h75.O(parcel, M);
    }
}
