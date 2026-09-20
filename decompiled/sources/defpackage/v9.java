package defpackage;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: v9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class v9 {
    public final yw1 a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final sm0 e;
    public final g22 f;
    public final ProxySelector g;
    public final g73 h;
    public final List i;
    public final List j;

    public v9(String str, int i2, yw1 yw1, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, sm0 sm0, g22 g22, List list, List list2, ProxySelector proxySelector) {
        String str2;
        str.getClass();
        yw1.getClass();
        socketFactory.getClass();
        g22.getClass();
        list.getClass();
        list2.getClass();
        proxySelector.getClass();
        this.a = yw1;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.e = sm0;
        this.f = g22;
        this.g = proxySelector;
        f73 f73 = new f73(0);
        if (sSLSocketFactory != null) {
            str2 = "https";
        } else {
            str2 = "http";
        }
        if (str2.equalsIgnoreCase("http")) {
            f73.c = "http";
        } else if (str2.equalsIgnoreCase("https")) {
            f73.c = "https";
        } else {
            h.q("unexpected scheme: ".concat(str2));
            throw null;
        }
        String b2 = bg8.b(ie1.T(0, 0, 7, str));
        if (b2 != null) {
            f73.f = b2;
            if (1 > i2 || i2 >= 65536) {
                h.j(hl6.k(i2, "unexpected port: "));
                throw null;
            }
            f73.b = i2;
            this.h = f73.c();
            this.i = fg8.j(list);
            this.j = fg8.j(list2);
            return;
        }
        h.q("unexpected host: ".concat(str));
        throw null;
    }

    public final boolean a(v9 v9Var) {
        v9Var.getClass();
        if (!sg3.e(this.a, v9Var.a) || !sg3.e(this.f, v9Var.f) || !sg3.e(this.i, v9Var.i) || !sg3.e(this.j, v9Var.j) || !sg3.e(this.g, v9Var.g) || !sg3.e(this.c, v9Var.c) || !sg3.e(this.d, v9Var.d) || !sg3.e(this.e, v9Var.e) || this.h.e != v9Var.h.e) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v9)) {
            return false;
        }
        v9 v9Var = (v9) obj;
        if (!sg3.e(this.h, v9Var.h) || !a(v9Var)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int h2 = hl6.h(527, 31, this.h.h);
        int hashCode = this.f.hashCode();
        int j2 = hl6.j(this.j, hl6.j(this.i, (hashCode + ((this.a.hashCode() + h2) * 31)) * 31, 31), 31);
        int hashCode2 = Objects.hashCode(this.c);
        int hashCode3 = Objects.hashCode(this.d);
        return Objects.hashCode(this.e) + ((hashCode3 + ((hashCode2 + ((this.g.hashCode() + j2) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        g73 g73 = this.h;
        sb.append(g73.d);
        sb.append(':');
        sb.append(g73.e);
        sb.append(", ");
        sb.append("proxySelector=" + this.g);
        sb.append('}');
        return sb.toString();
    }
}
