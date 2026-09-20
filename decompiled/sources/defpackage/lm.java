package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: lm  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lm {
    public static final LinkedHashMap c;
    public final zc9 a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (jm jmVar : jm.values()) {
            String str = jmVar.w;
            if (linkedHashMap.get(str) == null) {
                linkedHashMap.put(str, jmVar);
            }
        }
        c = linkedHashMap;
    }

    public lm(zc9 zc9) {
        this.a = zc9;
    }

    public static ArrayList a(Object obj, boolean z) {
        Iterable iterable;
        fm fmVar = (fm) obj;
        fmVar.getClass();
        Map g = fmVar.g();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : g.entrySet()) {
            uq4 uq4 = (uq4) entry.getKey();
            e21 e21 = (e21) entry.getValue();
            if (!z || sg3.e(uq4, nn3.b)) {
                iterable = j(e21);
            } else {
                iterable = a42.w;
            }
            it0.h0(arrayList, iterable);
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x001b A[SYNTHETIC] */
    public static ak3 b(lm lmVar, ak3 ak3, rm rmVar) {
        boolean z;
        EnumMap enumMap;
        ki3 ki3;
        yb5 yb5;
        xc8 g;
        Object c2;
        Object obj;
        ki3 ki32;
        x46 x46;
        lm lmVar2 = lmVar;
        ak3 ak32 = ak3;
        lmVar2.getClass();
        rmVar.getClass();
        zc9 zc9 = lmVar2.a;
        boolean z2 = zc9.x;
        if (!z2) {
            ArrayList arrayList = new ArrayList();
            Iterator it = rmVar.iterator();
            while (true) {
                z = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                x46 x462 = x46.IGNORE;
                ki3 ki33 = null;
                if (!z2 && (ki32 = (ki3) li3.b.get(d(next))) != null) {
                    up2 d = d(next);
                    if (d == null || !li3.a.containsKey(d)) {
                        x46 = lmVar2.h(next);
                        if (x46 == null) {
                            x46 = ((ln3) zc9.y).a;
                        }
                    } else {
                        x46 = (x46) ((b0) zc9.z).y(d);
                    }
                    if (x46 == x462) {
                        x46 = null;
                    }
                    if (x46 != null) {
                        xc8 a2 = xc8.a(ki32.a, (s15) null, x46.a(), 1);
                        Collection collection = ki32.b;
                        boolean z3 = ki32.c;
                        boolean z4 = ki32.d;
                        boolean z5 = ki32.e;
                        collection.getClass();
                        ki3 = new ki3(a2, collection, z3, z4, z5);
                        if (ki3 == null) {
                            ki33 = ki3;
                        } else {
                            if (!((ln3) zc9.y).d && (c2 = c(next, on3.f)) != null) {
                                Iterator it2 = e(next).iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        obj = null;
                                        break;
                                    }
                                    obj = it2.next();
                                    if (lmVar2.i(obj) != null) {
                                        break;
                                    }
                                }
                                if (obj != null) {
                                    ArrayList a3 = a(c2, true);
                                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                                    Iterator it3 = a3.iterator();
                                    while (it3.hasNext()) {
                                        jm jmVar = (jm) c.get((String) it3.next());
                                        if (jmVar != null) {
                                            linkedHashSet.add(jmVar);
                                        }
                                    }
                                    if (linkedHashSet.contains(jm.TYPE_USE)) {
                                        linkedHashSet = wn6.o(wn6.n(qs.r1(jm.values()), jm.TYPE_PARAMETER_BOUNDS), linkedHashSet);
                                    }
                                    yb5 = new yb5(obj, linkedHashSet);
                                    if (yb5 != null) {
                                        Object obj2 = yb5.w;
                                        Set set = (Set) yb5.x;
                                        x46 h = lmVar2.h(next);
                                        if (h == null && (h = lmVar2.h(obj2)) == null) {
                                            h = ((ln3) zc9.y).a;
                                        }
                                        if (h != x462) {
                                            obj2.getClass();
                                            xc8 g2 = lmVar2.g(obj2, false);
                                            if (g2 == null) {
                                                Object i = lmVar2.i(obj2);
                                                if (i != null) {
                                                    x46 h2 = lmVar2.h(obj2);
                                                    if (h2 == null) {
                                                        h2 = ((ln3) zc9.y).a;
                                                    }
                                                    if (!(h2 == x462 || (g = lmVar2.g(i, false)) == null)) {
                                                        g2 = xc8.a(g, (s15) null, h2.a(), 1);
                                                    }
                                                }
                                                g2 = null;
                                            }
                                            if (g2 != null) {
                                                ki33 = new ki3(xc8.a(g2, (s15) null, h.a(), 1), set, 28);
                                            }
                                        }
                                    }
                                }
                            }
                            yb5 = null;
                            if (yb5 != null) {
                            }
                        }
                        if (ki33 == null) {
                            arrayList.add(ki33);
                        }
                    }
                }
                ki3 = null;
                if (ki3 == null) {
                }
                if (ki33 == null) {
                }
            }
            if (!arrayList.isEmpty()) {
                Class<jm> cls = jm.class;
                EnumMap enumMap2 = new EnumMap(cls);
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    ki3 ki34 = (ki3) it4.next();
                    for (jm jmVar2 : ki34.b) {
                        enumMap2.containsKey(jmVar2);
                        enumMap2.put(jmVar2, ki34);
                    }
                }
                if (ak32 != null) {
                    enumMap = new EnumMap(ak32.a);
                } else {
                    enumMap = new EnumMap(cls);
                }
                for (Map.Entry entry : enumMap2.entrySet()) {
                    jm jmVar3 = (jm) entry.getKey();
                    ki3 ki35 = (ki3) entry.getValue();
                    if (ki35 != null) {
                        enumMap.put(jmVar3, ki35);
                        z = true;
                    }
                }
                if (z) {
                    return new ak3(enumMap);
                }
            }
        }
        return ak32;
    }

    public static Object c(Object obj, up2 up2) {
        for (Object next : e(obj)) {
            if (sg3.e(d(next), up2)) {
                return next;
            }
        }
        return null;
    }

    public static up2 d(Object obj) {
        fm fmVar = (fm) obj;
        fmVar.getClass();
        return fmVar.f();
    }

    public static Iterable e(Object obj) {
        rm annotations;
        fm fmVar = (fm) obj;
        fmVar.getClass();
        ql4 d = ts1.d(fmVar);
        if (d == null || (annotations = d.getAnnotations()) == null) {
            return a42.w;
        }
        return annotations;
    }

    public static boolean f(Object obj, up2 up2) {
        Iterable<Object> e = e(obj);
        if ((e instanceof Collection) && ((Collection) e).isEmpty()) {
            return false;
        }
        for (Object d : e) {
            if (sg3.e(d(d), up2)) {
                return true;
            }
        }
        return false;
    }

    public static List j(e21 e21) {
        if (e21 instanceof ps) {
            ArrayList arrayList = new ArrayList();
            for (e21 j : (Iterable) ((ps) e21).a) {
                it0.h0(arrayList, j(j));
            }
            return arrayList;
        } else if (e21 instanceof b62) {
            return sg3.D(((b62) e21).c.c());
        } else {
            return a42.w;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0063, code lost:
        if (r8.equals("ALWAYS") != false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006c, code lost:
        if (r8.equals("UNKNOWN") == false) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0075, code lost:
        if (r8.equals("NEVER") == false) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007e, code lost:
        if (r8.equals("MAYBE") == false) goto L_0x0090;
     */
    public final xc8 g(Object obj, boolean z) {
        up2 d = d(obj);
        if (d != null) {
            x46 x46 = (x46) ((b0) this.a.z).y(d);
            x46.getClass();
            if (x46 == x46.IGNORE) {
                return null;
            }
            boolean contains = on3.k.contains(d);
            s15 s15 = s15.y;
            boolean z2 = false;
            if (!contains) {
                boolean contains2 = on3.l.contains(d);
                s15 s152 = s15.x;
                if (!contains2) {
                    boolean contains3 = on3.m.contains(d);
                    s15 s153 = s15.w;
                    if (!contains3) {
                        if (d.equals(on3.g)) {
                            String str = (String) dt0.x0(a(obj, false));
                            if (str != null) {
                                switch (str.hashCode()) {
                                    case 73135176:
                                        break;
                                    case 74175084:
                                        break;
                                    case 433141802:
                                        break;
                                    case 1933739535:
                                        break;
                                }
                            }
                        }
                    }
                    s15 = s153;
                }
                s15 = s152;
            }
            if (x46.a() || z) {
                z2 = true;
            }
            return new xc8(s15, z2);
        }
        return null;
    }

    public final x46 h(Object obj) {
        String str;
        ln3 ln3 = (ln3) this.a.y;
        x46 x46 = (x46) ln3.c.get(d(obj));
        if (x46 != null) {
            return x46;
        }
        Object c2 = c(obj, on3.p);
        if (c2 == null || (str = (String) dt0.x0(a(c2, false))) == null) {
            return null;
        }
        x46 x462 = ln3.b;
        if (x462 != null) {
            return x462;
        }
        int hashCode = str.hashCode();
        if (hashCode != -2137067054) {
            if (hashCode != -1838656823) {
                if (hashCode == 2656902 && str.equals("WARN")) {
                    return x46.WARN;
                }
                return null;
            } else if (!str.equals("STRICT")) {
                return null;
            } else {
                return x46.STRICT;
            }
        } else if (!str.equals("IGNORE")) {
            return null;
        } else {
            return x46.IGNORE;
        }
    }

    public final Object i(Object obj) {
        Object obj2;
        obj.getClass();
        if (!((ln3) this.a.y).d) {
            if (dt0.q0(on3.j, d(obj)) || f(obj, on3.d)) {
                return obj;
            }
            if (f(obj, on3.e)) {
                ql4 d = ts1.d((fm) obj);
                d.getClass();
                ConcurrentHashMap concurrentHashMap = this.b;
                Object obj3 = concurrentHashMap.get(d);
                if (obj3 != null) {
                    return obj3;
                }
                Iterator it = e(obj).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = i(it.next());
                    if (obj2 != null) {
                        break;
                    }
                }
                if (obj2 != null) {
                    Object putIfAbsent = concurrentHashMap.putIfAbsent(d, obj2);
                    if (putIfAbsent == null) {
                        return obj2;
                    }
                    return putIfAbsent;
                }
            }
        }
        return null;
    }
}
