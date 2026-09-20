package defpackage;

import io.github.jan.supabase.auth.providers.IDTokenProvider;
import io.github.jan.supabase.auth.providers.builtin.IDToken$Config;
import kotlinx.serialization.json.JsonObject;

/* renamed from: k73  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class k73 implements av2 {
    public static final k73 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [k73, java.lang.Object, av2] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("io.github.jan.supabase.auth.providers.builtin.IDToken.Config", obj, 7);
        ik5.k("gotrue_meta_security", true);
        ik5.k("id_token", true);
        ik5.k("provider", true);
        ik5.k("access_token", true);
        ik5.k("nonce", true);
        ik5.k("link_identity", true);
        ik5.k("data", true);
        descriptor = ik5;
    }

    public final zr3[] childSerializers() {
        zr3 x = hj8.x(xk0.a);
        t47 t47 = t47.a;
        return new zr3[]{x, t47, hj8.x(IDTokenProvider.Companion), hj8.x(t47), hj8.x(t47), ja0.a, hj8.x(xm3.a)};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: io.github.jan.supabase.auth.providers.IDTokenProvider} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: kotlinx.serialization.json.JsonObject} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object deserialize(ok1 ok1) {
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        IDTokenProvider iDTokenProvider = null;
        String str3 = null;
        String str4 = null;
        JsonObject jsonObject = null;
        while (z) {
            int h = c.h(ll6);
            switch (h) {
                case -1:
                    z = false;
                    break;
                case b85.b:
                    str = c.x(ll6, 0, xk0.a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = c.n(ll6, 1);
                    i |= 2;
                    break;
                case 2:
                    iDTokenProvider = c.x(ll6, 2, IDTokenProvider.Companion, iDTokenProvider);
                    i |= 4;
                    break;
                case 3:
                    str3 = c.x(ll6, 3, t47.a, str3);
                    i |= 8;
                    break;
                case 4:
                    str4 = c.x(ll6, 4, t47.a, str4);
                    i |= 16;
                    break;
                case 5:
                    z2 = c.z(ll6, 5);
                    i |= 32;
                    break;
                case 6:
                    jsonObject = c.x(ll6, 6, xm3.a, jsonObject);
                    i |= 64;
                    break;
                default:
                    h.e(h);
                    return null;
            }
        }
        c.b(ll6);
        return new IDToken$Config(i, str, str2, iDTokenProvider, str3, str4, z2, jsonObject, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        IDToken$Config iDToken$Config = (IDToken$Config) obj;
        iDToken$Config.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        IDToken$Config.write$Self$auth_kt(iDToken$Config, c, ll6);
        c.b(ll6);
    }
}
