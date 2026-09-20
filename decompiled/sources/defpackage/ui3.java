package defpackage;

import java.util.ArrayList;

/* renamed from: ui3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ui3 implements qa2 {
    public final int a() {
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009e, code lost:
        if (r5.equals(defpackage.dh4.g(r8, 2)) != false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
        if (defpackage.mz6.j.contains(r1) == false) goto L_0x00a0;
     */
    public final int b(pi0 pi0, pi0 pi02, ql4 ql4) {
        xs2 xs2;
        pi0.getClass();
        pi02.getClass();
        if ((pi0 instanceof ri0) && (pi02 instanceof xs2) && !fv3.A(pi02)) {
            int i = vd0.l;
            xs2 xs22 = (xs2) pi02;
            wj1 wj1 = (wj1) xs22;
            uq4 name = wj1.getName();
            name.getClass();
            if (!mz6.e.contains(name)) {
                ArrayList arrayList = mz6.a;
                uq4 name2 = wj1.getName();
                name2.getClass();
            }
            ri0 i2 = n85.i((ri0) pi0);
            boolean z = pi0 instanceof xs2;
            if (z) {
                xs2 = (xs2) pi0;
            } else {
                xs2 = null;
            }
            if ((xs2 != null && xs22.l0() == xs2.l0()) || (i2 != null && xs22.l0())) {
                if ((ql4 instanceof w04) && xs22.V() == null && i2 != null && !n85.j(ql4, i2)) {
                    if ((i2 instanceof xs2) && z && vd0.a((xs2) i2) != null) {
                        String g = dh4.g(xs22, 2);
                        xs2 a = ((xs2) pi0).a();
                        a.getClass();
                    }
                }
            }
            return 2;
        }
        if (h03.j(pi0, pi02)) {
            return 2;
        }
        return 3;
    }
}
