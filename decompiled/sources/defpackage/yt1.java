package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: yt1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yt1 implements vd3, v35 {
    public final String w;
    public final String x;

    public yt1(br4 br4) {
        this.w = br4.J("gcm.n.title");
        br4.G("gcm.n.title");
        Object[] F = br4.F("gcm.n.title");
        if (F != null) {
            String[] strArr = new String[F.length];
            for (int i = 0; i < F.length; i++) {
                strArr[i] = String.valueOf(F[i]);
            }
        }
        this.x = br4.J("gcm.n.body");
        br4.G("gcm.n.body");
        Object[] F2 = br4.F("gcm.n.body");
        if (F2 != null) {
            String[] strArr2 = new String[F2.length];
            for (int i2 = 0; i2 < F2.length; i2++) {
                strArr2[i2] = String.valueOf(F2[i2]);
            }
        }
        br4.J("gcm.n.icon");
        if (TextUtils.isEmpty(br4.J("gcm.n.sound2"))) {
            br4.J("gcm.n.sound");
        }
        br4.J("gcm.n.tag");
        br4.J("gcm.n.color");
        br4.J("gcm.n.click_action");
        br4.J("gcm.n.android_channel_id");
        String J = br4.J("gcm.n.link_android");
        J = TextUtils.isEmpty(J) ? br4.J("gcm.n.link") : J;
        if (!TextUtils.isEmpty(J)) {
            Uri.parse(J);
        }
        br4.J("gcm.n.image");
        br4.J("gcm.n.ticker");
        br4.C("gcm.n.notification_priority");
        br4.C("gcm.n.visibility");
        br4.C("gcm.n.notification_count");
        br4.B("gcm.n.sticky");
        br4.B("gcm.n.local_only");
        br4.B("gcm.n.default_sound");
        br4.B("gcm.n.default_vibrate_timings");
        br4.B("gcm.n.default_light_settings");
        br4.H();
        br4.E();
        br4.K();
    }

    public int h(int i) {
        String i1 = d57.i1(i, this.x);
        int i2 = 0;
        for (int i3 = 0; i3 < i1.length(); i3++) {
            if (i1.charAt(i3) == ' ') {
                i2++;
            }
        }
        return z65.p(i - i2, 0, this.w.length());
    }

    public int p(int i) {
        int i2;
        String str = this.w;
        if (str.length() <= 4 || i < 4) {
            i2 = i;
        } else {
            i2 = i + 1;
        }
        if (str.length() > 8 && i >= 8) {
            i2++;
        }
        if (str.length() > 12 && i >= 12) {
            i2++;
        }
        return z65.p(i2, 0, this.x.length());
    }

    public qd3 toInstant() {
        throw new IllegalArgumentException(this.w + " when parsing an Instant from \"" + tf4.R(64, this.x) + '\"');
    }

    public yt1(jz0 jz0) {
        Context context = (Context) jz0.x;
        int v = su0.v(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (v != 0) {
            this.w = "Unity";
            String string = context.getResources().getString(v);
            this.x = string;
            String y = b81.y("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", y, (Throwable) null);
                return;
            }
            return;
        }
        if (context.getAssets() != null) {
            try {
                InputStream open = context.getAssets().open("flutter_assets/NOTICES.Z");
                if (open != null) {
                    open.close();
                }
                this.w = "Flutter";
                this.x = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", (Throwable) null);
                    return;
                }
                return;
            } catch (IOException unused) {
            }
        }
        this.w = null;
        this.x = null;
    }

    public /* synthetic */ yt1(String str, String str2) {
        this.w = str;
        this.x = str2;
    }
}
