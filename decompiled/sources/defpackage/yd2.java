package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: yd2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yd2 implements rm {
    public final rm w;
    public final e18 x;

    public yd2(rm rmVar, e18 e18) {
        this.w = rmVar;
        this.x = e18;
    }

    public final boolean i(up2 up2) {
        up2.getClass();
        if (((Boolean) this.x.y(up2)).booleanValue()) {
            return this.w.i(up2);
        }
        return false;
    }

    public final boolean isEmpty() {
        rm<fm> rmVar = this.w;
        if ((rmVar instanceof Collection) && ((Collection) rmVar).isEmpty()) {
            return false;
        }
        for (fm f : rmVar) {
            up2 f2 = f.f();
            if (f2 != null && ((Boolean) this.x.y(f2)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        for (Object next : this.w) {
            up2 f = ((fm) next).f();
            if (f != null && ((Boolean) this.x.y(f)).booleanValue()) {
                arrayList.add(next);
            }
        }
        return arrayList.iterator();
    }

    public final fm m(up2 up2) {
        up2.getClass();
        if (((Boolean) this.x.y(up2)).booleanValue()) {
            return this.w.m(up2);
        }
        return null;
    }
}
