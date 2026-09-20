package defpackage;

/* renamed from: il3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class il3 extends kk0 {
    public final ll3 G;

    public il3(f61 f61, ll3 ll3) {
        super(1, f61);
        this.G = ll3;
    }

    public final String B() {
        return "AwaitContinuation";
    }

    public final Throwable q(ll3 ll3) {
        Throwable c;
        Object R = this.G.R();
        if ((R instanceof kl3) && (c = ((kl3) R).c()) != null) {
            return c;
        }
        if (R instanceof av0) {
            return ((av0) R).a;
        }
        return ll3.E();
    }
}
