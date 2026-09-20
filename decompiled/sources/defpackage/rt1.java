package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: rt1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rt1 extends qt1 {
    public final x95 g;
    public final ns5 h;
    public final String i;
    public final up2 j;

    /* JADX WARNING: Illegal instructions before constructor call */
    public rt1(x95 x95, ns5 ns5, vq4 vq4, n80 n80, wo3 wo3, ws1 ws1, String str, sr2 sr2) {
        super(r1, r2, r3, r4, sr2);
        ns5.getClass();
        vq4.getClass();
        n80.getClass();
        ws1.getClass();
        ht5 ht5 = ns5.C;
        ht5.getClass();
        wv1 wv1 = new wv1(ht5);
        i48 i48 = i48.b;
        ot5 ot5 = ns5.D;
        ot5.getClass();
        vq4 vq42 = vq4;
        ws1 ws12 = ws1;
        z00 z00 = new z00(ws12, vq42, x95, wv1, h75.e(ot5), n80, wo3, (bk7) null, a42.w);
        List list = ns5.z;
        list.getClass();
        List list2 = ns5.A;
        list2.getClass();
        List list3 = ns5.B;
        list3.getClass();
        z00 z002 = z00;
        this.g = x95;
        this.h = ns5;
        this.i = str;
        this.j = ((y95) x95).A;
    }

    public final Collection a(is1 is1, vr2 vr2) {
        is1.getClass();
        List i2 = i(is1, vr2);
        Iterable<bq0> iterable = ((ws1) this.b.a).k;
        ArrayList arrayList = new ArrayList();
        for (bq0 b : iterable) {
            it0.h0(arrayList, b.b(this.j));
        }
        return dt0.M0(i2, arrayList);
    }

    public final vq0 e(uq4 uq4, oz4 oz4) {
        uq4.getClass();
        oz4.getClass();
        c35.o(((ws1) this.b.a).i, oz4, this.g, uq4);
        return super.e(uq4, oz4);
    }

    public final gq0 l(uq4 uq4) {
        uq4.getClass();
        return new gq0(this.j, uq4);
    }

    public final Set n() {
        return g42.w;
    }

    public final Set o() {
        return g42.w;
    }

    public final Set p() {
        return g42.w;
    }

    public final boolean q(uq4 uq4) {
        uq4.getClass();
        if (m().contains(uq4)) {
            return true;
        }
        Iterable<bq0> iterable = ((ws1) this.b.a).k;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (bq0 c : iterable) {
            if (c.c(this.j, uq4)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return this.i;
    }

    public final void h(ArrayList arrayList, vr2 vr2) {
    }
}
