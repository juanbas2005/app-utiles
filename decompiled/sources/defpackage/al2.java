package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: al2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class al2 implements h32 {
    public static final al2 y = new al2("VERTICAL", 0);
    public static final al2 z = new al2("HORIZONTAL", 0);
    public final /* synthetic */ int w;
    public final String x;

    public al2(String str, z53 z53) {
        this.w = 1;
        this.x = str;
    }

    public static void c(wr0 wr0, wp6 wp6) {
        String str = wp6.a;
        if (str != null) {
            wr0.Q("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        wr0.Q("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        wr0.Q("X-CRASHLYTICS-API-CLIENT-VERSION", "20.0.6");
        wr0.Q("Accept", "application/json");
        wr0.Q("X-CRASHLYTICS-DEVICE-MODEL", wp6.b);
        String str2 = wp6.c;
        if (str2 != null) {
            wr0.Q("X-CRASHLYTICS-OS-BUILD-VERSION", str2);
        }
        String str3 = wp6.d;
        if (str3 != null) {
            wr0.Q("X-CRASHLYTICS-OS-DISPLAY-VERSION", str3);
        }
        String str4 = wp6.e.c().a;
        if (str4 != null) {
            wr0.Q("X-CRASHLYTICS-INSTALLATION-ID", str4);
        }
    }

    public static HashMap d(wp6 wp6) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", wp6.h);
        hashMap.put("display_version", wp6.g);
        hashMap.put("source", Integer.toString(wp6.i));
        String str = wp6.f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    public boolean b(CharSequence charSequence, int i, int i2, tq7 tq7) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.x)) {
            return true;
        }
        tq7.c = (tq7.c & 3) | 4;
        return false;
    }

    public JSONObject e(g63 g63) {
        int i = g63.b;
        g22 g22 = g22.D;
        g22.u("Settings response code was: " + i);
        String str = this.x;
        if (i == 200 || i == 201 || i == 202 || i == 203) {
            String str2 = g63.a;
            try {
                return new JSONObject(str2);
            } catch (Exception e) {
                g22.v("Failed to parse settings JSON from ".concat(str), e);
                g22.v("Settings response " + str2, (Exception) null);
                return null;
            }
        } else {
            String str3 = "Settings request failed; (status: " + i + ") from " + str;
            if (g22.g(6)) {
                Log.e("FirebaseCrashlytics", str3, (Throwable) null);
            }
            return null;
        }
    }

    public String toString() {
        switch (this.w) {
            case b85.b /*0*/:
                return this.x;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ al2(String str, int i) {
        this.w = i;
        this.x = str;
    }

    public Object a() {
        return this;
    }
}
