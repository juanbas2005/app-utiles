package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: f3  reason: default package */
public final class f3 implements sr2 {
    public final /* synthetic */ int w = 1;
    public final List x;

    public f3(List list, u72 u72) {
        this.x = list;
    }

    public final Object b() {
        int i = this.w;
        List<zw3> list = this.x;
        switch (i) {
            case b85.b:
                ArrayList arrayList = new ArrayList();
                for (zw3 zw3 : list) {
                    zw3.getClass();
                    vw3 k = ub5.k((vw3) zw3);
                    if (k != null) {
                        arrayList.add(k);
                    }
                }
                return arrayList;
            default:
                return list;
        }
    }

    public f3(List list) {
        this.x = list;
    }
}
