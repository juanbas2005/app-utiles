package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: zp0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zp0 implements ck1 {
    public final x06 a;
    public final vr2 b;
    public final b0 c;
    public final LinkedHashMap d;
    public final LinkedHashMap e;
    public final LinkedHashMap f;

    public zp0(x06 x06, vr2 vr2) {
        x06.getClass();
        this.a = x06;
        this.b = vr2;
        b0 b0Var = new b0(10, this);
        this.c = b0Var;
        ae2 ae2 = new ae2(new ts(1, x06.d()), true, b0Var);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        zd2 zd2 = new zd2(ae2);
        while (zd2.hasNext()) {
            Object next = zd2.next();
            uq4 c2 = ((h16) next).c();
            Object obj = linkedHashMap.get(c2);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(c2, obj);
            }
            ((List) obj).add(next);
        }
        this.d = linkedHashMap;
        ae2 ae22 = new ae2(new ts(1, this.a.b()), true, this.b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        zd2 zd22 = new zd2(ae22);
        while (zd22.hasNext()) {
            Object next2 = zd22.next();
            linkedHashMap2.put(((e16) next2).c(), next2);
        }
        this.e = linkedHashMap2;
        ArrayList f2 = this.a.f();
        vr2 vr22 = this.b;
        ArrayList arrayList = new ArrayList();
        Iterator it = f2.iterator();
        while (it.hasNext()) {
            Object next3 = it.next();
            if (((Boolean) vr22.y(next3)).booleanValue()) {
                arrayList.add(next3);
            }
        }
        int F = tf4.F(et0.e0(arrayList, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(F < 16 ? 16 : F);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next4 = it2.next();
            linkedHashMap3.put(((k16) next4).c(), next4);
        }
        this.f = linkedHashMap3;
    }

    public final Set a() {
        ae2 ae2 = new ae2(new ts(1, this.a.d()), true, this.c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        zd2 zd2 = new zd2(ae2);
        while (zd2.hasNext()) {
            linkedHashSet.add(((h16) zd2.next()).c());
        }
        return linkedHashSet;
    }

    public final k16 b(uq4 uq4) {
        uq4.getClass();
        return (k16) this.f.get(uq4);
    }

    public final Collection c(uq4 uq4) {
        uq4.getClass();
        List list = (List) this.d.get(uq4);
        if (list != null) {
            return list;
        }
        return a42.w;
    }

    public final e16 d(uq4 uq4) {
        uq4.getClass();
        return (e16) this.e.get(uq4);
    }

    public final Set e() {
        return this.f.keySet();
    }

    public final Set f() {
        ae2 ae2 = new ae2(new ts(1, this.a.b()), true, this.b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        zd2 zd2 = new zd2(ae2);
        while (zd2.hasNext()) {
            linkedHashSet.add(((e16) zd2.next()).c());
        }
        return linkedHashSet;
    }
}
