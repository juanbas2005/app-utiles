package defpackage;

import android.content.Context;

/* renamed from: k18  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class k18 {
    public static final long a = m31.h(0, 0, 0, 0);
    public static final qx5 b = new Object();

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, qx5] */
    static {
        uu6 uu6 = uu6.c;
    }

    public static final s83 a(Object obj, yt2 yt2) {
        yt2.f0(1087186730);
        if (obj instanceof s83) {
            s83 s83 = (s83) obj;
            yt2.r(false);
            return s83;
        }
        Context context = (Context) yt2.k(ye.b);
        yt2.f0(-1245195153);
        boolean g = yt2.g(context) | yt2.g(obj);
        Object Q = yt2.Q();
        if (g || Q == ay0.a) {
            r83 r83 = new r83(context);
            r83.c = obj;
            Q = r83.a();
            yt2.o0(Q);
        }
        s83 s832 = (s83) Q;
        yt2.r(false);
        yt2.r(false);
        return s832;
    }

    public static final s83 b(Object obj, j51 j51, yt2 yt2) {
        av6 av6;
        yt2.f0(1677680258);
        boolean z = obj instanceof s83;
        if (z) {
            s83 s83 = (s83) obj;
            if (s83.z.a != null) {
                yt2.r(false);
                return s83;
            }
        }
        yt2.f0(408306591);
        boolean e = sg3.e(j51, i51.e);
        d63 d63 = ay0.a;
        if (e) {
            av6 = b;
        } else {
            yt2.f0(408309406);
            Object Q = yt2.Q();
            if (Q == d63) {
                Q = new o31();
                yt2.o0(Q);
            }
            av6 = (o31) Q;
            yt2.r(false);
        }
        yt2.r(false);
        if (z) {
            yt2.f0(-227230258);
            s83 s832 = (s83) obj;
            yt2.f0(408312509);
            boolean g = yt2.g(s832) | yt2.g(av6);
            Object Q2 = yt2.Q();
            if (g || Q2 == d63) {
                r83 a2 = s83.a(s832);
                a2.n = av6;
                a2.p = null;
                a2.q = null;
                a2.r = null;
                Q2 = a2.a();
                yt2.o0(Q2);
            }
            s83 s833 = (s83) Q2;
            yt2.r(false);
            yt2.r(false);
            yt2.r(false);
            return s833;
        }
        yt2.f0(-227066702);
        Context context = (Context) yt2.k(ye.b);
        yt2.f0(408319118);
        boolean g2 = yt2.g(context) | yt2.g(obj) | yt2.g(av6);
        Object Q3 = yt2.Q();
        if (g2 || Q3 == d63) {
            r83 r83 = new r83(context);
            r83.c = obj;
            r83.n = av6;
            r83.p = null;
            r83.q = null;
            r83.r = null;
            Q3 = r83.a();
            yt2.o0(Q3);
        }
        s83 s834 = (s83) Q3;
        yt2.r(false);
        yt2.r(false);
        yt2.r(false);
        return s834;
    }
}
