package defpackage;

import android.telephony.TelephonyManager;
import android.telephony.TelephonyManager$UssdResponseCallback;

/* renamed from: bz7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bz7 extends TelephonyManager$UssdResponseCallback {
    public final /* synthetic */ kk0 a;

    public bz7(kk0 kk0) {
        this.a = kk0;
    }

    public final void onReceiveUssdResponse(TelephonyManager telephonyManager, String str, CharSequence charSequence) {
        telephonyManager.getClass();
        str.getClass();
        charSequence.getClass();
        kk0 kk0 = this.a;
        if (kk0.u() instanceof o05) {
            kk0.E((vr2) null, charSequence.toString());
        }
    }

    public final void onReceiveUssdResponseFailed(TelephonyManager telephonyManager, String str, int i) {
        telephonyManager.getClass();
        str.getClass();
        kk0 kk0 = this.a;
        if (kk0.u() instanceof o05) {
            kk0.f(new m66(new Exception(hl6.k(i, "USSD request failed with code "))));
        }
    }
}
