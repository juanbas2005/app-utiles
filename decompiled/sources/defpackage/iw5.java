package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: iw5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class iw5 extends bq7 {
    public static final wj3 c;
    public static final wj3 d;
    public final kg5 b = new kg5(new ts2(7));

    static {
        fq7 fq7 = fq7.x;
        c = wj3.a(sg3.b0(fq7, false, (q14) null, 5), xj3.y, false, (Set) null, (fu6) null, 61);
        d = wj3.a(sg3.b0(fq7, false, (q14) null, 5), xj3.x, false, (Set) null, (fu6) null, 61);
    }

    public final xp7 d(vw3 vw3) {
        return new p27(h(vw3, new wj3(fq7.x, false, false, (Set) null, 62)));
    }

    public final yb5 g(fu6 fu6, ql4 ql4, wj3 wj3) {
        if (fu6.L().getParameters().isEmpty()) {
            return new yb5(fu6, Boolean.FALSE);
        }
        if (fv3.z(fu6)) {
            xp7 xp7 = (xp7) fu6.G().get(0);
            k28 a = xp7.a();
            vw3 b2 = xp7.b();
            b2.getClass();
            return new yb5(kl8.I(fu6.J(), fu6.L(), sg3.D(new p27(h(b2, wj3), a)), fu6.Q()), Boolean.FALSE);
        } else if (gr8.N(fu6)) {
            return new yb5(z62.c(x62.J, fu6.L().toString()), Boolean.FALSE);
        } else {
            ji4 A = ql4.A(this);
            A.getClass();
            ro7 J = fu6.J();
            wo7 n = ql4.n();
            n.getClass();
            List parameters = ql4.n().getParameters();
            parameters.getClass();
            List<qp7> list = parameters;
            ArrayList arrayList = new ArrayList(et0.e0(list, 10));
            for (qp7 qp7 : list) {
                qp7.getClass();
                kg5 kg5 = this.b;
                arrayList.add(ts2.k(qp7, wj3, kg5, kg5.u(qp7, wj3)));
            }
            return new yb5(kl8.K(J, n, arrayList, fu6.Q(), A, new cs1(ql4, this, fu6, wj3)), Boolean.TRUE);
        }
    }

    public final vw3 h(vw3 vw3, wj3 wj3) {
        vq0 u = vw3.L().u();
        if (u instanceof qp7) {
            wj3.getClass();
            wj3 wj32 = wj3;
            wj3 a = wj3.a(wj32, (xj3) null, true, (Set) null, (fu6) null, 59);
            return h(this.b.u((qp7) u, a), wj32);
        } else if (u instanceof ql4) {
            vq0 u2 = mp7.n0(vw3).L().u();
            if (u2 instanceof ql4) {
                yb5 g = g(mp7.f0(vw3), (ql4) u, c);
                fu6 fu6 = (fu6) g.w;
                boolean booleanValue = ((Boolean) g.x).booleanValue();
                yb5 g2 = g(mp7.n0(vw3), (ql4) u2, d);
                fu6 fu62 = (fu6) g2.w;
                boolean booleanValue2 = ((Boolean) g2.x).booleanValue();
                if (booleanValue || booleanValue2) {
                    return new jw5(fu6, fu62);
                }
                return kl8.n(fu6, fu62);
            }
            throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + u2 + "\" while for lower it's \"" + u + '\"').toString());
        } else {
            ta1.l("Unexpected declaration kind: ", u);
            return null;
        }
    }
}
