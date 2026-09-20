package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: di8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class di8 extends iw2 {
    public final ci8 A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public di8(Context context, Looper looper, kd6 kd6, ci8 ci8, ng8 ng8, ng8 ng82) {
        super(context, looper, 68, kd6, ng8, ng82, 0);
        ci8 = ci8 == null ? ci8.y : ci8;
        k68 k68 = new k68(10, false);
        k68.x = Boolean.FALSE;
        ci8 ci82 = ci8.y;
        ci8.getClass();
        k68.x = Boolean.valueOf(ci8.w);
        k68.y = ci8.x;
        k68.y = yh8.a();
        this.A = new ci8(k68);
    }

    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (queryLocalInterface instanceof fi8) {
            return (fi8) queryLocalInterface;
        }
        return new gg8(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", 1);
    }

    public final Bundle h() {
        ci8 ci8 = this.A;
        ci8.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", (String) null);
        bundle.putBoolean("force_save_dialog", ci8.w);
        bundle.putString("log_session_id", ci8.x);
        return bundle;
    }

    public final int i() {
        return 12800000;
    }

    public final String m() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    public final String n() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
