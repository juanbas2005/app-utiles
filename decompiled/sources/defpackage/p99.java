package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* renamed from: p99  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class p99 extends BroadcastReceiver {
    public static volatile ay4 a;

    public final void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra != null) {
            if (stringExtra.contains("../") || stringExtra.contains("/..")) {
                StringBuilder sb = new StringBuilder(stringExtra.length() + 68);
                sb.append("Got an invalid config package for P/H that includes '..': ");
                sb.append(stringExtra);
                sb.append(". Exiting.");
                Log.w("PhUpdateBroadcastRecv", sb.toString());
                return;
            }
            ay4 ay4 = a;
            if (ay4 == null) {
                Log.w("PhUpdateBroadcastRecv", "No callback registered for P/H UPDATE broadcast. Exiting.");
                return;
            }
            d89 d89 = (d89) ((q11) ay4.x).a.get(stringExtra);
            if (d89 != null) {
                d89.a.b();
            }
        }
    }
}
