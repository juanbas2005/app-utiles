package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* renamed from: st6  reason: default package */
public final class st6 implements vr2 {
    public final /* synthetic */ int w;
    public final Object x;

    public /* synthetic */ st6(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }

    public final Object y(Object obj) {
        xp7 xp7;
        Set w2;
        int i = this.w;
        vs7 vs7 = vs7.a;
        Object obj2 = this.x;
        switch (i) {
            case b85.b:
                ri0 ri0 = (ri0) obj;
                ri0.getClass();
                vw3 b = ((h28) ri0.S().get(((h28) obj2).B)).b();
                b.getClass();
                return b;
            case 1:
                float[] fArr = ((eh4) obj).a;
                dy3 dy3 = (dy3) obj2;
                if (dy3.n()) {
                    t49.I(dy3).j(dy3, fArr);
                }
                return vs7;
            case 2:
                kg5 kg5 = (kg5) obj2;
                wp7 wp7 = (wp7) obj;
                qp7 qp7 = wp7.a;
                wj3 wj3 = wp7.b;
                Set set = wj3.e;
                if (set != null && set.contains(qp7.a())) {
                    return kg5.t(wj3);
                }
                fu6 g0 = qp7.g0();
                g0.getClass();
                LinkedHashSet<qp7> linkedHashSet = new LinkedHashSet<>();
                jb5.j(g0, g0, linkedHashSet, set);
                int F = tf4.F(et0.e0(linkedHashSet, 10));
                if (F < 16) {
                    F = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(F);
                for (qp7 qp72 : linkedHashSet) {
                    if (set == null || !set.contains(qp72)) {
                        Set set2 = wj3.e;
                        if (set2 != null) {
                            w2 = wn6.p(set2, qp7);
                        } else {
                            w2 = wn6.w(qp7);
                        }
                        xp7 = ts2.k(qp72, wj3, kg5, kg5.u(qp72, wj3.a(wj3, (xj3) null, false, w2, (fu6) null, 47)));
                    } else {
                        xp7 = iq7.k(qp72, wj3);
                    }
                    linkedHashMap.put(qp72.n(), xp7);
                }
                dq7 dq7 = new dq7(new q27(1, linkedHashMap));
                List upperBounds = qp7.getUpperBounds();
                upperBounds.getClass();
                sn6 Q = kg5.Q(dq7, upperBounds, wj3);
                if (Q.w.isEmpty()) {
                    return kg5.t(wj3);
                }
                if (Q.w.E == 1) {
                    return (vw3) dt0.P0(Q);
                }
                h.q("Should only be one computed upper bound if no need to intersect all bounds");
                return null;
            case 3:
                vw3 vw3 = (vw3) obj2;
                ((sl4) obj).getClass();
                return vw3;
            case 4:
                Throwable th = (Throwable) obj;
                ((mw1) obj2).b();
                return vs7;
            case 5:
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    ((fl3) obj2).j(new CancellationException(th2.getMessage()));
                }
                return vs7;
            case 6:
                ((yx6) obj2).add(new bw8(((Integer) obj).intValue()));
                return vs7;
            default:
                ((ArrayList) obj2).get(((Number) obj).intValue());
                return null;
        }
    }
}
