package defpackage;

/* renamed from: td2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class td2 extends ll4 implements my3 {
    public jv1 K;
    public float L;

    public final mh4 c(oh4 oh4, gh4 gh4, long j) {
        int i;
        int i2;
        int i3;
        int i4;
        if (!k31.d(j) || this.K == jv1.w) {
            i = k31.j(j);
            i2 = k31.h(j);
        } else {
            int round = Math.round(((float) k31.h(j)) * this.L);
            int j2 = k31.j(j);
            i = k31.h(j);
            if (round < j2) {
                round = j2;
            }
            if (round <= i) {
                i = round;
            }
            i2 = i;
        }
        if (!k31.c(j) || this.K == jv1.x) {
            int i5 = k31.i(j);
            int g = k31.g(j);
            i3 = i5;
            i4 = g;
        } else {
            int round2 = Math.round(((float) k31.g(j)) * this.L);
            int i6 = k31.i(j);
            i3 = k31.g(j);
            if (round2 < i6) {
                round2 = i6;
            }
            if (round2 <= i3) {
                i3 = round2;
            }
            i4 = i3;
        }
        eh5 y = gh4.y(m31.a(i, i2, i3, i4));
        return oh4.d0(y.w, y.x, b42.w, new ws(y, 6));
    }
}
