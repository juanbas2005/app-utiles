package defpackage;

import io.github.jan.supabase.auth.mfa.FactorType$TOTP$Config;

/* renamed from: ya2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ya2 implements av2 {
    public static final ya2 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, ya2, av2] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("io.github.jan.supabase.auth.mfa.FactorType.TOTP.Config", obj, 1);
        ik5.k("issuer", true);
        descriptor = ik5;
    }

    public final zr3[] childSerializers() {
        return new zr3[]{hj8.x(t47.a)};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object deserialize(ok1 ok1) {
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        boolean z = true;
        int i = 0;
        String str = null;
        while (z) {
            int h = c.h(ll6);
            if (h == -1) {
                z = false;
            } else if (h == 0) {
                str = c.x(ll6, 0, t47.a, str);
                i = 1;
            } else {
                h.e(h);
                return null;
            }
        }
        c.b(ll6);
        return new FactorType$TOTP$Config(i, str, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        FactorType$TOTP$Config factorType$TOTP$Config = (FactorType$TOTP$Config) obj;
        factorType$TOTP$Config.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        FactorType$TOTP$Config.write$Self$auth_kt(factorType$TOTP$Config, c, ll6);
        c.b(ll6);
    }
}
