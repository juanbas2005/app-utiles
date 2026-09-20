package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lvu1;", "Lnx4;", "Luu1;", "navigation-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@mx4("dialog")
/* renamed from: vu1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vu1 extends nx4 {
    public final qt4 a() {
        fw0 fw0 = pw0.a;
        return new uu1(this);
    }

    public final void d(List list, wu4 wu4) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().f((zs4) it.next());
        }
    }

    public final void e(zs4 zs4, boolean z) {
        b().e(zs4, z);
        int A0 = dt0.A0((Iterable) b().f.w.getValue(), zs4);
        int i = 0;
        for (Object next : (Iterable) b().f.w.getValue()) {
            int i2 = i + 1;
            if (i >= 0) {
                zs4 zs42 = (zs4) next;
                if (i > A0) {
                    b().c(zs42);
                }
                i = i2;
            } else {
                sg3.Z();
                throw null;
            }
        }
    }
}
