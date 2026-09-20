package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;

/* renamed from: jr1  reason: default package */
public final class jr1 implements sr2 {
    public final /* synthetic */ int w;
    public final yr1 x;

    public /* synthetic */ jr1(yr1 yr1, int i) {
        this.w = i;
        this.x = yr1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01b6, code lost:
        if (defpackage.dt0.q0(r6, r5) != false) goto L_0x01b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01df, code lost:
        if (r1 != false) goto L_0x01e8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0206 A[SYNTHETIC, Splitter:B:77:0x0206] */
    public final Object b() {
        Class<?> cls;
        gq0 gq0;
        String str;
        int i = this.w;
        boolean z = true;
        yr1 yr1 = this.x;
        switch (i) {
            case b85.b:
                gq0 gq02 = ta6.a;
                cr5 T = yr1.R();
                yq3 yq3 = yr1.C;
                t49 b = ta6.b(T);
                if (b instanceof dp3) {
                    dp3 dp3 = (dp3) b;
                    qs5 qs5 = dp3.g;
                    cr5 cr5 = dp3.f;
                    y92 y92 = rp3.a;
                    po3 b2 = rp3.b(qs5, dp3.i, dp3.j, true);
                    if (b2 == null) {
                        return null;
                    }
                    if (cr5.u() != 2) {
                        vj1 r = cr5.r();
                        if (r != null) {
                            if (rs1.k(r)) {
                                vj1 r2 = r.r();
                                if (rs1.l(r2, iq0.w) || rs1.l(r2, iq0.y)) {
                                    ql4 ql4 = (ql4) r;
                                    LinkedHashSet linkedHashSet = uu0.a;
                                    if (rs1.k(ql4)) {
                                        LinkedHashSet linkedHashSet2 = uu0.a;
                                        gq0 f = ts1.f(ql4);
                                        if (f != null) {
                                            gq0 = f.e();
                                        } else {
                                            gq0 = null;
                                        }
                                        break;
                                    }
                                    cls = yq3.b().getEnclosingClass();
                                    if (cls == null) {
                                        return null;
                                    }
                                    try {
                                        return cls.getDeclaredField(b2.t);
                                    } catch (NoSuchFieldException unused) {
                                        return null;
                                    }
                                }
                            }
                            if (rs1.k(cr5.r())) {
                                lc2 f0 = cr5.f0();
                                if (f0 == null || !f0.getAnnotations().i(mn3.a)) {
                                    z = cr5.getAnnotations().i(mn3.a);
                                    break;
                                }
                            }
                        } else {
                            rg3.a(1);
                            throw null;
                        }
                    }
                    if (!rp3.d(qs5)) {
                        vj1 r3 = cr5.r();
                        if (r3 instanceof ql4) {
                            cls = g18.q((ql4) r3);
                        } else {
                            cls = yq3.b();
                        }
                        if (cls == null) {
                        }
                    }
                    cls = yq3.b().getEnclosingClass();
                    if (cls == null) {
                    }
                } else if (b instanceof bp3) {
                    return ((bp3) b).f;
                } else {
                    if ((b instanceof cp3) || (b instanceof ep3)) {
                        return null;
                    }
                    h.c();
                    return null;
                }
                break;
            case 1:
                yq3 yq32 = yr1.C;
                String str2 = yr1.D;
                String str3 = yr1.E;
                yq32.getClass();
                str2.getClass();
                str3.getClass();
                xf4 d = yq3.w.d(str3);
                if (d != null) {
                    String str4 = (String) ((vf4) d.a()).get(1);
                    cr5 S = yq32.S(Integer.parseInt(str4));
                    if (S != null) {
                        return S;
                    }
                    StringBuilder q = b81.q("Local property #", str4, " not found in ");
                    q.append(yq32.b());
                    throw new Error(q.toString());
                }
                ArrayList arrayList = new ArrayList();
                for (Object next : yq32.V(uq4.e(str2))) {
                    if (sg3.e(ta6.b((cr5) next).s(), str3)) {
                        arrayList.add(next);
                    }
                }
                if (arrayList.isEmpty()) {
                    StringBuilder o = f21.o("Property '", str2, "' (JVM signature: ", str3, ") not resolved in ");
                    o.append(yq32);
                    throw new Error(o.toString());
                } else if (arrayList.size() == 1) {
                    return (cr5) dt0.Q0(arrayList);
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next2 = it.next();
                        us1 f2 = ((cr5) next2).f();
                        Object obj = linkedHashMap.get(f2);
                        if (obj == null) {
                            obj = new ArrayList();
                            linkedHashMap.put(f2, obj);
                        }
                        ((List) obj).add(next2);
                    }
                    TreeMap treeMap = new TreeMap(new a91(21));
                    treeMap.putAll(linkedHashMap);
                    Collection values = treeMap.values();
                    values.getClass();
                    List list = (List) dt0.F0(values);
                    if (list.size() == 1) {
                        return (cr5) dt0.w0(list);
                    }
                    String E0 = dt0.E0(yq32.V(uq4.e(str2)), "\n", (String) null, (String) null, jo3.z, 30);
                    StringBuilder o2 = f21.o("Property '", str2, "' (JVM signature: ", str3, ") not resolved in ");
                    o2.append(yq32);
                    o2.append(':');
                    if (E0.length() == 0) {
                        str = " no members found";
                    } else {
                        str = "\n".concat(E0);
                    }
                    o2.append(str);
                    throw new Error(o2.toString());
                }
            default:
                return yr1.n().k();
        }
    }
}
