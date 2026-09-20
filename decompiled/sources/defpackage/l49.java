package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: l49  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class l49 extends iw2 {
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.oss.licenses.IOSSLicenseService");
        if (queryLocalInterface instanceof br8) {
            return (br8) queryLocalInterface;
        }
        return new br8(iBinder);
    }

    public final int i() {
        return 12600000;
    }

    public final String m() {
        return "com.google.android.gms.oss.licenses.IOSSLicenseService";
    }

    public final String n() {
        return "com.google.android.gms.oss.licenses.service.START";
    }
}
