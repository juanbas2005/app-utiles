package defpackage;

import android.telephony.TelephonyCallback;
import cu.lestebang.utiletecsa.feature.settings.service.UssdAutoUpdaterService;

/* renamed from: ry7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ry7 extends TelephonyCallback implements TelephonyCallback.CallStateListener {
    public final /* synthetic */ UssdAutoUpdaterService a;

    public ry7(UssdAutoUpdaterService ussdAutoUpdaterService) {
        this.a = ussdAutoUpdaterService;
    }

    public final void onCallStateChanged(int i) {
        if (i == 0) {
            UssdAutoUpdaterService.c(this.a);
        }
    }
}
