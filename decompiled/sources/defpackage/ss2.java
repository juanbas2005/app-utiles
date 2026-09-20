package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: ss2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ss2 extends j0 {
    public static final gq0 H = new gq0(n27.k, uq4.e("Function"));
    public static final gq0 I = new gq0(n27.i, uq4.e("KFunction"));
    public final kb4 A;
    public final x95 B;
    public final ht2 C;
    public final int D;
    public final rs2 E = new rs2(this);
    public final vs2 F;
    public final List G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ss2(kb4 kb4, rd0 rd0, ht2 ht2, int i) {
        super(kb4, ht2.a(i));
        rd0.getClass();
        this.A = kb4;
        this.B = rd0;
        this.C = ht2;
        this.D = i;
        this.F = new vs2(kb4, this, 0);
        ArrayList arrayList = new ArrayList();
        pe3 pe3 = new pe3(1, i, 1);
        ArrayList arrayList2 = new ArrayList(et0.e0(pe3, 10));
        Iterator it = pe3.iterator();
        while (((qe3) it).y) {
            int nextInt = ((je3) it).nextInt();
            arrayList.add(rp7.i1(this, k28.z, uq4.e("P" + nextInt), arrayList.size(), this.A));
            arrayList2.add(vs7.a);
        }
        arrayList.add(rp7.i1(this, k28.A, uq4.e("R"), arrayList.size(), this.A));
        this.G = dt0.b1(arrayList);
        ht2 ht22 = this.C;
        us2.w.getClass();
        ht22.getClass();
        if (!ht22.equals(dt2.d) && !ht22.equals(gt2.d) && !ht22.equals(et2.d)) {
            ht22.equals(ft2.d);
        }
    }

    public final boolean H() {
        return false;
    }

    public final /* bridge */ /* synthetic */ ji4 L() {
        return ii4.b;
    }

    public final sy6 e() {
        return sy6.j;
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

    public final /* bridge */ /* synthetic */ Collection l() {
        return a42.w;
    }

    public final boolean m() {
        return false;
    }

    public final wo7 n() {
        return this.E;
    }

    public final fl4 o() {
        return fl4.A;
    }

    public final ji4 o0(ax3 ax3) {
        return this.F;
    }

    public final boolean p() {
        return false;
    }

    public final /* bridge */ /* synthetic */ wp0 p0() {
        return null;
    }

    public final vj1 r() {
        return this.B;
    }

    public final boolean s0() {
        return false;
    }

    public final String toString() {
        String b = getName().b();
        b.getClass();
        return b;
    }

    public final List u0() {
        return this.G;
    }

    public final iq0 v() {
        return iq0.x;
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
