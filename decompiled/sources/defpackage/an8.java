package defpackage;

/* renamed from: an8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class an8 extends vn8 {
    public final transient int B;
    public final transient int C;
    public final /* synthetic */ vn8 D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public an8(vn8 vn8, int i, int i2) {
        super(0);
        this.D = vn8;
        this.B = i;
        this.C = i2;
    }

    public final Object[] g() {
        return this.D.g();
    }

    public final Object get(int i) {
        t35.E(i, this.C);
        return this.D.get(i + this.B);
    }

    public final int k() {
        return this.D.k() + this.B;
    }

    public final int l() {
        return this.D.k() + this.B + this.C;
    }

    public final int size() {
        return this.C;
    }

    /* renamed from: w */
    public final vn8 subList(int i, int i2) {
        t35.G(i, i2, this.C);
        int i3 = this.B;
        return this.D.subList(i + i3, i2 + i3);
    }
}
