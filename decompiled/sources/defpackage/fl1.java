package defpackage;

import io.github.jan.supabase.auth.a;
import io.github.jan.supabase.auth.user.UserInfo;
import io.github.jan.supabase.auth.user.UserSession;
import java.util.LinkedHashMap;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* renamed from: fl1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public interface fl1 extends sv {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: n0} */
    /* JADX WARNING: type inference failed for: r2v27, types: [uu] */
    /* JADX WARNING: type inference failed for: r2v28, types: [java.lang.Object, h06] */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0185, code lost:
        if (r2 != r15) goto L_0x0188;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01dc A[Catch:{ all -> 0x0041 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01e1 A[Catch:{ all -> 0x0041 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    static Object a(fl1 fl1, j77 j77, n0 n0Var, n6 n6Var, h61 h61) {
        el1 el1;
        int i;
        fl1 fl12;
        j77 j772;
        fl1 fl13;
        JsonObject jsonObject;
        fl1 fl14;
        JsonElement jsonElement;
        JsonObject jsonObject2;
        j77 j773;
        gs2 gs2;
        Object obj;
        j77 j774;
        gs2 gs22;
        a aVar;
        h06 h06;
        JsonObject jsonObject3;
        String str;
        JsonObject jsonObject4;
        h06 h062;
        fl1 fl15 = fl1;
        n6 n6Var2 = n6Var;
        h61 h612 = h61;
        if (h612 instanceof el1) {
            el1 = (el1) h612;
            int i2 = el1.K;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                el1.K = i2 - Integer.MIN_VALUE;
                Object obj2 = el1.I;
                i = el1.K;
                Object obj3 = p81.w;
                if (i != 0) {
                    o85.q(obj2);
                    if (n6Var2 != null) {
                        jsonObject3 = fl15.d(n6Var2);
                        aVar = rg3.t(j77);
                        ? obj4 = new Object();
                        if (aVar.c.y == tj2.x) {
                            byte[] bArr = new byte[64];
                            pc1 pc1 = oc1.b;
                            pc1.getClass();
                            pc1.c.nextBytes(bArr);
                            m50.f.getClass();
                            str = m50.a(m50.h, bArr);
                            kg5 kg5 = aVar.j;
                            el1.z = fl15;
                            el1.A = j77;
                            el1.B = n0Var;
                            el1.C = jsonObject3;
                            el1.D = aVar;
                            el1.E = obj4;
                            el1.F = str;
                            el1.K = 1;
                            kg5 kg52 = (kg5) kg5.y;
                            obj = null;
                            Object e0 = ar7.e0((h81) kg52.y, new gv(kg52, (String) kg5.x, str, (f61) null, 12), el1);
                            Object obj5 = vs7.a;
                            if (e0 != obj3) {
                                e0 = obj5;
                            }
                            if (e0 == obj3) {
                                obj5 = e0;
                            }
                            if (obj5 != obj3) {
                                j774 = j77;
                                gs22 = n0Var;
                                jsonObject4 = jsonObject3;
                                h062 = obj4;
                            }
                            return obj3;
                        }
                        obj = null;
                        j774 = j77;
                        gs22 = n0Var;
                        h06 = obj4;
                        String str2 = "signup";
                        if (!sg3.e(fl15, r22.a) && !sg3.e(fl15, qg5.a)) {
                            if (sg3.e(fl15, m73.a)) {
                                str2 = "token?grant_type=id_token";
                            } else {
                                h.c();
                                return obj;
                            }
                        }
                        aw awVar = aVar.k;
                        vm3 vm3 = new vm3();
                        l18.a(vm3, jsonObject3);
                        Object obj6 = h06.w;
                        if (obj6 != null) {
                            ag8.C(vm3, (String) obj6);
                        }
                        m70 m70 = new m70(l51.c, vm3.a(), (Object) null, 2);
                        el1.z = fl15;
                        el1.A = j774;
                        el1.B = gs22;
                        el1.C = null;
                        el1.D = null;
                        el1.E = null;
                        el1.F = null;
                        el1.G = null;
                        el1.H = null;
                        el1.K = 2;
                        obj2 = awVar.a(str2, m70, el1);
                        if (obj2 != obj3) {
                            fl12 = fl15;
                            gs2 = gs22;
                            j773 = j774;
                            el1.z = fl12;
                            el1.A = j773;
                            el1.B = gs2;
                            el1.C = null;
                            el1.D = null;
                            el1.E = null;
                            el1.F = null;
                            el1.G = null;
                            el1.H = null;
                            el1.K = 3;
                            obj2 = h49.q((yl1) obj2, mo0.a, el1);
                        }
                        return obj3;
                    }
                    h.q("Credentials are required");
                    return null;
                } else if (i == 1) {
                    String str3 = el1.F;
                    h062 = el1.E;
                    aVar = el1.D;
                    jsonObject4 = el1.C;
                    gs22 = el1.B;
                    j774 = el1.A;
                    fl1 fl16 = el1.z;
                    o85.q(obj2);
                    fl1 fl17 = fl16;
                    str = str3;
                    fl15 = fl17;
                    obj = null;
                } else if (i == 2) {
                    JsonObject jsonObject5 = (JsonObject) el1.H;
                    String str4 = (String) el1.G;
                    gs2 = el1.B;
                    j773 = el1.A;
                    fl12 = el1.z;
                    o85.q(obj2);
                    el1.z = fl12;
                    el1.A = j773;
                    el1.B = gs2;
                    el1.C = null;
                    el1.D = null;
                    el1.E = null;
                    el1.F = null;
                    el1.G = null;
                    el1.H = null;
                    el1.K = 3;
                    obj2 = h49.q((yl1) obj2, mo0.a, el1);
                } else if (i == 3) {
                    yl1 yl1 = (yl1) el1.G;
                    gs2 = el1.B;
                    j773 = el1.A;
                    fl12 = el1.z;
                    o85.q(obj2);
                    String str5 = (String) obj2;
                    try {
                        km3 km3 = l18.a;
                        km3.getClass();
                        JsonObject jsonObject6 = (JsonObject) km3.b(JsonObject.Companion.serializer(), str5);
                        if (jsonObject6.containsKey((Object) "access_token")) {
                            try {
                                el1.z = fl12;
                                el1.A = j773;
                                el1.B = null;
                                el1.C = null;
                                el1.D = null;
                                el1.E = null;
                                el1.F = null;
                                el1.G = jsonObject6;
                                el1.H = fl12;
                                el1.K = 4;
                                if (gs2.H((UserSession) km3.a(UserSession.Companion.serializer(), jsonObject6), el1) != obj3) {
                                    fl14 = fl12;
                                    fl13 = fl14;
                                    j772 = j773;
                                    jsonObject = jsonObject6;
                                    jsonElement = (JsonElement) jsonObject.get((Object) "user");
                                    if (jsonElement == null) {
                                    }
                                    return fl14.b(jsonObject2);
                                }
                                return obj3;
                            } catch (Throwable th) {
                                th = th;
                                fl13 = fl12;
                                j772 = j773;
                                jsonObject = jsonObject6;
                                Throwable a = o66.a(new m66(th));
                                if (a != null) {
                                    cf4 cf4 = ((a) rg3.t(j772)).d;
                                    ms3 ms3 = (ms3) cf4.z;
                                    String str6 = (String) cf4.y;
                                    ub4 ub4 = ub4.y;
                                    if (ms3.a(ub4)) {
                                        ms3.b(ub4, str6, a, "Failed to decode user info");
                                    }
                                    return null;
                                }
                                jsonObject6 = jsonObject;
                                fl12 = fl13;
                                return fl12.b(jsonObject6);
                            }
                        }
                        return fl12.b(jsonObject6);
                    } catch (MissingFieldException unused) {
                        throw new Exception("Couldn't decode payload as " + b26.a.b(JsonObject.class).A() + ". Input: " + k57.s0(str5, "\n", ""));
                    }
                } else if (i == 4) {
                    fl14 = el1.H;
                    jsonObject = el1.G;
                    j772 = el1.A;
                    fl13 = el1.z;
                    try {
                        o85.q(obj2);
                        jsonElement = (JsonElement) jsonObject.get((Object) "user");
                        if (jsonElement == null) {
                            jsonObject2 = em3.e(jsonElement);
                        } else {
                            jsonObject2 = new JsonObject(new LinkedHashMap());
                        }
                        return fl14.b(jsonObject2);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                h062.w = w95.f(str);
                h06 = h062;
                jsonObject3 = jsonObject4;
                String str22 = "signup";
                if (sg3.e(fl15, m73.a)) {
                }
            }
        }
        el1 = new el1(fl15, h612);
        Object obj22 = el1.I;
        i = el1.K;
        Object obj32 = p81.w;
        if (i != 0) {
        }
        h062.w = w95.f(str);
        h06 = h062;
        jsonObject3 = jsonObject4;
        String str222 = "signup";
        if (sg3.e(fl15, m73.a)) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0075, code lost:
        if (r12 == r6) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00aa, code lost:
        if (r7.H((io.github.jan.supabase.auth.user.UserSession) r8, r0) != r6) goto L_0x00ad;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    static Object c(fl1 fl1, j77 j77, gs2 gs2, String str, vr2 vr2, h61 h61) {
        dl1 dl1;
        Object obj;
        int i;
        p81 p81;
        gs2 gs22;
        String str2;
        if (h61 instanceof dl1) {
            dl1 = (dl1) h61;
            int i2 = dl1.D;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dl1.D = i2 - Integer.MIN_VALUE;
                obj = dl1.B;
                i = dl1.D;
                p81 = p81.w;
                if (i != 0) {
                    o85.q(obj);
                    if (vr2 != null) {
                        JsonObject d = fl1.d(vr2);
                        String concat = "token?grant_type=".concat(fl1.e());
                        aw awVar = ((a) rg3.t(j77)).k;
                        m70 m70 = new m70(l51.c, d, str, 1);
                        dl1.z = gs2;
                        dl1.A = null;
                        dl1.D = 1;
                        obj = awVar.a(concat, m70, dl1);
                    } else {
                        h.q("Credentials are required");
                        return null;
                    }
                } else if (i == 1) {
                    String str3 = (String) dl1.A;
                    gs2 = dl1.z;
                    o85.q(obj);
                } else if (i == 2) {
                    yl1 yl1 = (yl1) dl1.A;
                    gs22 = dl1.z;
                    o85.q(obj);
                    str2 = (String) obj;
                    try {
                        km3 km3 = l18.a;
                        km3.getClass();
                        Object b = km3.b(UserSession.Companion.serializer(), str2);
                        dl1.z = null;
                        dl1.A = b;
                        dl1.D = 3;
                    } catch (MissingFieldException unused) {
                        String A = b26.a.b(UserSession.class).A();
                        String s0 = k57.s0(str2, "\n", "");
                        throw new Exception("Couldn't decode payload as " + A + ". Input: " + s0);
                    }
                } else if (i == 3) {
                    o85.q(obj);
                    return vs7.a;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dl1.z = gs2;
                dl1.A = null;
                dl1.D = 2;
                obj = h49.q((yl1) obj, mo0.a, dl1);
                if (obj != p81) {
                    gs22 = gs2;
                    str2 = (String) obj;
                    km3 km32 = l18.a;
                    km32.getClass();
                    Object b2 = km32.b(UserSession.Companion.serializer(), str2);
                    dl1.z = null;
                    dl1.A = b2;
                    dl1.D = 3;
                }
                return p81;
            }
        }
        dl1 = new dl1(fl1, h61);
        obj = dl1.B;
        i = dl1.D;
        p81 = p81.w;
        if (i != 0) {
        }
        dl1.z = gs2;
        dl1.A = null;
        dl1.D = 2;
        obj = h49.q((yl1) obj, mo0.a, dl1);
        if (obj != p81) {
        }
        return p81;
    }

    UserInfo b(JsonObject jsonObject);

    JsonObject d(vr2 vr2);

    String e();
}
