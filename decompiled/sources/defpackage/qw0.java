package defpackage;

import android.content.Context;
import cu.lestebang.utiletecsa.R;

/* renamed from: qw0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class qw0 implements is2 {
    public final /* synthetic */ int w;

    public /* synthetic */ qw0(int i) {
        this.w = i;
    }

    public final Object C(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2 = this.w;
        vs7 vs7 = vs7.a;
        boolean z = false;
        switch (i2) {
            case b85.b:
                yt2 yt2 = (yt2) obj3;
                int intValue = ((Integer) obj4).intValue();
                ((tx5) obj).getClass();
                ((kt) obj2).getClass();
                if ((intValue & 129) != 128) {
                    z = true;
                }
                if (yt2.V(intValue & 1, z)) {
                    rq5.a(yu6.l(jl4.w, 24.0f), r16.K(), 0.0f, 0, 0, 0.0f, yt2, 6, 60);
                } else {
                    yt2.Y();
                }
                return vs7;
            case 1:
                yt2 yt22 = (yt2) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                ((tx5) obj).getClass();
                ((jt) obj2).getClass();
                if ((intValue2 & 129) != 128) {
                    z = true;
                }
                if (yt22.V(intValue2 & 1, z)) {
                    yf7.b(l55.u(R.string.forum_image_load_error, yt22), (ml4) null, r16.L(), ya5.k(12), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt22, 24576, 0, 262122);
                } else {
                    yt22.Y();
                }
                return vs7;
            case 2:
                fw0 fw0 = rg3.b;
                yz3 yz3 = (yz3) obj;
                ((Integer) obj2).getClass();
                yt2 yt23 = (yt2) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                if ((intValue3 & 6) == 0) {
                    if (yt23.g(yz3)) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                    intValue3 |= i;
                }
                if ((intValue3 & 131) != 130) {
                    z = true;
                }
                if (yt23.V(intValue3 & 1, z)) {
                    fw0.u(yz3, yt23, Integer.valueOf(intValue3 & 14));
                } else {
                    yt23.Y();
                }
                return vs7;
            default:
                return new wj5((e81) obj, (Context) obj2, (hj6) obj3, (ya4) obj4);
        }
    }
}
