package defpackage;

import android.os.CancellationSignal;
import android.util.Log;

/* renamed from: ac1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ac1 {
    public static boolean a(CancellationSignal cancellationSignal) {
        if (cancellationSignal == null) {
            Log.i("PlayServicesImpl", "No cancellationSignal found");
            return false;
        } else if (!cancellationSignal.isCanceled()) {
            return false;
        } else {
            Log.i("PlayServicesImpl", "the flow has been canceled");
            return true;
        }
    }
}
