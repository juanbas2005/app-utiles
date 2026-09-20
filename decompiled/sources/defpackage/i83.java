package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: i83  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class i83 extends iw2 {
    public final IInterface b(IBinder iBinder) {
        iBinder.getClass();
        int i = p73.e;
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        if (queryLocalInterface instanceof q73) {
            return (q73) queryLocalInterface;
        }
        return new o73(iBinder);
    }

    public final cc2[] f() {
        return uq3.i;
    }

    public final int i() {
        return 17895000;
    }

    public final String m() {
        return "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService";
    }

    public final String n() {
        return "com.google.android.gms.identitycredentials.service.START";
    }

    public final boolean o() {
        return true;
    }

    public final boolean s() {
        return true;
    }
}
