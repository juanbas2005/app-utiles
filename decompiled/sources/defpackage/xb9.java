package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: xb9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xb9 extends ro8 {
    public final ay4 y;
    public final HashMap z = new HashMap();

    public xb9(ay4 ay4) {
        super("require");
        this.y = ay4;
    }

    public final bq8 a(no7 no7, List list) {
        bq8 bq8;
        ya5.x("require", 1, list);
        String g = ((k68) no7.y).r(no7, (bq8) list.get(0)).g();
        HashMap hashMap = this.z;
        if (hashMap.containsKey(g)) {
            return (bq8) hashMap.get(g);
        }
        HashMap hashMap2 = (HashMap) this.y.x;
        if (hashMap2.containsKey(g)) {
            try {
                bq8 = (bq8) ((Callable) hashMap2.get(g)).call();
            } catch (Exception unused) {
                h.s("Failed to create API implementation: ".concat(String.valueOf(g)));
                return null;
            }
        } else {
            bq8 = bq8.o;
        }
        if (bq8 instanceof ro8) {
            hashMap.put(g, (ro8) bq8);
        }
        return bq8;
    }
}
