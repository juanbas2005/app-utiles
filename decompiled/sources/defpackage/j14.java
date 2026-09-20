package defpackage;

import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: j14  reason: default package */
public final class j14 implements sr2 {
    public final /* synthetic */ int w;
    public final m14 x;

    public /* synthetic */ j14(m14 m14, int i) {
        this.w = i;
        this.x = m14;
    }

    public final Object b() {
        int i = this.w;
        m14 m14 = this.x;
        switch (i) {
            case b85.b:
                is1 is1 = is1.m;
                ji4.a.getClass();
                jo3 jo3 = jo3.Q;
                is1.getClass();
                List list = is1.a;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                boolean a = is1.a(is1.l);
                oz4 oz4 = oz4.z;
                if (a) {
                    for (uq4 uq4 : m14.h(is1, jo3)) {
                        jo3.y(uq4);
                        vq0 e = m14.e(uq4, oz4);
                        if (e != null) {
                            linkedHashSet.add(e);
                        }
                    }
                }
                if (is1.a(is1.i) && !list.contains(es1.a)) {
                    for (uq4 uq42 : m14.i(is1, jo3)) {
                        jo3.y(uq42);
                        linkedHashSet.addAll(m14.b(uq42, oz4));
                    }
                }
                if (is1.a(is1.j) && !list.contains(es1.a)) {
                    for (uq4 uq43 : m14.o(is1)) {
                        jo3.y(uq43);
                        linkedHashSet.addAll(m14.f(uq43, oz4));
                    }
                }
                return dt0.b1(linkedHashSet);
            case 1:
                return m14.k();
            case 2:
                return m14.i(is1.p, (jo3) null);
            case 3:
                return m14.o(is1.q);
            default:
                return m14.h(is1.o, (vr2) null);
        }
    }
}
