package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: g50  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class g50 {
    public final HashMap a = new HashMap();

    public final int[] a() {
        ArrayList arrayList = new ArrayList();
        int i = -1;
        for (Map.Entry entry : this.a.entrySet()) {
            if (((Integer) entry.getValue()).intValue() > i) {
                i = ((Integer) entry.getValue()).intValue();
                arrayList.clear();
                arrayList.add(entry.getKey());
            } else if (((Integer) entry.getValue()).intValue() == i) {
                arrayList.add(entry.getKey());
            }
        }
        return gl0.g0(arrayList);
    }

    public final void b(int i) {
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = this.a;
        Integer num = (Integer) hashMap.get(valueOf);
        if (num == null) {
            num = 0;
        }
        hashMap.put(Integer.valueOf(i), Integer.valueOf(num.intValue() + 1));
    }
}
