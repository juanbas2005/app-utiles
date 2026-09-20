package defpackage;

import java.util.List;

/* renamed from: i62  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class i62 implements qa2 {
    public final int a() {
        return 2;
    }

    public final int b(pi0 pi0, pi0 pi02, ql4 ql4) {
        int i;
        vw3 vw3;
        pi0.getClass();
        pi02.getClass();
        if (pi02 instanceof lj3) {
            lj3 lj3 = (lj3) pi02;
            if (lj3.getTypeParameters().isEmpty()) {
                g95 i2 = h95.i(pi0, pi02);
                if (i2 != null) {
                    i = i2.b();
                } else {
                    i = 0;
                }
                if (i == 0) {
                    List S = lj3.S();
                    S.getClass();
                    wl7 wl7 = new wl7(new ts(1, S), v61.Q);
                    vw3 vw32 = lj3.C;
                    vw32.getClass();
                    xg2 Q = cl6.Q(qs.E0(new al6[]{wl7, new ts(3, vw32)}));
                    qz3 qz3 = lj3.E;
                    if (qz3 != null) {
                        vw3 = qz3.b();
                    } else {
                        vw3 = null;
                    }
                    zd2 zd2 = new zd2(cl6.Q(qs.E0(new al6[]{Q, new ts(1, sg3.F(vw3))})));
                    while (true) {
                        if (zd2.hasNext()) {
                            vw3 vw33 = (vw3) zd2.next();
                            if (!vw33.G().isEmpty() && !(vw33.n0() instanceof jw5)) {
                                break;
                            }
                        } else {
                            pi0 pi03 = (pi0) pi0.h(new dq7(new iw5()));
                            if (pi03 != null) {
                                if (pi03 instanceof au6) {
                                    au6 au6 = (au6) pi03;
                                    if (!au6.getTypeParameters().isEmpty()) {
                                        pi03 = au6.r0().B().build();
                                        pi03.getClass();
                                    }
                                }
                                int b = h95.c.n(pi03, pi02, false).b();
                                if (b == 0) {
                                    throw null;
                                } else if (h62.a[b81.B(b)] == 1) {
                                    return 1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return 3;
    }
}
