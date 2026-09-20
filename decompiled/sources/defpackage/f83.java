package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.util.Log;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: f83  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class f83 {
    public static final Pattern g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote("/");
    public final bl2 a;
    public final Context b;
    public final String c;
    public final we2 d;
    public final ge1 e;
    public v00 f;

    public f83(Context context, String str, we2 we2, ge1 ge1) {
        if (context == null) {
            h.q("appContext must not be null");
            throw null;
        } else if (str != null) {
            this.b = context;
            this.c = str;
            this.d = we2;
            this.e = ge1;
            this.a = new bl2();
        } else {
            h.q("appIdentifier must not be null");
            throw null;
        }
    }

    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = g.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, (Throwable) null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    public final se2 b(boolean z) {
        String str;
        String str2 = null;
        if (Looper.getMainLooper().isCurrentThread()) {
            String str3 = "Must not be called on a main thread, was called on " + Thread.currentThread().getName() + '.';
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str3, (Throwable) null);
            }
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        we2 we2 = this.d;
        if (z) {
            try {
                str = ((x00) b35.c(((ve2) we2).d(), 10000, timeUnit)).a;
            } catch (Exception e2) {
                Log.w("FirebaseCrashlytics", "Error getting Firebase authentication token.", e2);
            }
            str2 = (String) b35.c(((ve2) we2).c(), 10000, timeUnit);
            return new se2(str2, str);
        }
        str = null;
        try {
            str2 = (String) b35.c(((ve2) we2).c(), 10000, timeUnit);
        } catch (Exception e3) {
            Log.w("FirebaseCrashlytics", "Error getting Firebase installation id.", e3);
        }
        return new se2(str2, str);
    }

    public final synchronized v00 c() {
        String str;
        v00 v00 = this.f;
        if (v00 != null) {
            if (v00.b != null || !this.e.a()) {
                return this.f;
            }
        }
        g22 g22 = g22.D;
        g22.u("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", (String) null);
        g22.u("Cached Firebase Installation ID: " + string);
        if (this.e.a()) {
            se2 b2 = b(false);
            g22.u("Fetched Firebase Installation ID: " + b2.a);
            if (b2.a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                b2 = new se2(str, (String) null);
            }
            if (Objects.equals(b2.a, string)) {
                this.f = new v00(sharedPreferences.getString("crashlytics.installation.id", (String) null), b2.a, b2.b);
            } else {
                this.f = new v00(a(sharedPreferences, b2.a), b2.a, b2.b);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.f = new v00(a(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), (String) null, (String) null);
        } else {
            this.f = new v00(sharedPreferences.getString("crashlytics.installation.id", (String) null), (String) null, (String) null);
        }
        g22.u("Install IDs: " + this.f);
        return this.f;
    }

    public final String d() {
        String str;
        bl2 bl2 = this.a;
        Context context = this.b;
        synchronized (bl2) {
            try {
                if (bl2.b == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    bl2.b = installerPackageName;
                }
                if ("".equals(bl2.b)) {
                    str = null;
                } else {
                    str = bl2.b;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return str;
    }
}
