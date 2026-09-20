package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: cw8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cw8 implements ServiceConnection {
    public final int w;
    public final /* synthetic */ y50 x;

    public cw8(y50 y50, int i) {
        this.x = y50;
        this.w = i;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        vi8 vi8;
        y50 y50 = this.x;
        if (iBinder == null) {
            y50.u();
            return;
        }
        synchronized (y50.h) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof vi8)) {
                    vi8 = new vi8(iBinder);
                } else {
                    vi8 = (vi8) queryLocalInterface;
                }
                y50.i = vi8;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        y50 y502 = this.x;
        int i = this.w;
        y502.getClass();
        dy8 dy8 = new dy8(y502, 0, (Bundle) null);
        er8 er8 = y502.f;
        er8.sendMessage(er8.obtainMessage(7, i, -1, dy8));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        y50 y50 = this.x;
        synchronized (y50.h) {
            y50.i = null;
        }
        y50 y502 = this.x;
        int i = this.w;
        er8 er8 = y502.f;
        er8.sendMessage(er8.obtainMessage(6, i, 1));
    }
}
