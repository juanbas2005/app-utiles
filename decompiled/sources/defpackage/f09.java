package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: f09  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class f09 extends BroadcastReceiver {
    public final v89 a;
    public boolean b;
    public boolean c;

    public f09(v89 v89) {
        z65.k(v89);
        this.a = v89;
    }

    public final void a() {
        v89 v89 = this.a;
        v89.j0();
        v89.n0().b1();
        v89.n0().b1();
        if (this.b) {
            v89.G().J.a("Unregistering connectivity change receiver");
            this.b = false;
            this.c = false;
            try {
                v89.H.w.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                v89.G().B.b("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    public final void onReceive(Context context, Intent intent) {
        v89 v89 = this.a;
        v89.j0();
        String action = intent.getAction();
        v89.G().J.b("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            xz8 xz8 = v89.x;
            v89.R(xz8);
            boolean g1 = xz8.g1();
            if (this.c != g1) {
                this.c = g1;
                v89.n0().l1(new ge(this, g1));
                return;
            }
            return;
        }
        v89.G().E.b("NetworkBroadcastReceiver received unknown action", action);
    }
}
