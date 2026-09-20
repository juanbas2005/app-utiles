package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.os.Build;
import android.util.LongSparseArray;
import android.view.View;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationResponse;
import android.widget.EdgeEffect;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: ie1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ie1 {
    public static final long[] A = new long[0];
    public static final Object[] B = new Object[0];
    public static final rt0 C = rt0.H;
    public static final rt0 D;
    public static final float E = 0.1f;
    public static final rt0 F;
    public static final float G = 0.38f;
    public static final float H = 1.0f;
    public static final rt0 I = rt0.A;
    public static final rt0 J;
    public static final float K = 0.38f;
    public static final rt0 L;
    public static final float M = 0.38f;
    public static final rt0 N;
    public static final float O = 0.38f;
    public static final rt0 P;
    public static final rt0 Q;
    public static final rt0 R;
    public static final rt0 S;
    public static final vq6 T;
    public static final rt0 U;
    public static final cr7 V = cr7.y;
    public static final rt0 W = rt0.y;
    public static final cr7 X = cr7.B;
    public static final rt0 Y;
    public static final float Z = 6.0f;
    public static final fw0 a = new fw0(-1758613562, new vw0(21), false);
    public static final vq6 a0;
    public static final fw0 b = new fw0(1135462245, new vw0(22), false);
    public static final rt0 b0;
    public static final fw0 c = new fw0(943194849, new nw0(1), false);
    public static final rt0 c0;
    public static final fw0 d = new fw0(-674483175, new vw0(26), false);
    public static final cr7 d0 = cr7.x;
    public static final fw0 e = new fw0(193873445, new nw0(18), false);
    public static final float e0 = 48.0f;
    public static final fw0 f = new fw0(1687057763, new nw0(19), false);
    public static final float f0 = 68.0f;
    public static final fw0 g = new fw0(-2028286210, new vw0(27), false);
    public static final char[] g0 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final fw0 h = new fw0(876913015, new nw0(20), false);
    public static x83 h0;
    public static final fw0 i = new fw0(-650161622, new nw0(21), false);
    public static final fw0 j = new fw0(-1493062851, new vw0(28), false);
    public static final fw0 k = new fw0(231322578, new qw0(0), false);
    public static final fw0 l = new fw0(1309908232, new qw0(1), false);
    public static final fw0 m = new fw0(408019226, new nw0(22), false);
    public static final fw0 n = new fw0(-609294190, new nw0(23), false);
    public static final fw0 o = new fw0(-242114898, new vw0(29), false);
    public static final fw0 p = new fw0(1651047717, new rw0(0), false);
    public static final fw0 q = new fw0(1557583166, new rw0(1), false);
    public static final fw0 r = new fw0(-1752417776, new nw0(24), false);
    public static final fw0 s = new fw0(-1297994740, new nw0(25), false);
    public static final fw0 t = new fw0(-1321222235, new nw0(15), false);
    public static final fw0 u = new fw0(582441443, new nw0(16), false);
    public static final fw0 v = new fw0(2136669950, new vw0(23), false);
    public static final fw0 w = new fw0(-1206465507, new vw0(24), false);
    public static final fw0 x = new fw0(-2143401762, new nw0(17), false);
    public static final fw0 y = new fw0(-1530991532, new vw0(25), false);
    public static final int[] z = new int[0];

    static {
        rt0 rt0 = rt0.D;
        D = rt0;
        rt0 rt02 = rt0.E;
        F = rt02;
        J = rt0;
        L = rt0;
        N = rt0;
        P = rt0;
        Q = rt02;
        R = rt02;
        rt0 rt03 = rt0.z;
        S = rt03;
        vq6 vq6 = vq6.x;
        T = vq6;
        rt0 rt04 = rt0.x;
        U = rt04;
        Y = rt03;
        a0 = vq6;
        b0 = rt04;
        c0 = rt04;
    }

    public static void A(int i2, int i3, int i4) {
        if (i2 < 0 || i3 > i4) {
            ku4.d(i4, pb4.p("fromIndex: ", i2, ", toIndex: ", i3, ", size: "));
        } else if (i2 > i3) {
            h.q(b81.l(i2, i3, "fromIndex: ", " > toIndex: "));
        }
    }

    public static bz2 B(bz2 bz2, bz2 bz22) {
        ArrayList arrayList = new ArrayList(20);
        int size = bz2.size();
        for (int i2 = 0; i2 < size; i2++) {
            String g2 = bz2.g(i2);
            String l2 = bz2.l(i2);
            if ((!"Warning".equalsIgnoreCase(g2) || !k57.u0(l2, "1", false)) && ("Content-Length".equalsIgnoreCase(g2) || "Content-Encoding".equalsIgnoreCase(g2) || "Content-Type".equalsIgnoreCase(g2) || !M(g2) || bz22.f(g2) == null)) {
                za5.u(g2);
                arrayList.add(g2);
                arrayList.add(d57.k1(l2).toString());
            }
        }
        int size2 = bz22.size();
        for (int i3 = 0; i3 < size2; i3++) {
            String g3 = bz22.g(i3);
            if (!"Content-Length".equalsIgnoreCase(g3) && !"Content-Encoding".equalsIgnoreCase(g3) && !"Content-Type".equalsIgnoreCase(g3) && M(g3)) {
                String l3 = bz22.l(i3);
                za5.u(g3);
                arrayList.add(g3);
                arrayList.add(d57.k1(l3).toString());
            }
        }
        return new bz2((String[]) arrayList.toArray(new String[0]));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0028, code lost:
        if (defpackage.rs1.l(r1, defpackage.iq0.A) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        if (defpackage.rp3.d(((defpackage.st1) r0).W) != false) goto L_0x0043;
     */
    public static final sj0 C(kr1 kr1, boolean z2, Field field) {
        cr5 T2 = kr1.T().R();
        vj1 r2 = T2.r();
        r2.getClass();
        if (rs1.k(r2)) {
            vj1 r3 = r2.r();
            if (!rs1.l(r3, iq0.x)) {
            }
            if (T2 instanceof st1) {
            }
        }
        if (Modifier.isStatic(field.getModifiers())) {
            if (kr1.T().R().getAnnotations().i(g18.a)) {
                if (z2) {
                    if (r16.Z(kr1)) {
                        return new jj0(field, false);
                    }
                    return new ij0(field, true, 1);
                } else if (r16.Z(kr1)) {
                    return new nj0(field, D(kr1), false);
                } else {
                    return new mj0(field, D(kr1), true, 1);
                }
            } else if (z2) {
                return new ij0(field, false, 2);
            } else {
                return new mj0(field, D(kr1), false, 2);
            }
        }
        if (z2) {
            if (r16.Z(kr1)) {
                return new gj0(field, r16.F(kr1.T()));
            }
            return new ij0(field);
        } else if (r16.Z(kr1)) {
            return new kj0(field, D(kr1), r16.F(kr1.T()));
        } else {
            return new mj0(field, D(kr1));
        }
    }

    public static final boolean D(kr1 kr1) {
        return !iq7.e(kr1.T().R().b());
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [h61] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0082 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public static final Object E(ArrayList arrayList, hf0 hf0, fp7 fp7, Charset charset, h61 h61) {
        n41 n41;
        Object obj;
        int i2;
        fp7 fp72;
        hf0 hf02;
        if (h61 instanceof n41) {
            n41 n412 = (n41) h61;
            int i3 = n412.C;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                n412.C = i3 - Integer.MIN_VALUE;
                n41 = n412;
                obj = n41.B;
                i2 = n41.C;
                if (i2 != 0) {
                    o85.q(obj);
                    hf0 hf03 = hf0;
                    fp7 fp73 = fp7;
                    m41 m41 = new m41(new ze1(1, arrayList), charset, fp73, hf03, 0);
                    o41 o41 = new o41(hf03, (f61) null, 0);
                    n41.z = hf03;
                    n41.A = fp73;
                    n41.C = 1;
                    obj = gr8.K(m41, o41, n41);
                    p81 p81 = p81.w;
                    if (obj == p81) {
                        return p81;
                    }
                    fp72 = fp73;
                    hf02 = hf03;
                } else if (i2 == 1) {
                    fp72 = n41.A;
                    hf02 = n41.z;
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (obj == null) {
                    return obj;
                }
                if (!hf02.h()) {
                    return hf02;
                }
                as3 as3 = fp72.b;
                if (as3 != null && as3.v()) {
                    return m15.a;
                }
                throw new Exception("No suitable converter found for " + fp72, (Throwable) null);
            }
        }
        n41 = new h61(h61);
        obj = n41.B;
        i2 = n41.C;
        if (i2 != 0) {
        }
        if (obj == null) {
        }
    }

    public static void F(bf bfVar, LongSparseArray longSparseArray) {
        TranslationResponseValue k2;
        CharSequence o2;
        hk6 hk6;
        fk6 fk6;
        vr2 vr2;
        int size = longSparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            long keyAt = longSparseArray.keyAt(i2);
            ViewTranslationResponse n2 = se.n(longSparseArray.get(keyAt));
            if (!(n2 == null || (k2 = n2.getValue("android:text")) == null || (o2 = k2.getText()) == null || (hk6 = (hk6) bfVar.c().b((int) keyAt)) == null || (fk6 = hk6.a) == null)) {
                ak6 ak6 = fk6.d;
                Object g2 = ak6.w.g(zj6.l);
                if (g2 == null) {
                    g2 = null;
                }
                h4 h4Var = (h4) g2;
                if (!(h4Var == null || (vr2 = (vr2) h4Var.b) == null)) {
                    Boolean bool = (Boolean) vr2.y(new vl(o2.toString()));
                }
            }
        }
    }

    public static yh4 G(String str) {
        String str2;
        String str3;
        str.getClass();
        xf4 c2 = yh4.e.c(0, str);
        if (c2 != null) {
            Locale locale = Locale.ROOT;
            String lowerCase = ((String) ((vf4) c2.a()).get(1)).toLowerCase(locale);
            lowerCase.getClass();
            String lowerCase2 = ((String) ((vf4) c2.a()).get(2)).toLowerCase(locale);
            lowerCase2.getClass();
            ArrayList arrayList = new ArrayList();
            int i2 = c2.b().x;
            while (true) {
                int i3 = i2 + 1;
                if (i3 >= str.length()) {
                    return new yh4(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
                }
                xf4 c3 = yh4.f.c(i3, str);
                if (c3 != null) {
                    wf4 wf4 = c3.c;
                    uf4 g2 = wf4.g(1);
                    if (g2 != null) {
                        str2 = g2.a;
                    } else {
                        str2 = null;
                    }
                    if (str2 == null) {
                        i2 = c3.b().x;
                    } else {
                        uf4 g3 = wf4.g(2);
                        if (g3 != null) {
                            str3 = g3.a;
                        } else {
                            str3 = null;
                        }
                        if (str3 == null) {
                            uf4 g4 = wf4.g(3);
                            g4.getClass();
                            str3 = g4.a;
                        } else if (d57.a1(str3, '\'') && d57.B0(str3, '\'') && str3.length() > 2) {
                            str3 = str3.substring(1, str3.length() - 1);
                        }
                        arrayList.add(str2);
                        arrayList.add(str3);
                        i2 = c3.b().x;
                    }
                } else {
                    rf2.k("Parameter is not formatted correctly: \"", str.substring(i3), "\" for: \"", str, 34);
                    return null;
                }
            }
        } else {
            h.q(pb4.h('\"', "No subtype found for: \"", str));
            return null;
        }
    }

    public static String H(tb1 tb1, int i2) {
        tb1.getClass();
        if (i2 <= 16777215) {
            return String.valueOf(i2);
        }
        try {
            Context context = tb1.a;
            context.getClass();
            String resourceName = context.getResources().getResourceName(i2);
            resourceName.getClass();
            return resourceName;
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(i2);
        }
    }

    public static al6 I(qt4 qt4) {
        qt4.getClass();
        return cl6.S(new ot4(0), qt4);
    }

    public static final int J(pn4 pn4, long j2, g58 g58) {
        float f2;
        if (g58 != null) {
            f2 = g58.g();
        } else {
            f2 = 0.0f;
        }
        int i2 = (int) (4294967295L & j2);
        int e2 = pn4.e(Float.intBitsToFloat(i2));
        if (Float.intBitsToFloat(i2) < pn4.f(e2) - f2 || Float.intBitsToFloat(i2) > pn4.b(e2) + f2) {
            return -1;
        }
        int i3 = (int) (j2 >> 32);
        if (Float.intBitsToFloat(i3) < (-f2) || Float.intBitsToFloat(i3) > pn4.d + f2) {
            return -1;
        }
        return e2;
    }

    public static final Object K(pp4 pp4, in5 in5, Serializable serializable) {
        pp4.getClass();
        in5.getClass();
        Object obj = pp4.a.get(in5);
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            obj = Arrays.copyOf(bArr, bArr.length);
        }
        if (obj == null) {
            return serializable;
        }
        return obj;
    }

    public static final long L(u44 u44, ly5 ly5, int i2) {
        pn4 pn4;
        kj6 kj6 = me6.O;
        cg7 d2 = u44.d();
        if (d2 != null) {
            pn4 = d2.a.b;
        } else {
            pn4 = null;
        }
        dy3 c2 = u44.c();
        if (pn4 == null || c2 == null) {
            return lg7.b;
        }
        return pn4.h(ly5.i(c2.N(0)), i2, kj6);
    }

    public static boolean M(String str) {
        if ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    public static final boolean N(int i2, int i3, String str) {
        str.getClass();
        int i4 = i2 + 2;
        if (i4 >= i3 || str.charAt(i2) != '%' || dg8.l(str.charAt(i2 + 1)) == -1 || dg8.l(str.charAt(i4)) == -1) {
            return false;
        }
        return true;
    }

    public static final boolean O(int i2) {
        int type = Character.getType(i2);
        if (type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21) {
            return true;
        }
        return false;
    }

    public static final boolean P(as3 as3, as3 as32) {
        Boolean bool;
        as3.getClass();
        as32.getClass();
        if (oa7.a) {
            return jb5.x(((ds1) as3).x, ((ds1) as32).x);
        }
        hz2 hz2 = hz2.J;
        uo7 uo7 = new uo7(false, false, false, hz2, s3.w, t3.p);
        c2 c2Var = (c2) as3;
        c2 c2Var2 = (c2) as32;
        if (c2Var == c2Var2) {
            return true;
        }
        gs2 O2 = hz2.O();
        if (O2 != null) {
            bool = (Boolean) O2.H(c2Var, c2Var2);
        } else {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return td0.x.r(uo7, hz2, c2Var, c2Var2);
    }

    public static final boolean Q(int i2) {
        if (Character.isWhitespace(i2) || i2 == 160) {
            return true;
        }
        return false;
    }

    public static final boolean R(int i2) {
        int type;
        if (!Q(i2) || (type = Character.getType(i2)) == 14 || type == 13 || i2 == 10) {
            return false;
        }
        return true;
    }

    public static final int S(e04 e04, z75 z75) {
        long j2;
        if (z75 == z75.w) {
            j2 = e04.r & 4294967295L;
        } else {
            j2 = e04.r >> 32;
        }
        return (int) j2;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [sc0, java.lang.Object] */
    public static String T(int i2, int i3, int i4, String str) {
        int i5;
        int i6;
        boolean z2 = false;
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        if ((i4 & 4) == 0) {
            z2 = true;
        }
        str.getClass();
        int i7 = i2;
        while (i5 < i3) {
            char charAt = str.charAt(i5);
            if (charAt == '%' || (charAt == '+' && z2)) {
                ? obj = new Object();
                obj.n0(i2, i5, str);
                while (i5 < i3) {
                    int codePointAt = str.codePointAt(i5);
                    if (codePointAt == 37 && (i6 = i5 + 2) < i3) {
                        int l2 = dg8.l(str.charAt(i5 + 1));
                        int l3 = dg8.l(str.charAt(i6));
                        if (!(l2 == -1 || l3 == -1)) {
                            obj.a0((l2 << 4) + l3);
                            i5 = Character.charCount(codePointAt) + i6;
                        }
                    } else if (codePointAt == 43 && z2) {
                        obj.a0(32);
                        i5++;
                    }
                    obj.p0(codePointAt);
                    i5 += Character.charCount(codePointAt);
                }
                return obj.L();
            }
            i7 = i5 + 1;
        }
        return str.substring(i2, i3);
    }

    public static final a52 U(mm7 mm7, vr2 vr2, Object obj, yt2 yt2) {
        yt2.c0(-422486690, mm7);
        boolean h2 = mm7.h();
        in8 in8 = mm7.a;
        a52 a52 = a52.y;
        a52 a522 = a52.x;
        a52 a523 = a52.w;
        if (h2) {
            yt2.e0(-212166497);
            yt2.r(false);
            if (((Boolean) vr2.y(obj)).booleanValue()) {
                a52 = a522;
            } else if (!((Boolean) vr2.y(in8.H0())).booleanValue()) {
                a52 = a523;
            }
        } else {
            yt2.e0(-211890659);
            Object Q2 = yt2.Q();
            if (Q2 == ay0.a) {
                Q2 = u55.p(Boolean.FALSE);
                yt2.o0(Q2);
            }
            aq4 aq4 = (aq4) Q2;
            if (((Boolean) vr2.y(in8.H0())).booleanValue()) {
                aq4.setValue(Boolean.TRUE);
            }
            Object value = mm7.e.getValue();
            if (((Boolean) vr2.y(obj)).booleanValue()) {
                a52 = a522;
            } else if ((value != null && ((Boolean) vr2.y(value)).booleanValue()) || !((Boolean) aq4.getValue()).booleanValue()) {
                a52 = a523;
            }
            yt2.r(false);
        }
        yt2.r(false);
        return a52;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [h61] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public static final Object V(e81 e81, Object obj, Object obj2, gs2 gs2, f61 f61) {
        in0 in0;
        int i2;
        Object obj3;
        Object H2;
        if (f61 instanceof in0) {
            in0 in02 = (in0) f61;
            int i3 = in02.D;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                in02.D = i3 - Integer.MIN_VALUE;
                in0 = in02;
                Object obj4 = in0.C;
                i2 = in0.D;
                if (i2 != 0) {
                    o85.q(obj4);
                    obj3 = gh7.c(e81, obj2);
                    try {
                        in0.z = obj;
                        in0.A = e81;
                        in0.B = obj3;
                        in0.D = 1;
                        y17 y17 = new y17(in0, e81);
                        if (gs2 == null) {
                            H2 = rc9.h1(gs2, obj, y17);
                        } else {
                            mp7.Q(2, gs2);
                            H2 = gs2.H(obj, y17);
                        }
                        obj4 = H2;
                        Object obj5 = p81.w;
                        if (obj4 == obj5) {
                            return obj5;
                        }
                    } catch (Throwable th) {
                        th = th;
                        gh7.a(e81, obj3);
                        throw th;
                    }
                } else if (i2 == 1) {
                    Object obj6 = in0.B;
                    e81 e812 = in0.A;
                    try {
                        o85.q(obj4);
                        obj3 = obj6;
                        e81 = e812;
                    } catch (Throwable th2) {
                        Throwable th3 = th2;
                        obj3 = obj6;
                        e81 = e812;
                        th = th3;
                        gh7.a(e81, obj3);
                        throw th;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gh7.a(e81, obj3);
                return obj4;
            }
        }
        in0 = new h61(f61);
        Object obj42 = in0.C;
        i2 = in0.D;
        if (i2 != 0) {
        }
        gh7.a(e81, obj3);
        return obj42;
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0356  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0428  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x042a  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x042d  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0458  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x046d  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x048f  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x049c  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x04bf  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x04d2  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0511  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x0531  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0533  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0543  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0545  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x0549  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x0579  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x058f  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x05b1  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x05c0  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x05d9  */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x0692  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x069d  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x06bd  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x06c1  */
    public static final void a(mm7 mm7, vr2 vr2, ml4 ml4, n52 n52, x82 x82, gs2 gs2, fw0 fw0, yt2 yt2, int i2) {
        int i3;
        int i4;
        boolean z2;
        Object Q2;
        int i5;
        mm7 mm72;
        Object Q3;
        Object Q4;
        in8 in8;
        ed5 ed5;
        Object H0;
        Object value;
        a52 a52;
        a52 a522;
        Object Q5;
        Object Q6;
        ed5 ed52;
        Object Q7;
        aq4 aq4;
        boolean i6;
        Object Q8;
        boolean z3;
        boolean z4;
        x82 x822;
        n52 n522;
        boolean z5;
        boolean z6;
        bm7 bm7;
        boolean z7;
        mm7 mm73;
        nm7 nm7;
        d63 d63;
        bm7 bm72;
        bm7 bm73;
        ml4 ml42;
        tr6 tr6;
        ml4 ml43;
        n52 n523;
        boolean z8;
        yk ykVar;
        bm7 bm74;
        boolean z9;
        x82 x823;
        lo7 lo7;
        tr6 tr62;
        ml4 ml44;
        bm7 bm75;
        bm7 bm76;
        ml4 ml45;
        bm7 bm77;
        bm7 bm78;
        boolean i7;
        Object Q9;
        x82 x824;
        n52 n524;
        tr6 tr63;
        Object Q10;
        Object Q11;
        yk ykVar2;
        boolean z10;
        a52 a523;
        mm7 mm74 = mm7;
        vr2 vr22 = vr2;
        ml4 ml46 = ml4;
        n52 n525 = n52;
        x82 x825 = x82;
        gs2 gs22 = gs2;
        fw0 fw02 = fw0;
        yt2 yt22 = yt2;
        int i8 = i2;
        yt22.g0(-1310802509);
        if ((i8 & 6) == 0) {
            i3 = (yt22.g(mm74) ? 4 : 2) | i8;
        } else {
            i3 = i8;
        }
        if ((i8 & 48) == 0) {
            i3 |= yt22.i(vr22) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            i3 |= yt22.g(ml46) ? 256 : 128;
        }
        if ((i8 & 3072) == 0) {
            i3 |= yt22.g(n525) ? 2048 : 1024;
        }
        if ((i8 & 24576) == 0) {
            i3 |= yt22.g(x825) ? 16384 : 8192;
        }
        if ((196608 & i8) == 0) {
            i3 |= yt22.i(gs22) ? 131072 : 65536;
        }
        int i9 = i3 | 1572864;
        if ((12582912 & i8) == 0) {
            i9 |= yt22.i((Object) null) ? 8388608 : 4194304;
        }
        if ((100663296 & i8) == 0) {
            i9 |= yt22.i(fw02) ? 67108864 : 33554432;
        }
        int i10 = i9;
        if (yt22.V(i10 & 1, (38347923 & i10) != 38347922)) {
            ed5 ed53 = mm74.e;
            ed5 ed54 = mm74.d;
            in8 in82 = mm74.a;
            Object value2 = ed53.getValue();
            if (((Boolean) vr22.y(ed54.getValue())).booleanValue() || ((Boolean) vr22.y(in82.H0())).booleanValue() || ((value2 != null && ((Boolean) vr22.y(value2)).booleanValue()) || mm74.h() || mm74.d())) {
                yt22.e0(-274042349);
                int i11 = i10 & 14;
                int i12 = i11 | 48;
                int i13 = i12 & 14;
                boolean z11 = ((i13 ^ 6) > 4 && yt22.g(mm74)) || (i12 & 6) == 4;
                Object Q12 = yt22.Q();
                in8 in83 = in82;
                d63 d632 = ay0.a;
                if (z11 || Q12 == d632) {
                    Q12 = in83.H0();
                    yt22.o0(Q12);
                }
                if (mm74.h()) {
                    Q12 = in83.H0();
                }
                yt22.e0(-1270450094);
                a52 U2 = U(mm74, vr22, Q12, yt22);
                yt22.r(false);
                Object value3 = ed54.getValue();
                yt22.e0(-1270450094);
                a52 U3 = U(mm74, vr22, value3, yt22);
                yt22.r(false);
                int i14 = i13 | 3072;
                int i15 = (i14 & 14) ^ 6;
                if (i15 <= 4 || !yt22.g(mm74)) {
                    i4 = i14;
                    if ((i4 & 6) != 4) {
                        z2 = false;
                        Q2 = yt22.Q();
                        if (!z2 || Q2 == d632) {
                            i5 = i10;
                            Q2 = new mm7(new dq4(U2), mm74, b81.n(mm74.c, " > EnterExitTransition"));
                            yt22.o0(Q2);
                        } else {
                            i5 = i10;
                        }
                        mm72 = (mm7) Q2;
                        boolean g2 = ((i15 > 4 && yt22.g(mm74)) || (i4 & 6) == 4) | yt22.g(mm72);
                        Q3 = yt22.Q();
                        if (g2 || Q3 == d632) {
                            Q3 = new k77(12, (Object) mm74, (Object) mm72);
                            yt22.o0(Q3);
                        }
                        t49.e(mm72, (vr2) Q3, yt22);
                        if (!mm74.h()) {
                            mm72.l(U2, U3);
                        } else {
                            mm72.q(U3);
                            mm72.l.setValue(Boolean.FALSE);
                        }
                        if (mm74.h()) {
                            yt22.e0(782386797);
                            Object value4 = mm74.e.getValue();
                            if (value4 == null) {
                                yt22.e0(782437481);
                                z10 = false;
                                yt22.r(false);
                                a523 = null;
                            } else {
                                z10 = false;
                                yt22.e0(782437482);
                                yt22.e0(-1270450094);
                                a523 = U(mm74, vr22, value4, yt22);
                                yt22.r(false);
                                yt22.r(false);
                            }
                            mm72.e.setValue(a523);
                            yt22.r(z10);
                        } else {
                            yt22.e0(782538635);
                            yt22.r(false);
                        }
                        lo7 lo72 = i52.a;
                        boolean g3 = yt22.g(mm72);
                        Q4 = yt22.Q();
                        if (g3 || Q4 == d632) {
                            Q4 = u55.p(n525);
                            yt22.o0(Q4);
                        }
                        aq4 aq42 = (aq4) Q4;
                        in8 in84 = mm72.a;
                        in8 = mm72.a;
                        ed5 = mm72.d;
                        H0 = in84.H0();
                        value = ed5.getValue();
                        a52 = a52.y;
                        a522 = a52.x;
                        if (H0 == value && in8.H0() == a522) {
                            if (mm72.h()) {
                                aq42.setValue(n525);
                            } else {
                                aq42.setValue(n52.b);
                            }
                        } else if (ed5.getValue() != a52) {
                            aq42.setValue(((n52) aq42.getValue()).a(n525));
                        }
                        n52 n526 = (n52) aq42.getValue();
                        boolean g4 = yt22.g(mm72);
                        Q5 = yt22.Q();
                        if (g4 || Q5 == d632) {
                            Q5 = u55.p(x825);
                            yt22.o0(Q5);
                        }
                        aq4 aq43 = (aq4) Q5;
                        if (in8.H0() == ed5.getValue() && in8.H0() == a522) {
                            if (mm72.h()) {
                                aq43.setValue(x825);
                            } else {
                                aq43.setValue(x82.b);
                            }
                        } else if (ed5.getValue() != a522) {
                            aq43.setValue(((x82) aq43.getValue()).a(x825));
                        }
                        x82 x826 = (x82) aq43.getValue();
                        aq4 v2 = u55.v(gs22, yt22);
                        Object H2 = gs22.H(in8.H0(), ed5.getValue());
                        boolean g5 = yt22.g(mm72) | yt22.g(v2);
                        Q6 = yt22.Q();
                        ed52 = ed5;
                        if (g5 || Q6 == d632) {
                            Q6 = new p0((Object) mm72, (Object) v2, (f61) null, 7);
                            yt22.o0(Q6);
                        }
                        gs2 gs23 = (gs2) Q6;
                        Q7 = yt22.Q();
                        if (Q7 == d632) {
                            Q7 = u55.p(H2);
                            yt22.o0(Q7);
                        }
                        aq4 = (aq4) Q7;
                        i6 = yt22.i(gs23);
                        Q8 = yt22.Q();
                        if (!i6 || Q8 == d632) {
                            Q8 = new wx6(gs23, aq4, (f61) null, 0);
                            yt22.o0(Q8);
                        }
                        t49.h((gs2) Q8, yt22, vs7.a);
                        if (in8.H0() == a52 && ed52.getValue() == a52 && ((Boolean) aq4.getValue()).booleanValue()) {
                            yt22.e0(-270853937);
                            yt22.r(false);
                            z3 = false;
                            fw02 = fw0;
                        } else {
                            yt22.e0(-272355980);
                            boolean z12 = i11 == 4;
                            Object Q13 = yt22.Q();
                            if (z12 || Q13 == d632) {
                                Q13 = new yk();
                                yt22.o0(Q13);
                            }
                            yk ykVar3 = (yk) Q13;
                            ykVar3.b.getClass();
                            tr6 tr64 = ykVar3.b;
                            lo7 lo73 = we.B;
                            Object Q14 = yt22.Q();
                            if (Q14 == d632) {
                                Q14 = vy0.F;
                                yt22.o0(Q14);
                            }
                            sr2 sr2 = (sr2) Q14;
                            yt22.e0(-1491182875);
                            yt22.r(false);
                            yt22.e0(-1491180092);
                            yt22.r(false);
                            if (tr64 == null) {
                                yt22.e0(-968938819);
                                boolean g6 = yt22.g(mm72);
                                Object Q15 = yt22.Q();
                                if (g6 || Q15 == d632) {
                                    Q15 = new tr6();
                                    yt22.o0(Q15);
                                }
                                tr64 = (tr6) Q15;
                                z4 = false;
                            } else {
                                z4 = false;
                                yt22.e0(-31257052);
                            }
                            yt22.r(z4);
                            tr64.c(mm72.e.getValue() != null);
                            boolean i16 = yt22.i(tr64);
                            Object Q16 = yt22.Q();
                            if (i16 || Q16 == d632) {
                                Q16 = new kh(5, tr64);
                                yt22.o0(Q16);
                            }
                            i52.a(mm72, (sr2) Q16, yt22, 0);
                            nm7 nm72 = n526.a;
                            nm7 nm73 = x826.a;
                            lo7 lo74 = lo73;
                            boolean c2 = jt0.c(tr64.e, jt0.f);
                            dv6 dv6 = nm72.b;
                            cn0 cn0 = nm72.c;
                            if (dv6 == null && nm73.b == null) {
                                n522 = n526;
                                x822 = x826;
                                if (oe3.a(tr64.i, 0)) {
                                    z5 = false;
                                    z6 = cn0 == null || nm73.c == null;
                                    if (!z5) {
                                        yt22 = yt2;
                                        yt22.e0(1018653691);
                                        Object Q17 = yt22.Q();
                                        if (Q17 == d632) {
                                            Q17 = "Built-in slide";
                                            yt22.o0(Q17);
                                        }
                                        d63 = d632;
                                        nm7 = nm73;
                                        mm73 = mm72;
                                        z3 = false;
                                        z7 = true;
                                        bm7 D2 = rc9.D(mm73, lo74, (String) Q17, yt22, 384, 0);
                                        yt22.r(false);
                                        bm7 = D2;
                                    } else {
                                        yt22 = yt2;
                                        mm73 = mm72;
                                        d63 = d632;
                                        nm7 = nm73;
                                        z3 = false;
                                        z7 = true;
                                        yt22.e0(1018759494);
                                        yt22.r(false);
                                        bm7 = null;
                                    }
                                    if (!z6) {
                                        yt22.e0(1018851285);
                                        lo7 lo75 = we.C;
                                        Object Q18 = yt22.Q();
                                        if (Q18 == d63) {
                                            Q18 = "Built-in shrink/expand";
                                            yt22.o0(Q18);
                                        }
                                        bm7 D3 = rc9.D(mm73, lo75, (String) Q18, yt22, 384, 0);
                                        yt22.r(z3);
                                        bm72 = D3;
                                    } else {
                                        yt22.e0(1018962109);
                                        yt22.r(z3);
                                        bm72 = null;
                                    }
                                    if (!z6) {
                                        yt22.e0(1019035735);
                                        Object Q19 = yt22.Q();
                                        if (Q19 == d63) {
                                            Q19 = "Built-in InterruptionHandlingOffset";
                                            yt22.o0(Q19);
                                        }
                                        bm7 D4 = rc9.D(mm73, lo74, (String) Q19, yt22, 384, 0);
                                        yt22.r(z3);
                                        bm73 = D4;
                                    } else {
                                        yt22.e0(1019206141);
                                        yt22.r(z3);
                                        bm73 = null;
                                    }
                                    boolean z13 = !z6;
                                    t76 t76 = vt0.e;
                                    ml4 ml47 = jl4.w;
                                    if (c2) {
                                        yt22.e0(1019733235);
                                        lo7 lo76 = new lo7(ce.M, new pb(7, t76));
                                        Object Q20 = yt22.Q();
                                        if (Q20 == d63) {
                                            Q20 = "Built-in veil";
                                            yt22.o0(Q20);
                                        }
                                        ml4 ml48 = ml47;
                                        String str = (String) Q20;
                                        ml43 = ml48;
                                        tr6 tr65 = tr64;
                                        ml4 u38 = new u38(mm73, rc9.D(mm73, lo76, str, yt22, 384, 0), n522, x822, tr65);
                                        n523 = n522;
                                        tr6 = tr65;
                                        yt22.r(z3);
                                        ml42 = u38;
                                    } else {
                                        tr6 = tr64;
                                        ml43 = ml47;
                                        n523 = n522;
                                        yt22.e0(1020031362);
                                        yt22.r(z3);
                                        ml42 = ml43;
                                    }
                                    lo7 lo77 = we.v;
                                    z8 = (nm72.a == null || nm7.a == null || tr6.f == 1.0f) ? z7 : z3;
                                    boolean z14 = (nm72.d == null || nm7.d == null || tr6.g == 1.0f) ? z7 : z3;
                                    if (!z8) {
                                        yt22.e0(-1511865571);
                                        Object Q21 = yt22.Q();
                                        if (Q21 == d63) {
                                            Q21 = "Built-in alpha";
                                            yt22.o0(Q21);
                                        }
                                        tr6 tr66 = tr6;
                                        lo7 = lo77;
                                        ykVar = ykVar3;
                                        z9 = z14;
                                        ml44 = ml42;
                                        tr62 = tr66;
                                        x823 = x822;
                                        bm7 D5 = rc9.D(mm73, lo7, (String) Q21, yt22, 384, 0);
                                        yt22.r(z3);
                                        bm74 = D5;
                                    } else {
                                        ykVar = ykVar3;
                                        z9 = z14;
                                        tr62 = tr6;
                                        ml44 = ml42;
                                        lo7 = lo77;
                                        x823 = x822;
                                        yt22.e0(-1511696126);
                                        yt22.r(z3);
                                        bm74 = null;
                                    }
                                    if (!z9) {
                                        yt22.e0(-1511628483);
                                        Object Q22 = yt22.Q();
                                        if (Q22 == d63) {
                                            Q22 = "Built-in scale";
                                            yt22.o0(Q22);
                                        }
                                        bm76 = bm74;
                                        bm7 D6 = rc9.D(mm73, lo7, (String) Q22, yt22, 384, 0);
                                        yt22.r(z3);
                                        bm75 = D6;
                                    } else {
                                        bm76 = bm74;
                                        yt22.e0(-1511459038);
                                        yt22.r(z3);
                                        bm75 = null;
                                    }
                                    if (!z9) {
                                        yt22.e0(-1511381382);
                                        ml45 = ml44;
                                        bm78 = bm75;
                                        bm77 = rc9.D(mm73, i52.a, "TransformOriginInterruptionHandling", yt22, 384, 0);
                                        yt22.r(z3);
                                    } else {
                                        ml45 = ml44;
                                        bm78 = bm75;
                                        yt22.e0(-1511209054);
                                        yt22.r(z3);
                                        bm77 = null;
                                    }
                                    i7 = yt22.i(bm76) | yt22.g(n523) | yt22.g(x823) | yt22.i(tr62) | yt22.i(bm78) | yt22.g(mm73) | yt22.i(bm77);
                                    Q9 = yt22.Q();
                                    if (!i7 || Q9 == d63) {
                                        n52 n527 = n523;
                                        tr63 = tr62;
                                        x82 x827 = x823;
                                        Q9 = new c52(bm76, tr63, bm78, mm73, n527, x827, bm77);
                                        n524 = n527;
                                        x824 = x827;
                                        yt22.o0(Q9);
                                    } else {
                                        n524 = n523;
                                        tr63 = tr62;
                                        x824 = x823;
                                    }
                                    c52 c52 = (c52) Q9;
                                    boolean h2 = yt22.h(z13) | yt22.g(sr2);
                                    Q10 = yt22.Q();
                                    if (h2 || Q10 == d63) {
                                        Q10 = new g52(z13, sr2);
                                        yt22.o0(Q10);
                                    }
                                    ml4 d2 = mp7.X(ml43, (vr2) Q10).d(new b52(mm73, bm72, bm73, bm7, n524, x824, tr63, sr2, c52)).d(ml45);
                                    yt22.e0(-1255668613);
                                    yt22.r(z3);
                                    ml46 = ml4;
                                    ml4 d3 = ml46.d(d2.d(ml43));
                                    Q11 = yt22.Q();
                                    if (Q11 != d63) {
                                        ykVar2 = ykVar;
                                        Q11 = new nk(ykVar2);
                                        yt22.o0(Q11);
                                    } else {
                                        ykVar2 = ykVar;
                                    }
                                    nk nkVar = (nk) Q11;
                                    int hashCode = Long.hashCode(yt22.T);
                                    vf5 m2 = yt22.m();
                                    ml4 E2 = gw8.E(yt22, d3);
                                    ux0.d.getClass();
                                    vy0 vy0 = tx0.b;
                                    yt22.i0();
                                    if (!yt22.S) {
                                        yt22.l(vy0);
                                    } else {
                                        yt22.r0();
                                    }
                                    g75.Q(tx0.f, yt22, nkVar);
                                    g75.Q(tx0.e, yt22, m2);
                                    g75.C(yt22, Integer.valueOf(hashCode), tx0.g);
                                    g75.O(yt22, tx0.h);
                                    g75.Q(tx0.d, yt22, E2);
                                    fw02 = fw0;
                                    fw02.u(ykVar2, yt22, Integer.valueOf((i5 >> 21) & 112));
                                    yt22.r(z7);
                                    yt22.r(z3);
                                }
                            } else {
                                n522 = n526;
                                x822 = x826;
                            }
                            z5 = true;
                            if (cn0 == null && nm73.c == null) {
                            }
                            if (!z5) {
                            }
                            if (!z6) {
                            }
                            if (!z6) {
                            }
                            boolean z132 = !z6;
                            t76 t762 = vt0.e;
                            ml4 ml472 = jl4.w;
                            if (c2) {
                            }
                            lo7 lo772 = we.v;
                            if (nm72.a == null && nm7.a == null && tr6.f == 1.0f) {
                            }
                            if (nm72.d == null && nm7.d == null && tr6.g == 1.0f) {
                            }
                            if (!z8) {
                            }
                            if (!z9) {
                            }
                            if (!z9) {
                            }
                            i7 = yt22.i(bm76) | yt22.g(n523) | yt22.g(x823) | yt22.i(tr62) | yt22.i(bm78) | yt22.g(mm73) | yt22.i(bm77);
                            Q9 = yt22.Q();
                            if (!i7) {
                            }
                            n52 n5272 = n523;
                            tr63 = tr62;
                            x82 x8272 = x823;
                            Q9 = new c52(bm76, tr63, bm78, mm73, n5272, x8272, bm77);
                            n524 = n5272;
                            x824 = x8272;
                            yt22.o0(Q9);
                            c52 c522 = (c52) Q9;
                            boolean h22 = yt22.h(z132) | yt22.g(sr2);
                            Q10 = yt22.Q();
                            Q10 = new g52(z132, sr2);
                            yt22.o0(Q10);
                            ml4 d22 = mp7.X(ml43, (vr2) Q10).d(new b52(mm73, bm72, bm73, bm7, n524, x824, tr63, sr2, c522)).d(ml45);
                            yt22.e0(-1255668613);
                            yt22.r(z3);
                            ml46 = ml4;
                            ml4 d32 = ml46.d(d22.d(ml43));
                            Q11 = yt22.Q();
                            if (Q11 != d63) {
                            }
                            nk nkVar2 = (nk) Q11;
                            int hashCode2 = Long.hashCode(yt22.T);
                            vf5 m22 = yt22.m();
                            ml4 E22 = gw8.E(yt22, d32);
                            ux0.d.getClass();
                            vy0 vy02 = tx0.b;
                            yt22.i0();
                            if (!yt22.S) {
                            }
                            g75.Q(tx0.f, yt22, nkVar2);
                            g75.Q(tx0.e, yt22, m22);
                            g75.C(yt22, Integer.valueOf(hashCode2), tx0.g);
                            g75.O(yt22, tx0.h);
                            g75.Q(tx0.d, yt22, E22);
                            fw02 = fw0;
                            fw02.u(ykVar2, yt22, Integer.valueOf((i5 >> 21) & 112));
                            yt22.r(z7);
                            yt22.r(z3);
                        }
                        yt22.r(z3);
                    }
                } else {
                    i4 = i14;
                }
                z2 = true;
                Q2 = yt22.Q();
                if (!z2) {
                }
                i5 = i10;
                Q2 = new mm7(new dq4(U2), mm74, b81.n(mm74.c, " > EnterExitTransition"));
                yt22.o0(Q2);
                mm72 = (mm7) Q2;
                boolean g22 = ((i15 > 4 && yt22.g(mm74)) || (i4 & 6) == 4) | yt22.g(mm72);
                Q3 = yt22.Q();
                Q3 = new k77(12, (Object) mm74, (Object) mm72);
                yt22.o0(Q3);
                t49.e(mm72, (vr2) Q3, yt22);
                if (!mm74.h()) {
                }
                if (mm74.h()) {
                }
                lo7 lo722 = i52.a;
                boolean g32 = yt22.g(mm72);
                Q4 = yt22.Q();
                Q4 = u55.p(n525);
                yt22.o0(Q4);
                aq4 aq422 = (aq4) Q4;
                in8 in842 = mm72.a;
                in8 = mm72.a;
                ed5 = mm72.d;
                H0 = in842.H0();
                value = ed5.getValue();
                a52 = a52.y;
                a522 = a52.x;
                if (H0 == value || in8.H0() == a522) {
                }
                n52 n5262 = (n52) aq422.getValue();
                boolean g42 = yt22.g(mm72);
                Q5 = yt22.Q();
                Q5 = u55.p(x825);
                yt22.o0(Q5);
                aq4 aq432 = (aq4) Q5;
                if (in8.H0() == ed5.getValue() || in8.H0() == a522) {
                }
                x82 x8262 = (x82) aq432.getValue();
                aq4 v22 = u55.v(gs22, yt22);
                Object H22 = gs22.H(in8.H0(), ed5.getValue());
                boolean g52 = yt22.g(mm72) | yt22.g(v22);
                Q6 = yt22.Q();
                ed52 = ed5;
                Q6 = new p0((Object) mm72, (Object) v22, (f61) null, 7);
                yt22.o0(Q6);
                gs2 gs232 = (gs2) Q6;
                Q7 = yt22.Q();
                if (Q7 == d632) {
                }
                aq4 = (aq4) Q7;
                i6 = yt22.i(gs232);
                Q8 = yt22.Q();
                if (!i6) {
                }
                Q8 = new wx6(gs232, aq4, (f61) null, 0);
                yt22.o0(Q8);
                t49.h((gs2) Q8, yt22, vs7.a);
                if (in8.H0() == a52 || ed52.getValue() == a52 || ((Boolean) aq4.getValue()).booleanValue()) {
                }
                yt22.r(z3);
            } else {
                yt22.e0(-270847985);
                yt22.r(false);
            }
        } else {
            yt22.Y();
        }
        yx5 v3 = yt22.v();
        if (v3 != null) {
            v3.d = new wj(mm7, vr2, ml46, n52, x82, gs2, fw02, i2);
        }
    }

    public static final void b(boolean z2, ml4 ml4, n52 n52, x82 x82, String str, fw0 fw0, yt2 yt2, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z3;
        String str2;
        jl4 jl4;
        yt2 yt22 = yt2;
        yt22.g0(234057107);
        if (yt22.h(z2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i2 | i3 | 384;
        if (yt22.g(n52)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i7 = i6 | i4;
        if (yt22.g(x82)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i8 = i7 | i5 | 196608;
        if ((599185 & i8) != 599184) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (yt22.V(i8 & 1, z3)) {
            mm7 d1 = rc9.d1(Boolean.valueOf(z2), "AnimatedVisibility", yt22, ((i8 >> 3) & 14) | 48, 0);
            Object Q2 = yt22.Q();
            if (Q2 == ay0.a) {
                Q2 = ce.K;
                yt22.o0(Q2);
            }
            int i9 = (i8 & 57344) | (i8 & 7168) | 432 | 1572864;
            mm7 mm7 = d1;
            vr2 vr2 = (vr2) Q2;
            jl4 jl42 = jl4.w;
            e(mm7, vr2, jl42, n52, x82, fw0, yt22, i9);
            jl4 = jl42;
            str2 = "AnimatedVisibility";
        } else {
            yt2.Y();
            jl4 = ml4;
            str2 = str;
        }
        yx5 v2 = yt2.v();
        if (v2 != null) {
            v2.d = new vk(z2, jl4, n52, x82, str2, fw0, i2);
        }
    }

    public static final void c(boolean z2, ml4 ml4, n52 n52, x82 x82, String str, fw0 fw0, yt2 yt2, int i2, int i3) {
        int i4;
        boolean z3;
        String str2;
        ml4 ml42;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        yt2 yt22 = yt2;
        int i10 = i2;
        yt22.g0(-1448730565);
        if ((i10 & 6) == 0) {
            if (yt22.h(z2)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i4 = i9 | i10;
        } else {
            i4 = i10;
        }
        int i11 = i3 & 2;
        if (i11 != 0) {
            i4 |= 48;
        } else if ((i10 & 48) == 0) {
            if (yt22.g(ml4)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i4 |= i8;
        }
        if ((i10 & 384) == 0) {
            if (yt22.g(n52)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i4 |= i7;
        }
        if ((i10 & 3072) == 0) {
            if (yt22.g(x82)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i4 |= i6;
        }
        int i12 = i4 | 24576;
        fw0 fw02 = fw0;
        if ((196608 & i10) == 0) {
            if (yt22.i(fw02)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i12 |= i5;
        }
        if ((74899 & i12) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (yt22.V(i12 & 1, z3)) {
            if (i11 != 0) {
                ml4 = jl4.w;
            }
            ml42 = ml4;
            mm7 d1 = rc9.d1(Boolean.valueOf(z2), "AnimatedVisibility", yt22, (i12 & 14) | ((i12 >> 9) & 112), 0);
            Object Q2 = yt22.Q();
            if (Q2 == ay0.a) {
                Q2 = ce.J;
                yt22.o0(Q2);
            }
            int i13 = i12 << 3;
            e(d1, (vr2) Q2, ml42, n52, x82, fw02, yt22, (i13 & 896) | 48 | (i13 & 7168) | (57344 & i13) | (i13 & 3670016));
            str2 = "AnimatedVisibility";
        } else {
            yt2.Y();
            ml42 = ml4;
            str2 = str;
        }
        yx5 v2 = yt2.v();
        if (v2 != null) {
            v2.d = new uk(z2, ml42, n52, x82, str2, fw0, i10, i3, 0);
        }
    }

    public static final void d(boolean z2, ml4 ml4, n52 n52, x82 x82, String str, fw0 fw0, yt2 yt2, int i2, int i3) {
        int i4;
        boolean z3;
        String str2;
        x82 x822;
        n52 n522;
        ml4 ml42;
        int i5;
        int i6;
        yt2 yt22 = yt2;
        int i7 = i2;
        yt22.g0(1799879339);
        if (yt22.h(z2)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i8 = i4 | i7;
        int i9 = i8 | 384;
        int i10 = i3 & 4;
        if (i10 != 0) {
            i9 = i8 | 3456;
        } else if ((i7 & 3072) == 0) {
            if (yt22.g(n52)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i9 |= i6;
        }
        int i11 = i3 & 8;
        if (i11 != 0) {
            i9 |= 24576;
        } else if ((i7 & 24576) == 0) {
            if (yt22.g(x82)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i9 |= i5;
        }
        int i12 = i9 | 196608;
        if ((599185 & i12) != 599184) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (yt22.V(i12 & 1, z3)) {
            if (i10 != 0) {
                n52 = i52.e((je2) null, 3).a(i52.d((je2) null, 15));
            }
            if (i11 != 0) {
                x822 = i52.f((je2) null, 3).a(i52.i((je2) null, 15));
            } else {
                x822 = x82;
            }
            mm7 d1 = rc9.d1(Boolean.valueOf(z2), "AnimatedVisibility", yt22, ((i12 >> 3) & 14) | 48, 0);
            Object Q2 = yt22.Q();
            if (Q2 == ay0.a) {
                Q2 = ce.L;
                yt22.o0(Q2);
            }
            ml42 = jl4.w;
            n522 = n52;
            e(d1, (vr2) Q2, ml42, n522, x822, fw0, yt22, (i12 & 57344) | (i12 & 7168) | 432 | 1572864);
            str2 = "AnimatedVisibility";
        } else {
            yt2.Y();
            ml42 = ml4;
            n522 = n52;
            x822 = x82;
            str2 = str;
        }
        yx5 v2 = yt2.v();
        if (v2 != null) {
            v2.d = new uk(z2, ml42, n522, x822, str2, fw0, i7, i3, 1);
        }
    }

    public static final void e(mm7 mm7, vr2 vr2, ml4 ml4, n52 n52, x82 x82, fw0 fw0, yt2 yt2, int i2) {
        int i3;
        n52 n522;
        x82 x822;
        fw0 fw02;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        mm7 mm72 = mm7;
        vr2 vr22 = vr2;
        ml4 ml42 = ml4;
        yt2 yt22 = yt2;
        int i10 = i2;
        yt22.g0(-497872534);
        if ((i10 & 6) == 0) {
            if (yt22.g(mm72)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i3 = i9 | i10;
        } else {
            i3 = i10;
        }
        if ((i10 & 48) == 0) {
            if (yt22.i(vr22)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i3 |= i8;
        }
        if ((i10 & 384) == 0) {
            if (yt22.g(ml42)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i3 |= i7;
        }
        if ((i10 & 3072) == 0) {
            n522 = n52;
            if (yt22.g(n522)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        } else {
            n522 = n52;
        }
        if ((i10 & 24576) == 0) {
            x822 = x82;
            if (yt22.g(x822)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i3 |= i5;
        } else {
            x822 = x82;
        }
        int i11 = i3 | 196608;
        if ((1572864 & i10) == 0) {
            fw02 = fw0;
            if (yt22.i(fw02)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i11 |= i4;
        } else {
            fw02 = fw0;
        }
        boolean z4 = false;
        if ((599187 & i11) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i11 & 1, z2)) {
            int i12 = i11 & 112;
            if (i12 == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            int i13 = i11 & 14;
            if (i13 == 4) {
                z4 = true;
            }
            boolean z5 = z3 | z4;
            Object Q2 = yt22.Q();
            d63 d63 = ay0.a;
            if (z5 || Q2 == d63) {
                Q2 = new wk(vr22, mm72);
                yt22.o0(Q2);
            }
            ml4 D2 = we.D(ml42, (hs2) Q2);
            Object Q3 = yt22.Q();
            if (Q3 == d63) {
                Q3 = ck.z;
                yt22.o0(Q3);
            }
            int i14 = i11 << 6;
            a(mm72, vr22, D2, n522, x822, (gs2) Q3, fw02, yt22, 196608 | i13 | i12 | (i11 & 7168) | (57344 & i11) | (29360128 & i14) | (i14 & 234881024));
        } else {
            yt2.Y();
        }
        yx5 v2 = yt2.v();
        if (v2 != null) {
            v2.d = new xj(mm7, vr2, ml42, n52, x82, fw0, i10);
        }
    }

    public static s90 f(hg hgVar, int i2) {
        Bitmap bitmap = hgVar.a;
        s90 s90 = new s90(hgVar, (((long) bitmap.getWidth()) << 32) | (((long) bitmap.getHeight()) & 4294967295L));
        s90.C = i2;
        return s90;
    }

    public static final void g(sr2 sr2, yt2 yt2, int i2) {
        int i3;
        boolean z2;
        int i4;
        yt2.g0(-1646555525);
        if ((i2 & 6) == 0) {
            if (yt2.i(sr2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt2.V(i3 & 1, z2)) {
            h((View) yt2.k(ye.f), (tp1) yt2.k(xy0.h), sr2, yt2, (i3 << 6) & 896);
        } else {
            yt2.Y();
        }
        yx5 v2 = yt2.v();
        if (v2 != null) {
            v2.d = new q92(i2, 0, sr2);
        }
    }

    public static final void h(View view, tp1 tp1, sr2 sr2, yt2 yt2, int i2) {
        int i3;
        boolean z2;
        int i4;
        int i5;
        int i6;
        yt2.g0(-1319522472);
        if ((i2 & 6) == 0) {
            if (yt2.i(view)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (yt2.g(tp1)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 384) == 0) {
            if (yt2.i(sr2)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        boolean z3 = false;
        if ((i3 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt2.V(i3 & 1, z2)) {
            boolean i7 = yt2.i(view);
            if ((i3 & 896) == 256) {
                z3 = true;
            }
            boolean z4 = i7 | z3;
            Object Q2 = yt2.Q();
            if (z4 || Q2 == ay0.a) {
                Q2 = new m0(18, view, sr2);
                yt2.o0(Q2);
            }
            t49.f(view, tp1, (vr2) Q2, yt2);
        } else {
            yt2.Y();
        }
        yx5 v2 = yt2.v();
        if (v2 != null) {
            v2.d = new bi(i2, 8, (Object) view, (Object) tp1, (Object) sr2);
        }
    }

    public static float i(EdgeEffect edgeEffect, float f2, float f3, tp1 tp1) {
        float f4;
        float f5 = v12.a;
        double b2 = ((double) v12.a) * ((double) (tp1.b() * 386.0878f * 160.0f * 0.84f));
        float exp = (float) (Math.exp((v12.b / v12.c) * Math.log(((double) (Math.abs(f2) * 0.35f)) / b2)) * b2);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            f4 = hn.c(edgeEffect);
        } else {
            f4 = 0.0f;
        }
        if (exp > f4 * f3) {
            return 0.0f;
        }
        int C2 = dh4.C(f2);
        if (i2 >= 31) {
            edgeEffect.onAbsorb(C2);
            return f2;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(C2);
        }
        return f2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0103 A[PHI: r4 
      PHI: (r4v1 java.lang.Class) = (r4v0 java.lang.Class), (r4v0 java.lang.Class), (r4v2 java.lang.Class) binds: [B:40:0x00c6, B:42:0x00cc, B:44:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0160  */
    public static final dj0 j(kr1 kr1, boolean z2) {
        dj0 dj0;
        oo3 oo3;
        Method method;
        ip3 ip3;
        Method method2;
        dj0 rj0;
        ql4 ql4;
        uq4 uq4;
        vj1 r2;
        ql4 ql42;
        cc3 cc3;
        if (yq3.w.e(kr1.T().E)) {
            return sh7.a;
        }
        gq0 gq0 = ta6.a;
        t49 b2 = ta6.b(kr1.T().R());
        Class cls = null;
        if (b2 instanceof dp3) {
            dp3 dp3 = (dp3) b2;
            vq4 vq4 = dp3.i;
            kp3 kp3 = dp3.h;
            if (z2) {
                if (kp3.i()) {
                    ip3 = kp3.A;
                    if (ip3 != null) {
                        method2 = kr1.T().C.N(vq4.getString(ip3.y), vq4.getString(ip3.z));
                    } else {
                        method2 = null;
                    }
                    if (method2 == null) {
                        cr5 T2 = kr1.T().R();
                        int i2 = dc3.a;
                        if (T2.b0() == null && T2.h0().isEmpty()) {
                            vj1 r3 = T2.r();
                            if (r3 instanceof ql4) {
                                ql4 = (ql4) r3;
                            } else {
                                ql4 = null;
                            }
                            if (ql4 != null) {
                                int i3 = ts1.a;
                                y18 v0 = ql4.v0();
                                if (v0 instanceof cc3) {
                                    cc3 = (cc3) v0;
                                } else {
                                    cc3 = null;
                                }
                                if (cc3 != null) {
                                    uq4 = cc3.a;
                                    if (sg3.e(uq4, T2.getName()) && sg3.e(kr1.T().R().f(), vs1.d)) {
                                        r2 = kr1.T().R().r();
                                        if ((r2 instanceof ql4) && dc3.a(r2) && (cls = g18.q(ql42)) == null) {
                                            StringBuilder sb = new StringBuilder("Class object for the class ");
                                            sb.append((ql42 = (ql4) r2).getName());
                                            gq0 f2 = ts1.f((vq0) r2);
                                            sb.append(" cannot be found (classId=");
                                            sb.append(f2);
                                            sb.append(')');
                                            throw new Error(sb.toString());
                                        } else if (cls != null) {
                                            Method n2 = l55.n(cls, kr1.T());
                                            if (r16.Z(kr1)) {
                                                dj0 = new bg3(n2, r16.F(kr1.T()));
                                            } else {
                                                dj0 = new cg3(n2);
                                            }
                                        } else {
                                            throw new Error("Underlying property of inline class " + kr1.T() + " should have a field");
                                        }
                                    }
                                }
                            }
                            uq4 = null;
                            r2 = kr1.T().R().r();
                            if ((r2 instanceof ql4) || dc3.a(r2) || (cls = g18.q(ql42)) == null) {
                            }
                        }
                        Field t2 = kr1.T().t();
                        if (t2 != null) {
                            dj0 = C(kr1, z2, t2);
                        } else {
                            rf2.w("No accessors or field is found for property ", kr1.T());
                            return null;
                        }
                    } else {
                        if (!Modifier.isStatic(method2.getModifiers())) {
                            if (r16.Z(kr1)) {
                                rj0 = new oj0(method2, r16.F(kr1.T()));
                            } else {
                                rj0 = new rj0(method2, false, 6, 0);
                            }
                        } else if (kr1.T().R().getAnnotations().i(g18.a)) {
                            if (r16.Z(kr1)) {
                                rj0 = new jj0(method2, false, 4);
                            } else {
                                rj0 = new rj0(method2, true, 4, 1);
                            }
                        } else if (r16.Z(kr1)) {
                            rj0 = new qj0(method2, false, r16.F(kr1.T()));
                        } else {
                            rj0 = new rj0(method2, false, 6, 2);
                        }
                        dj0 = rj0;
                    }
                }
            } else if ((kp3.x & 8) == 8) {
                ip3 = kp3.B;
                if (ip3 != null) {
                }
                if (method2 == null) {
                }
            }
            ip3 = null;
            if (ip3 != null) {
            }
            if (method2 == null) {
            }
        } else if (b2 instanceof bp3) {
            dj0 = C(kr1, z2, ((bp3) b2).f);
        } else if (b2 instanceof cp3) {
            if (z2) {
                method = ((cp3) b2).f;
            } else {
                cp3 cp3 = (cp3) b2;
                method = cp3.g;
                if (method == null) {
                    rf2.w("No source found for setter of Java method property: ", cp3.f);
                    return null;
                }
            }
            if (r16.Z(kr1)) {
                dj0 = new oj0(method, r16.F(kr1.T()));
            } else {
                dj0 = new rj0(method);
            }
        } else if (b2 instanceof ep3) {
            if (z2) {
                oo3 = ((ep3) b2).f;
            } else {
                oo3 = ((ep3) b2).g;
                if (oo3 == null) {
                    rf2.w("No setter found for property ", kr1.T());
                    return null;
                }
            }
            yq3 yq3 = kr1.T().C;
            qo3 qo3 = oo3.A;
            Method N2 = yq3.N(qo3.t, qo3.u);
            if (N2 != null) {
                Modifier.isStatic(N2.getModifiers());
                if (r16.Z(kr1)) {
                    return new oj0(N2, r16.F(kr1.T()));
                }
                return new rj0(N2, false, 6, 0);
            }
            rf2.w("No accessor found for property ", kr1.T());
            return null;
        } else {
            h.c();
            return null;
        }
        return l55.j(dj0, kr1, a42.w, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r2 = r2.N(r3);
     */
    public static final int k(u44 u44, long j2, g58 g58) {
        long N2;
        int J2;
        cg7 d2 = u44.d();
        if (d2 != null) {
            pn4 pn4 = d2.a.b;
            dy3 c2 = u44.c();
            if (!(c2 == null || (J2 = J(pn4, N2, g58)) == -1)) {
                return pn4.g(l35.a(N2, (pn4.b(J2) + pn4.f(J2)) / 2.0f, 1));
            }
        }
        return -1;
    }

    public static final long l(u44 u44, ly5 ly5, ly5 ly52, int i2) {
        long L2 = L(u44, ly5, i2);
        if (lg7.c(L2)) {
            return lg7.b;
        }
        long L3 = L(u44, ly52, i2);
        if (lg7.c(L3)) {
            return lg7.b;
        }
        int i3 = (int) (L2 >> 32);
        int i4 = (int) (L3 & 4294967295L);
        return i95.a(Math.min(i3, i3), Math.max(i4, i4));
    }

    public static final boolean m(bg7 bg7, int i2) {
        pn4 pn4 = bg7.b;
        int d2 = pn4.d(i2);
        if (i2 == bg7.g(d2) || i2 == pn4.c(d2, false) ? bg7.h(i2) == bg7.a(i2) : bg7.a(i2) == bg7.a(i2 - 1)) {
            return false;
        }
        return true;
    }

    public static final long n(PointF pointF) {
        return (((long) Float.floatToRawIntBits(pointF.x)) << 32) | (((long) Float.floatToRawIntBits(pointF.y)) & 4294967295L);
    }

    public static final void p(n74 n74, nm2 nm2) {
        if (nm2 instanceof k60) {
            n74.add(((k60) nm2).a);
        } else if (nm2 instanceof az0) {
            for (e05 p2 : ((az0) nm2).a) {
                p(n74, p2);
            }
        } else if (nm2 instanceof c21) {
        } else {
            if (nm2 instanceof vt6) {
                p(n74, ((vt6) nm2).a);
            } else if (nm2 instanceof tb) {
                tb tbVar = (tb) nm2;
                p(n74, tbVar.a);
                Iterator it = tbVar.b.iterator();
                while (it.hasNext()) {
                    p(n74, (nm2) it.next());
                }
            } else if (nm2 instanceof r75) {
                p(n74, ((r75) nm2).b);
            } else {
                h.c();
            }
        }
    }

    public static final int q(int i2, int i3, int[] iArr) {
        iArr.getClass();
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else if (i7 <= i3) {
                return i6;
            } else {
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }

    public static final int r(long[] jArr, int i2, long j2) {
        jArr.getClass();
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = (jArr[i5] > j2 ? 1 : (jArr[i5] == j2 ? 0 : -1));
            if (i6 < 0) {
                i4 = i5 + 1;
            } else if (i6 <= 0) {
                return i5;
            } else {
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static xb4 s(List list, vr2 vr2, gs2 gs2) {
        Object obj;
        list.getClass();
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            obj = it.next();
            if (it.hasNext()) {
                Comparable comparable = (Comparable) vr2.y(obj);
                do {
                    Object next = it.next();
                    Comparable comparable2 = (Comparable) vr2.y(next);
                    if (comparable.compareTo(comparable2) < 0) {
                        obj = next;
                        comparable = comparable2;
                    }
                } while (it.hasNext());
            }
        }
        if (obj != null) {
            ((Number) vr2.y(obj)).intValue();
            if (!list.isEmpty()) {
                for (Object y2 : list) {
                    if (((Number) vr2.y(y2)).intValue() == 0) {
                        h.q("There should be no empty entries");
                        return null;
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            t(arrayList, list, 0, vr2, gs2);
            arrayList.trimToSize();
            new us(0, a42.w, arrayList);
            return new xb4(20);
        }
        kj6.i("Unable to build char tree from an empty list");
        return null;
    }

    public static void t(ArrayList arrayList, List list, int i2, vr2 vr2, gs2 gs2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : list) {
            Character ch = (Character) gs2.H(next, Integer.valueOf(i2));
            ch.getClass();
            Object obj = linkedHashMap.get(ch);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(ch, obj);
            }
            ((List) obj).add(next);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            char charValue = ((Character) entry.getKey()).charValue();
            List list2 = (List) entry.getValue();
            int i3 = i2 + 1;
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (Object next2 : list2) {
                if (((Number) vr2.y(next2)).intValue() > i3) {
                    arrayList3.add(next2);
                }
            }
            t(arrayList2, arrayList3, i3, vr2, gs2);
            arrayList2.trimToSize();
            ArrayList arrayList4 = new ArrayList();
            for (Object next3 : list2) {
                if (((Number) vr2.y(next3)).intValue() == i3) {
                    arrayList4.add(next3);
                }
            }
            arrayList.add(new us(charValue, arrayList4, arrayList2));
        }
    }

    public static String v(int i2, int i3, int i4, String str, String str2) {
        int i5;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if ((i4 & 1) != 0) {
            i5 = 0;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        int i6 = i3;
        if ((i4 & 8) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if ((i4 & 16) != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if ((i4 & 32) != 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if ((i4 & 64) != 0) {
            z5 = false;
        } else {
            z5 = true;
        }
        str.getClass();
        return w(str, i5, i6, str2, z2, z3, z4, z5, 128);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: sc0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: sc0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: sc0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: sc0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: sc0} */
    /* JADX WARNING: type inference failed for: r8v1, types: [sc0, java.lang.Object] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    public static String w(String str, int i2, int i3, String str2, boolean z2, boolean z3, boolean z4, boolean z5, int i4) {
        int i5;
        int i6;
        boolean z6;
        boolean z7;
        String str3 = str;
        String str4 = str2;
        boolean z8 = false;
        if ((i4 & 1) != 0) {
            i5 = 0;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i6 = str3.length();
        } else {
            i6 = i3;
        }
        if ((i4 & 8) != 0) {
            z6 = false;
        } else {
            z6 = z2;
        }
        if ((i4 & 16) != 0) {
            z7 = false;
        } else {
            z7 = z3;
        }
        if ((i4 & 64) == 0) {
            z8 = z5;
        }
        str3.getClass();
        int i7 = i5;
        while (i7 < i6) {
            int codePointAt = str3.codePointAt(i7);
            int i8 = 128;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z8) || d57.y0(str4, (char) codePointAt) || ((codePointAt == 37 && (!z6 || (z7 && !N(i7, i6, str3)))) || (codePointAt == 43 && z4)))) {
                ? obj = new Object();
                obj.n0(i5, i7, str3);
                sc0 sc0 = null;
                while (i7 < i6) {
                    int codePointAt2 = str3.codePointAt(i7);
                    if (!z6 || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                        String str5 = "+";
                        if (codePointAt2 == 32 && str4 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            obj.o0(str5);
                        } else if (codePointAt2 == 43 && z4) {
                            if (!z6) {
                                str5 = "%2B";
                            }
                            obj.o0(str5);
                        } else if (codePointAt2 < 32 || codePointAt2 == 127 || ((codePointAt2 >= i8 && !z8) || d57.y0(str4, (char) codePointAt2) || (codePointAt2 == 37 && (!z6 || (z7 && !N(i7, i6, str3)))))) {
                            if (sc0 == null) {
                                sc0 = new Object();
                            }
                            sc0.p0(codePointAt2);
                            while (!sc0.x()) {
                                byte readByte = sc0.readByte();
                                obj.a0(37);
                                char[] cArr = g0;
                                obj.a0(cArr[((readByte & 255) >> 4) & 15]);
                                obj.a0(cArr[readByte & 15]);
                            }
                            sc0 = sc0;
                        } else {
                            obj.p0(codePointAt2);
                        }
                    }
                    i7 += Character.charCount(codePointAt2);
                    i8 = 128;
                    sc0 = sc0;
                }
                return obj.L();
            }
            i7 += Character.charCount(codePointAt);
        }
        return str3.substring(i5, i6);
    }

    public static void x(int i2, int i3, int i4) {
        if (i2 < 0 || i3 > i4) {
            ku4.d(i4, pb4.p("startIndex: ", i2, ", endIndex: ", i3, ", size: "));
        } else if (i2 > i3) {
            h.q(b81.l(i2, i3, "startIndex: ", " > endIndex: "));
        }
    }

    public static void y(Object obj, Object obj2) {
        if (obj == null) {
            String valueOf = String.valueOf(obj2);
            StringBuilder sb = new StringBuilder(valueOf.length() + 24);
            sb.append("null key in entry: null=");
            sb.append(valueOf);
            throw new NullPointerException(sb.toString());
        } else if (obj2 == null) {
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 26);
            sb2.append("null value in entry: ");
            sb2.append(valueOf2);
            sb2.append("=null");
            throw new NullPointerException(sb2.toString());
        }
    }

    public static void z(int i2, String str) {
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder(str.length() + 40);
            sb.append(str);
            sb.append(" cannot be negative but was: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public abstract int o(int i2, int i3, ey3 ey3, eh5 eh5, int i4);

    public Integer u(eh5 eh5) {
        return null;
    }
}
