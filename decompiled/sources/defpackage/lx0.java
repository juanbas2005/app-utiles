package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: lx0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lx0 extends RuntimeException {
    public final lp4 w;
    public final lp4 x;
    public final xo4 y;
    public final int z;

    public lx0(lp4 lp4, lp4 lp42, xo4 xo4, int i, Exception exc) {
        super(exc);
        this.w = lp4;
        this.x = lp42;
        this.y = xo4;
        this.z = i;
    }

    public final String getMessage() {
        List list;
        bl6 y2 = t75.y(new kx0(this, (f61) null));
        if (!y2.hasNext()) {
            list = a42.w;
        } else {
            Object next = y2.next();
            if (!y2.hasNext()) {
                list = sg3.D(next);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (y2.hasNext()) {
                    arrayList.add(y2.next());
                }
                list = arrayList;
            }
        }
        String E0 = dt0.E0(dt0.W0(50, list), "\n", (String) null, (String) null, (vr2) null, 62);
        return e57.g0("\n            |Failed to execute op number " + this.z + ":\n            |" + E0 + "\n            ");
    }
}
