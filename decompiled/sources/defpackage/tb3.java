package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: tb3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tb3 {
    public final LinkedHashMap a;

    public tb3(int i) {
        switch (i) {
            case 1:
                this.a = new LinkedHashMap();
                return;
            default:
                this.a = new LinkedHashMap();
                return;
        }
    }

    public void a(gq3 gq3, vr2 vr2) {
        gq3.getClass();
        vr2.getClass();
        LinkedHashMap linkedHashMap = this.a;
        if (!linkedHashMap.containsKey(gq3)) {
            linkedHashMap.put(gq3, new t58(gq3, vr2));
        } else {
            h.j(f21.h("A `initializer` with the same `clazz` has already been added: ", gq3.l(), "."));
        }
    }

    public f9 b() {
        Collection values = this.a.values();
        values.getClass();
        t58[] t58Arr = (t58[]) values.toArray(new t58[0]);
        return new f9(2, (t58[]) Arrays.copyOf(t58Arr, t58Arr.length));
    }

    public v27 c(id8 id8) {
        id8.getClass();
        return (v27) this.a.remove(id8);
    }

    public List d(String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = this.a;
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            if (sg3.e(((id8) entry.getKey()).a, str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (id8 remove : linkedHashMap.keySet()) {
            linkedHashMap2.remove(remove);
        }
        return dt0.b1(linkedHashMap.values());
    }

    public v27 e(id8 id8) {
        LinkedHashMap linkedHashMap = this.a;
        Object obj = linkedHashMap.get(id8);
        if (obj == null) {
            obj = new v27(id8);
            linkedHashMap.put(id8, obj);
        }
        return (v27) obj;
    }
}
