package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: gt1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gt1 extends j0 implements vj1 {
    public final tr5 A;
    public final n80 B;
    public final sy6 C;
    public final gq0 D;
    public final fl4 E;
    public final us1 F;
    public final iq0 G;
    public final z00 H;
    public final ki4 I;
    public final ft1 J;
    public final tg6 K;
    public final am6 L;
    public final vj1 M;
    public final hb4 N;
    public final ib4 O;
    public final hb4 P;
    public final qt5 Q;
    public final rm R;

    /* JADX WARNING: type inference failed for: r3v6, types: [ib4, hb4] */
    /* JADX WARNING: Illegal instructions before constructor call */
    public gt1(z00 z00, tr5 tr5, vq4 vq4, n80 n80, sy6 sy6) {
        super(((ws1) r0.a).a, t49.J(r3, r9.A).f());
        int i;
        iq0 iq0;
        ki4 ki4;
        am6 am6;
        gt1 gt1;
        qt5 qt5;
        sy6 sy62;
        wv1 wv1;
        vq4 vq42;
        tr5 tr52;
        rm rmVar;
        boolean z;
        z00 z002 = z00;
        tr5 tr53 = tr5;
        vq4 vq43 = vq4;
        z002.getClass();
        tr53.getClass();
        vq43.getClass();
        sy6.getClass();
        this.A = tr53;
        n80 n802 = n80;
        this.B = n802;
        sy6 sy63 = sy6;
        this.C = sy63;
        this.D = t49.J(vq43, tr53.A);
        this.E = kw5.l((ls5) wg2.e.e(tr53.z));
        this.F = ub5.i((pt5) wg2.d.e(tr53.z));
        sr5 sr5 = (sr5) wg2.f.e(tr53.z);
        if (sr5 == null) {
            i = -1;
        } else {
            i = wt5.b[sr5.ordinal()];
        }
        iq0 iq02 = iq0.y;
        iq0 iq03 = iq0.w;
        switch (i) {
            case 2:
                iq03 = iq0.x;
                break;
            case 3:
                iq0 = iq02;
                break;
            case 4:
                iq03 = iq0.z;
                break;
            case 5:
                iq03 = iq0.A;
                break;
            case 6:
            case 7:
                iq03 = iq0.B;
                break;
        }
        iq0 = iq03;
        this.G = iq0;
        List list = tr53.C;
        list.getClass();
        ht5 ht5 = tr53.W;
        ht5.getClass();
        wv1 wv12 = new wv1(ht5);
        i48 i48 = i48.b;
        ot5 ot5 = tr53.Y;
        ot5.getClass();
        z00 a = z002.a(this, list, vq43, wv12, h75.e(ot5), n802);
        z00 z003 = z002;
        ws1 ws1 = (ws1) a.a;
        kb4 kb4 = ws1.a;
        this.H = a;
        boolean booleanValue = wg2.m.e(tr53.z).booleanValue();
        if (iq0 == iq02) {
            if (booleanValue || sg3.e(ws1.s.x0(), Boolean.TRUE)) {
                z = true;
            } else {
                z = false;
            }
            ki4 = new v37(kb4, this, z);
        } else {
            ki4 = ii4.b;
        }
        this.I = ki4;
        this.J = new ft1(this);
        jv2 jv2 = tg6.d;
        ((lz4) ws1.q).getClass();
        o0 o0Var = new o0(1, this, et1.class, "<init>", "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lkotlin/reflect/jvm/internal/impl/types/checker/KotlinTypeRefiner;)V", 0, 0, 4);
        jv2.getClass();
        kb4.getClass();
        this.K = new tg6(this, kb4, o0Var);
        if (iq0 == iq02) {
            am6 = new am6(this);
        } else {
            am6 = null;
        }
        this.L = am6;
        vj1 vj1 = (vj1) z003.c;
        this.M = vj1;
        this.N = new hb4(kb4, new at1(this, 0));
        this.O = new hb4(kb4, new at1(this, 1));
        new hb4(kb4, new at1(this, 2));
        kb4.a(new at1(this, 3));
        this.P = new hb4(kb4, new at1(this, 4));
        vq4 vq44 = (vq4) a.b;
        wv1 wv13 = (wv1) a.d;
        if (vj1 instanceof gt1) {
            gt1 = (gt1) vj1;
        } else {
            gt1 = null;
        }
        if (gt1 != null) {
            qt5 = gt1.Q;
            vq42 = vq44;
            wv1 = wv13;
            sy62 = sy63;
            tr52 = tr5;
        } else {
            qt5 = null;
            tr52 = tr5;
            vq42 = vq44;
            wv1 = wv13;
            sy62 = sy63;
        }
        this.Q = new qt5(tr52, vq42, wv1, sy62, qt5);
        if (!wg2.c.e(tr52.z).booleanValue()) {
            rmVar = me6.x;
        } else {
            rmVar = new g05(kb4, new at1(this, 5));
        }
        this.R = rmVar;
    }

    public final et1 C0() {
        ((lz4) ((ws1) this.H.a).q).getClass();
        tg6 tg6 = this.K;
        tg6.getClass();
        j0 j0Var = tg6.a;
        int i = ts1.a;
        rs1.c(j0Var).getClass();
        return (et1) ((ji4) p25.q(tg6.c, tg6.e[0]));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: cr5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: cr5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: cr5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: cr5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: cr5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: cr5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: cr5} */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        if (r0 == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
        r1 = null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    public final fu6 D0(uq4 uq4) {
        Iterator it = C0().f(uq4, oz4.C).iterator();
        vw3 vw3 = null;
        boolean z = false;
        cr5 cr5 = null;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                cr5 cr52 = next;
                if (cr52.b0() == null && cr52.h0().isEmpty()) {
                    if (z) {
                        break;
                    }
                    z = true;
                    cr5 = next;
                }
            }
        }
        cr5 cr53 = cr5;
        if (cr53 != null) {
            vw3 = cr53.b();
        }
        return (fu6) vw3;
    }

    public final boolean H() {
        return wg2.j.e(this.A.z).booleanValue();
    }

    public final ji4 L() {
        return this.I;
    }

    public final sy6 e() {
        return this.C;
    }

    public final us1 f() {
        return this.F;
    }

    public final rm getAnnotations() {
        return this.R;
    }

    public final boolean j() {
        if (!wg2.k.e(this.A.z).booleanValue()) {
            return false;
        }
        n80 n80 = this.B;
        int i = n80.b;
        if (i >= 1) {
            if (i > 1) {
                return false;
            }
            int i2 = n80.c;
            if (i2 >= 4 && (i2 > 4 || n80.d > 1)) {
                return false;
            }
        }
        return true;
    }

    public final Collection l() {
        return (Collection) this.O.b();
    }

    public final boolean m() {
        return wg2.i.e(this.A.z).booleanValue();
    }

    public final wo7 n() {
        return this.J;
    }

    public final fl4 o() {
        return this.E;
    }

    public final ji4 o0(ax3 ax3) {
        tg6 tg6 = this.K;
        j0 j0Var = tg6.a;
        int i = ts1.a;
        rs1.c(j0Var).getClass();
        return (ji4) p25.q(tg6.c, tg6.e[0]);
    }

    public final boolean p() {
        return wg2.g.e(this.A.z).booleanValue();
    }

    public final wp0 p0() {
        return (wp0) this.N.b();
    }

    public final vj1 r() {
        return this.M;
    }

    public final boolean s0() {
        return false;
    }

    public final List t() {
        z00 z00 = this.H;
        List<bt5> h = p25.h(this.A, (wv1) z00.d);
        ArrayList arrayList = new ArrayList(et0.e0(h, 10));
        for (bt5 g : h) {
            arrayList.add(new qz3(Q(), new v51((ql4) this, ((bk7) z00.h).g(g), (uq4) null), me6.x));
        }
        return arrayList;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("deserialized ");
        if (H()) {
            str = "expect ";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append("class ");
        sb.append(getName());
        return sb.toString();
    }

    public final List u0() {
        return ((bk7) this.H.h).b();
    }

    public final iq0 v() {
        return this.G;
    }

    public final y18 v0() {
        return (y18) this.P.b();
    }

    public final boolean w0() {
        if (wg2.f.e(this.A.z) == sr5.B) {
            return true;
        }
        return false;
    }

    public final boolean x0() {
        return wg2.h.e(this.A.z).booleanValue();
    }

    public final boolean y0() {
        return wg2.l.e(this.A.z).booleanValue();
    }

    public final boolean z0() {
        if (!wg2.k.e(this.A.z).booleanValue() || !this.B.a(1, 4, 2)) {
            return false;
        }
        return true;
    }
}
