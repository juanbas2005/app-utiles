package defpackage;

import io.github.jan.supabase.auth.admin.oauth.OAuthClientTokenEndpointAuthMethod;
import io.github.jan.supabase.auth.admin.oauth.UpdateOAuthClientBuilder;
import java.util.List;

/* renamed from: gu7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class gu7 implements av2 {
    public static final gu7 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [gu7, java.lang.Object, av2] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("io.github.jan.supabase.auth.admin.oauth.UpdateOAuthClientBuilder", obj, 7);
        ik5.k("client_name", true);
        ik5.k("client_uri", true);
        ik5.k("logo_uri", true);
        ik5.k("redirect_uris", true);
        ik5.k("grant_types", true);
        ik5.k("response_types", true);
        ik5.k("token_endpoint_auth_method", true);
        descriptor = ik5;
    }

    public final zr3[] childSerializers() {
        nz3[] access$get$childSerializers$cp = UpdateOAuthClientBuilder.$childSerializers;
        t47 t47 = t47.a;
        return new zr3[]{hj8.x(t47), hj8.x(t47), hj8.x(t47), hj8.x((zr3) access$get$childSerializers$cp[3].getValue()), hj8.x((zr3) access$get$childSerializers$cp[4].getValue()), hj8.x((zr3) access$get$childSerializers$cp[5].getValue()), hj8.x((zr3) access$get$childSerializers$cp[6].getValue())};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: io.github.jan.supabase.auth.admin.oauth.OAuthClientTokenEndpointAuthMethod} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object deserialize(ok1 ok1) {
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        nz3[] access$get$childSerializers$cp = UpdateOAuthClientBuilder.$childSerializers;
        Object obj = null;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        OAuthClientTokenEndpointAuthMethod oAuthClientTokenEndpointAuthMethod = null;
        while (z) {
            int h = c.h(ll6);
            switch (h) {
                case -1:
                    z = false;
                    continue;
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
                    list = c.x(ll6, 3, (zr3) access$get$childSerializers$cp[3].getValue(), list);
                    i |= 8;
                    break;
                case 4:
                    list2 = c.x(ll6, 4, (zr3) access$get$childSerializers$cp[4].getValue(), list2);
                    i |= 16;
                    break;
                case 5:
                    list3 = c.x(ll6, 5, (zr3) access$get$childSerializers$cp[5].getValue(), list3);
                    i |= 32;
                    break;
                case 6:
                    oAuthClientTokenEndpointAuthMethod = c.x(ll6, 6, (zr3) access$get$childSerializers$cp[6].getValue(), oAuthClientTokenEndpointAuthMethod);
                    i |= 64;
                    break;
                default:
                    h.e(h);
                    return obj;
            }
            obj = null;
        }
        c.b(ll6);
        return new UpdateOAuthClientBuilder(i, str, str2, str3, list, list2, list3, oAuthClientTokenEndpointAuthMethod, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        UpdateOAuthClientBuilder updateOAuthClientBuilder = (UpdateOAuthClientBuilder) obj;
        updateOAuthClientBuilder.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        UpdateOAuthClientBuilder.write$Self$auth_kt(updateOAuthClientBuilder, c, ll6);
        c.b(ll6);
    }
}
