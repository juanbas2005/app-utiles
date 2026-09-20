package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: gs4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gs4 implements ur4 {
    public static final k26 i = new k26("ATTRIBUTE_UUID\\s*=\\s*\"?([0-9A-Fa-f]+)");
    public static final List j = sg3.E("http://clients3.google.com/generate_204", "http://connectivitycheck.android.com/generate_204", "http://detectportal.firefox.com/canonical.html", "http://neverssl.com", "https://secure.etecsa.net:8443");
    public static final List k = sg3.E("http://www.cubadebate.cu", "http://www.granma.cu", "http://www.minjus.gob.cu");
    public final dv7 a;
    public final hr4 b;
    public final h81 c;
    public final ay4 d;
    public final ConcurrentHashMap e = new ConcurrentHashMap();
    public final wv2 f = new wv2(26, this);
    public final z97 g = new z97(new vr4(this, 0));
    public final z97 h = new z97(new vr4(this, 1));

    public gs4(dv7 dv7, hr4 hr4, Context context, h81 h81) {
        dv7.getClass();
        hr4.getClass();
        this.a = dv7;
        this.b = hr4;
        this.c = h81;
        this.d = new ay4(context);
    }

    public static final String a(gs4 gs4, String str, String str2) {
        String str3;
        String str4;
        gs4.getClass();
        String quote = Pattern.quote(str2);
        quote.getClass();
        Pattern compile = Pattern.compile("<input[^>]+name=[\"']" + quote + "[\"'][^>]+value=[\"']([^\"']*)[\"']", 66);
        compile.getClass();
        String quote2 = Pattern.quote(str2);
        quote2.getClass();
        Pattern compile2 = Pattern.compile("<input[^>]+value=[\"']([^\"']*)[\"'][^>]+name=[\"']" + quote2 + "[\"']", 66);
        compile2.getClass();
        str.getClass();
        Matcher matcher = compile.matcher(str);
        matcher.getClass();
        xf4 g2 = t35.g(matcher, 0, str);
        if (g2 != null && (str4 = (String) dt0.z0(1, g2.a())) != null) {
            return str4;
        }
        Matcher matcher2 = compile2.matcher(str);
        matcher2.getClass();
        xf4 g3 = t35.g(matcher2, 0, str);
        if (g3 != null) {
            str3 = (String) dt0.z0(1, g3.a());
        } else {
            str3 = null;
        }
        if (str3 == null) {
            return "";
        }
        return str3;
    }

    public static final String b(gs4 gs4, String str) {
        Pattern compile = Pattern.compile("<[^>]+>");
        compile.getClass();
        str.getClass();
        String replaceAll = compile.matcher(str).replaceAll(" ");
        replaceAll.getClass();
        Pattern compile2 = Pattern.compile("\\s+");
        compile2.getClass();
        String replaceAll2 = compile2.matcher(replaceAll).replaceAll(" ");
        replaceAll2.getClass();
        return d57.k1(replaceAll2).toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object c(String str, String str2, h61 h61) {
        xr4 xr4;
        int i2;
        if (h61 instanceof xr4) {
            xr4 = (xr4) h61;
            int i3 = xr4.B;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                xr4.B = i3 - Integer.MIN_VALUE;
                Object obj = xr4.z;
                i2 = xr4.B;
                if (i2 != 0) {
                    o85.q(obj);
                    h81 h81 = this.c;
                    ii3 ii3 = new ii3((Object) this, (Object) str, (Object) str2, (f61) null, 6);
                    xr4.B = 1;
                    Object e0 = ar7.e0(h81, ii3, xr4);
                    p81 p81 = p81.w;
                    if (e0 == p81) {
                        return p81;
                    }
                } else if (i2 == 1) {
                    try {
                        o85.q(obj);
                    } catch (CancellationException e2) {
                        throw e2;
                    } catch (Exception e3) {
                        return new m66(e3);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            }
        }
        xr4 = new xr4(this, h61);
        Object obj2 = xr4.z;
        i2 = xr4.B;
        if (i2 != 0) {
        }
        return vs7.a;
    }

    public final d45 d() {
        return (d45) this.g.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object e(String str, String str2, boolean z, h61 h61) {
        zr4 zr4;
        int i2;
        if (h61 instanceof zr4) {
            zr4 = (zr4) h61;
            int i3 = zr4.B;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                zr4.B = i3 - Integer.MIN_VALUE;
                Object obj = zr4.z;
                i2 = zr4.B;
                if (i2 != 0) {
                    o85.q(obj);
                    h81 h81 = this.c;
                    as4 as4 = new as4(this, z, str, str2, (f61) null);
                    zr4.B = 1;
                    Object e0 = ar7.e0(h81, as4, zr4);
                    p81 p81 = p81.w;
                    if (e0 == p81) {
                        return p81;
                    }
                } else if (i2 == 1) {
                    try {
                        o85.q(obj);
                    } catch (CancellationException e2) {
                        throw e2;
                    } catch (Exception e3) {
                        return new m66(e3);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            }
        }
        zr4 = new zr4(this, h61);
        Object obj2 = zr4.z;
        i2 = zr4.B;
        if (i2 != 0) {
        }
        return vs7.a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object f(h61 h61) {
        bs4 bs4;
        int i2;
        if (h61 instanceof bs4) {
            bs4 = (bs4) h61;
            int i3 = bs4.B;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bs4.B = i3 - Integer.MIN_VALUE;
                Object obj = bs4.z;
                i2 = bs4.B;
                if (i2 != 0) {
                    o85.q(obj);
                    h81 h81 = this.c;
                    q34 q34 = new q34((Object) this, (f61) null, 2);
                    bs4.B = 1;
                    Object e0 = ar7.e0(h81, q34, bs4);
                    p81 p81 = p81.w;
                    if (e0 == p81) {
                        return p81;
                    }
                } else if (i2 == 1) {
                    try {
                        o85.q(obj);
                    } catch (CancellationException e2) {
                        throw e2;
                    } catch (Exception e3) {
                        return new m66(e3);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            }
        }
        bs4 = new bs4(this, h61);
        Object obj2 = bs4.z;
        i2 = bs4.B;
        if (i2 != 0) {
        }
        return vs7.a;
    }

    public final di2 g() {
        dy7 dy7 = (dy7) this.a;
        return gr8.L(new c6(dy7.a.b(), 19), dy7.b);
    }

    public final di2 h() {
        dy7 dy7 = (dy7) this.a;
        return gr8.L(new c6(dy7.a.b(), 18), dy7.b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        defpackage.ed1.i(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0056, code lost:
        throw r6;
     */
    public final String i(int i2) {
        Object obj;
        for (int i3 = 0; i3 < i2; i3++) {
            for (String str : j) {
                try {
                    d45 d45 = (d45) this.h.getValue();
                    o9 o9Var = new o9(12);
                    o9Var.N(str);
                    o9Var.D("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_6_8) AppleWebKit/534.30 (KHTML, like Gecko) Chrome/12.0.742.122 Safari/534.30");
                    o9Var.x();
                    kd6 kd6 = new kd6(o9Var);
                    d45.getClass();
                    a66 f2 = new dx5(d45, kd6, false).f();
                    obj = f2.C.o();
                    f2.close();
                } catch (Throwable th) {
                    obj = new m66(th);
                }
                if (obj instanceof m66) {
                    obj = null;
                }
                String str2 = (String) obj;
                if (str2 != null && (d57.x0(str2, "wlanuserip", true) || d57.x0(str2, "LoginServlet", true))) {
                    return str2;
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object j(h61 h61) {
        es4 es4;
        int i2;
        if (h61 instanceof es4) {
            es4 = (es4) h61;
            int i3 = es4.B;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                es4.B = i3 - Integer.MIN_VALUE;
                Object obj = es4.z;
                i2 = es4.B;
                if (i2 != 0) {
                    o85.q(obj);
                    h81 h81 = this.c;
                    ot otVar = new ot(this, (f61) null, 20);
                    es4.B = 1;
                    Object e0 = ar7.e0(h81, otVar, es4);
                    p81 p81 = p81.w;
                    if (e0 == p81) {
                        return p81;
                    }
                } else if (i2 == 1) {
                    try {
                        o85.q(obj);
                    } catch (CancellationException e2) {
                        throw e2;
                    } catch (Exception e3) {
                        return new m66(e3);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            }
        }
        es4 = new es4(this, h61);
        Object obj2 = es4.z;
        i2 = es4.B;
        if (i2 != 0) {
        }
        return vs7.a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object k(String str, h61 h61) {
        fs4 fs4;
        int i2;
        if (h61 instanceof fs4) {
            fs4 = (fs4) h61;
            int i3 = fs4.B;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                fs4.B = i3 - Integer.MIN_VALUE;
                Object obj = fs4.z;
                i2 = fs4.B;
                if (i2 != 0) {
                    o85.q(obj);
                    h81 h81 = this.c;
                    ju1 ju1 = new ju1(this, str, (f61) null, 25);
                    fs4.B = 1;
                    Object e0 = ar7.e0(h81, ju1, fs4);
                    p81 p81 = p81.w;
                    if (e0 == p81) {
                        return p81;
                    }
                } else if (i2 == 1) {
                    try {
                        o85.q(obj);
                    } catch (CancellationException e2) {
                        throw e2;
                    } catch (Exception e3) {
                        return new m66(e3);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            }
        }
        fs4 = new fs4(this, h61);
        Object obj2 = fs4.z;
        i2 = fs4.B;
        if (i2 != 0) {
        }
        return vs7.a;
    }
}
