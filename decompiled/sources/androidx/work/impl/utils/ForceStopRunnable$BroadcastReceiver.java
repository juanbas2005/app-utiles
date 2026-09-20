package androidx.work.impl.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class ForceStopRunnable$BroadcastReceiver extends BroadcastReceiver {
    public static final String a = bc4.p("ForceStopRunnable$Rcvr");

    public final void onReceive(Context context, Intent intent) {
        if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
            if (bc4.k().x <= 2) {
                Log.v(a, "Rescheduling alarm that keeps track of force-stops.");
            }
            gm2.c(context);
        }
    }
}
