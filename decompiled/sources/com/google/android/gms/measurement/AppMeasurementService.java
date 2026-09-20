package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class AppMeasurementService extends Service implements x69 {
    public n49 w;

    public final boolean a(int i) {
        return stopSelfResult(i);
    }

    public final void b(Intent intent) {
        SparseArray sparseArray = l88.a;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra != 0) {
            SparseArray sparseArray2 = l88.a;
            synchronized (sparseArray2) {
                try {
                    PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray2.get(intExtra);
                    if (wakeLock != null) {
                        wakeLock.release();
                        sparseArray2.remove(intExtra);
                        return;
                    }
                    Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void c(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final n49 d() {
        if (this.w == null) {
            this.w = new n49(1, this);
        }
        return this.w;
    }

    public final IBinder onBind(Intent intent) {
        n49 d = d();
        d.getClass();
        if (intent == null) {
            Log.e("FA", "onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new w29(v89.x((Service) d.x));
        }
        Log.w("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        Log.v("FA", ((Service) d().x).getClass().getSimpleName().concat(" is starting up."));
    }

    public final void onDestroy() {
        Log.v("FA", ((Service) d().x).getClass().getSimpleName().concat(" is shutting down."));
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        d();
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        n49 d = d();
        if (intent == null) {
            d.getClass();
            Log.w("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Service service = (Service) d.x;
        pz8 pz8 = y19.m(service, (iv8) null, (Long) null, (Long) null).B;
        y19.g(pz8);
        String action = intent.getAction();
        pz8.J.c(Integer.valueOf(i2), action, "Local AppMeasurementService called. startId, action");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        a59 a59 = new a59(d, i2, pz8, intent);
        v89 x = v89.x(service);
        x.n0().l1(new c49(d, x, (Runnable) a59));
        return 2;
    }

    public final boolean onUnbind(Intent intent) {
        d();
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }
}
