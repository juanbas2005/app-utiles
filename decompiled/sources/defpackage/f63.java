package defpackage;

import java.util.Collections;

/* renamed from: f63  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class f63 {
    public static final au a;

    static {
        as3 as3;
        as3 as32;
        as3 as33;
        as3 as34;
        as3 as35;
        Class<y53> cls = y53.class;
        Class cls2 = Boolean.TYPE;
        Class<m63> cls3 = m63.class;
        Class cls4 = Integer.TYPE;
        fc4.b("io.ktor.client.plugins.HttpRequestRetry");
        int i = e63.D;
        c26 c26 = b26.a;
        Class<xr0> cls5 = xr0.class;
        gq3 b = c26.b(cls5);
        as3 as36 = null;
        try {
            gs3 gs3 = gs3.c;
            cs3 n = c26.n(c26.b(wr0.class));
            c26.l(n, Collections.singletonList(b26.b(Object.class)));
            as3 = b26.c(cls5, x91.C(c26.m(n, Collections.EMPTY_LIST, false)));
        } catch (Throwable unused) {
            as3 = null;
        }
        new au("RetryFeature", new fp7(b, as3));
        gq3 b2 = b26.a.b(Integer.class);
        try {
            as32 = b26.b(cls4);
        } catch (Throwable unused2) {
            as32 = null;
        }
        a = new au("MaxRetriesPerRequestAttributeKey", new fp7(b2, as32));
        Class<hs2> cls6 = hs2.class;
        gq3 b3 = b26.a.b(cls6);
        try {
            gs3 gs32 = gs3.c;
            as33 = b26.d(cls6, x91.C(b26.b(cls3)), x91.C(b26.b(x53.class)), x91.C(b26.b(yl1.class)), x91.C(b26.b(cls2)));
        } catch (Throwable unused3) {
            as33 = null;
        }
        new au("ShouldRetryPerRequestAttributeKey", new fp7(b3, as33));
        gq3 b4 = b26.a.b(cls6);
        try {
            gs3 gs33 = gs3.c;
            as34 = b26.d(cls6, x91.C(b26.b(cls3)), x91.C(b26.b(cls)), x91.C(b26.b(Throwable.class)), x91.C(b26.b(cls2)));
        } catch (Throwable unused4) {
            as34 = null;
        }
        new au("ShouldRetryOnExceptionPerRequestAttributeKey", new fp7(b4, as34));
        Class<gs2> cls7 = gs2.class;
        gq3 b5 = b26.a.b(cls7);
        try {
            gs3 gs34 = gs3.c;
            as35 = b26.d(cls7, x91.C(b26.b(l63.class)), x91.C(b26.b(cls)), x91.C(b26.b(vs7.class)));
        } catch (Throwable unused5) {
            as35 = null;
        }
        new au("ModifyRequestPerRequestAttributeKey", new fp7(b5, as35));
        gq3 b6 = b26.a.b(cls7);
        try {
            gs3 gs35 = gs3.c;
            as36 = b26.d(cls7, x91.C(b26.b(k63.class)), x91.C(b26.b(cls4)), x91.C(b26.b(Long.TYPE)));
        } catch (Throwable unused6) {
        }
        new au("RetryDelayPerRequestAttributeKey", new fp7(b6, as36));
    }
}
