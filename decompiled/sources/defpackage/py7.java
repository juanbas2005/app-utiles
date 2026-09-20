package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import cu.lestebang.utiletecsa.R;
import cu.lestebang.utiletecsa.feature.settings.service.UssdAutoUpdaterService;

/* renamed from: py7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class py7 extends BroadcastReceiver {
    public final /* synthetic */ int a;
    public final /* synthetic */ UssdAutoUpdaterService b;

    public /* synthetic */ py7(UssdAutoUpdaterService ussdAutoUpdaterService, int i) {
        this.a = i;
        this.b = ussdAutoUpdaterService;
    }

    public final void onReceive(Context context, Intent intent) {
        int i = this.a;
        UssdAutoUpdaterService ussdAutoUpdaterService = this.b;
        String str = null;
        switch (i) {
            case b85.b:
                if (intent != null) {
                    str = intent.getAction();
                }
                if (sg3.e(str, "android.intent.action.NEW_OUTGOING_CALL")) {
                    ussdAutoUpdaterService.J = System.currentTimeMillis();
                    return;
                }
                return;
            default:
                if (intent != null) {
                    str = intent.getAction();
                }
                if (sg3.e(str, "cu.lestebang.utiletecsa.action.SMS_SENT")) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - ussdAutoUpdaterService.L >= 10000) {
                        ussdAutoUpdaterService.L = currentTimeMillis;
                        String string = ussdAutoUpdaterService.getString(R.string.ussd_auto_trigger_sms);
                        string.getClass();
                        ussdAutoUpdaterService.i(string, new ha7(24));
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
