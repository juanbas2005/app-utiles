package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: k14  reason: default package */
public final class k14 implements vr2 {
    public final /* synthetic */ int w;
    public final m14 x;

    public /* synthetic */ k14(m14 m14, int i) {
        this.w = i;
        this.x = m14;
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [java.lang.Object, h06] */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x025d, code lost:
        if (defpackage.zt7.a(r5) == false) goto L_0x026c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02d1  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0211  */
    public final Object y(Object obj) {
        boolean z;
        l16 l16;
        vj1 q;
        ql4 ql4;
        i28 i28;
        l16 r06;
        int i = this.w;
        m14 m14 = this.x;
        switch (i) {
            case b85.b:
                uq4 uq4 = (uq4) obj;
                uq4.getClass();
                m14 m142 = m14.c;
                if (m142 != null) {
                    return (Collection) m142.f.y(uq4);
                }
                ArrayList arrayList = new ArrayList();
                for (h16 t : ((ck1) m14.e.b()).c(uq4)) {
                    lj3 t2 = m14.t(t);
                    if (m14.r(t2)) {
                        ((pj3) m14.b.x).g.getClass();
                        arrayList.add(t2);
                    }
                }
                m14.j(uq4, arrayList);
                return arrayList;
            case 1:
                uq4 uq42 = (uq4) obj;
                uq42.getClass();
                m14 m143 = m14.c;
                if (m143 != null) {
                    return (cr5) m143.g.y(uq42);
                }
                e16 d = ((ck1) m14.e.b()).d(uq42);
                if (d != null) {
                    Field field = d.a;
                    if (!field.isEnumConstant()) {
                        ? obj2 = new Object();
                        boolean z2 = !Modifier.isFinal(((Field) d.b()).getModifiers());
                        am6 am6 = m14.b;
                        u04 s = h03.s(am6, d);
                        pj3 pj3 = (pj3) am6.x;
                        vj1 q2 = m14.q();
                        us1 q3 = i35.q(d.e());
                        uq4 c = d.c();
                        pj3.j.getClass();
                        sa6 F = td0.F(d);
                        if (!Modifier.isFinal(((Field) d.b()).getModifiers()) || !Modifier.isStatic(((Field) d.b()).getModifiers())) {
                            z = false;
                        } else {
                            z = true;
                        }
                        oj3 n1 = oj3.n1(q2, s, q3, z2, c, F, z);
                        obj2.w = n1;
                        n1.j1((fr5) null, (jr5) null, (lc2) null, (lc2) null);
                        wr0 wr0 = (wr0) am6.A;
                        Type genericType = field.getGenericType();
                        genericType.getClass();
                        boolean z3 = genericType instanceof Class;
                        if (z3) {
                            Class cls = (Class) genericType;
                            if (cls.isPrimitive()) {
                                l16 = new j16(cls);
                                vw3 h0 = wr0.h0(l16, sg3.b0(fq7.x, false, (q14) null, 7));
                                if ((fv3.G(h0) || fv3.H(h0)) && Modifier.isFinal(((Field) d.b()).getModifiers())) {
                                    boolean isStatic = Modifier.isStatic(((Field) d.b()).getModifiers());
                                }
                                qz3 p = m14.p();
                                a42 a42 = a42.w;
                                ((er5) obj2.w).m1(h0, a42, p, (qz3) null, a42);
                                q = m14.q();
                                if (!(q instanceof ql4)) {
                                    ql4 = (ql4) q;
                                } else {
                                    ql4 = null;
                                }
                                if (ql4 != null) {
                                    ba7 ba7 = pj3.x;
                                    er5 er5 = (er5) obj2.w;
                                    ((xb4) ba7).getClass();
                                    er5.getClass();
                                    obj2.w = er5;
                                }
                                Object obj3 = obj2.w;
                                i28 = (i28) obj3;
                                vw3 b = ((er5) obj3).b();
                                if (i28 != null) {
                                    rs1.a(65);
                                    throw null;
                                } else if (b != null) {
                                    int i2 = rs1.a;
                                    if (!i28.a0() && !gr8.N(b)) {
                                        if (!iq7.b(b)) {
                                            fv3 e = ts1.e(i28);
                                            if (!fv3.G(b)) {
                                                lz4 lz4 = xw3.a;
                                                if (!lz4.a(e.v(), b)) {
                                                    if (!lz4.a(e.k("Number").g0(), b)) {
                                                        if (!lz4.a(e.e(), b)) {
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        ((er5) obj2.w).k1((hb4) null, new o3(m14, d, obj2, 4));
                                    }
                                    d63 d63 = pj3.g;
                                    cr5 cr5 = (cr5) obj2.w;
                                    d63.getClass();
                                    if (cr5 != null) {
                                        return (cr5) obj2.w;
                                    }
                                    Object[] objArr = new Object[3];
                                    switch (6) {
                                        case 1:
                                            objArr[0] = "member";
                                            break;
                                        case 2:
                                        case 4:
                                        case 6:
                                        case 8:
                                            objArr[0] = "descriptor";
                                            break;
                                        case 3:
                                            objArr[0] = "element";
                                            break;
                                        case 5:
                                            objArr[0] = "field";
                                            break;
                                        case 7:
                                            objArr[0] = "javaClass";
                                            break;
                                        default:
                                            objArr[0] = "fqName";
                                            break;
                                    }
                                    objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
                                    switch (6) {
                                        case 1:
                                        case 2:
                                            objArr[2] = "recordMethod";
                                            break;
                                        case 3:
                                        case 4:
                                            objArr[2] = "recordConstructor";
                                            break;
                                        case 5:
                                        case 6:
                                            objArr[2] = "recordField";
                                            break;
                                        case 7:
                                        case 8:
                                            objArr[2] = "recordClass";
                                            break;
                                        default:
                                            objArr[2] = "getClassResolvedFromSource";
                                            break;
                                    }
                                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
                                } else {
                                    rs1.a(66);
                                    throw null;
                                }
                            }
                        }
                        if ((genericType instanceof GenericArrayType) || (z3 && ((Class) genericType).isArray())) {
                            r06 = new r06(genericType);
                        } else if (genericType instanceof WildcardType) {
                            r06 = new o16((WildcardType) genericType);
                        } else {
                            r06 = new a16(genericType);
                        }
                        l16 = r06;
                        vw3 h02 = wr0.h0(l16, sg3.b0(fq7.x, false, (q14) null, 7));
                        boolean isStatic2 = Modifier.isStatic(((Field) d.b()).getModifiers());
                        qz3 p2 = m14.p();
                        a42 a422 = a42.w;
                        ((er5) obj2.w).m1(h02, a422, p2, (qz3) null, a422);
                        q = m14.q();
                        if (!(q instanceof ql4)) {
                        }
                        if (ql4 != null) {
                        }
                        Object obj32 = obj2.w;
                        i28 = (i28) obj32;
                        vw3 b2 = ((er5) obj32).b();
                        if (i28 != null) {
                        }
                    }
                }
                return null;
            case 2:
                uq4 uq43 = (uq4) obj;
                uq43.getClass();
                LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) m14.f.y(uq43));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object next : linkedHashSet) {
                    String g = dh4.g((au6) next, 2);
                    Object obj4 = linkedHashMap.get(g);
                    if (obj4 == null) {
                        obj4 = new ArrayList();
                        linkedHashMap.put(g, obj4);
                    }
                    ((List) obj4).add(next);
                }
                for (List list : linkedHashMap.values()) {
                    if (list.size() != 1) {
                        Collection B = i95.B(list, jo3.K);
                        linkedHashSet.removeAll(list);
                        linkedHashSet.addAll(B);
                    }
                }
                m14.m(linkedHashSet, uq43);
                am6 am62 = m14.b;
                return dt0.b1(((pj3) am62.x).r.t(am62, linkedHashSet));
            default:
                uq4 uq44 = (uq4) obj;
                uq44.getClass();
                ArrayList arrayList2 = new ArrayList();
                Object y = m14.g.y(uq44);
                if (y != null) {
                    arrayList2.add(y);
                }
                m14.n(uq44, arrayList2);
                vj1 q4 = m14.q();
                int i3 = rs1.a;
                if (rs1.l(q4, iq0.A)) {
                    return dt0.b1(arrayList2);
                }
                am6 am63 = m14.b;
                return dt0.b1(((pj3) am63.x).r.t(am63, arrayList2));
        }
    }
}
