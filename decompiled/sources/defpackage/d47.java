package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: d47  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class d47 {
    public static final ReentrantLock c = new ReentrantLock();
    public static d47 d;
    public final ReentrantLock a = new ReentrantLock();
    public final SharedPreferences b;

    public d47(Context context) {
        this.b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static d47 a(Context context) {
        z65.k(context);
        ReentrantLock reentrantLock = c;
        reentrantLock.lock();
        try {
            if (d == null) {
                d = new d47(context.getApplicationContext());
            }
            d47 d47 = d;
            reentrantLock.unlock();
            return d47;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String f(String str, String str2) {
        return f21.m(new StringBuilder(str.length() + 1 + String.valueOf(str2).length()), str, ":", str2);
    }

    public final GoogleSignInAccount b() {
        String e;
        String e2 = e("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(e2) && (e = e(f("googleSignInAccount", e2))) != null) {
            try {
                return GoogleSignInAccount.f(e);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final void c(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        z65.k(googleSignInAccount);
        z65.k(googleSignInOptions);
        String str = googleSignInAccount.D;
        d("defaultGoogleSignInAccount", str);
        String f = f("googleSignInAccount", str);
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = googleSignInAccount.w;
            if (str2 != null) {
                jSONObject.put("id", str2);
            }
            String str3 = googleSignInAccount.x;
            if (str3 != null) {
                jSONObject.put("tokenId", str3);
            }
            String str4 = googleSignInAccount.y;
            if (str4 != null) {
                jSONObject.put("email", str4);
            }
            String str5 = googleSignInAccount.z;
            if (str5 != null) {
                jSONObject.put("displayName", str5);
            }
            String str6 = googleSignInAccount.F;
            if (str6 != null) {
                jSONObject.put("givenName", str6);
            }
            String str7 = googleSignInAccount.G;
            if (str7 != null) {
                jSONObject.put("familyName", str7);
            }
            Uri uri = googleSignInAccount.A;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str8 = googleSignInAccount.B;
            if (str8 != null) {
                jSONObject.put("serverAuthCode", str8);
            }
            jSONObject.put("expirationTime", googleSignInAccount.C);
            jSONObject.put("obfuscatedIdentifier", str);
            JSONArray jSONArray = new JSONArray();
            List list = googleSignInAccount.E;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, zf8.x);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.x);
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            d(f, jSONObject.toString());
            String f2 = f("googleSignInOptions", str);
            String str9 = googleSignInOptions.D;
            String str10 = googleSignInOptions.C;
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray2 = new JSONArray();
                ArrayList arrayList = googleSignInOptions.x;
                Collections.sort(arrayList, GoogleSignInOptions.K);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(((Scope) it.next()).x);
                }
                jSONObject2.put("scopes", jSONArray2);
                Account account = googleSignInOptions.y;
                if (account != null) {
                    jSONObject2.put("accountName", account.name);
                }
                jSONObject2.put("idTokenRequested", googleSignInOptions.z);
                jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.B);
                jSONObject2.put("serverAuthRequested", googleSignInOptions.A);
                if (!TextUtils.isEmpty(str10)) {
                    jSONObject2.put("serverClientId", str10);
                }
                if (!TextUtils.isEmpty(str9)) {
                    jSONObject2.put("hostedDomain", str9);
                }
                d(f2, jSONObject2.toString());
            } catch (JSONException e) {
                rf2.o(e);
            }
        } catch (JSONException e2) {
            rf2.o(e2);
        }
    }

    public final void d(String str, String str2) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            this.b.edit().putString(str, str2).apply();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final String e(String str) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            return this.b.getString(str, (String) null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
