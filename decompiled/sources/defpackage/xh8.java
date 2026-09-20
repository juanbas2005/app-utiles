package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: xh8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xh8 extends iw2 {
    public final Bundle A = new Bundle();

    public xh8(Context context, Looper looper, kd6 kd6, ng8 ng8, ng8 ng82) {
        super(context, looper, 212, kd6, ng8, ng82, 0);
    }

    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
        if (queryLocalInterface instanceof ni8) {
            return (ni8) queryLocalInterface;
        }
        return new gg8(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService", 1);
    }

    public final cc2[] f() {
        return rd3.n;
    }

    public final Bundle h() {
        return this.A;
    }

    public final int i() {
        return 17895000;
    }

    public final String m() {
        return "com.google.android.gms.auth.api.identity.internal.ISignInService";
    }

    public final String n() {
        return "com.google.android.gms.auth.api.identity.service.signin.START";
    }

    public final boolean o() {
        return true;
    }

    public final boolean s() {
        return true;
    }
}
