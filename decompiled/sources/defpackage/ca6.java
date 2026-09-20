package defpackage;

/* renamed from: ca6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ca6 {
    public static final ea6 a = new ea6(wr.a, xb4.H);

    public static final ea6 a(tr trVar, h80 h80, yt2 yt2, int i) {
        boolean z;
        if (!sg3.e(trVar, wr.a) || !sg3.e(h80, xb4.H)) {
            yt2.e0(-1073779616);
            boolean z2 = true;
            if ((((i & 14) ^ 6) <= 4 || !yt2.g(trVar)) && (i & 6) != 4) {
                z = false;
            } else {
                z = true;
            }
            if ((((i & 112) ^ 48) <= 32 || !yt2.g(h80)) && (i & 48) != 32) {
                z2 = false;
            }
            boolean z3 = z | z2;
            Object Q = yt2.Q();
            if (z3 || Q == ay0.a) {
                Q = new ea6(trVar, h80);
                yt2.o0(Q);
            }
            ea6 ea6 = (ea6) Q;
            yt2.r(false);
            return ea6;
        }
        yt2.e0(-1073830487);
        yt2.r(false);
        return a;
    }
}
