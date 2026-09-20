package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: d11  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class d11 implements bn5 {
    public final ArrayList a;

    public d11(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean test(Object obj) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((bn5) it.next()).test(obj)) {
                return false;
            }
        }
        return true;
    }
}
