package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* renamed from: vk1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vk1 implements jw1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Set b;
    public final /* synthetic */ Set c;
    public final /* synthetic */ aq4 d;
    public final /* synthetic */ aq4 e;

    public vk1(Object obj, Set set, Set set2, aq4 aq4, aq4 aq42) {
        this.a = obj;
        this.b = set;
        this.c = set2;
        this.d = aq4;
        this.e = aq42;
    }

    public final void b() {
        ArrayList arrayList;
        List<cu4> list = (List) this.d.getValue();
        boolean z = false;
        if (list instanceof RandomAccess) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(((cu4) list.get(i)).b);
            }
        } else {
            arrayList = new ArrayList(et0.e0(list, 10));
            for (cu4 cu4 : list) {
                arrayList.add(cu4.b);
            }
        }
        Object obj = this.a;
        if (!arrayList.contains(obj)) {
            z = this.b.remove(obj);
        }
        if (z && !this.c.contains(obj)) {
            List list2 = (List) this.e.getValue();
            if (list2 instanceof RandomAccess) {
                int size2 = list2.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i2 = size2 - 1;
                        ((du4) list2.get(size2)).a.y(obj);
                        if (i2 >= 0) {
                            size2 = i2;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                for (du4 du4 : dt0.O0(list2)) {
                    du4.a.y(obj);
                }
            }
        }
    }
}
