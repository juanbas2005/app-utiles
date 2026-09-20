package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int w = 0;

    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        in7.b(getApplicationContext());
        wr0 a = u10.a();
        a.a0(string);
        a.z = vo5.b(i);
        if (string2 != null) {
            a.y = Base64.decode(string2, 0);
        }
        z00 z00 = in7.a().d;
        ((Executor) z00.e).execute(new lu7(z00, a.o(), i2, new ga(26, (Object) this, (Object) jobParameters)));
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
