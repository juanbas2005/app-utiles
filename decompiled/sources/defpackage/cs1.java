package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: cs1  reason: default package */
public final class cs1 implements vr2 {
    public final /* synthetic */ int w;
    public final ql4 x;

    public cs1(ql4 ql4, iw5 iw5, fu6 fu6, wj3 wj3) {
        this.w = 2;
        this.x = ql4;
    }

    public final Object y(Object obj) {
        int i = this.w;
        ql4 ql4 = this.x;
        switch (i) {
            case b85.b:
                ro4 ro4 = (ro4) obj;
                ro4.getClass();
                List<qp7> u0 = ql4.u0();
                u0.getClass();
                ArrayList arrayList = new ArrayList(et0.e0(u0, 10));
                for (qp7 qp7 : u0) {
                    qp7.getClass();
                    arrayList.add(new ds3(ro4, qp7));
                }
                return arrayList;
            case 1:
                ((ro4) obj).getClass();
                Collection e = ql4.n().e();
                e.getClass();
                Iterable<vw3> iterable = e;
                ArrayList arrayList2 = new ArrayList(et0.e0(iterable, 10));
                for (vw3 ds1 : iterable) {
                    arrayList2.add(new ds1(ds1, 0));
                }
                return arrayList2;
            default:
                ((ax3) obj).getClass();
                ts1.f(ql4);
                return null;
        }
    }

    public /* synthetic */ cs1(ql4 ql4, int i) {
        this.w = i;
        this.x = ql4;
    }
}
