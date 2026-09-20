package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import java.util.List;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String a = bc4.p("DiagnosticsRcvr");

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            bc4 k = bc4.k();
            String str = a;
            k.e(str, "Requesting diagnostics");
            try {
                context.getClass();
                nd8 c = nd8.c(context);
                List D = sg3.D((s55) new r55(DiagnosticsWorker.class).a());
                if (!D.isEmpty()) {
                    new cd8(c, (String) null, w82.x, D, 0).a();
                    return;
                }
                throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
            } catch (IllegalStateException e) {
                bc4.k().i(str, "WorkManager is not initialized", e);
            }
        }
    }
}
