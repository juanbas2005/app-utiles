package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: q11  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class q11 {
    public static final Object b = new Object();
    public static volatile q11 c;
    public final ConcurrentHashMap a;

    public q11(int i) {
        switch (i) {
            case 1:
                this.a = new ConcurrentHashMap();
                return;
            default:
                this.a = new ConcurrentHashMap();
                return;
        }
    }

    public static q11 b() {
        if (c == null) {
            synchronized (b) {
                try {
                    if (c == null) {
                        c = new q11(0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        q11 q11 = c;
        z65.k(q11);
        return q11;
    }

    public boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return d(context, context.getClass().getName(), intent, serviceConnection, i, (Executor) null);
    }

    public void c(Context context, ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof k79)) {
            ConcurrentHashMap concurrentHashMap = this.a;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    try {
                        context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                    } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                    }
                    return;
                } finally {
                    concurrentHashMap.remove(serviceConnection);
                }
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
        }
    }

    public boolean d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        boolean bindService;
        boolean z;
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((cf8.a(context).b(0, packageName).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!(serviceConnection instanceof k79)) {
            ConcurrentHashMap concurrentHashMap = this.a;
            ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
            if (!(serviceConnection2 == null || serviceConnection == serviceConnection2)) {
                Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", new Object[]{serviceConnection, str, intent.getAction()}));
            }
            if (executor == null) {
                executor = null;
            }
            try {
                if (Build.VERSION.SDK_INT < 29 || executor == null) {
                    z = context.bindService(intent, serviceConnection, i);
                } else {
                    z = context.bindService(intent, i, executor, serviceConnection);
                }
                if (z) {
                    return z;
                }
                return false;
            } finally {
                concurrentHashMap.remove(serviceConnection, serviceConnection);
            }
        } else {
            if (executor == null) {
                executor = null;
            }
            if (Build.VERSION.SDK_INT < 29 || executor == null) {
                bindService = context.bindService(intent, serviceConnection, i);
            } else {
                bindService = context.bindService(intent, i, executor, serviceConnection);
            }
            return bindService;
        }
    }
}
