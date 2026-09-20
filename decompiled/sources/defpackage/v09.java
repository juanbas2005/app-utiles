package defpackage;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: v09  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class v09 implements y49 {
    public final y19 w;

    public v09(v89 v89) {
        this.w = v89.H;
    }

    public void a(int i, Throwable th, byte[] bArr) {
        pz8 pz8;
        pz8 pz82;
        int i2 = i;
        Throwable th2 = th;
        byte[] bArr2 = bArr;
        y19 y19 = this.w;
        pz8 pz83 = y19.B;
        if (!(i2 == 200 || i2 == 204)) {
            if (i2 == 304) {
                i2 = 304;
            }
            pz8 pz84 = pz83;
            y19.g(pz84);
            pz84.E.c(Integer.valueOf(i2), th2, "Network Request for Deferred Deep Link failed. response, exception");
        }
        if (th2 == null) {
            q09 q09 = y19.A;
            y19.e(q09);
            q09.P.b(true);
            if (bArr2 == null || bArr2.length == 0) {
                pz8 pz85 = pz83;
                y19.g(pz85);
                pz85.I.a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr2));
                String optString = jSONObject.optString("deeplink", "");
                if (TextUtils.isEmpty(optString)) {
                    y19.g(pz83);
                    pz83.I.a("Deferred Deep Link is empty.");
                    return;
                }
                String optString2 = jSONObject.optString("gclid", "");
                String optString3 = jSONObject.optString("gbraid", "");
                String optString4 = jSONObject.optString("gad_source", "");
                double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                Bundle bundle = new Bundle();
                d99 d99 = y19.E;
                y19.e(d99);
                y19 y192 = (y19) d99.w;
                if (TextUtils.isEmpty(optString)) {
                    pz82 = pz83;
                } else {
                    double d = optDouble;
                    Context context = y192.w;
                    pz82 = pz83;
                    try {
                        d99 d992 = d99;
                        y19 y193 = y192;
                        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0);
                        if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                            if (!TextUtils.isEmpty(optString3)) {
                                bundle.putString("gbraid", optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                bundle.putString("gad_source", optString4);
                            }
                            bundle.putString("gclid", optString2);
                            bundle.putString("_cis", "ddp");
                            y19.I.j1("auto", "_cmp", bundle);
                            if (!TextUtils.isEmpty(optString)) {
                                try {
                                    SharedPreferences.Editor edit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                    edit.putString("deeplink", optString);
                                    edit.putLong("timestamp", Double.doubleToRawLongBits(d));
                                    if (edit.commit()) {
                                        Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                        Context context2 = y193.w;
                                        if (Build.VERSION.SDK_INT < 34) {
                                            context2.sendBroadcast(intent);
                                            return;
                                        } else {
                                            context2.sendBroadcast(intent, (String) null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                } catch (RuntimeException e) {
                                    pz8 pz86 = ((y19) d992.w).B;
                                    y19.g(pz86);
                                    pz86.B.b("Failed to persist Deferred Deep Link. exception", e);
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                    } catch (JSONException e2) {
                        e = e2;
                        pz8 = pz82;
                        y19.g(pz8);
                        pz8.B.b("Failed to parse the Deferred Deep Link response. exception", e);
                        return;
                    }
                }
                y19.g(pz82);
                pz8 = pz82;
                try {
                    pz8.E.d("Deferred Deep Link validation failed. gclid, gbraid, deep link", optString2, optString3, optString);
                    return;
                } catch (JSONException e3) {
                    e = e3;
                    y19.g(pz8);
                    pz8.B.b("Failed to parse the Deferred Deep Link response. exception", e);
                    return;
                }
            } catch (JSONException e4) {
                e = e4;
                pz8 = pz83;
                y19.g(pz8);
                pz8.B.b("Failed to parse the Deferred Deep Link response. exception", e);
                return;
            }
        }
        pz8 pz842 = pz83;
        y19.g(pz842);
        pz842.E.c(Integer.valueOf(i2), th2, "Network Request for Deferred Deep Link failed. response, exception");
    }

    public boolean b() {
        y19 y19 = this.w;
        try {
            tb1 a = cf8.a(y19.w);
            if (a == null) {
                pz8 pz8 = y19.B;
                y19.g(pz8);
                pz8.J.a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            } else if (a.c(128, "com.android.vending").versionCode >= 80837300) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            pz8 pz82 = y19.B;
            y19.g(pz82);
            pz82.J.b("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }

    public void c(String str, Bundle bundle) {
        String str2;
        y19 y19 = this.w;
        r19 r19 = y19.C;
        q09 q09 = y19.A;
        y19.g(r19);
        r19.b1();
        if (!y19.a()) {
            if (bundle.isEmpty()) {
                str2 = null;
            } else {
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String next : bundle.keySet()) {
                    builder.appendQueryParameter(next, bundle.getString(next));
                }
                str2 = builder.build().toString();
            }
            if (!TextUtils.isEmpty(str2)) {
                y19.e(q09);
                q09.S.k(str2);
                l09 l09 = q09.T;
                y19.G.getClass();
                l09.b(System.currentTimeMillis());
            }
        }
    }

    public boolean d() {
        if (!e()) {
            return false;
        }
        y19 y19 = this.w;
        y19.G.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        q09 q09 = y19.A;
        y19.e(q09);
        if (currentTimeMillis - q09.T.a() > y19.z.k1((String) null, by8.i0)) {
            return true;
        }
        return false;
    }

    public boolean e() {
        q09 q09 = this.w.A;
        y19.e(q09);
        if (q09.T.a() > 0) {
            return true;
        }
        return false;
    }

    public /* synthetic */ v09(y19 y19) {
        this.w = y19;
    }
}
