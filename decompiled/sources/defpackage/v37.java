package defpackage;

import java.util.Collection;
import java.util.List;

/* renamed from: v37  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class v37 extends ki4 {
    public static final /* synthetic */ yr3[] f;
    public final gt1 b;
    public final boolean c;
    public final ib4 d;
    public final ib4 e;

    static {
        Class<v37> cls = v37.class;
        f = new yr3[]{new gr5(cls, "functions", "getFunctions()Ljava/util/List;", 0), new gr5(cls, "properties", "getProperties()Ljava/util/List;", 0)};
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [ib4, hb4] */
    /* JADX WARNING: type inference failed for: r3v4, types: [ib4, hb4] */
    public v37(kb4 kb4, gt1 gt1, boolean z) {
        kb4.getClass();
        this.b = gt1;
        this.c = z;
        this.d = new hb4(kb4, new u37(this, 0));
        this.e = new hb4(kb4, new u37(this, 1));
    }

    public final Collection a(is1 is1, vr2 vr2) {
        is1.getClass();
        yr3[] yr3Arr = f;
        return dt0.M0((List) p25.q(this.d, yr3Arr[0]), (List) p25.q(this.e, yr3Arr[1]));
    }

    public final Collection b(uq4 uq4, oz4 oz4) {
        uq4.getClass();
        yr3 yr3 = f[0];
        vv6 vv6 = new vv6();
        for (Object next : (List) p25.q(this.d, yr3)) {
            if (sg3.e(((au6) next).getName(), uq4)) {
                vv6.add(next);
            }
        }
        return vv6;
    }

    public final vq0 e(uq4 uq4, oz4 oz4) {
        uq4.getClass();
        oz4.getClass();
        return null;
    }

    public final Collection f(uq4 uq4, oz4 oz4) {
        uq4.getClass();
        yr3 yr3 = f[1];
        vv6 vv6 = new vv6();
        for (Object next : (List) p25.q(this.e, yr3)) {
            if (sg3.e(((cr5) next).getName(), uq4)) {
                vv6.add(next);
            }
        }
        return vv6;
    }
}
