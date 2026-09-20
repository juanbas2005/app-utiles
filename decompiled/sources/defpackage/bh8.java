package defpackage;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* renamed from: bh8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bh8 extends jh8 {
    public final hi8 b;

    public bh8(hi8 hi8) {
        super(1);
        this.b = hi8;
    }

    public final void a(Status status) {
        try {
            this.b.g(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    public final void b(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        try {
            this.b.g(new Status(10, f21.m(new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length()), simpleName, ": ", localizedMessage), (PendingIntent) null, (m11) null));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    public final void c(k68 k68, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        hi8 hi8 = this.b;
        ((Map) k68.x).put(hi8, valueOf);
        hi8.a(new qh8(k68, hi8));
    }

    public final void d(ng8 ng8) {
        hi8 hi8;
        try {
            hi8 = this.b;
            iw2 iw2 = ng8.e;
            hi8.getClass();
            hi8.f(iw2);
        } catch (DeadObjectException e) {
            hi8.g(new Status(8, e.getLocalizedMessage(), (PendingIntent) null, (m11) null));
            throw e;
        } catch (RemoteException e2) {
            hi8.g(new Status(8, e2.getLocalizedMessage(), (PendingIntent) null, (m11) null));
        } catch (RuntimeException e3) {
            b(e3);
        }
    }
}
