package defpackage;

/* renamed from: hn0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class hn0 extends gn0 {
    public final gs2 z;

    public hn0(gs2 gs2, e81 e81, int i, vc0 vc0) {
        super(e81, i, vc0);
        this.z = gs2;
    }

    public Object e(op5 op5, f61 f61) {
        Object H = this.z.H(op5, f61);
        if (H == p81.w) {
            return H;
        }
        return vs7.a;
    }

    public gn0 f(e81 e81, int i, vc0 vc0) {
        return new hn0(this.z, e81, i, vc0);
    }

    public final String toString() {
        return "block[" + this.z + "] -> " + super.toString();
    }
}
