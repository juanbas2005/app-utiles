package defpackage;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* renamed from: iq3  reason: default package */
public final class iq3 implements sr2 {
    public final /* synthetic */ int w;
    public final oq3 x;
    public final kq3 y;

    public /* synthetic */ iq3(kq3 kq3, oq3 oq3, int i) {
        this.w = i;
        this.y = kq3;
        this.x = oq3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: vp7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: vp7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v39, resolved type: su3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v40, resolved type: su3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: su3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v42, resolved type: su3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v43, resolved type: su3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: vp7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: vp7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v17, resolved type: vp7} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0210, code lost:
        if (r9 > r0.Q().size()) goto L_0x02ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0721, code lost:
        if (r14.h(r5) != false) goto L_0x0725;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x074b, code lost:
        if (r4 == null) goto L_0x074d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x073a  */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x0750  */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x07fd  */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x082d  */
    public final Object b() {
        gt1 gt1;
        iv3 iv3;
        ArrayList<uu3> arrayList;
        oq3 oq3;
        Object obj;
        gq0 gq0;
        cu6 cu6;
        vq3 vq3;
        gq0 gq02;
        ArrayList arrayList2;
        String value;
        hu3 hu3;
        String str;
        oq3 oq32;
        Class[] clsArr;
        boolean z;
        boolean z2;
        ArrayList arrayList3;
        gq3 gq3;
        Field field;
        gq3 gq32;
        oq3 oq33;
        nz3 nz3;
        kq3 kq3;
        int i = this.w;
        si0 si0 = si0.w;
        int i2 = 3;
        Class<Metadata> cls = Metadata.class;
        a42 a42 = a42.w;
        int i3 = 0;
        oq3 oq34 = this.x;
        kq3 kq32 = this.y;
        vp7 vp7 = null;
        switch (i) {
            case b85.b:
                if (oa7.c) {
                    Metadata metadata = (Metadata) oq34.x.getAnnotation(cls);
                    if (metadata == null) {
                        return null;
                    }
                    ar7 j0 = mp7.j0(metadata);
                    if (j0 instanceof iv3) {
                        iv3 = (iv3) j0;
                    } else {
                        iv3 = null;
                    }
                    if (iv3 != null) {
                        return iv3.F0;
                    }
                    return null;
                }
                ql4 b = kq32.b();
                if (b instanceof ss2) {
                    ss2 ss2 = (ss2) b;
                    ht2 ht2 = ss2.C;
                    if (ht2 instanceof dt2) {
                        int i4 = ss2.D;
                        gu3 gu3 = new gu3();
                        gu3.b = hl6.k(i4, "kotlin/Function");
                        hq0 hq0 = hq0.y;
                        yr3[] yr3Arr = su.a;
                        hq0.getClass();
                        am6 am6 = su.d;
                        yr3[] yr3Arr2 = su.a;
                        am6.S(gu3, yr3Arr2[9], hq0);
                        el4 el4 = el4.z;
                        el4.getClass();
                        su.b.S(gu3, yr3Arr2[7], el4);
                        k78 k78 = k78.z;
                        k78.getClass();
                        su.c.S(gu3, yr3Arr2[8], k78);
                        ArrayList arrayList4 = gu3.c;
                        if (1 <= i4) {
                            int i5 = 1;
                            while (true) {
                                arrayList4.add(new wu3(0, hl6.k(i5, "P"), i5, zu3.x));
                                if (i5 != i4) {
                                    i5++;
                                }
                            }
                        }
                        int i6 = i4 + 1;
                        arrayList4.add(new wu3(0, "R", i6, zu3.y));
                        uu3 uu3 = new uu3(0);
                        uu3.b = new hu3("kotlin/Function");
                        uu3 uu32 = new uu3(0);
                        uu32.b = new ju3(i6);
                        uu3.c.add(new xu3(zu3.w, uu32));
                        gu3.d.add(uu3);
                        return gu3;
                    }
                    h.m("Unsupported function type kind: ", ht2, " (", b);
                    return null;
                }
                if (b instanceof gt1) {
                    gt1 = (gt1) b;
                } else {
                    gt1 = null;
                }
                if (gt1 != null) {
                    return h75.l(gt1.A, (vq4) gt1.H.b, false, 6);
                }
                return null;
            case 1:
                Class cls2 = oq34.x;
                Class<Object> cls3 = Object.class;
                if (sg3.e(cls2, cls3)) {
                    return a42;
                }
                if (oa7.a) {
                    Collection<vw3> e = kq32.b().n().e();
                    e.getClass();
                    ArrayList arrayList5 = new ArrayList(e.size());
                    oq3 oq35 = kq32.v;
                    for (vw3 vw3 : e) {
                        vw3.getClass();
                        arrayList5.add(new ds1(vw3, new p3(vw3, false, oq35, 17), false));
                    }
                    ql4 b2 = kq32.b();
                    uq4 uq4 = fv3.e;
                    if (!fv3.b(b2, m27.a) && !fv3.b(b2, m27.b)) {
                        if (!arrayList5.isEmpty()) {
                            Iterator it = arrayList5.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    vq3 J = ((as3) it.next()).J();
                                    if (J instanceof oq3) {
                                        oq32 = (oq3) J;
                                    } else {
                                        oq32 = null;
                                    }
                                    if (oq32 != null && (oq32.b0() == hq0.y || oq32.b0() == hq0.B)) {
                                    }
                                }
                            }
                        }
                        arrayList5.add(k27.a);
                    }
                    return rd3.j(arrayList5);
                }
                ArrayList arrayList6 = new ArrayList();
                gu3 c = kq32.c();
                if (c != null) {
                    arrayList = c.d;
                } else {
                    arrayList = null;
                }
                if (arrayList != null) {
                    for (uu3 uu33 : arrayList) {
                        r16 a = uu33.a();
                        if (a instanceof hu3) {
                            hu3 = (hu3) a;
                        } else {
                            hu3 = null;
                        }
                        if (hu3 == null || (str = hu3.e0) == null) {
                            StringBuilder sb = new StringBuilder("Supertype of ");
                            sb.append(oq34);
                            r16 a2 = uu33.a();
                            sb.append(" not a class: ");
                            sb.append(a2);
                            throw new Error(sb.toString());
                        }
                        gq0 J2 = pd8.J(str);
                        Class l = g18.l(m06.d(cls2), J2, 0);
                        if (l != null) {
                            arrayList6.add(pd8.M(uu33, m06.d(cls2), kq32.d(), new o3(oq34, l, J2, 3), 4));
                        } else {
                            h.r("Unsupported superclass of ", oq34, ": ", J2);
                            return null;
                        }
                    }
                    if (cls2.isArray()) {
                        arrayList6.add(k27.c);
                    }
                    if (Serializable.class.isAssignableFrom(cls2)) {
                        as3 as3 = k27.d;
                        if (!arrayList6.contains(as3)) {
                            y16 y16 = kq32.g;
                            yr3 yr3 = kq3.w[3];
                            String str2 = (String) y16.b();
                            if (str2 != null && k57.u0(str2, "kotlin.", false)) {
                                arrayList6.add(as3);
                            }
                        }
                    }
                } else {
                    Iterator it2 = oq34.getAnnotations().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            if (((Annotation) obj) instanceof vu5) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    vu5 vu5 = (vu5) obj;
                    if (!(vu5 == null || (value = vu5.value()) == null)) {
                        up2 up2 = new up2(value);
                        vp2 vp2 = up2.a;
                        if (!vp2.c()) {
                            uq4 uq42 = n27.j;
                            uq42.getClass();
                            break;
                        }
                        up2 = null;
                        if (up2 != null) {
                            gq0 = new gq0(up2.b(), up2.a.g());
                            if (gq0 != null) {
                                LinkedHashMap linkedHashMap = nb2.a;
                                gq0 a0 = oq34.a0();
                                a0.getClass();
                                gq02 = (gq0) nb2.a.get(a0);
                                break;
                            } else {
                                gq02 = gq0;
                                Class l2 = g18.l(m06.d(kl8.u(oq34)), gq02, 0);
                                if (l2 != null) {
                                    int size = ar7.g(l2).size();
                                    List<cs3> typeParameters = oq34.getTypeParameters();
                                    int size2 = typeParameters.size();
                                    if (size2 == size) {
                                        arrayList2 = new ArrayList(et0.e0(typeParameters, 10));
                                        for (cs3 c0 : typeParameters) {
                                            gs3 gs3 = gs3.c;
                                            arrayList2.add(x91.C(bb0.c0(c0, (List) null, false, 7)));
                                        }
                                    } else if (size2 == 1 && size > 1 && gq0 == null) {
                                        gs3 gs32 = gs3.c;
                                        gs3 C = x91.C(bb0.c0((vq3) dt0.Q0(typeParameters), (List) null, false, 7));
                                        ArrayList arrayList7 = new ArrayList(size);
                                        for (int i7 = 0; i7 < size; i7++) {
                                            arrayList7.add(C);
                                        }
                                        arrayList2 = arrayList7;
                                    }
                                    cu6 = ar7.p(l2, b26.a.b(l2), arrayList2, false);
                                    cu6 q = ar7.q(cu6, l2);
                                    if (q != null) {
                                        cu6 = q;
                                    }
                                    be5 be5 = new be5(2);
                                    be5.a(cls2.getGenericSuperclass());
                                    be5.b(cls2.getGenericInterfaces());
                                    ArrayList arrayList8 = be5.a;
                                    for (Type type : sg3.E(arrayList8.toArray(new Type[arrayList8.size()]))) {
                                        if (type != null && !type.equals(cls3)) {
                                            if (cu6 != null) {
                                                vq3 = cu6.x;
                                            } else {
                                                vq3 = null;
                                            }
                                            if (!type.equals(vq3)) {
                                                arrayList6.add(ar7.Y(type, b42.w, pp7.w, false, false, gq7.w, 12));
                                            }
                                        }
                                    }
                                    if (cu6 != null) {
                                        arrayList6.add(cu6);
                                    }
                                }
                            }
                            cu6 = null;
                            be5 be52 = new be5(2);
                            be52.a(cls2.getGenericSuperclass());
                            be52.b(cls2.getGenericInterfaces());
                            ArrayList arrayList82 = be52.a;
                            while (r0.hasNext()) {
                            }
                            if (cu6 != null) {
                            }
                        }
                    }
                    gq0 = null;
                    if (gq0 != null) {
                    }
                    cu6 = null;
                    be5 be522 = new be5(2);
                    be522.a(cls2.getGenericSuperclass());
                    be522.b(cls2.getGenericInterfaces());
                    ArrayList arrayList822 = be522.a;
                    while (r0.hasNext()) {
                    }
                    if (cu6 != null) {
                    }
                }
                if (!arrayList6.isEmpty()) {
                    Iterator it3 = arrayList6.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            vq3 J3 = ((as3) it3.next()).J();
                            if (J3 instanceof oq3) {
                                oq3 = (oq3) J3;
                            } else {
                                oq3 = null;
                            }
                            if (oq3 != null && (oq3.b0() == hq0.y || oq3.b0() == hq0.B)) {
                            }
                        }
                    }
                }
                arrayList6.add(k27.a);
                return rd3.j(arrayList6);
            case 2:
                Class cls4 = oq34.x;
                ClassLoader d = m06.d(cls4);
                gu3 c2 = kq32.c();
                if (c2 != null) {
                    ArrayList arrayList9 = c2.l;
                    ArrayList arrayList10 = new ArrayList();
                    Iterator it4 = arrayList9.iterator();
                    while (it4.hasNext()) {
                        gq3 x2 = pd8.x(d, (String) it4.next(), false);
                        if (x2 != null) {
                            arrayList10.add(x2);
                        }
                    }
                    return arrayList10;
                } else if (!sg3.e(fd1.S(cls4), Boolean.TRUE)) {
                    return a42;
                } else {
                    Method method = (Method) fd1.O().y;
                    if (method == null) {
                        clsArr = null;
                    } else {
                        Object invoke = method.invoke(cls4, (Object[]) null);
                        invoke.getClass();
                        clsArr = (Class[]) invoke;
                    }
                    if (clsArr != null) {
                        ArrayList arrayList11 = new ArrayList(clsArr.length);
                        int length = clsArr.length;
                        while (i3 < length) {
                            Class cls5 = clsArr[i3];
                            cls5.getClass();
                            arrayList11.add(b26.a.b(cls5));
                            i3++;
                        }
                        vp7 = arrayList11;
                    }
                    if (vp7 == null) {
                        return a42;
                    }
                    return vp7;
                }
            case 3:
                Class cls6 = oq34.x;
                gu3 c3 = kq32.c();
                if (c3 == null || !su.f.C(su.a[14], c3)) {
                    return null;
                }
                uu3 uu34 = c3.n;
                if (uu34 != null) {
                    return pd8.M(uu34, m06.d(cls6), kq32.d(), (sr2) null, 12);
                }
                Iterator it5 = c3.f.iterator();
                su3 su3 = null;
                while (it5.hasNext()) {
                    Object next = it5.next();
                    su3 su32 = next;
                    if (sg3.e(su32.b, c3.m) && su32.h.isEmpty() && su32.f == null) {
                        if (i3 == 0) {
                            su3 = next;
                            i3 = 1;
                        } else {
                            h.q("Collection contains more than one matching element.");
                            return null;
                        }
                    }
                }
                if (i3 != 0) {
                    uu3 uu35 = su3.j;
                    if (uu35 != null) {
                        return pd8.M(uu35, m06.d(cls6), kq32.d(), (sr2) null, 12);
                    }
                    sg3.a0("returnType");
                    throw null;
                }
                kj6.i("Collection contains no element matching the predicate.");
                return null;
            case 4:
                if (!oa7.a && kq32.c() == null) {
                    hq0 b0 = oq34.b0();
                    Class cls7 = oq34.x;
                    if (b0 != hq0.A) {
                        n74 m = sg3.m();
                        Method[] declaredMethods = cls7.getDeclaredMethods();
                        declaredMethods.getClass();
                        for (Method method2 : declaredMethods) {
                            if (Modifier.isStatic(method2.getModifiers()) && !method2.isSynthetic()) {
                                m.add(new ej3(oq34, method2, si0, fq3.j));
                            }
                        }
                        Field[] declaredFields = cls7.getDeclaredFields();
                        declaredFields.getClass();
                        int length2 = declaredFields.length;
                        while (i3 < length2) {
                            Field field2 = declaredFields[i3];
                            if (!field2.isEnumConstant() && Modifier.isStatic(field2.getModifiers()) && !field2.isSynthetic()) {
                                if (Modifier.isFinal(field2.getModifiers())) {
                                    m.add(new kj3(oq34, field2, si0, fq3.j));
                                } else {
                                    m.add(new cj3(oq34, field2, si0, fq3.j));
                                }
                            }
                            i3++;
                        }
                        if (cls7.isEnum()) {
                            m.add(new si3(oq34));
                        }
                        return sg3.i(m);
                    }
                }
                ji4 L = oq34.c0().L();
                L.getClass();
                return oq3.Y(oq34, L, lq3.w);
            case 5:
                boolean e2 = kq32.e();
                if (e2) {
                    y16 y162 = kq32.q;
                    yr3[] yr3Arr3 = kq3.w;
                    yr3 yr32 = yr3Arr3[14];
                    Object b3 = y162.b();
                    b3.getClass();
                    y16 y163 = kq32.r;
                    yr3 yr33 = yr3Arr3[15];
                    Object b4 = y163.b();
                    b4.getClass();
                    return dt0.M0((Collection) b3, (Collection) b4);
                } else if (!e2) {
                    wu0 wu0 = mb2.a;
                    y16 y164 = ((kq3) oq34.y.getValue()).u;
                    yr3 yr34 = kq3.w[18];
                    Object b5 = y164.b();
                    b5.getClass();
                    lb2 lb2 = (lb2) b5;
                    HashMap hashMap = lb2.a;
                    if (kl8.u(oq34).getAnnotation(cls) != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!lb2.b || oq34.b0() == hq0.z || !z) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (lb2.c || z2) {
                        i3 = 1;
                    }
                    if (i3 == 1) {
                        int size3 = hashMap.size();
                        if (size3 >= 3) {
                            i2 = (size3 / 3) + size3 + 1;
                        }
                        HashMap hashMap2 = new HashMap(i2);
                        for (Map.Entry entry : hashMap.entrySet()) {
                            p16 p16 = (p16) entry.getValue();
                            if (!z2 || !mb2.e(p16)) {
                                if (p16.M()) {
                                    yq3 yq3 = ((q16) p16).w.d;
                                    if (yq3 == null) {
                                        yq3 = p16.B();
                                    }
                                    if (!sg3.e(yq3.b().getPackage(), kl8.u(oq34).getPackage())) {
                                    }
                                }
                                hashMap2.put(entry.getKey(), entry.getValue());
                            }
                        }
                        hashMap = hashMap2;
                    } else if (i3 != 0) {
                        h.c();
                        return null;
                    }
                    Collection values = hashMap.values();
                    ArrayList arrayList12 = new ArrayList();
                    for (Object next2 : mb2.b(oq34)) {
                        if (mb2.d(oq34, (p16) next2)) {
                            arrayList12.add(next2);
                        }
                    }
                    return dt0.M0(values, arrayList12);
                } else {
                    h.c();
                    return null;
                }
            case 6:
                hq0 b02 = oq34.b0();
                Class cls8 = oq34.x;
                if (b02 == hq0.y || oq34.b0() == hq0.C || oq34.b0() == hq0.D || oq34.b0() == hq0.A || cls8.isSynthetic()) {
                    return a42;
                }
                if (!oa7.a) {
                    oq3 oq36 = kq32.v;
                    if (kq32.c() != null) {
                        Constructor[] declaredConstructors = oq36.x.getDeclaredConstructors();
                        declaredConstructors.getClass();
                        int i8 = 0;
                        for (Constructor constructor : declaredConstructors) {
                            if (Modifier.isPublic(constructor.getModifiers()) || Modifier.isProtected(constructor.getModifiers())) {
                                i8++;
                            }
                        }
                        break;
                    }
                    if (kq32.c() != null) {
                        Iterable<ku3> Q = oq34.Q();
                        ArrayList arrayList13 = new ArrayList(et0.e0(Q, 10));
                        for (ku3 ku3 : Q) {
                            ku3.getClass();
                            to3 to3 = tf4.x(ku3).a;
                            if (to3 != null) {
                                arrayList13.add(new tv3(oq34, to3.toString(), si0, ku3));
                            } else {
                                throw new Error("No signature for constructor (" + ku3.b.size() + " parameters, declared in " + oq34 + ')');
                            }
                        }
                        return arrayList13;
                    } else if (cls8.isAnnotationPresent(cls)) {
                        return a42;
                    } else {
                        if (cls8.isAnnotation()) {
                            return sg3.D(new yh3(oq34));
                        }
                        Constructor[] declaredConstructors2 = cls8.getDeclaredConstructors();
                        declaredConstructors2.getClass();
                        ArrayList arrayList14 = new ArrayList();
                        int length3 = declaredConstructors2.length;
                        while (i3 < length3) {
                            Constructor constructor2 = declaredConstructors2[i3];
                            constructor2.getClass();
                            arrayList14.add(new yi3(oq34, constructor2, si0));
                            i3++;
                        }
                        return arrayList14;
                    }
                }
                Iterable<s31> P = oq34.P();
                ArrayList arrayList15 = new ArrayList(et0.e0(P, 10));
                for (s31 xq1 : P) {
                    arrayList15.add(new xq1(oq34, xq1));
                }
                return arrayList15;
            case 7:
                Class cls9 = oq34.x;
                gu3 c4 = kq32.c();
                if (c4 != null) {
                    String str3 = c4.b;
                    if (str3 != null) {
                        gq0 J4 = pd8.J(str3);
                        ClassLoader d2 = m06.d(cls9);
                        ArrayList arrayList16 = c4.i;
                        arrayList3 = new ArrayList();
                        Iterator it6 = arrayList16.iterator();
                        while (it6.hasNext()) {
                            Class l3 = g18.l(d2, J4.d(uq4.e((String) it6.next())), 0);
                            if (l3 != null) {
                                gq3 = b26.a.b(l3);
                            } else {
                                gq3 = null;
                            }
                            if (gq3 != null) {
                                arrayList3.add(gq3);
                            }
                        }
                    } else {
                        sg3.a0("name");
                        throw null;
                    }
                } else {
                    Class[] declaredClasses = cls9.getDeclaredClasses();
                    declaredClasses.getClass();
                    arrayList3 = new ArrayList();
                    int length4 = declaredClasses.length;
                    while (i3 < length4) {
                        Class cls10 = declaredClasses[i3];
                        cls10.getClass();
                        arrayList3.add(b26.a.b(cls10));
                        i3++;
                    }
                }
                return arrayList3;
            case 8:
                Class cls11 = oq34.x;
                gu3 c5 = kq32.c();
                if (c5 == null) {
                    return null;
                }
                if (su.a(c5) != hq0.C && su.a(c5) != hq0.D) {
                    return null;
                }
                if (su.a(c5) == hq0.D) {
                    LinkedHashSet linkedHashSet = uu0.a;
                    String str4 = c5.b;
                    if (str4 == null) {
                        sg3.a0("name");
                        throw null;
                    } else if (!dt0.q0(linkedHashSet, pd8.J(str4).e())) {
                        Class<?> enclosingClass = cls11.getEnclosingClass();
                        String str5 = c5.b;
                        if (str5 == null) {
                            sg3.a0("name");
                            throw null;
                        } else if (!k57.u0(str5, ".", false)) {
                            String d1 = d57.d1('/', str5, str5);
                            field = enclosingClass.getDeclaredField(d57.d1('.', d1, d1));
                            Object obj2 = field.get((Object) null);
                            obj2.getClass();
                            return obj2;
                        } else {
                            h.j("Local class is not supported: ".concat(str5));
                            return null;
                        }
                    }
                }
                field = cls11.getDeclaredField("INSTANCE");
                Object obj22 = field.get((Object) null);
                obj22.getClass();
                return obj22;
            case 9:
                if (oa7.a) {
                    List<qp7> u0 = kq32.b().u0();
                    u0.getClass();
                    ArrayList arrayList17 = new ArrayList(et0.e0(u0, 10));
                    for (qp7 qp7 : u0) {
                        qp7.getClass();
                        arrayList17.add(new ds3(oq34, qp7));
                    }
                    return arrayList17;
                } else if (kq32.c() != null) {
                    return kq32.d().a;
                } else {
                    TypeVariable[] typeParameters2 = oq34.x.getTypeParameters();
                    typeParameters2.getClass();
                    return ar7.Z(typeParameters2, oq34);
                }
            default:
                Class cls12 = oq34.x;
                if (kq32.c() == null) {
                    return vp7.d;
                }
                vp7 vp72 = vp7.d;
                gu3 c6 = kq32.c();
                c6.getClass();
                ArrayList arrayList18 = c6.c;
                Class<?> enclosingClass2 = cls12.getEnclosingClass();
                if (enclosingClass2 != null) {
                    gu3 c7 = kq32.c();
                    c7.getClass();
                    if (!su.e.C(su.a[10], c7)) {
                        enclosingClass2 = null;
                    }
                    if (enclosingClass2 != null) {
                        gq32 = b26.a.b(enclosingClass2);
                        if (!(gq32 instanceof oq3)) {
                            oq33 = (oq3) gq32;
                        } else {
                            oq33 = null;
                        }
                        if (!(oq33 == null || (nz3 = oq33.y) == null || (kq3 = (kq3) nz3.getValue()) == null)) {
                            vp7 = kq3.d();
                        }
                        return aa5.f(arrayList18, vp7, oq34, m06.d(cls12));
                    }
                }
                gq32 = null;
                if (!(gq32 instanceof oq3)) {
                }
                vp7 = kq3.d();
                return aa5.f(arrayList18, vp7, oq34, m06.d(cls12));
        }
    }

    public /* synthetic */ iq3(oq3 oq3, kq3 kq3, int i) {
        this.w = i;
        this.x = oq3;
        this.y = kq3;
    }
}
