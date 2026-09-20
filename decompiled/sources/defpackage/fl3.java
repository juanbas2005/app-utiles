package defpackage;

/* renamed from: fl3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class fl3 extends ll3 {
    public final boolean A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fl3(el3 el3) {
        super(true);
        bp0 bp0;
        bp0 bp02;
        boolean z = true;
        W(el3);
        ap0 Q = Q();
        if (Q instanceof bp0) {
            bp0 = (bp0) Q;
        } else {
            bp0 = null;
        }
        if (bp0 != null) {
            ll3 q = bp0.q();
            while (true) {
                if (!q.H()) {
                    ap0 Q2 = q.Q();
                    if (Q2 instanceof bp0) {
                        bp02 = (bp0) Q2;
                    } else {
                        bp02 = null;
                    }
                    if (bp02 == null) {
                        break;
                    }
                    q = bp02.q();
                } else {
                    break;
                }
            }
            this.A = z;
        }
        z = false;
        this.A = z;
    }

    public final boolean H() {
        return this.A;
    }

    public final boolean K() {
        return true;
    }

    public final void v0() {
        c0(vs7.a);
    }
}
