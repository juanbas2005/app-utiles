package defpackage;

/* renamed from: l24  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class l24 implements a37 {
    public final int w;
    public final int x;
    public final ed5 y;
    public int z;

    public l24(int i, int i2, int i3) {
        this.w = i2;
        this.x = i3;
        int i4 = (i / i2) * i2;
        this.y = new ed5(z65.V(Math.max(i4 - i3, 0), i4 + i2 + i3), g22.K);
        this.z = i;
    }

    public final void b(int i) {
        if (i != this.z) {
            this.z = i;
            int i2 = this.w;
            int i3 = (i / i2) * i2;
            int i4 = this.x;
            this.y.setValue(z65.V(Math.max(i3 - i4, 0), i3 + i2 + i4));
        }
    }

    public final Object getValue() {
        return (re3) this.y.getValue();
    }
}
