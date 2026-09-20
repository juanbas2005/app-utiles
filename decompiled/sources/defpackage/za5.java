package defpackage;

import android.graphics.Paint;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.View;
import android.widget.TextView;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: za5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class za5 {
    public static boolean a = true;
    public static Field b;
    public static boolean c;

    public static void A(TextView textView, int i) {
        int i2;
        k75.h(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.bottom;
        } else {
            i2 = fontMetricsInt.descent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void B(TextView textView, int i) {
        k75.h(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing((float) (i - fontMetricsInt), 1.0f);
        }
    }

    public static ActionMode.Callback D(ActionMode.Callback callback) {
        if (!(callback instanceof yg7) || Build.VERSION.SDK_INT < 26) {
            return callback;
        }
        return ((yg7) callback).a;
    }

    public static ActionMode.Callback E(ActionMode.Callback callback, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26 || i > 27 || (callback instanceof yg7) || callback == null) {
            return callback;
        }
        return new yg7(callback, textView);
    }

    public static final g82 F(int i) {
        if (i != 0) {
            try {
                ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(Integer.MAX_VALUE));
                unconfigurableScheduledExecutorService.getClass();
                return new g82(unconfigurableScheduledExecutorService);
            } catch (IllegalArgumentException e) {
                if (i == 3) {
                    ScheduledExecutorService unconfigurableScheduledExecutorService2 = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(Integer.MAX_VALUE));
                    unconfigurableScheduledExecutorService2.getClass();
                    return new g82(unconfigurableScheduledExecutorService2);
                }
                throw e;
            }
        } else {
            throw null;
        }
    }

    public static final void a(ml4 ml4, fw0 fw0, yt2 yt2, int i) {
        int i2;
        boolean z;
        yt2.g0(-1854833411);
        if (yt2.g(ml4)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i3 & 1, z)) {
            Object Q = yt2.Q();
            if (Q == ay0.a) {
                Q = pf.k;
                yt2.o0(Q);
            }
            lh4 lh4 = (lh4) Q;
            int hashCode = Long.hashCode(yt2.T);
            vf5 m = yt2.m();
            ml4 E = gw8.E(yt2, ml4);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt2.i0();
            if (yt2.S) {
                yt2.l(vy0);
            } else {
                yt2.r0();
            }
            g75.Q(tx0.f, yt2, lh4);
            g75.Q(tx0.e, yt2, m);
            g75.Q(tx0.g, yt2, Integer.valueOf(hashCode));
            g75.O(yt2, tx0.h);
            g75.Q(tx0.d, yt2, E);
            f21.r(6, fw0, yt2, true);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new ya(ml4, fw0, i, 2);
        }
    }

    public static final void b(int i, ml4 ml4, long j, long j2, fw0 fw0, gs2 gs2, fw0 fw02, yt2 yt2, int i2, int i3) {
        int i4;
        boolean z;
        gs2 gs22;
        ml4 ml42;
        fw0 fw03;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        yt2 yt22 = yt2;
        int i11 = i2;
        yt22.g0(1445190381);
        if ((i11 & 6) == 0) {
            if (yt22.e(i)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i4 = i10 | i11;
        } else {
            i4 = i11;
        }
        int i12 = i3 & 2;
        if (i12 != 0) {
            i4 |= 48;
        } else if ((i11 & 48) == 0) {
            if (yt22.g(ml4)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i4 |= i9;
        }
        if ((i11 & 384) == 0) {
            if (yt22.f(j)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i4 |= i8;
        }
        long j3 = j2;
        if ((i11 & 3072) == 0) {
            if (yt22.f(j3)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i4 |= i7;
        }
        fw0 fw04 = fw0;
        if ((i11 & 24576) == 0) {
            if (yt22.i(fw04)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i4 |= i6;
        }
        int i13 = i4 | 196608;
        fw0 fw05 = fw02;
        if ((1572864 & i11) == 0) {
            if (yt22.i(fw05)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i13 |= i5;
        }
        if ((599187 & i13) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i13 & 1, z)) {
            yt22.a0();
            if ((i11 & 1) == 0 || yt22.C()) {
                if (i12 != 0) {
                    ml4 = jl4.w;
                }
                fw03 = su0.d;
            } else {
                yt22.Y();
                fw03 = gs2;
            }
            yt22.s();
            fw0 fw06 = fw04;
            fw0 fw07 = fw05;
            int i14 = (i13 >> 3) & 524286;
            ml4 ml43 = ml4;
            c(ml43, j, j2, fw06, fw03, fw07, yt22, i14);
            ml42 = ml43;
            gs22 = fw03;
        } else {
            yt2.Y();
            ml42 = ml4;
            gs22 = gs2;
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new za7(i, ml42, j, j2, fw0, gs22, fw02, i11, i3);
        }
    }

    public static final void c(ml4 ml4, long j, long j2, fw0 fw0, gs2 gs2, fw0 fw02, yt2 yt2, int i) {
        int i2;
        ml4 ml42;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        fw0 fw03 = fw0;
        gs2 gs22 = gs2;
        fw0 fw04 = fw02;
        yt2 yt22 = yt2;
        int i9 = i;
        yt22.g0(148841506);
        if ((i9 & 6) == 0) {
            ml42 = ml4;
            if (yt22.g(ml42)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i9;
        } else {
            ml42 = ml4;
            i2 = i9;
        }
        long j3 = j;
        if ((i9 & 48) == 0) {
            if (yt22.f(j3)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        long j4 = j2;
        if ((i9 & 384) == 0) {
            if (yt22.f(j4)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i2 |= i6;
        }
        if ((i9 & 3072) == 0) {
            if (yt22.i(fw03)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        if ((i9 & 24576) == 0) {
            if (yt22.i(gs22)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((196608 & i9) == 0) {
            if (yt22.i(fw04)) {
                i3 = 131072;
            } else {
                i3 = 65536;
            }
            i2 |= i3;
        }
        if ((74899 & i2) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i2 & 1, z)) {
            int i10 = i2 << 3;
            s87.a(j45.o(ml42), (pq6) null, j3, j4, 0.0f, 0.0f, su0.J(-1815327065, new ab7(fw04, gs22, fw03, 0), yt22), yt22, (i10 & 896) | 12582912 | (i10 & 7168), 114);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new nv4(ml42, j, j2, fw03, gs22, fw04, i9);
        }
    }

    public static final gq0 d(String str) {
        up2 up2 = j27.a;
        return new gq0(j27.h, uq4.e(str));
    }

    public static final gq0 e(String str) {
        up2 up2 = j27.a;
        return new gq0(j27.a, uq4.e(str));
    }

    public static final gq0 f(String str) {
        up2 up2 = j27.a;
        return new gq0(j27.c, uq4.e(str));
    }

    public static final void g(LinkedHashMap linkedHashMap) {
        Iterable<Map.Entry> entrySet = linkedHashMap.entrySet();
        int F = tf4.F(et0.e0(entrySet, 10));
        if (F < 16) {
            F = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(F);
        for (Map.Entry entry : entrySet) {
            linkedHashMap2.put(entry.getValue(), entry.getKey());
        }
    }

    public static final gq0 h(uq4 uq4) {
        up2 up2 = j27.a;
        gq0 gq0 = j27.l;
        return new gq0(gq0.a, uq4.e(uq4.c().concat(gq0.f().c())));
    }

    public static final gq0 i(String str) {
        up2 up2 = j27.a;
        return new gq0(j27.b, uq4.e(str));
    }

    public static final gq0 j(gq0 gq0) {
        up2 up2 = j27.a;
        return new gq0(j27.a, uq4.e("U".concat(gq0.f().c())));
    }

    public static final long k(long j) {
        tt0 f = jt0.f(j);
        if (!dh4.m(f.b, 12884901888L)) {
            xb3.a("The specified color must be encoded in an RGB color space. The supplied color space is ".concat(dh4.H(f.b)));
        }
        p76 p76 = ((t76) f).p;
        double b2 = p76.b((double) jt0.h(j));
        float b3 = (float) ((p76.b((double) jt0.e(j)) * 0.0722d) + (p76.b((double) jt0.g(j)) * 0.7152d) + (b2 * 0.2126d));
        if (b3 < 0.0f) {
            b3 = 0.0f;
        }
        if (b3 > 1.0f) {
            b3 = 1.0f;
        }
        if (b3 >= 0.12f) {
            return j;
        }
        return uq3.b(b3, b3, b3, jt0.d(j), vt0.e);
    }

    public static final Object l(Object obj, boolean z) {
        zo3 zo3;
        obj.getClass();
        if (z) {
            obj = (wp3) obj;
            if ((obj instanceof vp3) && (zo3 = ((vp3) obj).i) != null) {
                up2 up2 = zo3.z;
                if (up2 != null) {
                    String replace = up2.a.a.replace('.', '/');
                    if (replace != null) {
                        return new up3(replace);
                    }
                    co3.a(7);
                    throw null;
                }
                zo3.a(15);
                throw null;
            }
        }
        return obj;
    }

    public static final void m(zy2 zy2, String str, String str2) {
        str.getClass();
        str2.getClass();
        ArrayList arrayList = zy2.w;
        arrayList.add(str);
        arrayList.add(d57.k1(str2).toString());
    }

    public static final void n(hz1 hz1, long j, float f, float f2) {
        float f3 = f / 2.0f;
        hz1 hz12 = hz1;
        long j2 = j;
        hz1.k0(hz12, j2, f3, (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (hz1.e() >> 32)) - f3) - f2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (hz1.e() & 4294967295L)) / 2.0f)) & 4294967295L), (iz1) null, 120);
    }

    public static final n06 o(Annotation[] annotationArr, up2 up2) {
        Annotation annotation;
        annotationArr.getClass();
        up2.getClass();
        int length = annotationArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i];
            if (sg3.e(m06.a(kl8.u(kl8.p(annotation))).a(), up2)) {
                break;
            }
            i++;
        }
        if (annotation != null) {
            return new n06(annotation);
        }
        return null;
    }

    public static final ArrayList p(Annotation[] annotationArr) {
        annotationArr.getClass();
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation n06 : annotationArr) {
            arrayList.add(new n06(n06));
        }
        return arrayList;
    }

    public static final int q(db5 db5) {
        long i;
        if (db5.e == z75.w) {
            i = db5.i() & 4294967295L;
        } else {
            i = db5.i() >> 32;
        }
        return (int) i;
    }

    public static tm5 r(gq gqVar) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new tm5(bn.p(gqVar));
        }
        TextPaint textPaint = new TextPaint(gqVar.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = gqVar.getBreakStrategy();
        int hyphenationFrequency = gqVar.getHyphenationFrequency();
        if (gqVar.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            boolean z = true;
            if (i < 28 || (gqVar.getInputType() & 15) != 3) {
                if (gqVar.getLayoutDirection() != 1) {
                    z = false;
                }
                switch (gqVar.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(bn.d(DecimalFormatSymbols.getInstance(gqVar.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new tm5(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static int t(Set set) {
        int i;
        int i2 = 0;
        for (Object next : set) {
            if (next != null) {
                i = next.hashCode();
            } else {
                i = 0;
            }
            i2 = ~(~(i2 + i));
        }
        return i2;
    }

    public static final void u(String str) {
        str.getClass();
        if (str.length() > 0) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if ('!' > charAt || charAt >= 127) {
                    StringBuilder sb = new StringBuilder("Unexpected char 0x");
                    rd3.i(16);
                    String num = Integer.toString(charAt, 16);
                    num.getClass();
                    if (num.length() < 2) {
                        num = "0".concat(num);
                    }
                    sb.append(num);
                    sb.append(" at ");
                    sb.append(i);
                    sb.append(" in header name: ");
                    sb.append(str);
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            }
            return;
        }
        h.q("name is empty");
    }

    public static final void v(String str, String str2) {
        String str3;
        str.getClass();
        str2.getClass();
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt == 9 || (' ' <= charAt && charAt < 127)) {
                i++;
            } else {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                rd3.i(16);
                String num = Integer.toString(charAt, 16);
                num.getClass();
                if (num.length() < 2) {
                    num = "0".concat(num);
                }
                sb.append(num);
                sb.append(" at ");
                sb.append(i);
                sb.append(" in ");
                sb.append(str2);
                sb.append(" value");
                if (dg8.k(str2)) {
                    str3 = "";
                } else {
                    str3 = ": ".concat(str);
                }
                sb.append(str3);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static boolean w() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    public static HashSet x(int i) {
        int i2;
        if (i < 3) {
            ie1.z(i, "expectedSize");
            i2 = i + 1;
        } else if (i < 1073741824) {
            i2 = (int) ((((float) i) / 0.75f) + 1.0f);
        } else {
            i2 = Integer.MAX_VALUE;
        }
        return new HashSet(i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0069 A[LOOP:0: B:1:0x0008->B:22:0x0069, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006c A[EDGE_INSN: B:37:0x006c->B:23:0x006c ?: BREAK  , SYNTHETIC] */
    public static final eg6 y(ts2 ts2, List list, List list2, List list3) {
        eg6 eg6;
        cu4 cu4;
        Object obj;
        int size = list2.size();
        int i = 0;
        eg6 eg62 = null;
        int i2 = 0;
        while (i2 < size) {
            el8 el8 = (el8) list2.get(i2);
            el8.getClass();
            list.getClass();
            if (el8.a.a >= 600 && (cu4 = (cu4) dt0.H0(list)) != null) {
                if (true != cu4.c.containsKey("ListDetailScene-Detail")) {
                    cu4 = null;
                }
                if (cu4 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            obj = null;
                            break;
                        }
                        obj = listIterator.previous();
                        if (((cu4) obj).c.containsKey("ListDetailScene-List")) {
                            break;
                        }
                    }
                    cu4 cu42 = (cu4) obj;
                    if (cu42 != null) {
                        eg62 = new uj8(cu42.b, dt0.t0(1, list), cu42, cu4);
                        if (eg62 == null) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            eg62 = null;
            if (eg62 == null) {
            }
        }
        if (eg62 == null) {
            eg62 = new mu6(((cu4) dt0.G0(list)).b, (cu4) dt0.G0(list), dt0.t0(1, list));
        }
        int size2 = list3.size();
        while (i < size2) {
            if (list3.get(i) == null) {
                if (eg62 instanceof e95) {
                    eg6 = (e95) eg62;
                } else {
                    eg6 = null;
                }
                eg62.getClass();
                i++;
            } else {
                ku4.a();
                return null;
            }
        }
        return eg62;
    }

    public static void z(TextView textView, int i) {
        int i2;
        k75.h(i);
        if (Build.VERSION.SDK_INT >= 28) {
            bn.s(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.top;
        } else {
            i2 = fontMetricsInt.ascent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public void C(View view, float f) {
        if (a) {
            try {
                p68.b(view, f);
                return;
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
        view.setAlpha(f);
    }

    public float s(View view) {
        if (a) {
            try {
                return p68.a(view);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
        return view.getAlpha();
    }
}
