package defpackage;

import java.util.List;

/* renamed from: sn5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sn5 {
    public final List a;
    public final List[] b;
    public int c;
    public int d;
    public boolean e;
    public final /* synthetic */ tn5 f;

    public sn5(tn5 tn5, List list) {
        this.f = tn5;
        this.a = list;
        this.b = new List[list.size()];
        if (list.isEmpty()) {
            bc3.a("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
