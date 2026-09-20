package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: z87  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class z87 {
    public static final qo4 a;

    static {
        z62 z62 = z62.a;
        c42 c42 = new c42(z62.b, n27.f, 0);
        uq4 g = n27.g.a.g();
        cb4 cb4 = kb4.e;
        qo4 qo4 = new qo4(c42, g, cb4);
        qo4.D = fl4.A;
        us1 us1 = vs1.e;
        if (us1 != null) {
            qo4.E = us1;
            List D = sg3.D(rp7.i1(qo4, k28.z, uq4.e("T"), 0, cb4));
            if (qo4.G == null) {
                ArrayList arrayList = new ArrayList(D);
                qo4.G = arrayList;
                qo4.F = new oq0(qo4, arrayList, qo4.H, qo4.I);
                Set<xs2> set = Collections.EMPTY_SET;
                if (set != null) {
                    for (xs2 xs2 : set) {
                        ((wp0) xs2).C = qo4.g0();
                    }
                    a = qo4;
                    return;
                }
                qo4.A0(13);
                throw null;
            }
            rf2.y("Type parameters are already set for ", qo4.getName());
            return;
        }
        qo4.A0(9);
        throw null;
    }
}
