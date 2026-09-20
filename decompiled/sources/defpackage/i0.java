package defpackage;

import java.util.List;

/* renamed from: i0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class i0 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ j0 x;

    public /* synthetic */ i0(j0 j0Var, int i) {
        this.w = i;
        this.x = j0Var;
    }

    public final Object b() {
        int i = this.w;
        j0 j0Var = this.x;
        switch (i) {
            case b85.b:
                ji4 n0 = j0Var.n0();
                b0 b0Var = new b0(1, this);
                v62 v62 = iq7.a;
                if (z62.f(j0Var)) {
                    return z62.c(x62.G, j0Var.toString());
                }
                wo7 n = j0Var.n();
                if (n == null) {
                    iq7.a(12);
                    throw null;
                } else if (n0 != null) {
                    List d = iq7.d(n.getParameters());
                    ro7.x.getClass();
                    return kl8.K(ro7.y, n, d, false, n0, b0Var);
                } else {
                    iq7.a(13);
                    throw null;
                }
            case 1:
                return new fc3(j0Var.n0());
            default:
                return new qz3(j0Var);
        }
    }
}
