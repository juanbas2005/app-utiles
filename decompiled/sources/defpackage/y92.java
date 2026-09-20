package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: y92  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class y92 {
    public static final y92 b = new y92(0);
    public final Map a;

    public y92(y92 y92) {
        if (y92 == b) {
            this.a = Collections.EMPTY_MAP;
        } else {
            this.a = Collections.unmodifiableMap(y92.a);
        }
    }

    public final void a(yu2 yu2) {
        this.a.put(new w92(yu2.d.w, yu2.a), yu2);
    }

    public y92() {
        this.a = new HashMap();
    }

    public y92(int i) {
        this.a = Collections.EMPTY_MAP;
    }
}
