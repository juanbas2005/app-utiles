package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* renamed from: rk7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rk7 implements Runnable {
    public static final Object C = new Object();
    public static Boolean D;
    public static Boolean E;
    public final Object A;
    public final Object B;
    public final /* synthetic */ int w;
    public final long x;
    public final Object y;
    public final Object z;

    public rk7(pk7 pk7, Context context, gk4 gk4, long j) {
        this.w = 0;
        this.B = pk7;
        this.y = context;
        this.x = j;
        this.z = gk4;
        this.A = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean z2;
        boolean booleanValue;
        synchronized (C) {
            try {
                Boolean bool = E;
                if (bool == null) {
                    z2 = b(context, "android.permission.ACCESS_NETWORK_STATE", bool);
                } else {
                    z2 = bool.booleanValue();
                }
                Boolean valueOf = Boolean.valueOf(z2);
                E = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public static boolean b(Context context, String str, Boolean bool) {
        boolean z2;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context.checkCallingOrSelfPermission(str) == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z2;
    }

    public static boolean c(Context context) {
        boolean z2;
        boolean booleanValue;
        synchronized (C) {
            try {
                Boolean bool = D;
                if (bool == null) {
                    z2 = b(context, "android.permission.WAKE_LOCK", bool);
                } else {
                    z2 = bool.booleanValue();
                }
                Boolean valueOf = Boolean.valueOf(z2);
                D = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public synchronized boolean d() {
        NetworkInfo networkInfo;
        boolean z2;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) ((Context) this.y).getSystemService("connectivity");
            if (connectivityManager != null) {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } else {
                networkInfo = null;
            }
            if (networkInfo == null || !networkInfo.isConnected()) {
                z2 = false;
            } else {
                z2 = true;
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return z2;
    }

    public final void run() {
        int i = this.w;
        long j = this.x;
        Object obj = this.A;
        Object obj2 = this.z;
        Object obj3 = this.B;
        Object obj4 = this.y;
        switch (i) {
            case b85.b:
                pk7 pk7 = (pk7) obj3;
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) obj;
                Context context = (Context) obj4;
                if (c(context)) {
                    wakeLock.acquire(180000);
                }
                try {
                    pk7.a(true);
                    if (!((gk4) obj2).f()) {
                        pk7.a(false);
                        if (!c(context)) {
                            return;
                        }
                    } else if (!a(context) || d()) {
                        if (pk7.b()) {
                            pk7.a(false);
                        } else {
                            pk7.c(j);
                        }
                        if (!c(context)) {
                            return;
                        }
                    } else {
                        new qk7(this, this).a();
                        if (!c(context)) {
                            return;
                        }
                    }
                } catch (IOException e) {
                    Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e.getMessage());
                    pk7.a(false);
                    if (!c(context)) {
                        return;
                    }
                } catch (Throwable th) {
                    if (c(context)) {
                        try {
                            wakeLock.release();
                        } catch (RuntimeException unused) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                    throw th;
                }
                try {
                    wakeLock.release();
                    return;
                } catch (RuntimeException unused2) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    return;
                }
            case 1:
                String str = (String) obj2;
                w29 w29 = (w29) obj3;
                String str2 = (String) obj4;
                if (str2 == null) {
                    v89 v89 = w29.d;
                    v89.n0().b1();
                    String str3 = v89.c0;
                    if (str3 == null || str3.equals(str)) {
                        v89.c0 = str;
                        v89.b0 = null;
                        return;
                    }
                    return;
                }
                f59 f59 = new f59(j, (String) obj, str2);
                v89 v892 = w29.d;
                v892.n0().b1();
                String str4 = v892.c0;
                if (str4 != null) {
                    str4.equals(str);
                }
                v892.c0 = str;
                v892.b0 = f59;
                return;
            case 2:
                Object obj5 = this.A;
                long j2 = this.x;
                ((v49) obj3).n1(j2, obj5, (String) obj4, (String) obj2);
                return;
            default:
                Bundle bundle = (Bundle) obj4;
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                l59 l59 = (l59) obj3;
                d99 d99 = ((y19) l59.w).E;
                y19.e(d99);
                l59.i1((f59) obj2, (f59) obj, this.x, true, d99.m1("screen_view", bundle, (List) null, false));
                return;
        }
    }

    public rk7(l59 l59, Bundle bundle, f59 f59, f59 f592, long j) {
        this.w = 3;
        this.y = bundle;
        this.z = f59;
        this.A = f592;
        this.x = j;
        Objects.requireNonNull(l59);
        this.B = l59;
    }

    public /* synthetic */ rk7(Object obj, String str, String str2, Object obj2, long j, int i) {
        this.w = i;
        this.y = str;
        this.z = str2;
        this.A = obj2;
        this.x = j;
        this.B = obj;
    }
}
