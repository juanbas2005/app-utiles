package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;

/* renamed from: mb2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class mb2 {
    public static final wu0 a = new wu0(0, new vr2[]{v61.R, v61.S});

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        if (defpackage.gr8.N(r0) == true) goto L_0x0029;
     */
    public static final as3 a(as3 as3, String str) {
        c2 c2Var;
        as3 as32;
        ds1 ds1;
        if (as3 instanceof c2) {
            c2Var = (c2) as3;
        } else {
            c2Var = null;
        }
        if (c2Var != null) {
            if (!(c2Var.J() instanceof y62)) {
                if (c2Var instanceof ds1) {
                    ds1 = (ds1) c2Var;
                } else {
                    ds1 = null;
                }
                if (ds1 != null) {
                    vw3 vw3 = ds1.x;
                    if (vw3 != null) {
                    }
                }
            }
            return as3;
        }
        vq3 J = as3.J();
        if (J != null) {
            List<gs3> I = as3.I();
            ArrayList arrayList = new ArrayList(et0.e0(I, 10));
            for (gs3 gs3 : I) {
                as3 as33 = gs3.b;
                if (as33 != null) {
                    as32 = a(as33, str);
                } else {
                    as32 = null;
                }
                arrayList.add(new gs3(as32, gs3.a));
            }
            return bb0.b0(J, arrayList, false, as3.getAnnotations());
        }
        StringBuilder sb = new StringBuilder("Non-denotable parameter types are not possible. Some parameter types appear non-denotable for type '");
        sb.append(as3);
        gq3 b = b26.a.b(as3.getClass());
        sb.append("' (");
        sb.append(b);
        sb.append(") which belongs to member '");
        sb.append(str);
        sb.append('\'');
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final Collection b(gq3 gq3) {
        y16 y16 = ((kq3) ((oq3) gq3).y.getValue()).s;
        yr3 yr3 = kq3.w[16];
        Object b = y16.b();
        b.getClass();
        return (Collection) b;
    }

    public static final lb2 c(gq3 gq3) {
        if (gq3 instanceof oq3) {
            y16 y16 = ((kq3) ((oq3) gq3).y.getValue()).u;
            yr3 yr3 = kq3.w[18];
            Object b = y16.b();
            b.getClass();
            return (lb2) b;
        } else if (gq3 instanceof ro4) {
            return c(((ro4) gq3).w);
        } else {
            ku4.x("Unknown type ", b26.a.b(gq3.getClass()));
            return null;
        }
    }

    public static final boolean d(oq3 oq3, p16 p16) {
        Field j;
        Class<?> declaringClass;
        if (p16.f() == ls3.z) {
            return true;
        }
        if (!e(p16) || oq3.b0() != hq0.y) {
            return false;
        }
        if (!(p16 instanceof yr3) || (j = wn6.j((yr3) p16)) == null || (declaringClass = j.getDeclaringClass()) == null || declaringClass.getAnnotation(Metadata.class) != null) {
            return true;
        }
        return false;
    }

    public static final boolean e(p16 p16) {
        qr3 qr3;
        p16.getClass();
        Boolean bool = ((q16) p16).w.c;
        if (bool != null) {
            return bool.booleanValue();
        }
        t16 t16 = (t16) dt0.y0(p16.a());
        if (t16 != null) {
            qr3 = t16.u();
        } else {
            qr3 = null;
        }
        if (qr3 != qr3.w) {
            return true;
        }
        return false;
    }

    public static final void f(String str) {
        str.getClass();
        throw new IllegalStateException(("Star projection in top level type is not possible. Star projection appeared in the following container: '" + str + '\'').toString());
    }

    public static final is3 g(List list, List list2) {
        list.getClass();
        list2.getClass();
        if (list.size() != list2.size()) {
            return null;
        }
        if (list.isEmpty()) {
            return is3.c;
        }
        ArrayList i1 = dt0.i1(list, list2);
        int F = tf4.F(et0.e0(i1, 10));
        if (F < 16) {
            F = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(F);
        Iterator it = i1.iterator();
        while (it.hasNext()) {
            yb5 yb5 = (yb5) it.next();
            gs3 gs3 = gs3.c;
            linkedHashMap.put((cs3) yb5.w, x91.C(bb0.c0((cs3) yb5.x, (List) null, false, 7)));
        }
        return new is3(linkedHashMap, false);
    }

    public static final g62 h(p16 p16, gr8 gr8) {
        ut6 ut6;
        zq3 zq3;
        Method method;
        Type[] typeArr;
        Class[] clsArr;
        Field j;
        Class<?> declaringClass;
        p16 p162 = p16;
        List parameters = p162.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object next : parameters) {
            if (((t16) next).u() != qr3.w) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(et0.e0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((t16) it.next()).y());
        }
        boolean z = p162 instanceof yr3;
        String str = null;
        if (z && (j = wn6.j((yr3) p162)) != null && (declaringClass = j.getDeclaringClass()) != null && declaringClass.getAnnotation(Metadata.class) == null) {
            ut6 = ut6.y;
        } else if (z) {
            ut6 = ut6.x;
        } else if (p162 instanceof zq3) {
            ut6 = ut6.w;
        } else {
            ku4.x("Unknown kind for ", b26.a.b(p162.getClass()));
            return null;
        }
        ut6 ut62 = ut6;
        if (p162 instanceof zq3) {
            zq3 = (zq3) p162;
        } else {
            zq3 = null;
        }
        if (zq3 != null) {
            method = wn6.k(zq3);
        } else {
            method = null;
        }
        if (method != null) {
            typeArr = method.getGenericParameterTypes();
        } else {
            typeArr = null;
        }
        if (typeArr == null) {
            typeArr = new Type[0];
        }
        List p1 = qs.p1(typeArr);
        if (method != null) {
            clsArr = method.getParameterTypes();
        } else {
            clsArr = null;
        }
        if (clsArr == null) {
            clsArr = new Class[0];
        }
        List p12 = qs.p1(clsArr);
        if (method != null) {
            str = method.getName();
        }
        return new g62(ut62, p162.getName(), str, p162.getTypeParameters(), arrayList2, p12, p1, e(p162), gr8);
    }
}
