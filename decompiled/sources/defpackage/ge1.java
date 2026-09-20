package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.Objects;

/* renamed from: ge1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ge1 implements x50 {
    public Object A;
    public final Object B;
    public boolean w;
    public Object x;
    public final Object y;
    public Object z;

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0078  */
    public ge1(oe2 oe2) {
        Boolean bool;
        Boolean bool2;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        this.x = new Object();
        this.z = new xb7();
        this.w = false;
        this.A = new xb7();
        oe2.a();
        Context context = oe2.a;
        this.y = oe2;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.crashlytics", 0);
        if (sharedPreferences.contains("firebase_crashlytics_collection_enabled")) {
            this.w = false;
            bool = Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true));
        } else {
            bool = null;
        }
        if (bool == null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled"))) {
                    bool2 = Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
                    if (bool2 != null) {
                        this.w = false;
                        bool = null;
                    } else {
                        this.w = true;
                        bool = Boolean.valueOf(Boolean.TRUE.equals(bool2));
                    }
                }
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("FirebaseCrashlytics", "Could not read data collection permission from manifest", e);
            }
            bool2 = null;
            if (bool2 != null) {
            }
        }
        this.B = bool;
        synchronized (this.x) {
            try {
                if (a()) {
                    ((xb7) this.z).d((Object) null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized boolean a() {
        boolean z2;
        Boolean bool = (Boolean) this.B;
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            try {
                z2 = ((oe2) this.y).h();
            } catch (IllegalStateException unused) {
                z2 = false;
            }
        }
        b(z2);
        return z2;
    }

    public void b(boolean z2) {
        String str;
        String str2;
        if (z2) {
            str = "ENABLED";
        } else {
            str = "DISABLED";
        }
        if (((Boolean) this.B) == null) {
            str2 = "global Firebase setting";
        } else if (this.w) {
            str2 = "firebase_crashlytics_collection_enabled manifest flag";
        } else {
            str2 = "API";
        }
        String m = pb4.m("Crashlytics automatic data collection ", str, " by ", str2, ".");
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", m, (Throwable) null);
        }
    }

    public void c(m11 m11) {
        ng8 ng8 = (ng8) ((pw2) this.B).F.get((ln) this.x);
        if (ng8 != null) {
            ng8.n(m11);
        }
    }

    public void f(m11 m11) {
        ((pw2) this.B).I.post(new nt2(this, false, m11, 16));
    }

    public ge1(int i, float f, ob5 ob5) {
        this.y = ob5;
        this.z = new bd5(i);
        this.A = new ad5(f);
        this.B = new l24(i, 30, 100);
    }

    public ge1(pw2 pw2, iw2 iw2, ln lnVar) {
        Objects.requireNonNull(pw2);
        this.B = pw2;
        this.z = null;
        this.A = null;
        this.w = false;
        this.y = iw2;
        this.x = lnVar;
    }
}
