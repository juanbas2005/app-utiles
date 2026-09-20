package defpackage;

import io.github.jan.supabase.auth.jwt.JwtHeader;

/* renamed from: zp3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class zp3 implements av2 {
    public static final zp3 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, zp3, av2] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("io.github.jan.supabase.auth.jwt.JwtHeader", obj, 3);
        ik5.k("alg", false);
        ik5.k("kid", true);
        ik5.k("typ", true);
        descriptor = ik5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: zr3[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final zr3[] childSerializers() {
        t47 t47 = t47.a;
        return new zr3[]{JwtHeader.$childSerializers[0].getValue(), hj8.x(t47), hj8.x(t47)};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: aq3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object deserialize(ok1 ok1) {
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        nz3[] access$get$childSerializers$cp = JwtHeader.$childSerializers;
        boolean z = true;
        int i = 0;
        aq3 aq3 = null;
        String str = null;
        String str2 = null;
        while (z) {
            int h = c.h(ll6);
            if (h == -1) {
                z = false;
            } else if (h == 0) {
                aq3 = c.r(ll6, 0, (zr3) access$get$childSerializers$cp[0].getValue(), aq3);
                i |= 1;
            } else if (h == 1) {
                str = c.x(ll6, 1, t47.a, str);
                i |= 2;
            } else if (h == 2) {
                str2 = c.x(ll6, 2, t47.a, str2);
                i |= 4;
            } else {
                h.e(h);
                return null;
            }
        }
        c.b(ll6);
        return new JwtHeader(i, aq3, str, str2, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        JwtHeader jwtHeader = (JwtHeader) obj;
        jwtHeader.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        JwtHeader.write$Self$auth_kt(jwtHeader, c, ll6);
        c.b(ll6);
    }
}
