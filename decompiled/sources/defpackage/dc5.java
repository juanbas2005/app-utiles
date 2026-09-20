package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: dc5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dc5 {
    public final h81 a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final br4 c = new br4(3, (Object) this);
    public final z97 d = new z97(new hx4(4, this));

    public dc5(h81 h81) {
        this.a = h81;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: d45} */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005a, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005b, code lost:
        defpackage.ed1.i(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005e, code lost:
        throw r3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    public static final yb5 a(dc5 dc5, g73 g73, boolean z) {
        d45 d45;
        z97 z97 = dc5.d;
        if (z) {
            c45 a2 = ((d45) z97.getValue()).a();
            a2.i = true;
            d45 = new d45(a2);
        } else {
            d45 = z97.getValue();
        }
        o9 o9Var = new o9(12);
        o9Var.x = g73;
        o9Var.D("User-Agent", "Mozilla/5.0 (Linux; Android 13) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.5563.57 Mobile Safari/537.36");
        o9Var.x();
        kd6 kd6 = new kd6(o9Var);
        d45.getClass();
        a66 f = new dx5(d45, kd6, false).f();
        yb5 yb5 = new yb5(Integer.valueOf(f.z), f.C.o());
        f.close();
        return yb5;
    }

    public static ArrayList b(String str, String str2, String str3, String str4) {
        String str5;
        ArrayList b2 = ec5.b(str, "div", str2);
        ArrayList arrayList = new ArrayList();
        Iterator it = b2.iterator();
        while (it.hasNext()) {
            String str6 = (String) it.next();
            String str7 = (String) dt0.y0(ec5.b(str6, str3, str4));
            bc5 bc5 = null;
            if (str7 != null) {
                str5 = ec5.a(str7);
            } else {
                str5 = null;
            }
            if (str5 == null) {
                str5 = "";
            }
            if (str5.length() != 0) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = ec5.b(str6, "ul", "list-inline").iterator();
                while (it2.hasNext()) {
                    List<String> V = cl6.V(new wl7(k26.b(ec5.a, (String) it2.next()), new ot4(23)));
                    ArrayList arrayList3 = new ArrayList(et0.e0(V, 10));
                    for (String a2 : V) {
                        arrayList3.add(ec5.a(a2));
                    }
                    it0.h0(arrayList2, arrayList3);
                }
                Iterator it3 = ec5.b(str6, "p", (String) null).iterator();
                while (it3.hasNext()) {
                    ArrayList b3 = ec5.b((String) it3.next(), "span", (String) null);
                    ArrayList arrayList4 = new ArrayList(et0.e0(b3, 10));
                    Iterator it4 = b3.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(ec5.a((String) it4.next()));
                    }
                    it0.h0(arrayList2, arrayList4);
                }
                ArrayList b4 = ec5.b(str6, "p", "info-media");
                ArrayList arrayList5 = new ArrayList(et0.e0(b4, 10));
                Iterator it5 = b4.iterator();
                while (it5.hasNext()) {
                    arrayList5.add(ec5.a((String) it5.next()));
                }
                it0.h0(arrayList2, arrayList5);
                ArrayList arrayList6 = new ArrayList();
                Iterator it6 = ec5.b(str6, "ul", "list-unstyled").iterator();
                while (it6.hasNext()) {
                    for (String str8 : cl6.V(new wl7(k26.b(ec5.a, (String) it6.next()), new ot4(23)))) {
                        if (d57.x0(str8, "<span", true)) {
                            arrayList6.add(dt0.E0(ec5.b(str8, "span", (String) null), " ", (String) null, (String) null, new ot4(21), 30));
                        } else {
                            arrayList2.add(ec5.a(str8));
                        }
                    }
                }
                ArrayList arrayList7 = new ArrayList();
                Iterator it7 = arrayList2.iterator();
                while (it7.hasNext()) {
                    Object next = it7.next();
                    if (!d57.I0((String) next)) {
                        arrayList7.add(next);
                    }
                }
                String E0 = dt0.E0(dt0.b1(dt0.f1(arrayList7)), "\n", (String) null, (String) null, (vr2) null, 62);
                ArrayList arrayList8 = new ArrayList();
                Iterator it8 = arrayList6.iterator();
                while (it8.hasNext()) {
                    Object next2 = it8.next();
                    if (!d57.I0((String) next2)) {
                        arrayList8.add(next2);
                    }
                }
                bc5 = new bc5(str5, E0, dt0.b1(dt0.f1(arrayList8)));
            }
            if (bc5 != null) {
                arrayList.add(bc5);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object c(String str, String str2, h61 h61) {
        cc5 cc5;
        int i;
        if (h61 instanceof cc5) {
            cc5 = (cc5) h61;
            int i2 = cc5.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cc5.B = i2 - Integer.MIN_VALUE;
                Object obj = cc5.z;
                i = cc5.B;
                if (i != 0) {
                    o85.q(obj);
                    h81 h81 = this.a;
                    gv gvVar = new gv(this, str, str2, (f61) null, 7);
                    cc5.B = 1;
                    Object e0 = ar7.e0(h81, gvVar, cc5);
                    p81 p81 = p81.w;
                    if (e0 == p81) {
                        return p81;
                    }
                    return e0;
                } else if (i == 1) {
                    try {
                        o85.q(obj);
                        return obj;
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        return new m66(e2);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        cc5 = new cc5(this, h61);
        Object obj2 = cc5.z;
        i = cc5.B;
        if (i != 0) {
        }
    }
}
