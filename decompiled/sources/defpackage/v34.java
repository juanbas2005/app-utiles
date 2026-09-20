package defpackage;

/* renamed from: v34  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class v34 extends wj1 {
    public static final /* synthetic */ yr3[] D;
    public final ib4 A;
    public final ib4 B;
    public final y34 C;
    public final tl4 y;
    public final up2 z;

    static {
        Class<v34> cls = v34.class;
        D = new yr3[]{new gr5(cls, "fragments", "getFragments()Ljava/util/List;", 0), new gr5(cls, "empty", "getEmpty()Z", 0)};
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [ib4, hb4] */
    /* JADX WARNING: type inference failed for: r5v4, types: [ib4, hb4] */
    /* JADX WARNING: Illegal instructions before constructor call */
    public v34(tl4 tl4, up2 up2, kb4 kb4) {
        super(r0, r1);
        uq4 uq4;
        up2.getClass();
        kb4.getClass();
        qm qmVar = me6.x;
        vp2 vp2 = up2.a;
        if (vp2.c()) {
            uq4 = vp2.e;
        } else {
            uq4 = vp2.g();
        }
        this.y = tl4;
        this.z = up2;
        this.A = new hb4(kb4, new u34(this, 0));
        this.B = new hb4(kb4, new u34(this, 1));
        this.C = new y34(kb4, new u34(this, 2));
    }

    public final Object P(zj1 zj1, Object obj) {
        return zj1.t(this, obj);
    }

    public final boolean equals(Object obj) {
        v34 v34;
        if (obj instanceof v34) {
            v34 = (v34) obj;
        } else {
            v34 = null;
        }
        if (v34 != null && sg3.e(this.z, v34.z) && sg3.e(this.y, v34.y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.z.hashCode() + (this.y.hashCode() * 31);
    }

    public final vj1 r() {
        up2 up2 = this.z;
        if (up2.a.c()) {
            return null;
        }
        return this.y.k0(up2.b());
    }
}
