package defpackage;

/* renamed from: kt8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kt8 extends mt8 {
    public final transient int B;
    public final transient int C;
    public final /* synthetic */ mt8 D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kt8(mt8 mt8, int i, int i2) {
        super(2);
        this.D = mt8;
        this.B = i;
        this.C = i2;
    }

    public final int f() {
        return this.D.k() + this.B + this.C;
    }

    public final Object get(int i) {
        g75.V(i, this.C);
        return this.D.get(i + this.B);
    }

    public final int k() {
        return this.D.k() + this.B;
    }

    public final Object[] p() {
        return this.D.p();
    }

    public final int size() {
        return this.C;
    }

    /* renamed from: w */
    public final mt8 subList(int i, int i2) {
        g75.b0(i, i2, this.C);
        int i3 = this.B;
        return this.D.subList(i + i3, i2 + i3);
    }
}
