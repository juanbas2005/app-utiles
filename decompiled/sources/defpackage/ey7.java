package defpackage;

import io.github.jan.supabase.auth.user.UserInfo;
import io.github.jan.supabase.auth.user.UserSession;

/* renamed from: ey7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ey7 implements av2 {
    public static final ey7 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [ey7, java.lang.Object, av2] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("io.github.jan.supabase.auth.user.UserSession", obj, 9);
        ik5.k("access_token", false);
        ik5.k("refresh_token", false);
        ik5.k("provider_refresh_token", true);
        ik5.k("provider_token", true);
        ik5.k("expires_in", false);
        ik5.k("token_type", false);
        ik5.k("user", true);
        ik5.k("type", true);
        ik5.k("expiresAt", true);
        descriptor = ik5;
    }

    public final zr3[] childSerializers() {
        t47 t47 = t47.a;
        return new zr3[]{t47, t47, hj8.x(t47), hj8.x(t47), tc4.a, t47, hj8.x(zu7.a), t47, wd3.a};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object deserialize(ok1 ok1) {
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        Object obj = null;
        qd3 qd3 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        long j = 0;
        int i = 0;
        boolean z = true;
        UserInfo userInfo = null;
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
                    str2 = c.n(ll6, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = c.x(ll6, 2, t47.a, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = c.x(ll6, 3, t47.a, str4);
                    i |= 8;
                    break;
                case 4:
                    j = c.D(ll6, 4);
                    i |= 16;
                    break;
                case 5:
                    str5 = c.n(ll6, 5);
                    i |= 32;
                    break;
                case 6:
                    userInfo = (UserInfo) c.x(ll6, 6, zu7.a, userInfo);
                    i |= 64;
                    break;
                case 7:
                    str6 = c.n(ll6, 7);
                    i |= 128;
                    break;
                case 8:
                    qd3 = (qd3) c.r(ll6, 8, wd3.a, qd3);
                    i |= 256;
                    break;
                default:
                    h.e(h);
                    return obj;
            }
            obj = null;
        }
        c.b(ll6);
        return new UserSession(i, str, str2, str3, str4, j, str5, userInfo, str6, qd3, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        UserSession userSession = (UserSession) obj;
        userSession.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        UserSession.write$Self$auth_kt(userSession, c, ll6);
        c.b(ll6);
    }
}
