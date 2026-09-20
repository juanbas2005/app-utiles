package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class RescheduleReceiver extends BroadcastReceiver {
    public static final String a = bc4.p("RescheduleReceiver");

    public final void onReceive(Context context, Intent intent) {
        bc4 k = bc4.k();
        String str = a;
        k.e(str, "Received intent " + intent);
        try {
            nd8 c = nd8.c(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            synchronized (nd8.m) {
                BroadcastReceiver.PendingResult pendingResult = c.i;
                if (pendingResult != null) {
                    pendingResult.finish();
                }
                c.i = goAsync;
                if (c.h) {
                    goAsync.finish();
                    c.i = null;
                }
            }
        } catch (IllegalStateException e) {
            bc4.k().i(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        } catch (Throwable th) {
            throw th;
        }
    }
}
