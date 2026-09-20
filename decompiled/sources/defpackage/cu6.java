package defpackage;

import java.util.List;

/* renamed from: cu6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cu6 extends c2 {
    public final List A;
    public final as3 B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final gq3 F;
    public final vq3 x;
    public final List y;
    public final boolean z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cu6(vq3 vq3, List list, boolean z2, List list2, as3 as3, boolean z3, boolean z4, boolean z5, gq3 gq3, sr2 sr2) {
        super(sr2);
        vq3.getClass();
        list.getClass();
        list2.getClass();
        this.x = vq3;
        this.y = list;
        this.z = z2;
        this.A = list2;
        this.B = as3;
        this.C = z3;
        this.D = z4;
        this.E = z5;
        this.F = gq3;
    }

    public final boolean C() {
        return this.E;
    }

    public final c2 D() {
        return null;
    }

    public final c2 F(boolean z2) {
        boolean z3;
        if (!this.z || z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        return new cu6(this.x, this.y, z3, this.A, this.B, z2, this.D, this.E, this.F, (sr2) null);
    }

    public final c2 H(boolean z2) {
        vq3 vq3 = this.x;
        boolean z3 = vq3 instanceof gq3;
        gq3 gq3 = vq3;
        if (z3) {
            gq3 gq32 = (gq3) vq3;
            if (z2) {
                gq3 = b26.a.b(kl8.v(gq32));
            } else {
                Class w = kl8.w(gq32);
                gq3 = gq32;
                if (w != null) {
                    gq3 = b26.a.b(w);
                }
            }
        }
        return new cu6(gq3, this.y, z2, this.A, this.B, false, this.D, this.E, this.F, (sr2) null);
    }

    public final List I() {
        return this.y;
    }

    public final vq3 J() {
        return this.x;
    }

    public final c2 K() {
        return null;
    }

    public final as3 b() {
        return this.B;
    }

    public final gq3 g() {
        return this.F;
    }

    public final List getAnnotations() {
        return this.A;
    }

    public final boolean s() {
        return this.C;
    }

    public final boolean u() {
        return this.D;
    }

    public final boolean v() {
        return this.z;
    }

    public final boolean y() {
        return false;
    }
}
