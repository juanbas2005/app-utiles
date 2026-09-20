package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* renamed from: hh8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hh8 extends sg8 {
    public final i93 b;
    public final xb7 c;
    public final g22 d;

    public hh8(int i, i93 i93, xb7 xb7, g22 g22) {
        super(i);
        this.c = xb7;
        this.b = i93;
        this.d = g22;
        if (i == 2 && i93.a) {
            h.q("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
            throw null;
        }
    }

    public final void a(Status status) {
        ApiException apiException;
        this.d.getClass();
        if (status.y != null) {
            apiException = new ApiException(status);
        } else {
            apiException = new ApiException(status);
        }
        this.c.c(apiException);
    }

    public final void b(Exception exc) {
        this.c.c(exc);
    }

    public final void c(k68 k68, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        xb7 xb7 = this.c;
        ((Map) k68.y).put(xb7, valueOf);
        xb7.a.b(new k68(k68, xb7));
    }

    public final void d(ng8 ng8) {
        xb7 xb7 = this.c;
        try {
            this.b.c(ng8.e, xb7);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            a(jh8.e(e2));
        } catch (RuntimeException e3) {
            xb7.c(e3);
        }
    }

    public final cc2[] f(ng8 ng8) {
        return (cc2[]) this.b.c;
    }

    public final boolean g(ng8 ng8) {
        return this.b.a;
    }

    public final int h(ng8 ng8) {
        return this.b.b;
    }
}
