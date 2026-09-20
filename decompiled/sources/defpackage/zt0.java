package defpackage;

/* renamed from: zt0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class zt0 {
    public static final au0 a = new au0(wr.c, xb4.K);

    public static final au0 a(vr vrVar, g80 g80, yt2 yt2, int i) {
        boolean z;
        if (!vrVar.equals(wr.c) || !g80.equals(xb4.K)) {
            yt2.e0(-1446550657);
            boolean z2 = true;
            if ((((i & 14) ^ 6) <= 4 || !yt2.g(vrVar)) && (i & 6) != 4) {
                z = false;
            } else {
                z = true;
            }
            if ((((i & 112) ^ 48) <= 32 || !yt2.g(g80)) && (i & 48) != 32) {
                z2 = false;
            }
            boolean z3 = z | z2;
            Object Q = yt2.Q();
            if (z3 || Q == ay0.a) {
                Q = new au0(vrVar, g80);
                yt2.o0(Q);
            }
            au0 au0 = (au0) Q;
            yt2.r(false);
            return au0;
        }
        yt2.e0(-1446604504);
        yt2.r(false);
        return a;
    }
}
