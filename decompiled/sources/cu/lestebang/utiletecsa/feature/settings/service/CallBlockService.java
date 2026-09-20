package cu.lestebang.utiletecsa.feature.settings.service;

import android.telecom.Call;
import android.telecom.CallScreeningService;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcu/lestebang/utiletecsa/feature/settings/service/CallBlockService;", "Landroid/telecom/CallScreeningService;", "<init>", "()V", "settings"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class CallBlockService extends CallScreeningService implements nu2 {
    public final ig0 A;
    public volatile yl6 w;
    public final Object x = new Object();
    public boolean y = false;
    public vp6 z;

    public CallBlockService() {
        w77 d = b85.d();
        dn1 dn1 = aw1.a;
        this.A = gl0.E(rc9.D0(d, cm1.y));
    }

    public final Object a() {
        if (this.w == null) {
            synchronized (this.x) {
                try {
                    if (this.w == null) {
                        this.w = new yl6(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.w.a();
    }

    public final void onCreate() {
        if (!this.y) {
            this.y = true;
            this.z = (vp6) ((sd1) ((li0) a())).a.x.get();
        }
        super.onCreate();
    }

    public final void onDestroy() {
        gl0.J(this.A, (CancellationException) null);
        super.onDestroy();
    }

    public final void onScreenCall(Call.Details details) {
        details.getClass();
        if (details.getCallDirection() != 0) {
            respondToCall(details, new CallScreeningService.CallResponse.Builder().build());
            return;
        }
        ar7.H(this.A, (e81) null, (r81) null, new ng((Object) details, (Object) getApplicationContext(), (Object) this, (f61) null, 2), 3);
    }
}
