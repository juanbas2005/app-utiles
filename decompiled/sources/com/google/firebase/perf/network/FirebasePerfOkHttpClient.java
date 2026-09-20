package com.google.firebase.perf.network;

import java.io.IOException;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class FirebasePerfOkHttpClient {
    public static void a(a66 a66, sy4 sy4, long j, long j2) {
        kd6 kd6 = a66.w;
        if (kd6 != null) {
            sy4.j(((g73) kd6.x).i().toString());
            sy4.c((String) kd6.y);
            f56 f56 = (f56) kd6.A;
            if (f56 != null) {
                long a = f56.a();
                if (a != -1) {
                    sy4.e(a);
                }
            }
            d66 d66 = a66.C;
            if (d66 != null) {
                long a2 = d66.a();
                if (a2 != -1) {
                    sy4.h(a2);
                }
                yh4 k = d66.k();
                if (k != null) {
                    sy4.g(k.a);
                }
            }
            sy4.d(a66.z);
            sy4.f(j);
            sy4.i(j2);
            sy4.b();
        }
    }

    public static void enqueue(zh0 zh0, vi0 vi0) {
        ui7 ui7 = new ui7();
        vi0 vi02 = vi0;
        dx5 dx5 = (dx5) zh0;
        dx5.e(new m22(vi02, hn7.O, ui7, ui7.w));
    }

    public static a66 execute(zh0 zh0) {
        sy4 sy4 = new sy4(hn7.O);
        long e = ui7.e();
        long a = ui7.a();
        try {
            a66 f = ((dx5) zh0).f();
            ui7.e();
            a(f, sy4, e, ui7.a() - a);
            return f;
        } catch (IOException e2) {
            kd6 kd6 = ((dx5) zh0).x;
            if (kd6 != null) {
                g73 g73 = (g73) kd6.x;
                if (g73 != null) {
                    sy4.j(g73.i().toString());
                }
                String str = (String) kd6.y;
                if (str != null) {
                    sy4.c(str);
                }
            }
            sy4.f(e);
            ui7.e();
            sy4.i(ui7.a() - a);
            ty4.c(sy4);
            throw e2;
        }
    }
}
