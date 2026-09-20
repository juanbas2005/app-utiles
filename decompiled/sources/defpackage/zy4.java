package defpackage;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;

/* renamed from: zy4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zy4 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ op5 a;

    public zy4(op5 op5) {
        this.a = op5;
    }

    public final void onAvailable(Network network) {
        network.getClass();
        super.onAvailable(network);
        this.a.c(uy4.w);
        yh7.a.getClass();
        hr2.x(new Object[0]);
    }

    public final void onBlockedStatusChanged(Network network, boolean z) {
        network.getClass();
        yh7.a.getClass();
        hr2.x(new Object[0]);
    }

    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        super.onCapabilitiesChanged(network, networkCapabilities);
        yh7.a.getClass();
        hr2.x(new Object[0]);
    }

    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        network.getClass();
        linkProperties.getClass();
        super.onLinkPropertiesChanged(network, linkProperties);
        yh7.a.getClass();
        hr2.x(new Object[0]);
    }

    public final void onLosing(Network network, int i) {
        network.getClass();
        super.onLosing(network, i);
        yh7.a.getClass();
        hr2.x(new Object[0]);
    }

    public final void onLost(Network network) {
        network.getClass();
        super.onLost(network);
        this.a.c(uy4.x);
        yh7.a.getClass();
        hr2.x(new Object[0]);
    }

    public final void onUnavailable() {
        super.onUnavailable();
        this.a.c(uy4.y);
        yh7.a.getClass();
        hr2.x(new Object[0]);
    }
}
