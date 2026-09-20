package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: it4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class it4 extends r58 {
    public final LinkedHashMap b = new LinkedHashMap();

    public final void d() {
        LinkedHashMap linkedHashMap = this.b;
        for (z58 a : linkedHashMap.values()) {
            a.a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        int identityHashCode = System.identityHashCode(this);
        rd3.i(16);
        sb.append(z65.U(((long) identityHashCode) & 4294967295L, 16));
        sb.append("} ViewModelStores (");
        Iterator it = this.b.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
