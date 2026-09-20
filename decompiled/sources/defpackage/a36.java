package defpackage;

import cu.lestebang.utiletecsa.R;

/* renamed from: a36  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class a36 implements is2 {
    public final /* synthetic */ gs2 A;
    public final /* synthetic */ q26 w;
    public final /* synthetic */ xa7 x;
    public final /* synthetic */ vr2 y;
    public final /* synthetic */ gs2 z;

    public /* synthetic */ a36(q26 q26, xa7 xa7, vr2 vr2, gs2 gs2, gs2 gs22) {
        this.w = q26;
        this.x = xa7;
        this.y = vr2;
        this.z = gs2;
        this.A = gs22;
    }

    public final Object C(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z2;
        int i;
        int intValue = ((Integer) obj2).intValue();
        yt2 yt2 = (yt2) obj3;
        int intValue2 = ((Integer) obj4).intValue();
        ((eb5) obj).getClass();
        if ((intValue2 & 48) == 0) {
            if (yt2.e(intValue)) {
                i = 32;
            } else {
                i = 16;
            }
            intValue2 |= i;
        }
        if ((intValue2 & 145) != 144) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt2.V(intValue2 & 1, z2)) {
            q26 q26 = this.w;
            xa7 xa7 = this.x;
            vr2 vr2 = this.y;
            d63 d63 = ay0.a;
            if (intValue == 0) {
                yt2.e0(2069962670);
                if (q26.o) {
                    yt2.e0(-255644441);
                    d36.d(q26.a, xa7, yt2, 0);
                    yt2.r(false);
                } else {
                    yt2.e0(-255558075);
                    String u = l55.u(R.string.body_permission_calls, yt2);
                    boolean g = yt2.g(vr2);
                    Object Q = yt2.Q();
                    if (g || Q == d63) {
                        Q = new zg1(15, vr2);
                        yt2.o0(Q);
                    }
                    d36.g(u, (sr2) Q, yt2, 0);
                    yt2.r(false);
                }
                yt2.r(false);
            } else if (intValue == 1) {
                yt2.e0(2069974604);
                if (q26.p) {
                    yt2.e0(-255278207);
                    d36.f(q26.b, xa7, yt2, 0);
                    yt2.r(false);
                } else {
                    yt2.e0(-255186199);
                    String u2 = l55.u(R.string.body_permission_sms, yt2);
                    boolean g2 = yt2.g(vr2);
                    Object Q2 = yt2.Q();
                    if (g2 || Q2 == d63) {
                        Q2 = new zg1(16, vr2);
                        yt2.o0(Q2);
                    }
                    d36.g(u2, (sr2) Q2, yt2, 0);
                    yt2.r(false);
                }
                yt2.r(false);
            } else if (intValue == 2) {
                yt2.e0(2069986183);
                d36.m(q26, this.z, yt2, 0);
                yt2.r(false);
            } else if (intValue != 3) {
                yt2.e0(-254147885);
                yt2.r(false);
            } else {
                yt2.e0(2069989329);
                if (q26.p) {
                    yt2.e0(-254821732);
                    d36.s(q26.c, q26.d, q26.e, q26.f, q26.g, this.A, yt2, 0);
                    yt2.r(false);
                } else {
                    yt2.e0(-254386647);
                    String u3 = l55.u(R.string.body_permission_sms, yt2);
                    boolean g3 = yt2.g(vr2);
                    Object Q3 = yt2.Q();
                    if (g3 || Q3 == d63) {
                        Q3 = new zg1(17, vr2);
                        yt2.o0(Q3);
                    }
                    d36.g(u3, (sr2) Q3, yt2, 0);
                    yt2.r(false);
                }
                yt2.r(false);
            }
        } else {
            yt2.Y();
        }
        return vs7.a;
    }
}
