package defpackage;

import java.util.AbstractList;

/* renamed from: wl8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wl8 extends AbstractList {
    public final ul8 w;
    public final vl8 x;

    public wl8(ul8 ul8, vl8 vl8) {
        this.w = ul8;
        this.x = vl8;
    }

    public final Object get(int i) {
        int g = ((ol8) this.w).g(i);
        ((nx8) this.x).getClass();
        lk8 b = lk8.b(g);
        if (b == null) {
            return lk8.x;
        }
        return b;
    }

    public final int size() {
        return ((ol8) this.w).y;
    }
}
