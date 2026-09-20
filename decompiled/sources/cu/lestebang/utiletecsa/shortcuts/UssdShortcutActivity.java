package cu.lestebang.utiletecsa.shortcuts;

import android.os.Bundle;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcu/lestebang/utiletecsa/shortcuts/UssdShortcutActivity;", "Lrv0;", "<init>", "()V", "app"}, k = 1, mv = {2, 4, b85.b}, xi = h75.h)
/* loaded from: classes.dex */
public final class UssdShortcutActivity extends rv0 implements nu2 {
    public static final Map X = sf4.V(new yb5("saldo", az7.CONSULTAR_SALDO), new yb5("datos", az7.CONSULTAR_DATOS), new yb5("voz", az7.CONSULTAR_MINUTOS), new yb5("sms", az7.CONSULTAR_SMS));
    public volatile k8 R;
    public final Object S = new Object();
    public boolean T = false;
    public nz7 U;
    public vp6 V;
    public rg5 W;

    public UssdShortcutActivity() {
        m(new xn(this, 3));
    }

    @Override // defpackage.nu2
    public final Object a() {
        return p().a();
    }

    @Override // defpackage.rv0, defpackage.ry2
    public final w58 c() {
        return h49.x(this, super.c());
    }

    @Override // defpackage.rv0, defpackage.qv0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        q(bundle);
        az7 az7Var = (az7) X.get(getIntent().getStringExtra("ussd_action"));
        if (az7Var == null) {
            finish();
        } else {
            ar7.H(t49.O(this), null, null, new pd7(this, az7Var, null, 4), 3);
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        v70 v70Var = p().A;
        if (v70Var != null) {
            v70Var.y = null;
        }
    }

    public final k8 p() {
        if (this.R == null) {
            synchronized (this.S) {
                try {
                    if (this.R == null) {
                        this.R = new k8(this);
                    }
                } finally {
                }
            }
        }
        return this.R;
    }

    public final void q(Bundle bundle) {
        super.onCreate(bundle);
        p().c();
    }
}
