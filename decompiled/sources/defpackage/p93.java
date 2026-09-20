package defpackage;

import java.util.List;

/* renamed from: p93  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class p93 extends h2 {
    public final o2 w;
    public final int x;
    public final int y;

    public p93(o2 o2Var, int i, int i2) {
        this.w = o2Var;
        this.x = i;
        bb0.X(i, i2, o2Var.f());
        this.y = i2 - i;
    }

    public final int f() {
        return this.y;
    }

    public final Object get(int i) {
        bb0.V(i, this.y);
        return this.w.get(this.x + i);
    }

    public final List subList(int i, int i2) {
        bb0.X(i, i2, this.y);
        int i3 = this.x;
        return new p93(this.w, i + i3, i3 + i2);
    }
}
