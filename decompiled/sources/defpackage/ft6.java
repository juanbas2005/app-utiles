package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: ft6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ft6 extends iw2 {
    public final boolean A = true;
    public final kd6 B;
    public final Bundle C;
    public final Integer D;

    /* JADX WARNING: Illegal instructions before constructor call */
    public ft6(Context context, Looper looper, kd6 kd6, Bundle bundle, nw2 nw2, ow2 ow2) {
        super(context, looper, 44, r4, nw2, ow2, 0);
        kd6 kd62 = kd6;
        this.B = kd62;
        this.C = bundle;
        this.D = (Integer) kd62.C;
    }

    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof dh8) {
            return (dh8) queryLocalInterface;
        }
        return new gg8(iBinder, "com.google.android.gms.signin.internal.ISignInService", 0);
    }

    public final Bundle h() {
        kd6 kd6 = this.B;
        boolean equals = this.c.getPackageName().equals((String) kd6.z);
        Bundle bundle = this.C;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) kd6.z);
        }
        return bundle;
    }

    public final int i() {
        return 12451000;
    }

    public final String m() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    public final String n() {
        return "com.google.android.gms.signin.service.START";
    }

    public final boolean r() {
        return this.A;
    }
}
