package defpackage;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: q14  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class q14 extends d2 {
    public final am6 G;
    public final m16 H;

    /* JADX WARNING: Illegal instructions before constructor call */
    public q14(am6 am6, m16 m16, int i, xj1 xj1) {
        super(r0.a, r3, new u04(am6, m16, false), uq4.e(m16.a.getName()), k28.y, false, i, r0.m);
        m16.getClass();
        pj3 pj3 = (pj3) am6.x;
        xj1 xj12 = xj1;
        this.G = am6;
        this.H = m16;
    }

    public final List f1(List list) {
        vw3 vw3;
        hr2 hr2;
        q14 q14;
        vw3 vw32;
        am6 am6 = this.G;
        hr2 hr22 = ((pj3) am6.x).r;
        hr22.getClass();
        ArrayList arrayList = new ArrayList(et0.e0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            vw3 vw33 = (vw3) it.next();
            l06 l06 = l06.O;
            vw33.getClass();
            if (iq7.c(vw33, l06, (wv6) null)) {
                q14 = this;
                hr2 = hr22;
                vw32 = vw33;
            } else {
                q14 = this;
                hr2 = hr22;
                vw32 = vw33;
                vw3 = hr2.r(new u72((ql) q14, false, am6, jm.TYPE_PARAMETER_BOUNDS, false), vw32, a42.w, (cp7) null, false);
                if (vw3 != null) {
                    arrayList.add(vw3);
                    this = q14;
                    hr22 = hr2;
                }
            }
            vw3 = vw32;
            arrayList.add(vw3);
            this = q14;
            hr22 = hr2;
        }
        return arrayList;
    }

    public final List g1() {
        Type type;
        Type[] bounds = this.H.a.getBounds();
        bounds.getClass();
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type a16 : bounds) {
            arrayList.add(new a16(a16));
        }
        a16 a162 = (a16) dt0.S0(arrayList);
        if (a162 != null) {
            type = a162.a;
        } else {
            type = null;
        }
        List<a16> list = arrayList;
        if (sg3.e(type, Object.class)) {
            list = a42.w;
        }
        boolean isEmpty = list.isEmpty();
        am6 am6 = this.G;
        if (isEmpty) {
            return sg3.D(kl8.n(((pj3) am6.x).o.g().e(), ((pj3) am6.x).o.g().p()));
        }
        ArrayList arrayList2 = new ArrayList(et0.e0(list, 10));
        for (a16 h0 : list) {
            arrayList2.add(((wr0) am6.A).h0(h0, sg3.b0(fq7.x, false, this, 3)));
        }
        return arrayList2;
    }
}
