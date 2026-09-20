package cu.lestebang.utiletecsa.widget;

import android.os.Bundle;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcu/lestebang/utiletecsa/widget/VpnToggleActivity;", "Lrv0;", "<init>", "()V", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class VpnToggleActivity extends rv0 implements nu2 {
    public static final /* synthetic */ int X = 0;
    public volatile k8 R;
    public final Object S = new Object();
    public boolean T = false;
    public p7 U;
    public v78 V;
    public final a9 W;

    public VpnToggleActivity() {
        m(new xn(this, 4));
        this.W = o(new c9(20, this), new s8(false, 4));
    }

    public final Object a() {
        return p().a();
    }

    public final w58 c() {
        return h49.x(this, super.c());
    }

    public final void onCreate(Bundle bundle) {
        r(bundle);
        ar7.H(t49.O(this), (e81) null, (r81) null, new c88(this, (f61) null, 1), 3);
    }

    public final void onDestroy() {
        super.onDestroy();
        v70 v70 = p().A;
        if (v70 != null) {
            v70.y = null;
        }
    }

    public final k8 p() {
        if (this.R == null) {
            synchronized (this.S) {
                try {
                    if (this.R == null) {
                        this.R = new k8(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.R;
    }

    public final v78 q() {
        v78 v78 = this.V;
        if (v78 != null) {
            return v78;
        }
        sg3.a0("vpnRepository");
        throw null;
    }

    public final void r(Bundle bundle) {
        super.onCreate(bundle);
        p().c();
    }
}
