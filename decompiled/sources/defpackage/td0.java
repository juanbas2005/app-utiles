package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.io.InputStream;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: td0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class td0 implements xv0, s51, y15, gj5, rr0, q77, s61, y43, xx5 {
    public static final td0 A = new td0(4);
    public static final td0 B = new td0(5);
    public static final td0 C = new td0(6);
    public static final td0 D = new td0(7);
    public static wh3 E;
    public static final td0 F = new td0(8);
    public static final td0 G = new td0(9);
    public static final td0 H = new td0(10);
    public static final td0 I = new td0(11);
    public static final td0 J = new td0(12);
    public static final td0 K = new td0(13);
    public static final td0 L = new td0(14);
    public static final td0 M = new td0(15);
    public static final /* synthetic */ td0 N = new td0(16);
    public static final td0 O = new td0(17);
    public static final /* synthetic */ td0 P = new td0(18);
    public static final td0 x = new td0(1);
    public static final td0 y = new td0(2);
    public static final td0 z = new td0(3);
    public final /* synthetic */ int w;

    public /* synthetic */ td0(int i) {
        this.w = i;
    }

    public static boolean A(td0 td0, uo7 uo7, zw3 zw3, zw3 zw32) {
        Boolean bool;
        eq7 eq7 = uo7.c;
        zw3.getClass();
        zw32.getClass();
        if (zw3 == zw32) {
            return true;
        }
        gs2 O2 = eq7.O();
        if (O2 != null) {
            bool = (Boolean) O2.H(zw3, zw32);
        } else {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return x.r(uo7, eq7, zw3, zw32);
    }

    public static void B(eq7 eq7, zw3 zw3, zw3 zw32) {
        eq7.getClass();
        v76 n0 = eq7.n0(zw3);
        if (n0 instanceof nl0) {
            nl0 nl0 = (nl0) n0;
            if (!eq7.e(nl0)) {
                ml0 r = eq7.r(nl0);
                r.getClass();
                qo7 Z = eq7.Z(r);
                Z.getClass();
                if (eq7.f(Z) && eq7.G(nl0) == cl0.w) {
                    eq7.i0(zw32);
                }
            }
        }
    }

    public static InputStream D(String str) {
        str.getClass();
        ClassLoader classLoader = td0.class.getClassLoader();
        if (classLoader == null) {
            return ClassLoader.getSystemResourceAsStream(str);
        }
        URL resource = classLoader.getResource(str);
        if (resource == null) {
            return null;
        }
        URLConnection openConnection = resource.openConnection();
        openConnection.setUseCaches(false);
        return openConnection.getInputStream();
    }

    public static dg0 E(byte[] bArr) {
        int length = bArr.length;
        t49.x((long) bArr.length, 0, (long) length);
        return new dg0(qs.P0(bArr, 0, length));
    }

    public static sa6 F(oi3 oi3) {
        oi3.getClass();
        return new sa6((c16) oi3);
    }

    public static final tp0 j(td0 td0, String str) {
        tp0 tp0 = new tp0(str);
        tp0.d.put(str, tp0);
        return tp0;
    }

    public static final boolean m(eq7 eq7, v76 v76) {
        eq7.getClass();
        if (!eq7.L(v76)) {
            if (!(v76 instanceof nl0)) {
                return false;
            }
            ml0 r = eq7.r((nl0) v76);
            r.getClass();
            qo7 Z = eq7.Z(r);
            Z.getClass();
            zw3 p = eq7.p(Z);
            if (p == null || !eq7.L(eq7.V(p))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean n(eq7 eq7, uo7 uo7, v76 v76, v76 v762, boolean z2) {
        eq7.getClass();
        Iterable<zw3> R = eq7.R(v76);
        if ((R instanceof Collection) && ((Collection) R).isEmpty()) {
            return false;
        }
        for (zw3 zw3 : R) {
            zw3.getClass();
            if (sg3.e(eq7.i0(zw3), eq7.F(v762))) {
                return true;
            }
            if (z2 && A(x, uo7, v762, zw3)) {
                return true;
            }
        }
        return false;
    }

    public static List o(uo7 uo7, eq7 eq7, v76 v76, xo7 xo7) {
        o85 o85;
        to7 to7 = to7.f;
        eq7.getClass();
        eq7.z0(v76, xo7);
        if (eq7.t(xo7) || !eq7.w(v76)) {
            if (!eq7.u0(xo7)) {
                vv6 vv6 = new vv6();
                uo7.b();
                eq7 eq72 = uo7.c;
                ArrayDeque arrayDeque = uo7.g;
                arrayDeque.getClass();
                wv6 wv6 = uo7.h;
                wv6.getClass();
                arrayDeque.push(v76);
                while (!arrayDeque.isEmpty()) {
                    v76 v762 = (v76) arrayDeque.pop();
                    v762.getClass();
                    if (wv6.add(v762)) {
                        v76 l0 = eq7.l0(v762);
                        if (l0 == null) {
                            l0 = v762;
                        }
                        if (eq7.c0(eq7.F(l0), xo7)) {
                            vv6.add(l0);
                            o85 = to7;
                        } else if (eq7.d(l0) == 0) {
                            o85 = to7.e;
                        } else {
                            o85 = eq72.P(l0);
                        }
                        if (o85.equals(to7)) {
                            o85 = null;
                        }
                        if (o85 != null) {
                            for (zw3 x2 : eq72.D(eq72.F(v762))) {
                                arrayDeque.add(o85.x(uo7, x2));
                            }
                        }
                    }
                }
                uo7.a();
                return vv6;
            } else if (eq7.c0(eq7.F(v76), xo7)) {
                v76 l02 = eq7.l0(v76);
                if (l02 != null) {
                    v76 = l02;
                }
                return sg3.D(v76);
            }
        }
        return a42.w;
    }

    public static List p(uo7 uo7, eq7 eq7, v76 v76, xo7 xo7) {
        bh2 bh2;
        List o = o(uo7, eq7, v76, xo7);
        if (o.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            for (Object next : o) {
                v76 v762 = (v76) next;
                v762.getClass();
                po7 A0 = eq7.A0(v762);
                int k = eq7.k(A0);
                int i = 0;
                while (true) {
                    if (i >= k) {
                        arrayList.add(next);
                        break;
                    }
                    qo7 t0 = eq7.t0(A0, i);
                    t0.getClass();
                    zw3 p = eq7.p(t0);
                    if (p != null) {
                        bh2 = eq7.h0(p);
                    } else {
                        bh2 = null;
                    }
                    if (bh2 != null) {
                        break;
                    }
                    i++;
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return o;
    }

    public static dg0 t(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) (gr8.q(str.charAt(i2 + 1)) + (gr8.q(str.charAt(i2)) << 4));
            }
            return new dg0(bArr);
        }
        h.j("Unexpected hex string: ".concat(str));
        return null;
    }

    public static dg0 u(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(mo0.a);
        bytes.getClass();
        dg0 dg0 = new dg0(bytes);
        dg0.y = str;
        return dg0;
    }

    public static boolean v(uo7 uo7, zw3 zw3, zw3 zw32) {
        sg3 sg3 = uo7.d;
        uq3 uq3 = uo7.e;
        zw3.getClass();
        zw32.getClass();
        eq7 eq7 = uo7.c;
        if (zw3 == zw32) {
            return true;
        }
        if (y(eq7, zw3) && y(eq7, zw32)) {
            zw3 Q = sg3.Q(uq3.J(zw3));
            zw3 Q2 = sg3.Q(uq3.J(zw32));
            v76 B2 = eq7.B(Q);
            if (!eq7.c0(eq7.i0(Q), eq7.i0(Q2))) {
                return false;
            }
            if (eq7.d(B2) == 0) {
                if (eq7.H(Q) || eq7.H(Q2) || eq7.y0(B2) == eq7.y0(eq7.B(Q2))) {
                    return true;
                }
                return false;
            }
        }
        td0 td0 = x;
        if (!A(td0, uo7, zw3, zw32) || !A(td0, uo7, zw32, zw3)) {
            return false;
        }
        return true;
    }

    public static sp7 x(eq7 eq7, zw3 zw3, v76 v76) {
        zw3 p;
        boolean z2;
        eq7.getClass();
        int d = eq7.d(zw3);
        int i = 0;
        while (true) {
            qo7 qo7 = null;
            if (i >= d) {
                return null;
            }
            qo7 v0 = eq7.v0(zw3, i);
            v0.getClass();
            if (!eq7.f(v0)) {
                qo7 = v0;
            }
            if (!(qo7 == null || (p = eq7.p(qo7)) == null)) {
                if (!eq7.d0(eq7.B(p)) || !eq7.d0(eq7.B(v76))) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (p.equals(v76) || (z2 && sg3.e(eq7.i0(p), eq7.i0(v76)))) {
                    xo7 i0 = eq7.i0(zw3);
                    i0.getClass();
                } else {
                    sp7 x2 = x(eq7, p, v76);
                    if (x2 != null) {
                        return x2;
                    }
                }
            }
            i++;
        }
        xo7 i02 = eq7.i0(zw3);
        i02.getClass();
        return eq7.b0(i02, i);
    }

    public static boolean y(eq7 eq7, zw3 zw3) {
        eq7.getClass();
        zw3.getClass();
        xo7 i0 = eq7.i0(zw3);
        i0.getClass();
        if (!eq7.E(i0)) {
            return false;
        }
        eq7.o(zw3);
        if (eq7.I(zw3) || eq7.e0(zw3) || eq7.w0(zw3)) {
            return false;
        }
        return true;
    }

    public static boolean z(uo7 uo7, eq7 eq7, po7 po7, v76 v76) {
        boolean z2;
        eq7.getClass();
        po7.getClass();
        xo7 F2 = eq7.F(v76);
        int k = eq7.k(po7);
        F2.getClass();
        int U = eq7.U(F2);
        if (k == U && k == eq7.d(v76)) {
            for (int i = 0; i < U; i++) {
                qo7 v0 = eq7.v0(v76, i);
                v0.getClass();
                zw3 p = eq7.p(v0);
                if (p != null) {
                    qo7 t0 = eq7.t0(po7, i);
                    t0.getClass();
                    eq7.m(t0);
                    zw3 p2 = eq7.p(t0);
                    p2.getClass();
                    jq7 y2 = eq7.y(eq7.b0(F2, i));
                    jq7 m = eq7.m(v0);
                    jq7 jq7 = jq7.INV;
                    if (y2 == jq7) {
                        y2 = m;
                    } else if (!(m == jq7 || y2 == m)) {
                        y2 = null;
                    }
                    if (y2 == null) {
                        return uo7.a;
                    }
                    if (y2 == jq7) {
                        B(eq7, p2, p);
                        B(eq7, p, p2);
                    }
                    int i2 = uo7.f;
                    if (i2 <= 100) {
                        uo7.f = i2 + 1;
                        int ordinal = y2.ordinal();
                        td0 td0 = x;
                        if (ordinal == 0) {
                            z2 = A(td0, uo7, p, p2);
                        } else if (ordinal == 1) {
                            z2 = A(td0, uo7, p2, p);
                        } else if (ordinal == 2) {
                            z2 = v(uo7, p2, p);
                        } else {
                            h.c();
                            return false;
                        }
                        uo7.f--;
                        if (!z2) {
                        }
                    } else {
                        ta1.l("Arguments depth is too high. Some related argument: ", p2);
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public ArrayList C(Member member) {
        Method method;
        wh3 wh3;
        member.getClass();
        wh3 wh32 = E;
        if (wh32 == null) {
            synchronized (this) {
                wh32 = E;
                if (wh32 == null) {
                    Class<?> cls = member.getClass();
                    try {
                        wh3 = new wh3(cls.getMethod("getParameters", (Class[]) null), m06.d(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", (Class[]) null));
                    } catch (NoSuchMethodException unused) {
                        wh3 = new wh3((Method) null, (Method) null);
                    }
                    E = wh3;
                    wh32 = wh3;
                }
            }
        }
        Method method2 = wh32.a;
        if (method2 == null || (method = wh32.b) == null) {
            return null;
        }
        Object invoke = method2.invoke(member, (Object[]) null);
        invoke.getClass();
        Object[] objArr = (Object[]) invoke;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object invoke2 : objArr) {
            Object invoke3 = method.invoke(invoke2, (Object[]) null);
            invoke3.getClass();
            arrayList.add((String) invoke3);
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [z85, java.lang.Object] */
    public void D0(j43 j43, a97 a97) {
        switch (this.w) {
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
                hs2 hs2 = (hs2) a97;
                j43.getClass();
                zk2 zk2 = new zk2("BeforeReceive", 2);
                s53 s53 = j43.A;
                zk2 zk22 = s53.o;
                s53.getClass();
                zk22.getClass();
                if (!s53.e(zk2)) {
                    int c = s53.c(zk22);
                    if (c != -1) {
                        s53.a.add(c, new mg5(zk2, new Object()));
                    } else {
                        throw new j1("Phase " + zk22 + " was not registered for this pipeline", 3);
                    }
                }
                s53.f(zk2, new wx5(hs2, (f61) null, 0));
                return;
            case h75.g:
                j43.getClass();
                j43.z.f(s53.j, new wx5((hs2) a97, (f61) null, 2));
                return;
            default:
                j43.getClass();
                j43.z.f(s53.l, new do1((Object) (js2) a97, (f61) null, 4));
                return;
        }
    }

    public boolean a(q51 q51) {
        q51.getClass();
        if (!q51.a(l51.c)) {
            if (!q51.b.isEmpty()) {
                q51 = new q51(q51.c, q51.d, a42.w);
            }
            String q512 = q51.toString();
            if (!d57.Z0(q512, "application/", true) || !k57.m0(q512, "+json", true)) {
                return false;
            }
        }
        return true;
    }

    public vw3 b() {
        throw new IllegalStateException("This method should not be called");
    }

    public String c() {
        return "expected an Int value";
    }

    public Object d(kd6 kd6) {
        Object s = kd6.s(new av5(js7.class, Executor.class));
        s.getClass();
        return we.l((Executor) s);
    }

    public qe4 e(j77 j77, Object obj) {
        c47 c47 = (c47) obj;
        j77.getClass();
        c47.getClass();
        return new h47(j77, c47);
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [c47, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v2, types: [b47, java.lang.Object] */
    public Object f(vr2 vr2) {
        xb4 xb4 = u02.x;
        y02 y02 = y02.SECONDS;
        long e0 = gl0.e0(120, y02);
        long e02 = gl0.e0(5, y02);
        ? obj = new Object();
        obj.a = e02;
        ? obj2 = new Object();
        obj2.u = e0;
        obj2.v = obj;
        vr2.y(obj2);
        return obj2;
    }

    public void g(Object obj, j43 j43) {
        zm1 zm1 = (zm1) obj;
        zm1.getClass();
        j43.getClass();
        j43.z.f(s53.j, new ym1(zm1, (f61) null));
    }

    public au getKey() {
        return zm1.c;
    }

    public boolean h(ql4 ql4, tt1 tt1) {
        ql4.getClass();
        return !tt1.getAnnotations().i(hj5.a);
    }

    public Object i(vr2 vr2) {
        return new zm1(vr2);
    }

    public void k(g73 g73, List list) {
        g73.getClass();
    }

    public void l(cy6 cy6, Object obj) {
        c47 c47 = (c47) obj;
    }

    public List q(g73 g73) {
        g73.getClass();
        return a42.w;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r4v4, types: [java.util.AbstractCollection, po7, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0284, code lost:
        if (n(r1, r0, r2, r3, true) != false) goto L_0x0286;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x02a4, code lost:
        if (r1.U(r10) == 0) goto L_0x02a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0448, code lost:
        if (r3 == false) goto L_0x044b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x044b, code lost:
        r3 = r7.iterator();
        r7 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0455, code lost:
        if (r3.hasNext() == false) goto L_0x046d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0457, code lost:
        r4 = (defpackage.v76) r3.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x045d, code lost:
        if (r7 == false) goto L_0x0460;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0460, code lost:
        r4.getClass();
        r7 = z(r0, r1, r1.A0(r4), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x046d, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:?, code lost:
        return r21;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x037f  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x03a3  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0480  */
    public boolean r(uo7 uo7, eq7 eq7, zw3 zw3, zw3 zw32) {
        Boolean bool;
        Boolean bool2;
        boolean z2;
        List<v76> list;
        int size;
        to7 to7;
        boolean z3;
        boolean z4;
        zw3 p;
        to7 to72;
        to7 to73;
        zw3 zw33;
        boolean z5;
        uo7 uo72 = uo7;
        eq7 eq72 = eq7;
        zw3.getClass();
        uq3 uq3 = uo72.e;
        zw3 J2 = uq3.J(zw3);
        sg3 sg3 = uo72.d;
        zw3 Q = sg3.Q(J2);
        zw32.getClass();
        zw3 Q2 = sg3.Q(uq3.J(zw32));
        eq72.getClass();
        Q.getClass();
        v76 B2 = eq72.B(Q);
        Q2.getClass();
        v76 V = eq72.V(Q2);
        boolean z6 = false;
        boolean z7 = true;
        if (!eq72.E0(B2) && !eq72.E0(V)) {
            eq72.g0(B2);
            eq72.T(B2);
            eq72.T(V);
            nl0 o0 = eq72.o0(V);
            if (o0 != null) {
                zw33 = eq72.C(o0);
            } else {
                zw33 = null;
            }
            if (!(o0 == null || zw33 == null)) {
                if (eq72.y0(V)) {
                    zw33 = eq72.C0(zw33);
                } else if (eq72.K(V)) {
                    zw33 = eq72.S(zw33);
                }
                if (A(this, uo72, B2, zw33)) {
                    bool = Boolean.TRUE;
                }
            }
            xo7 F2 = eq72.F(V);
            F2.getClass();
            if (eq72.q(F2)) {
                eq72.y0(V);
                Iterable D2 = eq72.D(F2);
                if (!(D2 instanceof Collection) || !((Collection) D2).isEmpty()) {
                    Iterator it = D2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (!A(x, uo72, B2, (zw3) it.next())) {
                            z5 = false;
                            break;
                        }
                    }
                }
                z5 = true;
                bool = Boolean.valueOf(z5);
            } else {
                xo7 F3 = eq72.F(B2);
                if (!(B2 instanceof nl0)) {
                    F3.getClass();
                    if (eq72.q(F3)) {
                        Iterable D3 = eq72.D(F3);
                        if (!(D3 instanceof Collection) || !((Collection) D3).isEmpty()) {
                            Iterator it2 = D3.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (!(((zw3) it2.next()) instanceof nl0)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                    bool = null;
                }
                sp7 x2 = x(eq72, V, B2);
                if (x2 != null && eq72.b(x2, eq72.F(V))) {
                    bool = Boolean.TRUE;
                }
                bool = null;
            }
        } else if (uo72.a) {
            bool = Boolean.TRUE;
        } else if (!eq72.y0(B2) || eq72.y0(V)) {
            if (!eq72.E0(B2)) {
                B2 = eq72.h(B2);
            }
            if (!eq72.E0(V)) {
                V = eq72.h(V);
            }
            B2.getClass();
            V.getClass();
            bool = Boolean.valueOf(rg3.C(eq72, B2, V));
        } else {
            bool = Boolean.FALSE;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        v76 B3 = eq72.B(Q);
        v76 V2 = eq72.V(Q2);
        to7 to74 = to7.f;
        to7 to75 = to7.e;
        eq7 eq73 = uo72.c;
        if (!eq73.y0(V2) && !eq73.e0(B3) && !eq73.K(B3) && ((!(B3 instanceof nl0) || !eq73.q0((nl0) B3)) && !rj1.y(uo72, B3, to75))) {
            if (eq73.K(V2) || rj1.y(uo72, V2, to7.g) || eq73.w(B3)) {
                return false;
            }
            xo7 F4 = eq73.F(V2);
            F4.getClass();
            if (!rj1.z(uo72, B3, F4)) {
                uo72.b();
                ArrayDeque arrayDeque = uo72.g;
                arrayDeque.getClass();
                wv6 wv6 = uo72.h;
                wv6.getClass();
                arrayDeque.push(B3);
                while (!arrayDeque.isEmpty()) {
                    v76 v76 = (v76) arrayDeque.pop();
                    v76.getClass();
                    if (wv6.add(v76)) {
                        if (eq73.y0(v76)) {
                            to73 = to74;
                        } else {
                            to73 = to75;
                        }
                        if (to73.equals(to74)) {
                            to73 = null;
                        }
                        if (to73 == null) {
                            continue;
                        } else {
                            for (zw3 x3 : eq73.D(eq73.F(v76))) {
                                v76 x4 = to73.x(uo72, x3);
                                if (rj1.z(uo72, x4, F4)) {
                                    uo72.a();
                                } else {
                                    arrayDeque.add(x4);
                                }
                            }
                            continue;
                        }
                    }
                }
                uo72.a();
                return false;
            }
        }
        if (eq72.L(B3) || eq72.L(V2)) {
            if (m(eq72, B3) && m(eq72, V2)) {
                bool2 = Boolean.TRUE;
                if (bool2 == null) {
                }
            } else if (eq72.L(B3)) {
                if (n(eq72, uo72, B3, V2, false)) {
                    bool2 = Boolean.TRUE;
                    if (bool2 == null) {
                        return bool2.booleanValue();
                    }
                    xo7 F5 = eq72.F(V2);
                    if (eq72.c0(eq72.F(B3), F5)) {
                        F5.getClass();
                    }
                    xo7 F6 = eq72.F(V2);
                    F6.getClass();
                    if (!eq72.p0(F6)) {
                        F5.getClass();
                        if (eq73.w(B3)) {
                            list = p(uo72, eq73, B3, F5);
                        } else if (eq73.t(F5) || eq73.j0(F5)) {
                            vv6 vv6 = new vv6();
                            uo72.b();
                            ArrayDeque arrayDeque2 = uo72.g;
                            arrayDeque2.getClass();
                            wv6 wv62 = uo72.h;
                            wv62.getClass();
                            arrayDeque2.push(B3);
                            while (!arrayDeque2.isEmpty()) {
                                v76 v762 = (v76) arrayDeque2.pop();
                                v762.getClass();
                                if (wv62.add(v762)) {
                                    if (eq73.w(v762)) {
                                        vv6.add(v762);
                                        to72 = to74;
                                    } else {
                                        to72 = to75;
                                    }
                                    if (to72.equals(to74)) {
                                        to72 = null;
                                    }
                                    if (to72 != null) {
                                        for (zw3 x5 : eq73.D(eq73.F(v762))) {
                                            arrayDeque2.add(to72.x(uo72, x5));
                                            z6 = z6;
                                        }
                                    }
                                }
                            }
                            z2 = z6;
                            uo72.a();
                            List arrayList = new ArrayList();
                            Iterator it3 = vv6.iterator();
                            while (it3.hasNext()) {
                                v76 v763 = (v76) it3.next();
                                v763.getClass();
                                it0.h0(arrayList, p(uo72, eq73, v763, F5));
                            }
                            list = arrayList;
                            list.size();
                            ArrayList<v76> arrayList2 = new ArrayList<>(et0.e0(list, 10));
                            for (v76 v764 : list) {
                                v764.getClass();
                                zw3 Q3 = uo72.d.Q(v764);
                                Q3.getClass();
                                v76 n0 = eq72.n0(Q3);
                                if (n0 != null) {
                                    v764 = n0;
                                }
                                arrayList2.add(v764);
                            }
                            size = arrayList2.size();
                            if (size != 0) {
                                xo7 F7 = eq72.F(B3);
                                F7.getClass();
                                if (eq72.t(F7)) {
                                    return eq72.r0(F7);
                                }
                                xo7 F8 = eq72.F(B3);
                                F8.getClass();
                                if (eq72.r0(F8)) {
                                    return true;
                                }
                                uo72.b();
                                ArrayDeque arrayDeque3 = uo72.g;
                                arrayDeque3.getClass();
                                wv6 wv63 = uo72.h;
                                wv63.getClass();
                                arrayDeque3.push(B3);
                                while (!arrayDeque3.isEmpty()) {
                                    v76 v765 = (v76) arrayDeque3.pop();
                                    v765.getClass();
                                    if (wv63.add(v765)) {
                                        if (eq72.w(v765)) {
                                            to7 = to74;
                                        } else {
                                            to7 = to75;
                                        }
                                        if (to7.equals(to74)) {
                                            to7 = null;
                                        }
                                        if (to7 == null) {
                                            continue;
                                        } else {
                                            for (zw3 x6 : eq73.D(eq73.F(v765))) {
                                                v76 x7 = to7.x(uo72, x6);
                                                x7.getClass();
                                                xo7 F9 = eq72.F(x7);
                                                F9.getClass();
                                                if (eq72.r0(F9)) {
                                                    uo72.a();
                                                    return true;
                                                }
                                                arrayDeque3.add(x7);
                                            }
                                            continue;
                                        }
                                    }
                                }
                                uo72.a();
                                return z2;
                            } else if (size != 1) {
                                ? arrayList3 = new ArrayList(eq72.U(F5));
                                int U = eq72.U(F5);
                                int i = z2;
                                loop9:
                                while (true) {
                                    if (i >= U) {
                                        z3 = z7;
                                        z4 = z(uo72, eq72, arrayList3, V2);
                                        break;
                                    } else if (eq72.y(eq72.b0(F5, i)) != jq7.OUT) {
                                        z4 = z2;
                                        z3 = z7;
                                        break;
                                    } else {
                                        ArrayList arrayList4 = new ArrayList(et0.e0(arrayList2, 10));
                                        for (v76 v766 : arrayList2) {
                                            v766.getClass();
                                            qo7 x8 = eq72.x(v766, i);
                                            if (x8 == null) {
                                                break loop9;
                                            }
                                            boolean z8 = z7;
                                            if (eq72.m(x8) != jq7.INV) {
                                                x8 = null;
                                            }
                                            if (x8 == null || (p = eq72.p(x8)) == null) {
                                                break loop9;
                                            }
                                            arrayList4.add(p);
                                            z7 = z8;
                                        }
                                        boolean z9 = z7;
                                        zw3 X = eq72.X(arrayList4);
                                        X.getClass();
                                        arrayList3.add(eq72.Y(X));
                                        i++;
                                        z7 = z9;
                                    }
                                }
                                throw new IllegalStateException(("Incorrect type: " + v766 + ", subType: " + B3 + ", superType: " + V2).toString());
                            } else {
                                v76 v767 = (v76) dt0.v0(arrayList2);
                                v767.getClass();
                                return z(uo72, eq72, eq72.A0(v767), V2);
                            }
                        } else {
                            list = o(uo72, eq73, B3, F5);
                        }
                        z2 = false;
                        list.size();
                        ArrayList<v76> arrayList22 = new ArrayList<>(et0.e0(list, 10));
                        while (r11.hasNext()) {
                        }
                        size = arrayList22.size();
                        if (size != 0) {
                        }
                    }
                    return true;
                }
            } else if (eq72.L(V2)) {
                xo7 F10 = eq72.F(B3);
                if (F10 instanceof gg3) {
                    Iterable D4 = eq72.D(F10);
                    if (!(D4 instanceof Collection) || !((Collection) D4).isEmpty()) {
                        Iterator it4 = D4.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            zw3 zw34 = (zw3) it4.next();
                            zw34.getClass();
                            v76 n02 = eq72.n0(zw34);
                            if (n02 != null && eq72.L(n02)) {
                                break;
                            }
                        }
                        bool2 = Boolean.TRUE;
                        if (bool2 == null) {
                        }
                    }
                }
            }
        }
        bool2 = null;
        if (bool2 == null) {
        }
    }

    public t84 s(Context context, String str, WorkerParameters workerParameters) {
        context.getClass();
        str.getClass();
        workerParameters.getClass();
        context.getClass();
        str.getClass();
        workerParameters.getClass();
        try {
            Class<? extends U> asSubclass = Class.forName(str).asSubclass(t84.class);
            asSubclass.getClass();
            try {
                Object newInstance = asSubclass.getDeclaredConstructor(new Class[]{Context.class, WorkerParameters.class}).newInstance(new Object[]{context, workerParameters});
                newInstance.getClass();
                t84 t84 = (t84) newInstance;
                if (!t84.d) {
                    return t84;
                }
                String name = getClass().getName();
                throw new IllegalStateException("WorkerFactory (" + name + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
            } catch (Throwable th) {
                bc4.k().i(ie8.a, "Could not instantiate ".concat(str), th);
                throw th;
            }
        } catch (Throwable th2) {
            bc4.k().i(ie8.a, "Invalid class: ".concat(str), th2);
            throw th2;
        }
    }

    public synchronized tp0 w(String str) {
        tp0 tp0;
        String str2;
        try {
            str.getClass();
            LinkedHashMap linkedHashMap = tp0.d;
            tp0 = (tp0) linkedHashMap.get(str);
            if (tp0 == null) {
                if (k57.u0(str, "TLS_", false)) {
                    str2 = "SSL_".concat(str.substring(4));
                } else if (k57.u0(str, "SSL_", false)) {
                    str2 = "TLS_".concat(str.substring(4));
                } else {
                    str2 = str;
                }
                tp0 = (tp0) linkedHashMap.get(str2);
                if (tp0 == null) {
                    tp0 = new tp0(str);
                }
                linkedHashMap.put(str, tp0);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return tp0;
    }

    /* renamed from: getKey  reason: collision with other method in class */
    public String m79getKey() {
        return "storage";
    }
}
