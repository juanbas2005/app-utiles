package io.github.jan.supabase.auth;

import io.github.jan.supabase.auth.GoTrueErrorResponse;
import io.github.jan.supabase.auth.exception.AuthRestException;
import io.github.jan.supabase.auth.user.UserInfo;
import io.github.jan.supabase.auth.user.UserSession;
import io.github.jan.supabase.auth.user.UserUpdateBuilder;
import io.github.jan.supabase.exceptions.RestException;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class a implements uu {
    public static final /* synthetic */ int q = 0;
    public final j77 b;
    public final wu c;
    public final cf4 d;
    public final d37 e;
    public final xw5 f;
    public final pr6 g = qr6.a((vc0) null, 6);
    public final ig0 h;
    public final cf4 i;
    public final kg5 j;
    public final aw k;
    public final i77 l;
    public final aw m;
    public h27 n;
    public an6 o;
    public final t77 p;

    public a(j77 j77, wu wuVar) {
        j77.getClass();
        wuVar.getClass();
        this.b = j77;
        this.c = wuVar;
        this.d = t75.j(j77, "Supabase-Auth", (ub4) null, (vr2) null);
        d37 a = e37.a(jn6.a);
        this.e = a;
        this.f = gr8.t(a);
        m77 m77 = (m77) j77;
        h81 h81 = m77.e;
        w77 d2 = b85.d();
        h81.getClass();
        this.h = gl0.E(rc9.D0(h81, d2));
        int i2 = gk5.a;
        String str = m77.c;
        this.i = new cf4(ub5.g(str).concat("-session"), 16);
        this.j = new kg5(ub5.g(str).concat("-supabase_code_verifier"));
        aw g2 = sg3.g(j77, this, (ay5) null, (Integer) null, 10);
        this.k = g2;
        this.l = new i77(new no6(1, this, qe4.class, "resolveUrl", "resolveUrl(Ljava/lang/String;)Ljava/lang/String;", 0, 0, 27), new yv(2, this, qe4.class, "parseErrorResponse", "parseErrorResponse(Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 15), m77.h);
        this.m = g2;
        g2.d("factors");
        this.p = m77.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0065, code lost:
        if (r12 == r8) goto L_0x0083;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0083 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0084 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    public static final Object l(a aVar, UserSession userSession, boolean z, h61 h61) {
        cv cvVar;
        int i2;
        p81 p81;
        Object o2;
        if (h61 instanceof cv) {
            cvVar = (cv) h61;
            int i3 = cvVar.D;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cvVar.D = i3 - Integer.MIN_VALUE;
                cv cvVar2 = cvVar;
                Object obj = cvVar2.B;
                i2 = cvVar2.D;
                vs7 vs7 = vs7.a;
                p81 = p81.w;
                if (i2 != 0) {
                    o85.q(obj);
                    cf4 cf4 = aVar.d;
                    ms3 ms3 = (ms3) cf4.z;
                    String str = (String) cf4.y;
                    ub4 ub4 = ub4.w;
                    if (ms3.a(ub4)) {
                        ms3.b(ub4, str, (Throwable) null, "Session expired. Refreshing session...");
                    }
                    String refreshToken = userSession.getRefreshToken();
                    cvVar2.z = userSession;
                    cvVar2.A = z;
                    cvVar2.D = 1;
                    obj = aVar.t(refreshToken, cvVar2);
                } else if (i2 == 1) {
                    z = cvVar2.A;
                    userSession = cvVar2.z;
                    o85.q(obj);
                } else if (i2 == 2) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cn6 cn6 = new cn6(userSession);
                cvVar2.z = null;
                cvVar2.A = z;
                cvVar2.D = 2;
                o2 = aVar.o((UserSession) obj, z, cn6, false, cvVar2);
                if (o2 != p81) {
                    o2 = vs7;
                }
                if (o2 != p81) {
                    return p81;
                }
                return vs7;
            }
        }
        cvVar = new cv(aVar, h61);
        cv cvVar22 = cvVar;
        Object obj2 = cvVar22.B;
        i2 = cvVar22.D;
        vs7 vs72 = vs7.a;
        p81 = p81.w;
        if (i2 != 0) {
        }
        cn6 cn62 = new cn6(userSession);
        cvVar22.z = null;
        cvVar22.A = z;
        cvVar22.D = 2;
        o2 = aVar.o((UserSession) obj2, z, cn62, false, cvVar22);
        if (o2 != p81) {
        }
        if (o2 != p81) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00cc, code lost:
        if (r11 == r5) goto L_0x0182;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d0, code lost:
        r2.z = null;
        r2.A = null;
        r2.D = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00dc, code lost:
        if (r10.y(r2) != r5) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x014b, code lost:
        if (r11 == r5) goto L_0x0182;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x014e, code lost:
        r2.z = null;
        r2.A = null;
        r2.D = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0159, code lost:
        if (r10.y(r2) != r5) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        return r4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    public static final Object m(a aVar, xc xcVar, zc zcVar, gv gvVar, h61 h61) {
        nv nvVar;
        int i2;
        vr2 vr2;
        vr2 vr22;
        vr2 vr23;
        vr2 vr24;
        cf4 cf4 = aVar.d;
        wu wuVar = aVar.c;
        if (h61 instanceof nv) {
            nvVar = (nv) h61;
            int i3 = nvVar.D;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                nvVar.D = i3 - Integer.MIN_VALUE;
                Object obj = nvVar.B;
                i2 = nvVar.D;
                vs7 vs7 = vs7.a;
                p81 p81 = p81.w;
                switch (i2) {
                    case b85.b:
                        o85.q(obj);
                        vr23 = zcVar;
                        vr24 = zcVar;
                        nvVar.z = zcVar;
                        nvVar.A = gvVar;
                        nvVar.D = 1;
                        if (xcVar.y(nvVar) != p81) {
                            return vs7;
                        }
                        break;
                    case 1:
                        gvVar = nvVar.A;
                        vr2 vr25 = nvVar.z;
                        try {
                            vr23 = vr25;
                            vr24 = vr25;
                            o85.q(obj);
                            vr23 = vr25;
                            vr24 = vr25;
                            return vs7;
                        } catch (RestException e2) {
                            List list = qv.b;
                            int i4 = e2.w;
                            boolean contains = list.contains(new Integer(i4));
                            ub4 ub4 = ub4.z;
                            if (contains) {
                                ms3 ms3 = (ms3) cf4.z;
                                String str = (String) cf4.y;
                                if (ms3.a(ub4)) {
                                    ms3.b(ub4, str, e2, "Couldn't refresh session due to an internal server error. Retrying in " + u02.k(wuVar.u) + " (Status code " + i4 + ")...");
                                }
                                g26 g26 = new g26(e2);
                                nvVar.z = vr23;
                                nvVar.A = null;
                                nvVar.D = 2;
                                gvVar.H(g26, nvVar);
                                if (vs7 != p81) {
                                    vr2 = vr23;
                                    long j2 = wuVar.u;
                                    nvVar.z = vr2;
                                    nvVar.A = null;
                                    nvVar.D = 3;
                                    Object G = t49.G(t49.d0(j2), nvVar);
                                    if (G != p81) {
                                        G = vs7;
                                        break;
                                    }
                                }
                            } else {
                                ms3 ms32 = (ms3) cf4.z;
                                String str2 = (String) cf4.y;
                                if (ms32.a(ub4)) {
                                    ms32.b(ub4, str2, e2, pb4.i(i4, "Couldn't refresh session. The refresh token may have been revoked. Clearing session (Status code ", ")... "));
                                }
                                nvVar.z = null;
                                nvVar.A = null;
                                nvVar.D = 5;
                                if (aVar.n(nvVar) != p81) {
                                    return vs7;
                                }
                            }
                        } catch (Exception e3) {
                            e81 e81 = nvVar.x;
                            e81.getClass();
                            r16.x(e81);
                            ms3 ms33 = (ms3) cf4.z;
                            String str3 = (String) cf4.y;
                            ub4 ub42 = ub4.w;
                            if (ms33.a(ub42)) {
                                ms33.b(ub42, str3, e3, "Couldn't reach Supabase. Either the address doesn't exist or the network might not be on. Retrying in " + u02.k(wuVar.u) + "...");
                            }
                            h26 h26 = new h26(e3);
                            nvVar.z = vr24;
                            nvVar.A = null;
                            nvVar.D = 6;
                            gvVar.H(h26, nvVar);
                            if (vs7 != p81) {
                                vr22 = vr24;
                                long j3 = wuVar.u;
                                nvVar.z = vr22;
                                nvVar.A = null;
                                nvVar.D = 7;
                                Object G2 = t49.G(t49.d0(j3), nvVar);
                                if (G2 != p81) {
                                    G2 = vs7;
                                    break;
                                }
                            }
                        }
                        break;
                    case 2:
                        vr2 = nvVar.z;
                        o85.q(obj);
                        break;
                    case 3:
                        vr2 = nvVar.z;
                        o85.q(obj);
                        break;
                    case 4:
                    case 5:
                    case 8:
                        o85.q(obj);
                        return vs7;
                    case 6:
                        vr22 = nvVar.z;
                        o85.q(obj);
                        break;
                    case 7:
                        vr22 = nvVar.z;
                        o85.q(obj);
                        break;
                    default:
                        h.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        nvVar = new nv(aVar, h61);
        Object obj2 = nvVar.B;
        i2 = nvVar.D;
        vs7 vs72 = vs7.a;
        p81 p812 = p81.w;
        switch (i2) {
            case b85.b:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
            case 5:
            case 8:
                break;
            case 6:
                break;
            case 7:
                break;
        }
    }

    public final Object d() {
        return this.c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0111 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Serializable e(yl1 yl1, f61 f61) {
        fv fvVar;
        int i2;
        yl1 yl12;
        j77 j77;
        Object obj;
        String str;
        Object obj2;
        GoTrueErrorResponse goTrueErrorResponse;
        String error;
        AuthRestException authRestException;
        RestException restException;
        if (f61 instanceof fv) {
            fvVar = (fv) f61;
            int i3 = fvVar.D;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                fvVar.D = i3 - Integer.MIN_VALUE;
                Object obj3 = fvVar.B;
                i2 = fvVar.D;
                if (i2 != 0) {
                    o85.q(obj3);
                    fvVar.z = yl1;
                    j77 j772 = this.b;
                    fvVar.A = j772;
                    fvVar.D = 1;
                    obj = h49.q(yl1, mo0.a, fvVar);
                    p81 p81 = p81.w;
                    if (obj == p81) {
                        return p81;
                    }
                    j77 j773 = j772;
                    yl12 = yl1;
                    j77 = j773;
                } else if (i2 == 1) {
                    j77 = fvVar.A;
                    yl1 yl13 = fvVar.z;
                    o85.q(obj3);
                    yl1 yl14 = yl13;
                    obj = obj3;
                    yl12 = yl14;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = (String) obj;
                km3 km3 = l18.a;
                km3.getClass();
                obj2 = km3.b(GoTrueErrorResponse.Companion.serializer(), str);
                goTrueErrorResponse = (GoTrueErrorResponse) obj2;
                if (goTrueErrorResponse == null) {
                    goTrueErrorResponse = new GoTrueErrorResponse("Unknown error", "", (GoTrueErrorResponse.WeakPassword) null, 4, (hl1) null);
                }
                error = goTrueErrorResponse.getError();
                if (!sg3.e(error, "weak_password")) {
                    String description = goTrueErrorResponse.getDescription();
                    GoTrueErrorResponse.WeakPassword weakPassword = goTrueErrorResponse.getWeakPassword();
                    if (weakPassword != null) {
                        List<String> reasons = weakPassword.getReasons();
                    }
                    description.getClass();
                    yl12.getClass();
                    authRestException = new AuthRestException("weak_password", description, yl12);
                } else if (sg3.e(error, "session_not_found")) {
                    ar7.H(this.h, (e81) null, (r81) null, new av(this, (f61) null, 0), 3);
                    yl12.getClass();
                    authRestException = new AuthRestException("session_not_found", "Session not found. This can happen if the user was logged out or deleted.", yl12);
                } else {
                    String error2 = goTrueErrorResponse.getError();
                    if (error2 != null) {
                        authRestException = new AuthRestException(error2, goTrueErrorResponse.getDescription(), yl12);
                    } else {
                        authRestException = null;
                    }
                }
                if (authRestException == null) {
                    return authRestException;
                }
                w63 e2 = yl12.e();
                if (sg3.e(e2, w63.E)) {
                    String error3 = goTrueErrorResponse.getError();
                    if (error3 == null) {
                        error3 = "Unauthorized";
                    }
                    restException = new RestException(error3, goTrueErrorResponse.getDescription(), yl12);
                } else if (sg3.e(e2, w63.D)) {
                    String error4 = goTrueErrorResponse.getError();
                    if (error4 == null) {
                        error4 = "Bad Request";
                    }
                    restException = new RestException(error4, goTrueErrorResponse.getDescription(), yl12);
                } else if (sg3.e(e2, w63.G)) {
                    String error5 = goTrueErrorResponse.getError();
                    if (error5 == null) {
                        error5 = "Unprocessable Entity";
                    }
                    restException = new RestException(error5, goTrueErrorResponse.getDescription(), yl12);
                } else {
                    String error6 = goTrueErrorResponse.getError();
                    if (error6 == null) {
                        error6 = "Unknown Error";
                    }
                    restException = new RestException(error6, (String) null, yl12);
                }
                return restException;
            }
        }
        fvVar = new fv(this, f61);
        Object obj32 = fvVar.B;
        i2 = fvVar.D;
        if (i2 != 0) {
        }
        str = (String) obj;
        try {
            km3 km32 = l18.a;
            km32.getClass();
            obj2 = km32.b(GoTrueErrorResponse.Companion.serializer(), str);
        } catch (SerializationException e3) {
            cf4 cf4 = ((m77) j77).f;
            ms3 ms3 = (ms3) cf4.z;
            String str2 = (String) cf4.y;
            ub4 ub4 = ub4.x;
            if (ms3.a(ub4)) {
                ms3.b(ub4, str2, e3, "Could not decode " + d57.i1(200, str) + " as " + b26.a.b(GoTrueErrorResponse.class).A() + '.');
            }
            obj2 = null;
        }
        goTrueErrorResponse = (GoTrueErrorResponse) obj2;
        if (goTrueErrorResponse == null) {
        }
        error = goTrueErrorResponse.getError();
        if (!sg3.e(error, "weak_password")) {
        }
        if (authRestException == null) {
        }
    }

    public final String f() {
        uu.a.getClass();
        return tu.x;
    }

    public final void g() {
        cf4 cf4 = this.d;
        ms3 ms3 = (ms3) cf4.z;
        ms3 ms32 = (ms3) cf4.z;
        String str = (String) cf4.y;
        ub4 ub4 = ub4.w;
        if (ms3.a(ub4)) {
            ms3.b(ub4, str, (Throwable) null, "Initializing Auth plugin...");
        }
        wu wuVar = this.c;
        boolean z = wuVar.w;
        ig0 ig0 = this.h;
        if (z) {
            ar7.H(ig0, (e81) null, (r81) null, new av(this, (f61) null, 1), 3);
        } else {
            if (ms32.a(ub4)) {
                ms32.b(ub4, str, (Throwable) null, "Skipping loading from storage (autoLoadFromStorage is set to false)");
            }
            if (wuVar.B) {
                ar7.H(ig0, (e81) null, (r81) null, new av(this, (f61) null, 2), 3);
            }
        }
        if (ms32.a(ub4)) {
            ms32.b(ub4, str, (Throwable) null, "Initialized Auth plugin");
        }
    }

    public final j77 h() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005b, code lost:
        if (r10 == r6) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007f, code lost:
        if (r10 != r6) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0081, code lost:
        return r6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    public final Object n(h61 h61) {
        bv bvVar;
        int i2;
        Object obj;
        Object e0;
        if (h61 instanceof bv) {
            bvVar = (bv) h61;
            int i3 = bvVar.B;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bvVar.B = i3 - Integer.MIN_VALUE;
                Object obj2 = bvVar.z;
                i2 = bvVar.B;
                Object obj3 = vs7.a;
                obj = p81.w;
                if (i2 != 0) {
                    o85.q(obj2);
                    bvVar.B = 1;
                    kg5 kg5 = this.j;
                    kg5 kg52 = (kg5) kg5.y;
                    Object e02 = ar7.e0((h81) kg52.y, new c97(kg52, (String) kg5.x, (f61) null, 1), bvVar);
                    if (e02 != obj) {
                        e02 = obj3;
                    }
                    if (e02 != obj) {
                        e02 = obj3;
                    }
                } else if (i2 == 1) {
                    o85.q(obj2);
                } else if (i2 == 2) {
                    o85.q(obj2);
                    u(new kn6(true));
                    w();
                    return obj3;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bvVar.B = 2;
                cf4 cf4 = this.i;
                kg5 kg53 = (kg5) cf4.z;
                e0 = ar7.e0((h81) kg53.y, new c97(kg53, (String) cf4.x, (f61) null, 1), bvVar);
                if (e0 != obj) {
                    e0 = obj3;
                }
                if (e0 != obj) {
                    e0 = obj3;
                }
            }
        }
        bvVar = new bv(this, h61);
        Object obj22 = bvVar.z;
        i2 = bvVar.B;
        Object obj32 = vs7.a;
        obj = p81.w;
        if (i2 != 0) {
        }
        bvVar.B = 2;
        cf4 cf42 = this.i;
        kg5 kg532 = (kg5) cf42.z;
        e0 = ar7.e0((h81) kg532.y, new c97(kg532, (String) cf42.x, (f61) null, 1), bvVar);
        if (e0 != obj) {
        }
        if (e0 != obj) {
        }
    }

    /* JADX WARNING: type inference failed for: r10v2, types: [hn6, io.github.jan.supabase.auth.user.UserSession] */
    /* JADX WARNING: type inference failed for: r10v3 */
    /* JADX WARNING: type inference failed for: r10v4 */
    /* JADX WARNING: type inference failed for: r10v9, types: [hn6, io.github.jan.supabase.auth.user.UserSession] */
    /* JADX WARNING: type inference failed for: r10v10 */
    /* JADX WARNING: type inference failed for: r10v11 */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d2, code lost:
        if (r6.C(r1, r5) == r15) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0179, code lost:
        if (r6.C(r1, r5) == r15) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01bf, code lost:
        if (r0.r(r1, r3, true, r4, r5) != r15) goto L_0x01c2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003a  */
    public final Object o(UserSession userSession, boolean z, hn6 hn6, boolean z2, h61 h61) {
        dv dvVar;
        int i2;
        ub4 ub4;
        UserSession userSession2;
        ms3 ms3;
        ? r10;
        ms3 ms32;
        ms3 ms33;
        ? r102;
        a aVar = this;
        UserSession userSession3 = userSession;
        boolean z3 = z;
        hn6 hn62 = hn6;
        boolean z4 = z2;
        h61 h612 = h61;
        if (h612 instanceof dv) {
            dvVar = (dv) h612;
            int i3 = dvVar.F;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dvVar.F = i3 - Integer.MIN_VALUE;
                dv dvVar2 = dvVar;
                Object obj = dvVar2.D;
                i2 = dvVar2.F;
                ub4 = ub4.w;
                vs7 vs7 = vs7.a;
                cf4 cf4 = aVar.d;
                Object obj2 = p81.w;
                if (i2 != 0) {
                    o85.q(obj);
                    ms3 ms34 = (ms3) cf4.z;
                    String str = (String) cf4.y;
                    if (ms34.a(ub4)) {
                        ms34.b(ub4, str, (Throwable) null, "Importing session " + userSession3 + " from " + hn62 + ", auto refresh is set to " + z3 + '.');
                    }
                    cf4 cf42 = aVar.i;
                    wu wuVar = aVar.c;
                    if (!z3) {
                        if (!d57.I0(userSession3.getRefreshToken()) && userSession3.getExpiresIn() != 0 && wuVar.x) {
                            dvVar2.z = userSession3;
                            dvVar2.A = hn62;
                            dvVar2.B = z3;
                            dvVar2.C = z4;
                            dvVar2.F = 1;
                        }
                        aVar.u(new in6(userSession3, hn62));
                        ms32 = (ms3) cf4.z;
                        String str2 = (String) cf4.y;
                        if (ms32.a(ub4)) {
                            ms32.b(ub4, str2, (Throwable) null, "Session imported successfully.");
                            return vs7;
                        }
                        return vs7;
                    }
                    qd3 expiresAt = userSession3.getExpiresAt();
                    xb4 xb4 = u02.x;
                    long i4 = u02.i(gl0.f0(userSession3.getExpiresIn(), y02.SECONDS), 0.19999999999999996d);
                    expiresAt.getClass();
                    if (expiresAt.b(u02.l(i4)).compareTo(td3.a.c()) <= 0) {
                        ms3 ms35 = (ms3) cf4.z;
                        if (ms35.a(ub4)) {
                            r102 = 0;
                            ms35.b(ub4, str, (Throwable) null, "Session is under the threshold date. Refreshing session...");
                        } else {
                            r102 = 0;
                        }
                        dvVar2.z = r102;
                        dvVar2.A = r102;
                        dvVar2.B = z3;
                        dvVar2.C = z4;
                        dvVar2.F = 2;
                        if (r(userSession, hn6, false, z4, dvVar2) == obj2) {
                            return obj2;
                        }
                        return vs7;
                    }
                    aVar = this;
                    userSession2 = userSession;
                    if (wuVar.x) {
                        dvVar2.z = userSession2;
                        dvVar2.A = hn62;
                        dvVar2.B = z3;
                        dvVar2.C = z4;
                        dvVar2.F = 3;
                    }
                    aVar.u(new in6(userSession2, hn62));
                    ms3 = (ms3) cf4.z;
                    String str3 = (String) cf4.y;
                    if (!ms3.a(ub4)) {
                    }
                    dvVar2.z = r10;
                    dvVar2.A = r10;
                    dvVar2.B = z3;
                    dvVar2.C = z4;
                    dvVar2.F = 4;
                    return obj2;
                } else if (i2 == 1) {
                    hn6 hn63 = dvVar2.A;
                    UserSession userSession4 = dvVar2.z;
                    o85.q(obj);
                    hn62 = hn63;
                    userSession3 = userSession4;
                } else if (i2 == 2) {
                    o85.q(obj);
                    return vs7;
                } else if (i2 == 3) {
                    boolean z5 = dvVar2.C;
                    z3 = dvVar2.B;
                    hn62 = dvVar2.A;
                    UserSession userSession5 = dvVar2.z;
                    o85.q(obj);
                    UserSession userSession6 = userSession5;
                    z4 = z5;
                    userSession2 = userSession6;
                    ms3 ms36 = (ms3) cf4.z;
                    String str4 = (String) cf4.y;
                    if (ms36.a(ub4)) {
                        ms36.b(ub4, str4, (Throwable) null, "Session saved to storage (auto refresh enabled)");
                    }
                    aVar.u(new in6(userSession2, hn62));
                    ms3 = (ms3) cf4.z;
                    String str32 = (String) cf4.y;
                    if (!ms3.a(ub4)) {
                        r10 = 0;
                        ms3.b(ub4, str32, (Throwable) null, "Session imported successfully. Starting auto refresh...");
                    } else {
                        r10 = 0;
                    }
                    dvVar2.z = r10;
                    dvVar2.A = r10;
                    dvVar2.B = z3;
                    dvVar2.C = z4;
                    dvVar2.F = 4;
                } else if (i2 == 4) {
                    o85.q(obj);
                    ms3 ms37 = (ms3) cf4.z;
                    String str5 = (String) cf4.y;
                    if (ms37.a(ub4)) {
                        ms37.b(ub4, str5, (Throwable) null, "Auto refresh started.");
                    }
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ms33 = (ms3) cf4.z;
                String str6 = (String) cf4.y;
                if (ms33.a(ub4)) {
                    ms33.b(ub4, str6, (Throwable) null, "Session saved to storage (no auto refresh)");
                }
                aVar.u(new in6(userSession3, hn62));
                ms32 = (ms3) cf4.z;
                String str22 = (String) cf4.y;
                if (ms32.a(ub4)) {
                }
                return vs7;
            }
        }
        dvVar = new dv(aVar, h612);
        dv dvVar22 = dvVar;
        Object obj3 = dvVar22.D;
        i2 = dvVar22.F;
        ub4 = ub4.w;
        vs7 vs72 = vs7.a;
        cf4 cf43 = aVar.d;
        Object obj22 = p81.w;
        if (i2 != 0) {
        }
        ms33 = (ms3) cf43.z;
        String str62 = (String) cf43.y;
        if (ms33.a(ub4)) {
        }
        aVar.u(new in6(userSession3, hn62));
        ms32 = (ms3) cf43.z;
        String str222 = (String) cf43.y;
        if (ms32.a(ub4)) {
        }
        return vs72;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    public final Object p(boolean z, boolean z2, h61 h61) {
        ev evVar;
        int i2;
        UserSession userSession;
        UserSession userSession2;
        if (h61 instanceof ev) {
            evVar = (ev) h61;
            int i3 = evVar.E;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                evVar.E = i3 - Integer.MIN_VALUE;
                ev evVar2 = evVar;
                Object obj = evVar2.C;
                i2 = evVar2.E;
                userSession = null;
                boolean z3 = true;
                p81 p81 = p81.w;
                if (i2 != 0) {
                    o85.q(obj);
                    cf4 cf4 = this.i;
                    evVar2.z = z;
                    evVar2.A = z2;
                    evVar2.E = 1;
                    obj = cf4.v(evVar2);
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i2 == 1) {
                    z2 = evVar2.A;
                    z = evVar2.z;
                    try {
                        o85.q(obj);
                    } catch (Exception e2) {
                        Exception exc = e2;
                        e81 e81 = evVar2.x;
                        e81.getClass();
                        r16.x(e81);
                        cf4 cf42 = this.d;
                        ms3 ms3 = (ms3) cf42.z;
                        String str = (String) cf42.y;
                        ub4 ub4 = ub4.z;
                        if (ms3.a(ub4)) {
                            ms3.b(ub4, str, exc, "Failed to load session");
                        }
                    }
                } else if (i2 == 2) {
                    userSession2 = evVar2.B;
                    o85.q(obj);
                    userSession = userSession2;
                    if (userSession == null) {
                        z3 = false;
                    }
                    return Boolean.valueOf(z3);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                userSession = (UserSession) obj;
                boolean z4 = z;
                boolean z5 = z2;
                if (userSession == null) {
                    evVar2.B = userSession;
                    evVar2.z = z4;
                    evVar2.A = z5;
                    evVar2.E = 2;
                    UserSession userSession3 = userSession;
                    if (o(userSession3, z4, fn6.a, z5, evVar2) != p81) {
                        userSession2 = userSession3;
                        userSession = userSession2;
                        if (userSession == null) {
                        }
                        return Boolean.valueOf(z3);
                    }
                    return p81;
                }
                UserSession userSession4 = userSession;
                if (userSession == null) {
                }
                return Boolean.valueOf(z3);
            }
        }
        evVar = new ev(this, h61);
        ev evVar22 = evVar;
        Object obj2 = evVar22.C;
        i2 = evVar22.E;
        userSession = null;
        boolean z32 = true;
        p81 p812 = p81.w;
        if (i2 != 0) {
        }
        userSession = (UserSession) obj2;
        boolean z42 = z;
        boolean z52 = z2;
        if (userSession == null) {
        }
    }

    public final String q() {
        if (this.c.y != tj2.x) {
            return null;
        }
        byte[] bArr = new byte[64];
        pc1 pc1 = oc1.b;
        pc1.getClass();
        pc1.c.nextBytes(bArr);
        m50.f.getClass();
        String a = m50.a(m50.h, bArr);
        ar7.H(this.h, (e81) null, (r81) null, new n0(this, a, (f61) null, 8), 3);
        return w95.f(a);
    }

    public final Object r(UserSession userSession, hn6 hn6, boolean z, boolean z2, dv dvVar) {
        Object j0;
        h27 h27 = this.n;
        if (h27 != null) {
            h27.o((CancellationException) null);
        }
        h27 H = ar7.H(this.h, (e81) null, (r81) null, new hv(z, this, userSession, hn6, (f61) null, 0), 3);
        this.n = H;
        if (!z2 || (j0 = H.j0(dvVar)) != p81.w) {
            return vs7.a;
        }
        return j0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004a, code lost:
        if (r7 == r5) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0060, code lost:
        if (defpackage.uu.c(r6, r7, r1, r0) == r5) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0062, code lost:
        return r5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    public final Object s(h61 h61) {
        iv ivVar;
        int i2;
        UserSession i3;
        String refreshToken;
        if (h61 instanceof iv) {
            ivVar = (iv) h61;
            int i4 = ivVar.B;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                ivVar.B = i4 - Integer.MIN_VALUE;
                Object obj = ivVar.z;
                i2 = ivVar.B;
                p81 p81 = p81.w;
                if (i2 != 0) {
                    o85.q(obj);
                    UserSession i5 = i();
                    if (i5 == null || (refreshToken = i5.getRefreshToken()) == null) {
                        h.s("No refresh token found in current session");
                        return null;
                    }
                    ivVar.B = 1;
                    obj = t(refreshToken, ivVar);
                } else if (i2 == 1) {
                    o85.q(obj);
                } else if (i2 == 2) {
                    o85.q(obj);
                    x((qd3) null, td3.a.c());
                    return vs7.a;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                UserSession userSession = (UserSession) obj;
                i3 = i();
                if (i3 == null) {
                    cn6 cn6 = new cn6(i3);
                    ivVar.B = 2;
                } else {
                    h.s("No session found");
                    return null;
                }
            }
        }
        ivVar = new iv(this, h61);
        Object obj2 = ivVar.z;
        i2 = ivVar.B;
        p81 p812 = p81.w;
        if (i2 != 0) {
        }
        UserSession userSession2 = (UserSession) obj2;
        i3 = i();
        if (i3 == null) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0082, code lost:
        if (r10 == r5) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0093, code lost:
        if (r10 != r5) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0095, code lost:
        return r5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    public final Object t(String str, h61 h61) {
        kv kvVar;
        int i2;
        String str2;
        String str3;
        if (h61 instanceof kv) {
            kvVar = (kv) h61;
            int i3 = kvVar.C;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                kvVar.C = i3 - Integer.MIN_VALUE;
                Object obj = kvVar.A;
                i2 = kvVar.C;
                p81 p81 = p81.w;
                if (i2 != 0) {
                    o85.q(obj);
                    cf4 cf4 = this.d;
                    ms3 ms3 = (ms3) cf4.z;
                    String str4 = (String) cf4.y;
                    ub4 ub4 = ub4.w;
                    if (ms3.a(ub4)) {
                        ms3.b(ub4, str4, (Throwable) null, "Refreshing session");
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    JsonPrimitive b2 = em3.b(str);
                    b2.getClass();
                    JsonElement jsonElement = (JsonElement) linkedHashMap.put("refresh_token", b2);
                    jv jvVar = new jv(l51.c, new JsonObject(linkedHashMap), 0);
                    kvVar.z = null;
                    kvVar.C = 1;
                    obj = this.l.a("token?grant_type=refresh_token", jvVar, kvVar);
                } else if (i2 == 1) {
                    JsonObject jsonObject = (JsonObject) kvVar.z;
                    o85.q(obj);
                } else if (i2 == 2) {
                    str2 = kvVar.z;
                    o85.q(obj);
                    String str5 = (String) obj;
                    if (str2 != null) {
                        str3 = " in ".concat(str2);
                    } else {
                        str3 = "";
                    }
                    try {
                        km3 km3 = l18.a;
                        km3.getClass();
                        return km3.b(UserSession.Companion.serializer(), str5);
                    } catch (MissingFieldException unused) {
                        StringBuilder q2 = b81.q("Couldn't decode payload", str3, " as ");
                        q2.append(b26.a.b(UserSession.class).A());
                        q2.append(". Input: ");
                        q2.append(k57.s0(str5, "\n", ""));
                        throw new Exception(q2.toString());
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = "Auth#refreshSession";
                kvVar.z = str2;
                kvVar.C = 2;
                obj = h49.q((yl1) obj, mo0.a, kvVar);
            }
        }
        kvVar = new kv(this, h61);
        Object obj2 = kvVar.A;
        i2 = kvVar.C;
        p81 p812 = p81.w;
        if (i2 != 0) {
        }
        str2 = "Auth#refreshSession";
        kvVar.z = str2;
        kvVar.C = 2;
        obj2 = h49.q((yl1) obj2, mo0.a, kvVar);
    }

    public final void u(mn6 mn6) {
        cf4 cf4 = this.d;
        ms3 ms3 = (ms3) cf4.z;
        String str = (String) cf4.y;
        ub4 ub4 = ub4.w;
        if (ms3.a(ub4)) {
            ms3.b(ub4, str, (Throwable) null, "Setting session status to " + mn6);
        }
        d37 d37 = this.e;
        d37.getClass();
        d37.l((Object) null, mn6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0059, code lost:
        if (r12.a("logout", r8, r0) == r7) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ba, code lost:
        if (n(r0) == r7) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bc, code lost:
        return r7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    public final Object v(kt6 kt6, h61 h61) {
        mv mvVar;
        int i2;
        ub4 ub4;
        ms3 ms3;
        ms3 ms32;
        if (h61 instanceof mv) {
            mvVar = (mv) h61;
            int i3 = mvVar.C;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mvVar.C = i3 - Integer.MIN_VALUE;
                Object obj = mvVar.A;
                i2 = mvVar.C;
                ub4 = ub4.w;
                cf4 cf4 = this.d;
                p81 p81 = p81.w;
                if (i2 != 0) {
                    o85.q(obj);
                    if (i() != null) {
                        aw awVar = this.m;
                        b0 b0Var = new b0(7, kt6);
                        mvVar.z = kt6;
                        mvVar.C = 1;
                    } else {
                        ms3 ms33 = (ms3) cf4.z;
                        String str = (String) cf4.y;
                        ub4 ub42 = ub4.x;
                        if (ms33.a(ub42)) {
                            ms33.b(ub42, str, (Throwable) null, "Skipping session logout as there is no session available. Proceeding to clean up local data...");
                        }
                        if (kt6 != kt6.x) {
                            mvVar.z = null;
                            mvVar.C = 2;
                        }
                        ms3 = (ms3) cf4.z;
                        String str2 = (String) cf4.y;
                        if (ms3.a(ub4)) {
                        }
                        return vs7.a;
                    }
                } else if (i2 == 1) {
                    kt6 = mvVar.z;
                    try {
                        o85.q(obj);
                    } catch (RestException e2) {
                        List list = qv.a;
                        int i4 = e2.w;
                        if (list.contains(new Integer(i4))) {
                            ms3 ms34 = (ms3) cf4.z;
                            String str3 = (String) cf4.y;
                            if (ms34.a(ub4)) {
                                ms34.b(ub4, str3, (Throwable) null, pb4.i(i4, "Received error code ", " while signing out user. This can happen if the user doesn't exist anymore or the JWT is invalid/expired. Proceeding to clean up local data..."));
                            }
                        } else {
                            throw e2;
                        }
                    }
                } else if (i2 == 2) {
                    o85.q(obj);
                    ms3 = (ms3) cf4.z;
                    String str22 = (String) cf4.y;
                    if (ms3.a(ub4)) {
                        ms3.b(ub4, str22, (Throwable) null, "Successfully logged out");
                    }
                    return vs7.a;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ms32 = (ms3) cf4.z;
                String str4 = (String) cf4.y;
                if (ms32.a(ub4)) {
                    ms32.b(ub4, str4, (Throwable) null, "Logged out session in Supabase");
                }
                if (kt6 != kt6.x) {
                }
                ms3 = (ms3) cf4.z;
                String str222 = (String) cf4.y;
                if (ms3.a(ub4)) {
                }
                return vs7.a;
            }
        }
        mvVar = new mv(this, h61);
        Object obj2 = mvVar.A;
        i2 = mvVar.C;
        ub4 = ub4.w;
        cf4 cf42 = this.d;
        p81 p812 = p81.w;
        if (i2 != 0) {
        }
        ms32 = (ms3) cf42.z;
        String str42 = (String) cf42.y;
        if (ms32.a(ub4)) {
        }
        if (kt6 != kt6.x) {
        }
        ms3 = (ms3) cf42.z;
        String str2222 = (String) cf42.y;
        if (ms3.a(ub4)) {
        }
        return vs7.a;
    }

    public final void w() {
        cf4 cf4 = this.d;
        ms3 ms3 = (ms3) cf4.z;
        String str = (String) cf4.y;
        ub4 ub4 = ub4.w;
        if (ms3.a(ub4)) {
            ms3.b(ub4, str, (Throwable) null, "Stopping auto refresh for current session");
        }
        h27 h27 = this.n;
        if (h27 != null) {
            h27.o((CancellationException) null);
        }
        this.n = null;
    }

    public final void x(qd3 qd3, qd3 qd32) {
        an6 an6;
        an6 an62 = this.o;
        if (an62 != null) {
            if (qd3 == null) {
                if (an62 != null) {
                    qd3 = an62.c;
                } else {
                    qd3 = null;
                }
            }
            if (qd32 == null) {
                if (an62 != null) {
                    qd32 = an62.b;
                } else {
                    qd32 = null;
                }
            }
            qd3 qd33 = an62.a;
            qd33.getClass();
            an6 = new an6(qd33, qd32, qd3);
        } else {
            an6 = new an6(td3.a.c(), qd32, qd3);
        }
        this.o = an6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00bd, code lost:
        if (r3 == r8) goto L_0x0137;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    public final Object y(boolean z, u6 u6Var, h61 h61) {
        ov ovVar;
        int i2;
        p81 p81;
        UserInfo userInfo;
        UserSession userSession;
        UserSession userSession2;
        UserInfo userInfo2;
        boolean z2;
        String str;
        Object obj;
        boolean z3;
        Object q2;
        h61 h612 = h61;
        if (h612 instanceof ov) {
            ovVar = (ov) h612;
            int i3 = ovVar.E;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ovVar.E = i3 - Integer.MIN_VALUE;
                Object obj2 = ovVar.C;
                i2 = ovVar.E;
                p81 = p81.w;
                if (i2 != 0) {
                    o85.q(obj2);
                    UserUpdateBuilder userUpdateBuilder = new UserUpdateBuilder((String) null, (String) null, (String) null, (String) null, (JsonObject) null, (String) null, this.p, 63, (hl1) null);
                    u6Var.y(userUpdateBuilder);
                    String q3 = q();
                    vm3 vm3 = new vm3();
                    km3 km3 = l18.a;
                    km3.getClass();
                    l18.a(vm3, em3.e(km3.c(UserUpdateBuilder.Companion.serializer(), userUpdateBuilder)));
                    if (q3 != null) {
                        ag8.C(vm3, q3);
                    }
                    lv lvVar = new lv(l51.c, vm3.a().toString(), 1);
                    ovVar.A = null;
                    ovVar.B = null;
                    z3 = z;
                    ovVar.z = z3;
                    ovVar.E = 1;
                    obj = this.m.a("user", lvVar, ovVar);
                } else if (i2 == 1) {
                    boolean z4 = ovVar.z;
                    String str2 = (String) ovVar.B;
                    String str3 = (String) ovVar.A;
                    o85.q(obj2);
                    boolean z5 = z4;
                    obj = obj2;
                    z3 = z5;
                } else if (i2 == 2) {
                    z2 = ovVar.z;
                    yl1 yl1 = (yl1) ovVar.A;
                    o85.q(obj2);
                    str = (String) obj2;
                    try {
                        km3 km32 = l18.a;
                        km32.getClass();
                        UserInfo userInfo3 = (UserInfo) km32.b(UserInfo.Companion.serializer(), str);
                        if (z2) {
                            xw5 xw5 = this.f;
                            if (xw5.w.getValue() instanceof in6) {
                                Object value = xw5.w.getValue();
                                value.getClass();
                                userSession = UserSession.copy$default(((in6) value).a, (String) null, (String) null, (String) null, (String) null, 0, (String) null, userInfo3, (String) null, (qd3) null, 447, (Object) null);
                                UserInfo userInfo4 = userInfo3;
                                if (this.c.x) {
                                    ovVar.A = userInfo4;
                                    ovVar.B = userSession;
                                    ovVar.z = z2;
                                    ovVar.E = 3;
                                    if (this.i.C(userSession, ovVar) != p81) {
                                        userSession2 = userSession;
                                        userInfo2 = userInfo4;
                                        userInfo = userInfo2;
                                        userSession = userSession2;
                                        u(new in6(userSession, new gn6(userSession)));
                                        return userInfo;
                                    }
                                    return p81;
                                }
                                userInfo = userInfo4;
                                u(new in6(userSession, new gn6(userSession)));
                                return userInfo;
                            }
                        }
                        return userInfo3;
                    } catch (MissingFieldException unused) {
                        String A = b26.a.b(UserInfo.class).A();
                        String s0 = k57.s0(str, "\n", "");
                        throw new Exception("Couldn't decode payload as " + A + ". Input: " + s0);
                    }
                } else if (i2 == 3) {
                    userSession2 = ovVar.B;
                    userInfo2 = ovVar.A;
                    o85.q(obj2);
                    userInfo = userInfo2;
                    userSession = userSession2;
                    u(new in6(userSession, new gn6(userSession)));
                    return userInfo;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ovVar.A = null;
                ovVar.B = null;
                ovVar.z = z3;
                ovVar.E = 2;
                q2 = h49.q((yl1) obj, mo0.a, ovVar);
                if (q2 != p81) {
                    Object obj3 = q2;
                    z2 = z3;
                    obj2 = obj3;
                    str = (String) obj2;
                    km3 km322 = l18.a;
                    km322.getClass();
                    UserInfo userInfo32 = (UserInfo) km322.b(UserInfo.Companion.serializer(), str);
                    if (z2) {
                    }
                    return userInfo32;
                }
                return p81;
            }
        }
        ovVar = new ov(this, h612);
        Object obj22 = ovVar.C;
        i2 = ovVar.E;
        p81 = p81.w;
        if (i2 != 0) {
        }
        ovVar.A = null;
        ovVar.B = null;
        ovVar.z = z3;
        ovVar.E = 2;
        q2 = h49.q((yl1) obj, mo0.a, ovVar);
        if (q2 != p81) {
        }
        return p81;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0093, code lost:
        if (r14 == r7) goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a8, code lost:
        if (r14 != r7) goto L_0x00ac;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    public final Object z(String str, String str2, cb cbVar, h61 h61) {
        pv pvVar;
        int i2;
        UserSession userSession;
        StringBuilder sb;
        ms3 ms3;
        ub4 ub4;
        String str3;
        yl1 yl1;
        j77 j77;
        Object obj;
        if (h61 instanceof pv) {
            pvVar = (pv) h61;
            int i3 = pvVar.H;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pvVar.H = i3 - Integer.MIN_VALUE;
                Object obj2 = pvVar.F;
                i2 = pvVar.H;
                p81 p81 = p81.w;
                if (i2 != 0) {
                    o85.q(obj2);
                    vm3 vm3 = new vm3();
                    b96.M(vm3, "type", str);
                    if (str2 != null) {
                        b96.M(vm3, "token", str2);
                    }
                    cbVar.y(vm3);
                    jv jvVar = new jv(l51.c, vm3.a(), 2);
                    pvVar.z = null;
                    pvVar.A = null;
                    pvVar.H = 1;
                    obj2 = this.k.a("verify", jvVar, pvVar);
                } else if (i2 == 1) {
                    String str4 = (String) pvVar.A;
                    n77 n77 = (n77) pvVar.z;
                    o85.q(obj2);
                } else if (i2 == 2) {
                    j77 = (j77) pvVar.A;
                    yl1 = pvVar.z;
                    o85.q(obj2);
                    String str5 = (String) obj2;
                    try {
                        km3 km3 = l18.a;
                        km3.getClass();
                        obj = km3.b(UserSession.Companion.serializer(), str5);
                    } catch (SerializationException e2) {
                        cf4 cf4 = ((m77) j77).f;
                        ms3 ms32 = (ms3) cf4.z;
                        String str6 = (String) cf4.y;
                        ub4 ub42 = ub4.x;
                        if (ms32.a(ub42)) {
                            ms32.b(ub42, str6, e2, "Could not decode " + d57.i1(200, str5) + " as " + b26.a.b(UserSession.class).A() + '.');
                        }
                        obj = null;
                    }
                    UserSession userSession2 = (UserSession) obj;
                    if (userSession2 == null) {
                        cf4 cf42 = this.d;
                        ms3 ms33 = (ms3) cf42.z;
                        str3 = (String) cf42.y;
                        ub4 ub43 = ub4.w;
                        if (ms33.a(ub43)) {
                            StringBuilder o2 = b81.o("Received `verifyOtp` response without session: ");
                            pvVar.z = null;
                            pvVar.A = null;
                            pvVar.B = o2;
                            pvVar.C = ms33;
                            pvVar.D = ub43;
                            pvVar.E = str3;
                            pvVar.H = 3;
                            Object q2 = h49.q(yl1, mo0.a, pvVar);
                            if (q2 != p81) {
                                Object obj3 = q2;
                                ms3 = ms33;
                                ub4 = ub43;
                                sb = o2;
                                obj2 = obj3;
                                ms3.b(ub4, str3, (Throwable) null, f21.l(sb, (String) obj2, ". This may occur if changing the email with 'Secure email change' enabled"));
                            }
                        }
                        return e85.a;
                    }
                    dn6 dn6 = new dn6(n25.a);
                    pvVar.z = null;
                    pvVar.A = userSession2;
                    pvVar.H = 4;
                    if (uu.c(this, userSession2, dn6, pvVar) != p81) {
                        userSession = userSession2;
                        return new d85(userSession);
                    }
                    return p81;
                } else if (i2 == 3) {
                    str3 = pvVar.E;
                    ub4 = pvVar.D;
                    ms3 = pvVar.C;
                    sb = pvVar.B;
                    UserSession userSession3 = (UserSession) pvVar.A;
                    o85.q(obj2);
                    ms3.b(ub4, str3, (Throwable) null, f21.l(sb, (String) obj2, ". This may occur if changing the email with 'Secure email change' enabled"));
                    return e85.a;
                } else if (i2 == 4) {
                    userSession = (UserSession) pvVar.A;
                    o85.q(obj2);
                    return new d85(userSession);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                yl1 = (yl1) obj2;
                pvVar.z = yl1;
                j77 = this.b;
                pvVar.A = j77;
                pvVar.H = 2;
                obj2 = h49.q(yl1, mo0.a, pvVar);
            }
        }
        pvVar = new pv(this, h61);
        Object obj22 = pvVar.F;
        i2 = pvVar.H;
        p81 p812 = p81.w;
        if (i2 != 0) {
        }
        yl1 = (yl1) obj22;
        pvVar.z = yl1;
        j77 = this.b;
        pvVar.A = j77;
        pvVar.H = 2;
        obj22 = h49.q(yl1, mo0.a, pvVar);
    }
}
