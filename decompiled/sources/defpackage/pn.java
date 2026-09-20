package defpackage;

import java.util.List;

/* renamed from: pn  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class pn implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ a37 x;

    public /* synthetic */ pn(int i, a37 a37) {
        this.w = i;
        this.x = a37;
    }

    public final Object y(Object obj) {
        int i = this.w;
        vs7 vs7 = vs7.a;
        a37 a37 = this.x;
        switch (i) {
            case b85.b:
                hz1 hz1 = (hz1) obj;
                long j = ((jt0) a37.getValue()).a;
                if (!jt0.c(j, jt0.g)) {
                    hz1.f0(hz1, j, 0, 0, 0.0f, 126);
                }
                return vs7;
            case 1:
                h34 h34 = (h34) obj;
                h34.getClass();
                List list = ((b41) a37.getValue()).a;
                h34.P(list.size(), (vr2) null, new y20(1, list), new fw0(802480018, new z20(1, list), true));
                List list2 = ((b41) a37.getValue()).b;
                h34.P(list2.size(), (vr2) null, new y20(2, list2), new fw0(802480018, new z20(2, list2), true));
                return vs7;
            case 2:
                ((l76) obj).c(((Number) a37.getValue()).floatValue());
                return vs7;
            case 3:
                ((l76) obj).c(((Number) a37.getValue()).floatValue());
                return vs7;
            default:
                return new oe3(((long) ((tp1) obj).r0(((lx1) a37.getValue()).w)) << 32);
        }
    }
}
