package defpackage;

/* renamed from: rr6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rr6 extends d3 {
    public long a;
    public kk0 b;

    public final boolean a(c3 c3Var) {
        pr6 pr6 = (pr6) c3Var;
        if (this.a >= 0) {
            return false;
        }
        long j = pr6.E;
        if (j < pr6.F) {
            pr6.F = j;
        }
        this.a = j;
        return true;
    }

    public final f61[] b(c3 c3Var) {
        long j = this.a;
        this.a = -1;
        this.b = null;
        return ((pr6) c3Var).w(j);
    }
}
