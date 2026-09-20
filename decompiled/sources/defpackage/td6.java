package defpackage;

import android.graphics.Matrix;
import android.util.Log;
import android.util.Xml;
import com.caverock.androidsvg.SVGParseException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: td6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class td6 {
    public cf4 a;
    public hc6 b;
    public boolean c;
    public int d;
    public boolean e;
    public rd6 f;
    public StringBuilder g;
    public boolean h;
    public StringBuilder i;

    /* JADX WARNING: type inference failed for: r1v127, types: [java.lang.Object[]] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:426:0x06a6  */
    /* JADX WARNING: Removed duplicated region for block: B:463:? A[RETURN, SYNTHETIC] */
    public static void C(dc6 dc6, String str, String str2) {
        am6 am6;
        int i2;
        int i3;
        char c2;
        Boolean bool;
        int i4;
        char c3;
        int i5;
        char c4;
        int i6;
        int i7;
        pb6 pb6;
        String str3;
        int i8;
        int i9;
        char c5;
        pb6 pb62;
        char c6;
        int i10;
        char c7;
        int i11;
        pb6[] pb6Arr;
        pb6 K;
        int i12;
        int i13;
        dc6 dc62 = dc6;
        String str4 = str2;
        if (str4.length() != 0 && !str4.equals("inherit")) {
            int ordinal = qd6.a(str).ordinal();
            if (ordinal == 1) {
                if (!"auto".equals(str4) && str4.startsWith("rect(")) {
                    xs0 xs0 = new xs0(str4.substring(5));
                    xs0.U();
                    pb6 u = u(xs0);
                    xs0.T();
                    pb6 u2 = u(xs0);
                    xs0.T();
                    pb6 u3 = u(xs0);
                    xs0.T();
                    pb6 u4 = u(xs0);
                    xs0.U();
                    if (xs0.s(')') || xs0.v()) {
                        am6 = new am6(24, false);
                        am6.x = u;
                        am6.y = u2;
                        am6.z = u3;
                        am6.A = u4;
                        dc62.L = am6;
                        if (am6 == null) {
                            dc62.w |= 1048576;
                            return;
                        }
                        return;
                    }
                }
                am6 = null;
                dc62.L = am6;
                if (am6 == null) {
                }
            } else if (ordinal == 2) {
                dc62.T = r(str4);
                dc62.w |= 268435456;
            } else if (ordinal == 4) {
                if ("nonzero".equals(str4)) {
                    i2 = 1;
                } else if ("evenodd".equals(str4)) {
                    i2 = 2;
                } else {
                    i2 = 0;
                }
                dc62.g0 = i2;
                dc62.w |= 536870912;
            } else if (ordinal == 5) {
                dc62.G = n(str4);
                dc62.w |= 4096;
            } else if (ordinal == 8) {
                if (str4.equals("ltr")) {
                    i3 = 1;
                } else if (!str4.equals("rtl")) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                dc62.e0 = i3;
                if (i3 != 0) {
                    dc62.w |= 68719476736L;
                }
            } else if (ordinal == 35) {
                dc62.U = r(str4);
                dc62.w |= 1073741824;
            } else if (ordinal == 40) {
                dc62.F = v(str4);
                dc62.w |= 2048;
            } else if (ordinal == 42) {
                switch (str4.hashCode()) {
                    case -1217487446:
                        if (str4.equals("hidden")) {
                            c2 = 0;
                            break;
                        }
                    case -907680051:
                        if (str4.equals("scroll")) {
                            c2 = 1;
                            break;
                        }
                    case 3005871:
                        if (str4.equals("auto")) {
                            c2 = 2;
                            break;
                        }
                    case 466743410:
                        if (str4.equals("visible")) {
                            c2 = 3;
                            break;
                        }
                    default:
                        c2 = 65535;
                        break;
                }
                switch (c2) {
                    case b85.b:
                    case 1:
                        bool = Boolean.FALSE;
                        break;
                    case 2:
                    case 3:
                        bool = Boolean.TRUE;
                        break;
                    default:
                        bool = null;
                        break;
                }
                dc62.K = bool;
                if (bool != null) {
                    dc62.w |= 524288;
                }
            } else if (ordinal != 78) {
                hb6 hb6 = hb6.w;
                if (ordinal == 58) {
                    if (str4.equals("currentColor")) {
                        dc62.V = hb6;
                    } else {
                        try {
                            dc62.V = n(str4);
                        } catch (SVGParseException e2) {
                            Log.w("SVGParser", e2.getMessage());
                            return;
                        }
                    }
                    dc62.w |= 2147483648L;
                } else if (ordinal == 59) {
                    dc62.W = v(str4);
                    dc62.w |= 4294967296L;
                } else if (ordinal == 74) {
                    switch (str4.hashCode()) {
                        case -1074341483:
                            if (str4.equals("middle")) {
                                c3 = 0;
                                break;
                            }
                        case 100571:
                            if (str4.equals("end")) {
                                c3 = 1;
                                break;
                            }
                        case 109757538:
                            if (str4.equals("start")) {
                                c3 = 2;
                                break;
                            }
                        default:
                            c3 = 65535;
                            break;
                    }
                    switch (c3) {
                        case b85.b:
                            i5 = 2;
                            break;
                        case 1:
                            i5 = 3;
                            break;
                        case 2:
                            i5 = 1;
                            break;
                        default:
                            i5 = 0;
                            break;
                    }
                    dc62.f0 = i5;
                    if (i5 != 0) {
                        dc62.w |= 262144;
                    }
                } else if (ordinal != 75) {
                    switch (ordinal) {
                        case 14:
                            if (str4.indexOf(124) < 0) {
                                if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains("|" + str4 + '|')) {
                                    dc62.P = Boolean.valueOf(!str4.equals("none"));
                                    dc62.w |= 16777216;
                                    return;
                                }
                                return;
                            }
                            return;
                        case h75.g:
                            mc6 w = w(str4);
                            dc62.x = w;
                            if (w != null) {
                                dc62.w |= 1;
                                return;
                            }
                            return;
                        case 16:
                            if ("nonzero".equals(str4)) {
                                i7 = 1;
                            } else if ("evenodd".equals(str4)) {
                                i7 = 2;
                            } else {
                                i7 = 0;
                            }
                            dc62.Z = i7;
                            if (i7 != 0) {
                                dc62.w |= 2;
                                return;
                            }
                            return;
                        case 17:
                            Float v = v(str4);
                            dc62.y = v;
                            if (v != null) {
                                dc62.w |= 4;
                                return;
                            }
                            return;
                        case 18:
                            if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains("|" + str4 + '|')) {
                                xs0 xs02 = new xs0(str4);
                                Integer num = null;
                                String str5 = null;
                                int i14 = 0;
                                while (true) {
                                    String N = xs02.N('/', false);
                                    xs02.U();
                                    if (N != null) {
                                        if (num == null || i14 == 0) {
                                            if (!N.equals("normal") && (num != null || (num = (Integer) od6.a.get(N)) == null)) {
                                                if (i14 == 0) {
                                                    switch (N.hashCode()) {
                                                        case -1657669071:
                                                            if (N.equals("oblique")) {
                                                                c5 = 0;
                                                                break;
                                                            }
                                                        case -1178781136:
                                                            if (N.equals("italic")) {
                                                                c5 = 1;
                                                                break;
                                                            }
                                                        case -1039745817:
                                                            if (N.equals("normal")) {
                                                                c5 = 2;
                                                                break;
                                                            }
                                                        default:
                                                            c5 = 65535;
                                                            break;
                                                    }
                                                    switch (c5) {
                                                        case b85.b:
                                                            i14 = 3;
                                                            break;
                                                        case 1:
                                                            i14 = 2;
                                                            break;
                                                        case 2:
                                                            i14 = 1;
                                                            break;
                                                        default:
                                                            i14 = 0;
                                                            break;
                                                    }
                                                    if (i14 != 0) {
                                                        continue;
                                                    }
                                                }
                                                if (str5 == null && N.equals("small-caps")) {
                                                    str5 = N;
                                                }
                                            }
                                        }
                                        try {
                                            pb6 = (pb6) nd6.a.get(N);
                                            if (pb6 == null) {
                                                pb6 = s(N);
                                            }
                                        } catch (SVGParseException unused) {
                                            pb6 = null;
                                        }
                                        if (xs02.s('/')) {
                                            xs02.U();
                                            String M = xs02.M();
                                            if (M != null) {
                                                s(M);
                                            }
                                            xs02.U();
                                        }
                                        if (xs02.v()) {
                                            str3 = null;
                                        } else {
                                            int i15 = xs02.b;
                                            xs02.b = xs02.c;
                                            str3 = ((String) xs02.d).substring(i15);
                                        }
                                        dc62.H = q(str3);
                                        dc62.I = pb6;
                                        if (num == null) {
                                            i8 = 400;
                                        } else {
                                            i8 = num.intValue();
                                        }
                                        dc62.J = Integer.valueOf(i8);
                                        if (i14 == 0) {
                                            i9 = 1;
                                        } else {
                                            i9 = i14;
                                        }
                                        dc62.c0 = i9;
                                        dc62.w |= 122880;
                                        return;
                                    }
                                    return;
                                }
                            }
                            return;
                        case 19:
                            ArrayList q = q(str4);
                            dc62.H = q;
                            if (q != null) {
                                dc62.w |= 8192;
                                return;
                            }
                            return;
                        case 20:
                            try {
                                pb6 pb63 = (pb6) nd6.a.get(str4);
                                if (pb63 == null) {
                                    pb62 = s(str4);
                                } else {
                                    pb62 = pb63;
                                }
                            } catch (SVGParseException unused2) {
                                pb62 = null;
                            }
                            dc62.I = pb62;
                            if (pb62 != null) {
                                dc62.w |= 16384;
                                return;
                            }
                            return;
                        case 21:
                            Integer num2 = (Integer) od6.a.get(str4);
                            dc62.J = num2;
                            if (num2 != null) {
                                dc62.w |= 32768;
                                return;
                            }
                            return;
                        case 22:
                            switch (str4.hashCode()) {
                                case -1657669071:
                                    if (str4.equals("oblique")) {
                                        c6 = 0;
                                        break;
                                    }
                                case -1178781136:
                                    if (str4.equals("italic")) {
                                        c6 = 1;
                                        break;
                                    }
                                case -1039745817:
                                    if (str4.equals("normal")) {
                                        c6 = 2;
                                        break;
                                    }
                                default:
                                    c6 = 65535;
                                    break;
                            }
                            switch (c6) {
                                case b85.b:
                                    i10 = 3;
                                    break;
                                case 1:
                                    i10 = 2;
                                    break;
                                case 2:
                                    i10 = 1;
                                    break;
                                default:
                                    i10 = 0;
                                    break;
                            }
                            dc62.c0 = i10;
                            if (i10 != 0) {
                                dc62.w |= 65536;
                                return;
                            }
                            return;
                        default:
                            switch (ordinal) {
                                case 27:
                                    switch (str4.hashCode()) {
                                        case -933002398:
                                            if (str4.equals("optimizeQuality")) {
                                                c7 = 0;
                                                break;
                                            }
                                        case 3005871:
                                            if (str4.equals("auto")) {
                                                c7 = 1;
                                                break;
                                            }
                                        case 362741610:
                                            if (str4.equals("optimizeSpeed")) {
                                                c7 = 2;
                                                break;
                                            }
                                        default:
                                            c7 = 65535;
                                            break;
                                    }
                                    switch (c7) {
                                        case b85.b:
                                            i11 = 2;
                                            break;
                                        case 1:
                                            i11 = 1;
                                            break;
                                        case 2:
                                            i11 = 3;
                                            break;
                                        default:
                                            i11 = 0;
                                            break;
                                    }
                                    dc62.i0 = i11;
                                    if (i11 != 0) {
                                        dc62.w |= 137438953472L;
                                        return;
                                    }
                                    return;
                                case 28:
                                    String r = r(str4);
                                    dc62.M = r;
                                    dc62.N = r;
                                    dc62.O = r;
                                    dc62.w |= 14680064;
                                    return;
                                case 29:
                                    dc62.M = r(str4);
                                    dc62.w |= 2097152;
                                    return;
                                case 30:
                                    dc62.N = r(str4);
                                    dc62.w |= 4194304;
                                    return;
                                case 31:
                                    dc62.O = r(str4);
                                    dc62.w |= 8388608;
                                    return;
                                default:
                                    switch (ordinal) {
                                        case 62:
                                            if (str4.equals("currentColor")) {
                                                dc62.R = hb6;
                                            } else {
                                                try {
                                                    dc62.R = n(str4);
                                                } catch (SVGParseException e3) {
                                                    Log.w("SVGParser", e3.getMessage());
                                                    return;
                                                }
                                            }
                                            dc62.w |= 67108864;
                                            return;
                                        case 63:
                                            dc62.S = v(str4);
                                            dc62.w |= 134217728;
                                            return;
                                        case 64:
                                            mc6 w2 = w(str4);
                                            dc62.z = w2;
                                            if (w2 != null) {
                                                dc62.w |= 8;
                                                return;
                                            }
                                            return;
                                        case 65:
                                            if ("none".equals(str4)) {
                                                dc62.D = null;
                                                dc62.w |= 512;
                                                return;
                                            }
                                            xs0 xs03 = new xs0(str4);
                                            xs03.U();
                                            if (!xs03.v() && (K = xs03.K()) != null && !K.f()) {
                                                float f2 = K.w;
                                                ArrayList arrayList = new ArrayList();
                                                arrayList.add(K);
                                                while (true) {
                                                    if (!xs03.v()) {
                                                        xs03.T();
                                                        pb6 K2 = xs03.K();
                                                        if (K2 != null && !K2.f()) {
                                                            arrayList.add(K2);
                                                            f2 += K2.w;
                                                        }
                                                    } else if (f2 != 0.0f) {
                                                        pb6Arr = arrayList.toArray(new pb6[arrayList.size()]);
                                                    }
                                                }
                                            }
                                            pb6Arr = null;
                                            dc62.D = pb6Arr;
                                            if (pb6Arr != null) {
                                                dc62.w |= 512;
                                                return;
                                            }
                                            return;
                                        case 66:
                                            dc62.E = s(str4);
                                            dc62.w |= 1024;
                                            return;
                                        case 67:
                                            if ("butt".equals(str4)) {
                                                i12 = 1;
                                            } else if ("round".equals(str4)) {
                                                i12 = 2;
                                            } else if ("square".equals(str4)) {
                                                i12 = 3;
                                            } else {
                                                i12 = 0;
                                            }
                                            dc62.a0 = i12;
                                            if (i12 != 0) {
                                                dc62.w |= 64;
                                                return;
                                            }
                                            return;
                                        case 68:
                                            if ("miter".equals(str4)) {
                                                i13 = 1;
                                            } else if ("round".equals(str4)) {
                                                i13 = 2;
                                            } else if ("bevel".equals(str4)) {
                                                i13 = 3;
                                            } else {
                                                i13 = 0;
                                            }
                                            dc62.b0 = i13;
                                            if (i13 != 0) {
                                                dc62.w |= 128;
                                                return;
                                            }
                                            return;
                                        case 69:
                                            dc62.C = Float.valueOf(p(str4));
                                            dc62.w |= 256;
                                            return;
                                        case 70:
                                            Float v2 = v(str4);
                                            dc62.A = v2;
                                            if (v2 != null) {
                                                dc62.w |= 16;
                                                return;
                                            }
                                            return;
                                        case 71:
                                            try {
                                                dc62.B = s(str4);
                                                dc62.w |= 32;
                                                return;
                                            } catch (SVGParseException unused3) {
                                            }
                                        default:
                                            switch (ordinal) {
                                                case 88:
                                                    if (str4.equals("currentColor")) {
                                                        dc62.X = hb6;
                                                    } else {
                                                        try {
                                                            dc62.X = n(str4);
                                                        } catch (SVGParseException e4) {
                                                            Log.w("SVGParser", e4.getMessage());
                                                            return;
                                                        }
                                                    }
                                                    dc62.w |= 8589934592L;
                                                    return;
                                                case 89:
                                                    dc62.Y = v(str4);
                                                    dc62.w |= 17179869184L;
                                                    return;
                                                case 90:
                                                    if (str4.indexOf(124) < 0) {
                                                        if ("|visible|hidden|collapse|".contains("|" + str4 + '|')) {
                                                            dc62.Q = Boolean.valueOf(str4.equals("visible"));
                                                            dc62.w |= 33554432;
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    return;
                                            }
                                    }
                            }
                    }
                } else {
                    switch (str4.hashCode()) {
                        case -1171789332:
                            if (str4.equals("line-through")) {
                                c4 = 0;
                                break;
                            }
                        case -1026963764:
                            if (str4.equals("underline")) {
                                c4 = 1;
                                break;
                            }
                        case 3387192:
                            if (str4.equals("none")) {
                                c4 = 2;
                                break;
                            }
                        case 93826908:
                            if (str4.equals("blink")) {
                                c4 = 3;
                                break;
                            }
                        case 529818312:
                            if (str4.equals("overline")) {
                                c4 = 4;
                                break;
                            }
                        default:
                            c4 = 65535;
                            break;
                    }
                    switch (c4) {
                        case b85.b:
                            i6 = 4;
                            break;
                        case 1:
                            i6 = 2;
                            break;
                        case 2:
                            i6 = 1;
                            break;
                        case 3:
                            i6 = 5;
                            break;
                        case 4:
                            i6 = 3;
                            break;
                        default:
                            i6 = 0;
                            break;
                    }
                    dc62.d0 = i6;
                    if (i6 != 0) {
                        dc62.w |= 131072;
                    }
                }
            } else {
                if (str4.equals("none")) {
                    i4 = 1;
                } else if (!str4.equals("non-scaling-stroke")) {
                    i4 = 0;
                } else {
                    i4 = 2;
                }
                dc62.h0 = i4;
                if (i4 != 0) {
                    dc62.w |= 34359738368L;
                }
            }
        }
    }

    public static int b(float f2) {
        if (f2 < 0.0f) {
            return 0;
        }
        if (f2 > 255.0f) {
            return 255;
        }
        return Math.round(f2);
    }

    public static int d(float f2, float f3, float f4) {
        float f5;
        float f6 = 0.0f;
        int i2 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        float f7 = f2 % 360.0f;
        if (i2 < 0) {
            f7 += 360.0f;
        }
        float f8 = f7 / 60.0f;
        float f9 = f3 / 100.0f;
        float f10 = f4 / 100.0f;
        if (f9 < 0.0f) {
            f9 = 0.0f;
        } else if (f9 > 1.0f) {
            f9 = 1.0f;
        }
        if (f10 >= 0.0f) {
            if (f10 > 1.0f) {
                f6 = 1.0f;
            } else {
                f6 = f10;
            }
        }
        if (f6 <= 0.5f) {
            f5 = (f9 + 1.0f) * f6;
        } else {
            f5 = (f6 + f9) - (f9 * f6);
        }
        float f11 = (f6 * 2.0f) - f5;
        return b(e(f11, f5, f8 - 2.0f) * 256.0f) | (b(e(f11, f5, f8 + 2.0f) * 256.0f) << 16) | (b(e(f11, f5, f8) * 256.0f) << 8);
    }

    public static float e(float f2, float f3, float f4) {
        if (f4 < 0.0f) {
            f4 += 6.0f;
        }
        if (f4 >= 6.0f) {
            f4 -= 6.0f;
        }
        if (f4 < 1.0f) {
            return b81.d(f3, f2, f4, f2);
        }
        if (f4 < 3.0f) {
            return f3;
        }
        if (f4 < 4.0f) {
            return b81.d(4.0f, f4, f3 - f2, f2);
        }
        return f2;
    }

    public static void f(fc6 fc6, Attributes attributes) {
        HashSet hashSet;
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            int d2 = pb4.d(attributes, i2);
            if (d2 != 73) {
                switch (d2) {
                    case 52:
                        xs0 xs0 = new xs0(trim);
                        HashSet hashSet2 = new HashSet();
                        while (!xs0.v()) {
                            String M = xs0.M();
                            if (M.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                                hashSet2.add(M.substring(35));
                            } else {
                                hashSet2.add("UNSUPPORTED");
                            }
                            xs0.U();
                        }
                        fc6.e(hashSet2);
                        break;
                    case 53:
                        fc6.i(trim);
                        break;
                    case 54:
                        xs0 xs02 = new xs0(trim);
                        HashSet hashSet3 = new HashSet();
                        while (!xs02.v()) {
                            hashSet3.add(xs02.M());
                            xs02.U();
                        }
                        fc6.j(hashSet3);
                        break;
                    case 55:
                        ArrayList q = q(trim);
                        if (q == null) {
                            hashSet = new HashSet(0);
                        }
                        fc6.h(hashSet);
                        break;
                }
            } else {
                xs0 xs03 = new xs0(trim);
                HashSet hashSet4 = new HashSet();
                while (!xs03.v()) {
                    String M2 = xs03.M();
                    int indexOf = M2.indexOf(45);
                    if (indexOf != -1) {
                        M2 = M2.substring(0, indexOf);
                    }
                    hashSet4.add(new Locale(M2, "", "").getLanguage());
                    xs03.U();
                }
                fc6.k(hashSet4);
            }
        }
    }

    public static void g(jc6 jc6, Attributes attributes) {
        int i2 = 0;
        while (i2 < attributes.getLength()) {
            String qName = attributes.getQName(i2);
            if (qName.equals("id") || qName.equals("xml:id")) {
                jc6.c = attributes.getValue(i2).trim();
                return;
            } else if (qName.equals("xml:space")) {
                String trim = attributes.getValue(i2).trim();
                if ("default".equals(trim)) {
                    jc6.d = Boolean.FALSE;
                    return;
                } else if ("preserve".equals(trim)) {
                    jc6.d = Boolean.TRUE;
                    return;
                } else {
                    throw new SAXException(b81.y("Invalid value for \"xml:space\" attribute: ", trim));
                }
            } else {
                i2++;
            }
        }
    }

    public static void h(kb6 kb6, Attributes attributes) {
        int i2;
        for (int i3 = 0; i3 < attributes.getLength(); i3++) {
            String trim = attributes.getValue(i3).trim();
            int d2 = pb4.d(attributes, i3);
            if (d2 == 23) {
                kb6.j = z(trim);
            } else if (d2 != 24) {
                if (d2 != 26) {
                    if (d2 == 60) {
                        if (trim != null) {
                            try {
                                if (trim.equals("pad")) {
                                    i2 = 1;
                                } else if (trim.equals("reflect")) {
                                    i2 = 2;
                                } else if (trim.equals("repeat")) {
                                    i2 = 3;
                                } else {
                                    h.q("No enum constant com.caverock.androidsvg.SVG.GradientSpread.".concat(trim));
                                }
                                kb6.k = i2;
                            } catch (IllegalArgumentException unused) {
                                throw new SAXException(f21.h("Invalid spreadMethod attribute. \"", trim, "\" is not a valid value."));
                            }
                        } else {
                            ku4.j("Name is null");
                        }
                        i2 = 0;
                        kb6.k = i2;
                    }
                } else if ("".equals(attributes.getURI(i3)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i3))) {
                    kb6.l = trim;
                }
            } else if ("objectBoundingBox".equals(trim)) {
                kb6.i = Boolean.FALSE;
            } else if ("userSpaceOnUse".equals(trim)) {
                kb6.i = Boolean.TRUE;
            } else {
                ku4.s("Invalid value for attribute gradientUnits");
                return;
            }
        }
    }

    public static void i(yb6 yb6, Attributes attributes, String str) {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            if (qd6.a(attributes.getLocalName(i2)) == qd6.x) {
                xs0 xs0 = new xs0(attributes.getValue(i2));
                ArrayList arrayList = new ArrayList();
                xs0.U();
                while (!xs0.v()) {
                    float J = xs0.J();
                    if (!Float.isNaN(J)) {
                        xs0.T();
                        float J2 = xs0.J();
                        if (!Float.isNaN(J2)) {
                            xs0.T();
                            arrayList.add(Float.valueOf(J));
                            arrayList.add(Float.valueOf(J2));
                        } else {
                            throw new SAXException(f21.h("Invalid <", str, "> points attribute. There should be an even number of coordinates."));
                        }
                    } else {
                        throw new SAXException(f21.h("Invalid <", str, "> points attribute. Non-coordinate content found in list."));
                    }
                }
                yb6.o = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    yb6.o[i3] = ((Float) it.next()).floatValue();
                    i3++;
                }
            }
        }
    }

    public static void j(jc6 jc6, Attributes attributes) {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            if (trim.length() != 0) {
                int d2 = pb4.d(attributes, i2);
                if (d2 == 0) {
                    mg0 mg0 = new mg0(trim);
                    ArrayList arrayList = null;
                    while (!mg0.v()) {
                        String M = mg0.M();
                        if (M != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(M);
                            mg0.U();
                        }
                    }
                    jc6.g = arrayList;
                } else if (d2 != 72) {
                    if (jc6.e == null) {
                        jc6.e = new dc6();
                    }
                    C(jc6.e, attributes.getLocalName(i2), attributes.getValue(i2).trim());
                } else {
                    xs0 xs0 = new xs0(trim.replaceAll("/\\*.*?\\*/", ""));
                    while (true) {
                        String N = xs0.N(':', false);
                        xs0.U();
                        if (!xs0.s(':')) {
                            break;
                        }
                        xs0.U();
                        String N2 = xs0.N(';', true);
                        if (N2 == null) {
                            break;
                        }
                        xs0.U();
                        if (xs0.v() || xs0.s(';')) {
                            if (jc6.f == null) {
                                jc6.f = new dc6();
                            }
                            C(jc6.f, N, N2);
                            xs0.U();
                        }
                    }
                }
            }
        }
    }

    public static void k(yc6 yc6, Attributes attributes) {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            int d2 = pb4.d(attributes, i2);
            if (d2 == 9) {
                yc6.p = t(trim);
            } else if (d2 == 10) {
                yc6.q = t(trim);
            } else if (d2 == 82) {
                yc6.n = t(trim);
            } else if (d2 == 83) {
                yc6.o = t(trim);
            }
        }
    }

    public static void l(nb6 nb6, Attributes attributes) {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            if (qd6.a(attributes.getLocalName(i2)) == qd6.y) {
                nb6.l(z(attributes.getValue(i2)));
            }
        }
    }

    public static void m(pc6 pc6, Attributes attributes) {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            int d2 = pb4.d(attributes, i2);
            if (d2 == 48) {
                x(pc6, trim);
            } else if (d2 != 80) {
                continue;
            } else {
                xs0 xs0 = new xs0(trim);
                xs0.U();
                float J = xs0.J();
                xs0.T();
                float J2 = xs0.J();
                xs0.T();
                float J3 = xs0.J();
                xs0.T();
                float J4 = xs0.J();
                if (Float.isNaN(J) || Float.isNaN(J2) || Float.isNaN(J3) || Float.isNaN(J4)) {
                    ku4.s("Invalid viewBox definition - should have four numbers");
                    return;
                } else if (J3 < 0.0f) {
                    ku4.s("Invalid viewBox. width cannot be negative");
                    return;
                } else if (J4 >= 0.0f) {
                    pc6.o = new sp4(J, J2, J3, J4);
                } else {
                    ku4.s("Invalid viewBox. height cannot be negative");
                    return;
                }
            }
        }
    }

    public static gb6 n(String str) {
        long j;
        int i2;
        int i3 = 5;
        if (str.charAt(0) == '#') {
            int length = str.length();
            ud3 ud3 = null;
            if (1 < length) {
                long j2 = 0;
                int i4 = 1;
                while (true) {
                    if (i4 >= length) {
                        break;
                    }
                    char charAt = str.charAt(i4);
                    if (charAt < '0' || charAt > '9') {
                        if (charAt < 'A' || charAt > 'F') {
                            if (charAt < 'a' || charAt > 'f') {
                                break;
                            }
                            j = j2 * 16;
                            i2 = charAt - 'a';
                        } else {
                            j = j2 * 16;
                            i2 = charAt - 'A';
                        }
                        j2 = j + ((long) i2) + 10;
                    } else {
                        j2 = (j2 * 16) + ((long) (charAt - '0'));
                    }
                    if (j2 > 4294967295L) {
                        break;
                    }
                    i4++;
                }
                if (i4 != 1) {
                    ud3 = new ud3(j2, i4);
                }
            }
            if (ud3 != null) {
                long j3 = ud3.x;
                int i5 = ud3.w;
                if (i5 == 4) {
                    int i6 = (int) j3;
                    int i7 = i6 & 3840;
                    int i8 = i6 & 240;
                    int i9 = i6 & 15;
                    return new gb6(i9 | (i7 << 8) | -16777216 | (i7 << 12) | (i8 << 8) | (i8 << 4) | (i9 << 4));
                } else if (i5 == 5) {
                    int i10 = (int) j3;
                    int i11 = 61440 & i10;
                    int i12 = i10 & 3840;
                    int i13 = i10 & 240;
                    int i14 = i10 & 15;
                    return new gb6((i14 << 24) | (i14 << 28) | (i11 << 8) | (i11 << 4) | (i12 << 4) | i12 | i13 | (i13 >> 4));
                } else if (i5 == 7) {
                    return new gb6(((int) j3) | -16777216);
                } else {
                    if (i5 == 9) {
                        int i15 = (int) j3;
                        return new gb6((i15 >>> 8) | (i15 << 24));
                    }
                    throw new SAXException("Bad hex colour value: ".concat(str));
                }
            } else {
                throw new SAXException("Bad hex colour value: ".concat(str));
            }
        } else {
            String lowerCase = str.toLowerCase(Locale.US);
            boolean startsWith = lowerCase.startsWith("rgba(");
            if (startsWith || lowerCase.startsWith("rgb(")) {
                if (!startsWith) {
                    i3 = 4;
                }
                xs0 xs0 = new xs0(str.substring(i3));
                xs0.U();
                float J = xs0.J();
                if (!Float.isNaN(J) && xs0.s('%')) {
                    J = (J * 256.0f) / 100.0f;
                }
                float j4 = xs0.j(J);
                if (!Float.isNaN(j4) && xs0.s('%')) {
                    j4 = (j4 * 256.0f) / 100.0f;
                }
                float j5 = xs0.j(j4);
                if (!Float.isNaN(j5) && xs0.s('%')) {
                    j5 = (j5 * 256.0f) / 100.0f;
                }
                if (startsWith) {
                    float j6 = xs0.j(j5);
                    xs0.U();
                    if (!Float.isNaN(j6) && xs0.s(')')) {
                        return new gb6((b(j6 * 256.0f) << 24) | (b(J) << 16) | (b(j4) << 8) | b(j5));
                    }
                    throw new SAXException("Bad rgba() colour value: ".concat(str));
                }
                xs0.U();
                if (!Float.isNaN(j5) && xs0.s(')')) {
                    return new gb6((b(J) << 16) | -16777216 | (b(j4) << 8) | b(j5));
                }
                throw new SAXException("Bad rgb() colour value: ".concat(str));
            }
            boolean startsWith2 = lowerCase.startsWith("hsla(");
            if (startsWith2 || lowerCase.startsWith("hsl(")) {
                if (!startsWith2) {
                    i3 = 4;
                }
                xs0 xs02 = new xs0(str.substring(i3));
                xs02.U();
                float J2 = xs02.J();
                float j7 = xs02.j(J2);
                if (!Float.isNaN(j7)) {
                    xs02.s('%');
                }
                float j8 = xs02.j(j7);
                if (!Float.isNaN(j8)) {
                    xs02.s('%');
                }
                if (startsWith2) {
                    float j9 = xs02.j(j8);
                    xs02.U();
                    if (!Float.isNaN(j9) && xs02.s(')')) {
                        return new gb6((b(j9 * 256.0f) << 24) | d(J2, j7, j8));
                    }
                    throw new SAXException("Bad hsla() colour value: ".concat(str));
                }
                xs02.U();
                if (!Float.isNaN(j8) && xs02.s(')')) {
                    return new gb6(d(J2, j7, j8) | -16777216);
                }
                throw new SAXException("Bad hsl() colour value: ".concat(str));
            }
            Integer num = (Integer) md6.a.get(lowerCase);
            if (num != null) {
                return new gb6(num.intValue());
            }
            throw new SAXException("Invalid colour keyword: ".concat(lowerCase));
        }
    }

    public static float o(int i2, String str) {
        float o = new bc4().o(0, i2, str);
        if (!Float.isNaN(o)) {
            return o;
        }
        throw new SAXException(b81.y("Invalid float value: ", str));
    }

    public static float p(String str) {
        int length = str.length();
        if (length != 0) {
            return o(length, str);
        }
        ku4.s("Invalid float value (empty string)");
        return 0.0f;
    }

    public static ArrayList q(String str) {
        xs0 xs0 = new xs0(str);
        ArrayList arrayList = null;
        do {
            String L = xs0.L();
            if (L == null) {
                L = xs0.N(',', true);
            }
            if (L == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(L);
            xs0.T();
        } while (!xs0.v());
        return arrayList;
    }

    public static String r(String str) {
        if (str.equals("none") || !str.startsWith("url(")) {
            return null;
        }
        if (str.endsWith(")")) {
            return str.substring(4, str.length() - 1).trim();
        }
        return str.substring(4).trim();
    }

    public static pb6 s(String str) {
        int i2;
        if (str.length() != 0) {
            int length = str.length();
            char charAt = str.charAt(length - 1);
            if (charAt == '%') {
                length--;
                i2 = 9;
            } else if (length <= 2 || !Character.isLetter(charAt) || !Character.isLetter(str.charAt(length - 2))) {
                i2 = 1;
            } else {
                length -= 2;
                try {
                    i2 = pb4.u(str.substring(length).toLowerCase(Locale.US));
                } catch (IllegalArgumentException unused) {
                    throw new SAXException("Invalid length unit specifier: ".concat(str));
                }
            }
            try {
                return new pb6(i2, o(length, str));
            } catch (NumberFormatException e2) {
                throw new SAXException("Invalid length value: ".concat(str), e2);
            }
        } else {
            ku4.s("Invalid length value (empty string)");
            return null;
        }
    }

    public static ArrayList t(String str) {
        if (str.length() != 0) {
            ArrayList arrayList = new ArrayList(1);
            xs0 xs0 = new xs0(str);
            xs0.U();
            while (!xs0.v()) {
                float J = xs0.J();
                if (Float.isNaN(J)) {
                    StringBuilder sb = new StringBuilder("Invalid length list value: ");
                    String str2 = (String) xs0.d;
                    int i2 = xs0.b;
                    while (!xs0.v() && !xs0.F(str2.charAt(xs0.b))) {
                        xs0.b++;
                    }
                    String substring = str2.substring(i2, xs0.b);
                    xs0.b = i2;
                    sb.append(substring);
                    throw new SAXException(sb.toString());
                }
                int O = xs0.O();
                if (O == 0) {
                    O = 1;
                }
                arrayList.add(new pb6(O, J));
                xs0.T();
            }
            return arrayList;
        }
        ku4.s("Invalid length list (empty string)");
        return null;
    }

    public static pb6 u(xs0 xs0) {
        if (xs0.t("auto")) {
            return new pb6(0.0f);
        }
        return xs0.K();
    }

    public static Float v(String str) {
        try {
            float p = p(str);
            float f2 = 0.0f;
            if (p >= 0.0f) {
                f2 = 1.0f;
                if (p > 1.0f) {
                }
                return Float.valueOf(p);
            }
            p = f2;
            return Float.valueOf(p);
        } catch (SVGParseException unused) {
            return null;
        }
    }

    public static mc6 w(String str) {
        boolean startsWith = str.startsWith("url(");
        mc6 mc6 = gb6.y;
        mc6 mc62 = hb6.w;
        mc6 mc63 = null;
        if (startsWith) {
            int indexOf = str.indexOf(")");
            if (indexOf == -1) {
                return new ub6(str.substring(4).trim(), (mc6) null);
            }
            String trim = str.substring(4, indexOf).trim();
            String trim2 = str.substring(indexOf + 1).trim();
            if (trim2.length() > 0) {
                if (!trim2.equals("none")) {
                    if (!trim2.equals("currentColor")) {
                        try {
                            mc6 = n(trim2);
                        } catch (SVGParseException unused) {
                            mc6 = null;
                        }
                    } else {
                        mc6 = mc62;
                    }
                }
                mc63 = mc6;
            }
            return new ub6(trim, mc63);
        } else if (str.equals("none")) {
            return mc6;
        } else {
            if (str.equals("currentColor")) {
                return mc62;
            }
            try {
                return n(str);
            } catch (SVGParseException unused2) {
                return null;
            }
        }
    }

    public static void x(nc6 nc6, String str) {
        int i2;
        xs0 xs0 = new xs0(str);
        xs0.U();
        String M = xs0.M();
        if ("defer".equals(M)) {
            xs0.U();
            M = xs0.M();
        }
        yn5 yn5 = (yn5) ld6.a.get(M);
        xs0.U();
        if (!xs0.v()) {
            String M2 = xs0.M();
            M2.getClass();
            if (M2.equals("meet")) {
                i2 = 1;
            } else if (M2.equals("slice")) {
                i2 = 2;
            } else {
                throw new SAXException("Invalid preserveAspectRatio definition: ".concat(str));
            }
        } else {
            i2 = 0;
        }
        nc6.n = new zn5(yn5, i2);
    }

    public static HashMap y(xs0 xs0) {
        HashMap hashMap = new HashMap();
        xs0.U();
        String N = xs0.N('=', false);
        while (N != null) {
            xs0.s('=');
            hashMap.put(N, xs0.L());
            xs0.U();
            N = xs0.N('=', false);
        }
        return hashMap;
    }

    public static Matrix z(String str) {
        String str2 = str;
        Matrix matrix = new Matrix();
        xs0 xs0 = new xs0(str2);
        xs0.U();
        while (!xs0.v()) {
            String str3 = (String) xs0.d;
            String str4 = null;
            if (!xs0.v()) {
                int i2 = xs0.b;
                int charAt = str3.charAt(i2);
                while (true) {
                    if ((charAt < 97 || charAt > 122) && (charAt < 65 || charAt > 90)) {
                        int i3 = xs0.b;
                    } else {
                        charAt = xs0.g();
                    }
                }
                int i32 = xs0.b;
                while (xs0.F(charAt)) {
                    charAt = xs0.g();
                }
                if (charAt == 40) {
                    xs0.b++;
                    str4 = str3.substring(i2, i32);
                } else {
                    xs0.b = i2;
                }
            }
            if (str4 != null) {
                char c2 = 65535;
                switch (str4.hashCode()) {
                    case -1081239615:
                        if (str4.equals("matrix")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case -925180581:
                        if (str4.equals("rotate")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 109250890:
                        if (str4.equals("scale")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 109493390:
                        if (str4.equals("skewX")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case 109493391:
                        if (str4.equals("skewY")) {
                            c2 = 4;
                            break;
                        }
                        break;
                    case 1052832078:
                        if (str4.equals("translate")) {
                            c2 = 5;
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case b85.b:
                        xs0.U();
                        float J = xs0.J();
                        xs0.T();
                        float J2 = xs0.J();
                        xs0.T();
                        float J3 = xs0.J();
                        xs0.T();
                        float J4 = xs0.J();
                        xs0.T();
                        float J5 = xs0.J();
                        xs0.T();
                        float J6 = xs0.J();
                        xs0.U();
                        if (!Float.isNaN(J6) && xs0.s(')')) {
                            Matrix matrix2 = new Matrix();
                            matrix2.setValues(new float[]{J, J3, J5, J2, J4, J6, 0.0f, 0.0f, 1.0f});
                            matrix.preConcat(matrix2);
                            break;
                        } else {
                            throw new SAXException("Invalid transform list: ".concat(str2));
                        }
                    case 1:
                        xs0.U();
                        float J7 = xs0.J();
                        float P = xs0.P();
                        float P2 = xs0.P();
                        xs0.U();
                        if (Float.isNaN(J7) || !xs0.s(')')) {
                            throw new SAXException("Invalid transform list: ".concat(str2));
                        } else if (Float.isNaN(P)) {
                            matrix.preRotate(J7);
                            break;
                        } else if (!Float.isNaN(P2)) {
                            matrix.preRotate(J7, P, P2);
                            break;
                        } else {
                            throw new SAXException("Invalid transform list: ".concat(str2));
                        }
                    case 2:
                        xs0.U();
                        float J8 = xs0.J();
                        float P3 = xs0.P();
                        xs0.U();
                        if (!Float.isNaN(J8) && xs0.s(')')) {
                            if (!Float.isNaN(P3)) {
                                matrix.preScale(J8, P3);
                                break;
                            } else {
                                matrix.preScale(J8, J8);
                                break;
                            }
                        } else {
                            throw new SAXException("Invalid transform list: ".concat(str2));
                        }
                        break;
                    case 3:
                        xs0.U();
                        float J9 = xs0.J();
                        xs0.U();
                        if (!Float.isNaN(J9) && xs0.s(')')) {
                            matrix.preSkew((float) Math.tan(Math.toRadians((double) J9)), 0.0f);
                            break;
                        } else {
                            throw new SAXException("Invalid transform list: ".concat(str2));
                        }
                        break;
                    case 4:
                        xs0.U();
                        float J10 = xs0.J();
                        xs0.U();
                        if (!Float.isNaN(J10) && xs0.s(')')) {
                            matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians((double) J10)));
                            break;
                        } else {
                            throw new SAXException("Invalid transform list: ".concat(str2));
                        }
                        break;
                    case 5:
                        xs0.U();
                        float J11 = xs0.J();
                        float P4 = xs0.P();
                        xs0.U();
                        if (!Float.isNaN(J11) && xs0.s(')')) {
                            if (!Float.isNaN(P4)) {
                                matrix.preTranslate(J11, P4);
                                break;
                            } else {
                                matrix.preTranslate(J11, 0.0f);
                                break;
                            }
                        } else {
                            throw new SAXException("Invalid transform list: ".concat(str2));
                        }
                        break;
                    default:
                        throw new SAXException(f21.h("Invalid transform list fn: ", str4, ")"));
                }
                if (xs0.v()) {
                    return matrix;
                }
                xs0.T();
            } else {
                throw new SAXException("Bad transform function encountered in transform list: ".concat(str2));
            }
        }
        return matrix;
    }

    public final void A(InputStream inputStream) {
        Log.d("SVGParser", "Falling back to SAX parser");
        try {
            SAXParserFactory newInstance = SAXParserFactory.newInstance();
            newInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            newInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = newInstance.newSAXParser().getXMLReader();
            pd6 pd6 = new pd6(this);
            xMLReader.setContentHandler(pd6);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", pd6);
            xMLReader.parse(new InputSource(inputStream));
        } catch (ParserConfigurationException e2) {
            throw new SAXException("XML parser problem", e2);
        } catch (SAXException e3) {
            throw new SAXException("SVG parse error", e3);
        } catch (IOException e4) {
            throw new SAXException("Stream error", e4);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [sd6, org.xml.sax.Attributes, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x010c, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0114, code lost:
        throw new org.xml.sax.SAXException("Stream error", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0115, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x011d, code lost:
        throw new org.xml.sax.SAXException("XML parser problem", r8);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0115 A[ExcHandler: XmlPullParserException (r8v1 'e' org.xmlpull.v1.XmlPullParserException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    public final void B(InputStream inputStream) {
        try {
            XmlPullParser newPullParser = Xml.newPullParser();
            ? obj = new Object();
            obj.a = newPullParser;
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
            newPullParser.setInput(inputStream, (String) null);
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.nextToken()) {
                if (eventType == 0) {
                    D();
                } else if (eventType == 8) {
                    Log.d("SVGParser", "PROC INSTR: " + newPullParser.getText());
                    xs0 xs0 = new xs0(newPullParser.getText());
                    String M = xs0.M();
                    y(xs0);
                    M.equals("xml-stylesheet");
                } else if (eventType != 10) {
                    if (eventType == 2) {
                        String name = newPullParser.getName();
                        if (newPullParser.getPrefix() != null) {
                            name = newPullParser.getPrefix() + ':' + name;
                        }
                        E(newPullParser.getNamespace(), newPullParser.getName(), name, obj);
                    } else if (eventType == 3) {
                        String name2 = newPullParser.getName();
                        if (newPullParser.getPrefix() != null) {
                            name2 = newPullParser.getPrefix() + ':' + name2;
                        }
                        c(newPullParser.getNamespace(), newPullParser.getName(), name2);
                    } else if (eventType == 4) {
                        int[] iArr = new int[2];
                        G(newPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                    } else if (eventType == 5) {
                        F(newPullParser.getText());
                    }
                } else if (((ec6) this.a.x) == null && newPullParser.getText().contains("<!ENTITY ")) {
                    Log.d("SVGParser", "Switching to SAX parser to process entities");
                    inputStream.reset();
                    A(inputStream);
                    return;
                }
            }
        } catch (IOException unused) {
            Log.w("SVGParser", "Detected internal entity definitions, but could not parse them.");
        } catch (XmlPullParserException e2) {
        }
    }

    public final void D() {
        cf4 cf4 = new cf4(13);
        cf4.x = null;
        cf4.y = new wg0();
        cf4.z = new HashMap();
        this.a = cf4;
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [nc6, pc6, fc6, ec6, hc6, java.lang.Object, jc6, lc6] */
    /* JADX WARNING: type inference failed for: r1v8, types: [nb6, fc6, hc6, gc6, jc6, lc6] */
    /* JADX WARNING: type inference failed for: r3v18, types: [lb6, nb6, fc6, eb6, jc6, lc6] */
    /* JADX WARNING: type inference failed for: r1v18, types: [nb6, fc6, hc6, gc6, fb6, jc6, lc6] */
    /* JADX WARNING: type inference failed for: r1v20, types: [nb6, hc6, gc6, jc6, lc6] */
    /* JADX WARNING: type inference failed for: r3v29, types: [lb6, nb6, fc6, jc6, lc6, jb6] */
    /* JADX WARNING: type inference failed for: r1v32, types: [nc6, ob6, nb6, fc6, hc6, jc6, lc6] */
    /* JADX WARNING: type inference failed for: r3v41, types: [lb6, nb6, qb6, fc6, jc6, lc6] */
    /* JADX WARNING: type inference failed for: r1v42, types: [hc6, jc6, kb6, lc6, kc6] */
    /* JADX WARNING: type inference failed for: r1v44, types: [nc6, pc6, rb6, fc6, hc6, jc6, lc6] */
    /* JADX WARNING: type inference failed for: r1v46, types: [sb6, fc6, hc6, gc6, jc6, lc6] */
    /* JADX WARNING: type inference failed for: r3v71, types: [lb6, nb6, fc6, vb6, jc6, lc6] */
    /* JADX WARNING: type inference failed for: r1v67, types: [nc6, pc6, fc6, hc6, jc6, xb6, lc6] */
    /* JADX WARNING: type inference failed for: r3v90, types: [lb6, nb6, fc6, jc6, yb6, lc6] */
    /* JADX WARNING: type inference failed for: r3v91, types: [lb6, nb6, fc6, jc6, yb6, lc6] */
    /* JADX WARNING: type inference failed for: r1v73, types: [oc6, hc6, jc6, kb6, lc6] */
    /* JADX WARNING: type inference failed for: r3v103, types: [lb6, nb6, ac6, fc6, jc6, lc6] */
    /* JADX WARNING: type inference failed for: r3v104, types: [hc6, jc6, lc6] */
    /* JADX WARNING: type inference failed for: r3v106, types: [cc6, hc6, jc6, lc6] */
    /* JADX WARNING: type inference failed for: r1v104, types: [nb6, fc6, hc6, gc6, jc6, lc6] */
    /* JADX WARNING: type inference failed for: r1v106, types: [nc6, pc6, fc6, hc6, jc6, lc6] */
    /* JADX WARNING: type inference failed for: r1v108, types: [nb6, fc6, hc6, gc6, jc6, yc6, lc6] */
    /* JADX WARNING: type inference failed for: r1v110, types: [fc6, hc6, xc6, gc6, jc6, lc6] */
    /* JADX WARNING: type inference failed for: r1v113, types: [sc6, fc6, gc6, jc6, lc6] */
    /* JADX WARNING: type inference failed for: r1v116, types: [tc6, fc6, hc6, gc6, jc6, yc6, lc6] */
    /* JADX WARNING: type inference failed for: r1v118, types: [ad6, nb6, fc6, hc6, gc6, jc6, lc6] */
    /* JADX WARNING: type inference failed for: r1v120, types: [nc6, pc6, fc6, hc6, jc6, lc6] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x06ab, code lost:
        r13 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0768, code lost:
        r23 = r1;
        r22 = 'm';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:710:0x00fe, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:740:0x0451, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:767:0x05f4, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:802:0x0a09, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:837:0x0c17, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:865:0x0e34, code lost:
        continue;
     */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02f9  */
    /* JADX WARNING: Removed duplicated region for block: B:430:0x091b  */
    /* JADX WARNING: Removed duplicated region for block: B:775:0x095e A[SYNTHETIC] */
    public final void E(String str, String str2, String str3, Attributes attributes) {
        int i2;
        char c2;
        char charAt;
        Boolean bool;
        float f2;
        float f3;
        boolean z;
        String str4 = str;
        Attributes attributes2 = attributes;
        if (this.c) {
            this.d++;
        } else if ("http://www.w3.org/2000/svg".equals(str4) || "".equals(str4)) {
            rd6 rd6 = (rd6) rd6.A.get(str2.length() > 0 ? str2 : str3);
            if (rd6 == null) {
                rd6 = rd6.z;
            }
            int i3 = 77;
            int i4 = 0;
            switch (rd6.ordinal()) {
                case b85.b:
                    ? nc6 = new nc6();
                    nc6.a = this.a;
                    nc6.b = this.b;
                    g(nc6, attributes2);
                    j(nc6, attributes2);
                    f(nc6, attributes2);
                    m(nc6, attributes2);
                    while (i4 < attributes2.getLength()) {
                        String trim = attributes2.getValue(i4).trim();
                        int d2 = pb4.d(attributes2, i4);
                        if (d2 == 25) {
                            pb6 s = s(trim);
                            nc6.s = s;
                            if (s.f()) {
                                ku4.s("Invalid <svg> element. height cannot be negative");
                                return;
                            }
                        } else if (d2 != 79) {
                            switch (d2) {
                                case 81:
                                    pb6 s2 = s(trim);
                                    nc6.r = s2;
                                    if (!s2.f()) {
                                        break;
                                    } else {
                                        ku4.s("Invalid <svg> element. width cannot be negative");
                                        return;
                                    }
                                case 82:
                                    nc6.p = s(trim);
                                    break;
                                case 83:
                                    nc6.q = s(trim);
                                    break;
                            }
                        } else {
                            continue;
                        }
                        i4++;
                    }
                    hc6 hc6 = this.b;
                    if (hc6 == null) {
                        this.a.x = nc6;
                    } else {
                        hc6.f(nc6);
                    }
                    this.b = nc6;
                    return;
                case 1:
                case 7:
                    if (this.b != null) {
                        ? gc6 = new gc6();
                        gc6.a = this.a;
                        gc6.b = this.b;
                        g(gc6, attributes2);
                        j(gc6, attributes2);
                        l(gc6, attributes2);
                        f(gc6, attributes2);
                        this.b.f(gc6);
                        this.b = gc6;
                        return;
                    }
                    ku4.s("Invalid document. Root element must be <svg>");
                    return;
                case 2:
                    hc6 hc62 = this.b;
                    if (hc62 != null) {
                        ? lb6 = new lb6();
                        lb6.a = this.a;
                        lb6.b = hc62;
                        g(lb6, attributes2);
                        j(lb6, attributes2);
                        l(lb6, attributes2);
                        f(lb6, attributes2);
                        for (int i5 = 0; i5 < attributes2.getLength(); i5++) {
                            String trim2 = attributes2.getValue(i5).trim();
                            int d3 = pb4.d(attributes2, i5);
                            if (d3 == 6) {
                                lb6.o = s(trim2);
                            } else if (d3 == 7) {
                                lb6.p = s(trim2);
                            } else if (d3 != 49) {
                                continue;
                            } else {
                                pb6 s3 = s(trim2);
                                lb6.q = s3;
                                if (s3.f()) {
                                    ku4.s("Invalid <circle> element. r cannot be negative");
                                    return;
                                }
                            }
                        }
                        this.b.f(lb6);
                        return;
                    }
                    ku4.s("Invalid document. Root element must be <svg>");
                    return;
                case 3:
                    if (this.b != null) {
                        ? gc62 = new gc6();
                        gc62.a = this.a;
                        gc62.b = this.b;
                        g(gc62, attributes2);
                        j(gc62, attributes2);
                        l(gc62, attributes2);
                        f(gc62, attributes2);
                        for (int i6 = 0; i6 < attributes2.getLength(); i6++) {
                            String trim3 = attributes2.getValue(i6).trim();
                            if (pb4.d(attributes2, i6) == 3) {
                                if ("objectBoundingBox".equals(trim3)) {
                                    gc62.o = Boolean.FALSE;
                                } else if ("userSpaceOnUse".equals(trim3)) {
                                    gc62.o = Boolean.TRUE;
                                } else {
                                    ku4.s("Invalid value for attribute clipPathUnits");
                                    return;
                                }
                            }
                        }
                        this.b.f(gc62);
                        this.b = gc62;
                        return;
                    }
                    ku4.s("Invalid document. Root element must be <svg>");
                    return;
                case 4:
                    if (this.b != null) {
                        ? gc63 = new gc6();
                        gc63.a = this.a;
                        gc63.b = this.b;
                        g(gc63, attributes2);
                        j(gc63, attributes2);
                        l(gc63, attributes2);
                        this.b.f(gc63);
                        this.b = gc63;
                        return;
                    }
                    ku4.s("Invalid document. Root element must be <svg>");
                    return;
                case 5:
                case 26:
                    this.e = true;
                    this.f = rd6;
                    return;
                case 6:
                    hc6 hc63 = this.b;
                    if (hc63 != null) {
                        ? lb62 = new lb6();
                        lb62.a = this.a;
                        lb62.b = hc63;
                        g(lb62, attributes2);
                        j(lb62, attributes2);
                        l(lb62, attributes2);
                        f(lb62, attributes2);
                        for (int i7 = 0; i7 < attributes2.getLength(); i7++) {
                            String trim4 = attributes2.getValue(i7).trim();
                            int d4 = pb4.d(attributes2, i7);
                            if (d4 == 6) {
                                lb62.o = s(trim4);
                            } else if (d4 == 7) {
                                lb62.p = s(trim4);
                            } else if (d4 == 56) {
                                pb6 s4 = s(trim4);
                                lb62.q = s4;
                                if (s4.f()) {
                                    ku4.s("Invalid <ellipse> element. rx cannot be negative");
                                    return;
                                }
                            } else if (d4 != 57) {
                                continue;
                            } else {
                                pb6 s5 = s(trim4);
                                lb62.r = s5;
                                if (s5.f()) {
                                    ku4.s("Invalid <ellipse> element. ry cannot be negative");
                                    return;
                                }
                            }
                        }
                        this.b.f(lb62);
                        return;
                    }
                    ku4.s("Invalid document. Root element must be <svg>");
                    return;
                case 8:
                    if (this.b != null) {
                        ? nc62 = new nc6();
                        nc62.a = this.a;
                        nc62.b = this.b;
                        g(nc62, attributes2);
                        j(nc62, attributes2);
                        l(nc62, attributes2);
                        f(nc62, attributes2);
                        for (int i8 = 0; i8 < attributes2.getLength(); i8++) {
                            String trim5 = attributes2.getValue(i8).trim();
                            int d5 = pb4.d(attributes2, i8);
                            if (d5 == 25) {
                                pb6 s6 = s(trim5);
                                nc62.s = s6;
                                if (s6.f()) {
                                    ku4.s("Invalid <use> element. height cannot be negative");
                                    return;
                                }
                            } else if (d5 != 26) {
                                if (d5 != 48) {
                                    switch (d5) {
                                        case 81:
                                            pb6 s7 = s(trim5);
                                            nc62.r = s7;
                                            if (!s7.f()) {
                                                break;
                                            } else {
                                                ku4.s("Invalid <use> element. width cannot be negative");
                                                return;
                                            }
                                        case 82:
                                            nc62.p = s(trim5);
                                            break;
                                        case 83:
                                            nc62.q = s(trim5);
                                            break;
                                    }
                                } else {
                                    x(nc62, trim5);
                                }
                            } else if ("".equals(attributes2.getURI(i8)) || "http://www.w3.org/1999/xlink".equals(attributes2.getURI(i8))) {
                                nc62.o = trim5;
                            }
                        }
                        this.b.f(nc62);
                        this.b = nc62;
                        return;
                    }
                    ku4.s("Invalid document. Root element must be <svg>");
                    return;
                case 9:
                    hc6 hc64 = this.b;
                    if (hc64 != null) {
                        ? lb63 = new lb6();
                        lb63.a = this.a;
                        lb63.b = hc64;
                        g(lb63, attributes2);
                        j(lb63, attributes2);
                        l(lb63, attributes2);
                        f(lb63, attributes2);
                        for (int i9 = 0; i9 < attributes2.getLength(); i9++) {
                            String trim6 = attributes2.getValue(i9).trim();
                            switch (pb4.d(attributes2, i9)) {
                                case 84:
                                    lb63.o = s(trim6);
                                    break;
                                case 85:
                                    lb63.p = s(trim6);
                                    break;
                                case 86:
                                    lb63.q = s(trim6);
                                    break;
                                case 87:
                                    lb63.r = s(trim6);
                                    break;
                            }
                        }
                        this.b.f(lb63);
                        return;
                    }
                    ku4.s("Invalid document. Root element must be <svg>");
                    return;
                case 10:
                    if (this.b != null) {
                        ? kb6 = new kb6();
                        kb6.a = this.a;
                        kb6.b = this.b;
                        g(kb6, attributes2);
                        j(kb6, attributes2);
                        h(kb6, attributes2);
                        for (int i10 = 0; i10 < attributes2.getLength(); i10++) {
                            String trim7 = attributes2.getValue(i10).trim();
                            switch (pb4.d(attributes2, i10)) {
                                case 84:
                                    kb6.m = s(trim7);
                                    break;
                                case 85:
                                    kb6.n = s(trim7);
                                    break;
                                case 86:
                                    kb6.o = s(trim7);
                                    break;
                                case 87:
                                    kb6.p = s(trim7);
                                    break;
                            }
                        }
                        this.b.f(kb6);
                        this.b = kb6;
                        return;
                    }
                    ku4.s("Invalid document. Root element must be <svg>");
                    return;
                case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                    if (this.b != null) {
                        ? nc63 = new nc6();
                        nc63.a = this.a;
                        nc63.b = this.b;
                        g(nc63, attributes2);
                        j(nc63, attributes2);
                        f(nc63, attributes2);
                        m(nc63, attributes2);
                        for (int i11 = 0; i11 < attributes2.getLength(); i11++) {
                            String trim8 = attributes2.getValue(i11).trim();
                            int d6 = pb4.d(attributes2, i11);
                            if (d6 != 41) {
                                if (d6 == 50) {
                                    nc63.q = s(trim8);
                                } else if (d6 != 51) {
                                    switch (d6) {
                                        case 32:
                                            pb6 s8 = s(trim8);
                                            nc63.t = s8;
                                            if (!s8.f()) {
                                                continue;
                                            } else {
                                                ku4.s("Invalid <marker> element. markerHeight cannot be negative");
                                                return;
                                            }
                                        case 33:
                                            if ("strokeWidth".equals(trim8)) {
                                                nc63.p = false;
                                                continue;
                                            } else if ("userSpaceOnUse".equals(trim8)) {
                                                nc63.p = true;
                                                break;
                                            } else {
                                                ku4.s("Invalid value for attribute markerUnits");
                                                return;
                                            }
                                        case 34:
                                            pb6 s9 = s(trim8);
                                            nc63.s = s9;
                                            if (s9.f()) {
                                                ku4.s("Invalid <marker> element. markerWidth cannot be negative");
                                                return;
                                            }
                                            break;
                                    }
                                } else {
                                    nc63.r = s(trim8);
                                }
                            } else if ("auto".equals(trim8)) {
                                nc63.u = Float.valueOf(Float.NaN);
                            } else {
                                nc63.u = Float.valueOf(p(trim8));
                            }
                        }
                        this.b.f(nc63);
                        this.b = nc63;
                        return;
                    }
                    ku4.s("Invalid document. Root element must be <svg>");
                    return;
                case 12:
                    if (this.b != null) {
                        ? gc64 = new gc6();
                        gc64.a = this.a;
                        gc64.b = this.b;
                        g(gc64, attributes2);
                        j(gc64, attributes2);
                        f(gc64, attributes2);
                        for (int i12 = 0; i12 < attributes2.getLength(); i12++) {
                            String trim9 = attributes2.getValue(i12).trim();
                            int d7 = pb4.d(attributes2, i12);
                            if (d7 == 25) {
                                pb6 s10 = s(trim9);
                                gc64.q = s10;
                                if (s10.f()) {
                                    ku4.s("Invalid <mask> element. height cannot be negative");
                                    return;
                                }
                            } else if (d7 != 36) {
                                if (d7 != 37) {
                                    switch (d7) {
                                        case 81:
                                            pb6 s11 = s(trim9);
                                            gc64.p = s11;
                                            if (!s11.f()) {
                                                break;
                                            } else {
                                                ku4.s("Invalid <mask> element. width cannot be negative");
                                                return;
                                            }
                                        case 82:
                                            s(trim9);
                                            break;
                                        case 83:
                                            s(trim9);
                                            break;
                                    }
                                } else if ("objectBoundingBox".equals(trim9)) {
                                    gc64.n = Boolean.FALSE;
                                } else if ("userSpaceOnUse".equals(trim9)) {
                                    gc64.n = Boolean.TRUE;
                                } else {
                                    ku4.s("Invalid value for attribute maskUnits");
                                    return;
                                }
                            } else if ("objectBoundingBox".equals(trim9)) {
                                gc64.o = Boolean.FALSE;
                            } else if ("userSpaceOnUse".equals(trim9)) {
                                gc64.o = Boolean.TRUE;
                            } else {
                                ku4.s("Invalid value for attribute maskContentUnits");
                                return;
                            }
                        }
                        this.b.f(gc64);
                        this.b = gc64;
                        return;
                    }
                    ku4.s("Invalid document. Root element must be <svg>");
                    return;
                case ry4.PERF_SESSIONS_FIELD_NUMBER:
                    hc6 hc65 = this.b;
                    if (hc65 != null) {
                        ? lb64 = new lb6();
                        lb64.a = this.a;
                        lb64.b = hc65;
                        g(lb64, attributes2);
                        j(lb64, attributes2);
                        l(lb64, attributes2);
                        f(lb64, attributes2);
                        int i13 = 0;
                        while (i13 < attributes2.getLength()) {
                            String trim10 = attributes2.getValue(i13).trim();
                            int d8 = pb4.d(attributes2, i13);
                            if (d8 == 13) {
                                xs0 xs0 = new xs0(trim10);
                                xs0 xs02 = new xs0(3);
                                xs02.b = i4;
                                xs02.c = i4;
                                xs02.d = new byte[8];
                                xs02.e = new float[16];
                                if (!xs0.v()) {
                                    int intValue = xs0.I().intValue();
                                    char c3 = 'm';
                                    if (intValue == i3 || intValue == 109) {
                                        float f4 = 0.0f;
                                        float f5 = 0.0f;
                                        float f6 = 0.0f;
                                        float f7 = 0.0f;
                                        float f8 = 0.0f;
                                        float f9 = 0.0f;
                                        while (true) {
                                            xs0.U();
                                            int i14 = 108;
                                            switch (intValue) {
                                                case 65:
                                                case 97:
                                                    i2 = i13;
                                                    c2 = c3;
                                                    float J = xs0.J();
                                                    String str5 = "Bad path coords for ";
                                                    float j = xs0.j(J);
                                                    float j2 = xs0.j(j);
                                                    Boolean i15 = xs0.i(Float.valueOf(j2));
                                                    Boolean i16 = xs0.i(i15);
                                                    if (i16 == null) {
                                                        bool = i15;
                                                        f2 = Float.NaN;
                                                    } else {
                                                        xs0.T();
                                                        bool = i15;
                                                        f2 = xs0.J();
                                                    }
                                                    float j3 = xs0.j(f2);
                                                    if (!Float.isNaN(j3) && J >= 0.0f && j >= 0.0f) {
                                                        float f10 = f2;
                                                        if (intValue == 97) {
                                                            j3 += f6;
                                                            f10 += f4;
                                                        }
                                                        float f11 = j3;
                                                        xs02.d(J, j, j2, bool.booleanValue(), i16.booleanValue(), f10, f11);
                                                        f4 = f10;
                                                        f5 = f4;
                                                        f3 = f11;
                                                        break;
                                                    } else {
                                                        Log.e("SVGParser", str5 + ((char) intValue) + " path segment");
                                                        break;
                                                    }
                                                    break;
                                                case 67:
                                                case 99:
                                                    c2 = c3;
                                                    float J2 = xs0.J();
                                                    float j4 = xs0.j(J2);
                                                    float j5 = xs0.j(j4);
                                                    float j6 = xs0.j(j5);
                                                    i2 = i13;
                                                    float j7 = xs0.j(j6);
                                                    float j8 = xs0.j(j7);
                                                    if (Float.isNaN(j8)) {
                                                        Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                                        break;
                                                    } else {
                                                        if (intValue == 99) {
                                                            j7 += f4;
                                                            j8 += f6;
                                                            J2 += f4;
                                                            j4 += f6;
                                                            j5 += f4;
                                                            j6 += f6;
                                                        }
                                                        float f12 = j7;
                                                        float f13 = j8;
                                                        float f14 = j6;
                                                        xs02.c(J2, j4, j5, f14, f12, f13);
                                                        f5 = j5;
                                                        f7 = f14;
                                                        f4 = f12;
                                                        f6 = f13;
                                                    }
                                                case 72:
                                                case 104:
                                                    c2 = c3;
                                                    float J3 = xs0.J();
                                                    if (Float.isNaN(J3)) {
                                                        Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                                        break;
                                                    } else {
                                                        if (intValue == 104) {
                                                            J3 += f4;
                                                        }
                                                        f4 = J3;
                                                        xs02.e(f4, f6);
                                                        i2 = i13;
                                                        f5 = f4;
                                                        xs0.T();
                                                        if (xs0.v()) {
                                                            break;
                                                        } else {
                                                            int i17 = xs0.b;
                                                            if (i17 != xs0.c && (((charAt = ((String) xs0.d).charAt(i17)) >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z'))) {
                                                                intValue = xs0.I().intValue();
                                                            }
                                                            c3 = c2;
                                                            i13 = i2;
                                                        }
                                                    }
                                                case 76:
                                                case 108:
                                                    c2 = c3;
                                                    float J4 = xs0.J();
                                                    float j9 = xs0.j(J4);
                                                    if (!Float.isNaN(j9)) {
                                                        if (intValue == 108) {
                                                            J4 += f4;
                                                            j9 += f6;
                                                        }
                                                        f4 = J4;
                                                        f3 = j9;
                                                        xs02.e(f4, f3);
                                                        i2 = i13;
                                                        f5 = f4;
                                                        break;
                                                    } else {
                                                        Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                                        break;
                                                    }
                                                case 77:
                                                case 109:
                                                    float J5 = xs0.J();
                                                    float j10 = xs0.j(J5);
                                                    if (Float.isNaN(j10)) {
                                                        Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                                        break;
                                                    } else {
                                                        if (intValue == 109 && xs02.b != 0) {
                                                            J5 += f4;
                                                            j10 += f6;
                                                        }
                                                        f4 = J5;
                                                        f6 = j10;
                                                        xs02.b(f4, f6);
                                                        if (intValue != 109) {
                                                            i14 = 76;
                                                        }
                                                        i2 = i13;
                                                        f5 = f4;
                                                        f8 = f5;
                                                        c2 = 'm';
                                                        f7 = f6;
                                                        f9 = f7;
                                                        intValue = i14;
                                                        xs0.T();
                                                        if (xs0.v()) {
                                                        }
                                                    }
                                                    break;
                                                case 81:
                                                case 113:
                                                    f5 = xs0.J();
                                                    f7 = xs0.j(f5);
                                                    float j11 = xs0.j(f7);
                                                    float j12 = xs0.j(j11);
                                                    if (!Float.isNaN(j12)) {
                                                        if (intValue == 113) {
                                                            j11 += f4;
                                                            j12 += f6;
                                                            f5 += f4;
                                                            f7 += f6;
                                                        }
                                                        f4 = j11;
                                                        f6 = j12;
                                                        xs02.a(f5, f7, f4, f6);
                                                        break;
                                                    } else {
                                                        Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                                        break;
                                                    }
                                                case 83:
                                                case 115:
                                                    float f15 = (f4 * 2.0f) - f5;
                                                    float f16 = (2.0f * f6) - f7;
                                                    float J6 = xs0.J();
                                                    float j13 = xs0.j(J6);
                                                    float j14 = xs0.j(j13);
                                                    float j15 = xs0.j(j14);
                                                    if (!Float.isNaN(j15)) {
                                                        if (intValue == 115) {
                                                            j14 += f4;
                                                            j15 += f6;
                                                            J6 += f4;
                                                            j13 += f6;
                                                        }
                                                        float f17 = j14;
                                                        float f18 = f16;
                                                        float f19 = j13;
                                                        float f20 = f15;
                                                        float f21 = J6;
                                                        xs02.c(f20, f18, f21, f19, f17, j15);
                                                        f5 = f21;
                                                        f7 = f19;
                                                        f4 = f17;
                                                        f6 = j15;
                                                        break;
                                                    } else {
                                                        Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                                        break;
                                                    }
                                                case 84:
                                                case 116:
                                                    f5 = (f4 * 2.0f) - f5;
                                                    f7 = (2.0f * f6) - f7;
                                                    float J7 = xs0.J();
                                                    float j16 = xs0.j(J7);
                                                    if (Float.isNaN(j16)) {
                                                        Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                                        break;
                                                    } else {
                                                        if (intValue == 116) {
                                                            J7 += f4;
                                                            j16 += f6;
                                                        }
                                                        f4 = J7;
                                                        f6 = j16;
                                                        xs02.a(f5, f7, f4, f6);
                                                        i2 = i13;
                                                        c2 = c3;
                                                        xs0.T();
                                                        if (xs0.v()) {
                                                        }
                                                    }
                                                    break;
                                                case 86:
                                                case 118:
                                                    float J8 = xs0.J();
                                                    if (!Float.isNaN(J8)) {
                                                        if (intValue == 118) {
                                                            J8 += f6;
                                                        }
                                                        f3 = J8;
                                                        xs02.e(f4, f3);
                                                        i2 = i13;
                                                        c2 = c3;
                                                        break;
                                                    } else {
                                                        Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                                        break;
                                                    }
                                                case 90:
                                                case 122:
                                                    xs02.close();
                                                    i2 = i13;
                                                    c2 = c3;
                                                    f4 = f8;
                                                    f5 = f4;
                                                    f3 = f9;
                                                    break;
                                            }
                                        }
                                        lb64.o = xs02;
                                    }
                                }
                                i2 = i13;
                                lb64.o = xs02;
                            } else if (d8 == 43 && p(trim10) < 0.0f) {
                                ku4.s("Invalid <path> element. pathLength cannot be negative");
                                return;
                            } else {
                                i2 = i13;
                            }
                            i13 = i2 + 1;
                            i3 = 77;
                            i4 = 0;
                        }
                        this.b.f(lb64);
                        return;
                    }
                    ku4.s("Invalid document. Root element must be <svg>");
                    return;
                case 14:
                    if (this.b != null) {
                        ? nc64 = new nc6();
                        nc64.a = this.a;
                        nc64.b = this.b;
                        g(nc64, attributes2);
                        j(nc64, attributes2);
                        f(nc64, attributes2);
                        m(nc64, attributes2);
                        while (i4 < attributes2.getLength()) {
                            String trim11 = attributes2.getValue(i4).trim();
                            int d9 = pb4.d(attributes2, i4);
                            if (d9 == 25) {
                                pb6 s12 = s(trim11);
                                nc64.v = s12;
                                if (s12.f()) {
                                    ku4.s("Invalid <pattern> element. height cannot be negative");
                                    return;
                                }
                            } else if (d9 != 26) {
                                switch (d9) {
                                    case 44:
                                        if ("objectBoundingBox".equals(trim11)) {
                                            nc64.q = Boolean.FALSE;
                                            break;
                                        } else if ("userSpaceOnUse".equals(trim11)) {
                                            nc64.q = Boolean.TRUE;
                                            break;
                                        } else {
                                            ku4.s("Invalid value for attribute patternContentUnits");
                                            return;
                                        }
                                    case 45:
                                        nc64.r = z(trim11);
                                        break;
                                    case 46:
                                        if ("objectBoundingBox".equals(trim11)) {
                                            nc64.p = Boolean.FALSE;
                                            break;
                                        } else if ("userSpaceOnUse".equals(trim11)) {
                                            nc64.p = Boolean.TRUE;
                                            break;
                                        } else {
                                            ku4.s("Invalid value for attribute patternUnits");
                                            return;
                                        }
                                    default:
                                        switch (d9) {
                                            case 81:
                                                pb6 s13 = s(trim11);
                                                nc64.u = s13;
                                                if (!s13.f()) {
                                                    break;
                                                } else {
                                                    ku4.s("Invalid <pattern> element. width cannot be negative");
                                                    return;
                                                }
                                            case 82:
                                                nc64.s = s(trim11);
                                                break;
                                            case 83:
                                                nc64.t = s(trim11);
                                                break;
                                        }
                                }
                            } else if ("".equals(attributes2.getURI(i4)) || "http://www.w3.org/1999/xlink".equals(attributes2.getURI(i4))) {
                                nc64.w = trim11;
                            }
                            i4++;
                        }
                        this.b.f(nc64);
                        this.b = nc64;
                        return;
                    }
                    ku4.s("Invalid document. Root element must be <svg>");
                    return;
                case h75.g:
                    hc6 hc66 = this.b;
                    if (hc66 != null) {
                        ? lb65 = new lb6();
                        lb65.a = this.a;
                        lb65.b = hc66;
                        g(lb65, attributes2);
                        j(lb65, attributes2);
                        l(lb65, attributes2);
                        f(lb65, attributes2);
                        i(lb65, attributes2, "polygon");
                        this.b.f(lb65);
                        return;
                    }
                    ku4.s("Invalid document. Root element must be <svg>");
                    return;
                case 16:
                    hc6 hc67 = this.b;
                    if (hc67 != null) {
                        ? lb66 = new lb6();
                        lb66.a = this.a;
                        lb66.b = hc67;
                        g(lb66, attributes2);
                        j(lb66, attributes2);
                        l(lb66, attributes2);
                        f(lb66, attributes2);
                        i(lb66, attributes2, "polyline");
                        this.b.f(lb66);
                        return;
                    }
                    ku4.s("Invalid document. Root element must be <svg>");
                    return;
                case 17:
                    if (this.b != null) {
                        ? kb62 = new kb6();
                        kb62.a = this.a;
                        kb62.b = this.b;
                        g(kb62, attributes2);
                        j(kb62, attributes2);
                        h(kb62, attributes2);
                        while (i4 < attributes2.getLength()) {
                            String trim12 = attributes2.getValue(i4).trim();
                            int d10 = pb4.d(attributes2, i4);
                            if (d10 == 6) {
                                kb62.m = s(trim12);
                            } else if (d10 == 7) {
                                kb62.n = s(trim12);
                            } else if (d10 == 11) {
                                kb62.p = s(trim12);
                            } else if (d10 == 12) {
                                kb62.q = s(trim12);
                            } else if (d10 != 49) {
                                continue;
                            } else {
                                pb6 s14 = s(trim12);
                                kb62.o = s14;
                                if (s14.f()) {
                                    ku4.s("Invalid <radialGradient> element. r cannot be negative");
                                    return;
                                }
                            }
                            i4++;
                        }
                        this.b.f(kb62);
                        this.b = kb62;
                        return;
                    }
                    ku4.s("Invalid document. Root element must be <svg>");
                    return;
                case 18:
                    hc6 hc68 = this.b;
                    if (hc68 != null) {
                        ? lb67 = new lb6();
                        lb67.a = this.a;
                        lb67.b = hc68;
                        g(lb67, attributes2);
                        j(lb67, attributes2);
                        l(lb67, attributes2);
                        f(lb67, attributes2);
                        while (i4 < attributes2.getLength()) {
                            String trim13 = attributes2.getValue(i4).trim();
                            int d11 = pb4.d(attributes2, i4);
                            if (d11 == 25) {
                                pb6 s15 = s(trim13);
                                lb67.r = s15;
                                if (s15.f()) {
                                    ku4.s("Invalid <rect> element. height cannot be negative");
                                    return;
                                }
                            } else if (d11 == 56) {
                                pb6 s16 = s(trim13);
                                lb67.s = s16;
                                if (s16.f()) {
                                    ku4.s("Invalid <rect> element. rx cannot be negative");
                                    return;
                                }
                            } else if (d11 != 57) {
                                switch (d11) {
                                    case 81:
                                        pb6 s17 = s(trim13);
                                        lb67.q = s17;
                                        if (!s17.f()) {
                                            break;
                                        } else {
                                            ku4.s("Invalid <rect> element. width cannot be negative");
                                            return;
                                        }
                                    case 82:
                                        lb67.o = s(trim13);
                                        break;
                                    case 83:
                                        lb67.p = s(trim13);
                                        break;
                                }
                            } else {
                                pb6 s18 = s(trim13);
                                lb67.t = s18;
                                if (s18.f()) {
                                    ku4.s("Invalid <rect> element. ry cannot be negative");
                                    return;
                                }
                            }
                            i4++;
                        }
                        this.b.f(lb67);
                        return;
                    }
                    ku4.s("Invalid document. Root element must be <svg>");
                    return;
                case 19:
                    hc6 hc69 = this.b;
                    if (hc69 != null) {
                        ? jc6 = new jc6();
                        jc6.a = this.a;
                        jc6.b = hc69;
                        g(jc6, attributes2);
                        j(jc6, attributes2);
                        this.b.f(jc6);
                        this.b = jc6;
                        return;
                    }
                    ku4.s("Invalid document. Root element must be <svg>");
                    return;
                case 20:
                    hc6 hc610 = this.b;
                    if (hc610 == null) {
                        ku4.s("Invalid document. Root element must be <svg>");
                        return;
                    } else if (hc610 instanceof kb6) {
                        ? jc62 = new jc6();
                        jc62.a = this.a;
                        jc62.b = hc610;
                        g(jc62, attributes2);
                        j(jc62, attributes2);
                        for (int i18 = 0; i18 < attributes2.getLength(); i18++) {
                            String trim14 = attributes2.getValue(i18).trim();
                            if (pb4.d(attributes2, i18) == 39) {
                                if (trim14.length() != 0) {
                                    int length = trim14.length();
                                    if (trim14.charAt(trim14.length() - 1) == '%') {
                                        length--;
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    try {
                                        float o = o(length, trim14);
                                        float f22 = 100.0f;
                                        if (z) {
                                            o /= 100.0f;
                                        }
                                        if (o < 0.0f) {
                                            f22 = 0.0f;
                                        } else if (o <= 100.0f) {
                                            f22 = o;
                                        }
                                        jc62.h = Float.valueOf(f22);
                                    } catch (NumberFormatException e2) {
                                        throw new SAXException("Invalid offset value in <stop>: ".concat(trim14), e2);
                                    }
                                } else {
                                    ku4.s("Invalid offset value in <stop> (empty string)");
                                    return;
                                }
                            }
                        }
                        this.b.f(jc62);
                        this.b = jc62;
                        return;
                    } else {
                        ku4.s("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
                        return;
                    }
                case 21:
                    if (this.b != null) {
                        String str6 = "all";
                        boolean z2 = true;
                        while (i4 < attributes2.getLength()) {
                            String trim15 = attributes2.getValue(i4).trim();
                            int d12 = pb4.d(attributes2, i4);
                            if (d12 == 38) {
                                str6 = trim15;
                            } else if (d12 == 77) {
                                z2 = trim15.equals("text/css");
                            }
                            i4++;
                        }
                        if (z2) {
                            mg0 mg0 = new mg0(str6);
                            mg0.U();
                            Iterator it = v.g(mg0).iterator();
                            while (it.hasNext()) {
                                ng0 ng0 = (ng0) it.next();
                                if (ng0 == ng0.w || ng0 == ng0.x) {
                                    this.h = true;
                                    return;
                                }
                                while (it.hasNext()) {
                                }
                            }
                        }
                        this.c = true;
                        this.d = 1;
                        return;
                    }
                    ku4.s("Invalid document. Root element must be <svg>");
                    return;
                case 22:
                    if (this.b != null) {
                        ? gc65 = new gc6();
                        gc65.a = this.a;
                        gc65.b = this.b;
                        g(gc65, attributes2);
                        j(gc65, attributes2);
                        l(gc65, attributes2);
                        f(gc65, attributes2);
                        this.b.f(gc65);
                        this.b = gc65;
                        return;
                    }
                    ku4.s("Invalid document. Root element must be <svg>");
                    return;
                case 23:
                    if (this.b != null) {
                        ? nc65 = new nc6();
                        nc65.a = this.a;
                        nc65.b = this.b;
                        g(nc65, attributes2);
                        j(nc65, attributes2);
                        f(nc65, attributes2);
                        m(nc65, attributes2);
                        this.b.f(nc65);
                        this.b = nc65;
                        return;
                    }
                    ku4.s("Invalid document. Root element must be <svg>");
                    return;
                case 24:
                    if (this.b != null) {
                        ? gc66 = new gc6();
                        gc66.a = this.a;
                        gc66.b = this.b;
                        g(gc66, attributes2);
                        j(gc66, attributes2);
                        l(gc66, attributes2);
                        f(gc66, attributes2);
                        k(gc66, attributes2);
                        this.b.f(gc66);
                        this.b = gc66;
                        return;
                    }
                    ku4.s("Invalid document. Root element must be <svg>");
                    return;
                case 25:
                    if (this.b != null) {
                        ? gc67 = new gc6();
                        gc67.a = this.a;
                        gc67.b = this.b;
                        g(gc67, attributes2);
                        j(gc67, attributes2);
                        f(gc67, attributes2);
                        while (i4 < attributes2.getLength()) {
                            String trim16 = attributes2.getValue(i4).trim();
                            int d13 = pb4.d(attributes2, i4);
                            if (d13 != 26) {
                                if (d13 == 61) {
                                    gc67.o = s(trim16);
                                }
                            } else if ("".equals(attributes2.getURI(i4)) || "http://www.w3.org/1999/xlink".equals(attributes2.getURI(i4))) {
                                gc67.n = trim16;
                            }
                            i4++;
                        }
                        this.b.f(gc67);
                        this.b = gc67;
                        hc6 hc611 = gc67.b;
                        if (hc611 instanceof uc6) {
                            gc67.p = (uc6) hc611;
                            return;
                        } else {
                            gc67.p = ((vc6) hc611).d();
                            return;
                        }
                    } else {
                        ku4.s("Invalid document. Root element must be <svg>");
                        return;
                    }
                case 27:
                    hc6 hc612 = this.b;
                    if (hc612 == null) {
                        ku4.s("Invalid document. Root element must be <svg>");
                        return;
                    } else if (hc612 instanceof wc6) {
                        ? gc68 = new gc6();
                        gc68.a = this.a;
                        gc68.b = this.b;
                        g(gc68, attributes2);
                        j(gc68, attributes2);
                        f(gc68, attributes2);
                        while (i4 < attributes2.getLength()) {
                            String trim17 = attributes2.getValue(i4).trim();
                            if (pb4.d(attributes2, i4) == 26 && ("".equals(attributes2.getURI(i4)) || "http://www.w3.org/1999/xlink".equals(attributes2.getURI(i4)))) {
                                gc68.n = trim17;
                            }
                            i4++;
                        }
                        this.b.f(gc68);
                        hc6 hc613 = gc68.b;
                        if (hc613 instanceof uc6) {
                            gc68.o = (uc6) hc613;
                            return;
                        } else {
                            gc68.o = ((vc6) hc613).d();
                            return;
                        }
                    } else {
                        ku4.s("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
                        return;
                    }
                case 28:
                    hc6 hc614 = this.b;
                    if (hc614 == null) {
                        ku4.s("Invalid document. Root element must be <svg>");
                        return;
                    } else if (hc614 instanceof wc6) {
                        ? gc69 = new gc6();
                        gc69.a = this.a;
                        gc69.b = this.b;
                        g(gc69, attributes2);
                        j(gc69, attributes2);
                        f(gc69, attributes2);
                        k(gc69, attributes2);
                        this.b.f(gc69);
                        this.b = gc69;
                        hc6 hc615 = gc69.b;
                        if (hc615 instanceof uc6) {
                            gc69.r = (uc6) hc615;
                            return;
                        } else {
                            gc69.r = ((vc6) hc615).d();
                            return;
                        }
                    } else {
                        ku4.s("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
                        return;
                    }
                case 29:
                    if (this.b != null) {
                        ? gc610 = new gc6();
                        gc610.a = this.a;
                        gc610.b = this.b;
                        g(gc610, attributes2);
                        j(gc610, attributes2);
                        l(gc610, attributes2);
                        f(gc610, attributes2);
                        while (i4 < attributes2.getLength()) {
                            String trim18 = attributes2.getValue(i4).trim();
                            int d14 = pb4.d(attributes2, i4);
                            if (d14 == 25) {
                                pb6 s19 = s(trim18);
                                gc610.s = s19;
                                if (s19.f()) {
                                    ku4.s("Invalid <use> element. height cannot be negative");
                                    return;
                                }
                            } else if (d14 != 26) {
                                switch (d14) {
                                    case 81:
                                        pb6 s20 = s(trim18);
                                        gc610.r = s20;
                                        if (!s20.f()) {
                                            break;
                                        } else {
                                            ku4.s("Invalid <use> element. width cannot be negative");
                                            return;
                                        }
                                    case 82:
                                        gc610.p = s(trim18);
                                        break;
                                    case 83:
                                        gc610.q = s(trim18);
                                        break;
                                }
                            } else if ("".equals(attributes2.getURI(i4)) || "http://www.w3.org/1999/xlink".equals(attributes2.getURI(i4))) {
                                gc610.o = trim18;
                            }
                            i4++;
                        }
                        this.b.f(gc610);
                        this.b = gc610;
                        return;
                    }
                    ku4.s("Invalid document. Root element must be <svg>");
                    return;
                case 30:
                    if (this.b != null) {
                        ? nc66 = new nc6();
                        nc66.a = this.a;
                        nc66.b = this.b;
                        g(nc66, attributes2);
                        f(nc66, attributes2);
                        m(nc66, attributes2);
                        this.b.f(nc66);
                        this.b = nc66;
                        return;
                    }
                    ku4.s("Invalid document. Root element must be <svg>");
                    return;
                default:
                    this.c = true;
                    this.d = 1;
                    return;
            }
        }
    }

    public final void F(String str) {
        if (!this.c) {
            if (this.e) {
                if (this.g == null) {
                    this.g = new StringBuilder(str.length());
                }
                this.g.append(str);
            } else if (this.h) {
                if (this.i == null) {
                    this.i = new StringBuilder(str.length());
                }
                this.i.append(str);
            } else if (this.b instanceof wc6) {
                a(str);
            }
        }
    }

    public final void G(char[] cArr, int i2, int i3) {
        if (!this.c) {
            if (this.e) {
                if (this.g == null) {
                    this.g = new StringBuilder(i3);
                }
                this.g.append(cArr, i2, i3);
            } else if (this.h) {
                if (this.i == null) {
                    this.i = new StringBuilder(i3);
                }
                this.i.append(cArr, i2, i3);
            } else if (this.b instanceof wc6) {
                a(new String(cArr, i2, i3));
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, zc6, lc6] */
    public final void a(String str) {
        lc6 lc6;
        gc6 gc6 = (gc6) this.b;
        int size = gc6.i.size();
        if (size == 0) {
            lc6 = null;
        } else {
            lc6 = (lc6) gc6.i.get(size - 1);
        }
        if (lc6 instanceof zc6) {
            zc6 zc6 = (zc6) lc6;
            zc6.c = f21.l(new StringBuilder(), zc6.c, str);
            return;
        }
        hc6 hc6 = this.b;
        ? obj = new Object();
        obj.c = str;
        hc6.f(obj);
    }

    /* JADX WARNING: type inference failed for: r5v4, types: [v, java.lang.Object] */
    public final void c(String str, String str2, String str3) {
        if (this.c) {
            int i2 = this.d - 1;
            this.d = i2;
            if (i2 == 0) {
                this.c = false;
                return;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            rd6 rd6 = (rd6) rd6.A.get(str2);
            if (rd6 == null) {
                rd6 = rd6.z;
            }
            switch (rd6.ordinal()) {
                case b85.b:
                case 3:
                case 4:
                case 7:
                case 8:
                case 10:
                case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                case 12:
                case 14:
                case 17:
                case 19:
                case 20:
                case 22:
                case 23:
                case 24:
                case 25:
                case 28:
                case 29:
                case 30:
                    this.b = ((lc6) this.b).b;
                    return;
                case 5:
                case 26:
                    this.e = false;
                    if (this.g != null) {
                        rd6 rd62 = this.f;
                        if (rd62 == rd6.y) {
                            this.a.getClass();
                        } else if (rd62 == rd6.w) {
                            this.a.getClass();
                        }
                        this.g.setLength(0);
                        return;
                    }
                    return;
                case 21:
                    StringBuilder sb = this.i;
                    if (sb != null) {
                        this.h = false;
                        String sb2 = sb.toString();
                        ? obj = new Object();
                        obj.b = false;
                        obj.c = ng0.x;
                        obj.a = 1;
                        cf4 cf4 = this.a;
                        mg0 mg0 = new mg0(sb2);
                        mg0.U();
                        ((wg0) cf4.y).b(obj.i(mg0));
                        this.i.setLength(0);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
