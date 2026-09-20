package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: ux3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ux3 extends LinkedHashMap {
    public final o0 w;
    public final ot4 x;
    public final int y;

    public ux3(o0 o0Var, ot4 ot4, int i) {
        super(10, 0.75f, true);
        this.w = o0Var;
        this.x = ot4;
        this.y = i;
    }

    public final Object get(Object obj) {
        if (this.y == 0) {
            return this.w.y(obj);
        }
        synchronized (this) {
            Object obj2 = super.get(obj);
            if (obj2 != null) {
                return obj2;
            }
            Object y2 = this.w.y(obj);
            put(obj, y2);
            return y2;
        }
    }

    public final boolean removeEldestEntry(Map.Entry entry) {
        boolean z;
        entry.getClass();
        if (super.size() > this.y) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.x.y(entry.getValue());
        }
        return z;
    }
}
