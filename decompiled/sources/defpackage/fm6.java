package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: fm6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fm6 implements fi2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ gm6 x;

    public /* synthetic */ fm6(gm6 gm6, int i) {
        this.w = i;
        this.x = gm6;
    }

    public final Object k(Object obj, f61 f61) {
        Object value;
        ArrayList arrayList;
        int i = this.w;
        vs7 vs7 = vs7.a;
        gm6 gm6 = this.x;
        switch (i) {
            case b85.b:
                gm6.g = ((zn6) obj).f;
                return vs7;
            default:
                List<vy7> list = (List) obj;
                d37 d37 = gm6.e;
                do {
                    value = d37.getValue();
                    dm6 dm6 = (dm6) ((is7) value).a;
                    arrayList = new ArrayList(et0.e0(list, 10));
                    for (vy7 vy7 : list) {
                        arrayList.add(new cm6(vy7.b, vy7.c));
                    }
                    dm6.getClass();
                } while (!d37.i(value, new is7(6, new dm6(arrayList))));
                return vs7;
        }
    }
}
