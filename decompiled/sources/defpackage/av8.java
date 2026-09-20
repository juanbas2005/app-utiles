package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* renamed from: av8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class av8 extends lg8 {
    public y50 e;
    public final int f;

    public av8(y50 y50, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 2);
        this.e = y50;
        this.f = i;
    }

    public final boolean K(int i, Parcel parcel, Parcel parcel2) {
        g96 g96;
        if (i == 1) {
            et8.c(parcel);
            z65.l("onPostInitComplete can be called only once per call to getRemoteService", this.e);
            y50 y50 = this.e;
            int i2 = this.f;
            y50.getClass();
            zw8 zw8 = new zw8(y50, parcel.readInt(), parcel.readStrongBinder(), (Bundle) et8.a(parcel, Bundle.CREATOR));
            er8 er8 = y50.f;
            er8.sendMessage(er8.obtainMessage(1, i2, -1, zw8));
            this.e = null;
        } else if (i == 2) {
            parcel.readInt();
            Bundle bundle = (Bundle) et8.a(parcel, Bundle.CREATOR);
            et8.c(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else if (i != 3) {
            return false;
        } else {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            s29 s29 = (s29) et8.a(parcel, s29.CREATOR);
            et8.c(parcel);
            y50 y502 = this.e;
            z65.l("onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService", y502);
            z65.k(s29);
            y502.w = s29;
            if (y502.s()) {
                p11 p11 = s29.z;
                f96 z = f96.z();
                if (p11 == null) {
                    g96 = null;
                } else {
                    g96 = p11.w;
                }
                synchronized (z) {
                    if (g96 == null) {
                        g96 = f96.z;
                    } else {
                        g96 g962 = (g96) z.x;
                        if (g962 != null) {
                            if (g962.w < g96.w) {
                            }
                        }
                    }
                    z.x = g96;
                }
            }
            Bundle bundle2 = s29.w;
            z65.l("onPostInitComplete can be called only once per call to getRemoteService", this.e);
            y50 y503 = this.e;
            int i3 = this.f;
            y503.getClass();
            zw8 zw82 = new zw8(y503, readInt, readStrongBinder, bundle2);
            er8 er82 = y503.f;
            er82.sendMessage(er82.obtainMessage(1, i3, -1, zw82));
            this.e = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
