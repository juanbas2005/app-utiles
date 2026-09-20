package defpackage;

import android.util.SparseArray;
import java.util.HashMap;

/* renamed from: vo5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class vo5 {
    public static final SparseArray a = new SparseArray();
    public static final HashMap b;

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put(to5.w, 0);
        hashMap.put(to5.x, 1);
        hashMap.put(to5.y, 2);
        for (to5 to5 : hashMap.keySet()) {
            a.append(((Integer) b.get(to5)).intValue(), to5);
        }
    }

    public static int a(to5 to5) {
        Integer num = (Integer) b.get(to5);
        if (num != null) {
            return num.intValue();
        }
        ku4.t("PriorityMapping is missing known Priority value ", to5);
        return 0;
    }

    public static to5 b(int i) {
        to5 to5 = (to5) a.get(i);
        if (to5 != null) {
            return to5;
        }
        h.q(hl6.k(i, "Unknown Priority for value "));
        return null;
    }
}
