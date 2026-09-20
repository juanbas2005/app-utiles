package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: lp7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lp7 {
    public static final lp7 a = new Object();

    public static ArrayList a(AbstractCollection abstractCollection, gs2 gs2) {
        ArrayList arrayList = new ArrayList(abstractCollection);
        Iterator it = arrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            fu6 fu6 = (fu6) it.next();
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    fu6 fu62 = (fu6) it2.next();
                    if (fu62 != fu6) {
                        fu62.getClass();
                        fu6.getClass();
                        if (((Boolean) gs2.H(fu62, fu6)).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final fu6 b(ArrayList arrayList) {
        fu6 fu6;
        Object obj;
        ro7 ro7;
        arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            fu6 fu62 = (fu6) it.next();
            if (fu62.L() instanceof gg3) {
                Collection e = fu62.L().e();
                e.getClass();
                Iterable<vw3> iterable = e;
                ArrayList arrayList3 = new ArrayList(et0.e0(iterable, 10));
                for (vw3 vw3 : iterable) {
                    vw3.getClass();
                    fu6 n0 = mp7.n0(vw3);
                    if (fu62.Q()) {
                        n0 = n0.o0(true);
                    }
                    arrayList3.add(n0);
                }
                arrayList2.addAll(arrayList3);
            } else {
                arrayList2.add(fu62);
            }
        }
        Iterator it2 = arrayList2.iterator();
        kp7 kp7 = kp7.w;
        while (it2.hasNext()) {
            kp7 = kp7.a((du7) it2.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            fu6 fu63 = (fu6) it3.next();
            if (kp7 == kp7.z) {
                if (fu63 instanceof bz4) {
                    bz4 bz4 = (bz4) fu63;
                    fu63 = new bz4(bz4.x, bz4.y, bz4.z, bz4.A, bz4.B, true);
                }
                fu63.getClass();
                fu6 w = pe2.w(fu63, false);
                if (w == null && (w = o85.n(fu63)) == null) {
                    fu63 = fu63.o0(false);
                } else {
                    fu63 = w;
                }
            }
            linkedHashSet.add(fu63);
        }
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = new ArrayList(et0.e0(arrayList4, 10));
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            arrayList5.add(((fu6) it4.next()).J());
        }
        Iterator it5 = arrayList5.iterator();
        fu6 fu64 = null;
        if (it5.hasNext()) {
            ro7 ro72 = it5.next();
            while (it5.hasNext()) {
                ro7 ro73 = (ro7) it5.next();
                ro7 ro74 = (ro7) ro72;
                ro74.getClass();
                kg5 kg5 = ro7.x;
                ro73.getClass();
                if (!ro74.isEmpty() || !ro73.isEmpty()) {
                    ArrayList arrayList6 = new ArrayList();
                    Collection<Number> values = ((ConcurrentHashMap) kg5.x).values();
                    values.getClass();
                    for (Number intValue : values) {
                        int intValue2 = intValue.intValue();
                        um umVar = (um) ro74.w.get(intValue2);
                        um umVar2 = (um) ro73.w.get(intValue2);
                        if (umVar != null) {
                            if (!sg3.e(umVar2, umVar)) {
                                umVar = null;
                            }
                            umVar2 = umVar;
                        } else if (umVar2 == null || !sg3.e(umVar, umVar2)) {
                            umVar2 = null;
                        }
                        if (umVar2 != null) {
                            arrayList6.add(umVar2);
                        }
                    }
                    ro7 = kg5.l(arrayList6);
                } else {
                    ro7 = ro74;
                }
                ro72 = ro7;
            }
            ro7 ro75 = (ro7) ro72;
            if (linkedHashSet.size() == 1) {
                fu6 = (fu6) dt0.P0(linkedHashSet);
            } else {
                ArrayList a2 = a(linkedHashSet, new yv(2, this, lp7.class, "isStrictSupertype", "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lkotlin/reflect/jvm/internal/impl/types/KotlinType;)Z", 0, 0, 16));
                a2.isEmpty();
                if (!a2.isEmpty()) {
                    Iterator it6 = a2.iterator();
                    if (it6.hasNext()) {
                        Object obj2 = it6.next();
                        while (it6.hasNext()) {
                            fu6 fu65 = (fu6) it6.next();
                            fu6 fu66 = (fu6) obj2;
                            if (!(fu66 == null || fu65 == null)) {
                                wo7 L = fu66.L();
                                wo7 L2 = fu65.L();
                                boolean z = L instanceof ze3;
                                if (z && (L2 instanceof ze3)) {
                                    Iterable iterable2 = ((ze3) L).w;
                                    Iterable iterable3 = ((ze3) L2).w;
                                    iterable2.getClass();
                                    iterable3.getClass();
                                    Set f1 = dt0.f1(iterable2);
                                    it0.h0(f1, iterable3);
                                    ze3 ze3 = new ze3(f1);
                                    ro7.x.getClass();
                                    ro7 ro76 = ro7.y;
                                    ro76.getClass();
                                    obj = kl8.J(z62.a(u62.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"), ro76, ze3, a42.w, false);
                                    obj2 = obj;
                                } else if (z) {
                                    if (((ze3) L).w.contains(fu65)) {
                                        obj = fu65;
                                        obj2 = obj;
                                    }
                                } else if ((L2 instanceof ze3) && ((ze3) L2).w.contains(fu66)) {
                                    obj = fu66;
                                    obj2 = obj;
                                }
                            }
                            obj = null;
                            obj2 = obj;
                        }
                        fu64 = (fu6) obj2;
                    } else {
                        kj6.n("Empty collection can't be reduced.");
                        return null;
                    }
                }
                if (fu64 != null) {
                    fu6 = fu64;
                } else {
                    kz4.b.getClass();
                    ArrayList a3 = a(a2, new yv(2, jz4.b, lz4.class, "equalTypes", "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lkotlin/reflect/jvm/internal/impl/types/KotlinType;)Z", 0, 0, 17));
                    a3.isEmpty();
                    if (a3.size() < 2) {
                        fu6 = (fu6) dt0.P0(a3);
                    } else {
                        fu6 = new gg3(linkedHashSet).a();
                    }
                }
            }
            return fu6.v0(ro75);
        }
        kj6.n("Empty collection can't be reduced.");
        return null;
    }
}
