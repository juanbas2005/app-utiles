package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: as4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class as4 extends a97 implements gs2 {
    public String A;
    public String B;
    public int C;
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ gs4 F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ String H;
    public final /* synthetic */ String I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public as4(gs4 gs4, boolean z, String str, String str2, f61 f61) {
        super(2, f61);
        this.F = gs4;
        this.G = z;
        this.H = str;
        this.I = str2;
    }

    public final Object H(Object obj, Object obj2) {
        return ((as4) o((f61) obj2, (o81) obj)).s(vs7.a);
    }

    public final f61 o(f61 f61, Object obj) {
        as4 as4 = new as4(this.F, this.G, this.H, this.I, f61);
        as4.E = obj;
        return as4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v10, types: [m66] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x03b4  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x03b6  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x03e6  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x03eb  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0161  */
    public final Object s(Object obj) {
        p81 p81;
        ConcurrentHashMap concurrentHashMap;
        vs7 vs7;
        String str;
        gs4 gs4;
        String str2;
        int i;
        String str3;
        String str4;
        String str5;
        String str6;
        Object P;
        int i2;
        int i3;
        int i4;
        Object obj2;
        yb5 yb5;
        Throwable th;
        Object obj3;
        Throwable th2;
        as4 as4 = this;
        gs4 gs42 = as4.F;
        ConcurrentHashMap concurrentHashMap2 = gs42.e;
        o81 o81 = (o81) as4.E;
        int i5 = as4.D;
        vs7 vs72 = vs7.a;
        p81 p812 = p81.w;
        if (i5 == 0) {
            o85.q(obj);
            concurrentHashMap2.clear();
            int i6 = 12;
            if (as4.G) {
                str3 = gs42.i(1);
                if (str3 == null) {
                    Iterator it = gs4.k.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            str3 = null;
                            break;
                        }
                        String str7 = (String) it.next();
                        try {
                            d45 d45 = (d45) gs42.h.getValue();
                            o9 o9Var = new o9(12);
                            o9Var.N(str7);
                            o9Var.D("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_6_8) AppleWebKit/534.30 (KHTML, like Gecko) Chrome/12.0.742.122 Safari/534.30");
                            o9Var.x();
                            kd6 kd6 = new kd6(o9Var);
                            d45.getClass();
                            a66 f = new dx5(d45, kd6, false).f();
                            try {
                                obj3 = f.C.o();
                                f.close();
                                if (obj3 instanceof m66) {
                                    obj3 = null;
                                }
                                str3 = (String) obj3;
                                if (str3 != null) {
                                    break;
                                }
                            } catch (Throwable th3) {
                                ed1.i(f, th2);
                                throw th3;
                            }
                        } catch (Throwable th4) {
                            obj3 = new m66(th4);
                        }
                    }
                    if (str3 == null) {
                        str3 = gs42.i(2);
                        if (str3 == null) {
                            h.s("Error, compruebe su conexión");
                            return null;
                        }
                    } else if (!d57.x0(str3, "wlanuserip", true) && !d57.x0(str3, "LoginServlet", true)) {
                        h.s("Ya existe una sesión activa en esta conexión");
                        return null;
                    }
                }
                concurrentHashMap = concurrentHashMap2;
            } else {
                String str8 = "http://clients3.google.com/generate_204";
                String str9 = "";
                int i7 = 0;
                int i8 = 0;
                while (true) {
                    if (i7 >= 5) {
                        concurrentHashMap = concurrentHashMap2;
                        i2 = 200;
                        i3 = i8;
                        break;
                    }
                    if (i7 == 1) {
                        str8 = "http://connectivitycheck.android.com/generate_204";
                    } else if (i7 == 2) {
                        str8 = "http://detectportal.firefox.com/canonical.html";
                    } else if (i7 == 3) {
                        str8 = "http://neverssl.com";
                    } else if (i7 == 4) {
                        str8 = "https://secure.etecsa.net:8443";
                    }
                    String str10 = str8;
                    o9 o9Var2 = new o9(i6);
                    o9Var2.N(str10);
                    o9Var2.D("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_6_8) AppleWebKit/534.30 (KHTML, like Gecko) Chrome/12.0.742.122 Safari/534.30");
                    o9Var2.x();
                    kd6 kd62 = new kd6(o9Var2);
                    try {
                        d45 d = gs42.d();
                        d.getClass();
                        concurrentHashMap = concurrentHashMap2;
                        try {
                            i4 = i7;
                            try {
                                a66 f2 = new dx5(d, kd62, false).f();
                                try {
                                    Object yb52 = new yb5(Integer.valueOf(f2.z), f2.C.o());
                                    f2.close();
                                    obj2 = yb52;
                                } catch (Throwable th5) {
                                    ed1.i(f2, th);
                                    throw th5;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                obj2 = new m66(th);
                                if (obj2 instanceof m66) {
                                }
                                yb5 = (yb5) obj2;
                                if (yb5 == null) {
                                }
                                str8 = str10;
                                concurrentHashMap2 = concurrentHashMap;
                                i6 = 12;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            i4 = i7;
                            obj2 = new m66(th);
                            if (obj2 instanceof m66) {
                            }
                            yb5 = (yb5) obj2;
                            if (yb5 == null) {
                            }
                            str8 = str10;
                            concurrentHashMap2 = concurrentHashMap;
                            i6 = 12;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        concurrentHashMap = concurrentHashMap2;
                        i4 = i7;
                        obj2 = new m66(th);
                        if (obj2 instanceof m66) {
                        }
                        yb5 = (yb5) obj2;
                        if (yb5 == null) {
                        }
                        str8 = str10;
                        concurrentHashMap2 = concurrentHashMap;
                        i6 = 12;
                    }
                    if (obj2 instanceof m66) {
                        obj2 = null;
                    }
                    yb5 = (yb5) obj2;
                    if (yb5 == null) {
                        int intValue = ((Number) yb5.w).intValue();
                        str9 = yb5.x;
                        i2 = 200;
                        if (intValue == 200) {
                            i3 = intValue;
                            break;
                        }
                        i7 = i4 + 1;
                        i8 = intValue;
                    } else {
                        i7 = i4 + 1;
                    }
                    str8 = str10;
                    concurrentHashMap2 = concurrentHashMap;
                    i6 = 12;
                }
                str3 = str9;
                if (i3 != i2) {
                    h.s("Error, compruebe su conexión");
                    return null;
                }
            }
            String a = gs4.a(gs42, str3, "wlanuserip");
            String a2 = gs4.a(gs42, str3, "wlanacname");
            String a3 = gs4.a(gs42, str3, "wlanmac");
            vs7 = vs72;
            String str11 = "Error, compruebe su conexión";
            String a4 = gs4.a(gs42, str3, "firsturl");
            p81 p813 = p812;
            String str12 = "";
            String a5 = gs4.a(gs42, str3, "ssid");
            CharSequence charSequence = "LoginServlet";
            String a6 = gs4.a(gs42, str3, "usertype");
            String str13 = "User-Agent";
            String a7 = gs4.a(gs42, str3, "successpage");
            String a8 = gs4.a(gs42, str3, "loggerId");
            String a9 = gs4.a(gs42, str3, "lang");
            String a10 = gs4.a(gs42, str3, "CSRFHW");
            gs4 gs43 = gs42;
            h12 h12 = new h12(1);
            h12.a("wlanuserip", a);
            h12.a("wlanacname", a2);
            h12.a("wlanmac", a3);
            h12.a("firsturl", a4);
            h12.a("ssid", a5);
            h12.a("usertype", a6);
            h12.a("gotopage", gs4.a(gs42, str3, "gotopage"));
            h12.a("successpage", a7);
            String str14 = "loggerId";
            String str15 = a8;
            h12.a(str14, str15);
            h12.a("lang", a9);
            String str16 = this.H;
            h12.a("username", str16);
            h12.a("password", this.I);
            String str17 = "CSRFHW";
            h12.a(str17, a10);
            lm2 lm2 = new lm2(h12.a, h12.b);
            o9 o9Var3 = new o9(12);
            o9Var3.N("https://secure.etecsa.net:8443//LoginServlet");
            String str18 = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_6_8) AppleWebKit/534.30 (KHTML, like Gecko) Chrome/12.0.742.122 Safari/534.30";
            String str19 = "wlanmac";
            o9Var3.D(str13, str18);
            o9Var3.G("POST", lm2);
            kd6 kd63 = new kd6(o9Var3);
            d45 d2 = gs43.d();
            d2.getClass();
            String str20 = "POST";
            String str21 = str18;
            a66 f3 = new dx5(d2, kd63, false).f();
            int i9 = f3.z;
            String o = f3.C.o();
            String str22 = ((g73) f3.w.x).h;
            f3.close();
            if (i9 == 200) {
                CharSequence charSequence2 = charSequence;
                int i10 = i9;
                if (d57.x0(str22, charSequence2, false)) {
                    String str23 = "El usuario ya está conectado";
                    if (!d57.x0(o, str23, false)) {
                        str23 = "El nombre de usuario o contraseña son incorrectos";
                        if (!d57.x0(o, str23, false)) {
                            str23 = "Entre el nombre de usuario y contraseña correctos";
                            if (!d57.x0(o, str23, false)) {
                                str23 = "Su tarjeta no tiene saldo disponible";
                                if (!d57.x0(o, str23, false)) {
                                    if (d57.x0(o, "Usted ha realizado muchos intentos", false)) {
                                        str23 = "Usted ha realizado muchos intentos. Por favor intente más tarde";
                                    } else if (d57.x0(o, "Fallo obteniendo informacion de acceso", false)) {
                                        str23 = "Fallo obteniendo informacion de acceso. Desactive el Wifi e intentelo de nuevo";
                                    } else {
                                        str23 = "Error de autenticación";
                                    }
                                }
                            }
                        }
                    }
                    ku4.g(str23);
                    return null;
                }
                xf4 a11 = k26.a(gs4.i, o);
                if (a11 == null || (str4 = (String) dt0.z0(1, a11.a())) == null) {
                    str4 = str12;
                }
                StringBuilder o2 = f21.o("ATTRIBUTE_UUID=", str4, "&CSRFHW=", a10, "&wlanuserip=");
                f21.v(o2, a, "&ssid=", a5, "&loggerId=");
                f21.v(o2, str15, "+", str16, "&domain=&username=");
                String l = f21.l(o2, str16, "&wlanacname=&wlanmac=&remove=1");
                h12 h122 = new h12(1);
                h122.a("op", "getLeftTime");
                h122.a("ATTRIBUTE_UUID", str4);
                h122.a(str17, a10);
                h122.a("wlanuserip", a);
                h122.a("ssid", a5);
                h122.a(str14, f21.m(new StringBuilder(), str15, "+", str16));
                String str24 = str12;
                h122.a("domain", str24);
                h122.a("username", str16);
                h122.a("wlanacname", str24);
                h122.a(str19, a3);
                lm2 lm22 = new lm2(h122.a, h122.b);
                o9 o9Var4 = new o9(12);
                o9Var4.N("https://secure.etecsa.net:8443/EtecsaQueryServlet");
                o9Var4.D(str13, str21);
                o9Var4.G(str20, lm22);
                kd6 kd64 = new kd6(o9Var4);
                try {
                    d45 d3 = gs43.d();
                    d3.getClass();
                    a66 f4 = new dx5(d3, kd64, false).f();
                    String o3 = f4.C.o();
                    f4.close();
                    gs4 = gs43;
                    try {
                        String b = gs4.b(gs4, o3);
                        if (d57.x0(b, "errorop", false)) {
                            str5 = "0:0:0";
                        } else {
                            str5 = d57.k1(b).toString();
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        str5 = new m66(th);
                        if (str5 instanceof m66) {
                        }
                        String str25 = str6;
                        hr4 hr4 = gs4.b;
                        as4 = this;
                        as4.E = null;
                        String str26 = l;
                        as4.A = str26;
                        as4.B = str25;
                        int i11 = i10;
                        as4.C = i11;
                        as4.D = 1;
                        P = sg3.P(as4, hr4.a.a, false, true, new tk3(1, System.currentTimeMillis(), str16));
                        p81 = p813;
                        if (P != p81) {
                        }
                        if (P != p81) {
                        }
                        return p81;
                    }
                } catch (Throwable th10) {
                    th = th10;
                    gs4 = gs43;
                    str5 = new m66(th);
                    if (str5 instanceof m66) {
                    }
                    String str252 = str6;
                    hr4 hr42 = gs4.b;
                    as4 = this;
                    as4.E = null;
                    String str262 = l;
                    as4.A = str262;
                    as4.B = str252;
                    int i112 = i10;
                    as4.C = i112;
                    as4.D = 1;
                    P = sg3.P(as4, hr42.a.a, false, true, new tk3(1, System.currentTimeMillis(), str16));
                    p81 = p813;
                    if (P != p81) {
                    }
                    if (P != p81) {
                    }
                    return p81;
                }
                if (str5 instanceof m66) {
                    str6 = str24;
                } else {
                    str6 = str5;
                }
                String str2522 = str6;
                hr4 hr422 = gs4.b;
                as4 = this;
                as4.E = null;
                String str2622 = l;
                as4.A = str2622;
                as4.B = str2522;
                int i1122 = i10;
                as4.C = i1122;
                as4.D = 1;
                P = sg3.P(as4, hr422.a.a, false, true, new tk3(1, System.currentTimeMillis(), str16));
                p81 = p813;
                if (P != p81) {
                    P = vs7;
                }
                if (P != p81) {
                    int i12 = i1122;
                    str = str2522;
                    i = i12;
                    str2 = str2622;
                }
                return p81;
            }
            h.s(str11);
            return null;
        } else if (i5 == 1) {
            i = as4.C;
            String str27 = as4.B;
            String str28 = as4.A;
            o85.q(obj);
            concurrentHashMap = concurrentHashMap2;
            str = str27;
            vs7 = vs72;
            p81 = p812;
            gs4 = gs42;
            str2 = str28;
        } else if (i5 == 2) {
            o85.q(obj);
            return vs72;
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dv7 dv7 = gs4.a;
        ArrayList arrayList = new ArrayList(concurrentHashMap.size());
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            arrayList.add(entry.getKey() + "=" + entry.getValue());
        }
        as4.E = null;
        as4.A = null;
        as4.B = null;
        as4.C = i;
        as4.D = 2;
        if (((dy7) dv7).j(str2, arrayList, as4.H, str, as4) == p81) {
            return p81;
        }
        return vs7;
    }
}
