package defpackage;

import cu.lestebang.utiletecsa.R;

/* renamed from: po2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class po2 implements gs2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ en2 x;

    public /* synthetic */ po2(en2 en2, int i) {
        this.w = i;
        this.x = en2;
    }

    public final Object H(Object obj, Object obj2) {
        int i;
        int i2 = this.w;
        vs7 vs7 = vs7.a;
        boolean z = false;
        en2 en2 = this.x;
        switch (i2) {
            case b85.b:
                yt2 yt2 = (yt2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                }
                if (yt2.V(intValue & 1, z)) {
                    if (en2 == null) {
                        i = R.string.forum_add;
                    } else {
                        i = R.string.forum_edit;
                    }
                    yf7.b(l55.u(i, yt2), (ml4) null, r16.P(), 0, am2.B, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt2, 1572864, 0, 262074);
                } else {
                    yt2.Y();
                }
                return vs7;
            default:
                yt2 yt22 = (yt2) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                }
                if (yt22.V(intValue2 & 1, z)) {
                    yf7.b(l55.v(R.string.forum_delete_message, new Object[]{en2.c}, yt22), (ml4) null, r16.L(), ya5.k(14), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt22, 24576, 0, 262122);
                } else {
                    yt22.Y();
                }
                return vs7;
        }
    }
}
