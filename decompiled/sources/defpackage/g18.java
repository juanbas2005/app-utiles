package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: g18  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class g18 {
    public static final up2 a = new up2("kotlin.jvm.JvmStatic");
    public static final String b;

    static {
        StringBuilder sb = new StringBuilder();
        gt2 gt2 = gt2.d;
        sb.append(gt2.a.a.a);
        sb.append('.');
        sb.append(gt2.b);
        b = sb.toString();
    }

    public static final p16 a(eq3 eq3) {
        if (eq3 instanceof w14) {
            return a(((w14) eq3).s());
        }
        if (eq3 instanceof p16) {
            return (p16) eq3;
        }
        if (eq3 instanceof ti0) {
            eq3 N = ((ti0) eq3).N();
            if (N == eq3) {
                N = null;
            }
            if (N != null) {
                return a(N);
            }
        }
        return null;
    }

    public static final s16 b(Object obj) {
        if (obj instanceof s16) {
            return (s16) obj;
        }
        if (obj instanceof ct2) {
            eq3 N = ((ct2) obj).N();
            if (N instanceof s16) {
                return (s16) N;
            }
        }
        return null;
    }

    public static final u16 c(Object obj) {
        if (obj instanceof w14) {
            return c(((w14) obj).s());
        }
        if (obj instanceof u16) {
            return (u16) obj;
        }
        if (obj instanceof ir5) {
            eq3 N = ((ir5) obj).N();
            if (N == obj) {
                N = null;
            }
            if (N != null) {
                return c(N);
            }
        }
        return null;
    }

    public static final List d(ql qlVar) {
        Annotation annotation;
        n06 n06;
        qlVar.getClass();
        rm<fm> annotations = qlVar.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (fm fmVar : annotations) {
            sy6 e = fmVar.e();
            if (e instanceof k06) {
                annotation = ((k06) e).w;
            } else if (e instanceof sa6) {
                c16 c16 = ((sa6) e).w;
                if (c16 instanceof n06) {
                    n06 = (n06) c16;
                } else {
                    n06 = null;
                }
                if (n06 != null) {
                    annotation = n06.a;
                } else {
                    annotation = null;
                }
            } else {
                annotation = p(fmVar);
            }
            if (annotation != null) {
                arrayList.add(annotation);
            }
        }
        return t(arrayList);
    }

    public static final Class e(Class cls) {
        cls.getClass();
        return Array.newInstance(cls, 0).getClass();
    }

    public static final Object f(Type type) {
        type.getClass();
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isPrimitive()) {
                if (cls.equals(Boolean.TYPE)) {
                    return Boolean.FALSE;
                }
                if (cls.equals(Character.TYPE)) {
                    return 0;
                }
                if (cls.equals(Byte.TYPE)) {
                    return (byte) 0;
                }
                if (cls.equals(Short.TYPE)) {
                    return (short) 0;
                }
                if (cls.equals(Integer.TYPE)) {
                    return 0;
                }
                if (cls.equals(Float.TYPE)) {
                    return Float.valueOf(0.0f);
                }
                if (cls.equals(Long.TYPE)) {
                    return 0L;
                }
                if (cls.equals(Double.TYPE)) {
                    return Double.valueOf(0.0d);
                }
                if (cls.equals(Void.TYPE)) {
                    h.s("Parameter with void type is illegal");
                    return null;
                }
                kj6.k("Unknown primitive: ", type);
            }
        }
        return null;
    }

    public static final pi0 g(Class cls, it1 it1, wu2 wu2, vq4 vq4, wv1 wv1, n80 n80, gs2 gs2) {
        List list;
        cls.getClass();
        wu2.getClass();
        vq4.getClass();
        n80.getClass();
        ra6 a2 = rl4.a(cls);
        if (wu2 instanceof js5) {
            list = ((js5) wu2).E;
        } else if (wu2 instanceof qs5) {
            list = ((qs5) wu2).E;
        } else {
            ta1.l("Unsupported message: ", wu2);
            return null;
        }
        List list2 = list;
        ws1 ws1 = a2.a;
        sl4 sl4 = ws1.b;
        i48 i48 = i48.b;
        list2.getClass();
        return (pi0) gs2.H(new ei4(new z00(ws1, vq4, sl4, wv1, i48, n80, it1, (bk7) null, list2)), wu2);
    }

    public static final qz3 h(vq1 vq1) {
        oq3 oq3;
        vq1.getClass();
        ri0 R = vq1.R();
        fq3 fq3 = vq1.w;
        if (fq3.d == null || !mb2.e(vq1)) {
            if (fq3.d != null && !mb2.e(vq1)) {
                yq3 B = vq1.B();
                if (B instanceof oq3) {
                    oq3 = (oq3) B;
                } else {
                    oq3 = null;
                }
                if (oq3 != null) {
                    return oq3.c0().Q();
                }
            } else if (R instanceof s31) {
                return ((zs2) ((s31) R)).F;
            } else {
                if (R.W() != null) {
                    vj1 r = R.r();
                    r.getClass();
                    return ((ql4) r).Q();
                }
            }
        }
        return null;
    }

    public static final boolean i(as3 as3) {
        oq3 oq3;
        as3.getClass();
        vq3 J = as3.J();
        if (J instanceof oq3) {
            oq3 = (oq3) J;
        } else {
            oq3 = null;
        }
        if (oq3 == null || !oq3.z()) {
            return false;
        }
        return true;
    }

    public static final boolean j(gq3 gq3) {
        Method method;
        Class<?> componentType;
        Annotation annotation;
        Object invoke;
        Class u = kl8.u(gq3);
        try {
            method = u.getDeclaredMethod("value", (Class[]) Arrays.copyOf(new Class[0], 0));
        } catch (NoSuchMethodException unused) {
            method = null;
        }
        if (!(method == null || (componentType = method.getReturnType().getComponentType()) == null || !componentType.isAnnotation())) {
            Annotation[] annotations = componentType.getAnnotations();
            annotations.getClass();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    annotation = null;
                    break;
                }
                annotation = annotations[i];
                if (kl8.u(kl8.p(annotation)).getName().equals(nn3.g.a.a)) {
                    break;
                }
                i++;
            }
            if (!(annotation == null || (invoke = kl8.u(kl8.p(annotation)).getMethod("value", (Class[]) null).invoke(annotation, (Object[]) null)) == null)) {
                return u.equals(invoke);
            }
        }
        return false;
    }

    public static final boolean k(as3 as3) {
        as3.getClass();
        if (as3.v()) {
            return true;
        }
        c2 c2Var = (c2) as3;
        c2 K = c2Var.K();
        if (K != null && k(K)) {
            return true;
        }
        if (c2Var.s()) {
            return false;
        }
        vq3 J = as3.J();
        if (!(J instanceof cs3)) {
            return false;
        }
        List<as3> upperBounds = ((cs3) J).getUpperBounds();
        if (upperBounds.isEmpty()) {
            return false;
        }
        for (as3 k : upperBounds) {
            if (k(k)) {
                return true;
            }
        }
        return false;
    }

    public static final Class l(ClassLoader classLoader, gq0 gq0, int i) {
        gq0.getClass();
        vp2 vp2 = gq0.a().a;
        String str = vp2.a;
        Integer v0 = k57.v0(d57.c1(str, b, str));
        if (v0 != null) {
            int intValue = v0.intValue();
            dt2 dt2 = dt2.d;
            return l(classLoader, new gq0(dt2.a, dt2.a(intValue + 1)), i);
        }
        String str2 = tj3.a;
        gq0 h = tj3.h(vp2);
        if (h == null) {
            h = gq0;
        }
        if (!h.equals(gq0)) {
            classLoader = m06.d(vs7.class);
        }
        String str3 = h.a.a.a;
        String str4 = h.b.a.a;
        if (sg3.e(str3, "kotlin")) {
            switch (str4.hashCode()) {
                case -901856463:
                    if (str4.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str4.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str4.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str4.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str4.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str4.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str4.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str4.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str4.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (i > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                sb.append("[");
            }
            sb.append("L");
        }
        if (str3.length() > 0) {
            sb.append(str3.concat("."));
        }
        sb.append(k57.r0(str4, '.', '$'));
        if (i > 0) {
            sb.append(";");
        }
        try {
            return Class.forName(sb.toString(), false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static final jz0 m(ClassLoader classLoader, String str, boolean z) {
        Class cls;
        str.getClass();
        bt2 o = o(str);
        ArrayList arrayList = o.c;
        ArrayList arrayList2 = new ArrayList(et0.e0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            arrayList2.add(n(classLoader, str2, 0, str2.length()));
        }
        if (z) {
            String str3 = o.b;
            cls = n(classLoader, str3, 0, str3.length());
        } else {
            cls = null;
        }
        return new jz0(28, arrayList2, cls);
    }

    public static final Class n(ClassLoader classLoader, String str, int i, int i2) {
        char charAt = str.charAt(i);
        if (charAt == 'F') {
            return Float.TYPE;
        }
        if (charAt == 'L') {
            String replace = str.substring(i + 1, i2 - 1).replace('/', '.');
            replace.getClass();
            Class<?> loadClass = classLoader.loadClass(replace);
            loadClass.getClass();
            return loadClass;
        } else if (charAt == 'S') {
            return Short.TYPE;
        } else {
            if (charAt == 'V') {
                Class cls = Void.TYPE;
                cls.getClass();
                return cls;
            } else if (charAt == 'I') {
                return Integer.TYPE;
            } else {
                if (charAt == 'J') {
                    return Long.TYPE;
                }
                if (charAt == 'Z') {
                    return Boolean.TYPE;
                }
                if (charAt == '[') {
                    return e(n(classLoader, str, i + 1, i2));
                }
                switch (charAt) {
                    case 'B':
                        return Byte.TYPE;
                    case 'C':
                        return Character.TYPE;
                    case 'D':
                        return Double.TYPE;
                    default:
                        throw new Error("Unknown type prefix in the method signature: ".concat(str));
                }
            }
        }
    }

    public static final bt2 o(String str) {
        int i;
        str.getClass();
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        while (str.charAt(i2) != ')') {
            int i3 = i2;
            while (str.charAt(i3) == '[') {
                i3++;
            }
            char charAt = str.charAt(i3);
            if (d57.y0("VZCBSIFJD", charAt)) {
                i = i3 + 1;
            } else if (charAt == 'L') {
                i = d57.F0(str, ';', i2, 4) + 1;
            } else {
                throw new Error("Unknown type prefix in the method signature: ".concat(str));
            }
            arrayList.add(str.substring(i2, i));
            i2 = i;
        }
        return new bt2(str.substring(i2 + 1), arrayList);
    }

    public static final Annotation p(fm fmVar) {
        Class cls;
        yb5 yb5;
        ql4 d = ts1.d(fmVar);
        if (d != null) {
            cls = q(d);
        } else {
            cls = null;
        }
        if (cls == null) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : fmVar.g().entrySet()) {
            uq4 uq4 = (uq4) entry.getKey();
            Object r = r((e21) entry.getValue(), m06.d(cls));
            if (r != null) {
                yb5 = new yb5(uq4.b(), r);
            } else {
                yb5 = null;
            }
            if (yb5 != null) {
                arrayList.add(yb5);
            }
        }
        return (Annotation) pv8.t(cls, sf4.a0(arrayList));
    }

    public static final Class q(ql4 ql4) {
        sy6 e = ql4.e();
        e.getClass();
        if (e instanceof rv3) {
            return ((rv3) e).w.a;
        }
        if (e instanceof sa6) {
            c16 c16 = ((sa6) e).w;
            c16.getClass();
            return ((x06) c16).a;
        }
        gq0 f = ts1.f(ql4);
        if (f == null) {
            return null;
        }
        return l(m06.d(ql4.getClass()), f, 0);
    }

    public static final Object r(e21 e21, ClassLoader classLoader) {
        ql4 ql4;
        lq7 lq7;
        vw3 vw3;
        ro5 ro5;
        int i;
        ql4 ql42;
        Class l;
        if (e21 instanceof pm) {
            return p((fm) ((pm) e21).a);
        }
        int i2 = 0;
        if (e21 instanceof ps) {
            ps psVar = (ps) e21;
            if (psVar instanceof lq7) {
                lq7 = (lq7) psVar;
            } else {
                lq7 = null;
            }
            if (!(lq7 == null || (vw3 = lq7.c) == null)) {
                Object obj = psVar.a;
                Iterable<e21> iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(et0.e0(iterable, 10));
                for (e21 r : iterable) {
                    arrayList.add(r(r, classLoader));
                }
                uq4 uq4 = fv3.e;
                vq0 u = vw3.L().u();
                if (u == null) {
                    ro5 = null;
                } else {
                    ro5 = fv3.s(u);
                }
                if (ro5 == null) {
                    i = -1;
                } else {
                    i = f18.a[ro5.ordinal()];
                }
                switch (i) {
                    case -1:
                        if (fv3.z(vw3)) {
                            vw3 b2 = ((xp7) dt0.Q0(vw3.G())).b();
                            b2.getClass();
                            vq0 u2 = b2.L().u();
                            if (u2 instanceof ql4) {
                                ql42 = (ql4) u2;
                            } else {
                                ql42 = null;
                            }
                            if (ql42 == null) {
                                ta1.l("Not a class type: ", b2);
                                return null;
                            } else if (fv3.H(b2)) {
                                int size = ((List) obj).size();
                                Object[] objArr = new String[size];
                                while (i2 < size) {
                                    Object obj2 = arrayList.get(i2);
                                    obj2.getClass();
                                    objArr[i2] = obj2;
                                    i2++;
                                }
                                return objArr;
                            } else if (fv3.b(ql42, m27.Q)) {
                                int size2 = ((List) obj).size();
                                Object[] objArr2 = new Class[size2];
                                while (i2 < size2) {
                                    Object obj3 = arrayList.get(i2);
                                    obj3.getClass();
                                    objArr2[i2] = obj3;
                                    i2++;
                                }
                                return objArr2;
                            } else {
                                gq0 f = ts1.f(ql42);
                                if (!(f == null || (l = l(classLoader, f, 0)) == null)) {
                                    Object newInstance = Array.newInstance(l, ((List) obj).size());
                                    newInstance.getClass();
                                    Object[] objArr3 = (Object[]) newInstance;
                                    int size3 = arrayList.size();
                                    while (i2 < size3) {
                                        objArr3[i2] = arrayList.get(i2);
                                        i2++;
                                    }
                                    return objArr3;
                                }
                            }
                        } else {
                            ku4.k("Not an array type: ", vw3);
                            return null;
                        }
                    case 1:
                        int size4 = ((List) obj).size();
                        boolean[] zArr = new boolean[size4];
                        while (i2 < size4) {
                            Object obj4 = arrayList.get(i2);
                            obj4.getClass();
                            zArr[i2] = ((Boolean) obj4).booleanValue();
                            i2++;
                        }
                        return zArr;
                    case 2:
                        int size5 = ((List) obj).size();
                        char[] cArr = new char[size5];
                        while (i2 < size5) {
                            Object obj5 = arrayList.get(i2);
                            obj5.getClass();
                            cArr[i2] = ((Character) obj5).charValue();
                            i2++;
                        }
                        return cArr;
                    case 3:
                        int size6 = ((List) obj).size();
                        byte[] bArr = new byte[size6];
                        while (i2 < size6) {
                            Object obj6 = arrayList.get(i2);
                            obj6.getClass();
                            bArr[i2] = ((Byte) obj6).byteValue();
                            i2++;
                        }
                        return bArr;
                    case 4:
                        int size7 = ((List) obj).size();
                        short[] sArr = new short[size7];
                        while (i2 < size7) {
                            Object obj7 = arrayList.get(i2);
                            obj7.getClass();
                            sArr[i2] = ((Short) obj7).shortValue();
                            i2++;
                        }
                        return sArr;
                    case 5:
                        int size8 = ((List) obj).size();
                        int[] iArr = new int[size8];
                        while (i2 < size8) {
                            Object obj8 = arrayList.get(i2);
                            obj8.getClass();
                            iArr[i2] = ((Integer) obj8).intValue();
                            i2++;
                        }
                        return iArr;
                    case 6:
                        int size9 = ((List) obj).size();
                        float[] fArr = new float[size9];
                        while (i2 < size9) {
                            Object obj9 = arrayList.get(i2);
                            obj9.getClass();
                            fArr[i2] = ((Float) obj9).floatValue();
                            i2++;
                        }
                        return fArr;
                    case 7:
                        int size10 = ((List) obj).size();
                        long[] jArr = new long[size10];
                        while (i2 < size10) {
                            Object obj10 = arrayList.get(i2);
                            obj10.getClass();
                            jArr[i2] = ((Long) obj10).longValue();
                            i2++;
                        }
                        return jArr;
                    case 8:
                        int size11 = ((List) obj).size();
                        double[] dArr = new double[size11];
                        while (i2 < size11) {
                            Object obj11 = arrayList.get(i2);
                            obj11.getClass();
                            dArr[i2] = ((Double) obj11).doubleValue();
                            i2++;
                        }
                        return dArr;
                    default:
                        h.c();
                        return null;
                }
            }
        } else if (e21 instanceof b62) {
            yb5 yb5 = (yb5) ((b62) e21).a;
            uq4 uq42 = (uq4) yb5.x;
            Class l2 = l(classLoader, (gq0) yb5.w, 0);
            if (l2 != null) {
                return Enum.valueOf(l2, uq42.b());
            }
        } else if (e21 instanceof sq3) {
            rq3 rq3 = (rq3) ((sq3) e21).a;
            if (rq3 instanceof qq3) {
                jq0 jq0 = ((qq3) rq3).a;
                return l(classLoader, jq0.a, jq0.b);
            } else if (rq3 instanceof pq3) {
                vq0 u3 = ((pq3) rq3).a.L().u();
                if (u3 instanceof ql4) {
                    ql4 = (ql4) u3;
                } else {
                    ql4 = null;
                }
                if (ql4 != null) {
                    return q(ql4);
                }
            } else {
                h.c();
                return null;
            }
        } else if ((e21 instanceof a72) || (e21 instanceof p15)) {
            return null;
        } else {
            return e21.b();
        }
        return null;
    }

    public static final as3 s(as3 as3) {
        oq3 oq3;
        as3.getClass();
        vq3 J = as3.J();
        if (J instanceof oq3) {
            oq3 = (oq3) J;
        } else {
            oq3 = null;
        }
        if (oq3 != null) {
            return (as3) ((kq3) oq3.y.getValue()).l.getValue();
        }
        return null;
    }

    public static final List t(List list) {
        List list2;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (kl8.u(kl8.p((Annotation) it.next())).getSimpleName().equals("Container")) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        Annotation annotation = (Annotation) it2.next();
                        gq3 p = kl8.p(annotation);
                        Class u = kl8.u(p);
                        if (!u.getSimpleName().equals("Container") || u.getAnnotation(q46.class) == null) {
                            list2 = sg3.D(annotation);
                        } else {
                            Object invoke = kl8.u(p).getDeclaredMethod("value", (Class[]) null).invoke(annotation, (Object[]) null);
                            invoke.getClass();
                            list2 = Arrays.asList((Annotation[]) invoke);
                            list2.getClass();
                        }
                        it0.h0(arrayList, list2);
                    }
                    return arrayList;
                }
            }
        }
        return list;
    }
}
