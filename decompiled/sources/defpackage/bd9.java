package defpackage;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: bd9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bd9 {
    public final String a;
    public final boolean b;
    public final f29 c;
    public final BitSet d;
    public final BitSet e;
    public final js f;
    public final js g;
    public final /* synthetic */ dl8 h;

    /* JADX WARNING: type inference failed for: r1v1, types: [js, zt6] */
    public bd9(dl8 dl8, String str, f29 f29, BitSet bitSet, BitSet bitSet2, js jsVar, js jsVar2) {
        this.h = dl8;
        this.a = str;
        this.d = bitSet;
        this.e = bitSet2;
        this.f = jsVar;
        this.g = new zt6(0);
        Iterator it = ((fs) jsVar2.keySet()).iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) jsVar2.get(num));
            this.g.put(num, arrayList);
        }
        this.b = false;
        this.c = f29;
    }

    public final void a(rt4 rt4) {
        int c2 = rt4.c();
        if (((Boolean) rt4.c) != null) {
            this.e.set(c2, true);
        }
        Boolean bool = (Boolean) rt4.d;
        if (bool != null) {
            this.d.set(c2, bool.booleanValue());
        }
        if (((Long) rt4.e) != null) {
            Integer valueOf = Integer.valueOf(c2);
            js jsVar = this.f;
            Long l = (Long) jsVar.get(valueOf);
            long longValue = ((Long) rt4.e).longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                jsVar.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (((Long) rt4.f) != null) {
            Integer valueOf2 = Integer.valueOf(c2);
            js jsVar2 = this.g;
            List list = (List) jsVar2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                jsVar2.put(valueOf2, list);
            }
            if (rt4.d()) {
                list.clear();
            }
            io8.a();
            y19 y19 = (y19) this.h.w;
            tp8 tp8 = y19.z;
            ay8 ay8 = by8.F0;
            String str = this.a;
            if (tp8.n1(str, ay8) && rt4.e()) {
                list.clear();
            }
            io8.a();
            boolean n1 = y19.z.n1(str, ay8);
            Long l2 = (Long) rt4.f;
            if (n1) {
                Long valueOf3 = Long.valueOf(l2.longValue() / 1000);
                if (!list.contains(valueOf3)) {
                    list.add(valueOf3);
                    return;
                }
                return;
            }
            list.add(Long.valueOf(l2.longValue() / 1000));
        }
    }

    public final n09 b(int i) {
        ArrayList arrayList;
        List list;
        m09 A = n09.A();
        A.b();
        ((n09) A.x).B(i);
        A.b();
        ((n09) A.x).E(this.b);
        f29 f29 = this.c;
        if (f29 != null) {
            A.b();
            ((n09) A.x).D(f29);
        }
        e29 B = f29.B();
        ArrayList I1 = y89.I1(this.d);
        B.b();
        ((f29) B.x).F(I1);
        ArrayList I12 = y89.I1(this.e);
        B.b();
        ((f29) B.x).D(I12);
        js jsVar = this.f;
        if (jsVar == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(jsVar.y);
            Iterator it = ((fs) jsVar.keySet()).iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int intValue = num.intValue();
                Long l = (Long) jsVar.get(num);
                if (l != null) {
                    b19 x = e19.x();
                    x.b();
                    ((e19) x.x).y(intValue);
                    long longValue = l.longValue();
                    x.b();
                    ((e19) x.x).z(longValue);
                    arrayList2.add((e19) x.d());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            B.b();
            ((f29) B.x).H(arrayList);
        }
        js jsVar2 = this.g;
        if (jsVar2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(jsVar2.y);
            Iterator it2 = ((fs) jsVar2.keySet()).iterator();
            while (it2.hasNext()) {
                Integer num2 = (Integer) it2.next();
                h29 y = i29.y();
                int intValue2 = num2.intValue();
                y.b();
                ((i29) y.x).z(intValue2);
                List list2 = (List) jsVar2.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    y.b();
                    ((i29) y.x).A(list2);
                }
                arrayList3.add((i29) y.d());
            }
            list = arrayList3;
        }
        B.b();
        ((f29) B.x).J(list);
        A.b();
        ((n09) A.x).C((f29) B.d());
        return (n09) A.d();
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [js, zt6] */
    /* JADX WARNING: type inference failed for: r1v5, types: [js, zt6] */
    public bd9(dl8 dl8, String str) {
        this.h = dl8;
        this.a = str;
        this.b = true;
        this.d = new BitSet();
        this.e = new BitSet();
        this.f = new zt6(0);
        this.g = new zt6(0);
    }
}
