package defpackage;

import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* renamed from: wk1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wk1 implements jw1 {
    public final /* synthetic */ Set a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Set c;
    public final /* synthetic */ aq4 d;

    public wk1(Set set, Object obj, Set set2, aq4 aq4) {
        this.a = set;
        this.b = obj;
        this.c = set2;
        this.d = aq4;
    }

    public final void b() {
        Set set = this.a;
        Object obj = this.b;
        boolean remove = set.remove(obj);
        if (!this.c.contains(obj) && remove) {
            List list = (List) this.d.getValue();
            if (list instanceof RandomAccess) {
                int size = list.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i = size - 1;
                        ((du4) list.get(size)).a.y(obj);
                        if (i >= 0) {
                            size = i;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                for (du4 du4 : dt0.O0(list)) {
                    du4.a.y(obj);
                }
            }
        }
    }
}
