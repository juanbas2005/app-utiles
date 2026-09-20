package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;

/* renamed from: w79  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class w79 extends g89 {
    public h79 A;
    public Integer B;
    public final AlarmManager z = ((AlarmManager) ((y19) this.w).w.getSystemService("alarm"));

    public w79(v89 v89) {
        super(v89);
    }

    public final void f1() {
        AlarmManager alarmManager = this.z;
        if (alarmManager != null) {
            Context context = ((y19) this.w).w;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), pt8.a));
        }
        i1();
    }

    public final xq8 g1() {
        if (this.A == null) {
            this.A = new h79(this, this.x.H, 1);
        }
        return this.A;
    }

    public final void h1() {
        d1();
        y19 y19 = (y19) this.w;
        pz8 pz8 = y19.B;
        y19.g(pz8);
        pz8.J.a("Unscheduling upload");
        AlarmManager alarmManager = this.z;
        if (alarmManager != null) {
            Context context = y19.w;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), pt8.a));
        }
        g1().c();
        i1();
    }

    public final void i1() {
        JobScheduler jobScheduler = (JobScheduler) ((y19) this.w).w.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(j1());
        }
    }

    public final int j1() {
        if (this.B == null) {
            this.B = Integer.valueOf("measurement".concat(String.valueOf(((y19) this.w).w.getPackageName())).hashCode());
        }
        return this.B.intValue();
    }
}
