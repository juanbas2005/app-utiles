package defpackage;

import android.os.Build;
import android.view.ViewConfiguration;
import java.util.List;

/* renamed from: en4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class en4 extends i05 {
    public final f96 f;
    public final ad0 g = rj1.c(Integer.MAX_VALUE, 6, (vc0) null);
    public h27 h;

    public en4(zh6 zh6, f96 f96, ew0 ew0, tp1 tp1) {
        super(zh6, ew0, tp1);
        this.f = f96;
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [java.lang.Object, h06] */
    /* JADX WARNING: type inference failed for: r1v16, types: [java.lang.Object, e06] */
    /* JADX WARNING: type inference failed for: r2v16, types: [java.lang.Object, h06] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x016b A[PHI: r12 
      PHI: (r12v1 p81) = (r12v2 p81), (r12v6 p81) binds: [B:37:0x0169, B:24:0x0101] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x016c A[PHI: r16 
      PHI: (r16v0 vs7) = (r16v1 vs7), (r16v2 vs7) binds: [B:37:0x0169, B:22:0x00d7] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0035  */
    public static final Object c(en4 en4, zh6 zh6, an4 an4, float f2, float f3, h61 h61) {
        bn4 bn4;
        bn4 bn42;
        int i;
        vs7 vs7;
        p81 p81;
        zh6 zh62;
        e06 e06;
        float f4;
        long b;
        gs2 gs2;
        x38 x38;
        long b2;
        h06 h06;
        en4 en42 = en4;
        zh6 zh63 = zh6;
        an4 an42 = an4;
        h61 h612 = h61;
        en42.getClass();
        jz0 jz0 = en42.e;
        if (h612 instanceof bn4) {
            bn4 = (bn4) h612;
            int i2 = bn4.E;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bn4.E = i2 - Integer.MIN_VALUE;
                bn42 = bn4;
                Object obj = bn42.C;
                i = bn42.E;
                vs7 vs72 = vs7.a;
                p81 p812 = p81.w;
                if (i != 0) {
                    o85.q(obj);
                    p81 p813 = p812;
                    ? obj2 = new Object();
                    obj2.w = an42;
                    vs7 = vs72;
                    long j = an42.b;
                    long j2 = an42.a;
                    h06 h062 = obj2;
                    ((z38) jz0.x).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
                    ((z38) jz0.y).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
                    an4 g2 = g(en42.g);
                    if (g2 != null) {
                        long j3 = g2.b;
                        long j4 = g2.a;
                        ((z38) jz0.x).a(Float.intBitsToFloat((int) (j4 >> 32)), j3);
                        ((z38) jz0.y).a(Float.intBitsToFloat((int) (j4 & 4294967295L)), j3);
                        h06 = h062;
                        h06.w = ((an4) h06.w).a(g2);
                    } else {
                        h06 = h062;
                    }
                    p81 p814 = p813;
                    ? obj3 = new Object();
                    float h2 = zh63.h(zh63.f(((an4) h06.w).a));
                    obj3.w = h2;
                    if (!gr8.s(h2)) {
                        ? obj4 = new Object();
                        obj4.w = gr8.a(0.0f, 0.0f, 30);
                        float f5 = f3;
                        p81 = p814;
                        cn4 cn4 = new cn4(obj3, obj4, h06, f2, en42, f5, zh63, (f61) null);
                        bn42.z = zh63;
                        bn42.A = obj3;
                        bn42.B = f5;
                        bn42.E = 1;
                        if (en42.b(cn4, bn42) != p81) {
                            e06 = obj3;
                            f4 = f5;
                            zh62 = zh63;
                        }
                        return p81;
                    }
                    return vs7;
                } else if (i == 1) {
                    f4 = bn42.B;
                    e06 = bn42.A;
                    zh62 = bn42.z;
                    o85.q(obj);
                    p81 = p812;
                    vs7 = vs72;
                } else if (i == 2) {
                    o85.q(obj);
                    return vs72;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b = u55.b(((z38) jz0.x).c(Float.MAX_VALUE), ((z38) jz0.y).c(Float.MAX_VALUE));
                if (b == 0) {
                    float e = zh62.e(Math.signum(e06.w)) * Math.min(Math.abs(e06.w) / 100.0f, f4) * 1000.0f;
                    if (e == 0.0f) {
                        b = 0;
                    } else {
                        if (zh62.d == z75.x) {
                            b2 = u55.b(e, 0.0f);
                        } else {
                            b2 = u55.b(0.0f, e);
                        }
                        b = b2;
                    }
                }
                gs2 = en42.b;
                x38 = new x38(b);
                bn42.z = null;
                bn42.A = null;
                bn42.E = 2;
                if (gs2.H(x38, bn42) != p81) {
                    return p81;
                }
                return vs7;
            }
        }
        bn4 = new bn4(en42, h612);
        bn42 = bn4;
        Object obj5 = bn42.C;
        i = bn42.E;
        vs7 vs722 = vs7.a;
        p81 p8122 = p81.w;
        if (i != 0) {
        }
        b = u55.b(((z38) jz0.x).c(Float.MAX_VALUE), ((z38) jz0.y).c(Float.MAX_VALUE));
        if (b == 0) {
        }
        gs2 = en42.b;
        x38 = new x38(b);
        bn42.z = null;
        bn42.A = null;
        bn42.E = 2;
        if (gs2.H(x38, bn42) != p81) {
        }
    }

    /* JADX WARNING: type inference failed for: r3v6, types: [h61] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    public static final Object d(en4 en4, h06 h06, e06 e06, zh6 zh6, h06 h062, long j, h61 h61) {
        dn4 dn4;
        int i;
        h06 h063;
        zh6 zh62;
        e06 e062;
        an4 an4;
        boolean z;
        long j2 = j;
        h61 h612 = h61;
        if (h612 instanceof dn4) {
            dn4 dn42 = (dn4) h612;
            int i2 = dn42.F;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dn42.F = i2 - Integer.MIN_VALUE;
                dn4 = dn42;
                Object obj = dn4.E;
                i = dn4.F;
                if (i != 0) {
                    o85.q(obj);
                    if (j2 < 0) {
                        return Boolean.FALSE;
                    }
                    ot otVar = new ot(en4, (f61) null, 18);
                    dn4.z = en4;
                    dn4.A = h06;
                    dn4.B = e06;
                    dn4.C = zh6;
                    dn4.D = h062;
                    dn4.F = 1;
                    obj = b35.D(j2, otVar, dn4);
                    p81 p81 = p81.w;
                    if (obj == p81) {
                        return p81;
                    }
                    e062 = e06;
                    zh62 = zh6;
                    h063 = h062;
                } else if (i == 1) {
                    h06 h064 = dn4.D;
                    zh6 zh63 = dn4.C;
                    e062 = dn4.B;
                    h06 h065 = dn4.A;
                    en4 en42 = dn4.z;
                    o85.q(obj);
                    h063 = h064;
                    zh62 = zh63;
                    h06 = h065;
                    en4 = en42;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                an4 = (an4) obj;
                if (an4 == null) {
                    boolean z2 = ((an4) h06.w).c;
                    long j3 = an4.a;
                    h06.w = new an4(j3, an4.b, z2);
                    e062.w = zh62.j(zh62.f(j3));
                    h063.w = gr8.a(0.0f, 0.0f, 30);
                    jz0 jz0 = en4.e;
                    long j4 = an4.b;
                    long j5 = an4.a;
                    ((z38) jz0.x).a(Float.intBitsToFloat((int) (j5 >> 32)), j4);
                    ((z38) jz0.y).a(Float.intBitsToFloat((int) (j5 & 4294967295L)), j4);
                    z = !gr8.s(e062.w);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }
        dn4 = new h61(h612);
        Object obj2 = dn4.E;
        i = dn4.F;
        if (i != 0) {
        }
        an4 = (an4) obj2;
        if (an4 == null) {
        }
        return Boolean.valueOf(z);
    }

    public static an4 g(ad0 ad0) {
        an4 an4 = null;
        bl6 y = t75.y(new fm2(new zm4(ad0, 0), (f61) null, 2));
        while (y.hasNext()) {
            an4 an42 = (an4) y.next();
            if (an4 != null) {
                an42 = an4.a(an42);
            }
            an4 = an42;
        }
        return an4;
    }

    public final float e(xh6 xh6, float f2) {
        zh6 zh6 = this.a;
        long i = zh6.i(zh6.e(f2));
        zh6 zh62 = xh6.a;
        return zh6.h(zh6.f(zh62.d(zh62.k, i, 1)));
    }

    public final boolean f(kk5 kk5) {
        float f2;
        float f3;
        long j;
        tp1 tp1 = this.c;
        ViewConfiguration viewConfiguration = (ViewConfiguration) this.f.x;
        int i = Build.VERSION.SDK_INT;
        if (i > 26) {
            f2 = an.h(viewConfiguration);
        } else {
            f2 = tp1.e0(64.0f);
        }
        float f4 = -f2;
        if (i > 26) {
            f3 = an.e(viewConfiguration);
        } else {
            f3 = tp1.e0(64.0f);
        }
        float f5 = -f3;
        List list = kk5.a;
        l35 l35 = new l35(0);
        int size = list.size();
        boolean z = false;
        int i2 = 0;
        while (true) {
            j = l35.a;
            if (i2 >= size) {
                break;
            }
            l35 = new l35(l35.e(j, ((qk5) list.get(i2)).j));
            i2++;
        }
        long floatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) * f5)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * f4)) & 4294967295L);
        zh6 zh6 = this.a;
        float j2 = zh6.j(zh6.f(floatToRawIntBits));
        if (j2 != 0.0f) {
            int i3 = (j2 > 0.0f ? 1 : (j2 == 0.0f ? 0 : -1));
            uh6 uh6 = zh6.a;
            if (i3 > 0) {
                z = uh6.c();
            } else {
                z = uh6.b();
            }
        }
        if (!z) {
            return this.d;
        }
        return !(this.g.c(new an4(floatToRawIntBits, ((qk5) dt0.w0(kk5.a)).b, false)) instanceof qn0);
    }
}
