package defpackage;

import cu.lestebang.utiletecsa.R;

/* renamed from: ji  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ji implements hs2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ Object y;

    public /* synthetic */ ji(int i, Object obj, boolean z) {
        this.w = i;
        this.y = obj;
        this.x = z;
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        boolean z;
        String i;
        float f;
        int i2 = this.w;
        boolean z2 = this.x;
        Object obj4 = this.y;
        switch (i2) {
            case b85.b:
                sr2 sr2 = (sr2) obj4;
                ml4 ml4 = (ml4) obj;
                yt2 yt2 = (yt2) obj2;
                ((Integer) obj3).getClass();
                yt2.e0(-196777734);
                long j = ((ng7) yt2.k(og7.a)).a;
                boolean f2 = yt2.f(j) | yt2.g(sr2) | yt2.h(z2);
                Object Q = yt2.Q();
                if (f2 || Q == ay0.a) {
                    Q = new ki(j, sr2, z2);
                    yt2.o0(Q);
                }
                ml4 y2 = pv8.y(ml4, (vr2) Q);
                yt2.r(false);
                return y2;
            case 1:
                fw0 fw0 = (fw0) obj4;
                fa6 fa6 = (fa6) obj;
                yt2 yt22 = (yt2) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (yt22.V(intValue & 1, z)) {
                    fw0.H(yt22, 0);
                    float f3 = yd0.f;
                    jl4 jl4 = jl4.w;
                    k75.a(yt22, yu6.l(jl4, f3));
                    x83 q = su0.q();
                    if (z2) {
                        yt22.e0(1509384391);
                        i = h75.i(R.string.m3c_date_picker_switch_to_day_selection, yt22);
                        yt22.r(false);
                    } else {
                        yt22.e0(1509478662);
                        i = h75.i(R.string.m3c_date_picker_switch_to_year_selection, yt22);
                        yt22.r(false);
                    }
                    String str = i;
                    if (z2) {
                        f = 180.0f;
                    } else {
                        f = 0.0f;
                    }
                    d83.a(q, str, ub5.r(jl4, f), 0, yt22, 0, 8);
                } else {
                    yt22.Y();
                }
                return vs7.a;
            default:
                eh5 y3 = ((gh4) obj2).y(((k31) obj3).a);
                return ((oh4) obj).d0(y3.w, y3.x, b42.w, new pu1((Object) (a37) obj4, z2, (Object) y3, 2));
        }
    }
}
