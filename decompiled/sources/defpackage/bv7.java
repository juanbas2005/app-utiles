package defpackage;

import io.github.jan.supabase.auth.user.UserMfaFactor;

/* renamed from: bv7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class bv7 implements av2 {
    public static final bv7 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [bv7, java.lang.Object, av2] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("io.github.jan.supabase.auth.user.UserMfaFactor", obj, 7);
        ik5.k("id", false);
        ik5.k("created_at", false);
        ik5.k("updated_at", false);
        ik5.k("status", false);
        ik5.k("friendly_name", true);
        ik5.k("factor_type", false);
        ik5.k("last_challenged_at", true);
        descriptor = ik5;
    }

    public final zr3[] childSerializers() {
        t47 t47 = t47.a;
        wd3 wd3 = wd3.a;
        return new zr3[]{t47, wd3, wd3, t47, hj8.x(t47), t47, hj8.x(wd3)};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: qd3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: qd3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: qd3} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object deserialize(ok1 ok1) {
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        boolean z = true;
        int i = 0;
        String str = null;
        qd3 qd3 = null;
        qd3 qd32 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        qd3 qd33 = null;
        while (z) {
            int h = c.h(ll6);
            switch (h) {
                case -1:
                    z = false;
                    break;
                case b85.b:
                    str = c.n(ll6, 0);
                    i |= 1;
                    break;
                case 1:
                    qd3 = c.r(ll6, 1, wd3.a, qd3);
                    i |= 2;
                    break;
                case 2:
                    qd32 = c.r(ll6, 2, wd3.a, qd32);
                    i |= 4;
                    break;
                case 3:
                    str2 = c.n(ll6, 3);
                    i |= 8;
                    break;
                case 4:
                    str3 = c.x(ll6, 4, t47.a, str3);
                    i |= 16;
                    break;
                case 5:
                    str4 = c.n(ll6, 5);
                    i |= 32;
                    break;
                case 6:
                    qd33 = c.x(ll6, 6, wd3.a, qd33);
                    i |= 64;
                    break;
                default:
                    h.e(h);
                    return null;
            }
        }
        c.b(ll6);
        return new UserMfaFactor(i, str, qd3, qd32, str2, str3, str4, qd33, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        UserMfaFactor userMfaFactor = (UserMfaFactor) obj;
        userMfaFactor.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        UserMfaFactor.write$Self$auth_kt(userMfaFactor, c, ll6);
        c.b(ll6);
    }
}
