package defpackage;

import cu.lestebang.utiletecsa.R;

/* renamed from: l20  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class l20 implements gs2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ vr2 x;

    public /* synthetic */ l20(int i, vr2 vr2) {
        this.w = i;
        this.x = vr2;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z;
        Object obj3 = obj;
        int i = this.w;
        vs7 vs7 = vs7.a;
        vr2 vr2 = this.x;
        switch (i) {
            case b85.b:
                yt2 yt2 = (yt2) obj3;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (yt2.V(intValue & 1, z)) {
                    au0 a = zt0.a(wr.c, xb4.K, yt2, 0);
                    int hashCode = Long.hashCode(yt2.T);
                    vf5 m = yt2.m();
                    jl4 jl4 = jl4.w;
                    ml4 E = gw8.E(yt2, jl4);
                    ux0.d.getClass();
                    vy0 vy0 = tx0.b;
                    yt2.i0();
                    if (yt2.S) {
                        yt2.l(vy0);
                    } else {
                        yt2.r0();
                    }
                    g75.Q(tx0.f, yt2, a);
                    g75.Q(tx0.e, yt2, m);
                    g75.Q(tx0.g, yt2, Integer.valueOf(hashCode));
                    g75.O(yt2, tx0.h);
                    g75.Q(tx0.d, yt2, E);
                    jl4 jl42 = jl4;
                    yt2 yt22 = yt2;
                    yf7.b(l55.u(R.string.donate_dialog_message, yt2), (ml4) null, b30.n(), ya5.k(14), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, ya5.k(20), 0, false, 0, 0, (tg7) null, yt22, 24576, 48, 260074);
                    yt2 yt23 = yt22;
                    b30.d(0, vr2, yt23, pb4.j(jl42, 16.0f, yt23, R.string.donate_card_label, yt23), l55.u(R.string.donate_card_value, yt23));
                    b30.d(0, vr2, yt23, pb4.j(jl42, 12.0f, yt23, R.string.donate_phone_label, yt23), l55.u(R.string.donate_phone_value, yt23));
                    yt23.r(true);
                } else {
                    yt2.Y();
                }
                return vs7;
            case 1:
                qk5 qk5 = (qk5) obj3;
                qk5.getClass();
                qk5.a();
                vr2.y(Float.valueOf(Float.intBitsToFloat((int) (((l35) obj2).a & 4294967295L))));
                return vs7;
            case 2:
                ((Integer) obj2).getClass();
                return (px2) vr2.y((i04) obj3);
            default:
                vs7 vs72 = (vs7) obj2;
                vr2.y(obj3);
                return vs7;
        }
    }
}
