package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: uw1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class uw1 extends y1 {
    public final Iterator y;
    public final HashSet z = new HashSet();

    public uw1(Iterator it, nf6 nf6) {
        it.getClass();
        this.y = it;
    }

    public final void a() {
        Object next;
        do {
            Iterator it = this.y;
            if (it.hasNext()) {
                next = it.next();
            } else {
                this.w = 2;
                return;
            }
        } while (!this.z.add(next));
        this.x = next;
        this.w = 1;
    }
}
