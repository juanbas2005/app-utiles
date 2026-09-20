package defpackage;

import io.github.jan.supabase.auth.admin.LinkType$EmailChangeCurrent$Config;

/* renamed from: f74  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class f74 implements av2 {
    public static final f74 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [f74, java.lang.Object, av2] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("io.github.jan.supabase.auth.admin.LinkType.EmailChangeCurrent.Config", obj, 2);
        ik5.k("email", true);
        ik5.k("new_email", true);
        descriptor = ik5;
    }

    public final zr3[] childSerializers() {
        t47 t47 = t47.a;
        return new zr3[]{t47, t47};
    }

    public final Object deserialize(ok1 ok1) {
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
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
            } else {
                h.e(h);
                return null;
            }
        }
        c.b(ll6);
        return new LinkType$EmailChangeCurrent$Config(i, str, str2, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        LinkType$EmailChangeCurrent$Config linkType$EmailChangeCurrent$Config = (LinkType$EmailChangeCurrent$Config) obj;
        linkType$EmailChangeCurrent$Config.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        LinkType$EmailChangeCurrent$Config.write$Self$auth_kt(linkType$EmailChangeCurrent$Config, c, ll6);
        c.b(ll6);
    }
}
