package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: h28  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class h28 extends j28 implements pc5 {
    public final int B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final vw3 F;
    public final h28 G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h28(pi0 pi0, h28 h28, int i, rm rmVar, uq4 uq4, vw3 vw3, boolean z, boolean z2, boolean z3, vw3 vw32, sy6 sy6) {
        super(pi0, rmVar, uq4, vw3, sy6);
        pi0.getClass();
        rmVar.getClass();
        uq4.getClass();
        vw3.getClass();
        sy6.getClass();
        this.B = i;
        this.C = z;
        this.D = z2;
        this.E = z3;
        this.F = vw32;
        this.G = h28 == null ? this : h28;
    }

    public final /* bridge */ /* synthetic */ e21 O() {
        return null;
    }

    public final Object P(zj1 zj1, Object obj) {
        return zj1.e(this, obj);
    }

    public final boolean a0() {
        return false;
    }

    public final us1 f() {
        us1 us1 = vs1.f;
        us1.getClass();
        return us1;
    }

    public h28 f1(at2 at2, uq4 uq4, int i) {
        rm annotations = getAnnotations();
        annotations.getClass();
        vw3 b = b();
        b.getClass();
        return new h28(at2, (h28) null, i, annotations, uq4, b, g1(), this.D, this.E, this.F, sy6.j);
    }

    public final boolean g1() {
        if (!this.C || ((ri0) r()).u() == 2) {
            return false;
        }
        return true;
    }

    public final xj1 h(dq7 dq7) {
        dq7.getClass();
        if (dq7.a.e()) {
            return this;
        }
        ku4.p();
        return null;
    }

    /* renamed from: h1 */
    public final pi0 r() {
        vj1 r = super.r();
        r.getClass();
        return (pi0) r;
    }

    /* renamed from: i1 */
    public final h28 e1() {
        h28 h28 = this.G;
        if (h28 == this) {
            return this;
        }
        return h28.e1();
    }

    public final Collection s() {
        Collection s = r().s();
        s.getClass();
        Iterable<pi0> iterable = s;
        ArrayList arrayList = new ArrayList(et0.e0(iterable, 10));
        for (pi0 S : iterable) {
            arrayList.add((h28) S.S().get(this.B));
        }
        return arrayList;
    }
}
