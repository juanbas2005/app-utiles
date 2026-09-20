package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* renamed from: nr3  reason: default package */
public final class nr3 implements sr2 {
    public final /* synthetic */ int w;
    public final or3 x;
    public final pr3 y;

    public nr3(pr3 pr3, or3 or3) {
        this.w = 0;
        this.y = pr3;
        this.x = or3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0176, code lost:
        if (r0.a == defpackage.gv3.E) goto L_0x017a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0103 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ff A[LOOP:2: B:18:0x0085->B:45:0x00ff, LOOP_END] */
    public final Object b() {
        String str;
        boolean z;
        Object obj;
        vq1 vq1;
        int i = this.w;
        pr3 pr3 = this.y;
        or3 or3 = this.x;
        ar7 ar7 = null;
        switch (i) {
            case b85.b:
                Class cls = pr3.x;
                boolean z2 = oa7.c;
                Iterable<ji4> iterable = a42.w;
                if (z2) {
                    Metadata metadata = (Metadata) cls.getAnnotation(Metadata.class);
                    if (metadata != null) {
                        ar7 = mp7.j0(metadata);
                    }
                    if (ar7 instanceof jv3) {
                        return sg3.D(((jv3) ar7).F0);
                    }
                    if (ar7 instanceof lv3) {
                        return sg3.D(((lv3) ar7).F0);
                    }
                    if (!(ar7 instanceof kv3)) {
                        return iterable;
                    }
                    List<String> list = ((kv3) ar7).F0;
                    ArrayList arrayList = new ArrayList();
                    for (String r0 : list) {
                        Class<?> loadClass = m06.d(cls).loadClass(k57.r0(r0, '/', '.'));
                        loadClass.getClass();
                        wq3 wq3 = (wq3) oh0.b.b(loadClass);
                        wq3.getClass();
                        it0.h0(arrayList, (List) ((or3) ((pr3) wq3).y.getValue()).c.getValue());
                    }
                    return arrayList;
                }
                y16 y16 = or3.e;
                yr3 yr3 = or3.g[1];
                Object b = y16.b();
                b.getClass();
                ji4 ji4 = (ji4) b;
                if (ji4 instanceof rt1) {
                    iterable = sg3.D(ji4);
                } else if (ji4 instanceof vm0) {
                    iterable = qs.p1(((vm0) ji4).c);
                }
                ArrayList arrayList2 = new ArrayList(et0.e0(iterable, 10));
                for (ji4 ji42 : iterable) {
                    ji42.getClass();
                    rt1 rt1 = (rt1) ji42;
                    arrayList2.add(h75.o(rt1.h, (vq4) rt1.b.b, false, 6));
                }
                return arrayList2;
            case 1:
                y16 y162 = or3.d;
                yr3 yr32 = or3.g[0];
                v16 v16 = (v16) y162.b();
                if (v16 != null) {
                    hv3 hv3 = v16.b;
                    str = hv3.f;
                    break;
                }
                str = null;
                if (str == null || str.length() <= 0) {
                    return null;
                }
                ClassLoader d = m06.d(pr3.x);
                String replace = str.replace('/', '.');
                replace.getClass();
                return d.loadClass(replace);
            default:
                boolean z3 = oa7.a;
                pr3 pr32 = this.y;
                if (z3) {
                    nq3 nq3 = new nq3(pr32, 1);
                    y16 y163 = or3.e;
                    yr3 yr33 = or3.g[1];
                    Object b2 = y163.b();
                    b2.getClass();
                    ArrayList arrayList3 = new ArrayList();
                    for (vj1 vj1 : t75.n((ji4) b2, (is1) null, 3)) {
                        if (vj1 instanceof ri0) {
                            vq1 = (vq1) vj1.P(nq3, vs7.a);
                        } else {
                            vq1 = null;
                        }
                        if (vq1 != null) {
                            arrayList3.add(vq1);
                        }
                    }
                    return dt0.b1(arrayList3);
                }
                ArrayList arrayList4 = new ArrayList();
                for (ru3 ru3 : (List) or3.c.getValue()) {
                    Iterator it = ru3.b.iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        si0 si0 = si0.w;
                        if (hasNext) {
                            su3 su3 = (su3) it.next();
                            su3.getClass();
                            String str2 = su3.b;
                            if (!su3.h.isEmpty()) {
                                z = true;
                            } else if (su3.f != null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            String l = pd8.l(su3, pr32);
                            if (l != null) {
                                if (!su.q.C(su.a[36], su3)) {
                                    if (z) {
                                        obj = new sw3(pr32, l, su3, fq3.j);
                                    } else if (!z) {
                                        obj = new mw3(pr32, l, si0, su3, fq3.j);
                                    } else if (z) {
                                        obj = new pw3(pr32, l, si0, su3, fq3.j);
                                    }
                                    if (obj != null) {
                                        arrayList4.add(obj);
                                    } else {
                                        StringBuilder o = f21.o("Unsupported property: name=", str2, " signature=", l, " container=");
                                        o.append(pr32);
                                        throw new Error(o.toString());
                                    }
                                } else {
                                    if (z) {
                                        obj = new bw3(pr32, l, su3, fq3.j);
                                    } else if (!z) {
                                        obj = new xv3(pr32, l, si0, su3, fq3.j);
                                    } else if (z) {
                                        obj = new zv3(pr32, l, si0, su3, fq3.j);
                                    }
                                    if (obj != null) {
                                    }
                                }
                                obj = null;
                                if (obj != null) {
                                }
                            } else {
                                throw new Error(b81.y("No field or getter signature for property: ", str2));
                            }
                        } else {
                            Iterator it2 = ru3.a.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    qu3 qu3 = (qu3) it2.next();
                                    qu3.getClass();
                                    to3 to3 = tf4.y(qu3).a;
                                    if (to3 != null) {
                                        arrayList4.add(new dw3(pr32, to3.toString(), si0, qu3, fq3.j));
                                    } else {
                                        rf2.w("No signature for function: ", qu3.b);
                                        return null;
                                    }
                                }
                            }
                        }
                    }
                }
                return dt0.b1(arrayList4);
        }
    }

    public /* synthetic */ nr3(or3 or3, pr3 pr3, int i) {
        this.w = i;
        this.x = or3;
        this.y = pr3;
    }
}
