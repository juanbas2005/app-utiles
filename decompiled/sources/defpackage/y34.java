package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/* renamed from: y34  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class y34 implements ji4 {
    public final /* synthetic */ int b = 1;
    public final Object c;

    public y34(kb4 kb4, sr2 sr2) {
        kb4.getClass();
        this.c = new hb4(kb4, new mt1(1, sr2));
    }

    public Collection a(is1 is1, vr2 vr2) {
        switch (this.b) {
            case 1:
                is1.getClass();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object next : i(is1, vr2)) {
                    if (((vj1) next) instanceof pi0) {
                        arrayList.add(next);
                    } else {
                        arrayList2.add(next);
                    }
                }
                return dt0.M0(i95.B(arrayList, l06.V), arrayList2);
            default:
                return i(is1, vr2);
        }
    }

    public Collection b(uq4 uq4, oz4 oz4) {
        switch (this.b) {
            case 1:
                uq4.getClass();
                return i95.B(j(uq4, oz4), l06.T);
            default:
                return j(uq4, oz4);
        }
    }

    public final Set c() {
        return l().c();
    }

    public final Set d() {
        return l().d();
    }

    public final vq0 e(uq4 uq4, oz4 oz4) {
        uq4.getClass();
        oz4.getClass();
        return l().e(uq4, oz4);
    }

    public Collection f(uq4 uq4, oz4 oz4) {
        switch (this.b) {
            case 1:
                uq4.getClass();
                return i95.B(k(uq4, oz4), l06.U);
            default:
                return k(uq4, oz4);
        }
    }

    public final Set g() {
        return l().g();
    }

    public final ji4 h() {
        if (!(l() instanceof y34)) {
            return l();
        }
        ji4 l = l();
        l.getClass();
        return ((y34) l).h();
    }

    public final Collection i(is1 is1, vr2 vr2) {
        is1.getClass();
        return l().a(is1, vr2);
    }

    public final Collection j(uq4 uq4, oz4 oz4) {
        uq4.getClass();
        return l().b(uq4, oz4);
    }

    public final Collection k(uq4 uq4, oz4 oz4) {
        uq4.getClass();
        return l().f(uq4, oz4);
    }

    public final ji4 l() {
        switch (this.b) {
            case b85.b:
                return (ji4) ((ib4) this.c).b();
            default:
                return (ji4) this.c;
        }
    }

    public y34(ji4 ji4) {
        this.c = ji4;
    }
}
