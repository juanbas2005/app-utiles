package defpackage;

import java.util.Iterator;

/* renamed from: dv1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class dv1 extends eq1 {
    public int m;

    public dv1(h98 h98) {
        super(h98);
        if (h98 instanceof n23) {
            this.e = 2;
        } else {
            this.e = 3;
        }
    }

    public final void d(int i) {
        if (!this.j) {
            this.j = true;
            this.g = i;
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                aq1 aq1 = (aq1) it.next();
                aq1.a(aq1);
            }
        }
    }
}
