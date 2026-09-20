package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;

/* renamed from: xy4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xy4 extends x21 {
    public final ConnectivityManager f;
    public final Object g = new Object();
    public volatile boolean h;
    public final db3 i = new db3(1, this);

    public xy4(Context context, qd8 qd8) {
        super(context, qd8);
        Object systemService = this.b.getSystemService("connectivity");
        systemService.getClass();
        this.f = (ConnectivityManager) systemService;
    }

    public final Object a() {
        return wy4.a(this.f, this.h);
    }

    public final void c() {
        try {
            bc4.k().e(wy4.a, "Registering network callback");
            ConnectivityManager connectivityManager = this.f;
            db3 db3 = this.i;
            connectivityManager.getClass();
            db3.getClass();
            connectivityManager.registerDefaultNetworkCallback(db3);
        } catch (IllegalArgumentException e) {
            bc4.k().i(wy4.a, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            bc4.k().i(wy4.a, "Received exception while registering network callback", e2);
        }
    }

    public final void d() {
        try {
            bc4.k().e(wy4.a, "Unregistering network callback");
            this.f.unregisterNetworkCallback(this.i);
        } catch (IllegalArgumentException e) {
            bc4.k().i(wy4.a, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            bc4.k().i(wy4.a, "Received exception while unregistering network callback", e2);
        }
    }
}
