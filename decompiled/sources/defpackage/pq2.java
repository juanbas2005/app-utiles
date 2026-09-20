package defpackage;

import java.util.ArrayList;

/* renamed from: pq2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pq2 implements oq2 {
    public final int a;
    public final /* synthetic */ rq2 b;

    public pq2(rq2 rq2, int i) {
        this.b = rq2;
        this.a = i;
    }

    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        rq2 rq2 = this.b;
        bq2 bq2 = rq2.z;
        int i = this.a;
        if (bq2 == null || i >= 0 || !bq2.m().U(-1, 0)) {
            return rq2.V(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}
