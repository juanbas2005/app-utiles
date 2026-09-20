package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: vt1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vt1 extends d2 {
    public final z00 G;
    public final gt5 H;
    public final xs1 I;

    /* JADX WARNING: Illegal instructions before constructor call */
    public vt1(z00 z00, gt5 gt5, int i) {
        super(r2, r3, r4, r5, r0, gt5.B, i, pe2.O);
        k28 k28;
        kb4 kb4 = ((ws1) z00.a).a;
        vj1 vj1 = (vj1) z00.c;
        qm qmVar = me6.x;
        uq4 P = t49.P((vq4) z00.b, gt5.A);
        ft5 ft5 = gt5.C;
        ft5.getClass();
        int ordinal = ft5.ordinal();
        if (ordinal == 0) {
            k28 = k28.z;
        } else if (ordinal == 1) {
            k28 = k28.A;
        } else if (ordinal == 2) {
            k28 = k28.y;
        } else {
            h.c();
            throw null;
        }
        this.G = z00;
        this.H = gt5;
        this.I = new xs1(kb4, new k3(19, this));
    }

    public final List g1() {
        z00 z00 = this.G;
        List<bt5> G2 = p25.G(this.H, (wv1) z00.d);
        if (G2.isEmpty()) {
            return sg3.D(ts1.e(this).n());
        }
        bk7 bk7 = (bk7) z00.h;
        ArrayList arrayList = new ArrayList(et0.e0(G2, 10));
        for (bt5 g : G2) {
            arrayList.add(bk7.g(g));
        }
        return arrayList;
    }

    public final rm getAnnotations() {
        return this.I;
    }
}
