package defpackage;

/* renamed from: cl3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cl3 {
    public final kx4 a;
    public final cf4 b;
    public final vr2 c;

    public cl3(kx4 kx4, cf4 cf4, vr2 vr2, int i) {
        kx4 = (i & 1) != 0 ? null : kx4;
        cf4 = (i & 2) != 0 ? null : cf4;
        vr2 = (i & 4) != 0 ? null : vr2;
        this.a = kx4;
        this.b = cf4;
        this.c = vr2;
    }
}
