package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import io.github.jan.supabase.auth.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: p25  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class p25 {
    public static final /* synthetic */ int a = 0;
    public static x83 b;
    public static x83 c;
    public static Thread d;

    public static final bt5 A(qs5 qs5, wv1 wv1) {
        qs5.getClass();
        wv1.getClass();
        int i = qs5.y;
        if ((i & 32) == 32) {
            return qs5.F;
        }
        if ((i & 64) == 64) {
            return wv1.a(qs5.G);
        }
        return null;
    }

    public static final bt5 B(js5 js5, wv1 wv1) {
        js5.getClass();
        wv1.getClass();
        int i = js5.y;
        if ((i & 8) == 8) {
            bt5 bt5 = js5.C;
            bt5.getClass();
            return bt5;
        } else if ((i & 16) == 16) {
            return wv1.a(js5.D);
        } else {
            h.s("No returnType in ProtoBuf.Function");
            return null;
        }
    }

    public static final bt5 C(qs5 qs5, wv1 wv1) {
        qs5.getClass();
        wv1.getClass();
        int i = qs5.y;
        if ((i & 8) == 8) {
            bt5 bt5 = qs5.C;
            bt5.getClass();
            return bt5;
        } else if ((i & 16) == 16) {
            return wv1.a(qs5.D);
        } else {
            h.s("No returnType in ProtoBuf.Property");
            return null;
        }
    }

    public static final List D(tr5 tr5, wv1 wv1) {
        tr5.getClass();
        wv1.getClass();
        List list = tr5.D;
        if (list.isEmpty()) {
            list = null;
        }
        if (list == null) {
            List<Integer> list2 = tr5.E;
            list2.getClass();
            list = new ArrayList(et0.e0(list2, 10));
            for (Integer num : list2) {
                num.getClass();
                list.add(wv1.a(num.intValue()));
            }
        }
        return list;
    }

    public static final bt5 E(jt5 jt5, wv1 wv1) {
        jt5.getClass();
        wv1.getClass();
        int i = jt5.y;
        if ((i & 4) == 4) {
            bt5 bt5 = jt5.B;
            bt5.getClass();
            return bt5;
        } else if ((i & 8) == 8) {
            return wv1.a(jt5.C);
        } else {
            h.s("No type in ProtoBuf.ValueParameter");
            return null;
        }
    }

    public static final bt5 F(dt5 dt5, wv1 wv1) {
        wv1.getClass();
        int i = dt5.y;
        if ((i & 4) == 4) {
            bt5 bt5 = dt5.C;
            bt5.getClass();
            return bt5;
        } else if ((i & 8) == 8) {
            return wv1.a(dt5.D);
        } else {
            h.s("No underlyingType in ProtoBuf.TypeAlias");
            return null;
        }
    }

    public static final List G(gt5 gt5, wv1 wv1) {
        gt5.getClass();
        wv1.getClass();
        List list = gt5.D;
        if (list.isEmpty()) {
            list = null;
        }
        if (list == null) {
            List<Integer> list2 = gt5.E;
            list2.getClass();
            list = new ArrayList(et0.e0(list2, 10));
            for (Integer num : list2) {
                num.getClass();
                list.add(wv1.a(num.intValue()));
            }
        }
        return list;
    }

    public static void H(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }

    public static Object I(Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        String canonicalName = cls.getCanonicalName();
        h.s(f21.l(f21.o("Invalid conditional user property field type. '", str, "' expected [", canonicalName, "] but was ["), obj2.getClass().getCanonicalName(), "]"));
        return null;
    }

    public static final l96 a(float f, float f2, float f3, float f4, long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long floatToRawIntBits = (((long) Float.floatToRawIntBits(intBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(intBitsToFloat2)));
        return new l96(f, f2, f3, f4, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        if (r0 == null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r1 == null) goto L_0x001b;
     */
    public static final w78 b(w78 w78, o78 o78) {
        String str;
        String str2;
        if (o78 != null) {
            str = o78.a;
        } else {
            str = w78.a;
        }
        String str3 = str;
        String str4 = null;
        if (o78 != null) {
            str2 = o78.b;
            if (d57.I0(str2)) {
                str2 = null;
            }
        }
        str2 = w78.b;
        String str5 = str2;
        if (o78 != null) {
            String str6 = o78.c;
            if (!d57.I0(str6)) {
                str4 = str6;
            }
        }
        str4 = w78.c;
        return w78.a(w78, str3, str5, str4, false, 8);
    }

    public static final void c(Logger logger, vb7 vb7, ac7 ac7, String str) {
        logger.fine(ac7.b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + vb7.a);
    }

    public static void d(int i, Object[] objArr) {
        int i2 = 0;
        while (i2 < i) {
            if (objArr[i2] != null) {
                i2++;
            } else {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i2);
                throw new NullPointerException(sb.toString());
            }
        }
    }

    public static int e(iz5 iz5, t22 t22, View view, View view2, xy5 xy5, boolean z) {
        if (xy5.v() == 0 || iz5.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(xy5.H(view) - xy5.H(view2)) + 1;
        }
        return Math.min(t22.n(), t22.d(view2) - t22.g(view));
    }

    public static int f(iz5 iz5, t22 t22, View view, View view2, xy5 xy5, boolean z, boolean z2) {
        int i;
        if (xy5.v() == 0 || iz5.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(xy5.H(view), xy5.H(view2));
        int max = Math.max(xy5.H(view), xy5.H(view2));
        if (z2) {
            i = Math.max(0, (iz5.b() - max) - 1);
        } else {
            i = Math.max(0, min);
        }
        if (!z) {
            return i;
        }
        return Math.round((((float) i) * (((float) Math.abs(t22.d(view2) - t22.g(view))) / ((float) (Math.abs(xy5.H(view) - xy5.H(view2)) + 1)))) + ((float) (t22.m() - t22.g(view))));
    }

    public static int g(iz5 iz5, t22 t22, View view, View view2, xy5 xy5, boolean z) {
        if (xy5.v() == 0 || iz5.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return iz5.b();
        }
        return (int) ((((float) (t22.d(view2) - t22.g(view))) / ((float) (Math.abs(xy5.H(view) - xy5.H(view2)) + 1))) * ((float) iz5.b()));
    }

    public static final List h(tr5 tr5, wv1 wv1) {
        tr5.getClass();
        wv1.getClass();
        List list = tr5.I;
        if (list.isEmpty()) {
            list = null;
        }
        if (list == null) {
            List<Integer> list2 = tr5.J;
            list2.getClass();
            list = new ArrayList(et0.e0(list2, 10));
            for (Integer num : list2) {
                num.getClass();
                list.add(wv1.a(num.intValue()));
            }
        }
        return list;
    }

    public static final List i(js5 js5, wv1 wv1) {
        js5.getClass();
        wv1.getClass();
        List list = js5.H;
        if (list.isEmpty()) {
            list = null;
        }
        if (list == null) {
            List<Integer> list2 = js5.I;
            list2.getClass();
            list = new ArrayList(et0.e0(list2, 10));
            for (Integer num : list2) {
                num.getClass();
                list.add(wv1.a(num.intValue()));
            }
        }
        return list;
    }

    public static final List j(qs5 qs5, wv1 wv1) {
        qs5.getClass();
        wv1.getClass();
        List list = qs5.H;
        if (list.isEmpty()) {
            list = null;
        }
        if (list == null) {
            List<Integer> list2 = qs5.I;
            list2.getClass();
            list = new ArrayList(et0.e0(list2, 10));
            for (Integer num : list2) {
                num.getClass();
                list.add(wv1.a(num.intValue()));
            }
        }
        return list;
    }

    public static final bt5 k(dt5 dt5, wv1 wv1) {
        wv1.getClass();
        int i = dt5.y;
        if ((i & 16) == 16) {
            bt5 bt5 = dt5.E;
            bt5.getClass();
            return bt5;
        } else if ((i & 32) == 32) {
            return wv1.a(dt5.F);
        } else {
            h.s("No expandedType in ProtoBuf.TypeAlias");
            return null;
        }
    }

    public static final String l(long j) {
        String str;
        if (j <= -999500000) {
            str = f21.k(new StringBuilder(), (j - 500000000) / 1000000000, " s ");
        } else if (j <= -999500) {
            str = f21.k(new StringBuilder(), (j - 500000) / 1000000, " ms");
        } else if (j <= 0) {
            str = f21.k(new StringBuilder(), (j - 500) / 1000, " µs");
        } else if (j < 999500) {
            str = f21.k(new StringBuilder(), (j + 500) / 1000, " µs");
        } else if (j < 999500000) {
            str = f21.k(new StringBuilder(), (j + 500000) / 1000000, " ms");
        } else {
            str = f21.k(new StringBuilder(), (j + 500000000) / 1000000000, " s ");
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    public static ColorStateList m(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        if (r(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(1, typedValue);
            int i = typedValue.type;
            if (i == 2) {
                kj6.k("Failed to resolve attribute at index 1: ", typedValue);
            } else if (i >= 28 && i <= 31) {
                return ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources = typedArray.getResources();
                int resourceId = typedArray.getResourceId(1, 0);
                ThreadLocal threadLocal = wt0.a;
                try {
                    return wt0.a(resources, resources.getXml(resourceId), theme);
                } catch (Exception e) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                    return null;
                }
            }
        }
        return null;
    }

    public static ig n(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        ig igVar;
        if (r(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new ig((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                igVar = ig.d(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception e) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                igVar = null;
            }
            if (igVar != null) {
                return igVar;
            }
        }
        return new ig((Shader) null, (ColorStateList) null, 0);
    }

    public static final x83 o() {
        x83 x83 = b;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("Rounded.Sms", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
        int i = e38.a;
        ky6 ky6 = new ky6(jt0.b);
        be5 f = b81.f(20.0f, 2.0f, 4.0f, 2.0f);
        f.e(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        f.n(18.0f);
        f.i(4.0f, -4.0f);
        f.g(14.0f);
        f.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        f.h(22.0f, 4.0f);
        f.e(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        b81.v(f, 9.0f, 11.0f, 7.0f, 11.0f);
        f.h(7.0f, 9.0f);
        f.g(2.0f);
        f.n(2.0f);
        f.c();
        f.j(13.0f, 11.0f);
        f.g(-2.0f);
        f.h(11.0f, 9.0f);
        f.g(2.0f);
        f.n(2.0f);
        f.c();
        f.j(17.0f, 11.0f);
        f.g(-2.0f);
        f.h(15.0f, 9.0f);
        f.g(2.0f);
        f.n(2.0f);
        f.c();
        w83.a(w83, f.a, ky6, 14336);
        x83 b2 = w83.b();
        b = b2;
        return b2;
    }

    public static final x83 p() {
        x83 x83 = c;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("Rounded.ThumbUp", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
        int i = e38.a;
        ky6 ky6 = new ky6(jt0.b);
        be5 f = b81.f(13.12f, 2.06f, 7.58f, 7.6f);
        f.e(-0.37f, 0.37f, -0.58f, 0.88f, -0.58f, 1.41f);
        f.m(19.0f);
        f.e(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        f.g(9.0f);
        f.e(0.8f, 0.0f, 1.52f, -0.48f, 1.84f, -1.21f);
        f.i(3.26f, -7.61f);
        f.d(23.94f, 10.2f, 22.49f, 8.0f, 20.34f, 8.0f);
        f.g(-5.65f);
        f.i(0.95f, -4.58f);
        f.e(0.1f, -0.5f, -0.05f, -1.01f, -0.41f, -1.37f);
        f.e(-0.59f, -0.58f, -1.53f, -0.58f, -2.11f, 0.01f);
        f.c();
        f.j(3.0f, 21.0f);
        f.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        f.n(-8.0f);
        f.e(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        f.l(-2.0f, 0.9f, -2.0f, 2.0f);
        f.n(8.0f);
        f.e(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        f.c();
        w83.a(w83, f.a, ky6, 14336);
        x83 b2 = w83.b();
        c = b2;
        return b2;
    }

    public static final Object q(t05 t05, yr3 yr3) {
        t05.getClass();
        yr3.getClass();
        return t05.b();
    }

    public static boolean r(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            return true;
        }
        return false;
    }

    public static final void s(uu uuVar) {
        a aVar = (a) uuVar;
        if (aVar.f.w.getValue() instanceof jn6) {
            aVar.u(new kn6(false));
        }
    }

    public static final boolean t(l96 l96) {
        long j = l96.e;
        if ((j >>> 32) == (4294967295L & j) && j == l96.f && j == l96.g && j == l96.h) {
            return true;
        }
        return false;
    }

    public static y16 u(ri0 ri0, sr2 sr2) {
        if (sr2 != null) {
            return new y16(ri0, sr2);
        }
        h.q("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties.lazySoft must not be null");
        return null;
    }

    public static TypedArray v(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static final bt5 w(bt5 bt5, wv1 wv1) {
        bt5.getClass();
        wv1.getClass();
        int i = bt5.y;
        if ((i & 256) == 256) {
            return bt5.I;
        }
        if ((i & 512) == 512) {
            return wv1.a(bt5.J);
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r48v0, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r48v1, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r48v2, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v1, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r43v2, resolved type: ky6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r43v3, resolved type: lc0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v33, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v2, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v3, resolved type: a42} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x037c  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x037f  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x038f  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x039f  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x03ea  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x03ef  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x040b  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0423  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0430  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0446  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x044a  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x044d  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0453  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0195  */
    public static final vb5 x(int i, yt2 yt2) {
        TypedValue typedValue;
        y83 y83;
        boolean z;
        long j;
        int i2;
        int i3;
        char c2;
        int i4;
        char c3;
        int i5;
        String str;
        a42 a42;
        String str2;
        a42 a422;
        int i6;
        int i7;
        int i8;
        int i9;
        ig n;
        int i10;
        Shader shader;
        kc0 kc0;
        Shader shader2;
        kc0 kc02;
        int i11;
        kc0 ky6;
        String str3;
        int i12 = i;
        yt2 yt22 = yt2;
        Context context = (Context) yt22.k(ye.b);
        Resources resources = (Resources) yt22.k(ye.c);
        r56 r56 = (r56) yt22.k(ye.e);
        synchronized (r56) {
            typedValue = (TypedValue) r56.a.b(i12);
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i12, typedValue, true);
                yo4 yo4 = r56.a;
                int d2 = yo4.d(i12);
                Object[] objArr = yo4.c;
                Object obj = objArr[d2];
                yo4.b[d2] = i12;
                objArr[d2] = typedValue;
            }
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence == null || !d57.A0(charSequence, ".xml")) {
            yt22.e0(-1771643000);
            boolean g = yt22.g(context.getTheme()) | yt22.g(charSequence) | yt22.e(i12);
            Object Q = yt22.Q();
            if (g || Q == ay0.a) {
                try {
                    Drawable drawable = resources.getDrawable(i12, (Resources.Theme) null);
                    drawable.getClass();
                    Q = new hg(((BitmapDrawable) drawable).getBitmap());
                    yt22.o0(Q);
                } catch (Exception e) {
                    throw new RuntimeException("Error attempting to load resource: " + charSequence, e);
                }
            }
            hg hgVar = (hg) Q;
            s90 s90 = new s90(hgVar, (((long) hgVar.a.getHeight()) & 4294967295L) | (((long) hgVar.a.getWidth()) << 32));
            yt22.r(false);
            return s90;
        }
        yt22.e0(-1771798434);
        Resources.Theme theme = context.getTheme();
        int i13 = typedValue.changingConfigurations;
        a93 a93 = (a93) yt22.k(ye.d);
        z83 z83 = new z83(theme, i12);
        WeakReference weakReference = (WeakReference) a93.a.get(z83);
        if (weakReference != null) {
            y83 = (y83) weakReference.get();
        } else {
            y83 = null;
        }
        if (y83 == null) {
            XmlResourceParser xml = resources.getXml(i12);
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            } else if (sg3.e(xml.getName(), "vector")) {
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                ij ijVar = new ij(xml);
                TypedArray v = v(resources, theme, asAttributeSet, x91.a);
                ijVar.b(v.getChangingConfigurations());
                if (!r(xml, "autoMirrored")) {
                    z = false;
                } else {
                    z = v.getBoolean(5, false);
                }
                ijVar.b(v.getChangingConfigurations());
                float a2 = ijVar.a(v, "viewportWidth", 7, 0.0f);
                float a3 = ijVar.a(v, "viewportHeight", 8, 0.0f);
                if (a2 <= 0.0f) {
                    throw new XmlPullParserException(b81.n(v.getPositionDescription(), "<VectorGraphic> tag requires viewportWidth > 0"));
                } else if (a3 > 0.0f) {
                    int i14 = 3;
                    float dimension = v.getDimension(3, 0.0f);
                    ijVar.b(v.getChangingConfigurations());
                    float dimension2 = v.getDimension(2, 0.0f);
                    ijVar.b(v.getChangingConfigurations());
                    if (v.hasValue(1)) {
                        TypedValue typedValue2 = new TypedValue();
                        v.getValue(1, typedValue2);
                        if (typedValue2.type == 2) {
                            j = jt0.g;
                        } else {
                            ColorStateList m = m(v, xml, theme);
                            ijVar.b(v.getChangingConfigurations());
                            if (m != null) {
                                j = uq3.c(m.getDefaultColor());
                            } else {
                                j = jt0.g;
                            }
                        }
                    } else {
                        j = jt0.g;
                    }
                    long j2 = j;
                    int i15 = v.getInt(6, -1);
                    ijVar.b(v.getChangingConfigurations());
                    if (i15 != -1) {
                        if (i15 == 3) {
                            i2 = 3;
                        } else if (i15 != 5) {
                            if (i15 != 9) {
                                switch (i15) {
                                    case 14:
                                        i2 = 13;
                                        break;
                                    case h75.g:
                                        i2 = 14;
                                        break;
                                    case 16:
                                        i2 = 12;
                                        break;
                                }
                            } else {
                                i2 = 9;
                            }
                        }
                        v.recycle();
                        w83 w83 = new w83((String) null, dimension / resources.getDisplayMetrics().density, dimension2 / resources.getDisplayMetrics().density, a2, a3, j2, i2, z, 1);
                        int i16 = 0;
                        while (xml.getEventType() != 1 && (xml.getDepth() >= 1 || xml.getEventType() != i14)) {
                            a42 a423 = a42.w;
                            XmlPullParser xmlPullParser = ijVar.a;
                            xy1 xy1 = ijVar.c;
                            XmlResourceParser xmlResourceParser = xml;
                            int eventType = xmlPullParser.getEventType();
                            int i17 = i13;
                            if (eventType == 2) {
                                String name = xmlPullParser.getName();
                                if (name != null) {
                                    int hashCode = name.hashCode();
                                    if (hashCode != -1649314686) {
                                        i4 = i16;
                                        if (hashCode != 3433509) {
                                            if (hashCode == 98629247 && name.equals("group")) {
                                                TypedArray v2 = v(resources, theme, asAttributeSet, x91.b);
                                                ijVar.b(v2.getChangingConfigurations());
                                                float a4 = ijVar.a(v2, "rotation", 5, 0.0f);
                                                float f = v2.getFloat(1, 0.0f);
                                                ijVar.b(v2.getChangingConfigurations());
                                                float f2 = v2.getFloat(2, 0.0f);
                                                ijVar.b(v2.getChangingConfigurations());
                                                float a5 = ijVar.a(v2, "scaleX", 3, 1.0f);
                                                float a6 = ijVar.a(v2, "scaleY", 4, 1.0f);
                                                float a7 = ijVar.a(v2, "translateX", 6, 0.0f);
                                                float a8 = ijVar.a(v2, "translateY", 7, 0.0f);
                                                String string = v2.getString(0);
                                                ijVar.b(v2.getChangingConfigurations());
                                                if (string == null) {
                                                    str3 = "";
                                                } else {
                                                    str3 = string;
                                                }
                                                v2.recycle();
                                                int i18 = e38.a;
                                                if (w83.k) {
                                                    yb3.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                                }
                                                w83.i.add(new v83(str3, a4, f, f2, a5, a6, a7, a8, a423, 512));
                                                i16 = i4;
                                                c2 = 65535;
                                                i3 = 3;
                                                xmlResourceParser.next();
                                                char c4 = c2;
                                                xml = xmlResourceParser;
                                                i13 = i17;
                                                i14 = i3;
                                            }
                                        } else if (name.equals("path")) {
                                            TypedArray v3 = v(resources, theme, asAttributeSet, x91.c);
                                            ijVar.b(v3.getChangingConfigurations());
                                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                                String string2 = v3.getString(0);
                                                ijVar.b(v3.getChangingConfigurations());
                                                if (string2 == null) {
                                                    str2 = "";
                                                } else {
                                                    str2 = string2;
                                                }
                                                String string3 = v3.getString(2);
                                                ijVar.b(v3.getChangingConfigurations());
                                                if (string3 == null) {
                                                    int i19 = e38.a;
                                                    a422 = a423;
                                                } else {
                                                    ArrayList arrayList = new ArrayList();
                                                    xy1.b(string3, arrayList);
                                                    a422 = arrayList;
                                                }
                                                ig n2 = n(v3, ijVar.a, theme, "fillColor", 1);
                                                ijVar.b(v3.getChangingConfigurations());
                                                float a9 = ijVar.a(v3, "fillAlpha", 12, 1.0f);
                                                if (!r(ijVar.a, "strokeLineCap")) {
                                                    i6 = -1;
                                                } else {
                                                    i6 = v3.getInt(8, -1);
                                                }
                                                ijVar.b(v3.getChangingConfigurations());
                                                if (i6 != 0) {
                                                    if (i6 == 1) {
                                                        i7 = 1;
                                                    } else if (i6 == 2) {
                                                        i7 = 2;
                                                    }
                                                    if (r(ijVar.a, "strokeLineJoin")) {
                                                        i8 = -1;
                                                    } else {
                                                        i8 = v3.getInt(9, -1);
                                                    }
                                                    ijVar.b(v3.getChangingConfigurations());
                                                    if (i8 == 0) {
                                                        if (i8 == 1) {
                                                            i9 = 1;
                                                        } else if (i8 == 2) {
                                                            i9 = 2;
                                                        }
                                                        float a10 = ijVar.a(v3, "strokeMiterLimit", 10, 4.0f);
                                                        n = n(v3, ijVar.a, theme, "strokeColor", 3);
                                                        ijVar.b(v3.getChangingConfigurations());
                                                        float a11 = ijVar.a(v3, "strokeAlpha", 11, 1.0f);
                                                        float a12 = ijVar.a(v3, "strokeWidth", 4, 1.0f);
                                                        float a13 = ijVar.a(v3, "trimPathEnd", 6, 1.0f);
                                                        float a14 = ijVar.a(v3, "trimPathOffset", 7, 0.0f);
                                                        float a15 = ijVar.a(v3, "trimPathStart", 5, 0.0f);
                                                        if (!r(ijVar.a, "fillType")) {
                                                            i10 = 0;
                                                        } else {
                                                            i10 = v3.getInt(13, 0);
                                                        }
                                                        ijVar.b(v3.getChangingConfigurations());
                                                        v3.recycle();
                                                        shader = (Shader) n2.c;
                                                        if (shader == null && n2.b == 0) {
                                                            kc0 = null;
                                                        } else if (shader != null) {
                                                            kc0 = new lc0(shader);
                                                        } else {
                                                            kc0 = new ky6(uq3.c(n2.b));
                                                        }
                                                        shader2 = (Shader) n.c;
                                                        if (shader2 == null && n.b == 0) {
                                                            kc02 = null;
                                                        } else {
                                                            if (shader2 != null) {
                                                                ky6 = new lc0(shader2);
                                                            } else {
                                                                ky6 = new ky6(uq3.c(n.b));
                                                            }
                                                            kc02 = ky6;
                                                        }
                                                        if (i10 == 0) {
                                                            i11 = 0;
                                                        } else {
                                                            i11 = 1;
                                                        }
                                                        if (w83.k) {
                                                            yb3.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                                        }
                                                        ((v83) b81.k(1, w83.i)).j.add(new l38(str2, a422, i11, kc0, a9, kc02, a11, a12, i7, i9, a10, a15, a13, a14));
                                                        i3 = 3;
                                                        i16 = i4;
                                                        c2 = 65535;
                                                        xmlResourceParser.next();
                                                        char c42 = c2;
                                                        xml = xmlResourceParser;
                                                        i13 = i17;
                                                        i14 = i3;
                                                    }
                                                    i9 = 0;
                                                    float a102 = ijVar.a(v3, "strokeMiterLimit", 10, 4.0f);
                                                    n = n(v3, ijVar.a, theme, "strokeColor", 3);
                                                    ijVar.b(v3.getChangingConfigurations());
                                                    float a112 = ijVar.a(v3, "strokeAlpha", 11, 1.0f);
                                                    float a122 = ijVar.a(v3, "strokeWidth", 4, 1.0f);
                                                    float a132 = ijVar.a(v3, "trimPathEnd", 6, 1.0f);
                                                    float a142 = ijVar.a(v3, "trimPathOffset", 7, 0.0f);
                                                    float a152 = ijVar.a(v3, "trimPathStart", 5, 0.0f);
                                                    if (!r(ijVar.a, "fillType")) {
                                                    }
                                                    ijVar.b(v3.getChangingConfigurations());
                                                    v3.recycle();
                                                    shader = (Shader) n2.c;
                                                    if (shader == null && n2.b == 0) {
                                                    }
                                                    shader2 = (Shader) n.c;
                                                    if (shader2 == null && n.b == 0) {
                                                    }
                                                    if (i10 == 0) {
                                                    }
                                                    if (w83.k) {
                                                    }
                                                    ((v83) b81.k(1, w83.i)).j.add(new l38(str2, a422, i11, kc0, a9, kc02, a112, a122, i7, i9, a102, a152, a132, a142));
                                                    i3 = 3;
                                                    i16 = i4;
                                                    c2 = 65535;
                                                    xmlResourceParser.next();
                                                    char c422 = c2;
                                                    xml = xmlResourceParser;
                                                    i13 = i17;
                                                    i14 = i3;
                                                }
                                                i7 = 0;
                                                if (r(ijVar.a, "strokeLineJoin")) {
                                                }
                                                ijVar.b(v3.getChangingConfigurations());
                                                if (i8 == 0) {
                                                }
                                                i9 = 0;
                                                float a1022 = ijVar.a(v3, "strokeMiterLimit", 10, 4.0f);
                                                n = n(v3, ijVar.a, theme, "strokeColor", 3);
                                                ijVar.b(v3.getChangingConfigurations());
                                                float a1122 = ijVar.a(v3, "strokeAlpha", 11, 1.0f);
                                                float a1222 = ijVar.a(v3, "strokeWidth", 4, 1.0f);
                                                float a1322 = ijVar.a(v3, "trimPathEnd", 6, 1.0f);
                                                float a1422 = ijVar.a(v3, "trimPathOffset", 7, 0.0f);
                                                float a1522 = ijVar.a(v3, "trimPathStart", 5, 0.0f);
                                                if (!r(ijVar.a, "fillType")) {
                                                }
                                                ijVar.b(v3.getChangingConfigurations());
                                                v3.recycle();
                                                shader = (Shader) n2.c;
                                                if (shader == null && n2.b == 0) {
                                                }
                                                shader2 = (Shader) n.c;
                                                if (shader2 == null && n.b == 0) {
                                                }
                                                if (i10 == 0) {
                                                }
                                                if (w83.k) {
                                                }
                                                ((v83) b81.k(1, w83.i)).j.add(new l38(str2, a422, i11, kc0, a9, kc02, a1122, a1222, i7, i9, a1022, a1522, a1322, a1422));
                                                i3 = 3;
                                                i16 = i4;
                                                c2 = 65535;
                                                xmlResourceParser.next();
                                                char c4222 = c2;
                                                xml = xmlResourceParser;
                                                i13 = i17;
                                                i14 = i3;
                                            } else {
                                                h.q("No path data available");
                                                return null;
                                            }
                                        }
                                    } else {
                                        i4 = i16;
                                        String str4 = "";
                                        c2 = 65535;
                                        i3 = 3;
                                        if (!name.equals("clip-path")) {
                                            i16 = i4;
                                            xmlResourceParser.next();
                                            char c42222 = c2;
                                            xml = xmlResourceParser;
                                            i13 = i17;
                                            i14 = i3;
                                        } else {
                                            TypedArray v4 = v(resources, theme, asAttributeSet, x91.d);
                                            ijVar.b(v4.getChangingConfigurations());
                                            String string4 = v4.getString(0);
                                            ijVar.b(v4.getChangingConfigurations());
                                            if (string4 == null) {
                                                str = str4;
                                            } else {
                                                str = string4;
                                            }
                                            String string5 = v4.getString(1);
                                            ijVar.b(v4.getChangingConfigurations());
                                            if (string5 == null) {
                                                int i20 = e38.a;
                                                a42 = a423;
                                            } else {
                                                ArrayList arrayList2 = new ArrayList();
                                                xy1.b(string5, arrayList2);
                                                a42 = arrayList2;
                                            }
                                            v4.recycle();
                                            if (w83.k) {
                                                yb3.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                            }
                                            w83.i.add(new v83(str, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, a42, 512));
                                            i16 = i4 + 1;
                                            xmlResourceParser.next();
                                            char c422222 = c2;
                                            xml = xmlResourceParser;
                                            i13 = i17;
                                            i14 = i3;
                                        }
                                    }
                                } else {
                                    i4 = i16;
                                }
                                c3 = 65535;
                                i5 = 3;
                            } else if (eventType == i14 && "group".equals(xmlPullParser.getName())) {
                                int i21 = i16 + 1;
                                int i22 = 0;
                                while (i22 < i21) {
                                    ArrayList arrayList3 = w83.i;
                                    if (w83.k) {
                                        yb3.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    }
                                    v83 v83 = (v83) arrayList3.remove(arrayList3.size() - 1);
                                    ArrayList arrayList4 = ((v83) b81.k(1, arrayList3)).j;
                                    String str5 = v83.a;
                                    float f3 = v83.b;
                                    float f4 = v83.c;
                                    float f5 = f4;
                                    arrayList4.add(new b38(str5, f3, f5, v83.d, v83.e, v83.f, v83.g, v83.h, v83.i, v83.j));
                                    i22++;
                                    i14 = 3;
                                }
                                i3 = i14;
                                i16 = 0;
                                c2 = 65535;
                                xmlResourceParser.next();
                                char c4222222 = c2;
                                xml = xmlResourceParser;
                                i13 = i17;
                                i14 = i3;
                            } else {
                                i4 = i16;
                                i5 = i14;
                                c3 = 65535;
                            }
                            i16 = i4;
                            xmlResourceParser.next();
                            char c42222222 = c2;
                            xml = xmlResourceParser;
                            i13 = i17;
                            i14 = i3;
                        }
                        y83 = new y83(i13 | ijVar.b, w83.b());
                        a93.a.put(z83, new WeakReference(y83));
                    }
                    i2 = 5;
                    v.recycle();
                    w83 w832 = new w83((String) null, dimension / resources.getDisplayMetrics().density, dimension2 / resources.getDisplayMetrics().density, a2, a3, j2, i2, z, 1);
                    int i162 = 0;
                    while (xml.getEventType() != 1 && (xml.getDepth() >= 1 || xml.getEventType() != i14)) {
                    }
                    y83 = new y83(i13 | ijVar.b, w832.b());
                    a93.a.put(z83, new WeakReference(y83));
                } else {
                    throw new XmlPullParserException(b81.n(v.getPositionDescription(), "<VectorGraphic> tag requires viewportHeight > 0"));
                }
            } else {
                h.q("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                return null;
            }
        }
        k38 q = o55.q(y83.a, yt22);
        yt22.r(false);
        return q;
    }

    public static ml4 y(ml4 ml4, nh nhVar) {
        return ml4.d(new mk5(nhVar));
    }

    public static final bt5 z(js5 js5, wv1 wv1) {
        js5.getClass();
        wv1.getClass();
        int i = js5.y;
        if ((i & 32) == 32) {
            return js5.F;
        }
        if ((i & 64) == 64) {
            return wv1.a(js5.G);
        }
        return null;
    }
}
