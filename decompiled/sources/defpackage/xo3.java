package defpackage;

import android.app.Activity;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: xo3  reason: default package */
public final class xo3 implements sr2 {
    public final /* synthetic */ int w;
    public final Object x;

    public /* synthetic */ xo3(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0147  */
    public final Object b() {
        List<v16> list;
        List list2;
        v16 v16;
        qa qaVar;
        Member member;
        String property;
        int i = this.w;
        List<String> list3 = a42.w;
        int i2 = 0;
        Object obj = this.x;
        switch (i) {
            case b85.b:
                yo3 yo3 = (yo3) obj;
                c14 c14 = yo3.c;
                ArrayList arrayList = new ArrayList();
                for (v16 a : ((Map) p25.q(c14.E, c14.I[0])).values()) {
                    rt1 a2 = ((pj3) yo3.b.x).d.a(c14, a);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
                return (ji4[]) jb5.y(arrayList).toArray(new ji4[0]);
            case 1:
                or3 or3 = (or3) obj;
                y16 y16 = or3.d;
                yr3 yr3 = or3.g[0];
                v16 v162 = (v16) y16.b();
                if (v162 == null) {
                    return ii4.b;
                }
                y16 y162 = or3.a;
                yr3 yr32 = xq3.b[0];
                Object b = y162.b();
                b.getClass();
                cf4 cf4 = ((ra6) b).b;
                kt1 kt1 = (kt1) cf4.x;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) cf4.z;
                Class cls = v162.a;
                gq0 a3 = m06.a(cls);
                Object obj2 = concurrentHashMap.get(a3);
                if (obj2 == null) {
                    up2 up2 = m06.a(cls).a;
                    hv3 hv3 = v162.b;
                    gv3 gv3 = hv3.a;
                    gv3 gv32 = gv3.D;
                    if (gv3 == gv32) {
                        String[] strArr = hv3.c;
                        if (gv3 != gv32) {
                            strArr = null;
                        }
                        if (strArr != null) {
                            list2 = Arrays.asList(strArr);
                            list2.getClass();
                        } else {
                            list2 = null;
                        }
                        if (list2 != null) {
                            list3 = list2;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (String b2 : list3) {
                            up2 up22 = new up2(co3.b(b2).a.replace('/', '.'));
                            up2 b3 = up22.b();
                            uq4 g = up22.a.g();
                            up2 up23 = up2.c;
                            vp2 vp2 = dh4.I(g).a;
                            vp2.c();
                            rg4 rg4 = (rg4) cf4.y;
                            kt1.c().c.getClass();
                            rk4.g.getClass();
                            String r0 = k57.r0(vp2.a, '.', '$');
                            if (!b3.a.c()) {
                                r0 = b3 + '.' + r0;
                            }
                            ji8 l = rg4.l(r0);
                            if (l != null) {
                                v16 = (v16) l.x;
                            } else {
                                v16 = null;
                            }
                            if (v16 != null) {
                                arrayList2.add(v16);
                            }
                        }
                        list = arrayList2;
                    } else {
                        list = sg3.D(v162);
                    }
                    c42 c42 = new c42(kt1.c().b, up2, 0);
                    ArrayList arrayList3 = new ArrayList();
                    for (v16 a4 : list) {
                        rt1 a5 = kt1.a(c42, a4);
                        if (a5 != null) {
                            arrayList3.add(a5);
                        }
                    }
                    ji4 u = fd1.u("package " + up2 + " (" + v162 + ')', dt0.b1(arrayList3));
                    Object putIfAbsent = concurrentHashMap.putIfAbsent(a3, u);
                    if (putIfAbsent == null) {
                        obj2 = u;
                    } else {
                        obj2 = putIfAbsent;
                    }
                }
                obj2.getClass();
                return (ji4) obj2;
            case 2:
                return new wv3((xv3) obj);
            case 3:
                return new yv3((zv3) obj);
            case 4:
                return new aw3((bw3) obj);
            case 5:
                dw3 dw3 = (dw3) obj;
                Type i3 = fb5.i(dw3);
                if (i3 == null) {
                    return dw3.n().k();
                }
                return i3;
            case 6:
                ew3 ew3 = (ew3) obj;
                sv3 sv3 = ew3.w;
                if ((sv3.B() instanceof pr3) || r16.a0(sv3)) {
                    return (Type) sv3.n().a().get(ew3.y);
                }
                StringBuilder sb = new StringBuilder("Only constructors and top-level callables are supported for now: ");
                sb.append(sv3.B());
                rf2.n(sb, sv3.getName(), ew3.A);
                return null;
            case 7:
                return hj8.q((hw3) obj, true);
            case 8:
                return new rw3((sw3) obj);
            case 9:
                sr2 sr2 = ((cz4) obj).x;
                if (sr2 != null) {
                    return (List) sr2.b();
                }
                return null;
            case 10:
                t16 t16 = (t16) obj;
                if (!r16.Y(t16.b())) {
                    Member b4 = t16.b().n().b();
                    if (b4 instanceof Method) {
                        if (Modifier.isStatic(((Method) b4).getModifiers())) {
                            qaVar = new qa(t16.s(), 3, b4);
                            int i4 = qaVar.x;
                            member = (Member) qaVar.y;
                            if (!(member instanceof Method)) {
                                Annotation[] annotationArr = ((Method) member).getParameterAnnotations()[i4];
                                annotationArr.getClass();
                                list3 = qs.p1(annotationArr);
                            } else if (member instanceof Constructor) {
                                Annotation[] annotationArr2 = ((Constructor) member).getParameterAnnotations()[i4];
                                annotationArr2.getClass();
                                list3 = qs.p1(annotationArr2);
                            }
                            return g18.t(list3);
                        }
                        rf2.j("Only static methods are supported for now: ", b4);
                    } else if (b4 instanceof Constructor) {
                        Constructor constructor = (Constructor) b4;
                        Class declaringClass = constructor.getDeclaringClass();
                        declaringClass.getClass();
                        if (b26.a.b(declaringClass).p() && (property = System.getProperty("java.version")) != null && k57.u0(property, "1.", false)) {
                            i2 = -1;
                        } else if (constructor.getDeclaringClass().isEnum()) {
                            i2 = (constructor.getParameterAnnotations().length - constructor.getParameterTypes().length) + 2;
                        }
                        qaVar = new qa(t16.s() + i2, 3, b4);
                        int i42 = qaVar.x;
                        member = (Member) qaVar.y;
                        if (!(member instanceof Method)) {
                        }
                        return g18.t(list3);
                    } else {
                        rf2.x("Unsupported parameter owner: ", b4);
                    }
                    return null;
                } else if (!(t16 instanceof ew3)) {
                    return list3;
                } else {
                    ew3 ew32 = (ew3) t16;
                    ArrayList arrayList4 = ew32.x.e;
                    ArrayList arrayList5 = new ArrayList(et0.e0(arrayList4, 10));
                    Iterator it = arrayList4.iterator();
                    while (it.hasNext()) {
                        arrayList5.add(pd8.H((lt3) it.next(), m06.d(ew32.w.B().b())));
                    }
                    return arrayList5;
                }
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                return (ji4) ((tg6) obj).b.y(ax3.p);
            case 12:
                return fb5.u((qp7) ((p27) obj).b);
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
                return new dq7(((dq7) obj).a);
            case 14:
                c77 c77 = (c77) obj;
                return c77.i(t75.n(c77.b, (is1) null, 3));
            case h75.g:
                return z62.c(x62.U, ((kg5) obj).toString());
            case 16:
                return (List) ((g28) obj).H.getValue();
            case 17:
                return new r31[((di2[]) obj).length];
            default:
                Activity activity = (Activity) obj;
                if (activity != null) {
                    activity.finish();
                }
                return vs7.a;
        }
    }
}
