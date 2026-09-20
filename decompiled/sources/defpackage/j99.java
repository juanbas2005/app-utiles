package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: j99  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class j99 implements k39 {
    public final tu8 a;
    public final /* synthetic */ AppMeasurementDynamiteService b;

    public j99(AppMeasurementDynamiteService appMeasurementDynamiteService, tu8 tu8) {
        this.b = appMeasurementDynamiteService;
        this.a = tu8;
    }

    public final void a(String str, String str2, Bundle bundle, long j) {
        try {
            this.a.g(str, str2, bundle, j);
        } catch (RemoteException e) {
            RemoteException remoteException = e;
            y19 y19 = this.b.d;
            if (y19 != null) {
                pz8 pz8 = y19.B;
                y19.g(pz8);
                pz8.E.b("Event listener threw exception", remoteException);
            }
        }
    }
}
