package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: g34  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class g34 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ g34(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }

    public final Object y(Object obj) {
        int i = this.w;
        Object obj2 = this.x;
        switch (i) {
            case b85.b:
                ((Integer) obj).getClass();
                return obj2;
            default:
                qt4 qt4 = (qt4) obj;
                qt4.getClass();
                Map g = qt4.g();
                LinkedHashMap linkedHashMap = new LinkedHashMap(tf4.F(g.size()));
                for (Map.Entry entry : g.entrySet()) {
                    linkedHashMap.put(entry.getKey(), ((xs4) entry.getValue()).a);
                }
                return b35.o(obj2, linkedHashMap);
        }
    }
}
