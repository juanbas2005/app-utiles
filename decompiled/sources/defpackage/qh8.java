package defpackage;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* renamed from: qh8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qh8 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ BasePendingResult b;
    public final /* synthetic */ Object c;

    public qh8(k68 k68, BasePendingResult basePendingResult) {
        this.b = basePendingResult;
        Objects.requireNonNull(k68);
        this.c = k68;
    }

    public final void a(Status status) {
        ApiException apiException;
        p66 p66;
        switch (this.a) {
            case b85.b:
                if (status.f()) {
                    BasePendingResult basePendingResult = this.b;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    z65.m("Result has already been consumed.", !basePendingResult.g);
                    try {
                        if (!basePendingResult.b.await(0, timeUnit)) {
                            basePendingResult.c(Status.D);
                        }
                    } catch (InterruptedException unused) {
                        basePendingResult.c(Status.B);
                    }
                    z65.m("Result is not ready.", basePendingResult.d());
                    synchronized (basePendingResult.a) {
                        z65.m("Result has already been consumed.", !basePendingResult.g);
                        z65.m("Result is not ready.", basePendingResult.d());
                        p66 = basePendingResult.e;
                        basePendingResult.e = null;
                        basePendingResult.g = true;
                    }
                    if (basePendingResult.d.getAndSet((Object) null) == null) {
                        z65.k(p66);
                        ((xb7) this.c).b((Object) null);
                        return;
                    }
                    ku4.a();
                    return;
                }
                xb7 xb7 = (xb7) this.c;
                if (status.y != null) {
                    apiException = new ApiException(status);
                } else {
                    apiException = new ApiException(status);
                }
                xb7.a(apiException);
                return;
            default:
                ((Map) ((k68) this.c).x).remove(this.b);
                return;
        }
    }

    public qh8(BasePendingResult basePendingResult, xb7 xb7, tz2 tz2) {
        this.b = basePendingResult;
        this.c = xb7;
    }
}
