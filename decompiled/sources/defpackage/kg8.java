package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: kg8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kg8 extends iw2 {
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientNotificationTelemetryService");
        if (queryLocalInterface instanceof kh8) {
            return (kh8) queryLocalInterface;
        }
        return new gg8(iBinder, "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService", 0);
    }

    public final cc2[] f() {
        return h03.D0;
    }

    public final int i() {
        return 253600000;
    }

    public final String m() {
        return "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService";
    }

    public final String n() {
        return "com.google.android.gms.common.telemetry.notification.service.START";
    }

    public final boolean o() {
        return true;
    }
}
