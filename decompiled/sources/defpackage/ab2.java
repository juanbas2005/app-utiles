package defpackage;

import io.github.jan.supabase.auth.mfa.FactorType$TOTP$Response;

/* renamed from: ab2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ab2 implements av2 {
    public static final ab2 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [ab2, java.lang.Object, av2] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("io.github.jan.supabase.auth.mfa.FactorType.TOTP.Response", obj, 3);
        ik5.k("secret", false);
        ik5.k("qr_code", false);
        ik5.k("uri", false);
        descriptor = ik5;
    }

    public final zr3[] childSerializers() {
        t47 t47 = t47.a;
        return new zr3[]{t47, t47, t47};
    }

    public final Object deserialize(ok1 ok1) {
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
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
            } else {
                h.e(h);
                return null;
            }
        }
        c.b(ll6);
        return new FactorType$TOTP$Response(i, str, str2, str3, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        FactorType$TOTP$Response factorType$TOTP$Response = (FactorType$TOTP$Response) obj;
        factorType$TOTP$Response.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        FactorType$TOTP$Response.write$Self$auth_kt(factorType$TOTP$Response, c, ll6);
        c.b(ll6);
    }
}
