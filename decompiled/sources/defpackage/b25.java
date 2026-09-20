package defpackage;

import io.github.jan.supabase.auth.admin.oauth.OAuthClient;
import io.github.jan.supabase.auth.admin.oauth.OAuthClientRegistrationType;
import io.github.jan.supabase.auth.admin.oauth.OAuthClientTokenEndpointAuthMethod;
import io.github.jan.supabase.auth.admin.oauth.OAuthClientType;
import java.util.List;

/* renamed from: b25  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class b25 implements av2 {
    public static final b25 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [b25, java.lang.Object, av2] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("io.github.jan.supabase.auth.admin.oauth.OAuthClient", obj, 14);
        ik5.k("client_id", false);
        ik5.k("client_secret", true);
        ik5.k("client_name", false);
        ik5.k("client_type", true);
        ik5.k("client_uri", true);
        ik5.k("logo_uri", true);
        ik5.k("redirect_uris", true);
        ik5.k("grant_types", true);
        ik5.k("response_types", true);
        ik5.k("scope", true);
        ik5.k("token_endpoint_auth_method", true);
        ik5.k("registration_type", true);
        ik5.k("created_at", true);
        ik5.k("updated_at", true);
        descriptor = ik5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: zr3[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final zr3[] childSerializers() {
        nz3[] access$get$childSerializers$cp = OAuthClient.$childSerializers;
        t47 t47 = t47.a;
        return new zr3[]{t47, hj8.x(t47), t47, hj8.x((zr3) access$get$childSerializers$cp[3].getValue()), hj8.x(t47), hj8.x(t47), access$get$childSerializers$cp[6].getValue(), access$get$childSerializers$cp[7].getValue(), access$get$childSerializers$cp[8].getValue(), hj8.x(t47), hj8.x((zr3) access$get$childSerializers$cp[10].getValue()), hj8.x((zr3) access$get$childSerializers$cp[11].getValue()), hj8.x(t47), hj8.x(t47)};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: io.github.jan.supabase.auth.admin.oauth.OAuthClientType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.util.List} */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0134, code lost:
        r2 = r16;
        r11 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0147, code lost:
        r10 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003f, code lost:
        r11 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0041, code lost:
        r10 = r21;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object deserialize(ok1 ok1) {
        OAuthClientRegistrationType oAuthClientRegistrationType;
        String str;
        String str2;
        String str3;
        String str4;
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        nz3[] access$get$childSerializers$cp = OAuthClient.$childSerializers;
        OAuthClientRegistrationType oAuthClientRegistrationType2 = null;
        OAuthClientTokenEndpointAuthMethod oAuthClientTokenEndpointAuthMethod = null;
        String str5 = null;
        List list = null;
        String str6 = null;
        List list2 = null;
        int i = 0;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        OAuthClientType oAuthClientType = null;
        String str10 = null;
        String str11 = null;
        List list3 = null;
        boolean z = true;
        String str12 = null;
        while (z) {
            int h = c.h(ll6);
            switch (h) {
                case -1:
                    oAuthClientRegistrationType = oAuthClientRegistrationType2;
                    str = str9;
                    str2 = str8;
                    z = false;
                    break;
                case b85.b /*0*/:
                    oAuthClientRegistrationType = oAuthClientRegistrationType2;
                    str = str9;
                    str2 = str8;
                    str12 = c.n(ll6, 0);
                    i |= 1;
                    break;
                case 1:
                    str = str9;
                    oAuthClientRegistrationType = oAuthClientRegistrationType2;
                    str8 = (String) c.x(ll6, 1, t47.a, str8);
                    i |= 2;
                    break;
                case 2:
                    str3 = str8;
                    str9 = c.n(ll6, 2);
                    i |= 4;
                    break;
                case 3:
                    str3 = str8;
                    str4 = str9;
                    oAuthClientType = c.x(ll6, 3, (zr3) access$get$childSerializers$cp[3].getValue(), oAuthClientType);
                    i |= 8;
                    break;
                case 4:
                    str3 = str8;
                    str4 = str9;
                    str10 = c.x(ll6, 4, t47.a, str10);
                    i |= 16;
                    break;
                case 5:
                    str3 = str8;
                    str4 = str9;
                    str11 = c.x(ll6, 5, t47.a, str11);
                    i |= 32;
                    break;
                case 6:
                    str3 = str8;
                    str4 = str9;
                    list3 = c.r(ll6, 6, (zr3) access$get$childSerializers$cp[6].getValue(), list3);
                    i |= 64;
                    break;
                case 7:
                    str3 = str8;
                    str4 = str9;
                    list2 = (List) c.r(ll6, 7, (zr3) access$get$childSerializers$cp[7].getValue(), list2);
                    i |= 128;
                    break;
                case 8:
                    str3 = str8;
                    str4 = str9;
                    list = (List) c.r(ll6, 8, (zr3) access$get$childSerializers$cp[8].getValue(), list);
                    i |= 256;
                    break;
                case 9:
                    str3 = str8;
                    str4 = str9;
                    str5 = (String) c.x(ll6, 9, t47.a, str5);
                    i |= 512;
                    break;
                case 10:
                    str3 = str8;
                    str4 = str9;
                    oAuthClientTokenEndpointAuthMethod = (OAuthClientTokenEndpointAuthMethod) c.x(ll6, 10, (zr3) access$get$childSerializers$cp[10].getValue(), oAuthClientTokenEndpointAuthMethod);
                    i |= 1024;
                    break;
                case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                    str3 = str8;
                    str4 = str9;
                    oAuthClientRegistrationType2 = (OAuthClientRegistrationType) c.x(ll6, 11, (zr3) access$get$childSerializers$cp[11].getValue(), oAuthClientRegistrationType2);
                    i |= 2048;
                    break;
                case 12:
                    str3 = str8;
                    str4 = str9;
                    str6 = (String) c.x(ll6, 12, t47.a, str6);
                    i |= 4096;
                    break;
                case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                    str4 = str9;
                    str3 = str8;
                    str7 = (String) c.x(ll6, 13, t47.a, str7);
                    i |= 8192;
                    break;
                default:
                    h.e(h);
                    return null;
            }
        }
        c.b(ll6);
        return new OAuthClient(i, str12, str8, str9, oAuthClientType, str10, str11, list3, list2, list, str5, oAuthClientTokenEndpointAuthMethod, oAuthClientRegistrationType2, str6, str7, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        OAuthClient oAuthClient = (OAuthClient) obj;
        oAuthClient.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        OAuthClient.write$Self$auth_kt(oAuthClient, c, ll6);
        c.b(ll6);
    }
}
