package defpackage;

import android.net.Uri;
import android.os.Build;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: f55  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class f55 {
    public static x83 a;
    public static x83 b;
    public static final /* synthetic */ int c = 0;
    public static long d;
    public static Method e;
    public static Method f;
    public static Method g;
    public static x83 h;

    public static final jj6 a(zc9 zc9, eb0 eb0) {
        boolean z;
        fc1 b2 = zc9.b();
        tt2 tt2 = (tt2) zc9.z;
        if (b2 == fc1.w) {
            z = true;
        } else {
            z = false;
        }
        return new jj6(c(tt2, z, true, eb0), c(tt2, z, false, eb0), z);
    }

    public static final ij6 b(zc9 zc9, tt2 tt2, ij6 ij6) {
        int i;
        int i2;
        fc1 fc1;
        boolean z;
        int i3 = tt2.c;
        int i4 = tt2.b;
        boolean z2 = zc9.x;
        if (z2) {
            i = i4;
        } else {
            i = i3;
        }
        bg7 bg7 = (bg7) tt2.e;
        int i5 = tt2.d;
        pb5 pb5 = new pb5(i, tt2);
        i44 i44 = i44.x;
        nz3 y = rg3.y(i44, pb5);
        if (z2) {
            i2 = i3;
        } else {
            i2 = i4;
        }
        tt2 tt22 = tt2;
        nz3 y2 = rg3.y(i44, new mj6(tt22, i, i2, zc9, y));
        if (1 != ij6.c) {
            return (ij6) y2.getValue();
        }
        if (i == i5) {
            return ij6;
        }
        if (((Number) y.getValue()).intValue() != bg7.b.d(i5)) {
            return (ij6) y2.getValue();
        }
        int i6 = ij6.b;
        long j = bg7.j(i6);
        if (i5 != -1) {
            if (i != i5) {
                fc1 fc12 = fc1.w;
                if (i4 < i3) {
                    fc1 = fc1.x;
                } else if (i4 > i3) {
                    fc1 = fc12;
                } else {
                    fc1 = fc1.y;
                }
                if (fc1 == fc12) {
                    z = true;
                } else {
                    z = false;
                }
                if (!(z ^ z2)) {
                }
            }
            return tt22.b(i);
        }
        int i7 = lg7.c;
        if (i6 == ((int) (j >> 32)) || i6 == ((int) (4294967295L & j))) {
            return (ij6) y2.getValue();
        }
        return tt22.b(i);
    }

    public static final ij6 c(tt2 tt2, boolean z, boolean z2, eb0 eb0) {
        int i;
        long j;
        if (z2) {
            i = tt2.b;
        } else {
            i = tt2.c;
        }
        long A = eb0.A(i, tt2);
        if (z ^ z2) {
            int i2 = lg7.c;
            j = A >> 32;
        } else {
            int i3 = lg7.c;
            j = 4294967295L & A;
        }
        return tt2.b((int) j);
    }

    public static final ij6 d(ij6 ij6, tt2 tt2, int i) {
        return new ij6(((bg7) tt2.e).a(i), i, ij6.c);
    }

    public static s96 f(int i) {
        int i2;
        if ((i & 1) != 0) {
            i2 = 8;
        } else {
            i2 = 10;
        }
        float f2 = (float) i2;
        float cos = 1.0f / ((float) Math.cos((double) (j18.b / f2)));
        y71 y71 = new y71(2, 1.0f);
        float[] fArr = new float[(i2 * 2)];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            long D = jb5.D(j18.e(cos, (j18.b / f2) * 2.0f * ((float) i4)), mh2.a(0.0f, 0.0f));
            int i5 = i3 + 1;
            fArr[i3] = jb5.r(D);
            i3 += 2;
            fArr[i5] = jb5.s(D);
        }
        return a35.b(fArr, y71, (AbstractList) null, 0.0f, 0.0f);
    }

    public static final yc7 g(vo1 vo1) {
        Object obj;
        wc7 wc7 = new wc7();
        h75.t(vo1, ad7.a, new ay5(new ay5(21, (Object) wc7), new no6(1, wc7, wc7.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0, 0, 29)));
        lp4 lp4 = new lp4();
        lp4 lp42 = wc7.a;
        Object[] objArr = lp42.a;
        int i = lp42.b;
        Object obj2 = null;
        int i2 = 0;
        boolean z = true;
        Object obj3 = null;
        while (true) {
            obj = ld7.b;
            if (i2 >= i) {
                break;
            }
            Object obj4 = (xc7) objArr[i2];
            if (!z || obj4 != obj) {
                if (obj4 != obj || obj3 != obj) {
                    if (obj4 != obj) {
                        lp4 lp43 = wc7.b;
                        Object[] objArr2 = lp43.a;
                        int i3 = lp43.b;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= i3) {
                                break;
                            } else if (!((Boolean) ((vr2) objArr2[i4]).y(obj4)).booleanValue()) {
                                break;
                            } else {
                                i4++;
                            }
                        }
                    }
                    lp4.a(obj4);
                    z = false;
                    obj3 = obj4;
                }
                z = false;
            }
            i2++;
        }
        if (!lp4.h()) {
            obj2 = lp4.a[lp4.b - 1];
        }
        if (((xc7) obj2) == obj) {
            lp4.k(lp4.b - 1);
        }
        jp4 jp4 = lp4.c;
        if (jp4 == null) {
            jp4 = new jp4(0, lp4);
            lp4.c = jp4;
        }
        return new yc7(jp4);
    }

    public static final void h(long j, byte[] bArr, int i, int i2, int i3) {
        int i4 = 7 - i2;
        int i5 = 8 - i3;
        if (i5 <= i4) {
            while (true) {
                int i6 = qz2.a[(int) ((j >> (i4 << 3)) & 255)];
                int i7 = i + 1;
                bArr[i] = (byte) (i6 >> 8);
                i += 2;
                bArr[i7] = (byte) i6;
                if (i4 != i5) {
                    i4--;
                } else {
                    return;
                }
            }
        }
    }

    public static final hm5 i(j77 j77, String str) {
        j77.getClass();
        Object obj = ((m77) j77).i.a.get("rest");
        if (!(obj instanceof gm5)) {
            obj = null;
        }
        gm5 gm5 = (gm5) obj;
        if (gm5 != null) {
            return new hm5(gm5, str);
        }
        c26 c26 = b26.a;
        Class<gm5> cls = gm5.class;
        kj6.m("Plugin rest not installed or not of type ", c26.b(cls).A(), ". Consider installing ", c26.b(cls).A(), " within your SupabaseClientBuilder");
        return null;
    }

    public static final String j(Constructor constructor) {
        constructor.getClass();
        Class[] parameterTypes = constructor.getParameterTypes();
        parameterTypes.getClass();
        return qs.f1(parameterTypes, "", "<init>(", ")V", l06.I, 24);
    }

    public static final String k(Field field) {
        field.getClass();
        StringBuilder sb = new StringBuilder();
        String name = field.getName();
        name.getClass();
        sb.append(mn3.a(name));
        sb.append("()");
        Class<?> type = field.getType();
        type.getClass();
        sb.append(m06.b(type));
        return sb.toString();
    }

    public static final String l(Method method) {
        method.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        Class[] parameterTypes = method.getParameterTypes();
        parameterTypes.getClass();
        sb.append(qs.f1(parameterTypes, "", "(", ")", l06.J, 24));
        Class<?> returnType = method.getReturnType();
        returnType.getClass();
        sb.append(m06.b(returnType));
        return sb.toString();
    }

    public static final x83 m() {
        x83 x83 = a;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("Filled.Password", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
        int i = e38.a;
        ky6 ky6 = new ky6(jt0.b);
        be5 be5 = new be5();
        be5.j(2.0f, 17.0f);
        be5.g(20.0f);
        be5.n(2.0f);
        be5.f(2.0f);
        be5.m(17.0f);
        be5.c();
        be5.j(3.15f, 12.95f);
        be5.h(4.0f, 11.47f);
        be5.i(0.85f, 1.48f);
        be5.i(1.3f, -0.75f);
        be5.h(5.3f, 10.72f);
        be5.f(7.0f);
        be5.n(-1.5f);
        be5.f(5.3f);
        be5.i(0.85f, -1.47f);
        be5.h(4.85f, 7.0f);
        be5.h(4.0f, 8.47f);
        be5.h(3.15f, 7.0f);
        be5.i(-1.3f, 0.75f);
        be5.h(2.7f, 9.22f);
        be5.f(1.0f);
        be5.n(1.5f);
        be5.g(1.7f);
        be5.h(1.85f, 12.2f);
        be5.h(3.15f, 12.95f);
        be5.c();
        be5.j(9.85f, 12.2f);
        be5.i(1.3f, 0.75f);
        be5.h(12.0f, 11.47f);
        be5.i(0.85f, 1.48f);
        be5.i(1.3f, -0.75f);
        be5.i(-0.85f, -1.48f);
        be5.f(15.0f);
        be5.n(-1.5f);
        be5.g(-1.7f);
        be5.i(0.85f, -1.47f);
        be5.h(12.85f, 7.0f);
        be5.h(12.0f, 8.47f);
        be5.h(11.15f, 7.0f);
        be5.i(-1.3f, 0.75f);
        be5.i(0.85f, 1.47f);
        be5.f(9.0f);
        be5.n(1.5f);
        be5.g(1.7f);
        be5.h(9.85f, 12.2f);
        be5.c();
        be5.j(23.0f, 9.22f);
        be5.g(-1.7f);
        be5.i(0.85f, -1.47f);
        be5.h(20.85f, 7.0f);
        be5.h(20.0f, 8.47f);
        be5.h(19.15f, 7.0f);
        be5.i(-1.3f, 0.75f);
        be5.i(0.85f, 1.47f);
        be5.f(17.0f);
        be5.n(1.5f);
        be5.g(1.7f);
        be5.i(-0.85f, 1.48f);
        be5.i(1.3f, 0.75f);
        be5.h(20.0f, 11.47f);
        be5.i(0.85f, 1.48f);
        be5.i(1.3f, -0.75f);
        be5.i(-0.85f, -1.48f);
        be5.f(23.0f);
        be5.m(9.22f);
        be5.c();
        w83.a(w83, be5.a, ky6, 14336);
        x83 b2 = w83.b();
        a = b2;
        return b2;
    }

    public static final gm5 n(j77 j77) {
        j77.getClass();
        Object obj = ((m77) j77).i.a.get("rest");
        if (!(obj instanceof gm5)) {
            obj = null;
        }
        gm5 gm5 = (gm5) obj;
        if (gm5 != null) {
            return gm5;
        }
        c26 c26 = b26.a;
        Class<gm5> cls = gm5.class;
        kj6.m("Plugin rest not installed or not of type ", c26.b(cls).A(), ". Consider installing ", c26.b(cls).A(), " within your SupabaseClientBuilder");
        return null;
    }

    public static void o(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                rf2.o(cause);
                return;
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean p() {
        if (Build.VERSION.SDK_INT >= 29) {
            return tk7.c();
        }
        Class<Trace> cls = Trace.class;
        try {
            if (e == null) {
                d = cls.getField("TRACE_TAG_APP").getLong((Object) null);
                e = cls.getMethod("isTagEnabled", new Class[]{Long.TYPE});
            }
            return ((Boolean) e.invoke((Object) null, new Object[]{Long.valueOf(d)})).booleanValue();
        } catch (Exception e2) {
            o("isTagEnabled", e2);
            return false;
        }
    }

    public static String q(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            h.q("Invalid input received");
            return null;
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    public static final ph7 r(ll4 ll4, long j, long j2, vr2 vr2) {
        long j3;
        uy3 O0 = rc9.O0(ll4);
        int i = O0.x;
        ny5 rectManager = ((je) xy3.a(O0)).getRectManager();
        qh7 qh7 = rectManager.d;
        qh7.getClass();
        if (j2 == 0) {
            j3 = j;
        } else {
            j3 = j2;
        }
        yo4 yo4 = qh7.a;
        ll4 ll42 = ll4;
        ph7 ph7 = new ph7(qh7, i, j, j3, ll42, vr2);
        Object b2 = yo4.b(i);
        if (b2 == null) {
            yo4.i(i, ph7);
            b2 = ph7;
        }
        ph7 ph72 = (ph7) b2;
        if (ph72 != ph7) {
            while (true) {
                ph7 ph73 = ph72.f;
                if (ph73 == null) {
                    break;
                }
                ph72 = ph73;
            }
            ph72.f = ph7;
        }
        uy3 O02 = rc9.O0(ll42.w);
        if (ny5.d(O02)) {
            ig igVar = rectManager.c;
            int e2 = rectManager.e(O02);
            long[] jArr = (long[]) igVar.c;
            int i2 = e2 + 2;
            jArr[i2] = (jArr[i2] & 8070450532247928831L) | -8070450532247928832L;
        }
        rectManager.f = true;
        rectManager.k();
        return ph7;
    }

    public static s96 s(int i, y71 y71) {
        y71.getClass();
        float[] fArr = new float[(i * 4)];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f2 = j18.b / ((float) i);
            long e2 = j18.e(1.0f, 2.0f * f2 * ((float) i3));
            fArr[i2] = jb5.r(e2) + 0.0f;
            fArr[i2 + 1] = jb5.s(e2) + 0.0f;
            long e3 = j18.e(0.8f, f2 * ((float) ((i3 * 2) + 1)));
            int i4 = i2 + 3;
            fArr[i2 + 2] = jb5.r(e3) + 0.0f;
            i2 += 4;
            fArr[i4] = jb5.s(e3) + 0.0f;
        }
        return a35.b(fArr, y71, (AbstractList) null, 0.0f, 0.0f);
    }

    public static final lr7 t(String str) {
        int i;
        rd3.i(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char charAt = str.charAt(0);
        if (charAt < '0') {
            i = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i = 0;
        }
        int i3 = 119304647;
        while (i < length) {
            int digit = Character.digit(str.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            int i4 = i2 ^ Integer.MIN_VALUE;
            if (Integer.compare(i4, i3 ^ Integer.MIN_VALUE) > 0) {
                if (i3 != 119304647 || Integer.compare(i4, -1717986919) > 0) {
                    return null;
                }
                i3 = 429496729;
            }
            int i5 = i2 * 10;
            int i6 = digit + i5;
            if (Integer.compare(i6 ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i++;
            i2 = i6;
        }
        return new lr7(i2);
    }

    public static final qr7 u(String str) {
        String str2 = str;
        str2.getClass();
        int i = 10;
        rd3.i(10);
        int length = str2.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char charAt = str2.charAt(0);
        if (charAt < '0') {
            i2 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        }
        long j = 0;
        long j2 = 512409557603043100L;
        while (i2 < length) {
            int digit = Character.digit(str2.charAt(i2), i);
            if (digit < 0) {
                return null;
            }
            long j3 = j ^ Long.MIN_VALUE;
            int i3 = length;
            if (Long.compare(j3, j2 ^ Long.MIN_VALUE) > 0) {
                if (j2 != 512409557603043100L || Long.compare(j3, -7378697629483820647L) > 0) {
                    return null;
                }
                j2 = 1844674407370955161L;
            }
            long j4 = j * 10;
            long j5 = (((long) digit) & 4294967295L) + j4;
            if (Long.compare(j5 ^ Long.MIN_VALUE, j4 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i2++;
            j = j5;
            length = i3;
            i = 10;
        }
        return new qr7(j);
    }

    public static String v(String str) {
        if (str.length() <= 127) {
            return str;
        }
        return str.substring(0, 127);
    }

    public static final void w(int i, String str, String str2) {
        throw new IllegalArgumentException("Expected " + str2 + " at index " + i + ", but was '" + str.charAt(i) + '\'');
    }

    public static final File x(Uri uri) {
        if (!uri.getScheme().equals("file")) {
            throw new IOException("Scheme must be 'file'");
        } else if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new IOException("Did not expect uri to have query");
        } else if (TextUtils.isEmpty(uri.getAuthority())) {
            return new File(uri.getPath());
        } else {
            throw new IOException("Did not expect uri to have authority");
        }
    }

    public static final void y(StringBuilder sb, Iterator it, tz2 tz2) {
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb.append(tz2.n(entry.getKey()));
            sb.append(" : ");
            sb.append(tz2.n(entry.getValue()));
            while (it.hasNext()) {
                sb.append(",\n  ");
                Map.Entry entry2 = (Map.Entry) it.next();
                sb.append(tz2.n(entry2.getKey()));
                sb.append(" : ");
                sb.append(tz2.n(entry2.getValue()));
            }
        }
    }

    public abstract void e();
}
