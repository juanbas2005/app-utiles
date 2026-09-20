package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: rw2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class rw2 {
    public static final AtomicBoolean a = new AtomicBoolean();
    public static boolean b = false;
    public static boolean c = false;
    public static final AtomicBoolean d = new AtomicBoolean();
    public static final /* synthetic */ int e = 0;

    public static boolean a(Context context) {
        int i;
        if (!c) {
            try {
                tb1 a2 = cf8.a(context);
                if (Build.VERSION.SDK_INT >= 28) {
                    i = 134217792;
                } else {
                    i = 64;
                }
                PackageInfo c2 = a2.c(i, "com.google.android.gms");
                uw2.a(context);
                if (c2 == null || uw2.d(c2, false) || !uw2.d(c2, true)) {
                    b = false;
                } else {
                    b = true;
                }
                c = true;
            } catch (PackageManager.NameNotFoundException e2) {
                Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e2);
                c = true;
            } catch (Throwable th) {
                c = true;
                throw th;
            }
        }
        if (b || !"user".equals(Build.TYPE)) {
            return true;
        }
        return false;
    }
}
