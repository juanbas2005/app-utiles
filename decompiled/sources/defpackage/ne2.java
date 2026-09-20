package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ne2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ne2 extends BroadcastReceiver {
    public static final AtomicReference b = new AtomicReference();
    public final Context a;

    public ne2(Context context) {
        this.a = context;
    }

    public final void onReceive(Context context, Intent intent) {
        synchronized (oe2.k) {
            try {
                Iterator it = ((hs) oe2.l.values()).iterator();
                while (it.hasNext()) {
                    ((oe2) it.next()).e();
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.a.unregisterReceiver(this);
    }
}
