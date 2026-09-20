package defpackage;

import android.telephony.ServiceState;
import android.telephony.TelephonyCallback;
import cu.lestebang.utiletecsa.feature.settings.service.GsmNetworkService;

/* renamed from: vx2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vx2 extends TelephonyCallback implements TelephonyCallback.ServiceStateListener {
    public final /* synthetic */ GsmNetworkService a;

    public vx2(GsmNetworkService gsmNetworkService) {
        this.a = gsmNetworkService;
    }

    public final void onServiceStateChanged(ServiceState serviceState) {
        boolean z;
        serviceState.getClass();
        if (serviceState.getState() == 0) {
            z = true;
        } else {
            z = false;
        }
        GsmNetworkService.b(this.a, z);
    }
}
