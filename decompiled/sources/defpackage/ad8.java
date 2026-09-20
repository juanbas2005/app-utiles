package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: ad8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ad8 implements ServiceConnection {
    public yc8 A;
    public boolean B = false;
    public final Context w;
    public final Intent x;
    public final ScheduledThreadPoolExecutor y;
    public final ArrayDeque z = new ArrayDeque();

    public ad8(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ar4("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        Context applicationContext = context.getApplicationContext();
        this.w = applicationContext;
        this.x = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.y = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.z.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                yc8 yc8 = this.A;
                if (yc8 == null || !yc8.isBinderAlive()) {
                    c();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.A.a((zc8) this.z.poll());
            }
        } finally {
            while (true) {
            }
        }
    }

    public final synchronized yb9 b(Intent intent) {
        zc8 zc8;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            zc8 = new zc8(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.y;
            zc8.b.a.c(scheduledThreadPoolExecutor, new c9(23, scheduledThreadPoolExecutor.schedule(new y0(27, zc8), 20, TimeUnit.SECONDS)));
            this.z.add(zc8);
            a();
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return zc8.b.a;
    }

    public final void c() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder("binder is dead. start connection? ");
            sb.append(!this.B);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (!this.B) {
            this.B = true;
            try {
                if (!q11.b().a(this.w, this.x, this, 65)) {
                    Log.e("FirebaseMessaging", "binding to the service failed");
                    this.B = false;
                    while (true) {
                        ArrayDeque arrayDeque = this.z;
                        if (!arrayDeque.isEmpty()) {
                            ((zc8) arrayDeque.poll()).b.d((Object) null);
                        } else {
                            return;
                        }
                    }
                }
            } catch (SecurityException e) {
                Log.e("FirebaseMessaging", "Exception while binding the service", e);
            }
        }
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.B = false;
            if (!(iBinder instanceof yc8)) {
                Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
                ArrayDeque arrayDeque = this.z;
                while (!arrayDeque.isEmpty()) {
                    ((zc8) arrayDeque.poll()).b.d((Object) null);
                }
                return;
            }
            this.A = (yc8) iBinder;
            a();
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        a();
    }
}
