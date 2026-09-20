package defpackage;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/* renamed from: ld4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ld4 {
    public final LinkedHashMap a;

    public ld4(int i) {
        switch (i) {
            case 1:
                this.a = new LinkedHashMap();
                return;
            default:
                this.a = new LinkedHashMap(0, 0.75f, true);
                return;
        }
    }

    public void a(vk4 vk4) {
        vk4.getClass();
        int i = vk4.a;
        int i2 = vk4.b;
        Integer valueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.a;
        Object obj = linkedHashMap.get(valueOf);
        if (obj == null) {
            obj = new TreeMap();
            linkedHashMap.put(valueOf, obj);
        }
        TreeMap treeMap = (TreeMap) obj;
        if (treeMap.containsKey(Integer.valueOf(i2))) {
            Log.w("ROOM", "Overriding migration " + treeMap.get(Integer.valueOf(i2)) + " with " + vk4);
        }
        treeMap.put(Integer.valueOf(i2), vk4);
    }
}
