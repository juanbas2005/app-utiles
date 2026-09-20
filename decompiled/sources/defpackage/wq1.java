package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: wq1  reason: default package */
public final class wq1 implements sr2 {
    public final /* synthetic */ int w;
    public final xq1 x;

    public /* synthetic */ wq1(xq1 xq1, int i) {
        this.w = i;
        this.x = xq1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0147  */
    public final Object b() {
        dj0 dj0;
        Object obj;
        dj0 dj02;
        s16 s16;
        boolean z;
        boolean z2;
        gq3 gq3;
        Object obj2;
        int i = this.w;
        xq1 xq1 = this.x;
        Object obj3 = null;
        switch (i) {
            case b85.b:
                gq0 gq0 = ta6.a;
                xs2 U = xq1.R();
                yq3 yq3 = xq1.C;
                pv8 c = ta6.c(U);
                boolean z3 = c instanceof no3;
                bm bmVar = bm.x;
                if (z3) {
                    if (r16.Y(xq1)) {
                        Class b = yq3.b();
                        List<t16> parameters = xq1.getParameters();
                        ArrayList arrayList = new ArrayList(et0.e0(parameters, 10));
                        for (t16 name : parameters) {
                            String name2 = name.getName();
                            name2.getClass();
                            arrayList.add(name2);
                        }
                        return new dm(b, arrayList, bmVar);
                    }
                    String str = ((no3) c).A.u;
                    yq3.getClass();
                    str.getClass();
                    Class b2 = yq3.b();
                    try {
                        Class[] clsArr = (Class[]) ((ArrayList) g18.m(m06.d(yq3.b()), str, false).x).toArray(new Class[0]);
                        obj3 = b2.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
                    } catch (NoSuchMethodException unused) {
                    }
                } else if (c instanceof oo3) {
                    qo3 qo3 = ((oo3) c).A;
                    obj3 = yq3.N(qo3.t, qo3.u);
                } else if (c instanceof mo3) {
                    obj3 = ((mo3) c).A;
                    obj3.getClass();
                } else if (c instanceof lo3) {
                    obj3 = ((lo3) c).A;
                    obj3.getClass();
                } else if (c instanceof ko3) {
                    List<Method> list = ((ko3) c).A;
                    Class b3 = yq3.b();
                    ArrayList arrayList2 = new ArrayList(et0.e0(list, 10));
                    for (Method name3 : list) {
                        arrayList2.add(name3.getName());
                    }
                    return new dm(b3, arrayList2, bmVar, cm.w, list);
                } else {
                    h.c();
                    return null;
                }
                if (obj3 instanceof Constructor) {
                    dj0 = xq1.S((Constructor) obj3, xq1.R(), false);
                } else if (obj3 instanceof Method) {
                    Method method = (Method) obj3;
                    if (!Modifier.isStatic(method.getModifiers())) {
                        if (r16.Z(xq1)) {
                            dj0 = new oj0(method, r16.F(xq1));
                        } else {
                            dj0 = new rj0(method, false, 6, 0);
                        }
                    } else if (((in8) xq1.R()).getAnnotations().m(g18.a) == null) {
                        dj0 = xq1.T(method, false);
                    } else if (r16.Z(xq1)) {
                        dj0 = new jj0(method, false, 4);
                    } else {
                        dj0 = new rj0(method, true, 4, 1);
                    }
                } else {
                    throw new Error("Could not compute caller for function: " + xq1.R() + " (member = " + obj3 + ')');
                }
                return l55.j(dj0, xq1, a42.w, false);
            case 1:
                ArrayList arrayList3 = new ArrayList();
                gq0 gq02 = ta6.a;
                xs2 U2 = xq1.R();
                yq3 yq32 = xq1.C;
                pv8 c2 = ta6.c(U2);
                if (c2 instanceof oo3) {
                    ArrayList y = su0.y(xq1);
                    if (!y.isEmpty()) {
                        Iterator it = y.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                t16 t16 = (t16) it.next();
                                if (t16 == null) {
                                    t16 = null;
                                }
                                if (t16 == null || !t16.g()) {
                                }
                            }
                        }
                        s16 = null;
                        if (s16 != null) {
                            String f1 = d57.f1(s16.h(), '(');
                            jz0 p = fb5.p(s16, s16.h().substring(f1.length()));
                            arrayList3.addAll((Set) p.y);
                            String str2 = (String) p.x;
                            if (xq1.R().b0() != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            obj = yq32.H(f1, str2, true, z2);
                        } else {
                            qo3 qo32 = ((oo3) c2).A;
                            jz0 p2 = fb5.p(xq1, qo32.u);
                            arrayList3.addAll((Set) p2.y);
                            String str3 = qo32.t;
                            String str4 = (String) p2.x;
                            Member b4 = xq1.n().b();
                            b4.getClass();
                            boolean z4 = !Modifier.isStatic(b4.getModifiers());
                            if (xq1.R().b0() != null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            obj = yq32.H(str3, str4, z4, z);
                        }
                    }
                    if (yq32 instanceof gq3) {
                        gq3 = (gq3) yq32;
                    } else {
                        gq3 = null;
                    }
                    if (gq3 != null && gq3.z()) {
                        Member b5 = xq1.n().b();
                        b5.getClass();
                        if (Modifier.isStatic(b5.getModifiers())) {
                            Collection s = xq1.R().s();
                            s.getClass();
                            Iterable<xs2> iterable = s;
                            ArrayList arrayList4 = new ArrayList(et0.e0(iterable, 10));
                            for (xs2 xs2 : iterable) {
                                vj1 r = xs2.r();
                                r.getClass();
                                Class q = g18.q((ql4) r);
                                if (q != null) {
                                    arrayList4.add(new xq1((oq3) b26.a.b(q), xs2));
                                } else {
                                    rf2.x("Unknown container class for overridden function: ", xq1);
                                    return null;
                                }
                            }
                            Iterator it2 = arrayList4.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    obj2 = it2.next();
                                    ArrayList y2 = su0.y((s16) obj2);
                                    if (!y2.isEmpty()) {
                                        Iterator it3 = y2.iterator();
                                        while (it3.hasNext()) {
                                            t16 t162 = (t16) it3.next();
                                            if (t162 == null) {
                                                t162 = null;
                                            }
                                            if (t162 == null || !t162.g()) {
                                            }
                                        }
                                        continue;
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            s16 = (s16) obj2;
                            if (s16 != null) {
                            }
                        }
                    }
                    s16 = null;
                    if (s16 != null) {
                    }
                } else {
                    boolean z5 = c2 instanceof no3;
                    bm bmVar2 = bm.w;
                    if (!z5) {
                        if (c2 instanceof ko3) {
                            List<Method> list2 = ((ko3) c2).A;
                            Class b6 = yq32.b();
                            ArrayList arrayList5 = new ArrayList(et0.e0(list2, 10));
                            for (Method name4 : list2) {
                                arrayList5.add(name4.getName());
                            }
                            return new dm(b6, arrayList5, bmVar2, cm.w, list2);
                        }
                        obj = null;
                    } else if (r16.Y(xq1)) {
                        Class b7 = yq32.b();
                        List<t16> parameters2 = xq1.getParameters();
                        ArrayList arrayList6 = new ArrayList(et0.e0(parameters2, 10));
                        for (t16 name5 : parameters2) {
                            String name6 = name5.getName();
                            name6.getClass();
                            arrayList6.add(name6);
                        }
                        return new dm(b7, arrayList6, bmVar2);
                    } else {
                        jz0 p3 = fb5.p(xq1, ((no3) c2).A.u);
                        arrayList3.addAll((Set) p3.y);
                        String str5 = (String) p3.x;
                        yq32.getClass();
                        str5.getClass();
                        Class b8 = yq32.b();
                        ArrayList arrayList7 = new ArrayList();
                        yq3.D(arrayList7, (ArrayList) g18.m(m06.d(yq32.b()), str5, false).x, true, false);
                        try {
                            Class[] clsArr2 = (Class[]) arrayList7.toArray(new Class[0]);
                            obj = b8.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr2, clsArr2.length));
                        } catch (NoSuchMethodException unused2) {
                        }
                    }
                }
                if (obj instanceof Constructor) {
                    dj02 = xq1.S((Constructor) obj, xq1.R(), true);
                } else if (obj instanceof Method) {
                    if (((in8) xq1.R()).getAnnotations().m(g18.a) != null) {
                        vj1 r2 = xq1.R().r();
                        r2.getClass();
                        if (!((ql4) r2).w0()) {
                            Method method2 = (Method) obj;
                            if (r16.Z(xq1)) {
                                dj02 = new jj0(method2, false, 4);
                            } else {
                                dj02 = new rj0(method2, true, 4, 1);
                            }
                        }
                    }
                    dj02 = xq1.T((Method) obj, xq1.n().c());
                } else {
                    dj02 = null;
                }
                if (dj02 != null) {
                    return l55.j(dj02, xq1, arrayList3, true);
                }
                return null;
            default:
                Type i2 = fb5.i(xq1);
                if (i2 == null) {
                    return xq1.n().k();
                }
                return i2;
        }
    }
}
