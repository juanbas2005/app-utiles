package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: q34  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class q34 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public Object B;
    public int C;
    public int D;
    public final /* synthetic */ Object E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q34(f61 f61, cz7 cz7, int i, String str) {
        super(2, f61);
        this.A = 5;
        this.B = cz7;
        this.D = i;
        this.E = str;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                return ((q34) o((f61) obj2, (eh6) obj)).s(vs7);
            case 1:
                return ((q34) o((f61) obj2, (o81) obj)).s(vs7);
            case 2:
                return ((q34) o((f61) obj2, (o81) obj)).s(vs7);
            case 3:
                return ((q34) o((f61) obj2, (o81) obj)).s(vs7);
            case 4:
                return ((q34) o((f61) obj2, (o81) obj)).s(vs7);
            default:
                return ((q34) o((f61) obj2, (o81) obj)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        Object obj2 = this.E;
        switch (i) {
            case b85.b:
                q34 q34 = new q34((s34) obj2, this.D, f61);
                q34.B = obj;
                return q34;
            case 1:
                return new q34((Object) (ne4) obj2, f61, 1);
            case 2:
                q34 q342 = new q34((Object) (gs4) obj2, f61, 2);
                q342.B = obj;
                return q342;
            case 3:
                return new q34((uj) this.B, this.D, (wi6) obj2, f61, 3);
            case 4:
                return new q34((dy7) this.B, this.D, (String) obj2, f61, 4);
            default:
                return new q34(f61, (cz7) this.B, this.D, (String) obj2);
        }
    }

    /* JADX WARNING: type inference failed for: r2v27, types: [m66] */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0310, code lost:
        if (r1 == r8) goto L_0x0372;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x012a, code lost:
        if (r0 == r8) goto L_0x02b8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    public final Object s(Object obj) {
        Object obj2;
        int i;
        Object obj3;
        int i2;
        Object obj4;
        int i3;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        int i4;
        Object obj11;
        Throwable th;
        TelephonyManager telephonyManager;
        int i5 = this.A;
        vs7 vs7 = vs7.a;
        Object obj12 = this.E;
        p81 p81 = p81.w;
        switch (i5) {
            case b85.b:
                int i6 = this.C;
                if (i6 == 0) {
                    o85.q(obj);
                    s34 s34 = (s34) obj12;
                    o34 o34 = new o34((eh6) this.B, s34, 0);
                    int i7 = this.D;
                    tp1 tp1 = ((m34) s34.f.getValue()).i;
                    this.C = 1;
                    if (pd8.e(o34, i7, 100, tp1, this) == p81) {
                        return p81;
                    }
                    return vs7;
                } else if (i6 == 1) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 1:
                ne4 ne4 = (ne4) obj12;
                dv7 dv7 = ne4.b;
                int i8 = this.D;
                if (i8 == 0) {
                    o85.q(obj);
                    di2 d = ((dy7) dv7).d();
                    this.D = 1;
                    obj3 = gr8.H(d, this);
                    break;
                } else if (i8 == 1) {
                    o85.q(obj);
                    obj3 = obj;
                } else if (i8 == 2) {
                    i = this.C;
                    o85.q(obj);
                    obj2 = ((o66) obj).w;
                    if (!(obj2 instanceof m66)) {
                        return vs7;
                    }
                    vs7 vs72 = (vs7) obj2;
                    long currentTimeMillis = System.currentTimeMillis();
                    this.B = obj2;
                    this.C = i;
                    this.D = 3;
                    if (((dy7) dv7).z(currentTimeMillis, this) != p81) {
                        return vs7;
                    }
                    return p81;
                } else if (i8 == 3) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                UserDataPreferences userDataPreferences = (UserDataPreferences) obj3;
                if (userDataPreferences.getAccountId().length() > 0) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                if (i2 == 0) {
                    return vs7;
                }
                long licenseLastCheckMillis = userDataPreferences.getLicenseLastCheckMillis();
                Calendar instance = Calendar.getInstance();
                instance.set(11, 0);
                instance.set(12, 0);
                instance.set(13, 0);
                instance.set(14, 0);
                if (licenseLastCheckMillis >= instance.getTimeInMillis()) {
                    return vs7;
                }
                p7 p7Var = ne4.c;
                this.C = i2;
                this.D = 2;
                obj2 = p7Var.f(this);
                if (obj2 != p81) {
                    i = i2;
                    if (!(obj2 instanceof m66)) {
                    }
                }
                return p81;
            case 2:
                gs4 gs4 = (gs4) obj12;
                ConcurrentHashMap concurrentHashMap = gs4.e;
                dv7 dv72 = gs4.a;
                o81 o81 = (o81) this.B;
                int i9 = this.D;
                if (i9 == 0) {
                    o85.q(obj);
                    di2 d2 = ((dy7) dv72).d();
                    this.B = o81;
                    this.D = 1;
                    obj5 = gr8.H(d2, this);
                    break;
                } else if (i9 == 1) {
                    o85.q(obj);
                    obj5 = obj;
                } else if (i9 == 2) {
                    i3 = this.C;
                    o85.q(obj);
                    obj4 = null;
                    concurrentHashMap.clear();
                    if (i3 == 0) {
                        return vs7;
                    }
                    h.s("Desconexión fallida, hágalo manual");
                    return obj4;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                UserDataPreferences userDataPreferences2 = (UserDataPreferences) obj5;
                String nautaLogoutUrl = userDataPreferences2.getNautaLogoutUrl();
                if (nautaLogoutUrl.length() != 0) {
                    for (String next : userDataPreferences2.getNautaCookies()) {
                        concurrentHashMap.put(d57.g1(next, "="), d57.c1(next, "=", next));
                    }
                    List W0 = d57.W0(nautaLogoutUrl, new String[]{"&"}, 6);
                    if (W0.size() > 0) {
                        obj6 = W0.get(0);
                    } else {
                        obj6 = "";
                    }
                    String str = (String) obj6;
                    yb5 yb5 = new yb5("ATTRIBUTE_UUID", d57.c1(str, "=", str));
                    if (1 < W0.size()) {
                        obj7 = W0.get(1);
                    } else {
                        obj7 = "";
                    }
                    String str2 = (String) obj7;
                    yb5 yb52 = new yb5("CSRFHW", d57.c1(str2, "=", str2));
                    if (2 < W0.size()) {
                        obj8 = W0.get(2);
                    } else {
                        obj8 = "";
                    }
                    String str3 = (String) obj8;
                    yb5 yb53 = new yb5("wlanuserip", d57.c1(str3, "=", str3));
                    yb5 yb54 = new yb5("ssid", "");
                    if (4 < W0.size()) {
                        obj9 = W0.get(4);
                    } else {
                        obj9 = "";
                    }
                    String str4 = (String) obj9;
                    yb5 yb55 = new yb5("loggerId", d57.c1(str4, "=", str4));
                    yb5 yb56 = new yb5("domain", "");
                    if (6 < W0.size()) {
                        obj10 = W0.get(6);
                    } else {
                        obj10 = "";
                    }
                    String str5 = (String) obj10;
                    yb5 yb57 = yb54;
                    yb5 yb58 = yb55;
                    yb5 yb59 = yb52;
                    yb5 yb510 = yb53;
                    yb5 yb511 = yb5;
                    String E0 = dt0.E0(sg3.E(yb511, yb59, yb510, yb57, yb58, yb56, new yb5("username", d57.c1(str5, "=", str5)), new yb5("wlanacname", ""), new yb5("wlanmac", ""), new yb5("remove", "1")), "&", (String) null, (String) null, jo3.R, 30);
                    o9 o9Var = new o9(12);
                    o9Var.N("https://secure.etecsa.net:8443/LogoutServlet?".concat(E0));
                    o9Var.D("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_6_8) AppleWebKit/534.30 (KHTML, like Gecko) Chrome/12.0.742.122 Safari/534.30");
                    o9Var.x();
                    kd6 kd6 = new kd6(o9Var);
                    int i10 = 1;
                    while (true) {
                        if (i10 < 6) {
                            try {
                                k26 k26 = gs4.i;
                                d45 d3 = gs4.d();
                                d3.getClass();
                                a66 f = new dx5(d3, kd6, false).f();
                                try {
                                    obj11 = f.C.o();
                                    f.close();
                                    if (obj11 instanceof m66) {
                                        obj11 = "";
                                    }
                                    String str6 = (String) obj11;
                                    if (d57.x0(str6, "logoutcallback('SUCCESS');", false) || d57.x0(str6, "REMOVE_AUTHINFO_SUCCESS", false)) {
                                        i4 = 1;
                                    } else {
                                        i10++;
                                    }
                                } catch (Throwable th2) {
                                    ed1.i(f, th);
                                    throw th2;
                                }
                            } catch (Throwable th3) {
                                obj11 = new m66(th3);
                            }
                        } else {
                            i4 = 0;
                        }
                    }
                    i4 = 1;
                    obj4 = null;
                    this.B = null;
                    this.C = i4;
                    this.D = 2;
                    if (((dy7) dv72).c(this) != p81) {
                        i3 = i4;
                        concurrentHashMap.clear();
                        if (i3 == 0) {
                        }
                    }
                    return p81;
                }
                obj4 = null;
                h.s("No hay sesión activa");
                return obj4;
            case 3:
                int i11 = this.C;
                if (i11 == 0) {
                    o85.q(obj);
                    Integer num = new Integer(this.D);
                    hl hlVar = ((wi6) obj12).b;
                    this.C = 1;
                    if (uj.c((uj) this.B, num, hlVar, (Float) null, (vr2) null, this, 12) == p81) {
                        return p81;
                    }
                    return vs7;
                } else if (i11 == 1) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 4:
                int i12 = this.C;
                if (i12 == 0) {
                    o85.q(obj);
                    qe1 qe1 = ((dy7) this.B).a;
                    zw7 zw7 = new zw7(this.D, (f61) null, (String) obj12);
                    this.C = 1;
                    Object a = qe1.a(zw7, this);
                    if (a == p81) {
                        return p81;
                    }
                    return a;
                } else if (i12 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            default:
                int i13 = this.C;
                if (i13 == 0) {
                    o85.q(obj);
                    this.C = 1;
                    kk0 kk0 = new kk0(1, rc9.a0(this));
                    kk0.v();
                    int i14 = this.D;
                    Context context = ((cz7) this.B).a;
                    Object systemService = context.getSystemService("phone");
                    systemService.getClass();
                    TelephonyManager telephonyManager2 = (TelephonyManager) systemService;
                    if (i14 >= 0) {
                        try {
                            Object systemService2 = context.getSystemService("telephony_subscription_service");
                            systemService2.getClass();
                            SubscriptionInfo activeSubscriptionInfoForSimSlotIndex = ((SubscriptionManager) systemService2).getActiveSubscriptionInfoForSimSlotIndex(i14);
                            if (activeSubscriptionInfoForSimSlotIndex != null) {
                                telephonyManager = telephonyManager2.createForSubscriptionId(activeSubscriptionInfoForSimSlotIndex.getSubscriptionId());
                                if (!(telephonyManager instanceof m66)) {
                                    telephonyManager2 = telephonyManager;
                                }
                                telephonyManager2 = telephonyManager2;
                            }
                        } catch (Throwable th4) {
                            telephonyManager = new m66(th4);
                        }
                    }
                    telephonyManager2.sendUssdRequest((String) obj12, new bz7(kk0), new Handler(Looper.getMainLooper()));
                    Object t = kk0.t();
                    if (t == p81) {
                        return p81;
                    }
                    return t;
                } else if (i13 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q34(s34 s34, int i, f61 f61) {
        super(2, f61);
        this.A = 0;
        this.E = s34;
        this.D = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q34(Object obj, int i, Object obj2, f61 f61, int i2) {
        super(2, f61);
        this.A = i2;
        this.B = obj;
        this.D = i;
        this.E = obj2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q34(Object obj, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.E = obj;
    }
}
