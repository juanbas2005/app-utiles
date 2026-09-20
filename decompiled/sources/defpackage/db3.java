package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import cu.lestebang.utiletecsa.R;
import cu.lestebang.utiletecsa.feature.settings.service.UssdAutoUpdaterService;
import java.util.Set;

/* renamed from: db3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class db3 extends ConnectivityManager.NetworkCallback {
    public static final /* synthetic */ int c = 0;
    public final /* synthetic */ int a;
    public final Object b;

    public db3(w34 w34) {
        this.a = 0;
        this.b = w34;
    }

    public void onAvailable(Network network) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 2:
                cf4.a((cf4) obj, network, true);
                return;
            case 3:
                network.getClass();
                rz6 rz6 = (rz6) obj;
                if (rz6.f.add(network)) {
                    rz6.a();
                    return;
                }
                return;
            case 4:
                network.getClass();
                ((UssdAutoUpdaterService) obj).O = true;
                return;
            default:
                super.onAvailable(network);
                return;
        }
    }

    /* JADX INFO: finally extract failed */
    public void onBlockedStatusChanged(Network network, boolean z) {
        switch (this.a) {
            case 1:
                network.getClass();
                if (network.equals(((xy4) this.b).f.getActiveNetwork())) {
                    bc4 k = bc4.k();
                    String str = wy4.a;
                    k.e(str, "Network blocked status changed: " + z);
                    xy4 xy4 = (xy4) this.b;
                    Object obj = xy4.e;
                    if (obj == null) {
                        obj = xy4.a();
                    }
                    vy4 vy4 = (vy4) obj;
                    xy4 xy42 = (xy4) this.b;
                    synchronized (xy42.g) {
                        try {
                            if (xy42.h != z) {
                                xy42.h = z;
                                ((xy4) this.b).b(new vy4(vy4.a, vy4.b, vy4.c, vy4.d, z));
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } else {
                    return;
                }
            default:
                super.onBlockedStatusChanged(network, z);
                return;
        }
    }

    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.a) {
            case b85.b:
                network.getClass();
                networkCapabilities.getClass();
                bc4.k().e(bd8.a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
                ((w34) this.b).y(p31.a);
                return;
            case 1:
                network.getClass();
                networkCapabilities.getClass();
                bc4 k = bc4.k();
                String str = wy4.a;
                k.e(str, "Network capabilities changed: " + networkCapabilities);
                xy4 xy4 = (xy4) this.b;
                xy4.b(wy4.a(xy4.f, xy4.h));
                return;
            case 3:
                rz6 rz6 = (rz6) this.b;
                Set set = rz6.f;
                network.getClass();
                networkCapabilities.getClass();
                if (networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0)) {
                    if (set.add(network)) {
                        rz6.a();
                        return;
                    }
                    return;
                } else if (set.remove(network)) {
                    rz6.a();
                    return;
                } else {
                    return;
                }
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                return;
        }
    }

    public final void onLost(Network network) {
        boolean z;
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case b85.b:
                network.getClass();
                bc4.k().e(bd8.a, "NetworkRequestConstraintController onLost callback");
                ((w34) obj).y(new q31(7));
                return;
            case 1:
                network.getClass();
                bc4.k().e(wy4.a, "Network connection lost");
                ((xy4) obj).b(new vy4(false, false, false, false, false));
                return;
            case 2:
                cf4.a((cf4) obj, network, false);
                return;
            case 3:
                network.getClass();
                rz6 rz6 = (rz6) obj;
                if (rz6.f.remove(network)) {
                    rz6.a();
                    return;
                }
                return;
            default:
                network.getClass();
                UssdAutoUpdaterService ussdAutoUpdaterService = (UssdAutoUpdaterService) obj;
                if (ussdAutoUpdaterService.O) {
                    ConnectivityManager connectivityManager = ussdAutoUpdaterService.M;
                    if (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
                        z = false;
                    } else {
                        z = networkCapabilities.hasTransport(0);
                    }
                    if (!z) {
                        ussdAutoUpdaterService.O = false;
                        String string = ussdAutoUpdaterService.getString(R.string.ussd_auto_trigger_data);
                        string.getClass();
                        ussdAutoUpdaterService.i(string, new ha7(22));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ db3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
