package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.os.Build;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import java.lang.annotation.Annotation;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.DispatchException;

/* renamed from: kl8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class kl8 {
    public static final vq6 a = vq6.y;
    public static final float b = 8.0f;
    public static final float c = 1.0f;
    public static final fw0 d = new fw0(-39202156, new xw0(1), false);
    public static final fw0 e = new fw0(1582488484, new xw0(2), false);
    public static final fw0 f = new fw0(414328099, new xw0(3), false);
    public static final fw0 g = new fw0(-1514016380, new xw0(4), false);
    public static final t88 h = new t88(0.31006f, 0.31616f);
    public static final t88 i = new t88(0.34567f, 0.3585f);
    public static final t88 j = new t88(0.32168f, 0.33767f);
    public static final t88 k = new t88(0.31271f, 0.32902f);
    public static final float[] l = {0.964212f, 1.0f, 0.825188f};
    public static final cr7 m = cr7.B;
    public static final rt0 n;
    public static final rt0 o;
    public static final float p = 20.0f;
    public static final rt0 q = rt0.H;
    public static final float r = 40.0f;
    public static final rt0 s = rt0.E;
    public static x83 t;
    public static x83 u;
    public static x83 v;
    public static x83 w;
    public static x83 x;

    static {
        rt0 rt0 = rt0.D;
        n = rt0;
        o = rt0;
    }

    public static final boolean A(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT < 26 || config != Bitmap.Config.HARDWARE) {
            return false;
        }
        return true;
    }

    public static boolean B(String str, String str2) {
        if (!str.startsWith(str2.concat("(")) || !str.endsWith(")")) {
            return false;
        }
        return true;
    }

    public static int C(int i2) {
        boolean z;
        RoundingMode roundingMode = RoundingMode.UNNECESSARY;
        if (i2 > 0) {
            boolean z2 = true;
            switch (le3.a[roundingMode.ordinal()]) {
                case 1:
                    if (i2 > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (((i2 - 1) & i2) != 0) {
                        z2 = false;
                    }
                    if (!z || !z2) {
                        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                    }
                    break;
                case 2:
                case 3:
                    break;
                case 4:
                case 5:
                    return 32 - Integer.numberOfLeadingZeros(i2 - 1);
                case 6:
                case 7:
                case 8:
                    int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i2);
                    return (31 - numberOfLeadingZeros) + ((~(~((-1257966797 >>> numberOfLeadingZeros) - i2))) >>> 31);
                default:
                    throw new AssertionError();
            }
            return 31 - Integer.numberOfLeadingZeros(i2);
        }
        StringBuilder sb = new StringBuilder(27);
        sb.append("x (");
        sb.append(i2);
        sb.append(") must be > 0");
        throw new IllegalArgumentException(sb.toString());
    }

    public static long D(int i2, String str) {
        int j2 = j(str, 0, i2, false);
        Matcher matcher = q61.n.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        while (j2 < i2) {
            int j3 = j(str, j2 + 1, i2, true);
            matcher.region(j2, j3);
            if (i4 == -1 && matcher.usePattern(q61.n).matches()) {
                String group = matcher.group(1);
                group.getClass();
                i4 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                group2.getClass();
                i7 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                group3.getClass();
                i8 = Integer.parseInt(group3);
            } else if (i5 != -1 || !matcher.usePattern(q61.m).matches()) {
                if (i6 == -1) {
                    Pattern pattern = q61.l;
                    if (matcher.usePattern(pattern).matches()) {
                        String group4 = matcher.group(1);
                        group4.getClass();
                        Locale locale = Locale.US;
                        locale.getClass();
                        String lowerCase = group4.toLowerCase(locale);
                        lowerCase.getClass();
                        String pattern2 = pattern.pattern();
                        pattern2.getClass();
                        i6 = d57.G0(pattern2, lowerCase, 0, false, 6) / 4;
                    }
                }
                if (i3 == -1 && matcher.usePattern(q61.k).matches()) {
                    String group5 = matcher.group(1);
                    group5.getClass();
                    i3 = Integer.parseInt(group5);
                }
            } else {
                String group6 = matcher.group(1);
                group6.getClass();
                i5 = Integer.parseInt(group6);
            }
            j2 = j(str, j3 + 1, i2, false);
        }
        if (70 <= i3 && i3 < 100) {
            i3 += 1900;
        }
        if (i3 >= 0 && i3 < 70) {
            i3 += 2000;
        }
        if (i3 < 1601) {
            h.q("Failed requirement.");
            return 0;
        } else if (i6 == -1) {
            h.q("Failed requirement.");
            return 0;
        } else if (1 > i5 || i5 >= 32) {
            h.q("Failed requirement.");
            return 0;
        } else if (i4 < 0 || i4 >= 24) {
            h.q("Failed requirement.");
            return 0;
        } else if (i7 < 0 || i7 >= 60) {
            h.q("Failed requirement.");
            return 0;
        } else if (i8 < 0 || i8 >= 60) {
            h.q("Failed requirement.");
            return 0;
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(fg8.a);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i3);
            gregorianCalendar.set(2, i6 - 1);
            gregorianCalendar.set(5, i5);
            gregorianCalendar.set(11, i4);
            gregorianCalendar.set(12, i7);
            gregorianCalendar.set(13, i8);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
    }

    public static final wt2 E(yt2 yt2) {
        cu2 cu2;
        yt2 yt22;
        yt2.b0(206, ey0.e);
        if (yt2.S) {
            jv6.z(yt2.I);
        }
        Object I = yt2.I();
        if (I instanceof cu2) {
            cu2 = (cu2) I;
        } else {
            cu2 = null;
        }
        if (cu2 == null) {
            yt22 = yt2;
            cu2 = new cu2(new vt2(new wt2(yt22, yt2.T, yt2.q, yt2.C, yt2.h.P)), -1);
            yt22.p0(cu2);
        } else {
            yt22 = yt2;
        }
        v36 v36 = cu2.a;
        v36.getClass();
        wt2 wt2 = ((vt2) v36).w;
        wt2.f.setValue(yt22.m());
        yt22.r(false);
        return wt2;
    }

    public static int F(Context context, int i2, int i3) {
        TypedValue I = gw8.I(context, i2);
        if (I == null || I.type != 16) {
            return i3;
        }
        return I.data;
    }

    public static TimeInterpolator G(Context context, int i2, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            if (!B(valueOf, "cubic-bezier") && !B(valueOf, "path")) {
                return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
            }
            if (B(valueOf, "cubic-bezier")) {
                String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
                if (split.length == 4) {
                    return new PathInterpolator(x(0, split), x(1, split), x(2, split), x(3, split));
                }
                int length = split.length;
                throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + length);
            } else if (B(valueOf, "path")) {
                String substring = valueOf.substring(5, valueOf.length() - 1);
                Path path = new Path();
                try {
                    xe5.b(l55.i(substring), path);
                    return new PathInterpolator(path);
                } catch (RuntimeException e2) {
                    ku4.o("Error in parsing ".concat(substring), e2);
                    return null;
                }
            } else {
                h.q("Invalid motion easing type: ".concat(valueOf));
                return null;
            }
        } else {
            h.q("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
            return null;
        }
    }

    public static final fu6 H(ro7 ro7, ql4 ql4, List list) {
        ro7.getClass();
        ql4.getClass();
        list.getClass();
        wo7 n2 = ql4.n();
        n2.getClass();
        return I(ro7, n2, list, false);
    }

    public static fu6 I(ro7 ro7, wo7 wo7, List list, boolean z) {
        ji4 ji4;
        ji4 l2;
        ji4 G;
        ro7.getClass();
        wo7.getClass();
        list.getClass();
        if (!ro7.isEmpty() || !list.isEmpty() || z || wo7.u() == null) {
            vq0 u2 = wo7.u();
            if (u2 instanceof qp7) {
                l2 = ((qp7) u2).g0().R();
            } else {
                ql4 ql4 = null;
                if (u2 instanceof ql4) {
                    int i2 = ts1.a;
                    sl4 c2 = rs1.c(u2);
                    c2.getClass();
                    ts1.h(c2);
                    ax3 ax3 = ax3.p;
                    if (list.isEmpty()) {
                        ql4 ql42 = (ql4) u2;
                        if (ql42 instanceof ql4) {
                            ql4 = ql42;
                        }
                        if (ql4 == null || (G = ql4.o0(ax3)) == null) {
                            l2 = ql42.n0();
                            l2.getClass();
                        }
                    } else {
                        ql4 ql43 = (ql4) u2;
                        bq7 f2 = yo7.b.f(wo7, list);
                        if (ql43 instanceof ql4) {
                            ql4 = ql43;
                        }
                        if (ql4 == null || (G = ql4.G(f2, ax3)) == null) {
                            l2 = ql43.A(f2);
                            l2.getClass();
                        }
                    }
                    ji4 = G;
                    return K(ro7, wo7, list, z, ji4, new yw3(ro7, wo7, list, z));
                } else if (u2 instanceof ut1) {
                    String str = ((ut1) u2).getName().w;
                    str.getClass();
                    l2 = z62.a(u62.SCOPE_FOR_ABBREVIATION_TYPE, true, str);
                } else if (wo7 instanceof gg3) {
                    l2 = i95.l("member scope for intersection type", ((gg3) wo7).x);
                } else {
                    ku4.l("Unsupported classifier: ", u2, " for constructor: ", wo7);
                    return null;
                }
            }
            ji4 = l2;
            return K(ro7, wo7, list, z, ji4, new yw3(ro7, wo7, list, z));
        }
        vq0 u3 = wo7.u();
        u3.getClass();
        fu6 g0 = u3.g0();
        g0.getClass();
        return g0;
    }

    public static final fu6 J(ji4 ji4, ro7 ro7, wo7 wo7, List list, boolean z) {
        ro7.getClass();
        wo7.getClass();
        list.getClass();
        ji4.getClass();
        ji4 ji42 = ji4;
        ro7 ro72 = ro7;
        wo7 wo72 = wo7;
        List list2 = list;
        boolean z2 = z;
        List list3 = list2;
        yw3 yw3 = new yw3(ji42, ro72, wo72, list2, z2);
        wo7 wo73 = wo72;
        ji4 ji43 = ji42;
        List list4 = list3;
        ro7 ro73 = ro72;
        gu6 gu6 = new gu6(wo73, list4, z2, ji43, yw3);
        if (ro73.isEmpty()) {
            return gu6;
        }
        return new iu6(gu6, ro73);
    }

    public static final fu6 K(ro7 ro7, wo7 wo7, List list, boolean z, ji4 ji4, vr2 vr2) {
        ro7.getClass();
        wo7.getClass();
        list.getClass();
        ji4.getClass();
        gu6 gu6 = new gu6(wo7, list, z, ji4, vr2);
        if (ro7.isEmpty()) {
            return gu6;
        }
        return new iu6(gu6, ro7);
    }

    public static hx6 L() {
        return new hx6(0);
    }

    public static x17 M(float f2, float f3, Object obj, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 1.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 1500.0f;
        }
        if ((i2 & 4) != 0) {
            obj = null;
        }
        return new x17(f2, f3, obj);
    }

    public static final xw5 N(di2 di2, Object obj, o81 o81) {
        o81.getClass();
        return gr8.W(di2, o81, new x27(5000, Long.MAX_VALUE), obj);
    }

    public static jo7 O(int i2, int i3, i12 i12) {
        int i4;
        if ((i3 & 1) != 0) {
            i2 = 300;
        }
        if ((i3 & 2) != 0) {
            i4 = 0;
        } else {
            i4 = 90;
        }
        if ((i3 & 4) != 0) {
            i12 = j12.a;
        }
        return new jo7(i2, i4, i12);
    }

    public static final int P(m34 m34) {
        List list = m34.k;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((n34) list.get(i3)).m;
        }
        return (i2 / list.size()) + m34.q;
    }

    public static gl8 Q() {
        ClassLoader classLoader = kl8.class.getClassLoader();
        Class<gl8> cls = gl8.class;
        if (cls.equals(cls)) {
            try {
                if (Class.forName("com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader", true, classLoader).getConstructor((Class[]) null).newInstance((Object[]) null) == null) {
                    throw null;
                }
                throw new ClassCastException();
            } catch (ReflectiveOperationException e2) {
                throw new IllegalStateException(e2);
            } catch (ClassNotFoundException unused) {
            }
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (Object obj : Arrays.asList(new kl8[0])) {
                try {
                    if (obj == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ServiceConfigurationError e3) {
                    Logger.getLogger(fl8.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(cls.getSimpleName()), e3);
                }
            }
            if (arrayList.size() == 1) {
                return (gl8) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (gl8) cls.getMethod("combine", new Class[]{Collection.class}).invoke((Object) null, new Object[]{arrayList});
            } catch (ReflectiveOperationException e4) {
                throw new IllegalStateException(e4);
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    public static final void a(boolean z, vr2 vr2, ml4 ml4, boolean z2, so0 so0, yt2 yt2, int i2, int i3) {
        int i4;
        int i5;
        so0 so02;
        int i6;
        boolean z3;
        so0 so03;
        boolean z4;
        ml4 ml42;
        yx5 v2;
        so0 so04;
        jl4 jl4;
        boolean z5;
        int i7;
        boolean z6;
        ij7 ij7;
        sr2 sr2;
        boolean z7;
        int i8;
        boolean z8 = z;
        vr2 vr22 = vr2;
        yt2 yt22 = yt2;
        yt22.g0(-1406741137);
        if (yt22.h(z8)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i9 = i2 | i4;
        if ((i2 & 48) == 0) {
            if (yt22.i(vr22)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i9 |= i8;
        }
        int i10 = i9 | 3456;
        if ((i3 & 16) == 0) {
            so02 = so0;
            if (yt22.g(so02)) {
                i5 = 16384;
                i6 = i10 | i5 | 196608;
                if ((74899 & i6) == 74898) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!yt22.V(i6 & 1, z3)) {
                    yt22.a0();
                    if ((i2 & 1) == 0 || yt22.C()) {
                        if ((i3 & 16) != 0) {
                            so02 = hj8.u(((zg4) yt22.k(ch4.b)).a);
                            i6 &= -57345;
                        }
                        jl4 = jl4.w;
                        z5 = true;
                        so04 = so02;
                        i7 = i6;
                        z6 = true;
                    } else {
                        yt22.Y();
                        if ((i3 & 16) != 0) {
                            i6 &= -57345;
                        }
                        jl4 = ml4;
                        z5 = true;
                        so04 = so02;
                        i7 = i6;
                        z6 = z2;
                    }
                    yt22.s();
                    float floor = (float) Math.floor((double) ((tp1) yt22.k(xy0.h)).e0(2.0f));
                    if (z8) {
                        ij7 = ij7.w;
                    } else {
                        ij7 = ij7.x;
                    }
                    if (vr22 != null) {
                        yt22.e0(2066141046);
                        if ((i7 & 112) == 32) {
                            z7 = z5;
                        } else {
                            z7 = false;
                        }
                        if ((i7 & 14) != 4) {
                            z5 = false;
                        }
                        boolean z9 = z7 | z5;
                        Object Q = yt22.Q();
                        if (z9 || Q == ay0.a) {
                            Q = new to0(0, vr22, z8);
                            yt22.o0(Q);
                        }
                        sr2 = (sr2) Q;
                        yt22.r(false);
                    } else {
                        yt22.e0(2066206735);
                        yt22.r(false);
                        sr2 = null;
                    }
                    boolean z10 = z6;
                    d(ij7, sr2, new l57(floor, 0.0f, 2, 0, 26), new l57(floor, 0.0f, 0, 0, 30), jl4, z10, so04, yt22, ((i7 << 6) & 3670016) | 12808704);
                    ml42 = jl4;
                    z4 = z10;
                    so03 = so04;
                } else {
                    yt2.Y();
                    ml42 = ml4;
                    so03 = so02;
                    z4 = z2;
                }
                v2 = yt2.v();
                if (v2 == null) {
                    v2.d = new uo0(z8, vr22, ml42, z4, so03, i2, i3, 0);
                    return;
                }
                return;
            }
        } else {
            so02 = so0;
        }
        i5 = 8192;
        i6 = i10 | i5 | 196608;
        if ((74899 & i6) == 74898) {
        }
        if (!yt22.V(i6 & 1, z3)) {
        }
        v2 = yt2.v();
        if (v2 == null) {
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0184 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0255 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0332  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x034c  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x036d  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0383  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x039b  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x03b6  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x03d8  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x041d  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x041f  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0443  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0446  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0162  */
    public static final void b(boolean z, ij7 ij7, ml4 ml4, so0 so0, l57 l57, l57 l572, yt2 yt2, int i2) {
        int i3;
        boolean z2;
        yt2 yt22;
        Object obj;
        float f2;
        Object Q;
        int ordinal;
        float f3;
        boolean g2;
        a37 a37;
        gm7 gm7;
        Object b2;
        ij7 ij72;
        je2 je2;
        mm7 mm7;
        yt2 yt23;
        Object obj2;
        int ordinal2;
        float f4;
        boolean g3;
        int i4;
        a37 a372;
        int ordinal3;
        hx6 hx6;
        Object Q2;
        long j2;
        long j3;
        a37 a373;
        long j4;
        oo0 oo0;
        a37 a374;
        boolean z3;
        boolean z4;
        boolean z5;
        Object Q3;
        int i5;
        hx6 hx62;
        vr2 vr2;
        vr2 vr22;
        boolean z6;
        int i6;
        boolean z7;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z8 = z;
        ij7 ij73 = ij7;
        ml4 ml42 = ml4;
        so0 so02 = so0;
        l57 l573 = l57;
        l57 l574 = l572;
        yt2 yt24 = yt2;
        int i12 = i2;
        yt24.g0(-891330208);
        if ((i12 & 6) == 0) {
            if (yt24.h(z8)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i3 = i11 | i12;
        } else {
            i3 = i12;
        }
        if ((i12 & 48) == 0) {
            if (yt24.e(ij73.ordinal())) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i3 |= i10;
        }
        if ((i12 & 384) == 0) {
            if (yt24.g(ml42)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i3 |= i9;
        }
        if ((i12 & 3072) == 0) {
            if (yt24.g(so02)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i3 |= i8;
        }
        if ((i12 & 24576) == 0) {
            if ((i12 & 32768) == 0) {
                z7 = yt24.g(l573);
            } else {
                z7 = yt24.i(l573);
            }
            if (z7) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i3 |= i7;
        }
        if ((196608 & i12) == 0) {
            if ((i12 & 262144) == 0) {
                z6 = yt24.g(l574);
            } else {
                z6 = yt24.i(l574);
            }
            if (z6) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i3 |= i6;
        }
        if ((74899 & i3) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt24.V(i3 & 1, z2)) {
            mm7 d1 = rc9.d1(ij73, (String) null, yt24, (i3 >> 3) & 14, 2);
            in8 in8 = d1.a;
            je2 H = hj8.H(vm4.w, yt24);
            lo7 lo7 = we.v;
            boolean h2 = d1.h();
            d63 d63 = ay0.a;
            if (!h2) {
                yt24.e0(1666573488);
                boolean g4 = yt24.g(d1);
                obj = yt24.Q();
                if (g4 || obj == d63) {
                    ix6 h3 = j45.h();
                    if (h3 != null) {
                        vr22 = h3.e();
                    } else {
                        vr22 = null;
                    }
                    ix6 j5 = j45.j(h3);
                    try {
                        Object H0 = in8.H0();
                        j45.m(h3, j5, vr22);
                        yt24.o0(H0);
                        obj = H0;
                    } catch (Throwable th) {
                        j45.m(h3, j5, vr22);
                        throw th;
                    }
                }
                yt24.r(false);
            } else {
                yt24.e0(1666827533);
                yt24.r(false);
                obj = in8.H0();
            }
            yt24.e0(-768316570);
            int ordinal4 = ((ij7) obj).ordinal();
            float f5 = 0.0f;
            if (ordinal4 != 0) {
                if (ordinal4 == 1) {
                    f2 = 0.0f;
                    yt24.r(false);
                    Float valueOf = Float.valueOf(f2);
                    boolean g5 = yt24.g(d1);
                    Q = yt24.Q();
                    if (g5 || Q == d63) {
                        Q = u55.i(new wo0(d1, 0));
                        yt24.o0(Q);
                    }
                    yt24.e0(-768316570);
                    ordinal = ((ij7) ((a37) Q).getValue()).ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            f3 = 0.0f;
                            yt24.r(false);
                            Float valueOf2 = Float.valueOf(f3);
                            g2 = yt24.g(d1);
                            Object Q4 = yt24.Q();
                            if (!g2 || Q4 == d63) {
                                a37 = u55.i(new wo0(d1, 1));
                                yt24.o0(a37);
                            } else {
                                a37 = Q4;
                            }
                            gm7 = (gm7) a37.getValue();
                            yt24.e0(1780794470);
                            b2 = gm7.b();
                            ij72 = ij7.x;
                            if (b2 != ij72 && gm7.d() == ij72) {
                                je2 = new hx6(100);
                            } else {
                                je2 = H;
                            }
                            yt24.r(false);
                            yt2 yt25 = yt24;
                            Float f6 = valueOf;
                            mm7 mm72 = d1;
                            im7 F = rc9.F(mm72, f6, valueOf2, je2, lo7, yt25, 0);
                            mm7 = mm72;
                            yt23 = yt25;
                            if (!mm7.h()) {
                                yt23.e0(1666573488);
                                boolean g6 = yt23.g(mm7);
                                Object Q5 = yt23.Q();
                                if (g6 || Q5 == d63) {
                                    ix6 h4 = j45.h();
                                    if (h4 != null) {
                                        vr2 = h4.e();
                                    } else {
                                        vr2 = null;
                                    }
                                    ix6 j6 = j45.j(h4);
                                    try {
                                        obj2 = in8.H0();
                                        j45.m(h4, j6, vr2);
                                        yt23.o0(obj2);
                                    } catch (Throwable th2) {
                                        j45.m(h4, j6, vr2);
                                        throw th2;
                                    }
                                } else {
                                    obj2 = Q5;
                                }
                                yt23.r(false);
                            } else {
                                yt23.e0(1666827533);
                                yt23.r(false);
                                obj2 = in8.H0();
                            }
                            yt23.e0(1840054703);
                            ordinal2 = ((ij7) obj2).ordinal();
                            if (ordinal2 == 0 || ordinal2 == 1) {
                                f4 = 0.0f;
                            } else if (ordinal2 == 2) {
                                f4 = 1.0f;
                            } else {
                                h.c();
                                return;
                            }
                            yt23.r(false);
                            Float valueOf3 = Float.valueOf(f4);
                            g3 = yt23.g(mm7);
                            Object Q6 = yt23.Q();
                            if (!g3 || Q6 == d63) {
                                i4 = 2;
                                a372 = u55.i(new wo0(mm7, 2));
                                yt23.o0(a372);
                            } else {
                                a372 = Q6;
                                i4 = 2;
                            }
                            yt23.e0(1840054703);
                            ordinal3 = ((ij7) a372.getValue()).ordinal();
                            if (!(ordinal3 == 0 || ordinal3 == 1)) {
                                if (ordinal3 == i4) {
                                    f5 = 1.0f;
                                } else {
                                    h.c();
                                    return;
                                }
                            }
                            yt23.r(false);
                            Float valueOf4 = Float.valueOf(f5);
                            boolean g7 = yt23.g(mm7);
                            Object Q7 = yt23.Q();
                            if (g7 || Q7 == d63) {
                                Q7 = u55.i(new wo0(mm7, 3));
                                yt23.o0(Q7);
                            }
                            gm7 gm72 = (gm7) ((a37) Q7).getValue();
                            yt23.e0(630790831);
                            if (gm72.b() == ij72) {
                                hx62 = L();
                            } else {
                                hx62 = H;
                                if (gm72.d() == ij72) {
                                    hx6 = new hx6(100);
                                    yt23.r(false);
                                    yt2 yt26 = yt23;
                                    im7 im7 = F;
                                    im7 F2 = rc9.F(mm7, valueOf3, valueOf4, hx6, lo7, yt26, 0);
                                    yt2 yt27 = yt26;
                                    Q2 = yt27.Q();
                                    if (Q2 == d63) {
                                        Q2 = new oo0();
                                        yt27.o0(Q2);
                                    }
                                    oo0 oo02 = (oo0) Q2;
                                    yt27.e0(-2128520210);
                                    so02.getClass();
                                    if (ij73 != ij72) {
                                        j2 = so02.b;
                                    } else {
                                        j2 = so02.a;
                                    }
                                    yt2 yt28 = yt27;
                                    a37 a2 = ru6.a(j2, so0.a(ij73, yt27), (String) null, yt28, 0, 12);
                                    yt2 yt29 = yt28;
                                    yt29.r(false);
                                    if (!z) {
                                        int ordinal5 = ij73.ordinal();
                                        if (ordinal5 != 0) {
                                            if (ordinal5 == 1) {
                                                j3 = so02.d;
                                            } else if (ordinal5 != 2) {
                                                h.c();
                                                return;
                                            }
                                        }
                                        j3 = so02.c;
                                    } else {
                                        int ordinal6 = ij73.ordinal();
                                        if (ordinal6 == 0) {
                                            j3 = so02.e;
                                        } else if (ordinal6 == 1) {
                                            j3 = so02.f;
                                        } else if (ordinal6 == 2) {
                                            j3 = so02.g;
                                        } else {
                                            h.c();
                                            return;
                                        }
                                    }
                                    if (!z) {
                                        yt29.e0(496026915);
                                        yt2 yt210 = yt2;
                                        a373 = ru6.a(j3, so0.a(ij73, yt29), (String) null, yt210, 0, 12);
                                        yt29 = yt210;
                                        yt29.r(false);
                                    } else {
                                        yt29.e0(496117125);
                                        a373 = u55.v(new jt0(j3), yt29);
                                        yt29.r(false);
                                    }
                                    if (!z) {
                                        int ordinal7 = ij73.ordinal();
                                        if (ordinal7 != 0) {
                                            if (ordinal7 == 1) {
                                                j4 = so02.i;
                                            } else if (ordinal7 != 2) {
                                                h.c();
                                                return;
                                            }
                                        }
                                        j4 = so02.h;
                                    } else {
                                        int ordinal8 = ij73.ordinal();
                                        if (ordinal8 == 0) {
                                            j4 = so02.j;
                                        } else if (ordinal8 == 1) {
                                            j4 = so02.k;
                                        } else if (ordinal8 == 2) {
                                            j4 = so02.l;
                                        } else {
                                            h.c();
                                            return;
                                        }
                                    }
                                    if (!z) {
                                        yt29.e0(633206758);
                                        yt2 yt211 = yt2;
                                        a374 = ru6.a(j4, so0.a(ij73, yt29), (String) null, yt211, 0, 12);
                                        yt22 = yt211;
                                        yt22.r(false);
                                        oo0 = oo02;
                                    } else {
                                        oo0 = oo02;
                                        yt22 = yt29;
                                        yt22.e0(633296968);
                                        a374 = u55.v(new jt0(j4), yt22);
                                        yt22.r(false);
                                    }
                                    ml4 h5 = yu6.h(yu6.s(ml42, xb4.C, 2), 20.0f);
                                    boolean g8 = yt22.g(a373) | yt22.g(a374);
                                    a37 a375 = a374;
                                    if ((i3 & 458752) == 131072 || ((i3 & 262144) != 0 && yt22.i(l574))) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    boolean g9 = z3 | g8 | yt22.g(a2) | yt22.g(im7) | yt22.g(F2);
                                    if ((57344 & i3) == 16384 || ((i3 & 32768) != 0 && yt22.i(l573))) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    z5 = g9 | z4;
                                    Q3 = yt22.Q();
                                    if (!z5 || Q3 == d63) {
                                        i5 = 0;
                                        Q3 = new vo0(a373, a375, l574, a2, im7, F2, l573, oo0);
                                        yt22.o0(Q3);
                                    } else {
                                        i5 = 0;
                                    }
                                    tf4.c(h5, (vr2) Q3, yt22, i5);
                                }
                            }
                            hx6 = hx62;
                            yt23.r(false);
                            yt2 yt262 = yt23;
                            im7 im72 = F;
                            im7 F22 = rc9.F(mm7, valueOf3, valueOf4, hx6, lo7, yt262, 0);
                            yt2 yt272 = yt262;
                            Q2 = yt272.Q();
                            if (Q2 == d63) {
                            }
                            oo0 oo022 = (oo0) Q2;
                            yt272.e0(-2128520210);
                            so02.getClass();
                            if (ij73 != ij72) {
                            }
                            yt2 yt282 = yt272;
                            a37 a22 = ru6.a(j2, so0.a(ij73, yt272), (String) null, yt282, 0, 12);
                            yt2 yt292 = yt282;
                            yt292.r(false);
                            if (!z) {
                            }
                            if (!z) {
                            }
                            if (!z) {
                            }
                            if (!z) {
                            }
                            ml4 h52 = yu6.h(yu6.s(ml42, xb4.C, 2), 20.0f);
                            boolean g82 = yt22.g(a373) | yt22.g(a374);
                            a37 a3752 = a374;
                            if ((i3 & 458752) == 131072 || ((i3 & 262144) != 0 && yt22.i(l574))) {
                            }
                            boolean g92 = z3 | g82 | yt22.g(a22) | yt22.g(im72) | yt22.g(F22);
                            if ((57344 & i3) == 16384 || ((i3 & 32768) != 0 && yt22.i(l573))) {
                            }
                            z5 = g92 | z4;
                            Q3 = yt22.Q();
                            if (!z5) {
                            }
                            i5 = 0;
                            Q3 = new vo0(a373, a3752, l574, a22, im72, F22, l573, oo0);
                            yt22.o0(Q3);
                            tf4.c(h52, (vr2) Q3, yt22, i5);
                        } else if (ordinal != 2) {
                            h.c();
                            return;
                        }
                    }
                    f3 = 1.0f;
                    yt24.r(false);
                    Float valueOf22 = Float.valueOf(f3);
                    g2 = yt24.g(d1);
                    Object Q42 = yt24.Q();
                    if (!g2) {
                    }
                    a37 = u55.i(new wo0(d1, 1));
                    yt24.o0(a37);
                    gm7 = (gm7) a37.getValue();
                    yt24.e0(1780794470);
                    b2 = gm7.b();
                    ij72 = ij7.x;
                    if (b2 != ij72 && gm7.d() == ij72) {
                    }
                    yt24.r(false);
                    yt2 yt252 = yt24;
                    Float f62 = valueOf;
                    mm7 mm722 = d1;
                    im7 F3 = rc9.F(mm722, f62, valueOf22, je2, lo7, yt252, 0);
                    mm7 = mm722;
                    yt23 = yt252;
                    if (!mm7.h()) {
                    }
                    yt23.e0(1840054703);
                    ordinal2 = ((ij7) obj2).ordinal();
                    if (ordinal2 == 0 || ordinal2 == 1) {
                    }
                    yt23.r(false);
                    Float valueOf32 = Float.valueOf(f4);
                    g3 = yt23.g(mm7);
                    Object Q62 = yt23.Q();
                    if (!g3) {
                    }
                    i4 = 2;
                    a372 = u55.i(new wo0(mm7, 2));
                    yt23.o0(a372);
                    yt23.e0(1840054703);
                    ordinal3 = ((ij7) a372.getValue()).ordinal();
                    if (ordinal3 == i4) {
                    }
                } else if (ordinal4 != 2) {
                    h.c();
                    return;
                }
            }
            f2 = 1.0f;
            yt24.r(false);
            Float valueOf5 = Float.valueOf(f2);
            boolean g52 = yt24.g(d1);
            Q = yt24.Q();
            Q = u55.i(new wo0(d1, 0));
            yt24.o0(Q);
            yt24.e0(-768316570);
            ordinal = ((ij7) ((a37) Q).getValue()).ordinal();
            if (ordinal != 0) {
            }
            f3 = 1.0f;
            yt24.r(false);
            Float valueOf222 = Float.valueOf(f3);
            g2 = yt24.g(d1);
            Object Q422 = yt24.Q();
            if (!g2) {
            }
            a37 = u55.i(new wo0(d1, 1));
            yt24.o0(a37);
            gm7 = (gm7) a37.getValue();
            yt24.e0(1780794470);
            b2 = gm7.b();
            ij72 = ij7.x;
            if (b2 != ij72 && gm7.d() == ij72) {
            }
            yt24.r(false);
            yt2 yt2522 = yt24;
            Float f622 = valueOf5;
            mm7 mm7222 = d1;
            im7 F32 = rc9.F(mm7222, f622, valueOf222, je2, lo7, yt2522, 0);
            mm7 = mm7222;
            yt23 = yt2522;
            if (!mm7.h()) {
            }
            yt23.e0(1840054703);
            ordinal2 = ((ij7) obj2).ordinal();
            if (ordinal2 == 0 || ordinal2 == 1) {
            }
            yt23.r(false);
            Float valueOf322 = Float.valueOf(f4);
            g3 = yt23.g(mm7);
            Object Q622 = yt23.Q();
            if (!g3) {
            }
            i4 = 2;
            a372 = u55.i(new wo0(mm7, 2));
            yt23.o0(a372);
            yt23.e0(1840054703);
            ordinal3 = ((ij7) a372.getValue()).ordinal();
            if (ordinal3 == i4) {
            }
        } else {
            yt22 = yt24;
            yt22.Y();
        }
        yx5 v2 = yt22.v();
        if (v2 != null) {
            v2.d = new e70(z, ij73, ml42, so0, l57, l572, i2);
        }
    }

    public static final void c(ml4 ml4, float f2, long j2, yt2 yt2, int i2, int i3) {
        int i4;
        long j3;
        boolean z;
        long j4;
        float f3;
        ml4 ml42;
        float f4;
        boolean z2;
        int i5;
        int i6;
        int i7;
        yt2 yt22 = yt2;
        int i8 = i2;
        yt22.g0(75144485);
        int i9 = i3 & 1;
        if (i9 != 0) {
            i4 = i8 | 6;
        } else if ((i8 & 6) == 0) {
            if (yt22.g(ml4)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i4 = i7 | i8;
        } else {
            i4 = i8;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i4 |= 48;
        } else if ((i8 & 48) == 0) {
            if (yt22.d(f2)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i4 |= i6;
        }
        if ((i8 & 384) == 0) {
            j3 = j2;
            if ((i3 & 4) != 0 || !yt22.f(j3)) {
                i5 = 128;
            } else {
                i5 = 256;
            }
            i4 |= i5;
        } else {
            j3 = j2;
        }
        boolean z3 = true;
        if ((i4 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i4 & 1, z)) {
            yt22.a0();
            if ((i8 & 1) == 0 || yt22.C()) {
                if (i9 != 0) {
                    ml4 = jl4.w;
                }
                if (i10 != 0) {
                    f4 = vw1.a;
                } else {
                    f4 = f2;
                }
                if ((i3 & 4) != 0) {
                    float f5 = vw1.a;
                    i4 &= -897;
                    j3 = st0.e(gr8.e, yt22);
                }
            } else {
                yt22.Y();
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                }
                f4 = f2;
            }
            yt22.s();
            ml4 d2 = yu6.d(ml4.d(yu6.a), f4);
            if ((i4 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((((i4 & 896) ^ 384) <= 256 || !yt22.f(j3)) && (i4 & 384) != 256) {
                z3 = false;
            }
            boolean z4 = z2 | z3;
            Object Q = yt22.Q();
            if (z4 || Q == ay0.a) {
                Q = new ww1(f4, j3);
                yt22.o0(Q);
            }
            tf4.c(d2, (vr2) Q, yt22, 0);
            f3 = f4;
            j4 = j3;
            ml42 = ml4;
        } else {
            yt22.Y();
            f3 = f2;
            ml42 = ml4;
            j4 = j3;
        }
        yx5 v2 = yt22.v();
        if (v2 != null) {
            v2.d = new xw1(ml42, f3, j4, i8, i3);
        }
    }

    public static final void d(ij7 ij7, sr2 sr2, l57 l57, l57 l572, ml4 ml4, boolean z, so0 so0, yt2 yt2, int i2) {
        int i3;
        boolean z2;
        ij7 ij72;
        ml4 ml42;
        ml4 ml43;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z3;
        int i8;
        boolean z4;
        int i9;
        int i10;
        int i11;
        sr2 sr22 = sr2;
        l57 l573 = l57;
        l57 l574 = l572;
        ml4 ml44 = ml4;
        boolean z5 = z;
        yt2 yt22 = yt2;
        int i12 = i2;
        yt22.g0(-406243761);
        if ((i12 & 6) == 0) {
            if (yt22.e(ij7.ordinal())) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i3 = i11 | i12;
        } else {
            i3 = i12;
        }
        if ((i12 & 48) == 0) {
            if (yt22.i(sr22)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i3 |= i10;
        }
        if ((i12 & 384) == 0) {
            if ((i12 & 512) == 0) {
                z4 = yt22.g(l573);
            } else {
                z4 = yt22.i(l573);
            }
            if (z4) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i3 |= i9;
        }
        if ((i12 & 3072) == 0) {
            if ((i12 & 4096) == 0) {
                z3 = yt22.g(l574);
            } else {
                z3 = yt22.i(l574);
            }
            if (z3) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i3 |= i8;
        }
        if ((i12 & 24576) == 0) {
            if (yt22.g(ml44)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i3 |= i7;
        }
        if ((196608 & i12) == 0) {
            if (yt22.h(z5)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i3 |= i6;
        }
        so0 so02 = so0;
        if ((1572864 & i12) == 0) {
            if (yt22.g(so02)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i3 |= i5;
        }
        if ((12582912 & i12) == 0) {
            if (yt22.g((Object) null)) {
                i4 = 8388608;
            } else {
                i4 = 4194304;
            }
            i3 |= i4;
        }
        if ((4793491 & i3) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i3 & 1, z2)) {
            yt22.a0();
            if ((i12 & 1) != 0 && !yt22.C()) {
                yt22.Y();
            }
            yt22.s();
            float f2 = xo0.f / 2.0f;
            long j2 = jt0.g;
            o96 o96 = q96.a;
            lf5 lf5 = new lf5(25.0f);
            o86 a2 = d86.a(false, f2, j2, new o96(lf5, lf5, lf5, lf5), 240);
            jl4 jl4 = jl4.w;
            if (sr22 != null) {
                ij72 = ij7;
                ml42 = h49.T(ij72, a2, z5, new s86(1), sr22);
            } else {
                ij72 = ij7;
                ml42 = jl4;
            }
            if (sr22 != null) {
                h23 h23 = hf3.a;
                ml43 = al4.w;
            } else {
                ml43 = jl4;
            }
            int i13 = i3 << 6;
            b(z5, ij72, ml44.d(ml43).d(ml42).d(x91.K(jl4, 2.0f)), so02, l573, l574, yt22, ((i3 >> 15) & 14) | ((i3 << 3) & 112) | ((i3 >> 9) & 7168) | 32768 | (57344 & i13) | 262144 | (i13 & 458752));
        } else {
            yt2.Y();
        }
        yx5 v2 = yt2.v();
        if (v2 != null) {
            v2.d = new sl0(ij7, sr22, l57, l572, ml4, z, so0, i12);
        }
    }

    public static final up2 e(up2 up2, String str) {
        return up2.a(uq4.e(str));
    }

    public static final ml4 f(ml4 ml4, dx4 dx4) {
        return ml4.d(new q9(dx4));
    }

    public static final float g(tj1 tj1, float f2, float f3) {
        float f4;
        float f5;
        lh2 lh2 = tj1.a;
        kl klVar = new kl(0.0f);
        int b2 = klVar.b();
        for (int i2 = 0; i2 < b2; i2++) {
            if (i2 == 0) {
                f4 = f2;
            } else {
                f4 = 0.0f;
            }
            if (i2 == 0) {
                f5 = f3;
            } else {
                f5 = 0.0f;
            }
            klVar.e(i2, lh2.k0(f4, f5));
        }
        return klVar.a;
    }

    public static rw4 h(long j2, long j3, long j4, long j5, long j6, long j7, long j8, yt2 yt2, int i2) {
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15 = j5;
        long j16 = j6;
        if ((i2 & 32) != 0) {
            j9 = jt0.b(0.38f, j15);
        } else {
            j9 = j7;
        }
        if ((i2 & 64) != 0) {
            j10 = jt0.b(0.38f, j16);
        } else {
            j10 = j8;
        }
        rw4 s2 = s(((zg4) yt2.k(ch4.b)).a);
        if (j2 != 16) {
            j11 = j2;
        } else {
            j11 = s2.a;
        }
        if (j3 != 16) {
            j12 = j3;
        } else {
            j12 = s2.b;
        }
        if (j4 != 16) {
            j13 = 16;
            j14 = j4;
        } else {
            j13 = 16;
            j14 = s2.c;
        }
        if (j15 == j13) {
            j15 = s2.d;
        }
        if (j16 == j13) {
            j16 = s2.e;
        }
        if (j9 == j13) {
            j9 = s2.f;
        }
        if (j10 == j13) {
            j10 = s2.g;
        }
        return new rw4(j11, j12, j14, j15, j16, j9, j10);
    }

    public static final a62 i(String str, Enum[] enumArr, String[] strArr, Annotation[][] annotationArr) {
        enumArr.getClass();
        t52 t52 = new t52(str, enumArr.length);
        int length = enumArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            Enum enumR = enumArr[i2];
            int i4 = i3 + 1;
            String str2 = (String) qs.b1(i3, strArr);
            if (str2 == null) {
                str2 = enumR.name();
            }
            t52.k(str2, false);
            Annotation[] annotationArr2 = (Annotation[]) qs.b1(i3, annotationArr);
            if (annotationArr2 != null) {
                for (Annotation l2 : annotationArr2) {
                    t52.l(l2);
                }
            }
            i2++;
            i3 = i4;
        }
        a62 a62 = new a62(str, enumArr);
        a62.c = t52;
        return a62;
    }

    public static int j(String str, int i2, int i3, boolean z) {
        boolean z2;
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if ((charAt >= ' ' || charAt == 9) && charAt < 127 && (('0' > charAt || charAt >= ':') && (('a' > charAt || charAt >= '{') && (('A' > charAt || charAt >= '[') && charAt != ':')))) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2 == (!z)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static final void k(f61 f61, Throwable th) {
        if (th instanceof DispatchException) {
            th = ((DispatchException) th).w;
        }
        f61.f(o85.b(th));
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
        if (r0 > 0) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        if (r4 > 0) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        if (r4 < 0) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        return r1 + r4;
     */
    public static int l(int i2, int i3) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i3 != 0) {
            int i4 = i2 / i3;
            int i5 = i2 - (i3 * i4);
            if (i5 != 0) {
                int i6 = ((i2 ^ i3) >> 31) | 1;
                switch (le3.a[roundingMode.ordinal()]) {
                    case 1:
                        if (i5 != 0) {
                            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                        }
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                    case 7:
                    case 8:
                        int abs = Math.abs(i5);
                        int abs2 = abs - (Math.abs(i3) - abs);
                        if (abs2 == 0) {
                            RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                            RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                            break;
                        }
                        break;
                    default:
                        throw new AssertionError();
                }
            }
            return i4;
        }
        throw new ArithmeticException("/ by zero");
    }

    public static tj1 m() {
        return new tj1(new pj(3));
    }

    public static final du7 n(fu6 fu6, fu6 fu62) {
        fu6.getClass();
        fu62.getClass();
        if (fu6.equals(fu62)) {
            return fu6;
        }
        return new zg2(fu6, fu62);
    }

    public static final int o(Bitmap bitmap) {
        int i2;
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                Bitmap.Config config = bitmap.getConfig();
                if (config == Bitmap.Config.ALPHA_8) {
                    i2 = 1;
                } else if (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) {
                    i2 = 2;
                } else if (Build.VERSION.SDK_INT < 26 || config != Bitmap.Config.RGBA_F16) {
                    i2 = 4;
                } else {
                    i2 = 8;
                }
                return height * i2;
            }
        } else {
            StringBuilder sb = new StringBuilder("Cannot obtain size for recycled bitmap: ");
            sb.append(bitmap);
            int width = bitmap.getWidth();
            int height2 = bitmap.getHeight();
            Bitmap.Config config2 = bitmap.getConfig();
            sb.append(" [");
            sb.append(width);
            sb.append(" x ");
            sb.append(height2);
            sb.append("] + ");
            sb.append(config2);
            throw new IllegalStateException(sb.toString().toString());
        }
    }

    public static final gq3 p(Annotation annotation) {
        annotation.getClass();
        Class<? extends Annotation> annotationType = annotation.annotationType();
        annotationType.getClass();
        return b26.a.b(annotationType);
    }

    public static final x83 q() {
        x83 x83 = t;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("Filled.Badge", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
        int i2 = e38.a;
        ky6 ky6 = new ky6(jt0.b);
        be5 be5 = new be5();
        be5.j(20.0f, 7.0f);
        be5.g(-5.0f);
        be5.m(4.0f);
        be5.e(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        be5.g(-2.0f);
        be5.d(9.9f, 2.0f, 9.0f, 2.9f, 9.0f, 4.0f);
        be5.n(3.0f);
        be5.f(4.0f);
        be5.d(2.9f, 7.0f, 2.0f, 7.9f, 2.0f, 9.0f);
        be5.n(11.0f);
        be5.e(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        be5.g(16.0f);
        be5.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        be5.m(9.0f);
        be5.d(22.0f, 7.9f, 21.1f, 7.0f, 20.0f, 7.0f);
        be5.c();
        be5.j(9.0f, 12.0f);
        be5.e(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        be5.k(9.83f, 15.0f, 9.0f, 15.0f);
        be5.l(-1.5f, -0.67f, -1.5f, -1.5f);
        be5.k(8.17f, 12.0f, 9.0f, 12.0f);
        be5.c();
        be5.j(12.0f, 18.0f);
        be5.f(6.0f);
        be5.n(-0.75f);
        be5.e(0.0f, -1.0f, 2.0f, -1.5f, 3.0f, -1.5f);
        be5.l(3.0f, 0.5f, 3.0f, 1.5f);
        be5.m(18.0f);
        be5.c();
        be5.j(13.0f, 9.0f);
        be5.g(-2.0f);
        be5.m(4.0f);
        be5.g(2.0f);
        be5.m(9.0f);
        be5.c();
        be5.j(18.0f, 16.5f);
        be5.g(-4.0f);
        be5.m(15.0f);
        be5.g(4.0f);
        be5.m(16.5f);
        be5.c();
        be5.j(18.0f, 13.5f);
        be5.g(-4.0f);
        be5.m(12.0f);
        be5.g(4.0f);
        be5.m(13.5f);
        be5.c();
        w83.a(w83, be5.a, ky6, 14336);
        x83 b2 = w83.b();
        t = b2;
        return b2;
    }

    public static final long r(yt2 yt2) {
        return yt2.T;
    }

    public static rw4 s(qt0 qt0) {
        qt0 qt02 = qt0;
        rw4 rw4 = qt02.i0;
        if (rw4 != null) {
            return rw4;
        }
        long d2 = st0.d(qt02, ag8.e);
        long d3 = st0.d(qt02, ag8.g);
        long d4 = st0.d(qt02, ag8.f);
        rt0 rt0 = ag8.h;
        long d5 = st0.d(qt02, rt0);
        rt0 rt02 = ag8.i;
        long j2 = d2;
        rw4 rw42 = new rw4(j2, d3, d4, d5, st0.d(qt02, rt02), jt0.b(0.38f, st0.d(qt02, rt0)), jt0.b(0.38f, st0.d(qt02, rt02)));
        qt02.i0 = rw42;
        return rw42;
    }

    public static final x83 t() {
        x83 x83 = v;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("Rounded.Gavel", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
        int i2 = e38.a;
        ky6 ky6 = new ky6(jt0.b);
        be5 be5 = new be5();
        be5.j(2.0f, 21.0f);
        be5.g(10.0f);
        be5.e(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        be5.l(-0.45f, 1.0f, -1.0f, 1.0f);
        be5.h(2.0f, 23.0f);
        be5.e(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        be5.l(0.45f, -1.0f, 1.0f, -1.0f);
        be5.c();
        be5.j(5.24f, 8.07f);
        be5.i(2.83f, -2.83f);
        be5.h(20.8f, 17.97f);
        be5.e(0.78f, 0.78f, 0.78f, 2.05f, 0.0f, 2.83f);
        be5.e(-0.78f, 0.78f, -2.05f, 0.78f, -2.83f, 0.0f);
        be5.h(5.24f, 8.07f);
        be5.c();
        be5.j(13.73f, 2.41f);
        be5.i(2.83f, 2.83f);
        be5.e(0.78f, 0.78f, 0.78f, 2.05f, 0.0f, 2.83f);
        be5.i(-1.42f, 1.42f);
        be5.i(-5.65f, -5.66f);
        be5.i(1.41f, -1.41f);
        be5.e(0.78f, -0.79f, 2.05f, -0.79f, 2.83f, -0.01f);
        be5.c();
        be5.j(3.83f, 9.48f);
        be5.i(5.66f, 5.66f);
        be5.i(-1.41f, 1.41f);
        be5.e(-0.78f, 0.78f, -2.05f, 0.78f, -2.83f, 0.0f);
        be5.i(-2.83f, -2.83f);
        be5.e(-0.78f, -0.78f, -0.78f, -2.05f, 0.0f, -2.83f);
        be5.i(1.41f, -1.41f);
        be5.c();
        w83.a(w83, be5.a, ky6, 14336);
        x83 b2 = w83.b();
        v = b2;
        return b2;
    }

    public static final Class u(gq3 gq3) {
        gq3.getClass();
        Class b2 = ((vp0) gq3).b();
        b2.getClass();
        return b2;
    }

    public static final Class v(gq3 gq3) {
        gq3.getClass();
        Class b2 = ((vp0) gq3).b();
        if (!b2.isPrimitive()) {
            return b2;
        }
        String name = b2.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                    return b2;
                }
                return Double.class;
            case 104431:
                if (!name.equals("int")) {
                    return b2;
                }
                return Integer.class;
            case 3039496:
                if (!name.equals("byte")) {
                    return b2;
                }
                return Byte.class;
            case 3052374:
                if (!name.equals("char")) {
                    return b2;
                }
                return Character.class;
            case 3327612:
                if (!name.equals("long")) {
                    return b2;
                }
                return Long.class;
            case 3625364:
                if (!name.equals("void")) {
                    return b2;
                }
                return Void.class;
            case 64711720:
                if (!name.equals("boolean")) {
                    return b2;
                }
                return Boolean.class;
            case 97526364:
                if (!name.equals("float")) {
                    return b2;
                }
                return Float.class;
            case 109413500:
                if (!name.equals("short")) {
                    return b2;
                }
                return Short.class;
            default:
                return b2;
        }
    }

    public static final Class w(gq3 gq3) {
        gq3.getClass();
        Class b2 = ((vp0) gq3).b();
        if (b2.isPrimitive()) {
            return b2;
        }
        String name = b2.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (!name.equals("java.lang.Integer")) {
                    return null;
                }
                return Integer.TYPE;
            case -527879800:
                if (!name.equals("java.lang.Float")) {
                    return null;
                }
                return Float.TYPE;
            case -515992664:
                if (!name.equals("java.lang.Short")) {
                    return null;
                }
                return Short.TYPE;
            case 155276373:
                if (!name.equals("java.lang.Character")) {
                    return null;
                }
                return Character.TYPE;
            case 344809556:
                if (!name.equals("java.lang.Boolean")) {
                    return null;
                }
                return Boolean.TYPE;
            case 398507100:
                if (!name.equals("java.lang.Byte")) {
                    return null;
                }
                return Byte.TYPE;
            case 398795216:
                if (!name.equals("java.lang.Long")) {
                    return null;
                }
                return Long.TYPE;
            case 399092968:
                if (!name.equals("java.lang.Void")) {
                    return null;
                }
                return Void.TYPE;
            case 761287205:
                if (!name.equals("java.lang.Double")) {
                    return null;
                }
                return Double.TYPE;
            default:
                return null;
        }
    }

    public static float x(int i2, String[] strArr) {
        float parseFloat = Float.parseFloat(strArr[i2]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static String y(v8 v8Var) {
        if (v8Var instanceof u8) {
            return "image/*";
        }
        if (v8Var instanceof t8) {
            return null;
        }
        h.c();
        return null;
    }

    public static ib3 z(v02 v02, int i2) {
        return new ib3(v02, o46.w);
    }
}
