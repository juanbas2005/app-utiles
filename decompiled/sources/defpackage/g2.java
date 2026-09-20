package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* renamed from: g2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class g2 extends h2 implements RandomAccess {
    public final h2 w;
    public final int x;
    public final int y;

    public g2(h2 h2Var, int i, int i2) {
        this.w = h2Var;
        this.x = i;
        ie1.A(i, i2, h2Var.f());
        this.y = i2 - i;
    }

    public final int f() {
        return this.y;
    }

    public final Object get(int i) {
        int i2 = this.y;
        if (i < 0 || i >= i2) {
            h.l(b81.l(i, i2, "index: ", ", size: "));
            return null;
        }
        return this.w.get(this.x + i);
    }

    public final List subList(int i, int i2) {
        ie1.A(i, i2, this.y);
        int i3 = this.x;
        return new g2(this.w, i + i3, i3 + i2);
    }
}
