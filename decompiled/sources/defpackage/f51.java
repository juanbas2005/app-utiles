package defpackage;

import io.ktor.http.Url;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: f51  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class f51 {
    public static final cc4 a = fc4.b("io.ktor.client.plugins.contentnegotiation.ContentNegotiation");
    public static final Set b;
    public static final au c;
    public static final wr0 d = new wr0("ContentNegotiation", (sr2) a51.D, (vr2) new j5(23));

    static {
        as3 as3;
        c26 c26 = b26.a;
        b = qs.r1(new gq3[]{c26.b(byte[].class), c26.b(String.class), c26.b(w63.class), c26.b(hf0.class), c26.b(j85.class), c26.b(yr0.class), c26.b(zr0.class)});
        Class<List> cls = List.class;
        gq3 b2 = c26.b(cls);
        try {
            gs3 gs3 = gs3.c;
            as3 = b26.c(cls, x91.C(b26.b(q51.class)));
        } catch (Throwable unused) {
            as3 = null;
        }
        c = new au("ExcludedContentTypesAttr", new fp7(b2, as3));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: j85} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: j85} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: j85} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r8v7, types: [java.lang.Iterable] */
    /* JADX WARNING: type inference failed for: r8v9 */
    /* JADX WARNING: type inference failed for: r3v9, types: [h61] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0274  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x027c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0252  */
    public static final Object a(List list, Set set, vr0 vr0, y53 y53, Object obj, h61 h61) {
        d51 d51;
        int i;
        q51 q51;
        Object obj2;
        List list2;
        Object obj3;
        d51 d512;
        y53 y532;
        List list3;
        Iterator it;
        y41 y41;
        Object obj4;
        Iterator it2;
        Object obj5;
        List<y41> list4;
        Object obj6;
        y53 y533 = y53;
        Object obj7 = obj;
        h61 h612 = h61;
        if (h612 instanceof d51) {
            d51 d513 = (d51) h612;
            int i2 = d513.G;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d513.G = i2 - Integer.MIN_VALUE;
                d51 = d513;
                Object obj8 = d51.F;
                i = d51.G;
                cc4 cc4 = a;
                Object obj9 = null;
                if (i != 0) {
                    o85.q(obj8);
                    iz0 iz0 = y533.f;
                    iz0 iz02 = y533.f;
                    dz2 dz2 = y533.c;
                    yr7 yr7 = y533.a;
                    iz0.getClass();
                    au auVar = c;
                    auVar.getClass();
                    if (iz0.c().containsKey(auVar)) {
                        List list5 = (List) iz02.b(auVar);
                        ArrayList arrayList = new ArrayList();
                        for (Object next : list) {
                            y41 y412 = (y41) next;
                            if (!list5.isEmpty()) {
                                Iterator it3 = list5.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    obj6 = obj9;
                                    if (y412.b.a((q51) it3.next())) {
                                        break;
                                    }
                                    obj9 = obj6;
                                }
                            }
                            obj6 = obj9;
                            arrayList.add(next);
                            obj9 = obj6;
                        }
                        list4 = arrayList;
                    } else {
                        list4 = list;
                    }
                    obj3 = obj9;
                    Collection v = dz2.v("Accept");
                    Map map = (Map) dz2.w;
                    if (v == null) {
                        v = a42.w;
                    }
                    for (y41 y413 : list4) {
                        if (!v.isEmpty()) {
                            Iterator it4 = v.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    break;
                                }
                                q51 q512 = q51.e;
                                if (kw5.m((String) it4.next()).a(y413.b)) {
                                    vr0 vr02 = vr0;
                                    break;
                                }
                            }
                        }
                        ((z41) vr0.b).getClass();
                        q51 q513 = y413.b;
                        cc4.h("Adding Accept=" + q513 + " header for " + yr7);
                        q513.getClass();
                        dz2.p0("Accept", q513.toString());
                    }
                    if (!(obj7 instanceof j85)) {
                        Iterable<gq3> iterable = set;
                        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                            for (gq3 L : iterable) {
                                if (L.L(obj7)) {
                                }
                            }
                        }
                        q51 p = pv8.p(y533);
                        if (p == null) {
                            cc4.h("Request doesn't have Content-Type header. Skipping ContentNegotiation for " + yr7 + '.');
                            return obj3;
                        } else if (obj7 instanceof vs7) {
                            cc4.h("Sending empty body for " + yr7);
                            map.remove("Content-Type");
                            return w32.a;
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            for (Object next2 : list) {
                                if (((y41) next2).c.a(p)) {
                                    arrayList2.add(next2);
                                }
                            }
                            boolean isEmpty = arrayList2.isEmpty();
                            ArrayList arrayList3 = arrayList2;
                            if (isEmpty) {
                                arrayList3 = obj3;
                            }
                            if (arrayList3 == 0) {
                                cc4.h("None of the registered converters match request Content-Type=" + p + ". Skipping ContentNegotiation for " + yr7 + '.');
                                return obj3;
                            } else if (((fp7) iz02.d(g56.a)) == null) {
                                cc4.h("Request has unknown body type. Skipping ContentNegotiation for " + yr7 + '.');
                                return obj3;
                            } else {
                                map.remove("Content-Type");
                                it2 = arrayList3.iterator();
                                List list6 = arrayList3;
                                q51 = p;
                                list2 = list6;
                                d512 = d51;
                            }
                        }
                    }
                    cc4.h("Body type " + b26.a.b(obj7.getClass()) + " is in ignored types. Skipping ContentNegotiation for " + yr7 + '.');
                    return obj3;
                } else if (i == 1) {
                    y41 = d51.E;
                    Iterator it5 = d51.D;
                    list3 = d51.C;
                    q51 = d51.B;
                    Object obj10 = d51.A;
                    y532 = d51.z;
                    o85.q(obj8);
                    d512 = d51;
                    obj3 = null;
                    it = it5;
                    obj7 = obj10;
                    obj4 = (j85) obj8;
                    if (obj4 != null) {
                        cc4.h("Converted request body using " + y41.a + " for " + y532.a);
                    }
                    if (obj4 == null) {
                        obj2 = obj4;
                        list2 = list3;
                    } else {
                        list2 = list3;
                        y533 = y532;
                        it2 = it;
                    }
                    obj2 = obj4;
                    list2 = list3;
                    if (obj2 == null) {
                        return obj2;
                    }
                    StringBuilder sb = new StringBuilder("Can't convert ");
                    sb.append(obj7);
                    sb.append(" with contentType ");
                    sb.append(q51);
                    String E0 = dt0.E0(list2, (String) null, (String) null, (String) null, new j5(24), 31);
                    sb.append(" using converters ");
                    sb.append(E0);
                    throw new Exception(sb.toString());
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (!it2.hasNext()) {
                    y41 y414 = (y41) it2.next();
                    jx3 jx3 = y414.a;
                    Charset a2 = t51.a(q51);
                    if (a2 == null) {
                        a2 = mo0.a;
                    }
                    fp7 fp7 = (fp7) y533.f.d(g56.a);
                    fp7.getClass();
                    if (!sg3.e(obj7, m15.a)) {
                        obj5 = obj7;
                    } else {
                        obj5 = obj3;
                    }
                    d512.z = y533;
                    d512.A = obj7;
                    d512.B = q51;
                    d512.C = list2;
                    d512.D = it2;
                    d512.E = y414;
                    d512.G = 1;
                    Object b2 = jx3.b(q51, a2, fp7, obj5, d512);
                    Object obj11 = p81.w;
                    if (b2 == obj11) {
                        return obj11;
                    }
                    y532 = y533;
                    y41 = y414;
                    it = it2;
                    list3 = list2;
                    obj8 = b2;
                    obj4 = (j85) obj8;
                    if (obj4 != null) {
                    }
                    if (obj4 == null) {
                    }
                    obj2 = obj4;
                    list2 = list3;
                    if (obj2 == null) {
                    }
                    return obj11;
                }
                obj2 = obj3;
                if (obj2 == null) {
                }
            }
        }
        d51 = new h61(h612);
        Object obj82 = d51.F;
        i = d51.G;
        cc4 cc42 = a;
        Object obj92 = null;
        if (i != 0) {
        }
        if (!it2.hasNext()) {
            obj2 = obj3;
        }
        obj2 = obj3;
        if (obj2 == null) {
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [h61] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    public static final Object b(Set set, List list, Url url, fp7 fp7, Object obj, q51 q51, Charset charset, h61 h61) {
        e51 e51;
        Object obj2;
        int i;
        if (h61 instanceof e51) {
            e51 e512 = (e51) h61;
            int i2 = e512.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e512.B = i2 - Integer.MIN_VALUE;
                e51 = e512;
                obj2 = e51.A;
                i = e51.B;
                cc4 cc4 = a;
                if (i != 0) {
                    o85.q(obj2);
                    if (!(obj instanceof hf0)) {
                        cc4.h("Response body is already transformed. Skipping ContentNegotiation for " + url + '.');
                        return null;
                    } else if (set.contains(fp7.a)) {
                        cc4.h("Response body type " + fp7.a + " is in ignored types. Skipping ContentNegotiation for " + url + '.');
                        return null;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (Object next : list) {
                            if (((y41) next).c.a(q51)) {
                                arrayList.add(next);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(et0.e0(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((y41) it.next()).a);
                        }
                        if (arrayList2.isEmpty()) {
                            arrayList2 = null;
                        }
                        if (arrayList2 == null) {
                            cc4.h("None of the registered converters match response with Content-Type=" + q51 + ". Skipping ContentNegotiation for " + url + '.');
                            return null;
                        }
                        e51.z = url;
                        e51.B = 1;
                        obj2 = ie1.E(arrayList2, (hf0) obj, fp7, charset, e51);
                        p81 p81 = p81.w;
                        if (obj2 == p81) {
                            return p81;
                        }
                    }
                } else if (i == 1) {
                    url = e51.z;
                    o85.q(obj2);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (!(obj2 instanceof hf0)) {
                    cc4.h("Response body was converted to " + b26.a.b(obj2.getClass()) + " for " + url + '.');
                }
                return obj2;
            }
        }
        e51 = new h61(h61);
        obj2 = e51.A;
        i = e51.B;
        cc4 cc42 = a;
        if (i != 0) {
        }
        if (!(obj2 instanceof hf0)) {
        }
        return obj2;
    }
}
