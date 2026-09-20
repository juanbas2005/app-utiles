package defpackage;

import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;

/* renamed from: hl3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class hl3 {
    public static final String a = bc4.p("SystemJobScheduler");

    public static final JobScheduler a(Context context) {
        context.getClass();
        Object systemService = context.getSystemService("jobscheduler");
        systemService.getClass();
        JobScheduler jobScheduler = (JobScheduler) systemService;
        if (Build.VERSION.SDK_INT < 34) {
            return jobScheduler;
        }
        JobScheduler h = jobScheduler.forNamespace("androidx.work.systemjobscheduler");
        h.getClass();
        return h;
    }
}
