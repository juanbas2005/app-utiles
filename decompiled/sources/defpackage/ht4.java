package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* renamed from: ht4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ht4 {
    public final iu4 a;
    public final et4 b;
    public eu4 c;
    public Bundle d;
    public Bundle[] e;
    public final as f = new as();
    public final d37 g;
    public final d37 h;
    public final xw5 i;
    public final LinkedHashMap j;
    public final LinkedHashMap k;
    public final LinkedHashMap l;
    public final LinkedHashMap m;
    public t54 n;
    public it4 o;
    public final ArrayList p;
    public k54 q;
    public final h5 r;
    public final ox4 s;
    public final LinkedHashMap t;
    public vr2 u;
    public dj4 v;
    public final LinkedHashMap w;
    public int x;
    public final ArrayList y;
    public final pr6 z;

    public ht4(iu4 iu4, et4 et4) {
        this.a = iu4;
        this.b = et4;
        a42 a42 = a42.w;
        this.g = e37.a(a42);
        d37 a2 = e37.a(a42);
        this.h = a2;
        this.i = gr8.t(a2);
        this.j = new LinkedHashMap();
        this.k = new LinkedHashMap();
        this.l = new LinkedHashMap();
        this.m = new LinkedHashMap();
        this.p = new ArrayList();
        this.q = k54.x;
        this.r = new h5(1, this);
        this.s = new ox4();
        this.t = new LinkedHashMap();
        this.w = new LinkedHashMap();
        this.y = new ArrayList();
        this.z = qr6.a(vc0.x, 2);
    }

    public static qt4 d(int i2, qt4 qt4, qt4 qt42, boolean z2) {
        eu4 eu4;
        if (qt4.x.a == i2 && (qt42 == null || (qt4.equals(qt42) && sg3.e(qt4.y, qt42.y)))) {
            return qt4;
        }
        if (qt4 instanceof eu4) {
            eu4 = (eu4) qt4;
        } else {
            eu4 = null;
        }
        if (eu4 == null) {
            eu4 = qt4.y;
            eu4.getClass();
        }
        return eu4.B.c(i2, eu4, qt42, z2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: zs4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: zs4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: zs4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: zs4} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:2:0x000d A[LOOP:0: B:2:0x000d->B:7:0x0030, LOOP_START] */
    public final void a(qt4 qt4, Bundle bundle, zs4 zs4, List list) {
        qt4 qt42;
        qt4 qt43;
        Bundle bundle2;
        Object obj;
        Object obj2;
        tb1 tb1 = this.a.c;
        qt4 qt44 = zs4.x;
        boolean z2 = qt44 instanceof uu1;
        as asVar = this.f;
        if (!z2) {
            while (!asVar.isEmpty() && (((zs4) asVar.last()).x instanceof uu1) && m(((zs4) asVar.last()).x.x.a, true, false)) {
            }
        }
        as asVar2 = new as();
        zs4 zs42 = null;
        if (qt4 instanceof eu4) {
            qt4 qt45 = qt44;
            do {
                qt45.getClass();
                qt45 = qt45.y;
                if (qt45 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = listIterator.previous();
                        if (sg3.e(((zs4) obj2).x, qt45)) {
                            break;
                        }
                    }
                    zs4 zs43 = (zs4) obj2;
                    if (zs43 == null) {
                        zs43 = n63.g(tb1, qt45, bundle, h(), this.o);
                    }
                    asVar2.addFirst(zs43);
                    if (!asVar.isEmpty() && ((zs4) asVar.last()).x == qt45) {
                        n((zs4) asVar.last(), false, new as());
                    }
                }
                if (qt45 == null) {
                    break;
                }
            } while (qt45 != qt4);
        }
        if (asVar2.isEmpty()) {
            qt42 = qt44;
        } else {
            qt42 = ((zs4) asVar2.first()).x;
        }
        while (qt42 != null && c(qt42.x.a, qt42) != qt42) {
            qt42 = qt42.y;
            if (qt42 != null) {
                if (bundle == null || !bundle.isEmpty()) {
                    bundle2 = bundle;
                } else {
                    bundle2 = null;
                }
                ListIterator listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        obj = null;
                        break;
                    }
                    obj = listIterator2.previous();
                    if (sg3.e(((zs4) obj).x, qt42)) {
                        break;
                    }
                }
                zs4 zs44 = (zs4) obj;
                if (zs44 == null) {
                    zs44 = n63.g(tb1, qt42, qt42.f(bundle2), h(), this.o);
                }
                asVar2.addFirst(zs44);
            }
        }
        if (!asVar2.isEmpty()) {
            qt44 = ((zs4) asVar2.first()).x;
        }
        while (!asVar.isEmpty() && (((zs4) asVar.last()).x instanceof eu4)) {
            qt4 qt46 = ((zs4) asVar.last()).x;
            qt46.getClass();
            if (((cz6) ((eu4) qt46).B.y).c(qt44.x.a) != null) {
                break;
            }
            n((zs4) asVar.last(), false, new as());
        }
        zs4 zs45 = (zs4) asVar.n();
        if (zs45 == null) {
            zs45 = (zs4) asVar2.n();
        }
        if (zs45 != null) {
            qt43 = zs45.x;
        } else {
            qt43 = null;
        }
        if (!sg3.e(qt43, this.c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                Object previous = listIterator3.previous();
                qt4 qt47 = previous.x;
                eu4 eu4 = this.c;
                eu4.getClass();
                if (sg3.e(qt47, eu4)) {
                    zs42 = previous;
                    break;
                }
            }
            zs4 zs46 = zs42;
            if (zs46 == null) {
                eu4 eu42 = this.c;
                eu42.getClass();
                eu4 eu43 = this.c;
                eu43.getClass();
                zs46 = n63.g(tb1, eu42, eu43.f(bundle), h(), this.o);
            }
            asVar2.addFirst(zs46);
        }
        Iterator it = asVar2.iterator();
        while (it.hasNext()) {
            zs4 zs47 = (zs4) it.next();
            Object obj3 = this.t.get(this.s.b(zs47.x.w));
            if (obj3 != null) {
                ((ft4) obj3).a(zs47);
            } else {
                ku4.g(f21.l(new StringBuilder("NavigatorBackStack for "), qt4.w, " should already be created"));
                return;
            }
        }
        asVar.addAll(asVar2);
        asVar.addLast(zs4);
        Iterator it2 = dt0.N0(asVar2, zs4).iterator();
        while (it2.hasNext()) {
            zs4 zs48 = (zs4) it2.next();
            eu4 eu44 = zs48.x.y;
            if (eu44 != null) {
                j(zs48, e(eu44.x.a));
            }
        }
    }

    public final boolean b() {
        as asVar;
        while (true) {
            asVar = this.f;
            if (asVar.isEmpty() || !(((zs4) asVar.last()).x instanceof eu4)) {
                zs4 zs4 = (zs4) asVar.p();
                ArrayList arrayList = this.y;
            } else {
                n((zs4) asVar.last(), false, new as());
            }
        }
        zs4 zs42 = (zs4) asVar.p();
        ArrayList arrayList2 = this.y;
        if (zs42 != null) {
            arrayList2.add(zs42);
        }
        this.x++;
        s();
        int i2 = this.x - 1;
        this.x = i2;
        if (i2 == 0) {
            ArrayList d1 = dt0.d1(arrayList2);
            arrayList2.clear();
            Iterator it = d1.iterator();
            while (it.hasNext()) {
                zs4 zs43 = (zs4) it.next();
                Iterator it2 = dt0.b1(this.p).iterator();
                if (!it2.hasNext()) {
                    this.z.r(zs43);
                } else if (it2.next() != null) {
                    ku4.a();
                    return false;
                } else {
                    qt4 qt4 = zs43.x;
                    zs43.D.a();
                    throw null;
                }
            }
            ArrayList arrayList3 = new ArrayList(asVar);
            d37 d37 = this.g;
            d37.getClass();
            d37.l((Object) null, arrayList3);
            ArrayList p2 = p();
            d37 d372 = this.h;
            d372.getClass();
            d372.l((Object) null, p2);
        }
        if (zs42 != null) {
            return true;
        }
        return false;
    }

    public final qt4 c(int i2, qt4 qt4) {
        qt4 qt42;
        eu4 eu4 = this.c;
        if (eu4 == null) {
            return null;
        }
        if (eu4.x.a == i2) {
            if (qt4 == null) {
                return eu4;
            }
            if (sg3.e(eu4, qt4) && qt4.y == null) {
                return this.c;
            }
        }
        zs4 zs4 = (zs4) this.f.p();
        if (zs4 == null || (qt42 = zs4.x) == null) {
            qt42 = this.c;
            qt42.getClass();
        }
        return d(i2, qt42, qt4, false);
    }

    public final zs4 e(int i2) {
        Object obj;
        as asVar = this.f;
        ListIterator listIterator = asVar.listIterator(asVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((zs4) obj).x.x.a == i2) {
                break;
            }
        }
        zs4 zs4 = (zs4) obj;
        if (zs4 != null) {
            return zs4;
        }
        StringBuilder o2 = pb4.o(i2, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        o2.append(f());
        throw new IllegalArgumentException(o2.toString().toString());
    }

    public final qt4 f() {
        zs4 zs4 = (zs4) this.f.p();
        if (zs4 != null) {
            return zs4.x;
        }
        return null;
    }

    public final eu4 g() {
        eu4 eu4 = this.c;
        if (eu4 != null) {
            eu4.getClass();
            return eu4;
        }
        h.s("You must call setGraph() before calling getGraph()");
        return null;
    }

    public final k54 h() {
        if (this.n == null) {
            return k54.y;
        }
        return this.q;
    }

    public final eu4 i() {
        qt4 qt4;
        eu4 eu4;
        zs4 zs4 = (zs4) this.f.p();
        if (zs4 == null || (qt4 = zs4.x) == null) {
            qt4 = this.c;
            qt4.getClass();
        }
        if (qt4 instanceof eu4) {
            eu4 = (eu4) qt4;
        } else {
            eu4 = null;
        }
        if (eu4 != null) {
            return eu4;
        }
        eu4 eu42 = qt4.y;
        eu42.getClass();
        return eu42;
    }

    public final void j(zs4 zs4, zs4 zs42) {
        this.j.put(zs4, zs42);
        LinkedHashMap linkedHashMap = this.k;
        if (linkedHashMap.get(zs42) == null) {
            linkedHashMap.put(zs42, new xt());
        }
        Object obj = linkedHashMap.get(zs42);
        obj.getClass();
        ((xt) obj).a.incrementAndGet();
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [java.lang.Object, d06] */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f9, code lost:
        if (r13.equals(r10) == false) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x010b, code lost:
        if (r1.x.a == r10.x.a) goto L_0x010d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0206  */
    public final void k(qt4 qt4, Bundle bundle, wu4 wu4) {
        boolean z2;
        boolean z3;
        int i2;
        int i3;
        int i4;
        qt4 qt42 = qt4;
        wu4 wu42 = wu4;
        qt42.getClass();
        for (ft4 ft4 : this.t.values()) {
            ft4.d = true;
        }
        ? obj = new Object();
        if (wu42 == null || (i4 = wu42.c) == -1) {
            z2 = false;
        } else {
            z2 = m(i4, wu42.d, wu42.e);
        }
        Bundle f2 = qt4.f(bundle);
        if (wu42 == null || !wu42.b || !this.l.containsKey(Integer.valueOf(qt42.x.a))) {
            if (wu42 != null && wu42.a) {
                zs4 zs4 = (zs4) this.f.p();
                as asVar = this.f;
                ListIterator listIterator = asVar.listIterator(asVar.f());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (((zs4) listIterator.previous()).x == qt42) {
                            i2 = listIterator.nextIndex();
                            break;
                        }
                    } else {
                        i2 = -1;
                        break;
                    }
                }
                if (i2 != -1) {
                    if (qt42 instanceof eu4) {
                        int i5 = eu4.C;
                        List V = cl6.V(new wl7(cl6.S(new ot4(5), (eu4) qt42), new tm3(28)));
                        if (this.f.y - i2 == V.size()) {
                            as asVar2 = this.f;
                            List<zs4> subList = asVar2.subList(i2, asVar2.y);
                            ArrayList arrayList = new ArrayList(et0.e0(subList, 10));
                            for (zs4 zs42 : subList) {
                                arrayList.add(Integer.valueOf(zs42.x.x.a));
                            }
                        }
                    } else if (zs4 != null) {
                        qt4 qt43 = zs4.x;
                        if (qt43 != null) {
                        }
                    }
                    as asVar3 = new as();
                    while (sg3.x(this.f) >= i2) {
                        zs4 zs43 = (zs4) it0.k0(this.f);
                        r(zs43);
                        zs4 zs44 = new zs4(zs43.w, zs43.x, zs43.x.f(bundle), zs43.z, zs43.A, zs43.B, zs43.C);
                        bt4 bt4 = zs44.D;
                        k54 k54 = zs43.z;
                        bt4.getClass();
                        k54.getClass();
                        bt4.d = k54;
                        bt4 bt42 = zs44.D;
                        k54 k542 = zs43.D.k;
                        bt42.getClass();
                        k542.getClass();
                        bt42.k = k542;
                        bt42.b();
                        asVar3.addFirst(zs44);
                    }
                    Iterator it = asVar3.iterator();
                    while (it.hasNext()) {
                        zs4 zs45 = (zs4) it.next();
                        eu4 eu4 = zs45.x.y;
                        if (eu4 != null) {
                            j(zs45, e(eu4.x.a));
                        }
                        this.f.addLast(zs45);
                    }
                    Iterator it2 = asVar3.iterator();
                    while (it2.hasNext()) {
                        zs4 zs46 = (zs4) it2.next();
                        nx4 b2 = this.s.b(zs46.x.w);
                        qt4 qt44 = zs46.x;
                        if (qt44 == null) {
                            qt44 = null;
                        }
                        if (qt44 != null) {
                            b2.c(qt44);
                            ft4 b3 = b2.b();
                            synchronized (b3.a) {
                                try {
                                    ArrayList d1 = dt0.d1((Collection) b3.e.w.getValue());
                                    ListIterator listIterator2 = d1.listIterator(d1.size());
                                    while (true) {
                                        if (listIterator2.hasPrevious()) {
                                            if (sg3.e(((zs4) listIterator2.previous()).B, zs46.B)) {
                                                i3 = listIterator2.nextIndex();
                                                break;
                                            }
                                        } else {
                                            i3 = -1;
                                            break;
                                        }
                                    }
                                    d1.set(i3, zs46);
                                    d37 d37 = b3.b;
                                    d37.getClass();
                                    d37.l((Object) null, d1);
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    }
                    z3 = true;
                    if (!z3) {
                        zs4 g2 = n63.g(this.a.c, qt42, f2, h(), this.o);
                        nx4 b4 = this.s.b(qt42.w);
                        List D = sg3.D(g2);
                        this.u = new qj((d06) obj, this, qt42, f2);
                        b4.d(D, wu42);
                        this.u = null;
                    }
                }
            }
            z3 = false;
            if (!z3) {
            }
        } else {
            obj.w = q(qt42.x.a, f2, wu42);
            z3 = false;
        }
        this.b.b();
        for (ft4 ft42 : this.t.values()) {
            ft42.d = false;
        }
        if (z2 || obj.w || z3) {
            b();
        } else {
            s();
        }
    }

    public final void l(Object obj, wu4 wu4) {
        String str;
        String str2;
        obj.getClass();
        obj.getClass();
        Class<?> cls = obj.getClass();
        c26 c26 = b26.a;
        qt4 d2 = d(b35.m(i95.D(c26.b(cls))), g(), (qt4) null, true);
        if (d2 != null) {
            Map g2 = d2.g();
            LinkedHashMap linkedHashMap = new LinkedHashMap(tf4.F(g2.size()));
            for (Map.Entry entry : g2.entrySet()) {
                linkedHashMap.put(entry.getKey(), ((xs4) entry.getValue()).a);
            }
            str = b35.o(obj, linkedHashMap);
        } else {
            ku4.y("Destination with route ", c26.b(obj.getClass()).A(), " cannot be found in navigation graph ", this.c);
            str = null;
        }
        if (this.c != null) {
            eu4 i2 = i();
            pt4 n2 = i2.n(str, true, i2);
            if (n2 != null) {
                qt4 qt4 = n2.w;
                Bundle f2 = qt4.f(n2.x);
                if (f2 == null) {
                    f2 = tf4.j((yb5[]) Arrays.copyOf(new yb5[0], 0));
                }
                int i3 = qt4.A;
                String str3 = (String) qt4.x.e;
                if (str3 != null) {
                    str2 = "android-app://androidx.navigation/".concat(str3);
                } else {
                    str2 = "";
                }
                Uri parse = Uri.parse(str2);
                parse.getClass();
                Intent intent = new Intent();
                intent.setDataAndType(parse, (String) null);
                intent.setAction((String) null);
                f2.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                k(qt4, f2, wu4);
                return;
            }
            h.n(b81.q("Navigation destination that matches route ", str, " cannot be found in the navigation graph "), this.c);
            return;
        }
        rf2.k("Cannot navigate to ", str, ". Navigation graph has not been set for NavController ", this, 46);
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [java.lang.Object, d06] */
    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, d06] */
    public final boolean m(int i2, boolean z2, boolean z3) {
        qt4 qt4;
        ht4 ht4;
        boolean z4;
        String str;
        as asVar = this.f;
        if (asVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = dt0.O0(asVar).iterator();
        while (true) {
            if (!it.hasNext()) {
                qt4 = null;
                break;
            }
            qt4 = ((zs4) it.next()).x;
            String str2 = qt4.w;
            ao aoVar = qt4.x;
            nx4 b2 = this.s.b(str2);
            if (z2 || aoVar.a != i2) {
                arrayList.add(b2);
            }
            if (aoVar.a == i2) {
                break;
            }
        }
        if (qt4 == null) {
            int i3 = qt4.A;
            Log.i("NavController", "Ignoring popBackStack to destination " + ie1.H(this.a.c, i2) + " as it was not found on the current back stack");
            return false;
        }
        ? obj = new Object();
        as asVar2 = new as();
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                ht4 = this;
                z4 = z3;
                break;
            }
            nx4 nx4 = (nx4) it2.next();
            ? obj2 = new Object();
            zs4 zs4 = (zs4) asVar.last();
            ht4 = this;
            z4 = z3;
            dj4 dj4 = new dj4((d06) obj2, (d06) obj, ht4, z4, asVar2);
            nx4.getClass();
            zs4.getClass();
            ht4.v = dj4;
            nx4.e(zs4, z4);
            ht4.v = null;
            if (!obj2.w) {
                break;
            }
            this = ht4;
            z3 = z4;
        }
        if (z4) {
            LinkedHashMap linkedHashMap = ht4.l;
            if (!z2) {
                zd2 zd2 = new zd2(new cv2(cl6.S(new tm3(26), qt4), (vr2) new gt4(ht4, 0)));
                while (zd2.hasNext()) {
                    Integer valueOf = Integer.valueOf(((qt4) zd2.next()).x.a);
                    ct4 ct4 = (ct4) asVar2.n();
                    if (ct4 != null) {
                        str = (String) ct4.a.y;
                    } else {
                        str = null;
                    }
                    linkedHashMap.put(valueOf, str);
                }
            }
            if (!asVar2.isEmpty()) {
                kb9 kb9 = ((ct4) asVar2.first()).a;
                zd2 zd22 = new zd2(new cv2(cl6.S(new tm3(27), ht4.c(kb9.x, (qt4) null)), (vr2) new gt4(ht4, 1)));
                while (zd22.hasNext()) {
                    linkedHashMap.put(Integer.valueOf(((qt4) zd22.next()).x.a), (String) kb9.y);
                }
                if (linkedHashMap.values().contains((String) kb9.y)) {
                    ht4.m.put((String) kb9.y, asVar2);
                }
            }
        }
        ht4.b.b();
        return obj.w;
    }

    public final void n(zs4 zs4, boolean z2, as asVar) {
        it4 it4;
        xw5 xw5;
        Set set;
        zs4.getClass();
        as asVar2 = this.f;
        zs4 zs42 = (zs4) asVar2.last();
        if (sg3.e(zs42, zs4)) {
            it0.k0(asVar2);
            ft4 ft4 = (ft4) this.t.get(this.s.b(zs42.x.w));
            boolean z3 = true;
            if ((ft4 == null || (xw5 = ft4.f) == null || (set = (Set) xw5.w.getValue()) == null || !set.contains(zs42)) && !this.k.containsKey(zs42)) {
                z3 = false;
            }
            k54 k54 = zs42.D.j.E;
            k54 k542 = k54.y;
            if (k54.compareTo(k542) >= 0) {
                if (z2) {
                    zs42.a(k542);
                    asVar.addFirst(new ct4(zs42));
                }
                if (!z3) {
                    zs42.a(k54.w);
                    r(zs42);
                } else {
                    zs42.a(k542);
                }
            }
            if (!z2 && !z3 && (it4 = this.o) != null) {
                String str = zs42.B;
                str.getClass();
                z58 z58 = (z58) it4.b.remove(str);
                if (z58 != null) {
                    z58.a();
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("Attempted to pop ");
        sb.append(zs4.x);
        qt4 qt4 = zs42.x;
        sb.append(", which is not the top of the back stack (");
        sb.append(qt4);
        sb.append(')');
        throw new IllegalStateException(sb.toString().toString());
    }

    public final ArrayList p() {
        k54 k54;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.t.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            k54 = k54.z;
            if (!hasNext) {
                break;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object next : (Iterable) ((ft4) it.next()).f.w.getValue()) {
                zs4 zs4 = (zs4) next;
                if (!arrayList.contains(zs4) && zs4.D.k.compareTo(k54) < 0) {
                    arrayList2.add(next);
                }
            }
            it0.h0(arrayList, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = this.f.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            zs4 zs42 = (zs4) next2;
            if (!arrayList.contains(zs42) && zs42.D.k.compareTo(k54) >= 0) {
                arrayList3.add(next2);
            }
        }
        it0.h0(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next3 = it3.next();
            if (!(((zs4) next3).x instanceof eu4)) {
                arrayList4.add(next3);
            }
        }
        return arrayList4;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [java.lang.Object, d06] */
    public final boolean q(int i2, Bundle bundle, wu4 wu4) {
        qt4 qt4;
        String str;
        zs4 zs4;
        qt4 qt42;
        Bundle bundle2;
        ClassLoader classLoader;
        Integer valueOf = Integer.valueOf(i2);
        LinkedHashMap linkedHashMap = this.l;
        if (!linkedHashMap.containsKey(valueOf)) {
            return false;
        }
        String str2 = (String) linkedHashMap.get(Integer.valueOf(i2));
        Iterable values = linkedHashMap.values();
        values.getClass();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            if (sg3.e((String) it.next(), str2)) {
                it.remove();
            }
        }
        as asVar = (as) mp7.O(this.m).remove(str2);
        tb1 tb1 = this.a.c;
        ArrayList arrayList = new ArrayList();
        zs4 zs42 = (zs4) this.f.p();
        if (zs42 == null || (qt4 = zs42.x) == null) {
            qt4 = g();
        }
        if (asVar != null) {
            Iterator it2 = asVar.iterator();
            while (it2.hasNext()) {
                ct4 ct4 = (ct4) it2.next();
                kb9 kb9 = ct4.a;
                kb9 kb92 = ct4.a;
                qt4 d2 = d(kb9.x, qt4, (qt4) null, true);
                if (d2 != null) {
                    k54 h2 = h();
                    it4 it4 = this.o;
                    tb1.getClass();
                    h2.getClass();
                    Bundle bundle3 = (Bundle) kb92.z;
                    if (bundle3 != null) {
                        Context context = tb1.a;
                        if (context != null) {
                            classLoader = context.getClassLoader();
                        } else {
                            classLoader = null;
                        }
                        bundle3.setClassLoader(classLoader);
                        bundle2 = bundle3;
                    } else {
                        bundle2 = null;
                    }
                    String str3 = (String) kb92.y;
                    str3.getClass();
                    arrayList.add(new zs4(tb1, d2, bundle2, h2, it4, str3, (Bundle) kb92.A));
                    qt4 = d2;
                } else {
                    int i3 = qt4.A;
                    ku4.u("Restore State failed: destination ", ie1.H(tb1, kb92.x), " cannot be found from the current destination ", qt4);
                    return false;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            if (!(((zs4) next).x instanceof eu4)) {
                arrayList3.add(next);
            }
        }
        Iterator it5 = arrayList3.iterator();
        while (it5.hasNext()) {
            zs4 zs43 = (zs4) it5.next();
            List list = (List) dt0.H0(arrayList2);
            if (list == null || (zs4 = (zs4) dt0.G0(list)) == null || (qt42 = zs4.x) == null) {
                str = null;
            } else {
                str = qt42.w;
            }
            if (sg3.e(str, zs43.x.w)) {
                list.add(zs43);
            } else {
                arrayList2.add(sg3.I(zs43));
            }
        }
        ? obj = new Object();
        Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            List list2 = (List) it6.next();
            nx4 b2 = this.s.b(((zs4) dt0.w0(list2)).x.w);
            ArrayList arrayList4 = arrayList;
            this.u = new b9((Object) obj, (Object) arrayList4, new Object(), (Object) this, (Object) bundle, 6);
            b2.d(list2, wu4);
            this.u = null;
            arrayList = arrayList4;
        }
        return obj.w;
    }

    public final void r(zs4 zs4) {
        Integer num;
        zs4.getClass();
        zs4 zs42 = (zs4) this.j.remove(zs4);
        if (zs42 != null) {
            LinkedHashMap linkedHashMap = this.k;
            xt xtVar = (xt) linkedHashMap.get(zs42);
            if (xtVar != null) {
                num = Integer.valueOf(xtVar.a.decrementAndGet());
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 0) {
                ft4 ft4 = (ft4) this.t.get(this.s.b(zs42.x.w));
                if (ft4 != null) {
                    ft4.c(zs42);
                }
                linkedHashMap.remove(zs42);
            }
        }
    }

    public final void s() {
        Boolean bool;
        xt xtVar;
        xw5 xw5;
        Set set;
        ArrayList d1 = dt0.d1(this.f);
        if (!d1.isEmpty()) {
            ArrayList I = sg3.I(((zs4) dt0.G0(d1)).x);
            ArrayList arrayList = new ArrayList();
            if (dt0.G0(I) instanceof uu1) {
                for (zs4 zs4 : dt0.O0(d1)) {
                    qt4 qt4 = zs4.x;
                    arrayList.add(qt4);
                    if (!(qt4 instanceof uu1) && !(qt4 instanceof eu4)) {
                        break;
                    }
                }
            }
            HashMap hashMap = new HashMap();
            for (zs4 zs42 : dt0.O0(d1)) {
                k54 k54 = zs42.D.k;
                qt4 qt42 = zs42.x;
                qt4 qt43 = (qt4) dt0.y0(I);
                k54 k542 = k54.A;
                k54 k543 = k54.z;
                if (qt43 != null && qt43.x.a == qt42.x.a) {
                    if (k54 != k542) {
                        ft4 ft4 = (ft4) this.t.get(this.s.b(zs42.x.w));
                        if (ft4 == null || (xw5 = ft4.f) == null || (set = (Set) xw5.w.getValue()) == null) {
                            bool = null;
                        } else {
                            bool = Boolean.valueOf(set.contains(zs42));
                        }
                        if (sg3.e(bool, Boolean.TRUE) || ((xtVar = (xt) this.k.get(zs42)) != null && xtVar.a.get() == 0)) {
                            hashMap.put(zs42, k543);
                        } else {
                            hashMap.put(zs42, k542);
                        }
                    }
                    qt4 qt44 = (qt4) dt0.y0(arrayList);
                    if (qt44 != null && qt44.x.a == qt42.x.a) {
                        it0.j0(arrayList);
                    }
                    it0.j0(I);
                    eu4 eu4 = qt42.y;
                    if (eu4 != null) {
                        I.add(eu4);
                    }
                } else if (arrayList.isEmpty() || qt42.x.a != ((qt4) dt0.w0(arrayList)).x.a) {
                    zs42.a(k54.y);
                } else {
                    qt4 qt45 = (qt4) it0.j0(arrayList);
                    if (k54 == k542) {
                        zs42.a(k543);
                    } else if (k54 != k543) {
                        hashMap.put(zs42, k543);
                    }
                    eu4 eu42 = qt45.y;
                    if (eu42 != null && !arrayList.contains(eu42)) {
                        arrayList.add(eu42);
                    }
                }
            }
            Iterator it = d1.iterator();
            while (it.hasNext()) {
                zs4 zs43 = (zs4) it.next();
                k54 k544 = (k54) hashMap.get(zs43);
                if (k544 != null) {
                    zs43.a(k544);
                } else {
                    zs43.D.b();
                }
            }
        }
    }
}
