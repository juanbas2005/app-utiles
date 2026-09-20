package defpackage;

import cu.lestebang.utiletecsa.R;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: u26  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class u26 implements hs2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Long x;
    public final /* synthetic */ SimpleDateFormat y;

    public /* synthetic */ u26(Long l, SimpleDateFormat simpleDateFormat, int i) {
        this.w = i;
        this.x = l;
        this.y = simpleDateFormat;
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        int i = this.w;
        vs7 vs7 = vs7.a;
        String str = null;
        SimpleDateFormat simpleDateFormat = this.y;
        Long l = this.x;
        switch (i) {
            case b85.b:
                yt2 yt2 = (yt2) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((fa6) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (yt2.V(intValue & 1, z)) {
                    if (l != null) {
                        str = simpleDateFormat.format(new Date(l.longValue()));
                    }
                    if (str == null) {
                        str = hl6.l(yt2, 1631227595, R.string.button_start_date, yt2, false);
                    } else {
                        yt2.e0(1631225363);
                        yt2.r(false);
                    }
                    yt2 yt22 = yt2;
                    yf7.b(str, (ml4) null, 0, ya5.k(13), am2.B, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt22, 1597440, 0, 262062);
                } else {
                    yt2.Y();
                }
                return vs7;
            default:
                yt2 yt23 = (yt2) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((fa6) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt23.V(intValue2 & 1, z2)) {
                    if (l != null) {
                        str = simpleDateFormat.format(new Date(l.longValue()));
                    }
                    if (str == null) {
                        str = hl6.l(yt23, 216493682, R.string.button_end_date, yt23, false);
                    } else {
                        yt23.e0(216491512);
                        yt23.r(false);
                    }
                    yt2 yt24 = yt23;
                    yf7.b(str, (ml4) null, 0, ya5.k(13), am2.B, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt24, 1597440, 0, 262062);
                } else {
                    yt23.Y();
                }
                return vs7;
        }
    }
}
