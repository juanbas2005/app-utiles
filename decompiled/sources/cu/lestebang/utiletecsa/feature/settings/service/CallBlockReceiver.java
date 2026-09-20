package cu.lestebang.utiletecsa.feature.settings.service;

import android.app.role.RoleManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.telephony.TelephonyManager;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcu/lestebang/utiletecsa/feature/settings/service/CallBlockReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "settings"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class CallBlockReceiver extends BroadcastReceiver {
    public static volatile String d;
    public volatile boolean a = false;
    public final Object b = new Object();
    public vp6 c;

    public final void a(Context context, Intent intent) {
        if (!this.a) {
            synchronized (this.b) {
                try {
                    if (!this.a) {
                        this.c = (vp6) ((vd1) ((ki0) b96.u(context))).x.get();
                        this.a = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void onReceive(Context context, Intent intent) {
        int i;
        RoleManager c2;
        a(context, intent);
        context.getClass();
        intent.getClass();
        if (!sg3.e(intent.getAction(), "android.intent.action.PHONE_STATE") || (i = Build.VERSION.SDK_INT) < 28) {
            return;
        }
        if (i >= 29 && (c2 = nd.c(context.getSystemService(nd.g()))) != null && c2.isRoleHeld("android.app.role.CALL_SCREENING")) {
            return;
        }
        if (!sg3.e(intent.getStringExtra("state"), TelephonyManager.EXTRA_STATE_RINGING)) {
            d = null;
        } else if (sg3.A(context, "android.permission.ANSWER_PHONE_CALLS")) {
            String stringExtra = intent.getStringExtra("incoming_number");
            if (stringExtra != null && !d57.I0(stringExtra)) {
                d = stringExtra;
            }
            BroadcastReceiver.PendingResult goAsync = goAsync();
            dn1 dn1 = aw1.a;
            ar7.H(gl0.E(cm1.y), (e81) null, (r81) null, new f7(stringExtra, context, goAsync, this, (f61) null, 3), 3);
        }
    }
}
