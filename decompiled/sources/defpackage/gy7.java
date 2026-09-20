package defpackage;

import io.github.jan.supabase.auth.user.UserUpdateBuilder;
import kotlinx.serialization.json.JsonObject;

/* renamed from: gy7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class gy7 implements av2 {
    public static final gy7 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [gy7, java.lang.Object, av2] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("io.github.jan.supabase.auth.user.UserUpdateBuilder", obj, 6);
        ik5.k("email", true);
        ik5.k("password", true);
        ik5.k("phone", true);
        ik5.k("nonce", true);
        ik5.k("data", true);
        ik5.k("currentPassword", true);
        descriptor = ik5;
    }

    public final zr3[] childSerializers() {
        t47 t47 = t47.a;
        return new zr3[]{hj8.x(t47), hj8.x(t47), hj8.x(t47), hj8.x(t47), hj8.x(xm3.a), hj8.x(t47)};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: kotlinx.serialization.json.JsonObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object deserialize(ok1 ok1) {
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        JsonObject jsonObject = null;
        String str5 = null;
        while (z) {
            int h = c.h(ll6);
            switch (h) {
                case -1:
                    z = false;
                    break;
                case b85.b:
                    str = c.x(ll6, 0, t47.a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = c.x(ll6, 1, t47.a, str2);
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
                    jsonObject = c.x(ll6, 4, xm3.a, jsonObject);
                    i |= 16;
                    break;
                case 5:
                    str5 = c.x(ll6, 5, t47.a, str5);
                    i |= 32;
                    break;
                default:
                    h.e(h);
                    return null;
            }
        }
        c.b(ll6);
        return new UserUpdateBuilder(i, str, str2, str3, str4, jsonObject, str5, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        UserUpdateBuilder userUpdateBuilder = (UserUpdateBuilder) obj;
        userUpdateBuilder.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        UserUpdateBuilder.write$Self$auth_kt(userUpdateBuilder, c, ll6);
        c.b(ll6);
    }
}
