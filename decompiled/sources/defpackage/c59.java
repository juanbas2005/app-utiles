package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;

/* renamed from: c59  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class c59 extends fy8 {
    public JobScheduler y;

    public final boolean f1() {
        return true;
    }

    public final void g1(long j) {
        String str;
        y19 y19 = (y19) this.w;
        d1();
        b1();
        JobScheduler jobScheduler = this.y;
        if (jobScheduler == null || jobScheduler.getPendingJob("measurement-client".concat(String.valueOf(y19.w.getPackageName())).hashCode()) == null) {
            int h1 = h1();
            if (h1 == 2) {
                pz8 pz8 = y19.B;
                y19.g(pz8);
                pz8.J.b("[sgtm] Scheduling Scion upload, millis", Long.valueOf(j));
                PersistableBundle persistableBundle = new PersistableBundle();
                persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
                JobInfo build = new JobInfo.Builder("measurement-client".concat(String.valueOf(y19.w.getPackageName())).hashCode(), new ComponentName(y19.w, "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build();
                JobScheduler jobScheduler2 = this.y;
                z65.k(jobScheduler2);
                int schedule = jobScheduler2.schedule(build);
                pz8 pz82 = y19.B;
                y19.g(pz82);
                mz8 mz8 = pz82.J;
                if (schedule == 1) {
                    str = "SUCCESS";
                } else {
                    str = "FAILURE";
                }
                mz8.b("[sgtm] Scion upload job scheduled with result", str);
                return;
            }
            pz8 pz83 = y19.B;
            y19.g(pz83);
            pz83.J.b("[sgtm] Not eligible for Scion upload", hl6.u(h1));
            return;
        }
        pz8 pz84 = y19.B;
        y19.g(pz84);
        pz84.J.a("[sgtm] There's an existing pending job, skip this schedule.");
    }

    public final int h1() {
        boolean z;
        y19 y19 = (y19) this.w;
        d1();
        b1();
        if (this.y == null) {
            return 7;
        }
        Boolean p1 = y19.z.p1("google_analytics_sgtm_upload_enabled");
        if (p1 == null) {
            z = false;
        } else {
            z = p1.booleanValue();
        }
        if (!z) {
            return 8;
        }
        if (y19.l().F < 119000) {
            return 6;
        }
        if (!d99.x1(y19.w)) {
            return 3;
        }
        if (!y19.j().j1()) {
            return 5;
        }
        return 2;
    }
}
