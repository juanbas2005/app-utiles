package defpackage;

/* renamed from: kd5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kd5 extends ll4 implements my3 {
    public float K;
    public bd5 L;

    public final mh4 c(oh4 oh4, gh4 gh4, long j) {
        int i;
        int i2;
        bd5 bd5 = this.L;
        if (bd5 == null || ((Number) bd5.getValue()).intValue() == Integer.MAX_VALUE) {
            i = Integer.MAX_VALUE;
        } else {
            i = Math.round(((Number) bd5.getValue()).floatValue() * this.K);
        }
        if (i != Integer.MAX_VALUE) {
            i2 = i;
        } else {
            i2 = k31.j(j);
        }
        int i3 = k31.i(j);
        if (i == Integer.MAX_VALUE) {
            i = k31.h(j);
        }
        eh5 y = gh4.y(m31.a(i2, i, i3, k31.g(j)));
        return oh4.d0(y.w, y.x, b42.w, new ws(y, 10));
    }
}
