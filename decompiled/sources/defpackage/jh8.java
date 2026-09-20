package defpackage;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: jh8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class jh8 {
    public final int a;

    public jh8(int i) {
        this.a = i;
    }

    public static Status e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), (PendingIntent) null, (m11) null);
    }

    public abstract void a(Status status);

    public abstract void b(Exception exc);

    public abstract void c(k68 k68, boolean z);

    public abstract void d(ng8 ng8);
}
