package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: r14  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class r14 implements up7 {
    public Object A;
    public int w;
    public final Object x;
    public final Object y;
    public Serializable z;

    public r14(am6 am6, xj1 xj1, yj3 yj3, int i) {
        am6.getClass();
        yj3.getClass();
        this.x = am6;
        this.y = xj1;
        this.w = i;
        ArrayList typeParameters = yj3.getTypeParameters();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = typeParameters.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i2));
            i2++;
        }
        this.z = linkedHashMap;
        this.A = ((pj3) ((am6) this.x).x).a.c(new b0(23, this));
    }

    public qt4 a(int i) {
        return c(i, (eu4) this.x, (qt4) null, false);
    }

    public qt4 b(String str, boolean z2) {
        Object obj;
        eu4 eu4;
        str.getClass();
        cz6 cz6 = (cz6) this.y;
        cz6.getClass();
        Iterator it = ((g21) cl6.O(new e2(3, cz6))).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            qt4 qt4 = (qt4) obj;
            if (!k57.n0((String) qt4.x.e, str, false)) {
                if (qt4.x.e(str) != null) {
                    break;
                }
            } else {
                break;
            }
        }
        qt4 qt42 = (qt4) obj;
        if (qt42 != null) {
            return qt42;
        }
        if (!z2 || (eu4 = ((eu4) this.x).y) == null) {
            return null;
        }
        r14 r14 = eu4.B;
        r14.getClass();
        if (d57.I0(str)) {
            return null;
        }
        return r14.b(str, true);
    }

    public qt4 c(int i, qt4 qt4, qt4 qt42, boolean z2) {
        qt4 qt43;
        eu4 eu4 = (eu4) this.x;
        cz6 cz6 = (cz6) this.y;
        qt4 qt44 = (qt4) cz6.c(i);
        if (qt42 != null) {
            if (sg3.e(qt44, qt42) && sg3.e(qt44.y, qt42.y)) {
                return qt44;
            }
            qt44 = null;
        } else if (qt44 != null) {
            return qt44;
        }
        if (z2) {
            Iterator it = ((g21) cl6.O(new e2(3, cz6))).iterator();
            while (true) {
                if (!it.hasNext()) {
                    qt43 = null;
                    break;
                }
                qt4 qt45 = (qt4) it.next();
                if (!(qt45 instanceof eu4) || qt45.equals(qt4)) {
                    qt43 = null;
                    continue;
                } else {
                    qt43 = ((eu4) qt45).B.c(i, eu4, qt42, true);
                    continue;
                }
                if (qt43 != null) {
                    break;
                }
            }
        }
        if (qt43 != null) {
            return qt43;
        }
        eu4 eu42 = eu4.y;
        if (eu42 == null || eu42.equals(qt4)) {
            return null;
        }
        eu4 eu43 = eu4.y;
        eu43.getClass();
        return eu43.B.c(i, eu4, qt42, z2);
    }

    public qp7 d(m16 m16) {
        m16.getClass();
        q14 q14 = (q14) ((m70) this.A).y(m16);
        if (q14 != null) {
            return q14;
        }
        return ((up7) ((am6) this.x).y).d(m16);
    }

    public pt4 e(pt4 pt4, cf4 cf4, boolean z2, qt4 qt4) {
        pt4 pt42;
        eu4 eu4 = (eu4) this.x;
        ArrayList arrayList = new ArrayList();
        Iterator it = eu4.iterator();
        while (true) {
            gu4 gu4 = (gu4) it;
            pt42 = null;
            if (!gu4.hasNext()) {
                break;
            }
            qt4 qt42 = (qt4) gu4.next();
            if (!sg3.e(qt42, qt4)) {
                pt42 = qt42.k(cf4);
            }
            if (pt42 != null) {
                arrayList.add(pt42);
            }
        }
        pt4 pt43 = (pt4) dt0.I0(arrayList);
        eu4 eu42 = eu4.y;
        if (eu42 != null && z2 && !eu42.equals(qt4)) {
            pt42 = eu42.l(cf4, eu4);
        }
        return (pt4) dt0.I0(qs.V0(new pt4[]{pt4, pt43, pt42}));
    }

    public void f(String str) {
        int i;
        eu4 eu4 = (eu4) this.x;
        if (str == null) {
            i = 0;
        } else if (str.equals((String) eu4.x.e)) {
            ku4.y("Start destination ", str, " cannot use the same route as the graph ", eu4);
            return;
        } else if (!d57.I0(str)) {
            int i2 = qt4.A;
            i = "android-app://androidx.navigation/".concat(str).hashCode();
        } else {
            h.q("Cannot have an empty start destination route");
            return;
        }
        this.w = i;
        this.A = str;
    }

    public r14(eu4 eu4) {
        this.x = eu4;
        this.y = new cz6(0);
    }
}
