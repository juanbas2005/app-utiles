package defpackage;

import android.telephony.SignalStrength;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyManager;
import java.util.List;

/* renamed from: om0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class om0 extends TelephonyCallback implements TelephonyCallback.SignalStrengthsListener, TelephonyCallback.CellInfoListener {
    public final /* synthetic */ op5 a;
    public final /* synthetic */ TelephonyManager b;
    public final /* synthetic */ pm0 c;

    public om0(op5 op5, TelephonyManager telephonyManager, pm0 pm0) {
        this.a = op5;
        this.b = telephonyManager;
        this.c = pm0;
    }

    public final void onCellInfoChanged(List list) {
        list.getClass();
        this.a.c(n0.v(this.b, this.c, (SignalStrength) null, list, 8));
    }

    public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
        signalStrength.getClass();
        this.a.c(n0.v(this.b, this.c, signalStrength, (List) null, 16));
    }
}
