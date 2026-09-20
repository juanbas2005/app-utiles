package defpackage;

import io.github.jan.supabase.auth.admin.AdminUserUpdateBuilder;
import kotlinx.serialization.json.JsonObject;

/* renamed from: aa  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class aa implements av2 {
    public static final aa a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [aa, java.lang.Object, av2] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("io.github.jan.supabase.auth.admin.AdminUserUpdateBuilder", obj, 9);
        ik5.k("email", true);
        ik5.k("password", true);
        ik5.k("app_metadata", true);
        ik5.k("user_metadata", true);
        ik5.k("email_confirm", true);
        ik5.k("phone_confirm", true);
        ik5.k("phone", true);
        ik5.k("ban_duration", true);
        ik5.k("role", true);
        descriptor = ik5;
    }

    public final zr3[] childSerializers() {
        t47 t47 = t47.a;
        zr3 x = hj8.x(t47);
        zr3 x2 = hj8.x(t47);
        xm3 xm3 = xm3.a;
        zr3 x3 = hj8.x(xm3);
        zr3 x4 = hj8.x(xm3);
        ja0 ja0 = ja0.a;
        return new zr3[]{x, x2, x3, x4, hj8.x(ja0), hj8.x(ja0), hj8.x(t47), hj8.x(t47), hj8.x(t47)};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: kotlinx.serialization.json.JsonObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: kotlinx.serialization.json.JsonObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object deserialize(ok1 ok1) {
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        Object obj = null;
        boolean z = true;
        String str = null;
        String str2 = null;
        String str3 = null;
        JsonObject jsonObject = null;
        JsonObject jsonObject2 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        while (z) {
            int h = c.h(ll6);
            switch (h) {
                case -1:
                    z = false;
                    break;
                case b85.b /*0*/:
                    str2 = c.x(ll6, 0, t47.a, str2);
                    i |= 1;
                    break;
                case 1:
                    str3 = c.x(ll6, 1, t47.a, str3);
                    i |= 2;
                    break;
                case 2:
                    jsonObject = c.x(ll6, 2, xm3.a, jsonObject);
                    i |= 4;
                    break;
                case 3:
                    jsonObject2 = c.x(ll6, 3, xm3.a, jsonObject2);
                    i |= 8;
                    break;
                case 4:
                    bool = c.x(ll6, 4, ja0.a, bool);
                    i |= 16;
                    break;
                case 5:
                    bool2 = c.x(ll6, 5, ja0.a, bool2);
                    i |= 32;
                    break;
                case 6:
                    str4 = c.x(ll6, 6, t47.a, str4);
                    i |= 64;
                    break;
                case 7:
                    str5 = c.x(ll6, 7, t47.a, str5);
                    i |= 128;
                    break;
                case 8:
                    str = (String) c.x(ll6, 8, t47.a, str);
                    i |= 256;
                    break;
                default:
                    h.e(h);
                    return obj;
            }
            obj = null;
        }
        c.b(ll6);
        return new AdminUserUpdateBuilder(i, str2, str3, jsonObject, jsonObject2, bool, bool2, str4, str5, str, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        AdminUserUpdateBuilder adminUserUpdateBuilder = (AdminUserUpdateBuilder) obj;
        adminUserUpdateBuilder.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        AdminUserUpdateBuilder.write$Self$auth_kt(adminUserUpdateBuilder, c, ll6);
        c.b(ll6);
    }
}
