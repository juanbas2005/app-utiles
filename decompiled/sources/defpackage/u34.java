package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: u34  reason: default package */
public final class u34 implements sr2 {
    public final /* synthetic */ int w;
    public final v34 x;

    public /* synthetic */ u34(v34 v34, int i) {
        this.w = i;
        this.x = v34;
    }

    public final Object b() {
        int i = this.w;
        v34 v34 = this.x;
        switch (i) {
            case b85.b:
                tl4 tl4 = v34.y;
                tl4.e1();
                iy0 iy0 = (iy0) tl4.G.getValue();
                up2 up2 = v34.z;
                iy0.getClass();
                up2.getClass();
                ArrayList arrayList = new ArrayList();
                iy0.b(up2, arrayList);
                return arrayList;
            case 1:
                tl4 tl42 = v34.y;
                tl42.e1();
                return Boolean.valueOf(aa5.j((iy0) tl42.G.getValue(), v34.z));
            default:
                ib4 ib4 = v34.B;
                yr3[] yr3Arr = v34.D;
                boolean booleanValue = ((Boolean) p25.q(ib4, yr3Arr[1])).booleanValue();
                up2 up22 = v34.z;
                tl4 tl43 = v34.y;
                if (booleanValue) {
                    return ii4.b;
                }
                List<x95> list = (List) p25.q(v34.A, yr3Arr[0]);
                ArrayList arrayList2 = new ArrayList(et0.e0(list, 10));
                for (x95 R : list) {
                    arrayList2.add(R.R());
                }
                ArrayList N0 = dt0.N0(arrayList2, new v67(tl43, up22));
                return fd1.u("package view scope for " + up22 + " in " + tl43.getName(), N0);
        }
    }
}
