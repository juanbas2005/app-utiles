package defpackage;

import java.util.Collection;
import java.util.List;

/* renamed from: vv2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class vv2 extends ki4 {
    public static final /* synthetic */ yr3[] d = {new gr5(vv2.class, "allDescriptors", "getAllDescriptors()Ljava/util/List;", 0)};
    public final j0 b;
    public final ib4 c;

    /* JADX WARNING: type inference failed for: r0v1, types: [ib4, hb4] */
    public vv2(kb4 kb4, j0 j0Var) {
        kb4.getClass();
        this.b = j0Var;
        this.c = new hb4(kb4, new k3(22, this));
    }

    public final Collection a(is1 is1, vr2 vr2) {
        is1.getClass();
        if (!is1.a(is1.n.b)) {
            return a42.w;
        }
        return (List) p25.q(this.c, d[0]);
    }

    public final Collection b(uq4 uq4, oz4 oz4) {
        uq4.getClass();
        List list = (List) p25.q(this.c, d[0]);
        if (list.isEmpty()) {
            return a42.w;
        }
        vv6 vv6 = new vv6();
        for (Object next : list) {
            if ((next instanceof au6) && sg3.e(((au6) next).getName(), uq4)) {
                vv6.add(next);
            }
        }
        return vv6;
    }

    public final Collection f(uq4 uq4, oz4 oz4) {
        uq4.getClass();
        List list = (List) p25.q(this.c, d[0]);
        if (list.isEmpty()) {
            return a42.w;
        }
        vv6 vv6 = new vv6();
        for (Object next : list) {
            if ((next instanceof cr5) && sg3.e(((cr5) next).getName(), uq4)) {
                vv6.add(next);
            }
        }
        return vv6;
    }

    public abstract List h();
}
