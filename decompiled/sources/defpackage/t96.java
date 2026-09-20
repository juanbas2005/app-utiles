package defpackage;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* renamed from: t96  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class t96 {
    public final v9 a;
    public final Proxy b;
    public final InetSocketAddress c;

    public t96(v9 v9Var, Proxy proxy, InetSocketAddress inetSocketAddress) {
        inetSocketAddress.getClass();
        this.a = v9Var;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t96)) {
            return false;
        }
        t96 t96 = (t96) obj;
        if (!t96.a.equals(this.a) || !t96.b.equals(this.b) || !sg3.e(t96.c, this.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + ((this.a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        String str;
        String hostAddress;
        StringBuilder sb = new StringBuilder();
        g73 g73 = this.a.h;
        String str2 = g73.d;
        InetSocketAddress inetSocketAddress = this.c;
        InetAddress address = inetSocketAddress.getAddress();
        if (address == null || (hostAddress = address.getHostAddress()) == null) {
            str = null;
        } else {
            str = bg8.b(hostAddress);
        }
        if (d57.y0(str2, ':')) {
            sb.append("[");
            sb.append(str2);
            sb.append("]");
        } else {
            sb.append(str2);
        }
        if (g73.e != inetSocketAddress.getPort() || str2.equals(str)) {
            sb.append(":");
            sb.append(g73.e);
        }
        if (!str2.equals(str)) {
            if (this.b.equals(Proxy.NO_PROXY)) {
                sb.append(" at ");
            } else {
                sb.append(" via proxy ");
            }
            if (str == null) {
                sb.append("<unresolved>");
            } else if (d57.y0(str, ':')) {
                sb.append("[");
                sb.append(str);
                sb.append("]");
            } else {
                sb.append(str);
            }
            sb.append(":");
            sb.append(inetSocketAddress.getPort());
        }
        return sb.toString();
    }
}
