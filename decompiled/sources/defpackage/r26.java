package defpackage;

import java.util.List;

/* renamed from: r26  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class r26 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ List x;
    public final /* synthetic */ xa7 y;

    public /* synthetic */ r26(List list, xa7 xa7, int i) {
        this.w = i;
        this.x = list;
        this.y = xa7;
    }

    public final Object y(Object obj) {
        int i = this.w;
        vs7 vs7 = vs7.a;
        xa7 xa7 = this.y;
        List list = this.x;
        h34 h34 = (h34) obj;
        switch (i) {
            case b85.b:
                h34.getClass();
                h34.P(list.size(), (vr2) null, new y20(7, list), new fw0(802480018, new c36(list, xa7, 0), true));
                return vs7;
            default:
                h34.getClass();
                h34.P(list.size(), (vr2) null, new y20(8, list), new fw0(802480018, new c36(list, xa7, 1), true));
                return vs7;
        }
    }
}
