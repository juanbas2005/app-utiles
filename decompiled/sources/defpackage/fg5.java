package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: fg5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fg5 extends b3 implements t93, Collection, ar3 {
    public static final fg5 z;
    public final Object w;
    public final Object x;
    public final wf5 y;

    static {
        pe2 pe2 = pe2.D;
        z = new fg5(pe2, pe2, wf5.y);
    }

    public fg5(Object obj, Object obj2, wf5 wf5) {
        this.w = obj;
        this.x = obj2;
        this.y = wf5;
    }

    public final boolean contains(Object obj) {
        return this.y.containsKey(obj);
    }

    public final int f() {
        return this.y.x;
    }

    public final Iterator iterator() {
        return new bv2(this.w, (Map) this.y);
    }
}
