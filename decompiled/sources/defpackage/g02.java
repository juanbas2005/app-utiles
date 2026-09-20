package defpackage;

import java.util.Iterator;

/* renamed from: g02  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class g02 implements al6, i02 {
    public final al6 a;
    public final int b;

    public g02(al6 al6, int i) {
        al6.getClass();
        this.a = al6;
        this.b = i;
        if (i < 0) {
            ta1.k(i, 46, "count must be non-negative, but was ");
            throw null;
        }
    }

    public final al6 a(int i) {
        int i2 = this.b + i;
        if (i2 < 0) {
            return new g02(this, i);
        }
        return new g02(this.a, i2);
    }

    public final Iterator iterator() {
        return new f02(this);
    }
}
