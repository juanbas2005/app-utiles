package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: x04  reason: default package */
public final class x04 implements sr2 {
    public final /* synthetic */ int w = 0;
    public final am6 x;
    public final a14 y;

    public x04(a14 a14, am6 am6) {
        this.y = a14;
        this.x = am6;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v23, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r8v17, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r10v12, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object b() {
        fq7 fq7;
        ql4 ql4;
        Class cls;
        x06 x06;
        ArrayList arrayList;
        List list;
        fi3 fi3;
        List list2;
        a14 a14;
        ArrayList arrayList2;
        int i;
        yb5 yb5;
        List list3;
        int i2 = this.w;
        am6 am6 = this.x;
        switch (i2) {
            case b85.b:
                qm qmVar = me6.x;
                a14 a142 = this.y;
                x06 x062 = a142.o;
                am6 am62 = a142.b;
                ql4 ql42 = a142.n;
                Constructor[] declaredConstructors = x062.a.getDeclaredConstructors();
                declaredConstructors.getClass();
                boolean z = false;
                List<b16> V = cl6.V(new wl7(new ae2(qs.E0(declaredConstructors), false, s06.D), t06.D));
                ArrayList arrayList3 = new ArrayList(V.size());
                for (b16 b16 : V) {
                    u04 s = h03.s(am62, b16);
                    pj3 pj3 = (pj3) am62.x;
                    pj3.j.getClass();
                    fi3 x1 = fi3.x1(ql42, s, z, td0.F(b16));
                    am6 am63 = new am6(pj3, (up7) new r14(am62, x1, b16, ql42.u0().size()), (nz3) am62.z);
                    Constructor constructor = b16.a;
                    Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                    genericParameterTypes.getClass();
                    if (genericParameterTypes.length == 0) {
                        list3 = a42.w;
                    } else {
                        Class declaringClass = constructor.getDeclaringClass();
                        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
                            genericParameterTypes = qs.Q0(genericParameterTypes, 1, genericParameterTypes.length);
                        }
                        Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                        if (parameterAnnotations.length >= genericParameterTypes.length) {
                            if (parameterAnnotations.length > genericParameterTypes.length) {
                                parameterAnnotations = qs.Q0(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
                            }
                            list3 = b16.d(genericParameterTypes, parameterAnnotations, constructor.isVarArgs());
                        } else {
                            ku4.t("Illegal generic signature: ", constructor);
                            return null;
                        }
                    }
                    v70 u = m14.u(am63, x1, list3);
                    List u0 = ql42.u0();
                    u0.getClass();
                    ArrayList typeParameters = b16.getTypeParameters();
                    ArrayList arrayList4 = new ArrayList(et0.e0(typeParameters, 10));
                    Iterator it = typeParameters.iterator();
                    while (it.hasNext()) {
                        a14 a143 = a142;
                        qp7 d = ((up7) am63.y).d((m16) it.next());
                        d.getClass();
                        arrayList4.add(d);
                        a142 = a143;
                    }
                    x1.v1((List) u.y, i35.q(b16.e()), dt0.M0(u0, arrayList4));
                    x1.n1(false);
                    x1.o1(u.x);
                    x1.p1(ql42.g0());
                    ((pj3) am63.x).g.getClass();
                    arrayList3.add(x1);
                    a142 = a142;
                    z = false;
                }
                a14 a144 = a142;
                boolean g = x062.g();
                Class cls2 = x062.a;
                fq7 fq72 = fq7.x;
                if (g) {
                    ((pj3) am62.x).j.getClass();
                    fi3 x12 = fi3.x1(ql42, qmVar, true, td0.F(x062));
                    ArrayList f = x062.f();
                    ArrayList arrayList5 = new ArrayList(f.size());
                    boolean z2 = false;
                    Object obj = null;
                    wj3 b0 = sg3.b0(fq72, false, (q14) null, 6);
                    Iterator it2 = f.iterator();
                    int i3 = 0;
                    while (it2.hasNext()) {
                        k16 k16 = (k16) it2.next();
                        vw3 h0 = ((wr0) am62.A).h0(k16.f(), b0);
                        fq7 fq73 = fq72;
                        uq4 c = k16.c();
                        ((pj3) am62.x).j.getClass();
                        sa6 F = td0.F(k16);
                        Object obj2 = obj;
                        Class cls3 = cls2;
                        fi3 fi32 = x12;
                        x06 x063 = x062;
                        ArrayList arrayList6 = arrayList5;
                        arrayList6.add(new h28(fi32, (h28) null, i3, qmVar, c, h0, false, false, false, (vw3) null, F));
                        arrayList3 = arrayList3;
                        arrayList5 = arrayList6;
                        x12 = fi32;
                        i3++;
                        x062 = x063;
                        cls2 = cls3;
                        ql42 = ql42;
                        b0 = b0;
                        fq72 = fq73;
                        z2 = false;
                        obj = null;
                    }
                    x06 = x062;
                    ql4 = ql42;
                    cls = cls2;
                    fq7 = fq72;
                    ArrayList arrayList7 = arrayList5;
                    fi3 fi33 = x12;
                    arrayList = arrayList3;
                    fi33.o1(z2);
                    us1 f2 = ql4.f();
                    f2.getClass();
                    if (f2.equals(ni3.b)) {
                        f2 = ni3.c;
                        f2.getClass();
                    }
                    fi33.u1(arrayList7, f2);
                    fi33.n1(z2);
                    fi33.p1(ql4.g0());
                    String g2 = dh4.g(fi33, 2);
                    if (!arrayList.isEmpty()) {
                        Iterator it3 = arrayList.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (dh4.g((wp0) it3.next(), 2).equals(g2)) {
                                }
                            }
                        }
                    }
                    arrayList.add(fi33);
                    ((pj3) am6.x).g.getClass();
                } else {
                    x06 = x062;
                    ql4 = ql42;
                    cls = cls2;
                    arrayList = arrayList3;
                    fq7 = fq72;
                }
                ((xb4) ((pj3) am6.x).x).getClass();
                ql4.getClass();
                am6.getClass();
                hr2 hr2 = ((pj3) am6.x).r;
                if (arrayList.isEmpty()) {
                    boolean isAnnotation = cls.isAnnotation();
                    cls.isInterface();
                    if (!isAnnotation) {
                        fi3 = null;
                    } else {
                        wr0 wr0 = (wr0) am62.A;
                        ((pj3) am62.x).j.getClass();
                        ql4 ql43 = ql4;
                        fi3 x13 = fi3.x1(ql43, qmVar, true, td0.F(x06));
                        if (isAnnotation) {
                            List d2 = x06.d();
                            ArrayList arrayList8 = new ArrayList(d2.size());
                            wj3 b02 = sg3.b0(fq7, true, (q14) null, 6);
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = new ArrayList();
                            for (Object next : d2) {
                                if (sg3.e(((h16) next).c(), nn3.b)) {
                                    arrayList9.add(next);
                                } else {
                                    arrayList10.add(next);
                                }
                            }
                            arrayList9.size();
                            h16 h16 = (h16) dt0.y0(arrayList9);
                            if (h16 != null) {
                                l16 f3 = h16.f();
                                if (f3 instanceof r06) {
                                    r06 r06 = (r06) f3;
                                    yb5 = new yb5(wr0.g0(r06, b02, true), wr0.h0(r06.b, b02));
                                } else {
                                    yb5 = new yb5(wr0.h0(f3, b02), (Object) null);
                                }
                                arrayList2 = arrayList10;
                                a14 = a144;
                                a14.v(arrayList8, x13, 0, h16, (vw3) yb5.w, (vw3) yb5.x);
                            } else {
                                arrayList2 = arrayList10;
                                a14 = a144;
                            }
                            if (h16 != null) {
                                i = 1;
                            } else {
                                i = 0;
                            }
                            Iterator it4 = arrayList2.iterator();
                            int i4 = 0;
                            while (it4.hasNext()) {
                                h16 h162 = (h16) it4.next();
                                a14.v(arrayList8, x13, i4 + i, h162, wr0.h0(h162.f(), b02), (vw3) null);
                                i4++;
                            }
                            list2 = arrayList8;
                        } else {
                            list2 = Collections.EMPTY_LIST;
                        }
                        x13.o1(false);
                        us1 f4 = ql43.f();
                        f4.getClass();
                        if (f4.equals(ni3.b)) {
                            f4 = ni3.c;
                            f4.getClass();
                        }
                        x13.u1(list2, f4);
                        x13.n1(true);
                        x13.p1(ql43.g0());
                        ((pj3) am62.x).g.getClass();
                        fi3 = x13;
                    }
                    list = sg3.F(fi3);
                } else {
                    list = arrayList;
                }
                return dt0.b1(hr2.t(am6, list));
            default:
                ba7 ba7 = ((pj3) am6.x).x;
                ql4 ql44 = this.y.n;
                ((xb4) ba7).getClass();
                ql44.getClass();
                am6.getClass();
                return dt0.g1(new ArrayList());
        }
    }

    public x04(am6 am6, a14 a14) {
        this.x = am6;
        this.y = a14;
    }
}
