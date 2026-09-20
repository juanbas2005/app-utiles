package defpackage;

import io.github.jan.supabase.auth.admin.LinkType$Signup$Config;
import kotlinx.serialization.json.JsonObject;

/* renamed from: h74  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class h74 implements av2 {
    public static final h74 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [h74, java.lang.Object, av2] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("io.github.jan.supabase.auth.admin.LinkType.Signup.Config", obj, 3);
        ik5.k("email", true);
        ik5.k("password", true);
        ik5.k("data", true);
        descriptor = ik5;
    }

    public final zr3[] childSerializers() {
        zr3 x = hj8.x(xm3.a);
        t47 t47 = t47.a;
        return new zr3[]{t47, t47, x};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: kotlinx.serialization.json.JsonObject} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object deserialize(ok1 ok1) {
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        JsonObject jsonObject = null;
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
                jsonObject = c.x(ll6, 2, xm3.a, jsonObject);
                i |= 4;
            } else {
                h.e(h);
                return null;
            }
        }
        c.b(ll6);
        return new LinkType$Signup$Config(i, str, str2, jsonObject, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        LinkType$Signup$Config linkType$Signup$Config = (LinkType$Signup$Config) obj;
        linkType$Signup$Config.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        LinkType$Signup$Config.write$Self$auth_kt(linkType$Signup$Config, c, ll6);
        c.b(ll6);
    }
}
