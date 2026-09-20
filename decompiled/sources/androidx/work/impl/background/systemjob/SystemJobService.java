package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class SystemJobService extends JobService implements b82 {
    public static final String A = bc4.p("SystemJobService");
    public nd8 w;
    public final HashMap x = new HashMap();
    public final tb3 y = new tb3(1);
    public k68 z;

    public static void a(String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            h.s(f21.h("Cannot invoke ", str, " on a background thread"));
        }
    }

    public static id8 c(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new id8(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public final void b(id8 id8, boolean z2) {
        a("onExecuted");
        bc4 k = bc4.k();
        k.e(A, id8.a + " executed on JobScheduler");
        JobParameters jobParameters = (JobParameters) this.x.remove(id8);
        this.y.c(id8);
        if (jobParameters != null) {
            jobFinished(jobParameters, z2);
        }
    }

    public final void onCreate() {
        super.onCreate();
        try {
            nd8 c = nd8.c(getApplicationContext());
            this.w = c;
            lp5 lp5 = c.f;
            this.z = new k68(lp5, c.d);
            lp5.a(this);
        } catch (IllegalStateException e) {
            if (Application.class.equals(getApplication().getClass())) {
                bc4.k().q(A, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        nd8 nd8 = this.w;
        if (nd8 != null) {
            lp5 lp5 = nd8.f;
            synchronized (lp5.k) {
                lp5.j.remove(this);
            }
        }
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        a("onStartJob");
        nd8 nd8 = this.w;
        String str = A;
        if (nd8 == null) {
            bc4.k().e(str, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        id8 c = c(jobParameters);
        if (c == null) {
            bc4.k().h(str, "WorkSpec id not found!");
            return false;
        }
        HashMap hashMap = this.x;
        if (hashMap.containsKey(c)) {
            bc4 k = bc4.k();
            k.e(str, "Job is already being executed by SystemJobService: " + c);
            return false;
        }
        bc4 k2 = bc4.k();
        k2.e(str, "onStartJob for " + c);
        hashMap.put(c, jobParameters);
        or2 or2 = new or2();
        if (jobParameters.getTriggeredContentUris() != null) {
            Arrays.asList(jobParameters.getTriggeredContentUris());
        }
        if (jobParameters.getTriggeredContentAuthorities() != null) {
            Arrays.asList(jobParameters.getTriggeredContentAuthorities());
        }
        if (Build.VERSION.SDK_INT >= 28) {
            bn.g(jobParameters);
        }
        this.z.h(this.y.e(c), or2);
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        int i;
        a("onStopJob");
        if (this.w == null) {
            bc4.k().e(A, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        id8 c = c(jobParameters);
        if (c == null) {
            bc4.k().h(A, "WorkSpec id not found!");
            return false;
        }
        bc4 k = bc4.k();
        String str = A;
        k.e(str, "onStopJob for " + c);
        this.x.remove(c);
        v27 c2 = this.y.c(c);
        if (c2 != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                i = hn.d(jobParameters);
            } else {
                i = -512;
            }
            k68 k68 = this.z;
            k68.getClass();
            k68.j(c2, i);
        }
        lp5 lp5 = this.w.f;
        String str2 = c.a;
        synchronized (lp5.k) {
            contains = lp5.i.contains(str2);
        }
        return !contains;
    }
}
