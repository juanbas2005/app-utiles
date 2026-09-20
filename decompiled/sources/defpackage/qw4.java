package defpackage;

import java.util.List;

/* renamed from: qw4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class qw4 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ List x;

    public /* synthetic */ qw4(int i, List list) {
        this.w = i;
        this.x = list;
    }

    public final Object y(Object obj) {
        int i = this.w;
        vs7 vs7 = vs7.a;
        List list = this.x;
        switch (i) {
            case b85.b:
                bl3 bl3 = (bl3) obj;
                bl3.getClass();
                list.add(bl3);
                return vs7;
            default:
                h34 h34 = (h34) obj;
                h34.getClass();
                h34.P(list.size(), (vr2) null, new y20(9, list), new fw0(802480018, new z20(3, list), true));
                return vs7;
        }
    }
}
