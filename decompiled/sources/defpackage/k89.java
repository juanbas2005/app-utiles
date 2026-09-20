package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: k89  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class k89 extends z79 {
    public static final boolean f1(String str) {
        String str2 = (String) by8.t.a((Object) null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String trim : str2.split(",")) {
            if (str.equalsIgnoreCase(trim.trim())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0094, code lost:
        if (java.lang.Math.abs(r7.hashCode() % 100) < r9.I().t()) goto L_0x0098;
     */
    public final i89 d1(String str) {
        y19 y19 = (y19) this.w;
        v89 v89 = this.x;
        uq8 uq8 = v89.y;
        j19 j19 = v89.w;
        v89.R(uq8);
        c09 g2 = uq8.g2(str);
        e59 e59 = e59.x;
        i89 i89 = null;
        if (g2 == null || !g2.z()) {
            return new i89(e1(str), Collections.EMPTY_MAP, e59, (k29) null);
        }
        j29 u = k29.u();
        u.b();
        ((k29) u.x).z(2);
        int c = hl6.c(g2.t());
        if (c == 0) {
            ku4.j("null reference");
        }
        u.g(c);
        String F = g2.F();
        v89.R(j19);
        bz8 o1 = j19.o1(str);
        if (o1 != null) {
            uq8 uq82 = v89.y;
            v89.R(uq82);
            c09 g22 = uq82.g2(str);
            if (g22 != null) {
                if (!o1.H() || o1.I().t() != 100) {
                    d99 d99 = y19.E;
                    y19.e(d99);
                    if (!d99.H1(str, g22.D())) {
                        if (!TextUtils.isEmpty(F)) {
                        }
                    }
                }
                String E = g2.E();
                u.b();
                ((k29) u.x).z(2);
                v89.R(j19);
                bz8 o12 = j19.o1(g2.E());
                if (o12 == null || !o12.H()) {
                    pz8 pz8 = y19.B;
                    y19.g(pz8);
                    pz8.J.b("[sgtm] Missing sgtm_setting in remote config. appId", E);
                    u.b();
                    ((k29) u.x).A(4);
                } else {
                    HashMap hashMap = new HashMap();
                    if (!TextUtils.isEmpty(g2.D())) {
                        hashMap.put("x-gtm-server-preview", g2.D());
                    }
                    String u2 = o12.I().u();
                    int c2 = hl6.c(g2.t());
                    if (c2 != 0 && c2 != 2) {
                        u.g(c2);
                    } else if (f1(g2.E())) {
                        u.g(11);
                    } else if (TextUtils.isEmpty(u2)) {
                        u.g(12);
                    } else {
                        pz8 pz82 = y19.B;
                        y19.g(pz82);
                        pz82.J.b("[sgtm] Eligible for client side upload. appId", E);
                        u.b();
                        ((k29) u.x).z(3);
                        u.g(2);
                        i89 = new i89(u2, hashMap, e59.A, (k29) u.d());
                    }
                    o12.I().getClass();
                    o12.I().getClass();
                    y19.getClass();
                    pz8 pz83 = y19.B;
                    if (!TextUtils.isEmpty(u2)) {
                        y19.g(pz83);
                        pz83.J.b("[sgtm] Eligible for local service direct upload. appId", E);
                        u.b();
                        ((k29) u.x).z(5);
                        u.b();
                        ((k29) u.x).A(2);
                        i89 = new i89(u2, hashMap, e59.z, (k29) u.d());
                    } else {
                        u.b();
                        ((k29) u.x).A(6);
                        y19.g(pz83);
                        pz83.J.b("[sgtm] Local service, missing sgtm_server_url", g2.E());
                    }
                }
                if (i89 != null) {
                    return i89;
                }
                return new i89(e1(str), Collections.EMPTY_MAP, e59, (k29) u.d());
            }
        }
        u.b();
        ((k29) u.x).A(3);
        return new i89(e1(str), Collections.EMPTY_MAP, e59, (k29) u.d());
    }

    public final String e1(String str) {
        j19 j19 = this.x.w;
        v89.R(j19);
        String p1 = j19.p1(str);
        if (TextUtils.isEmpty(p1)) {
            return (String) by8.r.a((Object) null);
        }
        Uri parse = Uri.parse((String) by8.r.a((Object) null));
        Uri.Builder buildUpon = parse.buildUpon();
        String authority = parse.getAuthority();
        StringBuilder sb = new StringBuilder(String.valueOf(p1).length() + 1 + String.valueOf(authority).length());
        sb.append(p1);
        sb.append(".");
        sb.append(authority);
        buildUpon.authority(sb.toString());
        return buildUpon.build().toString();
    }
}
