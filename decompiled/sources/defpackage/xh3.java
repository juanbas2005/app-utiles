package defpackage;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: xh3  reason: default package */
public final class xh3 implements sr2 {
    public final /* synthetic */ int w;
    public final yh3 x;

    public /* synthetic */ xh3(yh3 yh3, int i) {
        this.w = i;
        this.x = yh3;
    }

    public final Object b() {
        int i = this.w;
        yh3 yh3 = this.x;
        switch (i) {
            case b85.b:
                return dt0.E0(yh3.getParameters(), "", "<init>(", ")V", v61.Y, 24);
            case 1:
                return uq3.p(yh3.x);
            case 2:
                ss h1 = dt0.h1(yh3.y);
                ArrayList arrayList = new ArrayList(et0.e0(h1, 10));
                Iterator it = h1.iterator();
                while (true) {
                    f02 f02 = (f02) it;
                    if (!f02.x.hasNext()) {
                        return arrayList;
                    }
                    ka3 ka3 = (ka3) f02.next();
                    int i2 = ka3.a;
                    Method method = (Method) ka3.b;
                    method.getClass();
                    arrayList.add(new zh3(yh3, method, i2));
                }
            case 3:
                Class u = kl8.u(yh3.x);
                List<Method> list = yh3.y;
                ArrayList arrayList2 = new ArrayList(et0.e0(list, 10));
                for (Method name : list) {
                    arrayList2.add(name.getName());
                }
                return new dm(u, arrayList2, bm.x, cm.w, yh3.y);
            default:
                Class u2 = kl8.u(yh3.x);
                List<Method> list2 = yh3.y;
                ArrayList arrayList3 = new ArrayList(et0.e0(list2, 10));
                for (Method name2 : list2) {
                    arrayList3.add(name2.getName());
                }
                return new dm(u2, arrayList3, bm.w, cm.w, yh3.y);
        }
    }
}
