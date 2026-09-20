package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import java.lang.annotation.Annotation;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: ub5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ub5 {
    public static x83 a;
    public static x83 b;

    public static long A(int i, byte[] bArr) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public static int B(byte[] bArr, int i, mj2 mj2) {
        int u = u(bArr, i, mj2);
        int i2 = mj2.a;
        if (i2 < 0) {
            zz8.b("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        } else if (i2 == 0) {
            mj2.d = "";
            return u;
        } else {
            mj2.d = ln8.d(bArr, u, i2);
            return u + i2;
        }
    }

    public static int C(byte[] bArr, int i, mj2 mj2) {
        int u = u(bArr, i, mj2);
        int i2 = mj2.a;
        if (i2 < 0) {
            zz8.b("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        } else if (i2 > bArr.length - u) {
            zz8.b("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        } else if (i2 == 0) {
            mj2.d = vk8.x;
            return u;
        } else {
            mj2.d = vk8.p(bArr, u, i2);
            return u + i2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    public static int D(Object obj, wm8 wm8, byte[] bArr, int i, int i2, mj2 mj2) {
        int i3 = i + 1;
        byte b2 = bArr[i];
        int i4 = b2;
        if (b2 < 0) {
            i3 = w(b2, bArr, i3, mj2);
            i4 = mj2.a;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            zz8.b("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        int i6 = mj2.c + 1;
        mj2.c = i6;
        if (i6 < 100) {
            int i7 = i5 + i4;
            Object obj2 = obj;
            mj2 mj22 = mj2;
            wm8.i(obj2, bArr, i5, i7, mj22);
            mj22.c--;
            mj22.d = obj2;
            return i7;
        }
        zz8.b("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        return 0;
    }

    public static int E(Object obj, wm8 wm8, byte[] bArr, int i, int i2, int i3, mj2 mj2) {
        om8 om8 = (om8) wm8;
        int i4 = mj2.c + 1;
        mj2.c = i4;
        if (i4 < 100) {
            om8 om82 = om8;
            Object obj2 = obj;
            int y = om82.y(obj2, bArr, i, i2, i3, mj2);
            mj2.c--;
            mj2.d = obj2;
            return y;
        }
        zz8.b("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        return 0;
    }

    public static int F(int i, byte[] bArr, int i2, int i3, zl8 zl8, mj2 mj2) {
        ol8 ol8 = (ol8) zl8;
        int u = u(bArr, i2, mj2);
        ol8.k(mj2.a);
        while (u < i3) {
            int u2 = u(bArr, u, mj2);
            if (i != mj2.a) {
                break;
            }
            u = u(bArr, u2, mj2);
            ol8.k(mj2.a);
        }
        return u;
    }

    public static int G(byte[] bArr, int i, zl8 zl8, mj2 mj2) {
        ol8 ol8 = (ol8) zl8;
        int u = u(bArr, i, mj2);
        int i2 = mj2.a + u;
        while (u < i2) {
            u = u(bArr, u, mj2);
            ol8.k(mj2.a);
        }
        if (u == i2) {
            return u;
        }
        zz8.b("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public static int H(wm8 wm8, int i, byte[] bArr, int i2, int i3, zl8 zl8, mj2 mj2) {
        nl8 a2 = wm8.a();
        wm8 wm82 = wm8;
        byte[] bArr2 = bArr;
        int i4 = i3;
        mj2 mj22 = mj2;
        int D = D(a2, wm82, bArr2, i2, i4, mj22);
        wm82.f(a2);
        mj22.d = a2;
        zl8.add(a2);
        while (D < i4) {
            mj2 mj23 = mj22;
            int i5 = i4;
            int u = u(bArr2, D, mj23);
            if (i != mj23.a) {
                break;
            }
            byte[] bArr3 = bArr2;
            wm8 wm83 = wm82;
            nl8 a3 = wm83.a();
            D = D(a3, wm83, bArr3, u, i5, mj23);
            nl8 nl8 = a3;
            wm82 = wm83;
            bArr2 = bArr3;
            i4 = i5;
            mj22 = mj23;
            wm82.f(nl8);
            mj22.d = nl8;
            zl8.add(nl8);
        }
        return D;
    }

    public static int I(int i, byte[] bArr, int i2, int i3, en8 en8, mj2 mj2) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                mj2 mj22 = mj2;
                int y = y(bArr, i2, mj22);
                en8.d(i, Long.valueOf(mj22.b));
                return y;
            } else if (i4 == 1) {
                en8.d(i, Long.valueOf(A(i2, bArr)));
                return i2 + 8;
            } else if (i4 == 2) {
                byte[] bArr2 = bArr;
                mj2 mj23 = mj2;
                int u = u(bArr2, i2, mj23);
                int i5 = mj23.a;
                if (i5 < 0) {
                    zz8.b("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                    return 0;
                } else if (i5 <= bArr2.length - u) {
                    if (i5 == 0) {
                        en8.d(i, vk8.x);
                    } else {
                        en8.d(i, vk8.p(bArr2, u, i5));
                    }
                    return u + i5;
                } else {
                    zz8.b("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    return 0;
                }
            } else if (i4 == 3) {
                int i6 = (i & -8) | 4;
                en8 a2 = en8.a();
                int i7 = mj2.c + 1;
                mj2.c = i7;
                if (i7 < 100) {
                    int i8 = 0;
                    while (true) {
                        if (i2 >= i3) {
                            break;
                        }
                        int u2 = u(bArr, i2, mj2);
                        int i9 = mj2.a;
                        if (i9 == i6) {
                            i8 = i9;
                            i2 = u2;
                            break;
                        }
                        i2 = I(i9, bArr, u2, i3, a2, mj2);
                        i8 = i9;
                    }
                    mj2 mj24 = mj2;
                    mj24.c--;
                    if (i2 > i3 || i8 != i6) {
                        zz8.b("Failed to parse the message.");
                        return 0;
                    }
                    en8.d(i, a2);
                    return i2;
                }
                zz8.b("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                return 0;
            } else if (i4 == 5) {
                en8.d(i, Integer.valueOf(z(i2, bArr)));
                return i2 + 4;
            } else {
                zz8.b("Protocol message contained an invalid tag (zero).");
                return 0;
            }
        } else {
            zz8.b("Protocol message contained an invalid tag (zero).");
            return 0;
        }
    }

    public static int J(int i, byte[] bArr, int i2, int i3, mj2 mj2) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return y(bArr, i2, mj2);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return u(bArr, i2, mj2) + mj2.a;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = u(bArr, i2, mj2);
                    i6 = mj2.a;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = J(i6, bArr, i2, i3, mj2);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                zz8.b("Failed to parse the message.");
                return 0;
            } else if (i4 == 5) {
                return i2 + 4;
            } else {
                zz8.b("Protocol message contained an invalid tag (zero).");
                return 0;
            }
        } else {
            zz8.b("Protocol message contained an invalid tag (zero).");
            return 0;
        }
    }

    public static final boolean a(qk5 qk5) {
        if (qk5.c() || qk5.h || !qk5.d) {
            return false;
        }
        return true;
    }

    public static final boolean b(qk5 qk5) {
        if (qk5.h || !qk5.d) {
            return false;
        }
        return true;
    }

    public static final boolean c(qk5 qk5) {
        if (qk5.c() || !qk5.h || qk5.d) {
            return false;
        }
        return true;
    }

    public static final boolean d(qk5 qk5) {
        if (!qk5.h || qk5.d) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, ow5] */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d8, code lost:
        if (r2 != defpackage.gv3.E) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00dc, code lost:
        if (r0.z != null) goto L_0x00df;
     */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00f4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f5  */
    public static v16 e(Class cls) {
        hv3 hv3;
        boolean z;
        rk4 rk4;
        ov3 ov3;
        gv3 gv3;
        cls.getClass();
        ? obj = new Object();
        obj.w = null;
        obj.x = null;
        boolean z2 = false;
        obj.y = 0;
        obj.z = null;
        obj.A = null;
        obj.B = null;
        obj.C = null;
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        declaredAnnotations.getClass();
        for (Annotation annotation : declaredAnnotations) {
            annotation.getClass();
            Class u = kl8.u(kl8.p(annotation));
            gq0 a2 = m06.a(u);
            if (a2.a().equals(nn3.a)) {
                ov3 = new ay4(3, obj);
            } else if (!ow5.D && obj.C == null && (gv3 = (gv3) ow5.E.get(a2)) != null) {
                obj.C = gv3;
                ov3 = new br4(6, (Object) obj);
            } else {
                ov3 = null;
            }
            if (ov3 != null) {
                ya5.p(ov3, annotation, u);
            }
        }
        rk4 rk42 = rk4.g;
        if (!(obj.C == null || obj.w == null)) {
            int[] iArr = obj.w;
            if ((obj.y & 8) != 0) {
                z = true;
            } else {
                z = false;
            }
            rk4 rk43 = new rk4(iArr, z);
            rk42.getClass();
            if (rk43.f) {
                rk4 = rk42;
            } else {
                rk4 = rk4.h;
            }
            int i = rk4.b;
            int i2 = rk42.b;
            if (i > i2 || (i >= i2 && rk4.c > rk42.c)) {
                rk42 = rk4;
            }
            int i3 = rk43.c;
            int i4 = rk43.b;
            if (!((i4 == 1 && i3 == 0) || i4 == 0)) {
                int i5 = rk42.b;
                if (i4 > i5 || (i4 >= i5 && i3 > rk42.c)) {
                    z2 = true;
                }
                z2 = !z2;
            }
            if (!z2) {
                obj.B = obj.z;
                obj.z = null;
            } else {
                gv3 gv32 = obj.C;
                if (gv32 != gv3.A) {
                    if (gv32 != gv3.B) {
                    }
                }
            }
            hv3 = new hv3(obj.C, rk43, obj.z, obj.B, obj.A, obj.x, obj.y);
            if (hv3 != null) {
                return null;
            }
            return new v16(cls, hv3);
        }
        hv3 = null;
        if (hv3 != null) {
        }
    }

    public static wv6 f() {
        return new wv6(0);
    }

    public static final String g(String str) {
        str.getClass();
        String replace = d57.S0(str, "/").replace('/', '-');
        replace.getClass();
        String replace2 = replace.replace('.', '-');
        replace2.getClass();
        return "sb-".concat(replace2);
    }

    public static final String h(wo7 wo7) {
        StringBuilder sb = new StringBuilder();
        sb.append("type: " + wo7);
        sb.append(10);
        sb.append("hashCode: " + wo7.hashCode());
        sb.append(10);
        sb.append("javaClass: " + wo7.getClass().getCanonicalName());
        sb.append(10);
        for (vj1 u = wo7.u(); u != null; u = u.r()) {
            sb.append("fqName: ".concat(ms1.c.o(u)));
            sb.append(10);
            sb.append("javaClass: " + u.getClass().getCanonicalName());
            sb.append(10);
        }
        return sb.toString();
    }

    public static final us1 i(pt5 pt5) {
        int i;
        if (pt5 == null) {
            i = -1;
        } else {
            i = xt5.b[pt5.ordinal()];
        }
        switch (i) {
            case 1:
                us1 us1 = vs1.d;
                us1.getClass();
                return us1;
            case 2:
                us1 us12 = vs1.a;
                us12.getClass();
                return us12;
            case 3:
                us1 us13 = vs1.b;
                us13.getClass();
                return us13;
            case 4:
                us1 us14 = vs1.c;
                us14.getClass();
                return us14;
            case 5:
                us1 us15 = vs1.e;
                us15.getClass();
                return us15;
            case 6:
                us1 us16 = vs1.f;
                us16.getClass();
                return us16;
            default:
                us1 us17 = vs1.a;
                us17.getClass();
                return us17;
        }
    }

    public static final Rect j(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        TextPaint textPaint2 = textPaint;
        CharSequence charSequence2 = charSequence;
        int i3 = i;
        int i4 = i2;
        if (charSequence2 instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence2;
            Class<MetricAffectingSpan> cls = MetricAffectingSpan.class;
            if (spanned.nextSpanTransition(i3 - 1, i4, cls) != i4) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint3 = new TextPaint();
                while (i3 < i4) {
                    int nextSpanTransition = spanned.nextSpanTransition(i3, i4, cls);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i3, nextSpanTransition, cls);
                    textPaint3.set(textPaint2);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint3);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        textPaint3.getTextBounds(charSequence2, i3, nextSpanTransition, rect2);
                    } else {
                        textPaint3.getTextBounds(charSequence2.toString(), i3, nextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i3 = nextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            textPaint2.getTextBounds(charSequence2, i3, i4, rect3);
            return rect3;
        }
        textPaint2.getTextBounds(charSequence2.toString(), i3, i4, rect3);
        return rect3;
    }

    public static final vw3 k(vw3 vw3) {
        vw3.getClass();
        if (vw3 instanceof kq7) {
            return ((kq7) vw3).l();
        }
        return null;
    }

    public static final x83 l() {
        x83 x83 = a;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("Rounded.ThumbDown", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
        int i = e38.a;
        ky6 ky6 = new ky6(jt0.b);
        be5 f = pb4.f(10.88f, 21.94f, 5.53f, -5.54f);
        f.e(0.37f, -0.37f, 0.58f, -0.88f, 0.58f, -1.41f);
        f.m(5.0f);
        f.e(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        f.f(6.0f);
        f.e(-0.8f, 0.0f, -1.52f, 0.48f, -1.83f, 1.21f);
        f.h(0.91f, 11.82f);
        f.d(0.06f, 13.8f, 1.51f, 16.0f, 3.66f, 16.0f);
        f.g(5.65f);
        f.i(-0.95f, 4.58f);
        f.e(-0.1f, 0.5f, 0.05f, 1.01f, 0.41f, 1.37f);
        f.e(0.59f, 0.58f, 1.53f, 0.58f, 2.11f, -0.01f);
        f.c();
        f.j(21.0f, 3.0f);
        f.e(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        f.n(8.0f);
        f.e(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        f.l(2.0f, -0.9f, 2.0f, -2.0f);
        f.m(5.0f);
        f.e(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        f.c();
        w83.a(w83, f.a, ky6, 14336);
        x83 b2 = w83.b();
        a = b2;
        return b2;
    }

    public static final du7 m(du7 du7, vw3 vw3) {
        du7.getClass();
        vw3.getClass();
        return t(du7, k(vw3));
    }

    public static final boolean n(qk5 qk5, long j, long j2) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (qk5.i == 1) {
            i = 1;
        } else {
            i = 0;
        }
        long j3 = qk5.c;
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float f = (float) i;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32)) * f;
        float f2 = ((float) ((int) (j >> 32))) + intBitsToFloat3;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f;
        float f3 = ((float) ((int) (j & 4294967295L))) + intBitsToFloat4;
        if (intBitsToFloat < (-intBitsToFloat3)) {
            z = true;
        } else {
            z = false;
        }
        if (intBitsToFloat > f2) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = z2 | z;
        if (intBitsToFloat2 < (-intBitsToFloat4)) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z6 = z5 | z3;
        if (intBitsToFloat2 > f3) {
            z4 = true;
        }
        return z6 | z4;
    }

    public static final int o(ks5 ks5) {
        int i;
        if (ks5 == null) {
            i = -1;
        } else {
            i = xt5.a[ks5.ordinal()];
        }
        if (i != 1) {
            int i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        return 1;
                    }
                }
            }
            return i2;
        }
        return 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009c  */
    public static ig p(String str) {
        int i;
        int i2;
        String str2;
        boolean u0 = k57.u0(str, "HTTP/1.", false);
        gu5 gu5 = gu5.HTTP_1_0;
        gu5 gu52 = gu5.HTTP_1_1;
        if (u0) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
            }
            i2 = i + 3;
            if (str.length() >= i2) {
                Integer v0 = k57.v0(str.substring(i, i2));
                if (v0 != null) {
                    int intValue = v0.intValue();
                    if (str.length() <= i2) {
                        str2 = "";
                    } else if (str.charAt(i2) == ' ') {
                        str2 = str.substring(i + 4);
                    } else {
                        throw new ProtocolException("Unexpected status line: ".concat(str));
                    }
                    return new ig(gu5, intValue, str2);
                }
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            throw new ProtocolException("Unexpected status line: ".concat(str));
        } else if (k57.u0(str, "ICY ", false)) {
            i = 4;
            i2 = i + 3;
            if (str.length() >= i2) {
            }
        } else if (k57.u0(str, "SOURCETABLE ", false)) {
            i = 12;
        } else {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        gu5 = gu52;
        i2 = i + 3;
        if (str.length() >= i2) {
        }
    }

    public static final long q(qk5 qk5, boolean z) {
        long d = l35.d(qk5.c, qk5.g);
        if (z || !qk5.c()) {
            return d;
        }
        return 0;
    }

    public static final ml4 r(ml4 ml4, float f) {
        if (f == 0.0f) {
            return ml4;
        }
        return mp7.Y(ml4, 0.0f, 0.0f, 0.0f, 0.0f, f, (pq6) null, false, 1048319);
    }

    public static final void s(fk6 fk6, int i, wg6 wg6) {
        fk6 fk62;
        eq4 eq4 = new eq4(new fk6[16]);
        List i2 = fk6.i(false, false);
        while (true) {
            eq4.d(eq4.y, i2);
            while (true) {
                int i3 = eq4.y;
                if (i3 != 0) {
                    fk62 = (fk6) eq4.l(i3 - 1);
                    boolean z = we.z(fk62);
                    ak6 ak6 = fk62.d;
                    tp4 tp4 = ak6.w;
                    if (!z && !tp4.c(jk6.j)) {
                        xz4 d = fk62.d();
                        if (d != null) {
                            se3 O = tf4.O(t49.v(d, true));
                            if (O.a < O.c && O.b < O.d) {
                                Object g = ak6.w.g(zj6.e);
                                vg6 vg6 = null;
                                if (g == null) {
                                    g = null;
                                }
                                gs2 gs2 = (gs2) g;
                                Object g2 = tp4.g(jk6.w);
                                if (g2 != null) {
                                    vg6 = g2;
                                }
                                vg6 vg62 = vg6;
                                if (gs2 == null || vg62 == null || ((Number) vg62.b.b()).floatValue() <= 0.0f) {
                                    i2 = fk62.i(false, false);
                                } else {
                                    int i4 = 1 + i;
                                    wg6.y(new xg6(fk62, i4, O, d));
                                    s(fk62, i4, wg6);
                                }
                            }
                        } else {
                            throw b81.t("Expected semantics node to have a coordinator.");
                        }
                    }
                } else {
                    return;
                }
            }
            i2 = fk62.i(false, false);
        }
    }

    public static final du7 t(du7 du7, vw3 vw3) {
        du7.getClass();
        if (du7 instanceof kq7) {
            return t(((kq7) du7).A(), vw3);
        }
        if (vw3 == null || vw3.equals(du7)) {
            return du7;
        }
        if (du7 instanceof fu6) {
            return new ju6((fu6) du7, vw3);
        }
        if (du7 instanceof zg2) {
            return new ch2((zg2) du7, vw3);
        }
        h.c();
        return null;
    }

    public static int u(byte[] bArr, int i, mj2 mj2) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 < 0) {
            return w(b2, bArr, i2, mj2);
        }
        mj2.a = b2;
        return i2;
    }

    public static bq8 v(Object obj) {
        if (obj == null) {
            return bq8.p;
        }
        if (obj instanceof String) {
            return new mq8((String) obj);
        }
        if (obj instanceof Double) {
            return new wn8((Double) obj);
        }
        if (obj instanceof Long) {
            return new wn8(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new wn8(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new km8((Boolean) obj);
        }
        if (obj instanceof Map) {
            vp8 vp8 = new vp8();
            Map map = (Map) obj;
            for (Object next : map.keySet()) {
                bq8 v = v(map.get(next));
                if (next != null) {
                    if (!(next instanceof String)) {
                        next = next.toString();
                    }
                    vp8.o((String) next, v);
                }
            }
            return vp8;
        } else if (obj instanceof List) {
            rl8 rl8 = new rl8();
            for (Object v2 : (List) obj) {
                rl8.A(rl8.y(), v(v2));
            }
            return rl8;
        } else {
            h.q("Invalid value type");
            return null;
        }
    }

    public static int w(int i, byte[] bArr, int i2, mj2 mj2) {
        byte b2 = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b2 >= 0) {
            mj2.a = i4 | (b2 << 7);
            return i3;
        }
        int i5 = i4 | ((b2 & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b3 = bArr[i3];
        if (b3 >= 0) {
            mj2.a = i5 | (b3 << 14);
            return i6;
        }
        int i7 = i5 | ((b3 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            mj2.a = i7 | (b4 << 21);
            return i8;
        }
        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            mj2.a = i9 | (b5 << 28);
            return i10;
        }
        int i11 = i9 | ((b5 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                mj2.a = i11;
                return i12;
            }
        }
    }

    public static bq8 x(x29 x29) {
        if (x29 == null) {
            return bq8.o;
        }
        int B = x29.B() - 1;
        if (B != 1) {
            if (B != 2) {
                if (B != 3) {
                    if (B == 4) {
                        List<x29> t = x29.t();
                        ArrayList arrayList = new ArrayList();
                        for (x29 x : t) {
                            arrayList.add(x(x));
                        }
                        return new gq8(x29.u(), arrayList);
                    }
                    h.q("Unknown type found. Cannot convert entity");
                    return null;
                } else if (x29.x()) {
                    return new km8(Boolean.valueOf(x29.y()));
                } else {
                    return new km8((Boolean) null);
                }
            } else if (x29.z()) {
                return new wn8(Double.valueOf(x29.A()));
            } else {
                return new wn8((Double) null);
            }
        } else if (x29.v()) {
            return new mq8(x29.w());
        } else {
            return bq8.v;
        }
    }

    public static int y(byte[] bArr, int i, mj2 mj2) {
        long j = (long) bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            mj2.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | (((long) (b2 & Byte.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            byte b3 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b3 & Byte.MAX_VALUE)) << i4;
            int i6 = i5;
            b2 = b3;
            i3 = i6;
        }
        mj2.b = j2;
        return i3;
    }

    public static int z(int i, byte[] bArr) {
        int i2 = (bArr[i + 1] & 255) << 8;
        return ((bArr[i + 3] & 255) << 24) | i2 | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16);
    }
}
