package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;

/* renamed from: v97  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class v97 extends BroadcastReceiver {
    public final /* synthetic */ int a = 0;
    public Context b;
    public Object c;

    public v97(k68 k68) {
        this.c = k68;
    }

    public void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        w97 w97 = (w97) this.c;
        if (w97 != null) {
            Context context = ((FirebaseMessaging) w97.z).b;
            this.b = context;
            context.registerReceiver(this, intentFilter);
        }
    }

    public final void onReceive(Context context, Intent intent) {
        String str;
        switch (this.a) {
            case b85.b:
                w97 w97 = (w97) this.c;
                if (w97 != null && w97.a()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    w97 w972 = (w97) this.c;
                    ((FirebaseMessaging) w972.z).getClass();
                    FirebaseMessaging.b(w972, 0);
                    Context context2 = this.b;
                    if (context2 != null) {
                        context2.unregisterReceiver(this);
                    }
                    this.c = null;
                    return;
                }
                return;
            default:
                Uri data = intent.getData();
                if (data != null) {
                    str = data.getSchemeSpecificPart();
                } else {
                    str = null;
                }
                if ("com.google.android.gms".equals(str)) {
                    ((ge) ((k68) this.c).y).getClass();
                    throw null;
                }
                return;
        }
    }

    public /* synthetic */ v97() {
    }
}
