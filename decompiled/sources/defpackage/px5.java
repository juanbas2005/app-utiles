package defpackage;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: px5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class px5 {
    public final bc7 a;
    public final m22 b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final v9 i;
    public final br4 j;
    public final dx5 k;
    public final boolean l;
    public v86 m;
    public z96 n;
    public t96 o;
    public final as p = new as();

    public px5(bc7 bc7, m22 m22, int i2, int i3, int i4, int i5, boolean z, boolean z2, v9 v9Var, br4 br4, dx5 dx5, kd6 kd6) {
        bc7.getClass();
        m22.getClass();
        br4.getClass();
        this.a = bc7;
        this.b = m22;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = z;
        this.h = z2;
        this.i = v9Var;
        this.j = br4;
        this.k = dx5;
        this.l = !sg3.e((String) kd6.y, "GET");
    }

    public final boolean a(ex5 ex5) {
        z96 z96;
        t96 t96;
        if (this.p.isEmpty() && this.o == null) {
            if (ex5 != null) {
                synchronized (ex5) {
                    t96 = null;
                    if (ex5.l == 0) {
                        if (ex5.j) {
                            if (fg8.a(ex5.c.a.h, this.i.h)) {
                                t96 = ex5.c;
                            }
                        }
                    }
                }
                if (t96 != null) {
                    this.o = t96;
                    return true;
                }
            }
            v86 v86 = this.m;
            if ((v86 == null || v86.b >= v86.a.size()) && (z96 = this.n) != null) {
                return z96.a();
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0073 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0074  */
    public final y96 b() {
        m76 m76;
        f11 f11;
        String str;
        int i2;
        boolean contains;
        List<InetAddress> list;
        Socket socket;
        boolean z;
        ex5 ex5 = this.k.F;
        if (ex5 != null) {
            boolean g2 = ex5.g(this.l);
            synchronized (ex5) {
                boolean z2 = ex5.j;
                if (!g2) {
                    try {
                        ex5.j = true;
                        socket = this.k.k();
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    if (!z2) {
                        g73 g73 = ex5.c.a.h;
                        g73.getClass();
                        g73 g732 = this.i.h;
                        if (g73.e != g732.e || !sg3.e(g73.d, g732.d)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            socket = null;
                        }
                    }
                    socket = this.k.k();
                }
            }
            if (this.k.F == null) {
                if (socket != null) {
                    fg8.c(socket);
                }
                this.k.A.getClass();
            } else if (socket == null) {
                m76 = new m76(ex5);
                if (m76 == null) {
                    return m76;
                }
                m76 d2 = d((f11) null, (List) null);
                if (d2 != null) {
                    return d2;
                }
                if (!this.p.isEmpty()) {
                    return (y96) this.p.removeFirst();
                }
                t96 t96 = this.o;
                if (t96 != null) {
                    this.o = null;
                    f11 = c(t96, (ArrayList) null);
                } else {
                    v86 v86 = this.m;
                    if (v86 == null || v86.b >= v86.a.size()) {
                        z96 z96 = this.n;
                        if (z96 == null) {
                            z96 = new z96(this.i, this.j, this.k, this.h);
                            this.n = z96;
                        }
                        if (!z96.a()) {
                            rf2.i("exhausted all routes");
                            return null;
                        } else if (z96.a()) {
                            ArrayList arrayList = new ArrayList();
                            while (z96.f < z96.e.size()) {
                                if (z96.f < z96.e.size()) {
                                    List list2 = z96.e;
                                    int i3 = z96.f;
                                    z96.f = i3 + 1;
                                    Proxy proxy = (Proxy) list2.get(i3);
                                    ArrayList arrayList2 = new ArrayList();
                                    z96.g = arrayList2;
                                    if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                        g73 g733 = z96.a.h;
                                        str = g733.d;
                                        i2 = g733.e;
                                    } else {
                                        SocketAddress address = proxy.address();
                                        if (address instanceof InetSocketAddress) {
                                            InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                                            InetAddress address2 = inetSocketAddress.getAddress();
                                            if (address2 == null) {
                                                str = inetSocketAddress.getHostName();
                                                str.getClass();
                                            } else {
                                                str = address2.getHostAddress();
                                                str.getClass();
                                            }
                                            i2 = inetSocketAddress.getPort();
                                        } else {
                                            rf2.j("Proxy.address() is not an InetSocketAddress: ", address.getClass());
                                            return null;
                                        }
                                    }
                                    if (1 <= i2 && i2 < 65536) {
                                        if (proxy.type() == Proxy.Type.SOCKS) {
                                            arrayList2.add(InetSocketAddress.createUnresolved(str, i2));
                                        } else {
                                            k26 k26 = bg8.a;
                                            str.getClass();
                                            if (bg8.a.e(str)) {
                                                list = sg3.D(InetAddress.getByName(str));
                                            } else {
                                                z96.c.A.getClass();
                                                list = z96.a.a.b(str);
                                                if (!list.isEmpty()) {
                                                    z96.c.A.getClass();
                                                } else {
                                                    throw new UnknownHostException(z96.a.a + " returned no addresses for " + str);
                                                }
                                            }
                                            if (z96.d && list.size() >= 2) {
                                                ArrayList arrayList3 = new ArrayList();
                                                ArrayList arrayList4 = new ArrayList();
                                                for (Object next : list) {
                                                    if (((InetAddress) next) instanceof Inet6Address) {
                                                        arrayList3.add(next);
                                                    } else {
                                                        arrayList4.add(next);
                                                    }
                                                }
                                                if (!arrayList3.isEmpty() && !arrayList4.isEmpty()) {
                                                    byte[] bArr = dg8.a;
                                                    Iterator it = arrayList3.iterator();
                                                    Iterator it2 = arrayList4.iterator();
                                                    n74 m2 = sg3.m();
                                                    while (true) {
                                                        if (!it.hasNext() && !it2.hasNext()) {
                                                            break;
                                                        }
                                                        if (it.hasNext()) {
                                                            m2.add(it.next());
                                                        }
                                                        if (it2.hasNext()) {
                                                            m2.add(it2.next());
                                                        }
                                                    }
                                                    list = sg3.i(m2);
                                                }
                                            }
                                            for (InetAddress inetSocketAddress2 : list) {
                                                arrayList2.add(new InetSocketAddress(inetSocketAddress2, i2));
                                            }
                                        }
                                        for (InetSocketAddress t962 : z96.g) {
                                            t96 t963 = new t96(z96.a, proxy, t962);
                                            br4 br4 = z96.b;
                                            synchronized (br4) {
                                                contains = ((LinkedHashSet) br4.x).contains(t963);
                                            }
                                            if (contains) {
                                                z96.h.add(t963);
                                            } else {
                                                arrayList.add(t963);
                                            }
                                        }
                                        if (!arrayList.isEmpty()) {
                                            break;
                                        }
                                    } else {
                                        throw new SocketException("No route to " + str + ':' + i2 + "; port is out of range");
                                    }
                                } else {
                                    throw new SocketException("No route to " + z96.a.h.d + "; exhausted proxy configurations: " + z96.e);
                                }
                            }
                            if (arrayList.isEmpty()) {
                                it0.h0(arrayList, z96.h);
                                z96.h.clear();
                            }
                            v86 v862 = new v86(arrayList);
                            this.m = v862;
                            if (this.k.N) {
                                rf2.i("Canceled");
                                return null;
                            } else if (v862.b < arrayList.size()) {
                                int i4 = v862.b;
                                v862.b = i4 + 1;
                                f11 = c((t96) arrayList.get(i4), arrayList);
                            } else {
                                rf2.c();
                                return null;
                            }
                        } else {
                            rf2.c();
                            return null;
                        }
                    } else {
                        int i5 = v86.b;
                        ArrayList arrayList5 = v86.a;
                        if (i5 < arrayList5.size()) {
                            int i6 = v86.b;
                            v86.b = i6 + 1;
                            f11 = c((t96) arrayList5.get(i6), (ArrayList) null);
                        } else {
                            rf2.c();
                            return null;
                        }
                    }
                }
                m76 d3 = d(f11, f11.k);
                if (d3 != null) {
                    return d3;
                }
                return f11;
            } else {
                h.s("Check failed.");
                return null;
            }
        }
        m76 = null;
        if (m76 == null) {
        }
    }

    public final f11 c(t96 t96, ArrayList arrayList) {
        t96 t962 = t96;
        gu5 gu5 = gu5.H2_PRIOR_KNOWLEDGE;
        t962.getClass();
        v9 v9Var = t962.a;
        if (v9Var.c == null) {
            if (v9Var.j.contains(n11.f)) {
                String str = t962.a.h.d;
                ej5 ej5 = ej5.a;
                if (!ej5.a.h(str)) {
                    throw new UnknownServiceException(f21.h("CLEARTEXT communication to ", str, " not permitted by network security policy"));
                }
            } else {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
        } else if (v9Var.i.contains(gu5)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        kd6 kd6 = null;
        if (t962.b.type() == Proxy.Type.HTTP) {
            v9 v9Var2 = t962.a;
            if (v9Var2.c != null || v9Var2.i.contains(gu5)) {
                o9 o9Var = new o9(12);
                g73 g73 = t962.a.h;
                g73.getClass();
                o9Var.x = g73;
                o9Var.G("CONNECT", (f56) null);
                v9 v9Var3 = t962.a;
                o9Var.D("Host", fg8.i(v9Var3.h, true));
                o9Var.D("Proxy-Connection", "Keep-Alive");
                o9Var.D("User-Agent", "okhttp/5.4.0");
                kd6 = new kd6(o9Var);
                c66 c66 = d66.w;
                ArrayList arrayList2 = new ArrayList(20);
                za5.u("Proxy-Authenticate");
                za5.v("OkHttp-Preemptive", "Proxy-Authenticate");
                int i2 = 0;
                while (i2 < arrayList2.size()) {
                    if ("Proxy-Authenticate".equalsIgnoreCase((String) arrayList2.get(i2))) {
                        arrayList2.remove(i2);
                        arrayList2.remove(i2);
                        i2 -= 2;
                    }
                    i2 += 2;
                }
                arrayList2.add("Proxy-Authenticate");
                arrayList2.add(d57.k1("OkHttp-Preemptive").toString());
                new bz2((String[]) arrayList2.toArray(new String[0]));
                c66.getClass();
                v9Var3.f.getClass();
            }
        }
        return new f11(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.k, this, t962, arrayList, kd6, -1, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        if (r9 == false) goto L_0x003f;
     */
    public final m76 d(f11 f11, List list) {
        boolean z;
        ex5 ex5;
        boolean z2;
        Socket k2;
        boolean z3;
        m22 m22 = this.b;
        boolean z4 = this.l;
        v9 v9Var = this.i;
        dx5 dx5 = this.k;
        if (f11 == null || !f11.c()) {
            z = false;
        } else {
            z = true;
        }
        m22.getClass();
        Iterator it = ((ConcurrentLinkedQueue) m22.z).iterator();
        it.getClass();
        while (true) {
            if (!it.hasNext()) {
                ex5 = null;
                break;
            }
            ex5 = (ex5) it.next();
            ex5.getClass();
            synchronized (ex5) {
                if (z) {
                    try {
                        if (ex5.i != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (!ex5.d(v9Var, list)) {
                    z2 = false;
                } else {
                    dx5.b(ex5);
                    z2 = true;
                }
            }
            if (z2) {
                if (ex5.g(z4)) {
                    break;
                }
                synchronized (ex5) {
                    ex5.j = true;
                    k2 = dx5.k();
                }
                if (k2 != null) {
                    fg8.c(k2);
                }
            }
        }
        if (ex5 == null) {
            return null;
        }
        if (f11 != null) {
            this.o = f11.j;
            Socket socket = f11.q;
            if (socket != null) {
                fg8.c(socket);
            }
        }
        this.k.A.getClass();
        return new m76(ex5);
    }
}
