package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: hz8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hz8 extends y50 {
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        if (queryLocalInterface instanceof iy8) {
            return (iy8) queryLocalInterface;
        }
        return new cy8(iBinder);
    }

    public final int i() {
        return 12451000;
    }

    public final String m() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    public final String n() {
        return "com.google.android.gms.measurement.START";
    }
}
