package defpackage;

/* renamed from: ue8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ue8 extends ll4 implements my3 {
    public jv1 K;
    public gs2 L;

    public final mh4 c(oh4 oh4, gh4 gh4, long j) {
        int i;
        int i2 = 0;
        if (this.K != jv1.w) {
            i = 0;
        } else {
            i = k31.j(j);
        }
        if (this.K == jv1.x) {
            i2 = k31.i(j);
        }
        eh5 y = gh4.y(m31.a(i, k31.h(j), i2, k31.g(j)));
        int p = z65.p(y.w, k31.j(j), k31.h(j));
        int p2 = z65.p(y.x, k31.i(j), k31.g(j));
        oh4 oh42 = oh4;
        return oh42.d0(p, p2, b42.w, new da6(this, p, y, p2, oh42));
    }
}
