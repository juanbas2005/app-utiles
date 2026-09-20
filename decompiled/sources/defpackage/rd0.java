package defpackage;

/* renamed from: rd0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rd0 extends y95 implements x95 {
    public final nd0 C;
    public final wq4 D;
    public final am6 E;
    public os5 F;
    public rt1 G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rd0(up2 up2, kb4 kb4, sl4 sl4, os5 os5, nd0 nd0) {
        super(sl4, up2);
        up2.getClass();
        sl4.getClass();
        this.C = nd0;
        ws5 ws5 = os5.z;
        ws5.getClass();
        us5 us5 = os5.A;
        us5.getClass();
        wq4 wq4 = new wq4(ws5, us5);
        this.D = wq4;
        this.E = new am6(os5, wq4, nd0, new e18(4, this));
        this.F = os5;
    }

    public final ji4 R() {
        rt1 rt1 = this.G;
        if (rt1 != null) {
            return rt1;
        }
        sg3.a0("_memberScope");
        throw null;
    }

    public final void g1(ws1 ws1) {
        ws1.getClass();
        os5 os5 = this.F;
        if (os5 != null) {
            this.F = null;
            ns5 ns5 = os5.B;
            ns5.getClass();
            this.G = new rt1(this, ns5, this.D, this.C, (wo3) null, ws1, "scope of " + this, new k3(18, this));
            return;
        }
        h.s("Repeated call to DeserializedPackageFragmentImpl::initialize");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("builtins package fragment for ");
        sb.append(this.A);
        sb.append(" from ");
        int i = ts1.a;
        sl4 c = rs1.c(this);
        c.getClass();
        sb.append(c);
        return sb.toString();
    }
}
