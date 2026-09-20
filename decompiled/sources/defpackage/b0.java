package defpackage;

import android.os.CancellationSignal;
import dev.whyoleg.cryptography.serialization.asn1.modules.AlgorithmIdentifier;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: b0  reason: default package */
public final class b0 implements vr2 {
    public final /* synthetic */ int w;
    public final Object x;

    public /* synthetic */ b0(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v22, resolved type: a16} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v33, resolved type: java.util.List} */
    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v17 */
    /* JADX WARNING: type inference failed for: r9v18, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r9v27 */
    /* JADX WARNING: type inference failed for: r9v28, types: [vw3] */
    /* JADX WARNING: type inference failed for: r9v29 */
    /* JADX WARNING: type inference failed for: r9v34 */
    /* JADX WARNING: type inference failed for: r9v35 */
    /* JADX WARNING: type inference failed for: r9v36 */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0059, code lost:
        if (r0 == false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0444, code lost:
        if (r0.equals("hashCode") == false) goto L_0x0486;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x048e, code lost:
        if (r0.equals("toString") != false) goto L_0x0490;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0490, code lost:
        r0 = ((java.util.ArrayList) r1.g()).isEmpty();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x049a, code lost:
        if (r0 == false) goto L_0x049d;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object y(Object obj) {
        xo7 i0;
        g3 g3Var;
        Collection collection;
        boolean z;
        oi3 oi3;
        up2 c;
        n80 n80;
        z00 z00;
        Object obj2;
        gt1 gt1;
        String str;
        boolean z2;
        Object obj3;
        up2 up2;
        boolean z3;
        Object obj4 = obj;
        int i = this.w;
        String str2 = ")";
        String str3 = "(";
        vs7 vs7 = vs7.a;
        boolean z4 = false;
        List list = 0;
        Object obj5 = this.x;
        switch (i) {
            case b85.b /*0*/:
                v16 v16 = (v16) obj4;
                v16.getClass();
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                HashMap hashMap3 = new HashMap();
                qc3 qc3 = new qc3((kd6) obj5, hashMap, hashMap2);
                Class cls = v16.a;
                cls.getClass();
                Method[] declaredMethods = cls.getDeclaredMethods();
                declaredMethods.getClass();
                int length = declaredMethods.length;
                int i2 = 0;
                while (i2 < length) {
                    Method method = declaredMethods[i2];
                    uq4 e = uq4.e(method.getName());
                    StringBuilder sb = new StringBuilder(str3);
                    Class[] parameterTypes = method.getParameterTypes();
                    parameterTypes.getClass();
                    int length2 = parameterTypes.length;
                    for (int i3 = z4; i3 < length2; i3++) {
                        Class cls2 = parameterTypes[i3];
                        cls2.getClass();
                        sb.append(m06.b(cls2));
                        cls = cls;
                    }
                    Class cls3 = cls;
                    sb.append(str2);
                    Class<?> returnType = method.getReturnType();
                    returnType.getClass();
                    sb.append(m06.b(returnType));
                    String sb2 = sb.toString();
                    String b = e.b();
                    b.getClass();
                    am6 am6 = new am6(qc3, new li4(b.concat(sb2)));
                    Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                    declaredAnnotations.getClass();
                    for (Annotation annotation : declaredAnnotations) {
                        annotation.getClass();
                        ya5.o(am6, annotation);
                    }
                    Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                    parameterAnnotations.getClass();
                    Annotation[][] annotationArr = parameterAnnotations;
                    int length3 = annotationArr.length;
                    for (int i4 = 0; i4 < length3; i4++) {
                        Annotation[] annotationArr2 = annotationArr[i4];
                        annotationArr2.getClass();
                        int length4 = annotationArr2.length;
                        int i5 = 0;
                        while (i5 < length4) {
                            Annotation[][] annotationArr3 = annotationArr;
                            Annotation annotation2 = annotationArr2[i5];
                            Method[] methodArr = declaredMethods;
                            Class u = kl8.u(kl8.p(annotation2));
                            String str4 = str2;
                            int i6 = length;
                            cw0 W = am6.W(i4, m06.a(u), new k06(annotation2));
                            if (W != null) {
                                ya5.p(W, annotation2, u);
                            }
                            i5++;
                            annotationArr = annotationArr3;
                            declaredMethods = methodArr;
                            str2 = str4;
                            length = i6;
                        }
                        Annotation[][] annotationArr4 = annotationArr;
                        Method[] methodArr2 = declaredMethods;
                        String str5 = str2;
                        int i7 = length;
                    }
                    Method[] methodArr3 = declaredMethods;
                    String str6 = str2;
                    int i8 = length;
                    am6.c();
                    i2++;
                    cls = cls3;
                    z4 = false;
                }
                Class cls4 = cls;
                Constructor[] declaredConstructors = cls4.getDeclaredConstructors();
                declaredConstructors.getClass();
                int length5 = declaredConstructors.length;
                int i9 = 0;
                while (i9 < length5) {
                    Constructor constructor = declaredConstructors[i9];
                    uq4 uq4 = oz6.e;
                    constructor.getClass();
                    StringBuilder sb3 = new StringBuilder(str3);
                    Class[] parameterTypes2 = constructor.getParameterTypes();
                    parameterTypes2.getClass();
                    for (Class cls5 : parameterTypes2) {
                        cls5.getClass();
                        sb3.append(m06.b(cls5));
                    }
                    sb3.append(")V");
                    String sb4 = sb3.toString();
                    uq4.getClass();
                    String b2 = uq4.b();
                    b2.getClass();
                    am6 am62 = new am6(qc3, new li4(b2.concat(sb4)));
                    Annotation[] declaredAnnotations2 = constructor.getDeclaredAnnotations();
                    declaredAnnotations2.getClass();
                    for (Annotation annotation3 : declaredAnnotations2) {
                        annotation3.getClass();
                        ya5.o(am62, annotation3);
                    }
                    Annotation[][] parameterAnnotations2 = constructor.getParameterAnnotations();
                    parameterAnnotations2.getClass();
                    if (parameterAnnotations2.length != 0) {
                        int length6 = constructor.getParameterTypes().length - parameterAnnotations2.length;
                        int length7 = parameterAnnotations2.length;
                        for (int i10 = 0; i10 < length7; i10++) {
                            Annotation[] annotationArr5 = parameterAnnotations2[i10];
                            annotationArr5.getClass();
                            int length8 = annotationArr5.length;
                            int i11 = 0;
                            while (i11 < length8) {
                                Constructor[] constructorArr = declaredConstructors;
                                Annotation annotation4 = annotationArr5[i11];
                                int i12 = length5;
                                Class u2 = kl8.u(kl8.p(annotation4));
                                int i13 = i9;
                                String str7 = str3;
                                int i14 = length6;
                                cw0 W2 = am62.W(i10 + length6, m06.a(u2), new k06(annotation4));
                                if (W2 != null) {
                                    ya5.p(W2, annotation4, u2);
                                }
                                i11++;
                                declaredConstructors = constructorArr;
                                length6 = i14;
                                i9 = i13;
                                length5 = i12;
                                str3 = str7;
                            }
                            Constructor[] constructorArr2 = declaredConstructors;
                            int i15 = length5;
                            int i16 = i9;
                            String str8 = str3;
                            int i17 = length6;
                        }
                    }
                    Constructor[] constructorArr3 = declaredConstructors;
                    int i18 = length5;
                    int i19 = i9;
                    String str9 = str3;
                    am62.c();
                    i9 = i19 + 1;
                    declaredConstructors = constructorArr3;
                    length5 = i18;
                    str3 = str9;
                }
                Field[] declaredFields = cls4.getDeclaredFields();
                declaredFields.getClass();
                int length9 = declaredFields.length;
                int i20 = 0;
                while (i20 < length9) {
                    Field field = declaredFields[i20];
                    uq4 e2 = uq4.e(field.getName());
                    Class<?> type = field.getType();
                    type.getClass();
                    String b3 = m06.b(type);
                    String b4 = e2.b();
                    b4.getClass();
                    li4 li4 = new li4(b4 + '#' + b3);
                    ArrayList arrayList = new ArrayList();
                    Annotation[] declaredAnnotations3 = field.getDeclaredAnnotations();
                    declaredAnnotations3.getClass();
                    int length10 = declaredAnnotations3.length;
                    int i21 = 0;
                    while (i21 < length10) {
                        Annotation annotation5 = declaredAnnotations3[i21];
                        annotation5.getClass();
                        Class u3 = kl8.u(kl8.p(annotation5));
                        Field[] fieldArr = declaredFields;
                        cw0 h0 = ((kd6) qc3.x).h0(m06.a(u3), new k06(annotation5), arrayList);
                        if (h0 != null) {
                            ya5.p(h0, annotation5, u3);
                        }
                        i21++;
                        declaredFields = fieldArr;
                    }
                    Field[] fieldArr2 = declaredFields;
                    if (!arrayList.isEmpty()) {
                        ((HashMap) qc3.y).put(li4, arrayList);
                    }
                    i20++;
                    declaredFields = fieldArr2;
                }
                return new sm(hashMap, hashMap2, hashMap3);
            case 1:
                ((ax3) obj4).getClass();
                return (fu6) ((i0) obj5).x.x.b();
            case 2:
                zn3 zn3 = (zn3) obj5;
                up2 up22 = (up2) obj4;
                up22.getClass();
                rd0 c2 = zn3.c(up22);
                if (c2 == null) {
                    return null;
                }
                ws1 ws1 = zn3.c;
                if (ws1 != null) {
                    c2.g1(ws1);
                    return c2;
                }
                sg3.a0("components");
                throw null;
            case 3:
                u72 u72 = (u72) obj5;
                hz2 hz2 = hz2.L;
                g3 g3Var2 = (g3) obj4;
                g3Var2.getClass();
                zw3 zw3 = g3Var2.a;
                if ((u72.b && zw3 != null && rc9.s0(zw3)) || zw3 == null || (i0 = hz2.i0(zw3)) == null) {
                    return null;
                }
                List R = rc9.R(i0);
                List L = rc9.L(zw3);
                Iterator it = R.iterator();
                Iterator it2 = L.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(et0.e0(R, 10), et0.e0(L, 10)));
                while (it.hasNext() && it2.hasNext()) {
                    sp7 sp7 = (sp7) it.next();
                    du7 T = rc9.T(hz2, (qo7) it2.next());
                    ak3 ak3 = g3Var2.b;
                    if (T == null) {
                        g3Var = new g3((zw3) null, ak3, sp7);
                    } else {
                        g3Var = new g3(T, lm.b(((pj3) ((am6) u72.d).x).q, ak3, T.getAnnotations()), sp7);
                    }
                    arrayList2.add(g3Var);
                }
                return arrayList2;
            case 4:
                ut1 ut1 = (ut1) obj5;
                du7 du7 = (du7) obj4;
                du7.getClass();
                if (!gr8.N(du7)) {
                    vq0 u4 = du7.L().u();
                    if ((u4 instanceof qp7) && !sg3.e(((qp7) u4).r(), ut1)) {
                        z4 = true;
                    }
                }
                return Boolean.valueOf(z4);
            case 5:
                n3 n3Var = (n3) obj5;
                m3 m3Var = (m3) obj4;
                m3Var.getClass();
                pe2 c3 = n3Var.c();
                Collection collection2 = m3Var.a;
                c3.getClass();
                collection2.getClass();
                if (collection2.isEmpty()) {
                    vw3 b5 = n3Var.b();
                    if (b5 != null) {
                        collection = sg3.D(b5);
                    } else {
                        collection = null;
                    }
                    if (collection == null) {
                        collection = a42.w;
                    }
                    collection2 = collection;
                }
                if (collection2 instanceof List) {
                    list = (List) collection2;
                }
                if (list == 0) {
                    list = dt0.b1(collection2);
                }
                List h = n3Var.h(list);
                h.getClass();
                m3Var.b = h;
                return vs7;
            case 6:
                Void voidR = (Void) obj4;
                return (AlgorithmIdentifier) obj5;
            case 7:
                y53 y53 = (y53) obj4;
                y53.getClass();
                y53.d(i53.c);
                String lowerCase = ((kt6) obj5).name().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                y53.a.j.p0("scope", lowerCase.toString());
                return vs7;
            case 8:
                Throwable th = (Throwable) obj4;
                ((mk0) obj5).cancel();
                return vs7;
            case 9:
                ((ri0) obj4).getClass();
                return Boolean.valueOf(mz6.i.containsKey(dh4.h((au6) obj5)));
            case 10:
                h16 h16 = (h16) obj4;
                h16.getClass();
                if (((Boolean) ((zp0) obj5).b.y(h16)).booleanValue()) {
                    Class<?> declaringClass = ((Method) h16.b()).getDeclaringClass();
                    declaringClass.getClass();
                    if (declaringClass.isInterface()) {
                        String b6 = h16.c().b();
                        int hashCode = b6.hashCode();
                        if (hashCode != -1776922004) {
                            if (hashCode == -1295482945) {
                                if (b6.equals("equals")) {
                                    n16 n16 = (n16) dt0.S0(h16.g());
                                    if (n16 != null) {
                                        oi3 = n16.a;
                                    } else {
                                        oi3 = null;
                                    }
                                    if (oi3 instanceof a16) {
                                        list = (a16) oi3;
                                    }
                                    if (list != 0) {
                                        gi3 gi3 = list.b;
                                        if ((gi3 instanceof x06) && (c = ((x06) gi3).c()) != null && sg3.e(c.a.a, "java.lang.Object")) {
                                            z = true;
                                            break;
                                        }
                                    }
                                }
                            } else if (hashCode == 147696667) {
                                break;
                            }
                        } else {
                            break;
                        }
                        z = false;
                        break;
                    }
                    z4 = true;
                }
                return Boolean.valueOf(z4);
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                eq0 eq0 = (eq0) obj5;
                dq0 dq0 = (dq0) obj4;
                dq0.getClass();
                gq0 gq0 = dq0.a;
                ws1 ws12 = eq0.a;
                for (bq0 a : ws12.k) {
                    ql4 a2 = a.a(gq0);
                    if (a2 != null) {
                        return a2;
                    }
                }
                if (eq0.c.contains(gq0)) {
                    return null;
                }
                xp0 xp0 = dq0.b;
                if (xp0 == null && (xp0 = ws12.d.u(gq0)) == null) {
                    return null;
                }
                vq4 vq4 = xp0.a;
                tr5 tr5 = xp0.b;
                n80 n802 = xp0.c;
                sy6 sy6 = xp0.d;
                gq0 e3 = gq0.e();
                if (e3 != null) {
                    ql4 a3 = eq0.a(e3, (xp0) null);
                    if (a3 instanceof gt1) {
                        gt1 = (gt1) a3;
                    } else {
                        gt1 = null;
                    }
                    if (gt1 == null) {
                        return null;
                    }
                    if (!gt1.C0().m().contains(gq0.f())) {
                        return null;
                    }
                    z00 = gt1.H;
                    n80 = n802;
                } else {
                    ba5 ba5 = ws12.f;
                    up2 up23 = gq0.a;
                    ba5.getClass();
                    up23.getClass();
                    ArrayList arrayList3 = new ArrayList();
                    ba5.b(up23, arrayList3);
                    Iterator it3 = arrayList3.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj2 = it3.next();
                            x95 x95 = (x95) obj2;
                            if (x95 instanceof rd0) {
                                if (((qt1) ((rd0) x95).R()).m().contains(gq0.f())) {
                                }
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    x95 x952 = (x95) obj2;
                    if (x952 == null) {
                        return null;
                    }
                    ht5 ht5 = tr5.W;
                    ht5.getClass();
                    wv1 wv1 = new wv1(ht5);
                    i48 i48 = i48.b;
                    ot5 ot5 = tr5.Y;
                    ot5.getClass();
                    i48 e4 = h75.e(ot5);
                    vq4.getClass();
                    n80 = n802;
                    z00 = new z00(ws12, vq4, x952, wv1, e4, n80, (it1) null, (bk7) null, a42.w);
                }
                return new gt1(z00, tr5, vq4, n80, sy6);
            case 12:
                sl4 sl4 = (sl4) obj4;
                sl4.getClass();
                return sl4.g().r((ro5) obj5);
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                Throwable th2 = (Throwable) obj4;
                ((CancellationSignal) obj5).cancel();
                return vs7;
            case 14:
                ri0 ri0 = (ri0) obj4;
                if (ri0 != null) {
                    ((qs1) obj5).f.f(ri0);
                    return vs7;
                }
                h.q("Argument for @NotNull parameter 'descriptor' of kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1.invoke must not be null");
                return null;
            case h75.g /*15*/:
                String str10 = (String) obj4;
                str10.getClass();
                if (k57.u0(str10, str3, false) && k57.m0(str10, str2, false)) {
                    z4 = true;
                }
                StringBuilder sb5 = new StringBuilder();
                sb5.append((String) ((yb5) obj5).w);
                if (z4) {
                    str = "";
                } else {
                    str = ".";
                }
                return f21.l(sb5, str, str10);
            case 16:
                gg3 gg3 = (gg3) obj5;
                ax3 ax3 = (ax3) obj4;
                ax3.getClass();
                LinkedHashSet<vw3> linkedHashSet = gg3.x;
                ArrayList arrayList4 = new ArrayList(et0.e0(linkedHashSet, 10));
                for (vw3 Y : linkedHashSet) {
                    arrayList4.add(Y.Y(ax3));
                    z4 = true;
                }
                if (z4) {
                    vw3 vw3 = gg3.w;
                    if (vw3 != null) {
                        list = vw3.Y(ax3);
                    }
                    arrayList4.isEmpty();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList4);
                    linkedHashSet2.hashCode();
                    gg3 gg32 = new gg3(linkedHashSet2);
                    gg32.w = list;
                    list = gg32;
                }
                if (list != 0) {
                    gg3 = list;
                }
                return gg3.a();
            case 17:
                cx3 cx3 = (cx3) obj5;
                up2 up24 = (up2) obj4;
                up24.getClass();
                up2 up25 = mj3.a;
                r15.i.getClass();
                hv2 hv2 = q15.b;
                hv2.getClass();
                x46 x46 = (x46) ((m70) hv2.x).y(up24);
                if (x46 != null) {
                    return x46;
                }
                hv2 hv22 = mj3.c;
                hv22.getClass();
                nj3 nj3 = (nj3) ((m70) hv22.x).y(up24);
                if (nj3 == null) {
                    return x46.IGNORE;
                }
                cx3 cx32 = nj3.b;
                if (cx32 == null || cx32.y - cx3.y > 0) {
                    return nj3.a;
                }
                return nj3.c;
            case 18:
                yb5 yb5 = (yb5) obj4;
                yb5.getClass();
                String str11 = (String) yb5.x;
                List D = sg3.D(om.a(((xn3) obj5).w.z, pb4.m("'", (String) yb5.w, "()' member of List is redundant in Kotlin and might be removed soon. Please use '", str11, "()' stdlib extension instead"), str11 + "()", "HIDDEN"));
                if (D.isEmpty()) {
                    return me6.x;
                }
                return new tm(0, D);
            case 19:
                return Boolean.valueOf(sg3.e((gq3) obj4, (gq3) obj5));
            case 20:
                u04 u04 = (u04) obj5;
                n06 n06 = (n06) obj4;
                n06.getClass();
                uq4 uq42 = bi3.a;
                return bi3.b(n06, u04.w, u04.y);
            case 21:
                w04 w04 = (w04) obj5;
                ((ax3) obj4).getClass();
                am6 am63 = w04.F;
                x06 x06 = w04.D;
                if (w04.E != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return new a14(am63, w04, x06, z2, w04.M);
            case 22:
                ji4 ji4 = (ji4) obj4;
                ji4.getClass();
                return ji4.f((uq4) obj5, oz4.A);
            case 23:
                r14 r14 = (r14) obj5;
                m16 m16 = (m16) obj4;
                m16.getClass();
                xj1 xj1 = (xj1) r14.y;
                Integer num = (Integer) ((LinkedHashMap) r14.z).get(m16);
                if (num == null) {
                    return null;
                }
                int intValue = num.intValue();
                am6 am64 = (am6) r14.x;
                am64.getClass();
                return new q14(uq3.o(new am6((pj3) am64.x, (up7) r14, (nz3) am64.z), xj1.getAnnotations()), m16, r14.w + intValue, xj1);
            case 24:
                tl4 tl4 = (tl4) obj5;
                up2 up26 = (up2) obj4;
                up26.getClass();
                ha5 ha5 = tl4.B;
                kb4 kb4 = tl4.y;
                ((ga5) ha5).getClass();
                kb4.getClass();
                return new v34(tl4, up26, kb4);
            case 25:
                up2 up27 = (up2) obj4;
                up27.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : ((Map) ((hv2) obj5).y).entrySet()) {
                    up2 up28 = (up2) entry.getKey();
                    if (!up27.equals(up28)) {
                        up28.getClass();
                        if (up27.a.c()) {
                            up2 = null;
                        } else {
                            up2 = up27.b();
                        }
                        if (!sg3.e(up2, up28)) {
                        }
                    }
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                if (linkedHashMap.isEmpty()) {
                    linkedHashMap = null;
                }
                if (linkedHashMap == null) {
                    return null;
                }
                Iterator it4 = linkedHashMap.entrySet().iterator();
                if (!it4.hasNext()) {
                    obj3 = null;
                } else {
                    obj3 = it4.next();
                    if (it4.hasNext()) {
                        int length11 = r16.f0((up2) ((Map.Entry) obj3).getKey(), up27).a.a.length();
                        do {
                            Object next = it4.next();
                            int length12 = r16.f0((up2) ((Map.Entry) next).getKey(), up27).a.a.length();
                            if (length11 > length12) {
                                obj3 = next;
                                length11 = length12;
                            }
                        } while (it4.hasNext());
                    }
                }
                Map.Entry entry2 = (Map.Entry) obj3;
                if (entry2 != null) {
                    return entry2.getValue();
                }
                return null;
            case 26:
                Throwable th3 = (Throwable) obj4;
                ((dx5) obj5).d();
                return vs7;
            case 27:
                obj4.getClass();
                ((wv6) obj5).add(obj4);
                return vs7;
            case 28:
                Throwable th4 = (Throwable) obj4;
                ((kk0) obj5).f(vs7);
                return vs7;
            default:
                x06 x062 = (x06) obj5;
                Method method2 = (Method) obj4;
                if (!method2.isSynthetic()) {
                    if (x062.a.isEnum()) {
                        String name = method2.getName();
                        if (!sg3.e(name, "values")) {
                            if (sg3.e(name, "valueOf")) {
                                z3 = Arrays.equals(method2.getParameterTypes(), new Class[]{String.class});
                                break;
                            }
                        } else {
                            Class[] parameterTypes3 = method2.getParameterTypes();
                            parameterTypes3.getClass();
                            if (parameterTypes3.length == 0) {
                                z3 = true;
                                break;
                            }
                        }
                        z3 = false;
                        break;
                    }
                    z4 = true;
                }
                return Boolean.valueOf(z4);
        }
    }
}
