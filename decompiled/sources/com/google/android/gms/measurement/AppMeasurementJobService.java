package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.Objects;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class AppMeasurementJobService extends JobService implements x69 {
    public n49 w;

    public final boolean a(int i) {
        throw new UnsupportedOperationException();
    }

    public final void c(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final n49 d() {
        if (this.w == null) {
            this.w = new n49(1, this);
        }
        return this.w;
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

    public final boolean onStartJob(JobParameters jobParameters) {
        JobParameters jobParameters2;
        n49 d = d();
        Service service = (Service) d.x;
        String string = jobParameters.getExtras().getString("action");
        Log.v("FA", "onStartJob received action: ".concat(String.valueOf(string)));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            z65.k(string);
            v89 x = v89.x(service);
            pz8 G = x.G();
            ts2 ts2 = x.H.y;
            G.J.b("Local AppMeasurementJobService called. action", string);
            jobParameters2 = jobParameters;
            x.n0().l1(new c49(d, x, (Runnable) new z46(d, G, false, jobParameters2, 12)));
        } else {
            jobParameters2 = jobParameters;
        }
        if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        z65.k(string);
        yw8 e = yw8.e(service, (Bundle) null);
        c49 c49 = new c49(d, false, jobParameters2, 10);
        e.getClass();
        e.c(new kv8(e, c49, 2));
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
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

    public final void b(Intent intent) {
    }
}
