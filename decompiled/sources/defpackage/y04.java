package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: y04  reason: default package */
public final class y04 implements sr2 {
    public final /* synthetic */ int w;
    public final a14 x;

    public /* synthetic */ y04(a14 a14, int i) {
        this.w = i;
        this.x = a14;
    }

    public final Object b() {
        int i = this.w;
        a14 a14 = this.x;
        switch (i) {
            case b85.b:
                Class[] declaredClasses = a14.o.a.getDeclaredClasses();
                declaredClasses.getClass();
                return dt0.g1(cl6.V(new ae2(new wl7(new ae2(qs.E0(declaredClasses), false, l06.y), l06.z), false, new nf6(18))));
            case 1:
                List b = a14.o.b();
                ArrayList arrayList = new ArrayList();
                for (Object next : b) {
                    if (((e16) next).a.isEnumConstant()) {
                        arrayList.add(next);
                    }
                }
                int F = tf4.F(et0.e0(arrayList, 10));
                if (F < 16) {
                    F = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(F);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next2 = it.next();
                    linkedHashMap.put(((e16) next2).c(), next2);
                }
                return linkedHashMap;
            default:
                return wn6.o(a14.c(), a14.g());
        }
    }
}
