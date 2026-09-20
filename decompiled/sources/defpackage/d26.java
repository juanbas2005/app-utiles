package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;

/* renamed from: d26  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class d26 extends c26 {
    public static yq3 o(ti0 ti0) {
        wq3 P = ti0.P();
        if (P instanceof yq3) {
            return (yq3) P;
        }
        return v32.x;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: ku3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: ku3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: ku3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: ku3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v18, resolved type: ku3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: ku3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: ku3} */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f6, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00fb, code lost:
        if (r6 == 0) goto L_0x00f6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0146  */
    public final zq3 a(ct2 ct2) {
        boolean z;
        String str;
        String str2;
        Constructor constructor;
        ct2 ct22 = ct2;
        yq3 o = o(ct22);
        Object obj = ct22.x;
        String str3 = ct22.z;
        String str4 = ct22.A;
        if (!oa7.a) {
            int i = 0;
            if ((o instanceof oq3) && ((oq3) o).x.getAnnotation(Metadata.class) == null) {
                gq3 gq3 = (gq3) o;
                if (sg3.e(kl8.u(gq3).getCanonicalName(), gq3.l())) {
                    z = true;
                    if (!str3.equals("<init>")) {
                        String str5 = " no constructors found";
                        if (z) {
                            str4.getClass();
                            Constructor[] declaredConstructors = o.b().getDeclaredConstructors();
                            declaredConstructors.getClass();
                            int length = declaredConstructors.length;
                            boolean z2 = false;
                            Constructor constructor2 = null;
                            while (true) {
                                if (i < length) {
                                    Constructor constructor3 = declaredConstructors[i];
                                    constructor3.getClass();
                                    if (f55.j(constructor3).equals(str4)) {
                                        if (z2) {
                                            break;
                                        }
                                        z2 = true;
                                        constructor2 = constructor3;
                                    }
                                    i++;
                                } else if (z2) {
                                    constructor = constructor2;
                                }
                            }
                            constructor = null;
                            if (constructor != null) {
                                return new yi3(o, constructor, obj);
                            }
                            Constructor[] declaredConstructors2 = o.b().getDeclaredConstructors();
                            declaredConstructors2.getClass();
                            String f1 = qs.f1(declaredConstructors2, "\n", (String) null, (String) null, jo3.E, 30);
                            StringBuilder sb = new StringBuilder("Constructor (JVM signature: ");
                            sb.append(str4);
                            sb.append(") not resolved in ");
                            sb.append(o);
                            sb.append(':');
                            if (f1.length() != 0) {
                                str5 = "\n".concat(f1);
                            }
                            sb.append(str5);
                            throw new Error(sb.toString());
                        }
                        str4.getClass();
                        Iterator it = o.Q().iterator();
                        ku3 ku3 = null;
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                ku3 ku32 = next;
                                ku32.getClass();
                                if (String.valueOf(tf4.x(ku32).a).equals(str4)) {
                                    if (i != 0) {
                                        break;
                                    }
                                    i = 1;
                                    ku3 = next;
                                }
                            }
                        }
                        ku3 ku33 = ku3;
                        if (ku33 != null) {
                            return new tv3(o, str4, obj, ku33);
                        }
                        String E0 = dt0.E0(o.Q(), "\n", (String) null, (String) null, jo3.D, 30);
                        StringBuilder sb2 = new StringBuilder("Constructor (JVM signature: ");
                        sb2.append(str4);
                        sb2.append(") not resolved in ");
                        sb2.append(o);
                        sb2.append(':');
                        if (E0.length() != 0) {
                            str5 = " several matching constructors found:\n".concat(E0);
                        }
                        sb2.append(str5);
                        throw new Error(sb2.toString());
                    } else if (z) {
                        str4.getClass();
                        String substring = str4.substring(d57.F0(str4, '(', 0, 6), str4.length());
                        jz0 m = g18.m(m06.d(o.b()), substring, true);
                        Class cls = (Class) m.y;
                        cls.getClass();
                        Method W = yq3.W(o.U(), str3, (Class[]) ((ArrayList) m.x).toArray(new Class[0]), cls, false);
                        if (W == null) {
                            Method[] declaredMethods = o.b().getDeclaredMethods();
                            declaredMethods.getClass();
                            String f12 = qs.f1(declaredMethods, "\n", (String) null, (String) null, jo3.C, 30);
                            StringBuilder o2 = f21.o("Method '", str3, "' (JVM signature: ", substring, ") not resolved in ");
                            o2.append(o);
                            o2.append(':');
                            if (f12.length() == 0) {
                                str2 = " no methods found";
                            } else {
                                str2 = "\n".concat(f12);
                            }
                            o2.append(str2);
                            throw new Error(o2.toString());
                        } else if (Modifier.isStatic(W.getModifiers())) {
                            return new ej3(o, W, obj, fq3.j);
                        }
                    } else if (o instanceof pr3) {
                        str4.getClass();
                        pr3 pr3 = (pr3) o;
                        ArrayList Y = pr3.Y();
                        ArrayList arrayList = new ArrayList();
                        Iterator it2 = Y.iterator();
                        while (it2.hasNext()) {
                            Object next2 = it2.next();
                            qu3 qu3 = (qu3) next2;
                            if (sg3.e(qu3.b, str3) && String.valueOf(tf4.y(qu3).a).equals(str4)) {
                                arrayList.add(next2);
                            }
                        }
                        if (arrayList.size() != 1) {
                            String E02 = dt0.E0(pr3.Y(), "\n", (String) null, (String) null, jo3.A, 30);
                            StringBuilder o3 = f21.o("Function '", str3, "' (JVM signature: ", str4, ") not resolved in ");
                            o3.append(o);
                            o3.append(':');
                            if (E02.length() == 0) {
                                str = " no members found";
                            } else {
                                str = " several matching members found:\n".concat(E02);
                            }
                            o3.append(str);
                            throw new Error(o3.toString());
                        }
                        return new dw3(o, str4, ct22.x, (qu3) dt0.Q0(arrayList), fq3.j);
                    }
                }
            }
            z = false;
            if (!str3.equals("<init>")) {
            }
        }
        String str6 = str4;
        Object obj2 = ct22.x;
        str3.getClass();
        str6.getClass();
        return new xq1(o, str3, str6, (xs2) null, obj2, fq3.j);
    }

    public final gq3 b(Class cls) {
        return oh0.a(cls);
    }

    public final wq3 c(Class cls) {
        ez0 ez0 = oh0.a;
        cls.getClass();
        return (wq3) oh0.b.b(cls);
    }

    public final as3 d(as3 as3) {
        gq3 gq3;
        String l;
        ql4 ql4;
        as3 as32 = as3;
        as32.getClass();
        if (oa7.a) {
            vw3 vw3 = ((ds1) as32).x;
            if (vw3 instanceof fu6) {
                vq0 u = vw3.L().u();
                if (u instanceof ql4) {
                    ql4 = (ql4) u;
                } else {
                    ql4 = null;
                }
                if (ql4 != null) {
                    fu6 fu6 = (fu6) vw3;
                    String str = tj3.a;
                    int i = ts1.a;
                    vp2 f = rs1.f(ql4);
                    f.getClass();
                    up2 i2 = tj3.i(f);
                    if (i2 != null) {
                        wo7 n = ts1.e(ql4).j(i2).n();
                        n.getClass();
                        ro7 J = fu6.J();
                        List G = fu6.G();
                        boolean Q = fu6.Q();
                        J.getClass();
                        G.getClass();
                        return new ds1(kl8.I(J, n, G, Q), (sr2) null, false);
                    }
                    kj6.o("Not a readonly collection: ", ql4);
                    return null;
                }
                kj6.o("Non-class type cannot be a mutable collection type: ", as32);
                return null;
            }
            rf2.j("Non-simple type cannot be a mutable collection type: ", as32);
            return null;
        }
        cu6 cu6 = (cu6) as32;
        vq3 vq3 = cu6.x;
        if (vq3 instanceof gq3) {
            gq3 = (gq3) vq3;
        } else {
            gq3 = null;
        }
        if (gq3 == null || (l = gq3.l()) == null) {
            rf2.x("Non-class type cannot be a mutable collection type: ", as32);
            return null;
        }
        String str2 = tj3.a;
        up2 i3 = tj3.i(new vp2(l));
        if (i3 != null) {
            return new cu6(cu6.x, cu6.y, cu6.z, cu6.A, cu6.B, cu6.C, cu6.D, cu6.E, gw8.x(i3, (gq3) vq3), (sr2) null);
        }
        kj6.o("Not a readonly collection: ", as32);
        return null;
    }

    /* JADX WARNING: type inference failed for: r6v3, types: [hr3, u14] */
    public final hr3 e(ji1 ji1) {
        yq3 o = o(ji1);
        String str = ji1.z;
        String str2 = ji1.A;
        if (oa7.a) {
            return new zq1(o, str, str2, ji1.x);
        }
        nk3 nk3 = new nk3(str2, o, ji1, str, 2);
        str.getClass();
        return new u14(nk3, str);
    }

    /* JADX WARNING: type inference failed for: r6v3, types: [v14, jr3] */
    public final jr3 f(qp4 qp4) {
        yq3 o = o(qp4);
        String str = qp4.z;
        String str2 = qp4.A;
        if (oa7.a) {
            return new br1(o, str, str2, qp4.x);
        }
        nk3 nk3 = new nk3(o, str, str2, qp4, 4);
        str.getClass();
        return new v14(nk3, str);
    }

    public final ur3 g(xz3 xz3) {
        yq3 o = o(xz3);
        String str = xz3.z;
        String str2 = xz3.A;
        if (!oa7.a) {
            return new u14(new nk3(str2, o, xz3, str, 1), str);
        }
        return new rr1(o, str, str2, xz3.x);
    }

    public final wr3 h(gr5 gr5) {
        yq3 o = o(gr5);
        String str = gr5.z;
        String str2 = gr5.A;
        if (!oa7.a) {
            return new v14(new nk3(o, str, str2, gr5, 3), str);
        }
        return new ur1(o, str, str2, gr5.x);
    }

    public final xr3 i(hr5 hr5) {
        return new xr1(o(hr5), hr5.z, hr5.A);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: t16} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: t16} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: t16} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: t16} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: t16} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00cd  */
    public final String j(qs2 qs2) {
        xq1 xq1;
        boolean z;
        Metadata metadata = (Metadata) qs2.getClass().getAnnotation(Metadata.class);
        t16 t16 = null;
        if (metadata != null) {
            String[] d1 = metadata.d1();
            if (d1.length == 0) {
                d1 = null;
            }
            if (d1 != null) {
                yb5 g = rp3.g(d1, metadata.d2());
                uo3 uo3 = (uo3) g.w;
                js5 js5 = (js5) g.x;
                int[] mv = metadata.mv();
                if ((metadata.xi() & 8) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                rk4 rk4 = new rk4(mv, z);
                Class<?> cls = qs2.getClass();
                ht5 ht5 = js5.M;
                ht5.getClass();
                xq1 = new xq1(v32.x, (au6) g18.g(cls, a26.w, js5, uo3, new wv1(ht5), rk4, x16.D));
                if (xq1 != null) {
                    return super.j(qs2);
                }
                StringBuilder sb = new StringBuilder();
                Iterator it = xq1.getParameters().iterator();
                boolean z2 = false;
                t16 t162 = null;
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (next.u() == qr3.y) {
                            if (z2) {
                                break;
                            }
                            z2 = true;
                            t162 = next;
                        }
                    } else if (z2) {
                        t16 = t162;
                    }
                }
                t16 t163 = t16;
                if (t163 != null) {
                    sb.append(d63.v(t163.y(), false));
                    sb.append(".");
                }
                dt0.D0(su0.y(xq1), sb, ", ", "(", ")", l06.C, 48);
                sb.append(" -> ");
                sb.append(d63.v(xq1.k(), false));
                return sb.toString();
            }
        }
        xq1 = null;
        if (xq1 != null) {
        }
    }

    public final String k(wx3 wx3) {
        return j(wx3);
    }

    public final as3 m(vq3 vq3, List list, boolean z) {
        if (!(vq3 instanceof vp0)) {
            return bb0.b0(vq3, list, z, Collections.EMPTY_LIST);
        }
        Class b = ((vp0) vq3).b();
        ez0 ez0 = oh0.a;
        b.getClass();
        list.getClass();
        if (!list.isEmpty()) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) oh0.e.b(b);
            yb5 yb5 = new yb5(list, Boolean.valueOf(z));
            Object obj = concurrentHashMap.get(yb5);
            if (obj == null) {
                c2 d0 = bb0.d0(oh0.a(b), list, z, a42.w, (gq3) null);
                Object putIfAbsent = concurrentHashMap.putIfAbsent(yb5, d0);
                if (putIfAbsent == null) {
                    obj = d0;
                } else {
                    obj = putIfAbsent;
                }
            }
            return (as3) obj;
        } else if (z) {
            return (as3) oh0.d.b(b);
        } else {
            return (as3) oh0.c.b(b);
        }
    }

    public final cs3 n(gq3 gq3) {
        List<cs3> list;
        if (gq3 != null) {
            list = gq3.getTypeParameters();
        } else if (gq3 instanceof eq3) {
            list = ((eq3) gq3).getTypeParameters();
        } else {
            kj6.o("Type parameter container must be a class or a callable: ", gq3);
            return null;
        }
        for (cs3 cs3 : list) {
            if (cs3.b().equals("PluginConfigT")) {
                return cs3;
            }
        }
        kj6.o("Type parameter PluginConfigT is not found in container: ", gq3);
        return null;
    }

    public final void l(cs3 cs3, List list) {
    }
}
