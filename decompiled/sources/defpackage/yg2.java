package defpackage;

import java.util.List;

/* renamed from: yg2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yg2 extends c2 {
    public final c2 x;
    public final c2 y;
    public final boolean z;

    public yg2(c2 c2Var, c2 c2Var2, boolean z2, sr2 sr2) {
        super(sr2);
        this.x = c2Var;
        this.y = c2Var2;
        this.z = z2;
    }

    public final boolean C() {
        return false;
    }

    public final c2 D() {
        return this.x;
    }

    public final c2 F(boolean z2) {
        c2 F = this.x.F(z2);
        c2 F2 = this.y.F(z2);
        if (F.equals(F2)) {
            return F;
        }
        return new yg2(F, F2, this.z, (sr2) null);
    }

    public final c2 H(boolean z2) {
        c2 H = this.x.H(z2);
        c2 H2 = this.y.H(z2);
        if (H.equals(H2)) {
            return H;
        }
        return new yg2(H, H2, this.z, (sr2) null);
    }

    public final List I() {
        return this.x.I();
    }

    public final vq3 J() {
        return this.x.J();
    }

    public final c2 K() {
        return this.y;
    }

    public final as3 b() {
        return null;
    }

    public final gq3 g() {
        return this.x.g();
    }

    public final List getAnnotations() {
        return this.x.getAnnotations();
    }

    public final boolean s() {
        return false;
    }

    public final boolean u() {
        return false;
    }

    public final boolean v() {
        return this.x.v();
    }

    public final boolean y() {
        return this.z;
    }
}
