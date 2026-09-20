package defpackage;

import java.util.Objects;

/* renamed from: s39  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class s39 implements Runnable {
    public final /* synthetic */ boolean w;
    public final /* synthetic */ v49 x;

    public s39(v49 v49, boolean z) {
        this.w = z;
        Objects.requireNonNull(v49);
        this.x = v49;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        if (r3 != r4) goto L_0x004e;
     */
    public final void run() {
        boolean z;
        v49 v49 = this.x;
        y19 y19 = (y19) v49.w;
        boolean a = y19.a();
        boolean z2 = false;
        if (y19.U == null || !y19.U.booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        boolean z3 = this.w;
        y19.U = Boolean.valueOf(z3);
        if (z == z3) {
            pz8 pz8 = y19.B;
            y19.g(pz8);
            pz8.J.b("Default data collection state already set to", Boolean.valueOf(z3));
        }
        if (y19.a() != a) {
            boolean a2 = y19.a();
            if (y19.U != null && y19.U.booleanValue()) {
                z2 = true;
            }
        }
        pz8 pz82 = y19.B;
        y19.g(pz82);
        pz82.G.c(Boolean.valueOf(z3), Boolean.valueOf(a), "Default data collection is different than actual status");
        v49.u1();
    }
}
