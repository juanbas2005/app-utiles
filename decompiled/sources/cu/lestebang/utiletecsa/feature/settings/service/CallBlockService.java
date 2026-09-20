package cu.lestebang.utiletecsa.feature.settings.service;

import android.telecom.Call;
import android.telecom.CallScreeningService;
import kotlin.Metadata;
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcu/lestebang/utiletecsa/feature/settings/service/CallBlockService;", "Landroid/telecom/CallScreeningService;", "<init>", "()V", "settings"}, k = 1, mv = {2, 4, b85.b}, xi = h75.h)
/* loaded from: classes.dex */
public final class CallBlockService extends CallScreeningService implements nu2 {
    public final ig0 A;
    public volatile yl6 w;
    public final Object x = new Object();
    public boolean y = false;
    public vp6 z;

    public CallBlockService() {
        w77 d = b85.d();
        dn1 dn1Var = aw1.a;
        this.A = gl0.E(rc9.D0(d, cm1.y));
    }

    @Override // defpackage.nu2
    public final Object a() {
        if (this.w == null) {
            synchronized (this.x) {
                try {
                    if (this.w == null) {
                        this.w = new yl6(this);
                    }
                } finally {
                }
            }
        }
        return this.w.a();
    }

    @Override // android.app.Service
    public final void onCreate() {
        if (!this.y) {
            this.y = true;
            this.z = (vp6) ((sd1) ((li0) a())).a.x.get();
        }
        super.onCreate();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        gl0.J(this.A, null);
        super.onDestroy();
    }

    @Override // android.telecom.CallScreeningService
    public final void onScreenCall(Call.Details details) {
        int callDirection;
        details.getClass();
        callDirection = details.getCallDirection();
        if (callDirection != 0) {
            respondToCall(details, new CallScreeningService.CallResponse.Builder().build());
            return;
        }
        ar7.H(this.A, null, null, new ng(details, getApplicationContext(), this, (f61) null, 2), 3);
    }
}
