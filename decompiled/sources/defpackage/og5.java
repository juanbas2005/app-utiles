package defpackage;

import io.github.jan.supabase.auth.providers.builtin.Phone$Channel;
import io.github.jan.supabase.auth.providers.builtin.Phone$Config;
import kotlinx.serialization.json.JsonObject;

/* renamed from: og5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class og5 implements av2 {
    public static final og5 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, og5, av2] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("io.github.jan.supabase.auth.providers.builtin.Phone.Config", obj, 5);
        ik5.k("gotrue_meta_security", true);
        ik5.k("phone", true);
        ik5.k("password", true);
        ik5.k("channel", true);
        ik5.k("data", true);
        descriptor = ik5;
    }

    public final zr3[] childSerializers() {
        zr3 x = hj8.x(xk0.a);
        zr3 x2 = hj8.x(xm3.a);
        t47 t47 = t47.a;
        return new zr3[]{x, t47, t47, Phone$Channel.Companion, x2};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: io.github.jan.supabase.auth.providers.builtin.Phone$Channel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: kotlinx.serialization.json.JsonObject} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object deserialize(ok1 ok1) {
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Phone$Channel phone$Channel = null;
        JsonObject jsonObject = null;
        while (z) {
            int h = c.h(ll6);
            if (h == -1) {
                z = false;
            } else if (h == 0) {
                str = c.x(ll6, 0, xk0.a, str);
                i |= 1;
            } else if (h == 1) {
                str2 = c.n(ll6, 1);
                i |= 2;
            } else if (h == 2) {
                str3 = c.n(ll6, 2);
                i |= 4;
            } else if (h == 3) {
                phone$Channel = c.r(ll6, 3, Phone$Channel.Companion, phone$Channel);
                i |= 8;
            } else if (h == 4) {
                jsonObject = c.x(ll6, 4, xm3.a, jsonObject);
                i |= 16;
            } else {
                h.e(h);
                return null;
            }
        }
        c.b(ll6);
        return new Phone$Config(i, str, str2, str3, phone$Channel, jsonObject, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        Phone$Config phone$Config = (Phone$Config) obj;
        phone$Config.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        Phone$Config.write$Self$auth_kt(phone$Config, c, ll6);
        c.b(ll6);
    }
}
