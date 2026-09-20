package defpackage;

/* renamed from: d34  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class d34 extends ll4 implements dk6 {
    public sr2 K;
    public x24 L;
    public z75 M;
    public boolean N;
    public vg6 O;
    public final b34 P = new b34(this, 0);
    public b34 Q;

    public d34(sr2 sr2, x24 x24, z75 z75, boolean z) {
        this.K = sr2;
        this.L = x24;
        this.M = z75;
        this.N = z;
        V0();
    }

    public final void D0(ok6 ok6) {
        mk6.i(ok6);
        ok6.f(jk6.N, this.P);
        z75 z75 = this.M;
        vg6 vg6 = this.O;
        if (z75 == z75.w) {
            if (vg6 != null) {
                nk6 nk6 = jk6.w;
                yr3 yr3 = mk6.a[13];
                ok6.f(nk6, vg6);
            } else {
                sg3.a0("scrollAxisRange");
                throw null;
            }
        } else if (vg6 != null) {
            nk6 nk62 = jk6.v;
            yr3 yr32 = mk6.a[12];
            ok6.f(nk62, vg6);
        } else {
            sg3.a0("scrollAxisRange");
            throw null;
        }
        b34 b34 = this.Q;
        if (b34 != null) {
            ok6.f(zj6.f, new h4((String) null, b34));
        }
        ok6.f(zj6.C, new h4((String) null, new pb(20, new c34(this, 2))));
        at0 f = this.L.f();
        nk6 nk63 = jk6.f;
        yr3 yr33 = mk6.a[24];
        ok6.f(nk63, f);
    }

    public final boolean K0() {
        return false;
    }

    public final void V0() {
        b34 b34;
        this.O = new vg6(new c34(this, 0), new c34(this, 1));
        if (this.N) {
            b34 = new b34(this, 1);
        } else {
            b34 = null;
        }
        this.Q = b34;
    }
}
