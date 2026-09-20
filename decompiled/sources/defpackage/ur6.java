package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: ur6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ur6 extends ConnectivityManager.NetworkCallback {
    public static final ur6 a = new ConnectivityManager.NetworkCallback();
    public static final Object b = new Object();
    public static final LinkedHashMap c = new LinkedHashMap();
    public static NetworkCapabilities d;
    public static boolean e;
    public static Boolean f;

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
        r0 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0072, code lost:
        if (r0.hasNext() == false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0074, code lost:
        r1 = (defpackage.yb5) r0.next();
        ((defpackage.vr2) r1.w).y((defpackage.r31) r1.x);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0086, code lost:
        return;
     */
    public static void a() {
        boolean z;
        Object obj;
        ArrayList arrayList = new ArrayList();
        synchronized (b) {
            try {
                if (e) {
                    if (f != null) {
                        for (Map.Entry entry : c.entrySet()) {
                            vr2 vr2 = (vr2) entry.getKey();
                            NetworkRequest networkRequest = (NetworkRequest) entry.getValue();
                            ur6 ur6 = a;
                            NetworkCapabilities networkCapabilities = d;
                            ur6.getClass();
                            Boolean bool = f;
                            bool.getClass();
                            if (bool.booleanValue() || !networkRequest.canBeSatisfiedBy(networkCapabilities)) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (z) {
                                obj = p31.a;
                            } else {
                                obj = new q31(7);
                            }
                            arrayList.add(new yb5(vr2, obj));
                        }
                    }
                }
                bc4 k = bc4.k();
                String str = bd8.a;
                k.e(str, "Not dispatching constraint state yet: isBlocked=" + f + ", capabilitiesInitialized=" + e);
            } finally {
            }
        }
    }

    public final void onBlockedStatusChanged(Network network, boolean z) {
        network.getClass();
        bc4 k = bc4.k();
        String str = bd8.a;
        k.e(str, "NetworkRequestConstraintController onBlockedStatusChanged callback " + z);
        synchronized (b) {
            if (!sg3.e(f, Boolean.valueOf(z))) {
                f = Boolean.valueOf(z);
                a();
            }
        }
    }

    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        bc4.k().e(bd8.a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        synchronized (b) {
            d = networkCapabilities;
            e = true;
        }
        a();
    }

    public final void onLost(Network network) {
        network.getClass();
        bc4.k().e(bd8.a, "NetworkRequestConstraintController onLost callback");
        synchronized (b) {
            d = null;
            for (vr2 y : c.keySet()) {
                y.y(new q31(7));
            }
        }
    }
}
