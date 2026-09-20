package defpackage;

import io.github.jan.supabase.auth.user.UserInfo;
import java.util.List;
import kotlinx.serialization.json.JsonObject;

/* renamed from: zu7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class zu7 implements av2 {
    public static final zu7 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, av2, zu7] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("io.github.jan.supabase.auth.user.UserInfo", obj, 27);
        ik5.k("app_metadata", true);
        ik5.k("aud", false);
        ik5.k("confirmation_sent_at", true);
        ik5.k("confirmed_at", true);
        ik5.k("created_at", true);
        ik5.k("email", true);
        ik5.k("email_confirmed_at", true);
        ik5.k("factors", true);
        ik5.k("id", false);
        ik5.k("identities", true);
        ik5.k("last_sign_in_at", true);
        ik5.k("phone", true);
        ik5.k("role", true);
        ik5.k("updated_at", true);
        ik5.k("user_metadata", true);
        ik5.k("phone_change_sent_at", true);
        ik5.k("new_phone", true);
        ik5.k("email_change_sent_at", true);
        ik5.k("new_email", true);
        ik5.k("invited_at", true);
        ik5.k("recovery_sent_at", true);
        ik5.k("phone_confirmed_at", true);
        ik5.k("action_link", true);
        ik5.k("is_anonymous", true);
        ik5.k("is_sso_user", true);
        ik5.k("banned_until", true);
        ik5.k("deleted_at", true);
        descriptor = ik5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: zr3[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final zr3[] childSerializers() {
        nz3[] access$get$childSerializers$cp = UserInfo.$childSerializers;
        xm3 xm3 = xm3.a;
        t47 t47 = t47.a;
        wd3 wd3 = wd3.a;
        ja0 ja0 = ja0.a;
        return new zr3[]{hj8.x(xm3), t47, hj8.x(wd3), hj8.x(wd3), hj8.x(wd3), hj8.x(t47), hj8.x(wd3), access$get$childSerializers$cp[7].getValue(), t47, hj8.x((zr3) access$get$childSerializers$cp[9].getValue()), hj8.x(wd3), hj8.x(t47), hj8.x(t47), hj8.x(wd3), hj8.x(xm3), hj8.x(wd3), hj8.x(t47), hj8.x(wd3), hj8.x(t47), hj8.x(wd3), hj8.x(wd3), hj8.x(wd3), hj8.x(t47), hj8.x(ja0), hj8.x(ja0), hj8.x(wd3), hj8.x(wd3)};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v6, resolved type: qd3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v4, resolved type: qd3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v4, resolved type: qd3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v4, resolved type: qd3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v4, resolved type: qd3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v32, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v35, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v5, resolved type: qd3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v38, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v25, resolved type: kotlinx.serialization.json.JsonObject} */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x013b, code lost:
        r2 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0156, code lost:
        r3 = r33;
        r10 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x01d5, code lost:
        r3 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x02a4, code lost:
        r21 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0059, code lost:
        r8 = r33 | r8;
        r10 = r34;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object deserialize(ok1 ok1) {
        qd3 qd3;
        JsonObject jsonObject;
        qd3 qd32;
        qd3 qd33;
        Boolean bool;
        int i;
        Boolean bool2;
        JsonObject jsonObject2;
        int i2;
        JsonObject jsonObject3;
        int i3;
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        nz3[] access$get$childSerializers$cp = UserInfo.$childSerializers;
        qd3 qd34 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        String str = null;
        qd3 qd35 = null;
        qd3 qd36 = null;
        int i4 = 0;
        qd3 qd37 = null;
        JsonObject jsonObject4 = null;
        String str2 = null;
        qd3 qd38 = null;
        String str3 = null;
        qd3 qd39 = null;
        qd3 qd310 = null;
        String str4 = null;
        boolean z = true;
        String str5 = null;
        JsonObject jsonObject5 = null;
        qd3 qd311 = null;
        qd3 qd312 = null;
        qd3 qd313 = null;
        String str6 = null;
        qd3 qd314 = null;
        List list = null;
        List list2 = null;
        qd3 qd315 = null;
        String str7 = null;
        String str8 = null;
        qd3 qd316 = null;
        while (z) {
            int h = c.h(ll6);
            switch (h) {
                case -1:
                    qd3 = qd34;
                    JsonObject jsonObject6 = jsonObject4;
                    jsonObject = jsonObject5;
                    qd3 qd317 = qd311;
                    z = false;
                    bool3 = bool3;
                    break;
                case b85.b:
                    qd3 = qd34;
                    jsonObject = (JsonObject) c.x(ll6, 0, xm3.a, jsonObject5);
                    i4 |= 1;
                    qd311 = qd311;
                    bool3 = bool3;
                    jsonObject4 = jsonObject4;
                    break;
                case 1:
                    qd33 = qd34;
                    bool = bool3;
                    JsonObject jsonObject7 = jsonObject4;
                    qd3 qd318 = qd311;
                    str5 = c.n(ll6, 1);
                    i = i4 | 2;
                    break;
                case 2:
                    qd32 = qd34;
                    bool2 = bool3;
                    jsonObject2 = jsonObject4;
                    qd3 qd319 = qd312;
                    qd311 = c.x(ll6, 2, wd3.a, qd311);
                    i4 |= 4;
                    break;
                case 3:
                    qd32 = qd34;
                    bool2 = bool3;
                    jsonObject2 = jsonObject4;
                    qd3 qd320 = qd313;
                    qd312 = c.x(ll6, 3, wd3.a, qd312);
                    i4 |= 8;
                    break;
                case 4:
                    qd32 = qd34;
                    bool2 = bool3;
                    jsonObject2 = jsonObject4;
                    String str9 = str6;
                    qd313 = c.x(ll6, 4, wd3.a, qd313);
                    i4 |= 16;
                    break;
                case 5:
                    qd32 = qd34;
                    bool2 = bool3;
                    jsonObject2 = jsonObject4;
                    qd3 qd321 = qd314;
                    str6 = c.x(ll6, 5, t47.a, str6);
                    i4 |= 32;
                    break;
                case 6:
                    qd32 = qd34;
                    bool2 = bool3;
                    jsonObject2 = jsonObject4;
                    List list3 = list;
                    qd314 = c.x(ll6, 6, wd3.a, qd314);
                    i4 |= 64;
                    break;
                case 7:
                    qd32 = qd34;
                    bool2 = bool3;
                    jsonObject2 = jsonObject4;
                    List list4 = list2;
                    list = c.r(ll6, 7, (zr3) access$get$childSerializers$cp[7].getValue(), list);
                    i4 |= 128;
                    break;
                case 8:
                    qd33 = qd34;
                    bool = bool3;
                    JsonObject jsonObject8 = jsonObject4;
                    List list5 = list2;
                    str4 = c.n(ll6, 8);
                    i = i4 | 256;
                    break;
                case 9:
                    qd32 = qd34;
                    bool2 = bool3;
                    jsonObject2 = jsonObject4;
                    qd3 qd322 = qd315;
                    list2 = c.x(ll6, 9, (zr3) access$get$childSerializers$cp[9].getValue(), list2);
                    i4 |= 512;
                    break;
                case 10:
                    qd32 = qd34;
                    bool2 = bool3;
                    jsonObject2 = jsonObject4;
                    String str10 = str7;
                    qd315 = c.x(ll6, 10, wd3.a, qd315);
                    i4 |= 1024;
                    break;
                case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                    qd32 = qd34;
                    bool2 = bool3;
                    jsonObject2 = jsonObject4;
                    String str11 = str8;
                    str7 = c.x(ll6, 11, t47.a, str7);
                    i4 |= 2048;
                    break;
                case 12:
                    qd32 = qd34;
                    bool2 = bool3;
                    jsonObject2 = jsonObject4;
                    qd3 qd323 = qd316;
                    str8 = c.x(ll6, 12, t47.a, str8);
                    i4 |= 4096;
                    break;
                case ry4.PERF_SESSIONS_FIELD_NUMBER:
                    qd32 = qd34;
                    jsonObject2 = jsonObject4;
                    bool2 = bool3;
                    qd316 = c.x(ll6, 13, wd3.a, qd316);
                    i4 |= 8192;
                    break;
                case 14:
                    qd32 = qd34;
                    jsonObject4 = c.x(ll6, 14, xm3.a, jsonObject4);
                    i4 |= 16384;
                    break;
                case h75.g:
                    i2 = i4;
                    jsonObject3 = jsonObject4;
                    qd37 = (qd3) c.x(ll6, 15, wd3.a, qd37);
                    i3 = 32768;
                    break;
                case 16:
                    i2 = i4;
                    jsonObject3 = jsonObject4;
                    str2 = (String) c.x(ll6, 16, t47.a, str2);
                    i3 = 65536;
                    break;
                case 17:
                    i2 = i4;
                    jsonObject3 = jsonObject4;
                    qd38 = (qd3) c.x(ll6, 17, wd3.a, qd38);
                    i3 = 131072;
                    break;
                case 18:
                    i2 = i4;
                    jsonObject3 = jsonObject4;
                    str3 = (String) c.x(ll6, 18, t47.a, str3);
                    i3 = 262144;
                    break;
                case 19:
                    i2 = i4;
                    jsonObject3 = jsonObject4;
                    qd39 = (qd3) c.x(ll6, 19, wd3.a, qd39);
                    i3 = 524288;
                    break;
                case 20:
                    i2 = i4;
                    jsonObject3 = jsonObject4;
                    qd310 = (qd3) c.x(ll6, 20, wd3.a, qd310);
                    i3 = 1048576;
                    break;
                case 21:
                    i2 = i4;
                    jsonObject3 = jsonObject4;
                    qd36 = (qd3) c.x(ll6, 21, wd3.a, qd36);
                    i3 = 2097152;
                    break;
                case 22:
                    i2 = i4;
                    jsonObject3 = jsonObject4;
                    str = (String) c.x(ll6, 22, t47.a, str);
                    i3 = 4194304;
                    break;
                case 23:
                    i2 = i4;
                    jsonObject3 = jsonObject4;
                    bool4 = (Boolean) c.x(ll6, 23, ja0.a, bool4);
                    i3 = 8388608;
                    break;
                case 24:
                    i2 = i4;
                    jsonObject3 = jsonObject4;
                    bool3 = (Boolean) c.x(ll6, 24, ja0.a, bool3);
                    i3 = 16777216;
                    break;
                case 25:
                    i2 = i4;
                    jsonObject3 = jsonObject4;
                    qd34 = (qd3) c.x(ll6, 25, wd3.a, qd34);
                    i3 = 33554432;
                    break;
                case 26:
                    i2 = i4;
                    jsonObject3 = jsonObject4;
                    qd35 = (qd3) c.x(ll6, 26, wd3.a, qd35);
                    i3 = 67108864;
                    break;
                default:
                    h.e(h);
                    return null;
            }
        }
        qd3 qd324 = qd34;
        Boolean bool5 = bool3;
        JsonObject jsonObject9 = jsonObject4;
        JsonObject jsonObject10 = jsonObject5;
        qd3 qd325 = qd311;
        c.b(ll6);
        List list6 = list;
        List list7 = list2;
        qd3 qd326 = qd315;
        String str12 = str3;
        qd3 qd327 = qd39;
        qd3 qd328 = qd310;
        return new UserInfo(i4, jsonObject10, str5, qd325, qd312, qd313, str6, qd314, list6, str4, list7, qd326, str7, str8, qd316, jsonObject9, qd37, str2, qd38, str12, qd327, qd328, qd36, str, bool4, bool5, qd324, qd35, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        UserInfo userInfo = (UserInfo) obj;
        userInfo.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        UserInfo.write$Self$auth_kt(userInfo, c, ll6);
        c.b(ll6);
    }
}
