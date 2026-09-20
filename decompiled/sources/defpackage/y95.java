package defpackage;

/* renamed from: y95  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class y95 extends yj1 implements x95 {
    public final up2 A;
    public final String B;

    /* JADX WARNING: Illegal instructions before constructor call */
    public y95(sl4 sl4, up2 up2) {
        super(sl4, r0, r1, sy6.j);
        uq4 uq4;
        sl4.getClass();
        up2.getClass();
        qm qmVar = me6.x;
        vp2 vp2 = up2.a;
        if (vp2.c()) {
            uq4 = vp2.e;
        } else {
            uq4 = vp2.g();
        }
        this.A = up2;
        this.B = "package " + up2 + " of " + sl4;
    }

    public final Object P(zj1 zj1, Object obj) {
        return zj1.L(this, obj);
    }

    public sy6 e() {
        return sy6.j;
    }

    /* renamed from: f1 */
    public final sl4 r() {
        vj1 r = super.r();
        r.getClass();
        return (sl4) r;
    }

    public String toString() {
        return this.B;
    }
}
