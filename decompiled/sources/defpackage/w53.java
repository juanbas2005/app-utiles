package defpackage;

import io.ktor.http.Url;
import java.util.Map;
import java.util.Set;

/* renamed from: w53  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class w53 {
    public static final Set a = qs.r1(new i53[]{i53.b, i53.g});
    public static final cc4 b = fc4.b("io.ktor.client.plugins.HttpRedirect");
    public static final xb4 c = new xb4(28);
    public static final wr0 d = new wr0("HttpRedirect", (sr2) u53.D, (vr2) new vd2(17));

    /* JADX WARNING: type inference failed for: r15v23, types: [java.lang.Object, h06] */
    /* JADX WARNING: type inference failed for: r13v18, types: [java.lang.Object, h06] */
    /* JADX WARNING: type inference failed for: r0v7, types: [h61] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public static final Object a(wk6 wk6, y53 y53, l43 l43, j43 j43, h61 h61) {
        v53 v53;
        int i;
        j43 j432;
        h06 h06;
        h06 h062;
        wk6 wk62;
        h06 h063;
        v53 v532;
        Object obj;
        h06 h064;
        v53 v533;
        Url D;
        String encodedUser;
        int specifiedPort;
        String str;
        int i2;
        String x;
        if (h61 instanceof v53) {
            v53 v534 = (v53) h61;
            int i3 = v534.F;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                v534.F = i3 - Integer.MIN_VALUE;
                v53 = v534;
                Object obj2 = v53.E;
                i = v53.F;
                if (i != 0) {
                    o85.q(obj2);
                    ? obj3 = new Object();
                    obj3.w = l43;
                    ? obj4 = new Object();
                    obj4.w = y53;
                    wk62 = wk6;
                    h063 = obj3;
                    v533 = v53;
                    h064 = obj4;
                } else if (i == 1) {
                    h063 = v53.D;
                    h06 h065 = v53.C;
                    h062 = v53.B;
                    j43 j433 = v53.A;
                    wk6 wk63 = v53.z;
                    o85.q(obj2);
                    j43 j434 = j433;
                    h06 = h065;
                    wk62 = wk63;
                    v532 = v53;
                    obj = obj2;
                    j432 = j434;
                    h063.w = obj;
                    h063 = h062;
                    h064 = h06;
                    j43 = j432;
                    v533 = v532;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                as7 protocol = ((l43) h063.w).c().D().getProtocol();
                D = ((l43) h063.w).c().D();
                D.getClass();
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                encodedUser = D.getEncodedUser();
                String encodedPassword = D.getEncodedPassword();
                if (encodedUser != null) {
                    sb2.append(encodedUser);
                    if (encodedPassword != null) {
                        sb2.append(':');
                        sb2.append(encodedPassword);
                    }
                    sb2.append("@");
                }
                sb.append(sb2.toString());
                specifiedPort = D.getSpecifiedPort();
                if (specifiedPort == 0 || specifiedPort == D.getProtocol().x) {
                    str = D.getHost();
                } else {
                    str = D.getHost() + ':' + D.getPort();
                }
                sb.append(str);
                String sb3 = sb.toString();
                i2 = ((l43) h063.w).d().e().w;
                if (i2 == w63.y.w || i2 == w63.z.w || i2 == w63.B.w || i2 == w63.C.w || i2 == w63.A.w) {
                    x = ((l43) h063.w).d().a().x("Location");
                    cc4 cc4 = b;
                    if (x == null) {
                        cc4.g("Location header missing from redirect response " + ((l43) h063.w).c().D() + "; returning response as is");
                    } else {
                        f96 f96 = j43.E;
                        ((l43) h063.w).d();
                        f96.D(c);
                        cc4.h("Received redirect response to " + x + " for request " + ((l43) h063.w).c().D());
                        y53 y532 = new y53();
                        y53 y533 = (y53) h064.w;
                        y533.getClass();
                        y532.e = y533.e;
                        y532.e(y533);
                        yr7 yr7 = y532.a;
                        yr7.j.clear();
                        zr7.b(yr7, x);
                        protocol.getClass();
                        String str2 = protocol.w;
                        if (str2.equals("https") || str2.equals("wss")) {
                            as7 d2 = yr7.d();
                            d2.getClass();
                            String str3 = d2.w;
                            if (!str3.equals("https") && !str3.equals("wss")) {
                                cc4.h("Blocked redirect from " + ((l43) h063.w).c().D() + " to " + x + " due to HTTPS downgrade");
                                return h063.w;
                            }
                        }
                        if (!sb3.equals(t35.r(yr7))) {
                            dz2 dz2 = y532.c;
                            dz2.getClass();
                            ((Map) dz2.w).remove("Authorization");
                            cc4.h("Removing Authorization header for cross-authority redirect: " + sb3 + " -> " + yr7.c());
                        }
                        h064.w = y532;
                        v533.z = wk62;
                        v533.A = j43;
                        v533.B = h063;
                        v533.C = h064;
                        v533.D = h063;
                        v533.F = 1;
                        Object a2 = wk62.w.a(y532, v533);
                        Object obj5 = p81.w;
                        if (a2 == obj5) {
                            return obj5;
                        }
                        v532 = v533;
                        obj = a2;
                        j432 = j43;
                        h06 = h064;
                        h062 = h063;
                        h063.w = obj;
                        h063 = h062;
                        h064 = h06;
                        j43 = j432;
                        v533 = v532;
                        as7 protocol2 = ((l43) h063.w).c().D().getProtocol();
                        D = ((l43) h063.w).c().D();
                        D.getClass();
                        StringBuilder sb4 = new StringBuilder();
                        StringBuilder sb22 = new StringBuilder();
                        encodedUser = D.getEncodedUser();
                        String encodedPassword2 = D.getEncodedPassword();
                        if (encodedUser != null) {
                        }
                        sb4.append(sb22.toString());
                        specifiedPort = D.getSpecifiedPort();
                        if (specifiedPort == 0 || specifiedPort == D.getProtocol().x) {
                        }
                        sb4.append(str);
                        String sb32 = sb4.toString();
                        i2 = ((l43) h063.w).d().e().w;
                        if (i2 == w63.y.w && i2 == w63.z.w && i2 == w63.B.w && i2 == w63.C.w && i2 == w63.A.w) {
                            return h063.w;
                        }
                        return obj5;
                    }
                    cc4.g("Location header missing from redirect response " + ((l43) h063.w).c().D() + "; returning response as is");
                    return h063.w;
                }
                x = ((l43) h063.w).d().a().x("Location");
                cc4 cc42 = b;
                if (x == null) {
                }
                cc42.g("Location header missing from redirect response " + ((l43) h063.w).c().D() + "; returning response as is");
                return h063.w;
            }
        }
        v53 = new h61(h61);
        Object obj22 = v53.E;
        i = v53.F;
        if (i != 0) {
        }
        as7 protocol22 = ((l43) h063.w).c().D().getProtocol();
        D = ((l43) h063.w).c().D();
        D.getClass();
        StringBuilder sb42 = new StringBuilder();
        StringBuilder sb222 = new StringBuilder();
        encodedUser = D.getEncodedUser();
        String encodedPassword22 = D.getEncodedPassword();
        if (encodedUser != null) {
        }
        sb42.append(sb222.toString());
        specifiedPort = D.getSpecifiedPort();
        if (specifiedPort == 0 || specifiedPort == D.getProtocol().x) {
        }
        sb42.append(str);
        String sb322 = sb42.toString();
        i2 = ((l43) h063.w).d().e().w;
        if (i2 == w63.y.w && i2 == w63.z.w && i2 == w63.B.w && i2 == w63.C.w && i2 == w63.A.w) {
        }
        x = ((l43) h063.w).d().a().x("Location");
        cc4 cc422 = b;
        if (x == null) {
        }
        cc422.g("Location header missing from redirect response " + ((l43) h063.w).c().D() + "; returning response as is");
        return h063.w;
    }
}
