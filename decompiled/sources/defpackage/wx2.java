package defpackage;

import android.app.Service;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import cu.lestebang.utiletecsa.feature.settings.service.GsmNetworkService;
import cu.lestebang.utiletecsa.feature.settings.service.UssdAutoUpdaterService;

/* renamed from: wx2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wx2 extends PhoneStateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Service b;

    public /* synthetic */ wx2(Service service, int i) {
        this.a = i;
        this.b = service;
    }

    public void onCallStateChanged(int i, String str) {
        switch (this.a) {
            case 1:
                if (i == 0) {
                    UssdAutoUpdaterService.c((UssdAutoUpdaterService) this.b);
                    return;
                }
                return;
            default:
                super.onCallStateChanged(i, str);
                return;
        }
    }

    public void onServiceStateChanged(ServiceState serviceState) {
        switch (this.a) {
            case b85.b:
                GsmNetworkService gsmNetworkService = (GsmNetworkService) this.b;
                boolean z = false;
                if (serviceState != null && serviceState.getState() == 0) {
                    z = true;
                }
                GsmNetworkService.b(gsmNetworkService, z);
                return;
            default:
                super.onServiceStateChanged(serviceState);
                return;
        }
    }
}
