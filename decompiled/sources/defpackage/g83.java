package defpackage;

import io.github.jan.supabase.auth.user.Identity;
import kotlinx.serialization.json.JsonObject;

/* renamed from: g83  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class g83 implements av2 {
    public static final g83 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [g83, java.lang.Object, av2] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("io.github.jan.supabase.auth.user.Identity", obj, 8);
        ik5.k("id", false);
        ik5.k("identity_data", false);
        ik5.k("identity_id", true);
        ik5.k("last_sign_in_at", true);
        ik5.k("updated_at", true);
        ik5.k("created_at", true);
        ik5.k("provider", false);
        ik5.k("user_id", false);
        descriptor = ik5;
    }

    public final zr3[] childSerializers() {
        t47 t47 = t47.a;
        return new zr3[]{t47, xm3.a, hj8.x(t47), hj8.x(t47), hj8.x(t47), hj8.x(t47), t47, t47};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: kotlinx.serialization.json.JsonObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object deserialize(ok1 ok1) {
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        Object obj = null;
        boolean z = true;
        int i = 0;
        String str = null;
        JsonObject jsonObject = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (z) {
            int h = c.h(ll6);
            switch (h) {
                case -1:
                    z = false;
                    continue;
                case b85.b:
                    str = c.n(ll6, 0);
                    i |= 1;
                    break;
                case 1:
                    jsonObject = c.r(ll6, 1, xm3.a, jsonObject);
                    i |= 2;
                    break;
                case 2:
                    str2 = c.x(ll6, 2, t47.a, str2);
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
                    str5 = c.x(ll6, 5, t47.a, str5);
                    i |= 32;
                    break;
                case 6:
                    str6 = c.n(ll6, 6);
                    i |= 64;
                    continue;
                case 7:
                    str7 = c.n(ll6, 7);
                    i |= 128;
                    continue;
                default:
                    h.e(h);
                    return obj;
            }
            obj = null;
        }
        c.b(ll6);
        return new Identity(i, str, jsonObject, str2, str3, str4, str5, str6, str7, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        Identity identity = (Identity) obj;
        identity.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        Identity.write$Self$auth_kt(identity, c, ll6);
        c.b(ll6);
    }
}
