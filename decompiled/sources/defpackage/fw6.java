package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: fw6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fw6 implements fi2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ hw6 x;

    public /* synthetic */ fw6(hw6 hw6, int i) {
        this.w = i;
        this.x = hw6;
    }

    public final Object k(Object obj, f61 f61) {
        Object value;
        zv6 zv6;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i = this.w;
        vs7 vs7 = vs7.a;
        hw6 hw6 = this.x;
        switch (i) {
            case b85.b:
                hw6.g = ((zn6) obj).f;
                return vs7;
            default:
                List<vy7> list = (List) obj;
                ArrayList arrayList3 = new ArrayList(et0.e0(list, 10));
                for (vy7 vy7 : list) {
                    arrayList3.add(new xv6(vy7.b, vy7.c, vy7.e));
                }
                d37 d37 = hw6.e;
                do {
                    value = d37.getValue();
                    zv6 = (zv6) ((is7) value).a;
                    arrayList = new ArrayList();
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (!sg3.e(((xv6) next).a, "LTE (Activar 4G)")) {
                            arrayList.add(next);
                        }
                    }
                    arrayList2 = new ArrayList();
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        if (sg3.e(((xv6) next2).a, "LTE (Activar 4G)")) {
                            arrayList2.add(next2);
                        }
                    }
                } while (!d37.i(value, new is7(6, zv6.a(zv6, arrayList, arrayList2, (xv6) null, 4))));
                return vs7;
        }
    }
}
