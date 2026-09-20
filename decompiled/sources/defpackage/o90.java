package defpackage;

/* renamed from: o90  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class o90 implements mk1 {
    public final t82 a;
    public final tk6 b;

    /* JADX WARNING: type inference failed for: r2v2, types: [tk6, sk6] */
    public o90(int i, t82 t82) {
        this.a = t82;
        int i2 = uk6.a;
        this.b = new sk6(i);
    }

    public final pk1 a(xy6 xy6, v75 v75) {
        return new q90(xy6.a, v75, this.b, this.a);
    }

    public final boolean equals(Object obj) {
        return obj instanceof o90;
    }

    public final int hashCode() {
        return o90.class.hashCode();
    }
}
