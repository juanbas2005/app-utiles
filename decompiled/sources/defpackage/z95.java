package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: z95  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class z95 implements ba5 {
    public final ArrayList a;

    public z95(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean a(up2 up2) {
        up2.getClass();
        ArrayList<x95> arrayList = this.a;
        if (arrayList.isEmpty()) {
            return true;
        }
        for (x95 x95 : arrayList) {
            if (sg3.e(((y95) x95).A, up2)) {
                return false;
            }
        }
        return true;
    }

    public final void b(up2 up2, ArrayList arrayList) {
        up2.getClass();
        for (Object next : this.a) {
            if (sg3.e(((y95) ((x95) next)).A, up2)) {
                arrayList.add(next);
            }
        }
    }

    public final Collection x(up2 up2, vr2 vr2) {
        up2.getClass();
        return cl6.V(new ae2(new wl7(new ts(1, this.a), jo3.V), true, new fy0(up2, 1)));
    }
}
