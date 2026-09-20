package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: r05  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class r05 extends aq0 {
    public final boolean C;
    public final ArrayList D;
    public final oq0 E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r05(kb4 kb4, lq0 lq0, uq4 uq4, boolean z, int i) {
        super(kb4, lq0, uq4, sy6.j);
        lq0.getClass();
        this.C = z;
        re3 V = z65.V(0, i);
        ArrayList arrayList = new ArrayList(et0.e0(V, 10));
        Iterator it = V.iterator();
        while (((qe3) it).y) {
            int nextInt = ((je3) it).nextInt();
            arrayList.add(rp7.i1(this, k28.y, uq4.e("T" + nextInt), nextInt, kb4));
        }
        this.D = arrayList;
        List g = ya5.g(this);
        int i2 = ts1.a;
        sl4 c = rs1.c(this);
        c.getClass();
        this.E = new oq0(this, g, wn6.w(c.g().e()), kb4);
    }

    public final boolean H() {
        return false;
    }

    public final /* bridge */ /* synthetic */ ji4 L() {
        return ii4.b;
    }

    public final us1 f() {
        us1 us1 = vs1.e;
        us1.getClass();
        return us1;
    }

    public final rm getAnnotations() {
        return me6.x;
    }

    public final boolean j() {
        return false;
    }

    public final Collection l() {
        return g42.w;
    }

    public final boolean m() {
        return false;
    }

    public final wo7 n() {
        return this.E;
    }

    public final fl4 o() {
        return fl4.x;
    }

    public final ji4 o0(ax3 ax3) {
        return ii4.b;
    }

    public final boolean p() {
        return this.C;
    }

    public final wp0 p0() {
        return null;
    }

    public final boolean s0() {
        return false;
    }

    public final String toString() {
        return "class " + getName() + " (not found)";
    }

    public final List u0() {
        return this.D;
    }

    public final iq0 v() {
        return iq0.w;
    }

    public final y18 v0() {
        return null;
    }

    public final boolean w0() {
        return false;
    }

    public final boolean x0() {
        return false;
    }

    public final boolean y0() {
        return false;
    }

    public final boolean z0() {
        return false;
    }
}
