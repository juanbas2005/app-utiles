package defpackage;

import java.util.Iterator;
import java.util.List;

/* renamed from: xs1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class xs1 implements rm {
    public static final /* synthetic */ yr3[] x = {new gr5(xs1.class, "annotations", "getAnnotations()Ljava/util/List;", 0)};
    public final ib4 w;

    /* JADX WARNING: type inference failed for: r0v0, types: [ib4, hb4] */
    public xs1(kb4 kb4, sr2 sr2) {
        kb4.getClass();
        this.w = new hb4(kb4, sr2);
    }

    public final /* bridge */ boolean i(up2 up2) {
        return gw8.y(this, up2);
    }

    public boolean isEmpty() {
        return ((List) p25.q(this.w, x[0])).isEmpty();
    }

    public final Iterator iterator() {
        return ((List) p25.q(this.w, x[0])).iterator();
    }

    public final /* bridge */ fm m(up2 up2) {
        return gw8.u(this, up2);
    }
}
