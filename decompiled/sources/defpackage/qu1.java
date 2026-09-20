package defpackage;

import java.util.List;

/* renamed from: qu1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class qu1 implements q54 {
    public final /* synthetic */ boolean w;
    public final /* synthetic */ List x;
    public final /* synthetic */ zs4 y;

    public /* synthetic */ qu1(boolean z, List list, zs4 zs4) {
        this.w = z;
        this.x = list;
        this.y = zs4;
    }

    public final void o(t54 t54, j54 j54) {
        boolean z = this.w;
        List list = this.x;
        zs4 zs4 = this.y;
        if (z && !list.contains(zs4)) {
            list.add(zs4);
        }
        if (j54 == j54.ON_START && !list.contains(zs4)) {
            list.add(zs4);
        }
        if (j54 == j54.ON_STOP) {
            list.remove(zs4);
        }
    }
}
