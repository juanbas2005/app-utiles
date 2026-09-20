package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Build;
import android.util.AttributeSet;
import com.google.zxing.FormatException;
import cu.lestebang.utiletecsa.R;
import cu.lestebang.utiletecsa.feature.home.navigation.HomeNavGraph;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: rg3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class rg3 {
    public static final float[] a = new float[91];
    public static final fw0 b = new fw0(-1509806472, new sw0(3), false);
    public static final fw0 c = new fw0(929604343, new tw0(0), false);
    public static final fw0 d = new fw0(1068251331, new tw0(1), false);
    public static final char[] e = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' ', '$', '%', '*', '+', '-', '.', '/', ':'};
    public static final wf2 f = new wf2(1);
    public static final int[] g = {16842752, R.attr.theme};
    public static final int[] h = {R.attr.materialThemeOverlay};
    public static final StackTraceElement[] i = new StackTraceElement[0];
    public static final Object j = new Object();
    public static final Object k = new Object();
    public static boolean l = false;
    public static int m = 0;
    public static x83 n = null;
    public static x83 o = null;
    public static final int p = 9;
    public static final int q = 10;
    public static final int r = 12;
    public static x83 s;
    public static x83 t;

    public static final long A(float f2, long j2) {
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (j2 >> 32)) - f2))) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (j2 & 4294967295L)) - f2))) & 4294967295L);
    }

    public static boolean B(eq7 eq7, v76 v76, v76 v762) {
        if (eq7.d(v76) == eq7.d(v762) && eq7.y0(v76) == eq7.y0(v762) && eq7.K(v76) == eq7.K(v762) && eq7.c0(eq7.F(v76), eq7.F(v762))) {
            if (eq7.a0(v76, v762)) {
                return true;
            }
            int d2 = eq7.d(v76);
            int i2 = 0;
            while (i2 < d2) {
                qo7 v0 = eq7.v0(v76, i2);
                qo7 v02 = eq7.v0(v762, i2);
                if (eq7.f(v0) == eq7.f(v02)) {
                    if (!eq7.f(v0)) {
                        if (eq7.m(v0) == eq7.m(v02)) {
                            zw3 p2 = eq7.p(v0);
                            p2.getClass();
                            zw3 p3 = eq7.p(v02);
                            p3.getClass();
                            if (!C(eq7, p2, p3)) {
                            }
                        }
                    }
                    i2++;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean C(eq7 eq7, zw3 zw3, zw3 zw32) {
        if (zw3 == zw32) {
            return true;
        }
        v76 n0 = eq7.n0(zw3);
        v76 n02 = eq7.n0(zw32);
        if (n0 != null && n02 != null) {
            return B(eq7, n0, n02);
        }
        bh2 h0 = eq7.h0(zw3);
        bh2 h02 = eq7.h0(zw32);
        if (h0 == null || h02 == null || !B(eq7, eq7.j(h0), eq7.j(h02)) || !B(eq7, eq7.i(h0), eq7.i(h02))) {
            return false;
        }
        return true;
    }

    public static char D(int i2) {
        if (i2 < 45) {
            return e[i2];
        }
        throw FormatException.a();
    }

    public static final Bitmap.Config E(int i2) {
        if (i2 == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i2 == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i2 == 2) {
            return Bitmap.Config.RGB_565;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26 && i2 == 3) {
            return Bitmap.Config.RGBA_F16;
        }
        if (i3 < 26 || i2 != 4) {
            return Bitmap.Config.ARGB_8888;
        }
        return Bitmap.Config.HARDWARE;
    }

    public static Context F(Context context, AttributeSet attributeSet, int i2, int i3) {
        return G(context, attributeSet, i2, i3, new int[0]);
    }

    public static Context G(Context context, AttributeSet attributeSet, int i2, int i3, int[] iArr) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h, i2, i3);
        int[] iArr2 = {obtainStyledAttributes.getResourceId(0, 0)};
        obtainStyledAttributes.recycle();
        int i4 = iArr2[0];
        if (!(context instanceof d61) || ((d61) context).a != i4) {
            z = false;
        } else {
            z = true;
        }
        if (i4 == 0 || z) {
            return context;
        }
        d61 d61 = new d61(context, i4);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        if (iArr.length > 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
            for (int i5 = 0; i5 < iArr.length; i5++) {
                iArr3[i5] = obtainStyledAttributes2.getResourceId(i5, 0);
            }
            obtainStyledAttributes2.recycle();
        }
        for (int i6 = 0; i6 < length; i6++) {
            int i7 = iArr3[i6];
            if (i7 != 0) {
                d61.getTheme().applyStyle(i7, true);
            }
        }
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, g);
        int resourceId = obtainStyledAttributes3.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes3.getResourceId(1, 0);
        obtainStyledAttributes3.recycle();
        if (resourceId == 0) {
            resourceId = resourceId2;
        }
        if (resourceId != 0) {
            d61.getTheme().applyStyle(resourceId, true);
        }
        return d61;
    }

    public static /* synthetic */ void a(int i2) {
        Object[] objArr = new Object[3];
        if (i2 == 1 || i2 == 2) {
            objArr[0] = "companionObject";
        } else if (i2 != 3) {
            objArr[0] = "propertyDescriptor";
        } else {
            objArr[0] = "memberDescriptor";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        if (i2 == 1) {
            objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
        } else if (i2 == 2) {
            objArr[2] = "isMappedIntrinsicCompanionObject";
        } else if (i2 != 3) {
            objArr[2] = "isPropertyWithBackingFieldInOuterClass";
        } else {
            objArr[2] = "hasJvmFieldAnnotation";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static final void b(sk3 sk3, is2 is2, ml4 ml4, yt2 yt2, int i2) {
        int i3;
        int i4;
        boolean z;
        jl4 jl4;
        sk3 sk32 = sk3;
        is2 is22 = is2;
        yt2 yt22 = yt2;
        sk32.getClass();
        is22.getClass();
        yt22.g0(-497468280);
        if (yt22.g(sk32)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i2 | i3;
        if (yt22.g(is22)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i6 = i5 | i4 | 384;
        boolean z2 = true;
        if ((i6 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i6 & 1, z)) {
            iu4 iu4 = sk32.b;
            gq3 b2 = b26.a.b(HomeNavGraph.class);
            if ((i6 & 112) != 32) {
                z2 = false;
            }
            boolean i7 = yt22.i(iu4) | z2;
            Object Q = yt22.Q();
            if (i7 || Q == ay0.a) {
                Q = new lu4(is22, iu4, 0);
                yt22.o0(Q);
            }
            sg3.a(iu4, b2, (jb) null, (Map) null, (vr2) null, (vr2) null, (vr2) null, (vr2) null, (vr2) Q, yt22, 384);
            jl4 = jl4.w;
        } else {
            yt2.Y();
            jl4 = ml4;
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new ou4(i2, 0, sk32, is22, jl4);
        }
    }

    public static final sj0 c(hj3 hj3, boolean z) {
        Field Q = hj3.P().Q();
        if (!Modifier.isStatic(Q.getModifiers())) {
            if (z) {
                if (r16.Z(hj3)) {
                    return new gj0(Q, r16.F(hj3.P()));
                }
                return new ij0(Q, true, 0);
            } else if (r16.Z(hj3)) {
                return new kj0(Q, false, r16.F(hj3.P()));
            } else {
                return new mj0(Q, false, true, 0);
            }
        } else if (z) {
            return new ij0(Q, false, 2);
        } else {
            return new mj0(Q, false, false, 2);
        }
    }

    public static final void d(kj3 kj3) {
        if (!Modifier.isStatic(kj3.Q().getModifiers())) {
            rf2.j("Only static properties are supported for now: ", kj3.Q());
        }
    }

    public static final void e(cz6 cz6) {
        int i2 = cz6.z;
        int[] iArr = cz6.x;
        Object[] objArr = cz6.y;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != j) {
                if (i4 != i3) {
                    iArr[i3] = iArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        cz6.w = false;
        cz6.z = i3;
    }

    public static final en2 f(en2 en2, String str, long j2) {
        long j3;
        if (!sg3.e(en2.a, str)) {
            return en2;
        }
        long j4 = en2.l + j2;
        if (j4 < 0) {
            j3 = 0;
        } else {
            j3 = j4;
        }
        return en2.a(en2, (qm2) null, (String) null, (String) null, (String) null, (String) null, false, 0, 0, j3, 0, 14335);
    }

    public static final jb3 g(lb3 lb3, float f2, float f3, ib3 ib3, yt2 yt2) {
        Float valueOf = Float.valueOf(f2);
        Float valueOf2 = Float.valueOf(f3);
        Object Q = yt2.Q();
        Object obj = ay0.a;
        if (Q == obj) {
            Q = new jb3(lb3, valueOf, valueOf2, ib3);
            yt2.o0(Q);
        }
        jb3 jb3 = (jb3) Q;
        boolean i2 = yt2.i(ib3);
        Object Q2 = yt2.Q();
        if (i2 || Q2 == obj) {
            Q2 = new mm0((Object) valueOf, (Object) jb3, (Object) valueOf2, (Object) ib3, 3);
            yt2.o0(Q2);
        }
        t49.l((sr2) Q2, yt2);
        boolean i3 = yt2.i(lb3);
        Object Q3 = yt2.Q();
        if (i3 || Q3 == obj) {
            Q3 = new m0(25, lb3, jb3);
            yt2.o0(Q3);
        }
        t49.e(jb3, (vr2) Q3, yt2);
        return jb3;
    }

    public static final Bitmap h(hg hgVar) {
        if (hgVar instanceof hg) {
            return hgVar.a;
        }
        kj6.n("Unable to obtain android.graphics.Bitmap");
        return null;
    }

    public static IOException i(File file, IOException iOException) {
        StringBuilder sb = new StringBuilder("Inoperable file:");
        try {
            sb.append(" canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + ']');
        } catch (IOException unused) {
            sb.append(" failed to attach additional metadata");
        }
        return new IOException(sb.toString(), iOException);
    }

    public static IOException j(File file, IOException iOException) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return i(file, iOException);
        }
        if (!parentFile.exists()) {
            return i(file, iOException);
        }
        if (parentFile.isFile()) {
            if (parentFile.canRead()) {
                if (parentFile.canWrite()) {
                    return i(file, iOException);
                }
                return i(file, iOException);
            } else if (parentFile.canWrite()) {
                return i(file, iOException);
            } else {
                return i(file, iOException);
            }
        } else if (parentFile.canRead()) {
            if (parentFile.canWrite()) {
                return i(file, iOException);
            }
            return i(file, iOException);
        } else if (parentFile.canWrite()) {
            return i(file, iOException);
        } else {
            return i(file, iOException);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [fm0, java.lang.Object] */
    public static final fm0 k() {
        ? obj = new Object();
        obj.w = fm0.E;
        obj.x = fm0.F;
        obj.z = fm0.G;
        return obj;
    }

    public static void l(m90 m90, StringBuilder sb, int i2, boolean z) {
        while (i2 > 1) {
            if (m90.a() >= 11) {
                int b2 = m90.b(11);
                sb.append(D(b2 / 45));
                sb.append(D(b2 % 45));
                i2 -= 2;
            } else {
                throw FormatException.a();
            }
        }
        if (i2 == 1) {
            if (m90.a() >= 6) {
                sb.append(D(m90.b(6)));
            } else {
                throw FormatException.a();
            }
        }
        if (z) {
            for (int length = sb.length(); length < sb.length(); length++) {
                if (sb.charAt(length) == '%') {
                    if (length < sb.length() - 1) {
                        int i3 = length + 1;
                        if (sb.charAt(i3) == '%') {
                            sb.deleteCharAt(i3);
                        }
                    }
                    sb.setCharAt(length, 29);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:124:0x015b, code lost:
        if (r5 == 2) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x015f, code lost:
        if ((r17 * 10) >= r0) goto L_0x0150;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x011e  */
    public static void m(m90 m90, StringBuilder sb, int i2, jo0 jo0, ArrayList arrayList, Map map) {
        String str;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i3 = i2;
        Map map2 = map;
        if ((i3 << 3) <= m90.a()) {
            byte[] bArr = new byte[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                bArr[i5] = (byte) m90.b(8);
            }
            if (jo0 == null) {
                String str2 = w47.a;
                if (map2 != null) {
                    fk1 fk1 = fk1.A;
                    if (map2.containsKey(fk1)) {
                        str = map2.get(fk1).toString();
                    }
                }
                boolean z6 = true;
                if (i3 > 3 && bArr[0] == -17 && bArr[1] == -69 && bArr[2] == -65) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z7 = true;
                boolean z8 = true;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                while (i7 < i3 && (z6 || z7 || z8)) {
                    byte b2 = bArr[i7];
                    boolean z9 = z6;
                    byte b3 = b2 & 255;
                    if (z8) {
                        if (i8 <= 0) {
                            z3 = z;
                            if ((b2 & 128) != 0) {
                                if ((b2 & 64) != 0) {
                                    int i17 = i8 + 1;
                                    if ((b2 & 32) == 0) {
                                        i10++;
                                    } else {
                                        i17 = i8 + 2;
                                        if ((b2 & 16) == 0) {
                                            i11++;
                                        } else {
                                            i8 += 3;
                                            if ((b2 & 8) == 0) {
                                                i12++;
                                            }
                                        }
                                    }
                                    i8 = i17;
                                }
                            }
                            if (z9) {
                                if (b3 > Byte.MAX_VALUE && b3 < 160) {
                                    z4 = false;
                                    if (!z7) {
                                        if (i9 > 0) {
                                            z5 = z4;
                                            if (b3 >= 64 && b3 != Byte.MAX_VALUE && b3 <= 252) {
                                                i9--;
                                            }
                                        } else {
                                            z5 = z4;
                                            if (!(b3 == 128 || b3 == 160 || b3 > 239)) {
                                                if (b3 <= 160 || b3 >= 224) {
                                                    if (b3 > Byte.MAX_VALUE) {
                                                        i9++;
                                                        int i18 = i15 + 1;
                                                        if (i18 > i4) {
                                                            i4 = i18;
                                                            i15 = i4;
                                                        } else {
                                                            i15 = i18;
                                                        }
                                                    } else {
                                                        i15 = 0;
                                                    }
                                                    i16 = 0;
                                                } else {
                                                    i6++;
                                                    int i19 = i16 + 1;
                                                    if (i19 > i13) {
                                                        i13 = i19;
                                                        i16 = i13;
                                                    } else {
                                                        i16 = i19;
                                                    }
                                                    i15 = 0;
                                                }
                                            }
                                        }
                                        z7 = false;
                                    } else {
                                        z5 = z4;
                                    }
                                    i7++;
                                    z6 = z5;
                                    z = z3;
                                } else if (b3 > 159 && (b3 < 192 || b3 == 215 || b3 == 247)) {
                                    i14++;
                                }
                            }
                            z4 = z9;
                            if (!z7) {
                            }
                            i7++;
                            z6 = z5;
                            z = z3;
                        } else if ((b2 & 128) != 0) {
                            i8--;
                        } else {
                            z3 = z;
                        }
                        z8 = false;
                        if (z9) {
                        }
                        z4 = z9;
                        if (!z7) {
                        }
                        i7++;
                        z6 = z5;
                        z = z3;
                    }
                    z3 = z;
                    if (z9) {
                    }
                    z4 = z9;
                    if (!z7) {
                    }
                    i7++;
                    z6 = z5;
                    z = z3;
                }
                boolean z10 = z6;
                boolean z11 = z;
                if (z8 && i8 > 0) {
                    z8 = false;
                }
                if (!z7 || i9 <= 0) {
                    z2 = z7;
                } else {
                    z2 = false;
                }
                if (!z8 || (!z11 && i10 + i11 + i12 <= 0)) {
                    if (!z2 || (!w47.b && i13 < 3 && i4 < 3)) {
                        if (!z10 || !z2) {
                            if (!z10) {
                                if (!z2) {
                                    if (!z8) {
                                        str = w47.a;
                                    }
                                }
                            }
                        } else if (i13 == 2) {
                        }
                        str = "ISO8859_1";
                    }
                    str = "SJIS";
                }
                str = "UTF8";
            } else {
                str = jo0.name();
            }
            try {
                sb.append(new String(bArr, str));
                arrayList.add(bArr);
            } catch (UnsupportedEncodingException unused) {
                throw FormatException.a();
            }
        } else {
            throw FormatException.a();
        }
    }

    public static void n(m90 m90, StringBuilder sb, int i2) {
        int i3;
        if (i2 * 13 <= m90.a()) {
            byte[] bArr = new byte[(i2 * 2)];
            int i4 = 0;
            while (i2 > 0) {
                int b2 = m90.b(13);
                int i5 = (b2 % 96) | ((b2 / 96) << 8);
                if (i5 < 2560) {
                    i3 = 41377;
                } else {
                    i3 = 42657;
                }
                int i6 = i5 + i3;
                bArr[i4] = (byte) (i6 >> 8);
                bArr[i4 + 1] = (byte) i6;
                i4 += 2;
                i2--;
            }
            try {
                sb.append(new String(bArr, "GB2312"));
            } catch (UnsupportedEncodingException unused) {
                throw FormatException.a();
            }
        } else {
            throw FormatException.a();
        }
    }

    public static void o(m90 m90, StringBuilder sb, int i2) {
        int i3;
        if (i2 * 13 <= m90.a()) {
            byte[] bArr = new byte[(i2 * 2)];
            int i4 = 0;
            while (i2 > 0) {
                int b2 = m90.b(13);
                int i5 = (b2 % 192) | ((b2 / 192) << 8);
                if (i5 < 7936) {
                    i3 = 33088;
                } else {
                    i3 = 49472;
                }
                int i6 = i5 + i3;
                bArr[i4] = (byte) (i6 >> 8);
                bArr[i4 + 1] = (byte) i6;
                i4 += 2;
                i2--;
            }
            try {
                sb.append(new String(bArr, "SJIS"));
            } catch (UnsupportedEncodingException unused) {
                throw FormatException.a();
            }
        } else {
            throw FormatException.a();
        }
    }

    public static void p(m90 m90, StringBuilder sb, int i2) {
        while (i2 >= 3) {
            if (m90.a() >= 10) {
                int b2 = m90.b(10);
                if (b2 < 1000) {
                    sb.append(D(b2 / 100));
                    sb.append(D((b2 / 10) % 10));
                    sb.append(D(b2 % 10));
                    i2 -= 3;
                } else {
                    throw FormatException.a();
                }
            } else {
                throw FormatException.a();
            }
        }
        if (i2 == 2) {
            if (m90.a() >= 7) {
                int b3 = m90.b(7);
                if (b3 < 100) {
                    sb.append(D(b3 / 10));
                    sb.append(D(b3 % 10));
                    return;
                }
                throw FormatException.a();
            }
            throw FormatException.a();
        } else if (i2 != 1) {
        } else {
            if (m90.a() >= 4) {
                int b4 = m90.b(4);
                if (b4 < 10) {
                    sb.append(D(b4));
                    return;
                }
                throw FormatException.a();
            }
            throw FormatException.a();
        }
    }

    public static void q(ArrayList arrayList) {
        boolean z;
        boolean z2;
        HashMap hashMap = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i2 = 0;
            if (it.hasNext()) {
                gv0 gv0 = (gv0) it.next();
                gd1 gd1 = new gd1(gv0);
                Iterator it2 = gv0.b.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        av5 av5 = (av5) it2.next();
                        if (gv0.e == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        hd1 hd1 = new hd1(av5, !z2);
                        if (!hashMap.containsKey(hd1)) {
                            hashMap.put(hd1, new HashSet());
                        }
                        Set set = (Set) hashMap.get(hd1);
                        if (set.isEmpty() || !z2) {
                            set.add(gd1);
                        } else {
                            rf2.q(av5, ".", "Multiple components provide ");
                            return;
                        }
                    }
                }
            } else {
                for (Set<gd1> it3 : hashMap.values()) {
                    for (gd1 gd12 : it3) {
                        for (zp1 zp1 : gd12.a.c) {
                            if (zp1.c == 0) {
                                av5 av52 = zp1.a;
                                if (zp1.b == 2) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                Set<gd1> set2 = (Set) hashMap.get(new hd1(av52, z));
                                if (set2 != null) {
                                    for (gd1 gd13 : set2) {
                                        gd12.b.add(gd13);
                                        gd13.c.add(gd12);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                for (Set addAll : hashMap.values()) {
                    hashSet.addAll(addAll);
                }
                HashSet hashSet2 = new HashSet();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    gd1 gd14 = (gd1) it4.next();
                    if (gd14.c.isEmpty()) {
                        hashSet2.add(gd14);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    gd1 gd15 = (gd1) hashSet2.iterator().next();
                    hashSet2.remove(gd15);
                    i2++;
                    Iterator it5 = gd15.b.iterator();
                    while (it5.hasNext()) {
                        gd1 gd16 = (gd1) it5.next();
                        gd16.c.remove(gd15);
                        if (gd16.c.isEmpty()) {
                            hashSet2.add(gd16);
                        }
                    }
                }
                if (i2 != arrayList.size()) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it6 = hashSet.iterator();
                    while (it6.hasNext()) {
                        gd1 gd17 = (gd1) it6.next();
                        if (!gd17.c.isEmpty() && !gd17.b.isEmpty()) {
                            arrayList2.add(gd17.a);
                        }
                    }
                    throw new RuntimeException("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
                }
                return;
            }
        }
    }

    public static final byte[] r(CharsetEncoder charsetEncoder, CharSequence charSequence, int i2, int i3) {
        charsetEncoder.getClass();
        charSequence.getClass();
        if (charSequence instanceof String) {
            if (i2 == 0) {
                String str = (String) charSequence;
                if (i3 == str.length()) {
                    byte[] bytes = str.getBytes(charsetEncoder.charset());
                    bytes.getClass();
                    return bytes;
                }
            }
            byte[] bytes2 = ((String) charSequence).substring(i2, i3).getBytes(charsetEncoder.charset());
            bytes2.getClass();
            return bytes2;
        }
        ByteBuffer encode = charsetEncoder.encode(CharBuffer.wrap(charSequence, i2, i3));
        byte[] bArr = null;
        if (encode.hasArray() && encode.arrayOffset() == 0) {
            byte[] array = encode.array();
            if (array.length == encode.remaining()) {
                bArr = array;
            }
        }
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = new byte[encode.remaining()];
        encode.get(bArr2);
        return bArr2;
    }

    public static final String s(long j2, String str, Locale locale, LinkedHashMap linkedHashMap) {
        String h2 = f21.h("S:", str, locale.toLanguageTag());
        Object obj = linkedHashMap.get(h2);
        DateFormat dateFormat = obj;
        if (obj == null) {
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            instanceForSkeleton.setTimeZone(TimeZone.GMT_ZONE);
            linkedHashMap.put(h2, instanceForSkeleton);
            dateFormat = instanceForSkeleton;
        }
        return ((DateFormat) dateFormat).format(new Date(j2));
    }

    public static final uu t(j77 j77) {
        j77.getClass();
        be1 be1 = ((m77) j77).i;
        tu tuVar = uu.a;
        LinkedHashMap linkedHashMap = be1.a;
        tuVar.getClass();
        String str = tu.x;
        Object obj = linkedHashMap.get(str);
        if (!(obj instanceof uu)) {
            obj = null;
        }
        uu uuVar = (uu) obj;
        if (uuVar != null) {
            return uuVar;
        }
        StringBuilder q2 = b81.q("Plugin ", str, " not installed or not of type ");
        c26 c26 = b26.a;
        Class<uu> cls = uu.class;
        q2.append(c26.b(cls).A());
        q2.append(". Consider installing ");
        h.o(q2, c26.b(cls).A(), " within your SupabaseClientBuilder");
        return null;
    }

    public static final gq3 u(ll6 ll6) {
        ll6.getClass();
        if (ll6 instanceof w51) {
            return ((w51) ll6).b;
        }
        if (ll6 instanceof ml6) {
            return u(((ml6) ll6).a);
        }
        return null;
    }

    public static final x83 v() {
        x83 x83 = n;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("Filled.Email", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
        int i2 = e38.a;
        ky6 ky6 = new ky6(jt0.b);
        be5 f2 = b81.f(20.0f, 4.0f, 4.0f, 4.0f);
        f2.e(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        f2.h(2.0f, 18.0f);
        f2.e(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        f2.g(16.0f);
        f2.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        f2.h(22.0f, 6.0f);
        f2.e(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        f2.c();
        f2.j(20.0f, 8.0f);
        f2.i(-8.0f, 5.0f);
        f2.i(-8.0f, -5.0f);
        f2.h(4.0f, 6.0f);
        f2.i(8.0f, 5.0f);
        f2.i(8.0f, -5.0f);
        f2.n(2.0f);
        f2.c();
        w83.a(w83, f2.a, ky6, 14336);
        x83 b2 = w83.b();
        n = b2;
        return b2;
    }

    public static final x83 w() {
        x83 x83 = o;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("Rounded.Help", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
        int i2 = e38.a;
        ky6 ky6 = new ky6(jt0.b);
        be5 e2 = pb4.e(12.0f, 2.0f);
        e2.d(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        e2.l(4.48f, 10.0f, 10.0f, 10.0f);
        e2.l(10.0f, -4.48f, 10.0f, -10.0f);
        e2.k(17.52f, 2.0f, 12.0f, 2.0f);
        e2.c();
        e2.j(13.0f, 19.0f);
        e2.g(-2.0f);
        e2.n(-2.0f);
        e2.g(2.0f);
        e2.n(2.0f);
        e2.c();
        e2.j(15.07f, 11.25f);
        e2.i(-0.9f, 0.92f);
        e2.e(-0.5f, 0.51f, -0.86f, 0.97f, -1.04f, 1.69f);
        e2.e(-0.08f, 0.32f, -0.13f, 0.68f, -0.13f, 1.14f);
        e2.g(-2.0f);
        e2.n(-0.5f);
        e2.e(0.0f, -0.46f, 0.08f, -0.9f, 0.22f, -1.31f);
        e2.e(0.2f, -0.58f, 0.53f, -1.1f, 0.95f, -1.52f);
        e2.i(1.24f, -1.26f);
        e2.e(0.46f, -0.44f, 0.68f, -1.1f, 0.55f, -1.8f);
        e2.e(-0.13f, -0.72f, -0.69f, -1.33f, -1.39f, -1.53f);
        e2.e(-1.11f, -0.31f, -2.14f, 0.32f, -2.47f, 1.27f);
        e2.e(-0.12f, 0.37f, -0.43f, 0.65f, -0.82f, 0.65f);
        e2.g(-0.3f);
        e2.d(8.4f, 9.0f, 8.0f, 8.44f, 8.16f, 7.88f);
        e2.e(0.43f, -1.47f, 1.68f, -2.59f, 3.23f, -2.83f);
        e2.e(1.52f, -0.24f, 2.97f, 0.55f, 3.87f, 1.8f);
        e2.e(1.18f, 1.63f, 0.83f, 3.38f, -0.19f, 4.4f);
        e2.c();
        w83.a(w83, e2.a, ky6, 14336);
        x83 b2 = w83.b();
        o = b2;
        return b2;
    }

    public static final x83 x() {
        x83 x83 = s;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("Rounded.Lock", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
        int i2 = e38.a;
        ky6 ky6 = new ky6(jt0.b);
        be5 be5 = new be5();
        be5.j(18.0f, 8.0f);
        be5.g(-1.0f);
        be5.h(17.0f, 6.0f);
        be5.e(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        be5.k(7.0f, 3.24f, 7.0f, 6.0f);
        be5.n(2.0f);
        be5.h(6.0f, 8.0f);
        be5.e(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        be5.n(10.0f);
        be5.e(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        be5.g(12.0f);
        be5.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        be5.h(20.0f, 10.0f);
        be5.e(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        be5.c();
        be5.j(12.0f, 17.0f);
        be5.e(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        be5.l(0.9f, -2.0f, 2.0f, -2.0f);
        be5.l(2.0f, 0.9f, 2.0f, 2.0f);
        be5.l(-0.9f, 2.0f, -2.0f, 2.0f);
        b81.v(be5, 9.0f, 8.0f, 9.0f, 6.0f);
        be5.e(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f);
        be5.l(3.0f, 1.34f, 3.0f, 3.0f);
        be5.n(2.0f);
        be5.h(9.0f, 8.0f);
        be5.c();
        w83.a(w83, be5.a, ky6, 14336);
        x83 b2 = w83.b();
        s = b2;
        return b2;
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [nz3, ge6, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v5, types: [nz3, java.lang.Object, jt7] */
    public static nz3 y(i44 i44, sr2 sr2) {
        xb4 xb4 = xb4.c0;
        int ordinal = i44.ordinal();
        if (ordinal == 0) {
            return new z97(sr2);
        }
        if (ordinal == 1) {
            ? obj = new Object();
            obj.w = sr2;
            obj.x = xb4;
            return obj;
        } else if (ordinal == 2) {
            ? obj2 = new Object();
            obj2.w = sr2;
            obj2.x = xb4;
            return obj2;
        } else {
            h.c();
            return null;
        }
    }

    public static z97 z(sr2 sr2) {
        sr2.getClass();
        return new z97(sr2);
    }
}
