package com.google.firebase.messaging;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class FirebaseMessaging {
    public static uy5 l;
    public static nu5 m = new aw0(8);
    public static ScheduledThreadPoolExecutor n;
    public final oe2 a;
    public final Context b;
    public final kd6 c;
    public final o9 d;
    public final kg5 e;
    public final l90 f;
    public final ScheduledThreadPoolExecutor g;
    public final ThreadPoolExecutor h;
    public final gk4 i;
    public final we2 j;
    public boolean k = false;

    /* JADX WARNING: type inference failed for: r11v0, types: [gk4, java.lang.Object] */
    public FirebaseMessaging(oe2 oe2, nu5 nu5, nu5 nu52, we2 we2, nu5 nu53, w67 w67) {
        oe2 oe22 = oe2;
        oe22.a();
        Context context = oe22.a;
        ? obj = new Object();
        obj.b = 0;
        obj.c = context;
        gk4 gk4 = obj;
        we2 we22 = we2;
        kd6 kd6 = new kd6(oe22, gk4, nu5, nu52, we22);
        we2 we23 = we22;
        gk4 gk42 = gk4;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ar4("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ar4("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ar4("Firebase-Messaging-File-Io"));
        m = nu53;
        this.a = oe22;
        this.f = new l90(this, w67);
        oe22.a();
        Context context2 = oe22.a;
        this.b = context2;
        zb2 zb2 = new zb2();
        this.i = gk42;
        this.c = kd6;
        this.j = we23;
        o9 o9Var = new o9(context2, oe22, we23, kd6, gk42);
        this.d = o9Var;
        this.e = new kg5(newSingleThreadExecutor);
        this.g = scheduledThreadPoolExecutor;
        this.h = threadPoolExecutor;
        oe22.a();
        Context context3 = oe22.a;
        if (context3 instanceof Application) {
            ((Application) context3).registerActivityLifecycleCallbacks(zb2);
        } else {
            Log.w("FirebaseMessaging", "Context " + context3 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (o9Var.E()) {
            ye2 ye2 = new ye2(this);
            ve2 ve2 = (ve2) we2;
            synchronized (ve2) {
                ve2.k.add(ye2);
            }
        }
        scheduledThreadPoolExecutor.execute(new ze2(this, 0));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new ar4("Firebase-Messaging-Topics-Io"));
        b35.d(scheduledThreadPoolExecutor2, new ok7(context2, scheduledThreadPoolExecutor2, gk42, oe22, this, we2)).e(scheduledThreadPoolExecutor, new af2(this, 0));
        scheduledThreadPoolExecutor.execute(new ze2(this, 1));
    }

    public static void b(Runnable runnable, long j2) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (n == null) {
                    n = new ScheduledThreadPoolExecutor(1, new ar4("TAG"));
                }
                n.schedule(runnable, j2, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized uy5 c(Context context) {
        uy5 uy5;
        synchronized (FirebaseMessaging.class) {
            try {
                if (l == null) {
                    l = new uy5(context);
                }
                uy5 = l;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return uy5;
    }

    @Deprecated
    public static synchronized FirebaseMessaging getInstance(oe2 oe2) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) oe2.b(FirebaseMessaging.class);
            z65.l("Firebase Messaging component is not present", firebaseMessaging);
        }
        return firebaseMessaging;
    }

    public final String a() {
        yb9 yb9;
        md4 d2 = d();
        if (!h(d2)) {
            return (String) d2.b;
        }
        String c2 = gk4.c(this.a);
        kg5 kg5 = this.e;
        bf2 bf2 = new bf2(this, c2, d2);
        synchronized (kg5) {
            yb9 = (yb9) ((js) kg5.y).get(c2);
            if (yb9 == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + c2);
                }
                yb9 = bf2.a().g((Executor) kg5.x, new yv0(13, (Object) kg5, c2));
                ((js) kg5.y).put(c2, yb9);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + c2);
            }
        }
        try {
            return (String) b35.b(yb9);
        } catch (InterruptedException | ExecutionException e2) {
            throw new IOException("FCM Registration failed!", e2);
        }
    }

    public final md4 d() {
        String str;
        md4 c2;
        uy5 c3 = c(this.b);
        oe2 oe2 = this.a;
        oe2.a();
        if ("[DEFAULT]".equals(oe2.b)) {
            str = "";
        } else {
            str = oe2.d();
        }
        String c4 = gk4.c(this.a);
        synchronized (c3) {
            c2 = md4.c(((SharedPreferences) c3.x).getString(str + "|T|" + c4 + "|*", (String) null));
        }
        return c2;
    }

    public final void e() {
        yb9 yb9;
        int i2;
        ha6 ha6 = (ha6) this.c.z;
        if (ha6.c.s() >= 241100000) {
            kb9 s = kb9.s(ha6.b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (s) {
                i2 = s.x;
                s.x = i2 + 1;
            }
            yb9 = s.t(new ba9(i2, 5, bundle, 1)).f(gv1.y, s63.x);
        } else {
            yb9 = b35.k(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        yb9.e(this.g, new af2(this, 1));
    }

    public final boolean f() {
        Context context = this.b;
        b35.u(context);
        if (Build.VERSION.SDK_INT >= 29) {
            if (Binder.getCallingUid() != context.getApplicationInfo().uid) {
                Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
                return false;
            } else if ("com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "GMS core is set for proxying");
                }
                if (this.a.b(ac.class) != null) {
                    return true;
                }
                if (!sg3.q() || m == null) {
                    return false;
                }
                return true;
            }
        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
        }
        return false;
    }

    public final synchronized void g(long j2) {
        b(new w97(this, Math.min(Math.max(30, 2 * j2), 28800)), j2);
        this.k = true;
    }

    public final boolean h(md4 md4) {
        String str;
        if (md4 != null) {
            String str2 = (String) md4.b;
            String b2 = this.i.b();
            if (System.currentTimeMillis() <= md4.a + 604800000 && b2.equals((String) md4.c)) {
                if (this.d.E()) {
                    try {
                        str = (String) b35.b(((ve2) this.j).c());
                    } catch (InterruptedException | ExecutionException unused) {
                        str = null;
                    }
                    return !str2.equalsIgnoreCase(str);
                } else if (str2.length() <= 22) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
