package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: qq2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qq2 implements oq2 {
    public final /* synthetic */ rq2 a;

    public qq2(rq2 rq2) {
        this.a = rq2;
    }

    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        boolean z;
        rq2 rq2 = this.a;
        ArrayList arrayList3 = rq2.n;
        if (rq2.L(2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + rq2.a);
        }
        if (rq2.d.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            z = false;
        } else {
            q30 q30 = (q30) b81.k(1, rq2.d);
            rq2.h = q30;
            Iterator it = q30.a.iterator();
            while (it.hasNext()) {
                bq2 bq2 = ((ar2) it.next()).b;
                if (bq2 != null) {
                    bq2.I = true;
                }
            }
            z = rq2.V(arrayList, arrayList2, -1, 0);
        }
        if (!arrayList3.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(rq2.G((q30) it2.next()));
            }
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                if (it3.next() == null) {
                    Iterator it4 = linkedHashSet.iterator();
                    if (it4.hasNext()) {
                        bq2 bq22 = (bq2) it4.next();
                        throw null;
                    }
                } else {
                    ku4.a();
                    return false;
                }
            }
        }
        return z;
    }
}
