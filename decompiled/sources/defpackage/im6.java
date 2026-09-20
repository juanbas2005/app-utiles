package defpackage;

import com.google.firebase.sessions.settings.SessionConfigs;

/* renamed from: im6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class im6 implements av2 {
    public static final im6 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [im6, java.lang.Object, av2] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("com.google.firebase.sessions.settings.SessionConfigs", obj, 5);
        ik5.k("sessionsEnabled", false);
        ik5.k("sessionSamplingRate", false);
        ik5.k("sessionTimeoutSeconds", false);
        ik5.k("cacheDurationSeconds", false);
        ik5.k("cacheUpdatedTimeSeconds", false);
        descriptor = ik5;
    }

    public final zr3[] childSerializers() {
        zr3 x = hj8.x(ja0.a);
        zr3 x2 = hj8.x(ix1.a);
        ue3 ue3 = ue3.a;
        return new zr3[]{x, x2, hj8.x(ue3), hj8.x(ue3), hj8.x(tc4.a)};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.Long} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object deserialize(ok1 ok1) {
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        Double d = null;
        Integer num = null;
        Integer num2 = null;
        Long l = null;
        while (z) {
            int h = c.h(ll6);
            if (h == -1) {
                z = false;
            } else if (h == 0) {
                bool = c.x(ll6, 0, ja0.a, bool);
                i |= 1;
            } else if (h == 1) {
                d = c.x(ll6, 1, ix1.a, d);
                i |= 2;
            } else if (h == 2) {
                num = c.x(ll6, 2, ue3.a, num);
                i |= 4;
            } else if (h == 3) {
                num2 = c.x(ll6, 3, ue3.a, num2);
                i |= 8;
            } else if (h == 4) {
                l = c.x(ll6, 4, tc4.a, l);
                i |= 16;
            } else {
                h.e(h);
                return null;
            }
        }
        c.b(ll6);
        return new SessionConfigs(i, bool, d, num, num2, l, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        SessionConfigs sessionConfigs = (SessionConfigs) obj;
        sessionConfigs.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        SessionConfigs.write$Self$com_google_firebase_firebase_sessions(sessionConfigs, c, ll6);
        c.b(ll6);
    }

    public final zr3[] typeParametersSerializers() {
        return dh4.x;
    }
}
