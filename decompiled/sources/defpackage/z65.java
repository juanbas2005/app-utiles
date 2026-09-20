package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import cu.lestebang.utiletecsa.R;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;

/* renamed from: z65  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class z65 {
    public static x83 a;
    public static x83 b;

    public static final x83 C() {
        x83 x83 = a;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("Rounded.Person", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
        int i = e38.a;
        ky6 ky6 = new ky6(jt0.b);
        be5 e = pb4.e(12.0f, 12.0f);
        e.e(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        e.l(-1.79f, -4.0f, -4.0f, -4.0f);
        e.l(-4.0f, 1.79f, -4.0f, 4.0f);
        e.l(1.79f, 4.0f, 4.0f, 4.0f);
        e.c();
        e.j(12.0f, 14.0f);
        e.e(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
        e.n(1.0f);
        e.e(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        e.g(14.0f);
        e.e(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        e.n(-1.0f);
        e.e(0.0f, -2.66f, -5.33f, -4.0f, -8.0f, -4.0f);
        e.c();
        w83.a(w83, e.a, ky6, 14336);
        x83 b2 = w83.b();
        a = b2;
        return b2;
    }

    public static boolean E(Comparator comparator, Collection collection) {
        Object obj;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            obj = ((SortedSet) collection).comparator();
            if (obj == null) {
                obj = er4.w;
            }
        } else if (!(collection instanceof v93)) {
            return false;
        } else {
            obj = ((v93) collection).z;
        }
        return comparator.equals(obj);
    }

    public static int F(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        h.q(hl6.k(i, "type needs to be >= FIRST and <= LAST, type="));
        return 0;
    }

    public static final void J(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        float f;
        int i2 = i;
        if (i2 == 0) {
            yb3.a("At least one point must be provided");
        }
        int i3 = 2;
        if (2 >= i2) {
            i3 = i2 - 1;
        }
        int i4 = i3 + 1;
        float[][] fArr4 = new float[i4][];
        for (int i5 = 0; i5 < i4; i5++) {
            fArr4[i5] = new float[i2];
        }
        for (int i6 = 0; i6 < i2; i6++) {
            fArr4[0][i6] = 1.0f;
            for (int i7 = 1; i7 < i4; i7++) {
                fArr4[i7][i6] = fArr4[i7 - 1][i6] * fArr[i6];
            }
        }
        float[][] fArr5 = new float[i4][];
        for (int i8 = 0; i8 < i4; i8++) {
            fArr5[i8] = new float[i2];
        }
        float[][] fArr6 = new float[i4][];
        for (int i9 = 0; i9 < i4; i9++) {
            fArr6[i9] = new float[i4];
        }
        for (int i10 = 0; i10 < i4; i10++) {
            float[] fArr7 = fArr5[i10];
            float[] fArr8 = fArr4[i10];
            fArr8.getClass();
            fArr7.getClass();
            System.arraycopy(fArr8, 0, fArr7, 0, i2);
            for (int i11 = 0; i11 < i10; i11++) {
                float[] fArr9 = fArr5[i11];
                float u = u(fArr7, fArr9);
                for (int i12 = 0; i12 < i2; i12++) {
                    fArr7[i12] = fArr7[i12] - (fArr9[i12] * u);
                }
            }
            float sqrt = (float) Math.sqrt((double) u(fArr7, fArr7));
            if (sqrt < 1.0E-6f) {
                sqrt = 1.0E-6f;
            }
            float f2 = 1.0f / sqrt;
            for (int i13 = 0; i13 < i2; i13++) {
                fArr7[i13] = fArr7[i13] * f2;
            }
            float[] fArr10 = fArr6[i10];
            for (int i14 = 0; i14 < i4; i14++) {
                if (i14 < i10) {
                    f = 0.0f;
                } else {
                    f = u(fArr7, fArr4[i14]);
                }
                fArr10[i14] = f;
            }
        }
        for (int i15 = i3; -1 < i15; i15--) {
            float u2 = u(fArr5[i15], fArr2);
            float[] fArr11 = fArr6[i15];
            int i16 = i15 + 1;
            if (i16 <= i3) {
                int i17 = i3;
                while (true) {
                    u2 -= fArr11[i17] * fArr3[i17];
                    if (i17 == i16) {
                        break;
                    }
                    i17--;
                }
            }
            fArr3[i15] = u2 / fArr11[i15];
        }
    }

    public static String L(py6 py6, Charset charset, int i) {
        if ((i & 1) != 0) {
            charset = mo0.a;
        }
        py6.getClass();
        charset.getClass();
        if (charset.equals(mo0.a)) {
            return i95.A(py6);
        }
        return b96.n(charset.newDecoder(), py6);
    }

    public static final String M(String str, String str2, sr2 sr2, sr2 sr22, vr2 vr2) {
        str.getClass();
        str2.getClass();
        vr2.getClass();
        String str3 = (String) sr2.b();
        String O = O(str, b81.n(str3, "Mutable"), str2, str3, b81.n(str3, "(Mutable)"));
        if (O != null) {
            return O;
        }
        String O2 = O(str, str3.concat("MutableMap.MutableEntry"), str2, str3.concat("Map.Entry"), str3.concat("(Mutable)Map.(Mutable)Entry"));
        if (O2 != null) {
            return O2;
        }
        String str4 = (String) sr22.b();
        StringBuilder o = b81.o(str4);
        o.append((String) vr2.y("Array<"));
        String sb = o.toString();
        StringBuilder o2 = b81.o(str4);
        o2.append((String) vr2.y("Array<out "));
        String sb2 = o2.toString();
        StringBuilder o3 = b81.o(str4);
        o3.append((String) vr2.y("Array<(out) "));
        String O3 = O(str, sb, str2, sb2, o3.toString());
        if (O3 != null) {
            return O3;
        }
        return null;
    }

    public static final String N(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            uq4 uq4 = (uq4) it.next();
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(h49.L(uq4));
        }
        return sb.toString();
    }

    public static final String O(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str3.getClass();
        str4.getClass();
        if (!k57.u0(str, str2, false) || !k57.u0(str3, str4, false)) {
            return null;
        }
        String substring = str.substring(str2.length());
        String substring2 = str3.substring(str4.length());
        String concat = str5.concat(substring);
        if (substring.equals(substring2)) {
            return concat;
        }
        if (S(substring, substring2)) {
            return concat.concat("!");
        }
        return null;
    }

    public static pe3 Q(re3 re3, int i) {
        boolean z;
        re3.getClass();
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Integer valueOf = Integer.valueOf(i);
        if (z) {
            int i2 = re3.w;
            int i3 = re3.x;
            if (re3.y <= 0) {
                i = -i;
            }
            return new pe3(i2, i3, i);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    public static final byte[] R(String str, Charset charset) {
        str.getClass();
        charset.getClass();
        Charset charset2 = mo0.a;
        if (!charset.equals(charset2)) {
            return rg3.r(charset.newEncoder(), str, 0, str.length());
        }
        int length = str.length();
        ie1.x(0, length, str.length());
        CharsetEncoder newEncoder = charset2.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        ByteBuffer encode = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).encode(CharBuffer.wrap(str, 0, length));
        if (encode.hasArray() && encode.arrayOffset() == 0) {
            int remaining = encode.remaining();
            byte[] array = encode.array();
            array.getClass();
            if (remaining == array.length) {
                byte[] array2 = encode.array();
                array2.getClass();
                return array2;
            }
        }
        byte[] bArr = new byte[encode.remaining()];
        encode.get(bArr);
        return bArr;
    }

    public static final boolean S(String str, String str2) {
        str.getClass();
        str2.getClass();
        if (str.equals(k57.s0(str2, "?", ""))) {
            return true;
        }
        if (k57.m0(str2, "?", false) && str.concat("?").equals(str2)) {
            return true;
        }
        if (("(" + str + ")?").equals(str2)) {
            return true;
        }
        return false;
    }

    public static final double T(long j) {
        return (((double) (j >>> 11)) * 2048.0d) + ((double) (j & 2047));
    }

    public static final String U(long j, int i) {
        if (j >= 0) {
            rd3.i(i);
            String l = Long.toString(j, i);
            l.getClass();
            return l;
        }
        long j2 = (long) i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        rd3.i(i);
        String l2 = Long.toString(j3, i);
        l2.getClass();
        rd3.i(i);
        String l3 = Long.toString(j4, i);
        l3.getClass();
        return l2.concat(l3);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [re3, pe3] */
    public static re3 V(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new pe3(i, i2 - 1, 1);
        }
        re3 re3 = re3.z;
        return re3.z;
    }

    public static int X(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * -862048943), 15)) * 461845907);
    }

    public static ArrayList Y(Context context) {
        ArrayList arrayList = new ArrayList(r1);
        for (String str : Z(context.getApplicationContext(), "third_party_license_metadata", 0, -1).split("\n")) {
            int indexOf = str.indexOf(32);
            String[] split = str.substring(0, indexOf).split(":");
            if (split.length != 2 || indexOf <= 0) {
                h.s(o55.v("Invalid license meta-data line:\n%s", str));
                return null;
            }
            arrayList.add(new jb9(Integer.parseInt(split[1]), Long.parseLong(split[0]), str.substring(indexOf + 1)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static String Z(Context context, String str, long j, int i) {
        Resources resources = context.getApplicationContext().getResources();
        InputStream openRawResource = resources.openRawResource(resources.getIdentifier(str, "raw", resources.getResourcePackageName(R.raw.keep_third_party_licenses)));
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            openRawResource.skip(j);
            if (i <= 0) {
                i = Integer.MAX_VALUE;
            }
            while (i > 0) {
                int read = openRawResource.read(bArr, 0, Math.min(i, 1024));
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
                i -= read;
            }
            openRawResource.close();
            try {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            } catch (UnsupportedEncodingException e) {
                ku4.o("Unsupported encoding UTF8. This should always be supported.", e);
                return null;
            }
        } catch (IOException e2) {
            ku4.o("Failed to read license or metadata text.", e2);
            return null;
        }
    }

    public static final boolean a(int i, KeyEvent keyEvent) {
        if (((int) (rd3.x(keyEvent) >> 32)) == i) {
            return true;
        }
        return false;
    }

    public static final void b(uy5 uy5, qk5 qk5) {
        qk5 qk52 = qk5;
        md4 md4 = (md4) uy5.x;
        md4.getClass();
        z38 z38 = (z38) md4.c;
        z38 z382 = (z38) md4.b;
        boolean b2 = ub5.b(qk52);
        long j = qk52.b;
        if (b2) {
            qs.S0(0, z382.d.length, (Object) null, z382.d);
            z382.e = 0;
            qs.S0(0, z38.d.length, (Object) null, z38.d);
            z38.e = 0;
            md4.a = 0;
        }
        if (!ub5.d(qk52)) {
            List b3 = qk52.b();
            int size = b3.size();
            for (int i = 0; i < size; i++) {
                b03 b03 = (b03) b3.get(i);
                md4.a(b03.a, l35.e(b03.e, 0));
            }
            md4.a(j, l35.e(qk52.n, 0));
        }
        if (ub5.d(qk52) && j - md4.a > 40) {
            qs.S0(0, z382.d.length, (Object) null, z382.d);
            z382.e = 0;
            qs.S0(0, z38.d.length, (Object) null, z38.d);
            z38.e = 0;
            md4.a = 0;
        }
        md4.a = j;
    }

    public static void e(String str, boolean z) {
        if (!z) {
            h.q(str);
        }
    }

    public static void f(boolean z) {
        if (!z) {
            ku4.v();
        }
    }

    public static void g(Handler handler) {
        String str;
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            if (myLooper != null) {
                str = myLooper.getThread().getName();
            } else {
                str = "null current looper";
            }
            String name = handler.getLooper().getThread().getName();
            int length = String.valueOf(name).length();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + length + 35 + 1);
            f21.v(sb, "Must be called on ", name, " thread, but got ", str);
            rf2.m(sb, ".");
        }
    }

    public static void h(String str) {
        if (TextUtils.isEmpty(str)) {
            h.q("Given String is empty or null");
        }
    }

    public static void i(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            h.q(str2);
        }
    }

    public static void j(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            h.s(str);
        }
    }

    public static void k(Object obj) {
        if (obj == null) {
            ku4.j("null reference");
        }
    }

    public static void l(String str, Object obj) {
        if (obj == null) {
            ku4.j(str);
        }
    }

    public static void m(String str, boolean z) {
        if (!z) {
            h.s(str);
        }
    }

    public static double n(double d, double d2, double d3) {
        if (d2 > d3) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
        } else if (d < d2) {
            return d2;
        } else {
            if (d > d3) {
                return d3;
            }
            return d;
        }
    }

    public static float o(float f, float f2, float f3) {
        if (f2 > f3) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
        } else if (f < f2) {
            return f2;
        } else {
            if (f > f3) {
                return f3;
            }
            return f;
        }
    }

    public static int p(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
        } else if (i < i2) {
            return i2;
        } else {
            if (i > i3) {
                return i3;
            }
            return i;
        }
    }

    public static long q(long j, long j2, long j3) {
        if (j2 > j3) {
            StringBuilder q = hl6.q(j3, "Cannot coerce value to an empty range: maximum ", " is less than minimum ");
            q.append(j2);
            q.append('.');
            throw new IllegalArgumentException(q.toString());
        } else if (j < j2) {
            return j2;
        } else {
            if (j > j3) {
                return j3;
            }
            return j;
        }
    }

    public static long r(long j, sc4 sc4) {
        long j2 = sc4.x;
        long j3 = sc4.w;
        if (sc4.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + sc4 + '.');
        } else if (j < Long.valueOf(j3).longValue()) {
            return Long.valueOf(j3).longValue();
        } else {
            if (j > Long.valueOf(j2).longValue()) {
                return Long.valueOf(j2).longValue();
            }
            return j;
        }
    }

    public static Comparable s(lx1 lx1, lx1 lx12, lx1 lx13) {
        if (lx12.compareTo(lx13) > 0) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + lx13 + " is less than minimum " + lx12 + '.');
        } else if (lx1.compareTo(lx12) < 0) {
            return lx12;
        } else {
            if (lx1.compareTo(lx13) > 0) {
                return lx13;
            }
            return lx1;
        }
    }

    public static final float u(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    public static final Object z(ak6 ak6, nk6 nk6) {
        Object g = ak6.w.g(nk6);
        if (g == null) {
            return null;
        }
        return g;
    }

    public abstract int A(View view);

    public abstract int B(CoordinatorLayout coordinatorLayout);

    public abstract int D();

    public abstract boolean G(float f);

    public abstract boolean H(View view);

    public abstract boolean I(float f, float f2);

    public abstract void K(String str);

    public abstract boolean P(View view, float f);

    public abstract void W(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2);

    public abstract int c(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float d(int i);

    public boolean t(wc6 wc6) {
        return true;
    }

    public abstract int v();

    public abstract int w();

    public abstract int x();

    public abstract int y();
}
