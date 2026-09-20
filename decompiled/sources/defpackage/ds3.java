package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ds3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ds3 extends cs3 implements xo7, sp7 {
    public final qp7 A;
    public volatile List B;
    public final String y;
    public final ks3 z;

    /* JADX WARNING: Illegal instructions before constructor call */
    public ds3(es3 es3, qp7 qp7) {
        this(qp7, es3, r0, r1);
        ks3 ks3;
        es3.getClass();
        String b = qp7.getName().b();
        b.getClass();
        k28 I = qp7.I();
        I.getClass();
        int ordinal = I.ordinal();
        if (ordinal == 0) {
            ks3 = ks3.w;
        } else if (ordinal == 1) {
            ks3 = ks3.x;
        } else if (ordinal == 2) {
            ks3 = ks3.y;
        } else {
            h.c();
            throw null;
        }
        qp7.D();
        List<vw3> upperBounds = qp7.getUpperBounds();
        upperBounds.getClass();
        ArrayList arrayList = new ArrayList(et0.e0(upperBounds, 10));
        for (vw3 ds1 : upperBounds) {
            arrayList.add(new ds1(ds1, 0));
        }
        this.B = arrayList;
    }

    public final String b() {
        return this.y;
    }

    public final ks3 c() {
        return this.z;
    }

    public final List getUpperBounds() {
        List list = this.B;
        if (list != null) {
            return list;
        }
        sg3.a0("upperBounds");
        throw null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ds3(es3 es3, String str, ks3 ks3) {
        this((qp7) null, es3, str, ks3);
        es3.getClass();
        str.getClass();
    }

    public ds3(qp7 qp7, es3 es3, String str, ks3 ks3) {
        super(es3);
        this.y = str;
        this.z = ks3;
        this.A = qp7;
    }
}
