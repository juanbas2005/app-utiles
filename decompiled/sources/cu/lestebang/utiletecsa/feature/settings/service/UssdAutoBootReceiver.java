package cu.lestebang.utiletecsa.feature.settings.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoBootReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "settings"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class UssdAutoBootReceiver extends BroadcastReceiver {
    public volatile boolean a = false;
    public final Object b = new Object();
    public dv7 c;

    public final void a(Context context, Intent intent) {
        if (!this.a) {
            synchronized (this.b) {
                try {
                    if (!this.a) {
                        this.c = (dv7) ((vd1) ((iy7) b96.u(context))).l.get();
                        this.a = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void onReceive(Context context, Intent intent) {
        a(context, intent);
        context.getClass();
        intent.getClass();
        String action = intent.getAction();
        if (sg3.e(action, "android.intent.action.BOOT_COMPLETED") || sg3.e(action, "android.intent.action.MY_PACKAGE_REPLACED")) {
            if (((Boolean) ar7.U(x32.w, new zw7((Object) this, (f61) null, 3))).booleanValue()) {
                yh7.a.getClass();
                hr2.m(new Object[0]);
                d37 d37 = UssdAutoUpdaterService.T;
                Intent intent2 = new Intent(context, UssdAutoUpdaterService.class);
                if (Build.VERSION.SDK_INT >= 26) {
                    ag8.H(context, intent2);
                } else {
                    context.startService(intent2);
                }
            }
        }
    }
}
