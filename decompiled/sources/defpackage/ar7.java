package defpackage;

import android.os.Parcel;
import android.os.Process;
import android.text.TextPaint;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlinx.serialization.json.JsonEncodingException;

/* renamed from: ar7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ar7 {
    public static final fw0 A = new fw0(-553496030, new sw0(19), false);
    public static x83 A0;
    public static final fw0 B = new fw0(1847348098, new tw0(23), false);
    public static final /* synthetic */ int B0 = 0;
    public static final fw0 C = new fw0(-1403831229, new tw0(24), false);
    public static x83 C0;
    public static final fw0 D = new fw0(-930681900, new tw0(25), false);
    public static x83 D0;
    public static final fw0 E = new fw0(1013290005, new tw0(26), false);
    public static x83 E0;
    public static final fw0 F = new fw0(1344634187, new tw0(27), false);
    public static final fw0 G = new fw0(1190861132, new tw0(28), false);
    public static final fw0 H = new fw0(391198338, new tw0(29), false);
    public static final fw0 I = new fw0(-1402037467, new sw0(21), false);
    public static final fw0 J = new fw0(-656499620, new sw0(22), false);
    public static final fw0 K = new fw0(-353509980, new sw0(23), false);
    public static final fw0 L = new fw0(523689726, new sw0(24), false);
    public static final fw0 M = new fw0(675477296, new sw0(25), false);
    public static final fw0 N = new fw0(-413924014, new uw0(1), false);
    public static final fw0 O = new fw0(-1104827983, new uw0(2), false);
    public static final fw0 P = new fw0(-1707378094, new uw0(3), false);
    public static final fw0 Q = new fw0(-1014239513, new uw0(5), false);
    public static final fw0 R = new fw0(-636245146, new uw0(6), false);
    public static final fw0 S = new fw0(769690312, new uw0(7), false);
    public static final fw0 T = new fw0(473110967, new uw0(9), false);
    public static final fw0 U = new fw0(1298597928, new sw0(26), false);
    public static final fw0 V = new fw0(-2141692070, new sw0(27), false);
    public static final fw0 W = new fw0(-1381054368, new uw0(10), false);
    public static final fw0 X = new fw0(-950137567, new uw0(11), false);
    public static final fw0 Y = new fw0(-519220766, new uw0(12), false);
    public static final fw0 Z = new fw0(-22788735, new sw0(28), false);
    public static final cr7 a = cr7.D;
    public static final fw0 a0 = new fw0(1492302727, new uw0(14), false);
    public static final vq6 b;
    public static final fw0 b0 = new fw0(-872433720, new uw0(15), false);
    public static final float c = 16.0f;
    public static final fw0 c0 = new fw0(1057797129, new vw0(0), false);
    public static final vq6 d;
    public static final fw0 d0 = new fw0(-2069318715, new uw0(17), false);
    public static final float e = 6.0f;
    public static final fw0 e0 = new fw0(-88711584, new uw0(18), false);
    public static final fw0 f = new fw0(655288355, new tw0(19), false);
    public static final rt0 f0 = rt0.H;
    public static final fw0 g = new fw0(1103403940, new tw0(21), false);
    public static final cr7 g0 = cr7.B;
    public static final fw0 h = new fw0(-239347448, new uw0(0), false);
    public static final rt0 h0 = rt0.O;
    public static final fw0 i = new fw0(804440521, new uw0(8), false);
    public static final vq6 i0 = vq6.w;
    public static final fw0 j = new fw0(1277589850, new uw0(16), false);
    public static final rt0 j0 = rt0.D;
    public static final fw0 k = new fw0(-1073405541, new uw0(19), false);
    public static final cr7 k0 = cr7.A;
    public static final fw0 l = new fw0(-339763028, new uw0(20), false);
    public static final rt0 l0 = rt0.E;
    public static final fw0 m = new fw0(237432685, new uw0(21), false);
    public static final cr7 m0 = cr7.x;
    public static final fw0 n = new fw0(-1773343910, new uw0(23), false);
    public static final rt0 n0 = rt0.K;
    public static final fw0 o = new fw0(-630996325, new uw0(24), false);
    public static final double[][] o0 = {new double[]{0.001200833568784504d, 0.002389694492170889d, 2.795742885861124E-4d}, new double[]{5.891086651375999E-4d, 0.0029785502573438758d, 3.270666104008398E-4d}, new double[]{1.0146692491640572E-4d, 5.364214359186694E-4d, 0.0032979401770712076d}};
    public static final fw0 p = new fw0(-324413954, new sw0(20), false);
    public static final double[][] p0 = {new double[]{1373.2198709594231d, -1100.4251190754821d, -7.278681089101213d}, new double[]{-271.815969077903d, 559.6580465940733d, -32.46047482791194d}, new double[]{1.9622899599665666d, -57.173814538844006d, 308.7233197812385d}};
    public static final fw0 q = new fw0(832727306, new uw0(4), false);
    public static final double[] q0 = {0.2126d, 0.7152d, 0.0722d};
    public static final fw0 r = new fw0(1233488039, new uw0(13), false);
    public static final double[] r0 = {0.015176349177441876d, 0.045529047532325624d, 0.07588174588720938d, 0.10623444424209313d, 0.13658714259697685d, 0.16693984095186062d, 0.19729253930674434d, 0.2276452376616281d, 0.2579979360165119d, 0.28835063437139563d, 0.3188300904430532d, 0.350925934958123d, 0.3848314933096426d, 0.42057480301049466d, 0.458183274052838d, 0.4976837250274023d, 0.5391024159806381d, 0.5824650784040898d, 0.6277969426914107d, 0.6751227633498623d, 0.7244668422128921d, 0.775853049866786d, 0.829304845476233d, 0.8848452951698498d, 0.942497089126609d, 1.0022825574869039d, 1.0642236851973577d, 1.1283421258858297d, 1.1946592148522128d, 1.2631959812511864d, 1.3339731595349034d, 1.407011200216447d, 1.4823302800086415d, 1.5599503113873272d, 1.6398909516233677d, 1.7221716113234105d, 1.8068114625156377d, 1.8938294463134073d, 1.9832442801866852d, 2.075074464868551d, 2.1693382909216234d, 2.2660538449872063d, 2.36523901573795d, 2.4669114995532007d, 2.5710888059345764d, 2.6777882626779785d, 2.7870270208169257d, 2.898822059350997d, 3.0131901897720907d, 3.1301480604002863d, 3.2497121605402226d, 3.3718988244681087d, 3.4967242352587946d, 3.624204428461639d, 3.754355295633311d, 3.887192587735158d, 4.022731918402185d, 4.160988767090289d, 4.301978482107941d, 4.445716283538092d, 4.592217266055746d, 4.741496401646282d, 4.893568542229298d, 5.048448422192488d, 5.20615066083972d, 5.3666897647573375d, 5.5300801301023865d, 5.696336044816294d, 5.865471690767354d, 6.037501145825082d, 6.212438385869475d, 6.390297286737924d, 6.571091626112461d, 6.7548350853498045d, 6.941541251256611d, 7.131223617812143d, 7.323895587840543d, 7.5195704746346665d, 7.7182615035334345d, 7.919981813454504d, 8.124744458384042d, 8.332562408825165d, 8.543448553206703d, 8.757415699253682d, 8.974476575321063d, 9.194643831691977d, 9.417930041841839d, 9.644347703669503d, 9.873909240696694d, 10.106627003236781d, 10.342513269534024d, 10.58158024687427d, 10.8238400726681d, 11.069304815507364d, 11.317986476196008d, 11.569896988756009d, 11.825048221409341d, 12.083451977536606d, 12.345119996613247d, 12.610063955123938d, 12.878295467455942d, 13.149826086772048d, 13.42466730586372d, 13.702830557985108d, 13.984327217668513d, 14.269168601521828d, 14.55736596900856d, 14.848930523210871d, 15.143873411576273d, 15.44220572664832d, 15.743938506781891d, 16.04908273684337d, 16.35764934889634d, 16.66964922287304d, 16.985093187232053d, 17.30399201960269d, 17.62635644741625d, 17.95219714852476d, 18.281524751807332d, 18.614349837764564d, 18.95068293910138d, 19.290534541298456d, 19.633915083172692d, 19.98083495742689d, 20.331304511189067d, 20.685334046541502d, 21.042933821039977d, 21.404114048223256d, 21.76888489811322d, 22.137256497705877d, 22.50923893145328d, 22.884842241736916d, 23.264076429332462d, 23.6469514538663d, 24.033477234264016d, 24.42366364919083d, 24.817520537484558d, 25.21505769858089d, 25.61628489293138d, 26.021211842414342d, 26.429848230738664d, 26.842203703840827d, 27.258287870275353d, 27.678110301598522d, 28.10168053274597d, 28.529008062403893d, 28.96010235337422d, 29.39497283293396d, 29.83362889318845d, 30.276079891419332d, 30.722335150426627d, 31.172403958865512d, 31.62629557157785d, 32.08401920991837d, 32.54558406207592d, 33.010999283389665d, 33.4802739966603d, 33.953417292456834d, 34.430438229418264d, 34.911345834551085d, 35.39614910352207d, 35.88485700094671d, 36.37747846067349d, 36.87402238606382d, 37.37449765026789d, 37.87891309649659d, 38.38727753828926d, 38.89959975977785d, 39.41588851594697d, 39.93615253289054d, 40.460400508064545d, 40.98864111053629d, 41.520882981230194d, 42.05713473317016d, 42.597404951718396d, 43.141702194811224d, 43.6900349931913d, 44.24241185063697d, 44.798841244188324d, 45.35933162437017d, 45.92389141541209d, 46.49252901546552d, 47.065252796817916d, 47.64207110610409d, 48.22299226451468d, 48.808024568002054d, 49.3971762874833d, 49.9904556690408d, 50.587870934119984d, 51.189430279724725d, 51.79514187861014d, 52.40501387947288d, 53.0190544071392d, 53.637271562750364d, 54.259673423945976d, 54.88626804504493d, 55.517063457223934d, 56.15206766869424d, 56.79128866487574d, 57.43473440856916d, 58.08241284012621d, 58.734331877617365d, 59.39049941699807d, 60.05092333227251d, 60.715611475655585d, 61.38457167773311d, 62.057811747619894d, 62.7353394731159d, 63.417162620860914d, 64.10328893648692d, 64.79372614476921d, 65.48848194977529d, 66.18756403501224d, 66.89098006357258d, 67.59873767827808d, 68.31084450182222d, 69.02730813691093d, 69.74813616640164d, 70.47333615344107d, 71.20291564160104d, 71.93688215501312d, 72.67524319850172d, 73.41800625771542d, 74.16517879925733d, 74.9167682708136d, 75.67278210128072d, 76.43322770089146d, 77.1981124613393d, 77.96744375590167d, 78.74122893956174d, 79.51947534912904d, 80.30219030335869d, 81.08938110306934d, 81.88105503125999d, 82.67721935322541d, 83.4778813166706d, 84.28304815182372d, 85.09272707154808d, 85.90692527145302d, 86.72564993000343d, 87.54890820862819d, 88.3767072518277d, 89.2090541872801d, 90.04595612594655d, 90.88742016217518d, 91.73345337380438d, 92.58406282226491d, 93.43925555268066d, 94.29903859396902d, 95.16341895893969d, 96.03240364439274d, 96.9059996312159d, 97.78421388448044d, 98.6670533535366d, 99.55452497210776d};
    public static final fw0 s = new fw0(419222735, new uw0(22), false);
    public static final vq6 s0;
    public static final fw0 t = new fw0(588474320, new uw0(25), false);
    public static final float t0 = 64.0f;
    public static final fw0 u = new fw0(1150451663, new uw0(26), false);
    public static final float u0 = 40.0f;
    public static final fw0 v = new fw0(-1934482638, new sw0(29), false);
    public static final float v0 = 24.0f;
    public static final fw0 w = new fw0(190017577, new ww0(0), false);
    public static final byte[] w0 = {112, 114, 111, 0};
    public static final fw0 x = new fw0(-421434753, new uw0(27), false);
    public static final byte[] x0 = {112, 114, 109, 0};
    public static final fw0 y = new fw0(796844864, new tw0(20), false);
    public static final String[] y0 = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "last_advertising_id_reset", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "ga_session_number", "ga_session_id", "last_gclid", "session_number", "session_id"};
    public static final fw0 z = new fw0(753816959, new tw0(22), false);
    public static final String[] z0 = {"_ln", "_fot", "_fvt", "_ldl", "_id", "_lair", "_fi", "_lte", "_se", "_npa", "_sno", "_sid", "_lgclid", "_sno", "_sid"};

    static {
        vq6 vq6 = vq6.y;
        b = vq6;
        d = vq6;
        s0 = vq6;
    }

    public static double B(double[] dArr) {
        double d2 = dArr[0];
        double[][] dArr2 = o0;
        double[] dArr3 = dArr2[0];
        double d3 = dArr[1];
        double d4 = dArr3[1] * d3;
        double d5 = dArr[2];
        double d6 = (dArr3[2] * d5) + d4 + (dArr3[0] * d2);
        double[] dArr4 = dArr2[1];
        double d7 = (dArr4[2] * d5) + (dArr4[1] * d3) + (dArr4[0] * d2);
        double[] dArr5 = dArr2[2];
        double d8 = d3 * dArr5[1];
        double d9 = d5 * dArr5[2];
        double m2 = m(d6);
        double m3 = m(d7);
        double m4 = m(d9 + d8 + (d2 * dArr5[0]));
        return Math.atan2(((m2 + m3) - (m4 * 2.0d)) / 9.0d, (((-12.0d * m3) + (m2 * 11.0d)) + m4) / 11.0d);
    }

    public static final void C(z1 z1Var, String str) {
        z1Var.t(z1Var.x - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static double D(double d2) {
        int i2;
        double abs = Math.abs(d2);
        double max = Math.max(0.0d, (27.13d * abs) / (400.0d - abs));
        int i3 = (d2 > 0.0d ? 1 : (d2 == 0.0d ? 0 : -1));
        if (i3 < 0) {
            i2 = -1;
        } else if (i3 == 0) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        return Math.pow(max, 2.380952380952381d) * ((double) i2);
    }

    public static boolean E(double d2) {
        if (0.0d > d2 || d2 > 100.0d) {
            return false;
        }
        return true;
    }

    public static final boolean F(Member member) {
        Class cls;
        member.getClass();
        if (member instanceof Method) {
            Method method = (Method) member;
            if (method.getDeclaringClass().isEnum() && Modifier.isStatic(method.getModifiers())) {
                if (!sg3.e(method.getName(), "values") || method.getParameterTypes().length != 0) {
                    if (sg3.e(method.getName(), "valueOf")) {
                        Class[] parameterTypes = method.getParameterTypes();
                        parameterTypes.getClass();
                        if (parameterTypes.length == 1) {
                            cls = parameterTypes[0];
                        } else {
                            cls = null;
                        }
                        if (sg3.e(cls, String.class)) {
                            return true;
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [b1] */
    /* JADX WARNING: Multi-variable type inference failed */
    public static final h27 G(o81 o81, e81 e81, r81 r81, gs2 gs2) {
        b44 b44;
        e81 I2 = su0.I(o81, e81);
        r81.getClass();
        if (r81 == r81.x) {
            b44 = new b44(I2, gs2);
        } else {
            b44 = new b1(I2, true);
        }
        b44.x0(r81, b44, gs2);
        return b44;
    }

    public static /* synthetic */ h27 H(o81 o81, e81 e81, r81 r81, gs2 gs2, int i2) {
        if ((i2 & 1) != 0) {
            e81 = x32.w;
        }
        if ((i2 & 2) != 0) {
            r81 = r81.w;
        }
        return G(o81, e81, r81, gs2);
    }

    public static final float I(vo4 vo4, vo4 vo42, float f2) {
        float f3;
        vo4.getClass();
        vo42.getClass();
        if (0.0f > f2 || f2 > 1.0f) {
            throw new IllegalArgumentException(("Invalid progress: " + f2).toString());
        }
        Iterator it = z65.V(0, vo4.b).iterator();
        while (it.hasNext()) {
            int nextInt = ((je3) it).nextInt();
            float b2 = vo4.b(nextInt);
            int i2 = nextInt + 1;
            float b3 = vo4.b(i2 % vo4.b);
            if (b3 >= b2) {
                if (b2 <= f2 && f2 <= b3) {
                }
            } else if (f2 < b2 && f2 > b3) {
            }
            int i3 = i2 % vo4.b;
            float d2 = j18.d(vo4.b(i3) - vo4.b(nextInt), 1.0f);
            float d3 = j18.d(vo42.b(i3) - vo42.b(nextInt), 1.0f);
            if (d2 < 0.001f) {
                f3 = 0.5f;
            } else {
                f3 = j18.d(f2 - vo4.b(nextInt), 1.0f) / d2;
            }
            return j18.d((d3 * f3) + vo42.b(nextInt), 1.0f);
        }
        kj6.i("Collection contains no element matching the predicate.");
        return 0.0f;
    }

    public static final CharSequence J(int i2, CharSequence charSequence) {
        String str;
        charSequence.getClass();
        if (charSequence.length() >= 200) {
            String str2 = ".....";
            if (i2 == -1) {
                int length = charSequence.length() - 60;
                if (length > 0) {
                    return str2 + charSequence.subSequence(length, charSequence.length()).toString();
                }
            } else {
                int i3 = i2 - 30;
                int i4 = i2 + 30;
                if (i3 <= 0) {
                    str = "";
                } else {
                    str = str2;
                }
                if (i4 >= charSequence.length()) {
                    str2 = "";
                }
                StringBuilder o2 = b81.o(str);
                if (i3 < 0) {
                    i3 = 0;
                }
                int length2 = charSequence.length();
                if (i4 > length2) {
                    i4 = length2;
                }
                o2.append(charSequence.subSequence(i3, i4).toString());
                o2.append(str2);
                return o2.toString();
            }
        }
        return charSequence;
    }

    public static final String K(Number number, String str) {
        StringBuilder sb = new StringBuilder("Unexpected special floating-point value ");
        sb.append(number);
        String str2 = ". ";
        if (str != null) {
            str2 = f21.h(" with key ", str, str2);
        }
        return f21.l(sb, str2, "By default, non-finite floating point values are prohibited because they do not conform JSON specification.");
    }

    public static final void L(ui1 ui1, String str, vr2 vr2) {
        ui1.getClass();
        if (ui1 instanceof e1) {
            e1 e1Var = (e1) ui1;
            mp7.Q(1, vr2);
            ns8 e2 = e1Var.e();
            e1 o2 = e1Var.o();
            vr2.y(o2);
            e2.O(new r75(str, new az0((ArrayList) o2.e().x)));
            return;
        }
        h.s("impossible");
    }

    public static final Object M(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static int[] N(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += (int) r16.d0(byteArrayInputStream, 2);
            iArr[i4] = i3;
        }
        return iArr;
    }

    public static bu1[] O(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, bu1[] bu1Arr) {
        byte[] bArr3 = pd8.t;
        if (Arrays.equals(bArr, bArr3)) {
            if (Arrays.equals(pd8.o, bArr2)) {
                h.s("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
                return null;
            } else if (Arrays.equals(bArr, bArr3)) {
                int d02 = (int) r16.d0(fileInputStream, 1);
                byte[] c02 = r16.c0(fileInputStream, (int) r16.d0(fileInputStream, 4), (int) r16.d0(fileInputStream, 4));
                if (fileInputStream.read() <= 0) {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(c02);
                    try {
                        bu1[] P2 = P(byteArrayInputStream, d02, bu1Arr);
                        byteArrayInputStream.close();
                        return P2;
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                } else {
                    h.s("Content found after the end of file");
                    return null;
                }
            } else {
                h.s("Unsupported meta version");
                return null;
            }
        } else if (Arrays.equals(bArr, pd8.u)) {
            int d03 = (int) r16.d0(fileInputStream, 2);
            byte[] c03 = r16.c0(fileInputStream, (int) r16.d0(fileInputStream, 4), (int) r16.d0(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(c03);
                try {
                    bu1[] Q2 = Q(byteArrayInputStream2, bArr2, d03, bu1Arr);
                    byteArrayInputStream2.close();
                    return Q2;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            } else {
                h.s("Content found after the end of file");
                return null;
            }
        } else {
            h.s("Unsupported meta version");
            return null;
        }
        throw th;
        throw th;
    }

    public static bu1[] P(ByteArrayInputStream byteArrayInputStream, int i2, bu1[] bu1Arr) {
        int i3 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new bu1[0];
        }
        if (i2 == bu1Arr.length) {
            String[] strArr = new String[i2];
            int[] iArr = new int[i2];
            for (int i4 = 0; i4 < i2; i4++) {
                iArr[i4] = (int) r16.d0(byteArrayInputStream, 2);
                strArr[i4] = new String(r16.b0(byteArrayInputStream, (int) r16.d0(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            }
            while (i3 < i2) {
                bu1 bu1 = bu1Arr[i3];
                if (bu1.b.equals(strArr[i3])) {
                    int i5 = iArr[i3];
                    bu1.e = i5;
                    bu1.h = N(byteArrayInputStream, i5);
                    i3++;
                } else {
                    h.s("Order of dexfiles in metadata did not match baseline");
                    return null;
                }
            }
            return bu1Arr;
        }
        h.s("Mismatched number of dex files found in metadata");
        return null;
    }

    public static bu1[] Q(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, bu1[] bu1Arr) {
        bu1 bu1;
        String str;
        if (byteArrayInputStream.available() == 0) {
            return new bu1[0];
        }
        if (i2 == bu1Arr.length) {
            int i3 = 0;
            while (i3 < i2) {
                r16.d0(byteArrayInputStream, 2);
                String str2 = new String(r16.b0(byteArrayInputStream, (int) r16.d0(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
                long d02 = r16.d0(byteArrayInputStream, 4);
                int d03 = (int) r16.d0(byteArrayInputStream, 2);
                if (bu1Arr.length > 0) {
                    int indexOf = str2.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str2.indexOf(":");
                    }
                    if (indexOf > 0) {
                        str = str2.substring(indexOf + 1);
                    } else {
                        str = str2;
                    }
                    int i4 = 0;
                    while (true) {
                        if (i4 >= bu1Arr.length) {
                            break;
                        } else if (bu1Arr[i4].b.equals(str)) {
                            bu1 = bu1Arr[i4];
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
                bu1 = null;
                if (bu1 != null) {
                    bu1.d = d02;
                    int[] N2 = N(byteArrayInputStream, d03);
                    if (Arrays.equals(bArr, pd8.s)) {
                        bu1.e = d03;
                        bu1.h = N2;
                    }
                    i3++;
                } else {
                    h.s("Missing profile key: ".concat(str2));
                    return null;
                }
            }
            return bu1Arr;
        }
        h.s("Mismatched number of dex files found in metadata");
        return null;
    }

    public static bu1[] R(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, pd8.p)) {
            int d02 = (int) r16.d0(fileInputStream, 1);
            byte[] c02 = r16.c0(fileInputStream, (int) r16.d0(fileInputStream, 4), (int) r16.d0(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(c02);
                try {
                    bu1[] S2 = S(byteArrayInputStream, str, d02);
                    byteArrayInputStream.close();
                    return S2;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } else {
                h.s("Content found after the end of file");
                return null;
            }
        } else {
            h.s("Unsupported version");
            return null;
        }
        throw th;
    }

    public static bu1[] S(ByteArrayInputStream byteArrayInputStream, String str, int i2) {
        int i3;
        ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream;
        int i4 = i2;
        int i5 = 0;
        if (byteArrayInputStream2.available() == 0) {
            return new bu1[0];
        }
        bu1[] bu1Arr = new bu1[i4];
        for (int i6 = 0; i6 < i4; i6++) {
            int d02 = (int) r16.d0(byteArrayInputStream2, 2);
            long d03 = r16.d0(byteArrayInputStream2, 4);
            String str2 = str;
            bu1Arr[i6] = new bu1(str2, new String(r16.b0(byteArrayInputStream2, (int) r16.d0(byteArrayInputStream2, 2)), StandardCharsets.UTF_8), r16.d0(byteArrayInputStream2, 4), d02, (int) d03, (int) r16.d0(byteArrayInputStream2, 4), new int[d02], new TreeMap());
        }
        int i7 = 0;
        while (i7 < i4) {
            bu1 bu1 = bu1Arr[i7];
            int available = byteArrayInputStream2.available();
            int i8 = bu1.f;
            int i9 = bu1.g;
            TreeMap treeMap = bu1.i;
            int i10 = available - i8;
            int i11 = i5;
            while (byteArrayInputStream2.available() > i10) {
                i11 += (int) r16.d0(byteArrayInputStream2, 2);
                treeMap.put(Integer.valueOf(i11), 1);
                int d04 = (int) r16.d0(byteArrayInputStream2, 2);
                while (d04 > 0) {
                    r16.d0(byteArrayInputStream2, 2);
                    int d05 = (int) r16.d0(byteArrayInputStream2, 1);
                    if (!(d05 == 6 || d05 == 7)) {
                        while (d05 > 0) {
                            r16.d0(byteArrayInputStream2, 1);
                            int i12 = i5;
                            int i13 = i7;
                            for (int d06 = (int) r16.d0(byteArrayInputStream2, 1); d06 > 0; d06--) {
                                r16.d0(byteArrayInputStream2, 2);
                            }
                            d05--;
                            i5 = i12;
                            i7 = i13;
                        }
                    }
                    d04--;
                    i5 = i5;
                    i7 = i7;
                }
            }
            int i14 = i5;
            int i15 = i7;
            if (byteArrayInputStream2.available() == i10) {
                bu1.h = N(byteArrayInputStream2, bu1.e);
                BitSet valueOf = BitSet.valueOf(r16.b0(byteArrayInputStream2, (((i9 * 2) + 7) & -8) / 8));
                for (int i16 = i14; i16 < i9; i16++) {
                    if (valueOf.get(i16)) {
                        i3 = 2;
                    } else {
                        i3 = i14;
                    }
                    if (valueOf.get(i16 + i9)) {
                        i3 |= 4;
                    }
                    if (i3 != 0) {
                        Integer num = (Integer) treeMap.get(Integer.valueOf(i16));
                        if (num == null) {
                            num = Integer.valueOf(i14);
                        }
                        treeMap.put(Integer.valueOf(i16), Integer.valueOf(i3 | num.intValue()));
                    }
                }
                i7 = i15 + 1;
                i5 = i14;
            } else {
                h.s("Read too much data during profile line parse");
                return null;
            }
        }
        return bu1Arr;
    }

    public static Object T(gs2 gs2) {
        return U(x32.w, gs2);
    }

    public static final Object U(e81 e81, gs2 gs2) {
        e81 e812;
        i72 i72;
        long j2;
        av0 av0;
        hz2 hz2 = hz2.z;
        h81 h81 = (h81) e81.a0(hz2);
        x32 x32 = x32.w;
        if (h81 == null) {
            i72 = ih7.a();
            e812 = su0.o(x32, e81.X(i72), true);
            dn1 dn1 = aw1.a;
            if (e812 != dn1 && e812.a0(hz2) == null) {
                e812 = e812.X(dn1);
            }
        } else {
            i72 = (i72) ih7.a.get();
            e812 = su0.o(x32, e81, true);
            dn1 dn12 = aw1.a;
            if (e812 != dn12 && e812.a0(hz2) == null) {
                e812 = e812.X(dn12);
            }
        }
        y90 y90 = new y90(e812, Thread.currentThread(), i72);
        y90.x0(r81.w, y90, gs2);
        i72 i722 = y90.C;
        if (i722 != null) {
            int i2 = i72.B;
            i722.q0(false);
        }
        while (true) {
            if (i722 != null) {
                try {
                    j2 = i722.r0();
                } catch (Throwable th) {
                    if (i722 != null) {
                        int i3 = i72.B;
                        i722.o0(false);
                    }
                    throw th;
                }
            } else {
                j2 = Long.MAX_VALUE;
            }
            if (!(y90.R() instanceof aa3)) {
                break;
            }
            LockSupport.parkNanos(y90, j2);
            if (Thread.interrupted()) {
                y90.i(new InterruptedException());
            }
        }
        if (i722 != null) {
            int i4 = i72.B;
            i722.o0(false);
        }
        Object a2 = ml3.a(y90.R());
        if (a2 instanceof av0) {
            av0 = (av0) a2;
        } else {
            av0 = null;
        }
        if (av0 == null) {
            return a2;
        }
        throw av0.a;
    }

    public static final void V(TextPaint textPaint, float f2) {
        if (!Float.isNaN(f2)) {
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            textPaint.setAlpha(Math.round(f2 * 255.0f));
        }
    }

    public static final ml4 W(ml4 ml4, String str) {
        return ml4.d(new fc7(str));
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [yg2] */
    /* JADX WARNING: Multi-variable type inference failed */
    public static final c2 X(cu6 cu6, Type type, pp7 pp7, boolean z2) {
        boolean z3;
        if (z2) {
            return cu6;
        }
        vq3 vq3 = cu6.x;
        List<gs3> list = cu6.y;
        ArrayList arrayList = new ArrayList(et0.e0(list, 10));
        for (gs3 gs3 : list) {
            as3 as3 = gs3.b;
            if (as3 != null) {
                gs3 = new gs3(as3, ks3.y);
            }
            arrayList.add(gs3);
        }
        if (pp7 != pp7.w) {
            z3 = true;
        } else {
            z3 = false;
        }
        cu6 p2 = p(type, vq3, arrayList, z3);
        k61 k61 = new k61(type, 1);
        if (!cu6.equals(p2)) {
            cu6 = new yg2(cu6, p2, false, k61);
        }
        return (yg2) cu6;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: cs3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: cs3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: cs3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: cs3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: cs3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: cs3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: cs3} */
    /* JADX WARNING: type inference failed for: r3v3, types: [c2] */
    /* JADX WARNING: type inference failed for: r5v3, types: [yg2] */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02b3, code lost:
        if (r4 == false) goto L_0x02ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x032c, code lost:
        if (((defpackage.cs3) defpackage.dt0.G0(((defpackage.gq3) r4).getTypeParameters())).c() == defpackage.ks3.y) goto L_0x0346;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0346, code lost:
        if (r2 == null) goto L_0x0344;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x034f  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x038e A[RETURN] */
    /* JADX WARNING: Unknown variable types count: 1 */
    public static as3 Y(Type type, Map map, pp7 pp7, boolean z2, boolean z3, gq7 gq7, int i2) {
        as3 as3;
        cu6 cu6;
        int ordinal;
        gq3 gq3;
        ArrayList arrayList;
        gq3 b2;
        pp7 pp72;
        Type type2 = type;
        e7 e7Var = e7.T;
        e7 e7Var2 = e7.S;
        int i3 = i2 & 2;
        pp7 pp73 = pp7.y;
        pp7 pp74 = i3 != 0 ? pp73 : pp7;
        boolean z4 = (i2 & 4) != 0 ? false : z2;
        boolean z5 = (i2 & 8) != 0 ? false : z3;
        gq7 gq72 = (i2 & 16) != 0 ? gq7.x : gq7;
        type2.getClass();
        pp74.getClass();
        gq72.getClass();
        if (type2.equals(Void.TYPE)) {
            return k27.e;
        }
        boolean z6 = type2 instanceof Class;
        Class<gq3> cls = gq3.class;
        Class<Class> cls2 = Class.class;
        gs3 gs3 = null;
        if (z6) {
            Class cls3 = (Class) type2;
            if (g(cls3).isEmpty() || z5) {
                Map map2 = map;
                if (cls3.isArray()) {
                    if (!cls3.getComponentType().isPrimitive()) {
                        Class<?> componentType = cls3.getComponentType();
                        componentType.getClass();
                        gs3 = a0(componentType, map2, z4);
                    }
                    return X(p(type2, b26.a.b(cls3), sg3.F(gs3), false), type2, pp74, z4);
                }
                gq3 b3 = b26.a.b(cls3);
                List<TypeVariable> g2 = g(cls3);
                ArrayList arrayList2 = new ArrayList(et0.e0(g2, 10));
                for (TypeVariable typeVariable : g2) {
                    arrayList2.add(gs3.c);
                }
                cu6 = p(type2, b3, arrayList2, false);
                as3 = null;
            } else {
                if (!z4 || !sg3.e(cls3, cls2)) {
                    cls3.getClass();
                    b2 = b26.a.b(cls3);
                } else {
                    b2 = b26.a.b(cls);
                }
                gq3 gq32 = b2;
                List g3 = g(cls3);
                ArrayList arrayList3 = new ArrayList(et0.e0(g3, 10));
                int i4 = 0;
                for (Object next : g3) {
                    int i5 = i4 + 1;
                    if (i4 >= 0) {
                        Type[] bounds = ((TypeVariable) cl6.U(cl6.S(e7.P, (TypeVariable) next))).getBounds();
                        bounds.getClass();
                        Type type3 = (Type) qs.W0(bounds);
                        pp7 pp75 = pp7.w;
                        if (!z4) {
                            if (sg3.e(kl8.u(gq32).getCanonicalName(), gq32.l())) {
                                pp72 = pp73;
                                gs3 gs32 = gs3.c;
                                type3.getClass();
                                arrayList3.add(x91.C(Y(type3, map, pp72, false, true, (gq7) null, 20)));
                                i4 = i5;
                            } else if (!ie1.P(bb0.c0((vq3) gl0.I(gq32).get(i4), (List) null, false, 7), k27.a)) {
                                pp75 = pp7.x;
                            }
                        }
                        pp72 = pp75;
                        gs3 gs322 = gs3.c;
                        type3.getClass();
                        arrayList3.add(x91.C(Y(type3, map, pp72, false, true, (gq7) null, 20)));
                        i4 = i5;
                    } else {
                        sg3.Z();
                        throw null;
                    }
                }
                cu6 p2 = p(cls3, gq32, arrayList3, false);
                cu6 q2 = q(p2, cls3);
                if (q2 != null) {
                    p2 = q2;
                }
                List<TypeVariable> g4 = g(cls3);
                ArrayList arrayList4 = new ArrayList(et0.e0(g4, 10));
                for (TypeVariable typeVariable2 : g4) {
                    arrayList4.add(gs3.c);
                }
                cu6 p3 = p(cls3, gq32, arrayList4, true);
                return p2.equals(p3) ? p2 : new yg2(p2, p3, true, new k3(7, cls3));
            }
        } else {
            Map map3 = map;
            if (type2 instanceof GenericArrayType) {
                Type genericComponentType = ((GenericArrayType) type2).getGenericComponentType();
                genericComponentType.getClass();
                gs3 a02 = a0(genericComponentType, map3, z4);
                as3 as32 = a02.b;
                as32.getClass();
                return X(p(type2, b26.a.b(g18.e(kl8.u(rj1.v(as32)))), sg3.D(a02), false), type2, pp74, z4);
            } else if (type2 instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type2;
                Type rawType = parameterizedType.getRawType();
                rawType.getClass();
                as3 = null;
                Class cls4 = (Class) rawType;
                if (!z4 || !sg3.e(cls4, cls2)) {
                    gq3 = b26.a.b(cls4);
                } else {
                    gq3 = b26.a.b(cls);
                }
                if (z5) {
                    List<Type> V2 = cl6.V(new xg2(cl6.S(e7Var2, parameterizedType), e7Var, fl6.D));
                    arrayList = new ArrayList(et0.e0(V2, 10));
                    for (Type type4 : V2) {
                        arrayList.add(gs3.c);
                    }
                } else {
                    List<Type> V3 = cl6.V(new xg2(cl6.S(e7Var2, parameterizedType), e7Var, fl6.D));
                    arrayList = new ArrayList(et0.e0(V3, 10));
                    for (Type a03 : V3) {
                        arrayList.add(a0(a03, map3, z4));
                    }
                }
                cu6 = p(type2, gq3, arrayList, false);
            } else {
                as3 = null;
                if (type2 instanceof TypeVariable) {
                    TypeVariable typeVariable3 = (TypeVariable) type2;
                    cs3 cs3 = (cs3) map3.get(typeVariable3);
                    if (cs3 == null) {
                        Iterator it = y(typeVariable3).getTypeParameters().iterator();
                        cs3 cs32 = null;
                        boolean z7 = false;
                        while (true) {
                            if (it.hasNext()) {
                                Object next2 = it.next();
                                if (sg3.e(next2.b(), typeVariable3.getName())) {
                                    if (z7) {
                                        break;
                                    }
                                    cs32 = next2;
                                    z7 = true;
                                }
                            }
                        }
                        cs32 = null;
                        cs3 = cs32;
                        if (cs3 == null) {
                            throw new Error("Type parameter " + typeVariable3.getName() + " is not found in " + y(typeVariable3));
                        }
                    }
                    cu6 = p(type2, cs3, a42.w, false);
                } else if (type2 instanceof WildcardType) {
                    rf2.x("Wildcard type is not possible here: ", type2);
                    return null;
                } else {
                    StringBuilder sb = new StringBuilder("Type is not supported: ");
                    sb.append(type2);
                    Class<?> cls5 = type2.getClass();
                    sb.append(" (");
                    sb.append(cls5);
                    sb.append(')');
                    throw new Error(sb.toString());
                }
            }
        }
        if (!z4) {
            cu6 q3 = q(cu6, type2);
            if (gq72 != gq7.w) {
                if (type2 instanceof ParameterizedType) {
                    Type[] actualTypeArguments = ((ParameterizedType) type2).getActualTypeArguments();
                    actualTypeArguments.getClass();
                    Type type5 = (Type) qs.g1(actualTypeArguments);
                    if ((type5 instanceof WildcardType) && ((WildcardType) type5).getLowerBounds().length == 1 && q3 != null) {
                        vq3 vq3 = q3.x;
                        vq3.getClass();
                    }
                }
                if (q3 != null) {
                    k61 k61 = new k61(type2, 0);
                    if (!q3.equals(cu6)) {
                        q3 = new yg2(q3, cu6, false, k61);
                    }
                    ordinal = pp74.ordinal();
                    if (ordinal != 0) {
                        return q3;
                    }
                    if (ordinal == 1) {
                        return q3.H(true);
                    }
                    if (ordinal != 2) {
                        h.c();
                        return as3;
                    } else if (!z6 || !((Class) type2).isPrimitive()) {
                        c2 D2 = q3.D();
                        if (D2 == null) {
                            D2 = q3;
                        }
                        ? K2 = q3.K();
                        if (K2 != 0) {
                            q3 = K2;
                        }
                        c2 H2 = q3.H(true);
                        k61 k612 = new k61(type2, 2);
                        if (D2.equals(H2)) {
                            return D2;
                        }
                        return new yg2(D2, H2, false, k612);
                    }
                }
                q3 = cu6;
                ordinal = pp74.ordinal();
                if (ordinal != 0) {
                }
            }
        }
        return cu6;
    }

    public static final List Z(TypeVariable[] typeVariableArr, es3 es3) {
        p16 p16;
        es3 es32;
        typeVariableArr.getClass();
        int F2 = tf4.F(typeVariableArr.length);
        if (F2 < 16) {
            F2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(F2);
        for (TypeVariable typeVariable : typeVariableArr) {
            if (es3 instanceof p16) {
                p16 = (p16) es3;
            } else {
                p16 = null;
            }
            if (p16 == null || (es32 = r16.j0(p16)) == null) {
                es32 = es3;
            }
            String name = typeVariable.getName();
            name.getClass();
            linkedHashMap.put(typeVariable, new ds3((qp7) null, es32, name, ks3.w));
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            ds3 ds3 = (ds3) entry.getValue();
            Type[] bounds = ((TypeVariable) entry.getKey()).getBounds();
            bounds.getClass();
            ArrayList arrayList = new ArrayList(bounds.length);
            for (Type type : bounds) {
                type.getClass();
                arrayList.add(Y(type, linkedHashMap, (pp7) null, false, false, (gq7) null, 30));
            }
            ds3.getClass();
            ds3.B = arrayList;
        }
        return dt0.b1(linkedHashMap.values());
    }

    public static final void a(ze7 ze7, fw0 fw0, yt2 yt2, int i2) {
        int i3;
        boolean z2;
        ml4 ml4;
        int i4;
        int i5;
        yt2.g0(1533506138);
        if ((i2 & 6) == 0) {
            if (yt2.i(ze7)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (yt2.i(fw0)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt2.V(i3 & 1, z2)) {
            yt2.e0(-885604480);
            if (!ze7.k()) {
                ml4 = jl4.w;
            } else {
                ml4 = gr8.X(ag8.G(new te7(ze7, (f61) null, 0)), ze7.y, new ne1(ze7, (f61) null, 2), new ue7(ze7, (f61) null, 0), new o71(ze7, 2));
            }
            aa5.b(ml4, fw0, yt2, i3 & 112);
            yt2.r(false);
        } else {
            yt2.Y();
        }
        yx5 v2 = yt2.v();
        if (v2 != null) {
            v2.d = new pu0(ze7, fw0, i2, 0);
        }
    }

    public static final gs3 a0(Type type, Map map, boolean z2) {
        if (!(type instanceof WildcardType)) {
            gs3 gs3 = gs3.c;
            return x91.C(Y(type, map, (pp7) null, z2, false, (gq7) null, 26));
        }
        Type type2 = type;
        Map map2 = map;
        boolean z3 = z2;
        WildcardType wildcardType = (WildcardType) type2;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            rf2.x("Wildcard types with many bounds are not supported: ", type2);
            return null;
        } else if (lowerBounds.length == 1) {
            gs3 gs32 = gs3.c;
            Object j1 = qs.j1(lowerBounds);
            j1.getClass();
            as3 Y2 = Y((Type) j1, map2, (pp7) null, z3, false, (gq7) null, 26);
            Y2.getClass();
            return new gs3(Y2, ks3.x);
        } else {
            Map map3 = map2;
            if (upperBounds.length != 1) {
                return gs3.c;
            }
            if (sg3.e((Type) qs.j1(upperBounds), Object.class)) {
                return gs3.c;
            }
            gs3 gs33 = gs3.c;
            Object j12 = qs.j1(upperBounds);
            j12.getClass();
            as3 Y3 = Y((Type) j12, map3, (pp7) null, z3, false, (gq7) null, 26);
            Y3.getClass();
            return new gs3(Y3, ks3.y);
        }
    }

    public static final JsonEncodingException b(Number number, String str) {
        return new JsonEncodingException(K(number, str), "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
    }

    public static boolean b0(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, bu1[] bu1Arr) {
        Throwable th;
        Throwable th2;
        Throwable th3;
        long j2;
        int i2;
        int length;
        ByteArrayOutputStream byteArrayOutputStream2;
        Throwable th4;
        ByteArrayOutputStream byteArrayOutputStream3;
        Throwable th5;
        ByteArrayOutputStream byteArrayOutputStream4 = byteArrayOutputStream;
        byte[] bArr2 = bArr;
        bu1[] bu1Arr2 = bu1Arr;
        byte[] bArr3 = pd8.s;
        byte[] bArr4 = pd8.r;
        byte[] bArr5 = pd8.o;
        int i3 = 0;
        if (Arrays.equals(bArr2, bArr5)) {
            ArrayList arrayList = new ArrayList(3);
            ArrayList arrayList2 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
            try {
                r16.l0(byteArrayOutputStream5, bu1Arr2.length);
                int i4 = 2;
                int i5 = 2;
                for (bu1 bu1 : bu1Arr2) {
                    r16.k0(byteArrayOutputStream5, bu1.c, 4);
                    r16.k0(byteArrayOutputStream5, bu1.d, 4);
                    r16.k0(byteArrayOutputStream5, (long) bu1.g, 4);
                    String u2 = u(bu1.a, bu1.b, bArr5);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = u2.getBytes(charset).length;
                    r16.l0(byteArrayOutputStream5, length2);
                    i5 = i5 + 14 + length2;
                    byteArrayOutputStream5.write(u2.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream5.toByteArray();
                if (i5 == byteArray.length) {
                    df8 df8 = new df8(1, byteArray, false);
                    byteArrayOutputStream5.close();
                    arrayList.add(df8);
                    ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < bu1Arr2.length) {
                        try {
                            bu1 bu12 = bu1Arr2[i6];
                            r16.l0(byteArrayOutputStream6, i6);
                            r16.l0(byteArrayOutputStream6, bu12.e);
                            i7 = i7 + 4 + (bu12.e * i4);
                            int[] iArr = bu12.h;
                            int length3 = iArr.length;
                            int i8 = i3;
                            while (i3 < length3) {
                                int i9 = iArr[i3];
                                r16.l0(byteArrayOutputStream6, i9 - i8);
                                i3++;
                                i4 = i4;
                                i8 = i9;
                            }
                            int i10 = i4;
                            i6++;
                            i3 = 0;
                        } catch (Throwable th6) {
                            th2.addSuppressed(th6);
                        }
                    }
                    int i11 = i4;
                    byte[] byteArray2 = byteArrayOutputStream6.toByteArray();
                    if (i7 == byteArray2.length) {
                        df8 df82 = new df8(3, byteArray2, true);
                        byteArrayOutputStream6.close();
                        arrayList.add(df82);
                        ByteArrayOutputStream byteArrayOutputStream7 = new ByteArrayOutputStream();
                        int i12 = 0;
                        int i13 = 0;
                        while (i12 < bu1Arr2.length) {
                            try {
                                bu1 bu13 = bu1Arr2[i12];
                                int i14 = 0;
                                for (Map.Entry value : bu13.i.entrySet()) {
                                    i14 |= ((Integer) value.getValue()).intValue();
                                }
                                byteArrayOutputStream2 = new ByteArrayOutputStream();
                                i0(byteArrayOutputStream2, i14, bu13);
                                byte[] byteArray3 = byteArrayOutputStream2.toByteArray();
                                byteArrayOutputStream2.close();
                                byteArrayOutputStream3 = new ByteArrayOutputStream();
                                j0(byteArrayOutputStream3, bu13);
                                byte[] byteArray4 = byteArrayOutputStream3.toByteArray();
                                byteArrayOutputStream3.close();
                                r16.l0(byteArrayOutputStream7, i12);
                                int length4 = byteArray3.length + 2 + byteArray4.length;
                                int i15 = i13 + 6;
                                r16.k0(byteArrayOutputStream7, (long) length4, 4);
                                r16.l0(byteArrayOutputStream7, i14);
                                byteArrayOutputStream7.write(byteArray3);
                                byteArrayOutputStream7.write(byteArray4);
                                i13 = i15 + length4;
                                i12++;
                            } catch (Throwable th7) {
                                th3.addSuppressed(th7);
                            }
                        }
                        byte[] byteArray5 = byteArrayOutputStream7.toByteArray();
                        if (i13 == byteArray5.length) {
                            df8 df83 = new df8(4, byteArray5, true);
                            byteArrayOutputStream7.close();
                            arrayList.add(df83);
                            long size = 12 + ((long) (arrayList.size() * 16));
                            r16.k0(byteArrayOutputStream4, (long) arrayList.size(), 4);
                            int i16 = 0;
                            while (i16 < arrayList.size()) {
                                df8 df84 = (df8) arrayList.get(i16);
                                int i17 = df84.a;
                                byte[] bArr6 = df84.b;
                                if (i17 != 1) {
                                    i2 = i11;
                                    if (i17 == i2) {
                                        j2 = 1;
                                    } else if (i17 == 3) {
                                        j2 = 2;
                                    } else if (i17 == 4) {
                                        j2 = 3;
                                    } else if (i17 == 5) {
                                        j2 = 4;
                                    } else {
                                        throw null;
                                    }
                                } else {
                                    i2 = i11;
                                    j2 = 0;
                                }
                                r16.k0(byteArrayOutputStream4, j2, 4);
                                r16.k0(byteArrayOutputStream4, size, 4);
                                if (df84.c) {
                                    long length5 = (long) bArr6.length;
                                    byte[] v2 = r16.v(bArr6);
                                    arrayList2.add(v2);
                                    r16.k0(byteArrayOutputStream4, (long) v2.length, 4);
                                    r16.k0(byteArrayOutputStream4, length5, 4);
                                    length = v2.length;
                                } else {
                                    arrayList2.add(bArr6);
                                    r16.k0(byteArrayOutputStream4, (long) bArr6.length, 4);
                                    r16.k0(byteArrayOutputStream4, 0, 4);
                                    length = bArr6.length;
                                }
                                size += (long) length;
                                i16++;
                                i11 = i2;
                            }
                            for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                                byteArrayOutputStream4.write((byte[]) arrayList2.get(i18));
                            }
                            return true;
                        }
                        throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray5.length);
                    }
                    throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray2.length);
                }
                throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray.length);
            } catch (Throwable th8) {
                th.addSuppressed(th8);
            }
        } else {
            byte[] bArr7 = pd8.p;
            if (Arrays.equals(bArr2, bArr7)) {
                byte[] o2 = o(bu1Arr2, bArr7);
                r16.k0(byteArrayOutputStream4, (long) bu1Arr2.length, 1);
                r16.k0(byteArrayOutputStream4, (long) o2.length, 4);
                byte[] v3 = r16.v(o2);
                r16.k0(byteArrayOutputStream4, (long) v3.length, 4);
                byteArrayOutputStream4.write(v3);
                return true;
            } else if (Arrays.equals(bArr2, bArr4)) {
                r16.k0(byteArrayOutputStream4, (long) bu1Arr2.length, 1);
                for (bu1 bu14 : bu1Arr2) {
                    String u3 = u(bu14.a, bu14.b, bArr4);
                    Charset charset2 = StandardCharsets.UTF_8;
                    r16.l0(byteArrayOutputStream4, u3.getBytes(charset2).length);
                    r16.l0(byteArrayOutputStream4, bu14.h.length);
                    r16.k0(byteArrayOutputStream4, (long) (bu14.i.size() * 4), 4);
                    r16.k0(byteArrayOutputStream4, bu14.c, 4);
                    byteArrayOutputStream4.write(u3.getBytes(charset2));
                    for (Integer intValue : bu14.i.keySet()) {
                        r16.l0(byteArrayOutputStream4, intValue.intValue());
                        r16.l0(byteArrayOutputStream4, 0);
                    }
                    for (int l02 : bu14.h) {
                        r16.l0(byteArrayOutputStream4, l02);
                    }
                }
                return true;
            } else {
                byte[] bArr8 = pd8.q;
                if (Arrays.equals(bArr2, bArr8)) {
                    byte[] o3 = o(bu1Arr2, bArr8);
                    r16.k0(byteArrayOutputStream4, (long) bu1Arr2.length, 1);
                    r16.k0(byteArrayOutputStream4, (long) o3.length, 4);
                    byte[] v4 = r16.v(o3);
                    r16.k0(byteArrayOutputStream4, (long) v4.length, 4);
                    byteArrayOutputStream4.write(v4);
                    return true;
                } else if (!Arrays.equals(bArr2, bArr3)) {
                    return false;
                } else {
                    r16.l0(byteArrayOutputStream4, bu1Arr2.length);
                    for (bu1 bu15 : bu1Arr2) {
                        String str = bu15.a;
                        TreeMap treeMap = bu15.i;
                        String u4 = u(str, bu15.b, bArr3);
                        Charset charset3 = StandardCharsets.UTF_8;
                        r16.l0(byteArrayOutputStream4, u4.getBytes(charset3).length);
                        r16.l0(byteArrayOutputStream4, treeMap.size());
                        r16.l0(byteArrayOutputStream4, bu15.h.length);
                        r16.k0(byteArrayOutputStream4, bu15.c, 4);
                        byteArrayOutputStream4.write(u4.getBytes(charset3));
                        for (Integer intValue2 : treeMap.keySet()) {
                            r16.l0(byteArrayOutputStream4, intValue2.intValue());
                        }
                        for (int l03 : bu15.h) {
                            r16.l0(byteArrayOutputStream4, l03);
                        }
                    }
                    return true;
                }
            }
        }
        throw th5;
        throw th3;
        throw th2;
        throw th;
        throw th4;
    }

    public static final JsonEncodingException c(ll6 ll6) {
        ll6.getClass();
        String str = "Value of type '" + ll6.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + ll6.u() + '\'';
        ll6.a();
        return new JsonEncodingException(str, "Use 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static double c0(double d2) {
        double d3;
        double d4 = d2 / 100.0d;
        if (d4 <= 0.0031308d) {
            d3 = d4 * 12.92d;
        } else {
            d3 = (Math.pow(d4, 0.4166666666666667d) * 1.055d) - 0.055d;
        }
        return d3 * 255.0d;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: o24} */
    /* JADX WARNING: Multi-variable type inference failed */
    public static final void d(Object obj, int i2, q24 q24, fw0 fw0, yt2 yt2, int i3) {
        int i4;
        boolean z2;
        vr2 vr2;
        int i5;
        int i6;
        int i7;
        int i8;
        Object obj2 = obj;
        int i9 = i2;
        q24 q242 = q24;
        fw0 fw02 = fw0;
        yt2 yt22 = yt2;
        int i10 = i3;
        yt22.g0(872548579);
        if ((i10 & 6) == 0) {
            if (yt22.i(obj2)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i4 = i8 | i10;
        } else {
            i4 = i10;
        }
        if ((i10 & 48) == 0) {
            if (yt22.e(i9)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i4 |= i7;
        }
        if ((i10 & 384) == 0) {
            if (yt22.i(q242)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i4 |= i6;
        }
        if ((i10 & 3072) == 0) {
            if (yt22.i(fw02)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i4 |= i5;
        }
        if ((i4 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i4 & 1, z2)) {
            boolean g2 = yt22.g(obj2) | yt22.g(q242);
            Object Q2 = yt22.Q();
            Object obj3 = ay0.a;
            if (g2 || Q2 == obj3) {
                Q2 = new o24(obj2, q242);
                yt22.o0(Q2);
            }
            o24 o24 = (o24) Q2;
            o24.c = i9;
            ed5 ed5 = o24.g;
            yy0 yy0 = wg5.a;
            o24 o242 = (o24) yt22.k(yy0);
            ix6 h2 = j45.h();
            if (h2 != null) {
                vr2 = h2.e();
            } else {
                vr2 = null;
            }
            ix6 j2 = j45.j(h2);
            try {
                if (o242 != ed5.getValue()) {
                    ed5.setValue(o242);
                    if (o24.d > 0) {
                        o24 o243 = o24.e;
                        if (o243 != null) {
                            o243.b();
                        }
                        if (o242 != null) {
                            o242.a();
                        } else {
                            o242 = null;
                        }
                        o24.e = o242;
                    }
                }
                j45.m(h2, j2, vr2);
                boolean g3 = yt22.g(o24);
                Object Q3 = yt22.Q();
                if (g3 || Q3 == obj3) {
                    Q3 = new h43(10, o24);
                    yt22.o0(Q3);
                }
                t49.e(o24, (vr2) Q3, yt22);
                t49.c(yy0.a(o24), fw02, yt22, ((i4 >> 6) & 112) | 8);
            } catch (Throwable th) {
                j45.m(h2, j2, vr2);
                throw th;
            }
        } else {
            yt22.Y();
        }
        yx5 v2 = yt22.v();
        if (v2 != null) {
            v2.d = new p24(obj2, i9, q242, fw02, i10);
        }
    }

    public static final void d0(vo4 vo4) {
        vo4.getClass();
        Boolean bool = Boolean.TRUE;
        float[] fArr = vo4.a;
        int i2 = vo4.b;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            boolean z2 = true;
            if (i4 >= i2) {
                break;
            }
            float f2 = fArr[i4];
            if (!bool.booleanValue() || 0.0f > f2 || f2 > 1.0f) {
                z2 = false;
            }
            bool = Boolean.valueOf(z2);
            i4++;
        }
        if (bool.booleanValue()) {
            re3 V2 = z65.V(1, vo4.b);
            if (!(V2 instanceof Collection) || !((Collection) V2).isEmpty()) {
                Iterator it = V2.iterator();
                while (((qe3) it).y) {
                    int nextInt = ((je3) it).nextInt();
                    if (vo4.b(nextInt) < vo4.b(nextInt - 1) && (i3 = i3 + 1) < 0) {
                        sg3.Y();
                        throw null;
                    }
                }
            }
            if (i3 > 1) {
                h.j("FloatMapping - Progress wraps more than once: ".concat(vo4.c(vo4, 31)));
                return;
            }
            return;
        }
        h.j("FloatMapping - Progress outside of range: ".concat(vo4.c(vo4, 31)));
    }

    public static final mp4 e(mp4 mp4) {
        int i2 = mp4.g;
        if (i2 == 0) {
            mp4 mp42 = x75.a;
            mp42.getClass();
            return mp42;
        }
        mp4 mp43 = new mp4(i2);
        Object[] objArr = mp4.b;
        long[] jArr = mp4.c;
        for (int i3 = mp4.e; i3 != Integer.MAX_VALUE; i3 = (int) ((jArr[i3] >> 31) & 2147483647L)) {
            mp43.g(objArr[i3]);
        }
        return mp43;
    }

    /* JADX INFO: finally extract failed */
    public static final Object e0(e81 e81, gs2 gs2, f61 f61) {
        e81 e812;
        e81 r2 = f61.r();
        if (!((Boolean) e81.G(new xw0(25), Boolean.FALSE)).booleanValue()) {
            e812 = r2.X(e81);
        } else {
            e812 = su0.o(r2, e81, false);
        }
        r16.x(e812);
        if (e812 == r2) {
            sg6 sg6 = new sg6(f61, e812);
            return o55.t(sg6, true, sg6, gs2);
        }
        hz2 hz2 = hz2.z;
        if (sg3.e(e812.a0(hz2), r2.a0(hz2))) {
            os7 os7 = new os7(f61, e812);
            e81 e813 = os7.A;
            Object c2 = gh7.c(e813, (Object) null);
            try {
                Object t2 = o55.t(os7, true, os7, gs2);
                gh7.a(e813, c2);
                return t2;
            } catch (Throwable th) {
                gh7.a(e813, c2);
                throw th;
            }
        } else {
            sg6 sg62 = new sg6(f61, e812);
            try {
                tv1.a(rc9.a0(rc9.C(sg62, sg62, gs2)), vs7.a);
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = uv1.C;
                do {
                    int i2 = atomicIntegerFieldUpdater.get(sg62);
                    if (i2 != 0) {
                        if (i2 == 2) {
                            Object a2 = ml3.a(sg62.R());
                            if (!(a2 instanceof av0)) {
                                return a2;
                            }
                            throw ((av0) a2).a;
                        }
                        h.s("Already suspended");
                        return null;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(sg62, 0, 1));
                return p81.w;
            } catch (Throwable th2) {
                kl8.k(sg62, th2);
                throw null;
            }
        }
    }

    public static final String f(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            return cls.getName();
        }
        al6 S2 = cl6.S(zq7.D, type);
        StringBuilder sb = new StringBuilder();
        sb.append(((Class) cl6.U(S2)).getName());
        Iterator it = S2.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            it.next();
            i2++;
            if (i2 < 0) {
                sg3.Y();
                throw null;
            }
        }
        sb.append(k57.q0(i2, "[]"));
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007f, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0089, code lost:
        return new androidx.datastore.core.DirectBootUsageException(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008a, code lost:
        r0.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008d, code lost:
        throw r5;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0081 */
    public static final Exception f0(String str, FileNotFoundException fileNotFoundException) {
        Method method;
        int i2;
        Class<String> cls = String.class;
        boolean z2 = false;
        try {
            method = Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{cls, cls});
            method.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.getClass();
            Process.myUserHandle().writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            i2 = obtain.readInt();
        } catch (Throwable th) {
            su0.b(fileNotFoundException, th);
        }
        Object invoke = method.invoke((Object) null, new Object[]{"sys.user." + i2 + ".ce_available", "false"});
        invoke.getClass();
        z2 = ((String) invoke).equals("true");
        if (z2 || str == null) {
            return fileNotFoundException;
        }
        File file = new File(str, "siblingTestFile.txt");
        if (file.exists()) {
            file.delete();
        }
        file.createNewFile();
        file.delete();
        return fileNotFoundException;
    }

    public static final List g(Class cls) {
        cls.getClass();
        return cl6.V(new xg2(cl6.S(e7.Q, cls), e7.R, gl6.D));
    }

    public static void g0(ByteArrayOutputStream byteArrayOutputStream, bu1 bu1) {
        j0(byteArrayOutputStream, bu1);
        int i2 = bu1.g;
        int[] iArr = bu1.h;
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            r16.l0(byteArrayOutputStream, i5 - i4);
            i3++;
            i4 = i5;
        }
        byte[] bArr = new byte[((((i2 * 2) + 7) & -8) / 8)];
        for (Map.Entry entry : bu1.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i6 = intValue / 8;
                bArr[i6] = (byte) (bArr[i6] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i7 = intValue + i2;
                int i8 = i7 / 8;
                bArr[i8] = (byte) ((1 << (i7 % 8)) | bArr[i8]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static final void h(ui1 ui1, vr2[] vr2Arr, vr2 vr2) {
        ui1.getClass();
        if (ui1 instanceof e1) {
            e1 e1Var = (e1) ui1;
            vr2[] vr2Arr2 = (vr2[]) Arrays.copyOf(vr2Arr, vr2Arr.length);
            mp7.Q(1, vr2);
            ArrayList arrayList = new ArrayList(vr2Arr2.length);
            for (vr2 y2 : vr2Arr2) {
                e1 o2 = e1Var.o();
                y2.y(o2);
                arrayList.add(new az0((ArrayList) o2.e().x));
            }
            e1 o3 = e1Var.o();
            vr2.y(o3);
            e1Var.e().O(new tb(new az0((ArrayList) o3.e().x), arrayList));
            return;
        }
        h.s("impossible");
    }

    public static void h0(ByteArrayOutputStream byteArrayOutputStream, bu1 bu1, String str) {
        Charset charset = StandardCharsets.UTF_8;
        r16.l0(byteArrayOutputStream, str.getBytes(charset).length);
        r16.l0(byteArrayOutputStream, bu1.e);
        r16.k0(byteArrayOutputStream, (long) bu1.f, 4);
        r16.k0(byteArrayOutputStream, bu1.c, 4);
        r16.k0(byteArrayOutputStream, (long) bu1.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static boolean i(double d2, double d3, double d4) {
        if (((d3 - d2) + 25.132741228718345d) % 6.283185307179586d < ((d4 - d2) + 25.132741228718345d) % 6.283185307179586d) {
            return true;
        }
        return false;
    }

    public static void i0(ByteArrayOutputStream byteArrayOutputStream, int i2, bu1 bu1) {
        int i3 = bu1.g;
        byte[] bArr = new byte[((((Integer.bitCount(i2 & -2) * i3) + 7) & -8) / 8)];
        for (Map.Entry entry : bu1.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i4 = 0;
            for (int i5 = 1; i5 <= 4; i5 <<= 1) {
                if (!(i5 == 1 || (i5 & i2) == 0)) {
                    if ((i5 & intValue2) == i5) {
                        int i6 = (i4 * i3) + intValue;
                        int i7 = i6 / 8;
                        bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
                    }
                    i4++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [mo1, b1] */
    public static mo1 j(o81 o81, e81 e81, gs2 gs2, int i2) {
        if ((i2 & 1) != 0) {
            e81 = x32.w;
        }
        ? b1Var = new b1(su0.I(o81, e81), true);
        b1Var.x0(r81.w, b1Var, gs2);
        return b1Var;
    }

    public static void j0(ByteArrayOutputStream byteArrayOutputStream, bu1 bu1) {
        int i2 = 0;
        for (Map.Entry entry : bu1.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                r16.l0(byteArrayOutputStream, intValue - i2);
                r16.l0(byteArrayOutputStream, 0);
                i2 = intValue;
            }
        }
    }

    public static final void l(ui1 ui1, char c2) {
        ui1.getClass();
        ui1.a(String.valueOf(c2));
    }

    public static double m(double d2) {
        int i2;
        double pow = Math.pow(Math.abs(d2), 0.42d);
        int i3 = (d2 > 0.0d ? 1 : (d2 == 0.0d ? 0 : -1));
        if (i3 < 0) {
            i2 = -1;
        } else if (i3 == 0) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        return ((((double) i2) * 400.0d) * pow) / (pow + 27.13d);
    }

    public static final Type n(as3 as3, boolean z2) {
        Class cls;
        int i2;
        vq3 J2 = as3.J();
        if (J2 instanceof cs3) {
            cs3 cs3 = (cs3) J2;
            GenericDeclaration genericDeclaration = (GenericDeclaration) cs3.x.getValue();
            if (genericDeclaration != null) {
                TypeVariable[] typeParameters = genericDeclaration.getTypeParameters();
                typeParameters.getClass();
                TypeVariable typeVariable = null;
                boolean z3 = false;
                for (TypeVariable typeVariable2 : typeParameters) {
                    if (sg3.e(typeVariable2.getName(), cs3.b())) {
                        if (!z3) {
                            z3 = true;
                            typeVariable = typeVariable2;
                        } else {
                            h.q("Array contains more than one matching element.");
                            return null;
                        }
                    }
                }
                if (z3) {
                    typeVariable.getClass();
                    return typeVariable;
                }
                kj6.i("Array contains no element matching the predicate.");
                return null;
            }
            kj6.k("javaType is not supported for this type: ", as3);
            return null;
        } else if (J2 instanceof gq3) {
            gq3 gq3 = (gq3) J2;
            if (z2) {
                cls = kl8.v(gq3);
            } else {
                cls = kl8.u(gq3);
            }
            List I2 = as3.I();
            if (I2.isEmpty()) {
                return cls;
            }
            if (!cls.isArray()) {
                return r(cls, I2);
            }
            if (cls.getComponentType().isPrimitive()) {
                return cls;
            }
            gs3 gs3 = (gs3) dt0.S0(I2);
            if (gs3 != null) {
                ks3 ks3 = gs3.a;
                as3 as32 = gs3.b;
                if (ks3 == null) {
                    i2 = -1;
                } else {
                    i2 = yq7.a[ks3.ordinal()];
                }
                if (i2 == -1 || i2 == 1) {
                    return cls;
                }
                if (i2 == 2 || i2 == 3) {
                    as32.getClass();
                    Type n2 = n(as32, false);
                    if (n2 instanceof Class) {
                        return cls;
                    }
                    return new dv2(n2);
                }
                h.c();
                return null;
            }
            kj6.o("kotlin.Array must have exactly one type argument: ", as3);
            return null;
        } else {
            kj6.k("Unsupported type classifier: ", as3);
            return null;
        }
    }

    public static byte[] o(bu1[] bu1Arr, byte[] bArr) {
        int i2 = 0;
        int i3 = 0;
        for (bu1 bu1 : bu1Arr) {
            i3 += ((((bu1.g * 2) + 7) & -8) / 8) + (bu1.e * 2) + u(bu1.a, bu1.b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + bu1.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i3);
        if (Arrays.equals(bArr, pd8.q)) {
            int length = bu1Arr.length;
            while (i2 < length) {
                bu1 bu12 = bu1Arr[i2];
                h0(byteArrayOutputStream, bu12, u(bu12.a, bu12.b, bArr));
                g0(byteArrayOutputStream, bu12);
                i2++;
            }
        } else {
            for (bu1 bu13 : bu1Arr) {
                h0(byteArrayOutputStream, bu13, u(bu13.a, bu13.b, bArr));
            }
            int length2 = bu1Arr.length;
            while (i2 < length2) {
                g0(byteArrayOutputStream, bu1Arr[i2]);
                i2++;
            }
        }
        if (byteArrayOutputStream.size() == i3) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i3);
    }

    public static cu6 p(Type type, vq3 vq3, List list, boolean z2) {
        return new cu6(vq3, list, z2, a42.w, (as3) null, false, false, false, (gq3) null, new k61(type, 3));
    }

    public static final cu6 q(cu6 cu6, Type type) {
        gq3 gq3;
        vp2 vp2;
        vq3 vq3 = cu6.x;
        if (vq3 instanceof gq3) {
            gq3 = (gq3) vq3;
        } else {
            gq3 = null;
        }
        if (gq3 != null) {
            String str = tj3.a;
            String l2 = gq3.l();
            if (l2 != null) {
                vp2 = new vp2(l2);
            } else {
                vp2 = null;
            }
            up2 i2 = tj3.i(vp2);
            if (i2 != null) {
                return new cu6(cu6.x, cu6.y, cu6.z, a42.w, (as3) null, false, false, false, gw8.x(i2, gq3), new k61(type, 3));
            }
        }
        return null;
    }

    public static final sc5 r(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(et0.e0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(x((gs3) it.next()));
            }
            return new sc5(cls, (Type) null, arrayList);
        } else if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(et0.e0(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(x((gs3) it2.next()));
            }
            return new sc5(cls, declaringClass, arrayList2);
        } else {
            int length = cls.getTypeParameters().length;
            sc5 r2 = r(declaringClass, list.subList(length, list.size()));
            List<gs3> subList = list.subList(0, length);
            ArrayList arrayList3 = new ArrayList(et0.e0(subList, 10));
            for (gs3 x2 : subList) {
                arrayList3.add(x(x2));
            }
            return new sc5(cls, r2, arrayList3);
        }
    }

    public static final String t(int i2, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        if (i2 >= 0) {
            sb.append("Unexpected JSON token at offset " + i2 + ": ");
        }
        sb.append(str);
        if (str2 != null && !d57.I0(str2)) {
            sb.append(" at path: ");
            sb.append(str2);
        }
        if (str3 != null && !d57.I0(str3)) {
            sb.append("\n".concat(str3));
        }
        if (str4 != null) {
            sb.append("\nJSON input: ");
            sb.append(str4);
        }
        return sb.toString();
    }

    public static String u(String str, String str2, byte[] bArr) {
        String str3;
        byte[] bArr2 = pd8.r;
        byte[] bArr3 = pd8.s;
        String str4 = "!";
        if (!Arrays.equals(bArr, bArr3) && !Arrays.equals(bArr, bArr2)) {
            str3 = str4;
        } else {
            str3 = ":";
        }
        if (str.length() <= 0) {
            if (str4.equals(str3)) {
                return str2.replace(":", str4);
            }
            if (":".equals(str3)) {
                return str2.replace(str4, ":");
            }
        } else if (str2.equals("classes.dex")) {
            return str;
        } else {
            if (str2.contains(str4) || str2.contains(":")) {
                if (str4.equals(str3)) {
                    return str2.replace(":", str4);
                }
                if (":".equals(str3)) {
                    return str2.replace(str4, ":");
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder o2 = b81.o(str);
                if (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) {
                    str4 = ":";
                }
                return f21.l(o2, str4, str2);
            }
        }
        return str2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [yi0, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, m56] */
    public static bj0 v(zi0 zi0) {
        ? obj = new Object();
        obj.c = new Object();
        bj0 bj0 = new bj0(obj);
        obj.b = bj0;
        obj.a = zi0.getClass();
        try {
            Object b2 = zi0.b(obj);
            if (b2 == null) {
                return bj0;
            }
            obj.a = b2;
            return bj0;
        } catch (Exception e2) {
            bj0.x.k(e2);
            return bj0;
        }
    }

    public static final x83 w() {
        x83 x83 = D0;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("Rounded.Home", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
        int i2 = e38.a;
        ky6 ky6 = new ky6(jt0.b);
        be5 be5 = new be5();
        be5.j(10.0f, 19.0f);
        be5.n(-5.0f);
        be5.g(4.0f);
        be5.n(5.0f);
        be5.e(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        be5.g(3.0f);
        be5.e(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        be5.n(-7.0f);
        be5.g(1.7f);
        be5.e(0.46f, 0.0f, 0.68f, -0.57f, 0.33f, -0.87f);
        be5.h(12.67f, 3.6f);
        be5.e(-0.38f, -0.34f, -0.96f, -0.34f, -1.34f, 0.0f);
        be5.i(-8.36f, 7.53f);
        be5.e(-0.34f, 0.3f, -0.13f, 0.87f, 0.33f, 0.87f);
        be5.f(5.0f);
        be5.n(7.0f);
        be5.e(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        be5.g(3.0f);
        be5.e(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        be5.c();
        w83.a(w83, be5.a, ky6, 14336);
        x83 b2 = w83.b();
        D0 = b2;
        return b2;
    }

    public static final Type x(gs3 gs3) {
        ks3 ks3 = gs3.a;
        if (ks3 == null) {
            return j98.y;
        }
        as3 as3 = gs3.b;
        as3.getClass();
        int ordinal = ks3.ordinal();
        if (ordinal == 0) {
            return n(as3, true);
        }
        if (ordinal == 1) {
            return new j98((Type) null, n(as3, true));
        }
        if (ordinal == 2) {
            return new j98(n(as3, true), (Type) null);
        }
        h.c();
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: yi3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: yi3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: zq3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: yi3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: yi3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: yi3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: yi3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: yi3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: yi3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: zq3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: yi3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: yi3} */
    /* JADX WARNING: Multi-variable type inference failed */
    public static final es3 y(TypeVariable typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (oq3) b26.a.b((Class) genericDeclaration);
        }
        boolean z2 = false;
        yi3 yi3 = null;
        if (genericDeclaration instanceof Constructor) {
            Class declaringClass = ((Constructor) genericDeclaration).getDeclaringClass();
            declaringClass.getClass();
            oq3 oq3 = (oq3) b26.a.b(declaringClass);
            Iterator it = oq3.r().iterator();
            aj3 aj3 = null;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (sg3.e(wn6.i(next), genericDeclaration)) {
                        if (z2) {
                            break;
                        }
                        z2 = true;
                        aj3 = next;
                    }
                } else if (z2) {
                    yi3 = aj3;
                }
            }
            yi3 yi32 = yi3;
            if (yi32 != null) {
                return yi32;
            }
            StringBuilder sb = new StringBuilder("Constructor ");
            sb.append(genericDeclaration);
            sb.append(" is not found in ");
            sb.append(oq3);
            String E02 = dt0.E0(oq3.r(), "\n", (String) null, (String) null, e7.U, 30);
            sb.append(":\n");
            sb.append(E02);
            throw new Error(sb.toString());
        } else if (genericDeclaration instanceof Method) {
            Method method = (Method) genericDeclaration;
            if (Modifier.isStatic(method.getModifiers())) {
                Class<?> declaringClass2 = method.getDeclaringClass();
                declaringClass2.getClass();
                oq3 oq32 = (oq3) b26.a.b(declaringClass2);
                Iterator it2 = uq3.v(oq32).iterator();
                yi3 yi33 = null;
                while (true) {
                    if (it2.hasNext()) {
                        Object next2 = it2.next();
                        if (sg3.e(wn6.k(next2), genericDeclaration)) {
                            if (z2) {
                                break;
                            }
                            z2 = true;
                            yi33 = next2;
                        }
                    } else if (z2) {
                        yi3 = yi33;
                    }
                }
                aj3 aj32 = yi3;
                if (aj32 != null) {
                    return aj32;
                }
                StringBuilder sb2 = new StringBuilder("Method ");
                sb2.append(genericDeclaration);
                sb2.append(" is not found in ");
                sb2.append(oq32);
                String E03 = dt0.E0(uq3.v(oq32), "\n", (String) null, (String) null, e7.O, 30);
                sb2.append(":\n");
                sb2.append(E03);
                throw new Error(sb2.toString());
            }
            rf2.j("Only static methods are supported for now: ", genericDeclaration);
            return null;
        } else {
            h.m("Unsupported container of a type parameter: ", genericDeclaration, " (", typeVariable);
            return null;
        }
    }

    public static final x83 z() {
        x83 x83 = E0;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("Rounded.MailOutline", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
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
        b81.v(f2, 19.0f, 18.0f, 5.0f, 18.0f);
        f2.e(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        f2.h(4.0f, 8.0f);
        f2.i(6.94f, 4.34f);
        f2.e(0.65f, 0.41f, 1.47f, 0.41f, 2.12f, 0.0f);
        f2.h(20.0f, 8.0f);
        f2.n(9.0f);
        f2.e(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        b81.v(f2, 12.0f, 11.0f, 4.0f, 6.0f);
        f2.g(16.0f);
        f2.i(-8.0f, 5.0f);
        f2.c();
        w83.a(w83, f2.a, ky6, 14336);
        x83 b2 = w83.b();
        E0 = b2;
        return b2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        defpackage.dh4.f(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
        throw r2;
     */
    public void A(ua6 ua6, Object obj) {
        ua6.getClass();
        if (obj != null) {
            ab6 k02 = ua6.k0(s());
            k(k02, obj);
            k02.i0();
            dh4.f(k02, (Throwable) null);
            o55.k(ua6);
        }
    }

    public abstract void k(ab6 ab6, Object obj);

    public abstract String s();
}
