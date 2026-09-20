package defpackage;

import io.github.jan.supabase.storage.analytics.AnalyticBucket;

/* renamed from: xb  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class xb implements av2 {
    public static final xb a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, xb, av2] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("io.github.jan.supabase.storage.analytics.AnalyticBucket", obj, 5);
        ik5.k("name", false);
        ik5.k("type", false);
        ik5.k("format", false);
        ik5.k("created_at", false);
        ik5.k("updated_at", false);
        descriptor = ik5;
    }

    public final zr3[] childSerializers() {
        t47 t47 = t47.a;
        wd3 wd3 = wd3.a;
        return new zr3[]{t47, t47, t47, wd3, wd3};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: qd3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: qd3} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object deserialize(ok1 ok1) {
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        qd3 qd3 = null;
        qd3 qd32 = null;
        while (z) {
            int h = c.h(ll6);
            if (h == -1) {
                z = false;
            } else if (h == 0) {
                str = c.n(ll6, 0);
                i |= 1;
            } else if (h == 1) {
                str2 = c.n(ll6, 1);
                i |= 2;
            } else if (h == 2) {
                str3 = c.n(ll6, 2);
                i |= 4;
            } else if (h == 3) {
                qd3 = c.r(ll6, 3, wd3.a, qd3);
                i |= 8;
            } else if (h == 4) {
                qd32 = c.r(ll6, 4, wd3.a, qd32);
                i |= 16;
            } else {
                h.e(h);
                return null;
            }
        }
        c.b(ll6);
        return new AnalyticBucket(i, str, str2, str3, qd3, qd32, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        AnalyticBucket analyticBucket = (AnalyticBucket) obj;
        analyticBucket.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        AnalyticBucket.write$Self$storage_kt(analyticBucket, c, ll6);
        c.b(ll6);
    }
}
