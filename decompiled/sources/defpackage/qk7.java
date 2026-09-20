package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* renamed from: qk7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qk7 extends BroadcastReceiver {
    public rk7 a;
    public final /* synthetic */ rk7 b;

    public qk7(rk7 rk7, rk7 rk72) {
        this.b = rk7;
        this.a = rk72;
    }

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        ((Context) this.b.y).registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public final synchronized void onReceive(Context context, Intent intent) {
        try {
            rk7 rk7 = this.a;
            if (rk7 != null) {
                if (rk7.d()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    rk7 rk72 = this.a;
                    ((pk7) rk72.B).e.schedule(rk72, 0, TimeUnit.SECONDS);
                    context.unregisterReceiver(this);
                    this.a = null;
                }
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }
}
