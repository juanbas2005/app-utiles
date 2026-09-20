package defpackage;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import android.view.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: rd3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class rd3 {
    public static Context a;
    public static Boolean b;
    public static final Object c = new Object();
    public static final fw0 d = new fw0(-1314329740, new rw0(26), false);
    public static final fw0 e = new fw0(975146677, new rw0(27), false);
    public static final fw0 f = new fw0(1180754667, new rw0(28), false);
    public static final fw0 g = new fw0(-1950631444, new rw0(29), false);
    public static final String[] h = {"\nABCDEFGHIJKLMNOPQRSTUVWXYZ￺\u001c\u001d\u001e￻ ￼\"#$%&'()*+,-./0123456789:￱￲￳￴￸", "`abcdefghijklmnopqrstuvwxyz￺\u001c\u001d\u001e￻{￼}~;<=>?[\\]^_ ,./:@!|￼￵￶￼￰￲￳￴￷", "ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚ￺\u001c\u001d\u001eÛÜÝÞßª¬±²³µ¹º¼½¾￷ ￹￳￴￸", "àáâãäåæçèéêëìíîïðñòóôõö÷øùú￺\u001c\u001d\u001e￻ûüýþÿ¡¨«¯°´·¸»¿￷ ￲￹￴￸", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a￺￼￼\u001b￻\u001c\u001d\u001e\u001f ¢£¤¥¦§©­®¶￷ ￲￳￹￸", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?"};
    public static final wf2 i = new wf2(0);
    public static final Object j = new Object();
    public static final StackTraceElement[] k = new StackTraceElement[0];
    public static final kh7 l = new kh7(0, new long[0], new Object[0]);
    public static final cc2 m;
    public static final cc2[] n;
    public static x83 o;
    public static x83 p;
    public static x83 q;
    public static x83 r;

    static {
        cc2 cc2 = new cc2(9, "auth_api_credentials_begin_sign_in");
        cc2 cc22 = new cc2(2, "auth_api_credentials_sign_out");
        m = cc22;
        n = new cc2[]{cc2, cc22, new cc2(1, "auth_api_credentials_authorize"), new cc2(1, "auth_api_credentials_revoke_access"), new cc2(4, "auth_api_credentials_save_password"), new cc2(6, "auth_api_credentials_get_sign_in_intent"), new cc2(3, "auth_api_credentials_save_account_linking_token"), new cc2(3, "auth_api_credentials_get_phone_number_hint_intent")};
    }

    public static final int A(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action == 0) {
            return 2;
        }
        if (action != 1) {
            return 0;
        }
        return 1;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:18|19|20|21) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0040 */
    public static synchronized boolean B(Context context) {
        Boolean bool;
        synchronized (rd3.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = a;
            if (!(context2 == null || (bool = b) == null)) {
                if (context2 == applicationContext) {
                    boolean booleanValue = bool.booleanValue();
                    return booleanValue;
                }
            }
            b = null;
            if (za5.w()) {
                b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            } else {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                b = Boolean.TRUE;
                b = Boolean.FALSE;
            }
            a = applicationContext;
            boolean booleanValue2 = b.booleanValue();
            return booleanValue2;
        }
    }

    public static boolean C(char c2) {
        if (Character.isWhitespace(c2) || Character.isSpaceChar(c2)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:27|28|40) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:21|(2:30|31)|32|33) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        if (r5 != null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004c, code lost:
        if (r5 == null) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x004f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x0056 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:32:0x0056=Splitter:B:32:0x0056, B:27:0x004f=Splitter:B:27:0x004f} */
    public static void D(Context context, String str) {
        synchronized (c) {
            if (str.equals("")) {
                context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                return;
            }
            try {
                FileOutputStream openFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
                XmlSerializer newSerializer = Xml.newSerializer();
                try {
                    newSerializer.setOutput(openFileOutput, (String) null);
                    newSerializer.startDocument("UTF-8", Boolean.TRUE);
                    newSerializer.startTag((String) null, "locales");
                    newSerializer.attribute((String) null, "application_locales", str);
                    newSerializer.endTag((String) null, "locales");
                    newSerializer.endDocument();
                } catch (Exception e2) {
                    try {
                        Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales in storage ", e2);
                    } catch (Throwable th) {
                        if (openFileOutput != null) {
                            openFileOutput.close();
                        }
                        throw th;
                    }
                }
            } catch (FileNotFoundException unused) {
                Log.w("AppLocalesStorageHelper", "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing ");
            }
        }
    }

    public static final long E(ta3 ta3, z75 z75, sa3 sa3, boolean z) {
        float f2;
        long floatToRawIntBits;
        long floatToRawIntBits2;
        long j2 = ta3.g;
        if (z75 != null) {
            int i2 = sa3.a;
            if (i2 == 1) {
                f2 = Float.intBitsToFloat((int) (j2 >> 32));
            } else if (i2 == 2) {
                f2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
            }
            if (z75 == z75.x) {
                floatToRawIntBits = (long) Float.floatToRawIntBits(0.0f);
                floatToRawIntBits2 = ((long) Float.floatToRawIntBits(f2)) << 32;
            } else {
                floatToRawIntBits = (long) Float.floatToRawIntBits(f2);
                floatToRawIntBits2 = ((long) Float.floatToRawIntBits(0.0f)) << 32;
            }
            j2 = floatToRawIntBits2 | (floatToRawIntBits & 4294967295L);
        }
        long d2 = l35.d(F(ta3, z75, sa3), j2);
        if (z || !ta3.i) {
            return d2;
        }
        return 0;
    }

    public static final long F(ta3 ta3, z75 z75, sa3 sa3) {
        float f2;
        long floatToRawIntBits;
        long floatToRawIntBits2;
        if (z75 == null) {
            return ta3.c;
        }
        int i2 = sa3.a;
        if (i2 == 1) {
            f2 = Float.intBitsToFloat((int) (ta3.c >> 32));
        } else if (i2 != 2) {
            return ta3.c;
        } else {
            f2 = Float.intBitsToFloat((int) (ta3.c & 4294967295L));
        }
        if (z75 == z75.x) {
            floatToRawIntBits = (long) Float.floatToRawIntBits(0.0f);
            floatToRawIntBits2 = ((long) Float.floatToRawIntBits(f2)) << 32;
        } else {
            floatToRawIntBits = (long) Float.floatToRawIntBits(f2);
            floatToRawIntBits2 = ((long) Float.floatToRawIntBits(0.0f)) << 32;
        }
        return floatToRawIntBits2 | (4294967295L & floatToRawIntBits);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:14|15|(2:40|41)|42|43) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
        if (r2 != null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0053, code lost:
        if (r2 == null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005a, code lost:
        if (r1.isEmpty() == false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005d, code lost:
        r8.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x0056 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x0069 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:32:0x0056=Splitter:B:32:0x0056, B:42:0x0069=Splitter:B:42:0x0069} */
    public static String I(Context context) {
        String str;
        synchronized (c) {
            str = "";
            try {
                FileInputStream openFileInput = context.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                try {
                    XmlPullParser newPullParser = Xml.newPullParser();
                    newPullParser.setInput(openFileInput, "UTF-8");
                    int depth = newPullParser.getDepth();
                    while (true) {
                        int next = newPullParser.next();
                        if (next == 1) {
                            break;
                        }
                        if (next == 3) {
                            if (newPullParser.getDepth() <= depth) {
                                break;
                            }
                        }
                        if (next != 3) {
                            if (next != 4) {
                                if (newPullParser.getName().equals("locales")) {
                                    str = newPullParser.getAttributeValue((String) null, "application_locales");
                                    break;
                                }
                            }
                        }
                    }
                } catch (IOException | XmlPullParserException unused) {
                    try {
                        Log.w("AppLocalesStorageHelper", "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                    } catch (Throwable th) {
                        if (openFileInput != null) {
                            openFileInput.close();
                        }
                        throw th;
                    }
                }
            } catch (FileNotFoundException unused2) {
                return str;
            }
        }
        return str;
    }

    public static final ql4 J(sl4 sl4, up2 up2) {
        ql4 ql4;
        vq0 vq0;
        ji4 Y;
        sl4.getClass();
        up2.getClass();
        vp2 vp2 = up2.a;
        if (!vp2.c()) {
            y34 y34 = sl4.k0(up2.b()).C;
            uq4 g2 = vp2.g();
            oz4 oz4 = oz4.w;
            vq0 e2 = y34.e(g2, oz4);
            if (e2 instanceof ql4) {
                ql4 = (ql4) e2;
            } else {
                ql4 = null;
            }
            if (ql4 != null) {
                return ql4;
            }
            ql4 J = J(sl4, up2.b());
            if (J == null || (Y = J.Y()) == null) {
                vq0 = null;
            } else {
                vq0 = Y.e(vp2.g(), oz4);
            }
            if (vq0 instanceof ql4) {
                return (ql4) vq0;
            }
        }
        return null;
    }

    public static final void K(int i2, int i3) {
        if (i2 <= 0 || i3 <= 0) {
            bc3.a("both minLines " + i2 + " and maxLines " + i3 + " must be greater than zero");
        }
        if (i2 > i3) {
            bc3.a("minLines " + i2 + " must be less than or equal to maxLines " + i3);
        }
    }

    public static final iz0 a() {
        return new iz0();
    }

    public static final df b(String str) {
        return new df(wn6.w(str));
    }

    public static final boolean c(ta3 ta3) {
        if (!ta3.h || ta3.d) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c2  */
    public static final n74 d(aj3 aj3, boolean z) {
        boolean z2;
        ArrayList C;
        int i2;
        int length;
        int i3;
        String str;
        pp7 pp7;
        boolean z3;
        aj3 aj32 = aj3;
        Member member = aj32.y;
        n74 m2 = sg3.m();
        n74 n74 = null;
        if ((aj32 instanceof yi3) || Modifier.isStatic(member.getModifiers())) {
            if (member instanceof Constructor) {
                Class declaringClass = ((Constructor) member).getDeclaringClass();
                declaringClass.getClass();
                if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
                    z2 = true;
                    Type[] P = aj32.P();
                    if (z && z2) {
                        Class<?> declaringClass2 = ((Constructor) member).getDeclaringClass().getDeclaringClass();
                        declaringClass2.getClass();
                        m2.add(new od3(aj32, b26.a.b(declaringClass2)));
                    }
                    C = td0.D.C(member);
                    if (C == null) {
                        i2 = C.size() - P.length;
                    } else {
                        i2 = 0;
                    }
                    TypeVariable[] Q = aj32.Q();
                    List typeParameters = aj32.getTypeParameters();
                    Q.getClass();
                    typeParameters.getClass();
                    int length2 = Q.length;
                    ArrayList arrayList = new ArrayList(Math.min(et0.e0(typeParameters, 10), length2));
                    int i4 = 0;
                    for (Object next : typeParameters) {
                        if (i4 >= length2) {
                            break;
                        }
                        arrayList.add(new yb5(Q[i4], next));
                        i4++;
                        n74 = n74;
                    }
                    n74 n742 = n74;
                    Map a0 = sf4.a0(arrayList);
                    length = P.length;
                    i3 = 0;
                    while (i3 < length) {
                        Type type = P[i3];
                        if (!(i3 == 0 && z2 && P.length == aj32.R().length) && (i3 >= 2 || !member.getDeclaringClass().isEnum() || !(member instanceof Constructor) || P.length != aj32.R().length)) {
                            if (C != null) {
                                str = (String) dt0.z0(i3 + i2, C);
                                if (str == null) {
                                    rf2.e(i3, i2, aj32.getName(), type, member);
                                    return n742;
                                }
                            } else {
                                str = hl6.k(i3, "arg");
                            }
                            if (ar7.F(member)) {
                                pp7 = pp7.w;
                            } else {
                                pp7 = pp7.y;
                            }
                            as3 Y = ar7.Y(type, a0, pp7, false, false, (gq7) null, 28);
                            int f2 = m2.f();
                            if (i3 != P.length - 1 || !aj32.S()) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            m2.add(new fj3(aj32, str, Y, f2, z3));
                        }
                        i3++;
                        aj32 = aj3;
                    }
                    return sg3.i(m2);
                }
            }
            z2 = false;
            Type[] P2 = aj32.P();
            Class<?> declaringClass22 = ((Constructor) member).getDeclaringClass().getDeclaringClass();
            declaringClass22.getClass();
            m2.add(new od3(aj32, b26.a.b(declaringClass22)));
            C = td0.D.C(member);
            if (C == null) {
            }
            TypeVariable[] Q2 = aj32.Q();
            List typeParameters2 = aj32.getTypeParameters();
            Q2.getClass();
            typeParameters2.getClass();
            int length22 = Q2.length;
            ArrayList arrayList2 = new ArrayList(Math.min(et0.e0(typeParameters2, 10), length22));
            int i42 = 0;
            while (r2.hasNext()) {
            }
            n74 n7422 = n74;
            Map a02 = sf4.a0(arrayList2);
            length = P2.length;
            i3 = 0;
            while (i3 < length) {
            }
            return sg3.i(m2);
        }
        rf2.j("Only Java constructors and static functions are supported for now: ", member);
        return null;
    }

    public static final boolean h(ta3 ta3) {
        if (ta3.h || !ta3.d) {
            return false;
        }
        return true;
    }

    public static void i(int i2) {
        if (2 > i2 || i2 >= 37) {
            h.n(pb4.o(i2, "radix ", " was not in valid range "), new pe3(2, 36, 1));
        }
    }

    public static final List j(ArrayList arrayList) {
        arrayList.getClass();
        int size = arrayList.size();
        if (size == 0) {
            return a42.w;
        }
        if (size == 1) {
            return sg3.D(dt0.w0(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public static final int k(float f2, float f3, float f4, int i2, int i3) {
        if (i2 == i3) {
            return -1;
        }
        int i4 = i2 - 2;
        if (i4 < 0) {
            i4 = 0;
        }
        float f5 = (f3 * ((float) i4)) + f2;
        int i5 = 1;
        int i6 = i2 - 1;
        if (i6 <= 1) {
            i5 = i6;
        }
        return dh4.C((f4 * ((float) i5)) + f5);
    }

    public static final boolean l(ly5 ly5, float f2, float f3) {
        float f4 = ly5.a;
        if (f2 > ly5.c || f4 > f2) {
            return false;
        }
        float f5 = ly5.b;
        if (f3 > ly5.d || f5 > f3) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, nx4] */
    public static final iu4 m(Context context) {
        context.getClass();
        iu4 iu4 = new iu4(context);
        ht4 ht4 = iu4.b;
        ox4 ox4 = ht4.s;
        ox4.a(new hu4(ox4));
        ox4 ox42 = ht4.s;
        ox42.a(new hx0());
        ox42.a(new Object());
        return iu4;
    }

    public static final vf1 n(String str) {
        Pattern compile = Pattern.compile("[^dMy/\\-.]");
        compile.getClass();
        str.getClass();
        String replaceAll = compile.matcher(str).replaceAll("");
        replaceAll.getClass();
        Pattern compile2 = Pattern.compile("d{1,2}");
        compile2.getClass();
        String replaceAll2 = compile2.matcher(replaceAll).replaceAll("dd");
        replaceAll2.getClass();
        Pattern compile3 = Pattern.compile("M{1,2}");
        compile3.getClass();
        String replaceAll3 = compile3.matcher(replaceAll2).replaceAll("MM");
        replaceAll3.getClass();
        Pattern compile4 = Pattern.compile("y{1,4}");
        compile4.getClass();
        String replaceAll4 = compile4.matcher(replaceAll3).replaceAll("yyyy");
        replaceAll4.getClass();
        String S0 = d57.S0(k57.s0(replaceAll4, "My", "M/y"), ".");
        Pattern compile5 = Pattern.compile("[/\\-.]");
        compile5.getClass();
        Matcher matcher = compile5.matcher(S0);
        matcher.getClass();
        xf4 g2 = t35.g(matcher, 0, S0);
        g2.getClass();
        uf4 g3 = g2.c.g(0);
        g3.getClass();
        return new vf1(S0, g3.a.charAt(0));
    }

    public static final ArrayList o(n74 n74, n74 n742) {
        Iterator it = sg3.v(n742).iterator();
        qe3 qe3 = (qe3) it;
        if (qe3.y) {
            je3 je3 = (je3) it;
            int nextInt = je3.nextInt();
            if (!qe3.y) {
                int f2 = n74.f();
                int f3 = n742.f();
                ArrayList I = sg3.I(n742.get(nextInt));
                int i2 = nextInt;
                int i3 = 1;
            } else {
                float q2 = q(((tq5) n74.get(0)).b, ((tq5) n742.get(nextInt)).b);
                do {
                    int nextInt2 = je3.nextInt();
                    float q3 = q(((tq5) n74.get(0)).b, ((tq5) n742.get(nextInt2)).b);
                    if (Float.compare(q2, q3) > 0) {
                        nextInt = nextInt2;
                        q2 = q3;
                    }
                } while (qe3.y);
            }
            int f22 = n74.f();
            int f32 = n742.f();
            ArrayList I2 = sg3.I(n742.get(nextInt));
            int i22 = nextInt;
            int i32 = 1;
            while (i32 < f22) {
                int i4 = nextInt - (f22 - i32);
                if (i4 <= i22) {
                    i4 += f32;
                }
                Iterator it2 = new pe3(i22 + 1, i4, 1).iterator();
                qe3 qe32 = (qe3) it2;
                if (qe32.y) {
                    je3 je32 = (je3) it2;
                    int nextInt3 = je32.nextInt();
                    if (!qe32.y) {
                        i22 = nextInt3;
                    } else {
                        float q4 = q(((tq5) n74.get(i32)).b, ((tq5) n742.get(nextInt3 % f32)).b);
                        do {
                            int nextInt4 = je32.nextInt();
                            float q5 = q(((tq5) n74.get(i32)).b, ((tq5) n742.get(nextInt4 % f32)).b);
                            if (Float.compare(q4, q5) > 0) {
                                nextInt3 = nextInt4;
                                q4 = q5;
                            }
                        } while (qe32.y);
                    }
                    i22 = nextInt3;
                    I2.add(n742.get(i22 % f32));
                    i32++;
                } else {
                    rf2.c();
                    return null;
                }
            }
            return I2;
        }
        rf2.c();
        return null;
    }

    public static final boolean p(char c2, char c3, boolean z) {
        if (c2 == c3) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        if (upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
            return true;
        }
        return false;
    }

    public static final float q(dc2 dc2, dc2 dc22) {
        dc2.getClass();
        List list = dc2.a;
        dc22.getClass();
        List list2 = dc22.a;
        if ((dc2 instanceof ac2) && (dc22 instanceof ac2) && ((ac2) dc2).d != ((ac2) dc22).d) {
            return Float.MAX_VALUE;
        }
        float f2 = ((qc1) dt0.w0(list)).a[0];
        float f3 = ((qc1) dt0.w0(list)).a[1];
        float f4 = ((qc1) dt0.w0(list2)).a[0];
        float f5 = ((qc1) dt0.w0(list2)).a[1];
        float a2 = ((((qc1) dt0.G0(list)).a() + f2) / 2.0f) - ((((qc1) dt0.G0(list2)).a() + f4) / 2.0f);
        float b2 = ((((qc1) dt0.G0(list)).b() + f3) / 2.0f) - ((((qc1) dt0.G0(list2)).b() + f5) / 2.0f);
        return (b2 * b2) + (a2 * a2);
    }

    public static li4 r(gw8 gw8) {
        if (gw8 instanceof qo3) {
            qo3 qo3 = (qo3) gw8;
            String str = qo3.t;
            String str2 = qo3.u;
            str.getClass();
            str2.getClass();
            return new li4(str.concat(str2));
        } else if (gw8 instanceof po3) {
            po3 po3 = (po3) gw8;
            String str3 = po3.t;
            String str4 = po3.u;
            str3.getClass();
            str4.getClass();
            return new li4(str3 + '#' + str4);
        } else {
            h.c();
            return null;
        }
    }

    public static final int s(am2 am2, int i2) {
        boolean z;
        boolean z2;
        if (sg3.k(am2.w, am2.x.w) >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (i2 == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        if (z2) {
            return 2;
        }
        return 0;
    }

    public static final String[] t(r51 r51) {
        r51.getClass();
        return (String[]) ((df) r51).b.toArray(new String[0]);
    }

    public static final x83 u() {
        x83 x83 = p;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("Rounded.Email", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
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
        f2.j(19.6f, 8.25f);
        f2.i(-7.07f, 4.42f);
        f2.e(-0.32f, 0.2f, -0.74f, 0.2f, -1.06f, 0.0f);
        f2.h(4.4f, 8.25f);
        f2.e(-0.25f, -0.16f, -0.4f, -0.43f, -0.4f, -0.72f);
        f2.e(0.0f, -0.67f, 0.73f, -1.07f, 1.3f, -0.72f);
        f2.h(12.0f, 11.0f);
        f2.i(6.7f, -4.19f);
        f2.e(0.57f, -0.35f, 1.3f, 0.05f, 1.3f, 0.72f);
        f2.e(0.0f, 0.29f, -0.15f, 0.56f, -0.4f, 0.72f);
        f2.c();
        w83.a(w83, f2.a, ky6, 14336);
        x83 b2 = w83.b();
        p = b2;
        return b2;
    }

    public static final x83 v() {
        x83 x83 = q;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("Outlined.Forum", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
        int i2 = e38.a;
        ky6 ky6 = new ky6(jt0.b);
        be5 be5 = new be5();
        be5.j(15.0f, 4.0f);
        be5.n(7.0f);
        be5.h(5.17f, 11.0f);
        be5.h(4.0f, 12.17f);
        be5.h(4.0f, 4.0f);
        be5.g(11.0f);
        qe5 qe5 = new qe5(1.0f, -2.0f);
        ArrayList arrayList = be5.a;
        arrayList.add(qe5);
        be5.h(3.0f, 2.0f);
        be5.e(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        be5.n(14.0f);
        be5.i(4.0f, -4.0f);
        be5.g(10.0f);
        be5.e(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        be5.h(17.0f, 3.0f);
        be5.e(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        be5.c();
        be5.j(21.0f, 6.0f);
        be5.g(-2.0f);
        be5.n(9.0f);
        be5.h(6.0f, 15.0f);
        be5.n(2.0f);
        be5.e(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        be5.g(11.0f);
        be5.i(4.0f, 4.0f);
        be5.h(22.0f, 7.0f);
        be5.e(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        be5.c();
        w83.a(w83, arrayList, ky6, 14336);
        x83 b2 = w83.b();
        q = b2;
        return b2;
    }

    public static int w(byte[] bArr, byte[] bArr2) {
        int i2;
        if (bArr2.length != 0) {
            int i3 = 0;
            for (int i4 = 0; i4 < bArr2.length; i4++) {
                int i5 = bArr2[i4] - 1;
                if (((1 << (5 - (i5 % 6))) & bArr[i5 / 6]) == 0) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                i3 += i2 << ((bArr2.length - i4) - 1);
            }
            return i3;
        }
        ku4.v();
        return 0;
    }

    public static final long x(KeyEvent keyEvent) {
        return uq3.f(keyEvent.getKeyCode());
    }

    public static String y(byte[] bArr, int i2, int i3) {
        int i4;
        StringBuilder sb = new StringBuilder();
        int i5 = i2;
        int i6 = -1;
        int i7 = 0;
        int i8 = 0;
        while (i5 < i2 + i3) {
            char charAt = h[i7].charAt(bArr[i5]);
            switch (charAt) {
                case 65520:
                case 65521:
                case 65522:
                case 65523:
                case 65524:
                    i8 = i7;
                    i7 = charAt - 65520;
                    i4 = 1;
                    break;
                case 65525:
                    i4 = 2;
                    break;
                case 65526:
                    i4 = 3;
                    break;
                case 65527:
                    i4 = -1;
                    break;
                case 65528:
                    i4 = -1;
                    i7 = 1;
                    break;
                case 65529:
                    i4 = -1;
                    break;
                case 65531:
                    i5 += 5;
                    sb.append(new DecimalFormat("000000000").format((long) ((bArr[i5 + 1] << 24) + (bArr[i5 + 2] << 18) + (bArr[i5 + 3] << 12) + (bArr[i5 + 4] << 6) + bArr[i5])));
                    break;
                default:
                    sb.append(charAt);
                    break;
            }
            i8 = i7;
            i7 = 0;
            int i9 = i4 - 1;
            if (i4 == 0) {
                i7 = i8;
            }
            i5++;
            i6 = i9;
        }
        while (sb.length() > 0 && sb.charAt(sb.length() - 1) == 65532) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public static final vq0 z(vj1 vj1) {
        vj1 r2 = vj1.r();
        if (r2 == null || (vj1 instanceof x95)) {
            return null;
        }
        if (!(r2.r() instanceof x95)) {
            return z(r2);
        }
        if (r2 instanceof vq0) {
            return (vq0) r2;
        }
        return null;
    }

    public abstract void G(y2 y2Var, y2 y2Var2);

    public abstract void H(y2 y2Var, Thread thread);

    public abstract boolean e(z2 z2Var, v2 v2Var, v2 v2Var2);

    public abstract boolean f(z2 z2Var, Object obj, Object obj2);

    public abstract boolean g(z2 z2Var, y2 y2Var, y2 y2Var2);
}
