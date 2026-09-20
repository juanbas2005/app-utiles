package defpackage;

import java.util.ArrayList;

/* renamed from: qp8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public interface qp8 {
    static bq8 n(qp8 qp8, mq8 mq8, no7 no7, ArrayList arrayList) {
        String str = mq8.w;
        if (qp8.s(str)) {
            bq8 l = qp8.l(str);
            if (l instanceof ro8) {
                return ((ro8) l).a(no7, arrayList);
            }
            h.q(b81.n(str, " is not a function"));
            return null;
        } else if ("hasOwnProperty".equals(str)) {
            ya5.x("hasOwnProperty", 1, arrayList);
            if (qp8.s(((k68) no7.y).r(no7, (bq8) arrayList.get(0)).g())) {
                return bq8.t;
            }
            return bq8.u;
        } else {
            h.q(b81.y("Object has no function ", str));
            return null;
        }
    }

    bq8 l(String str);

    void o(String str, bq8 bq8);

    boolean s(String str);
}
