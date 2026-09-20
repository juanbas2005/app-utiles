package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: dv8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dv8 extends iw2 {
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cloudmessaging.internal.ICloudMessagingService");
        if (queryLocalInterface instanceof ew8) {
            return (ew8) queryLocalInterface;
        }
        return new ew8(iBinder);
    }

    public final cc2[] f() {
        return dh4.A;
    }

    public final int i() {
        return 261200000;
    }

    public final String m() {
        return "com.google.android.gms.cloudmessaging.internal.ICloudMessagingService";
    }

    public final String n() {
        return "com.google.android.gms.cloudmessaging.service.START";
    }

    public final boolean s() {
        return true;
    }
}
