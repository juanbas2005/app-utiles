package defpackage;

import java.util.HashMap;

/* renamed from: rq8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rq8 {
    public int a;
    public final int b;
    public rq8 c;
    public final HashMap d = new HashMap(0);

    public rq8(int i, int i2) {
        if (i <= i2) {
            this.a = i;
            this.b = i2;
            this.c = null;
            return;
        }
        ku4.v();
        throw null;
    }

    public final String toString() {
        int identityHashCode = System.identityHashCode(this);
        return hl6.p(new StringBuilder(String.valueOf(identityHashCode).length() + 4), "Node", identityHashCode);
    }
}
