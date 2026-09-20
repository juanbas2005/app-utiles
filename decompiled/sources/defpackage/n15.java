package defpackage;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;

/* renamed from: n15  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class n15 extends ProxySelector {
    public static final n15 a = new ProxySelector();

    public final List select(URI uri) {
        if (uri != null) {
            return sg3.D(Proxy.NO_PROXY);
        }
        h.q("uri must not be null");
        return null;
    }

    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }
}
