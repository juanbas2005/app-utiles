package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        in7.b(context);
        wr0 a2 = u10.a();
        a2.a0(queryParameter);
        a2.z = vo5.b(intValue);
        if (queryParameter2 != null) {
            a2.y = Base64.decode(queryParameter2, 0);
        }
        z00 z00 = in7.a().d;
        ((Executor) z00.e).execute(new lu7(z00, a2.o(), i, new ka(0)));
    }
}
