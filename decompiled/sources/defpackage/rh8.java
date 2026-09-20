package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: rh8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rh8 extends iw2 {
    public final ec7 A;

    public rh8(Context context, Looper looper, kd6 kd6, ec7 ec7, ng8 ng8, ng8 ng82) {
        super(context, looper, 270, kd6, ng8, ng82, 0);
        this.A = ec7;
    }

    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        if (queryLocalInterface instanceof mh8) {
            return (mh8) queryLocalInterface;
        }
        return new gg8(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 0);
    }

    public final cc2[] f() {
        return h03.D0;
    }

    public final Bundle h() {
        ec7 ec7 = this.A;
        ec7.getClass();
        Bundle bundle = new Bundle();
        String str = ec7.w;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final int i() {
        return 203400000;
    }

    public final String m() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    public final String n() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    public final boolean o() {
        return true;
    }
}
