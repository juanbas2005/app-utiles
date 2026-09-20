package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: sn3  reason: default package */
public final class sn3 implements sr2 {
    public final /* synthetic */ int w;
    public final tl4 x;

    public /* synthetic */ sn3(tl4 tl4, int i) {
        this.w = i;
        this.x = tl4;
    }

    public final Object b() {
        int i = this.w;
        tl4 tl4 = this.x;
        switch (i) {
            case b85.b:
                return new tn3(tl4);
            case 1:
                wv1 wv1 = tl4.C;
                if (wv1 != null) {
                    List<tl4> list = wv1.a;
                    tl4.e1();
                    list.contains(tl4);
                    for (tl4 tl42 : list) {
                        tl42.getClass();
                    }
                    ArrayList arrayList = new ArrayList(et0.e0(list, 10));
                    for (tl4 tl43 : list) {
                        ba5 ba5 = tl43.D;
                        ba5.getClass();
                        arrayList.add(ba5);
                    }
                    return new iy0(arrayList, "CompositeProvider@ModuleDescriptor for " + tl4.getName());
                }
                String str = tl4.getName().w;
                str.getClass();
                rf2.v(str, " were not set before querying module content", "Dependencies of module ");
                return null;
            default:
                return tl4.k0(n27.i).C;
        }
    }
}
