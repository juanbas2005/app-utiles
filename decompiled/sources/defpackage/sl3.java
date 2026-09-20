package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.JsonArray;

/* renamed from: sl3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sl3 implements zr3 {
    public static final sl3 a = new Object();
    public static final rl3 b = rl3.b;

    public final Object deserialize(ok1 ok1) {
        mp7.N(ok1);
        return new JsonArray((List) new cs(gm3.a, 0).e(ok1));
    }

    public final ll6 getDescriptor() {
        return b;
    }

    public final void serialize(j42 j42, Object obj) {
        JsonArray jsonArray = (JsonArray) obj;
        jsonArray.getClass();
        mp7.M(j42);
        gm3 gm3 = gm3.a;
        ll6 descriptor = gm3.getDescriptor();
        descriptor.getClass();
        zr zrVar = new zr(descriptor, 1);
        int size = jsonArray.size();
        hy0 c = j42.c(zrVar);
        Iterator it = jsonArray.iterator();
        for (int i = 0; i < size; i++) {
            c.o(zrVar, i, gm3, it.next());
        }
        c.b(zrVar);
    }
}
