package defpackage;

import android.net.ConnectivityManager;

/* renamed from: oy4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class oy4 implements j21 {
    public final ConnectivityManager a;

    public oy4(ConnectivityManager connectivityManager) {
        this.a = connectivityManager;
    }

    public final boolean a(be8 be8) {
        if (!c(be8)) {
            return false;
        }
        h.s("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        return false;
    }

    public final xi0 b(j31 j31) {
        j31.getClass();
        return gr8.w(new ii3((Object) j31, (Object) this, (f61) null, 9));
    }

    public final boolean c(be8 be8) {
        be8.getClass();
        if (be8.j.a() == null && be8.j.a == yy4.w) {
            return false;
        }
        return true;
    }
}
