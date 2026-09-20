package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: z58  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class z58 {
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.a;
        Map b0 = sf4.b0(linkedHashMap);
        linkedHashMap.clear();
        for (r58 b : b0.values()) {
            b.b();
        }
    }

    public final String toString() {
        String A = b26.a.b(z58.class).A();
        if (A == null) {
            A = "ViewModelStore";
        }
        int hashCode = hashCode();
        rd3.i(16);
        String num = Integer.toString(hashCode, 16);
        num.getClass();
        Set g1 = dt0.g1(this.a.keySet());
        return A + "@" + num + "(keys=" + g1 + ")";
    }
}
