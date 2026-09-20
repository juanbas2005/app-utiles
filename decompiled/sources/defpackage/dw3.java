package defpackage;

import java.util.List;

/* renamed from: dw3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dw3 extends vv3 {
    public final qu3 D;
    public final nz3 E;
    public final nz3 F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dw3(yq3 yq3, String str, Object obj, qu3 qu3, fq3 fq3) {
        super(yq3, str, obj, fq3);
        yq3.getClass();
        str.getClass();
        qu3.getClass();
        fq3.getClass();
        this.D = qu3;
        cw3 cw3 = new cw3(yq3, this);
        i44 i44 = i44.w;
        this.E = rg3.y(i44, cw3);
        this.F = rg3.y(i44, new cw3(this, yq3));
    }

    public final List R() {
        return this.D.g;
    }

    public final uu3 S() {
        return this.D.d;
    }

    public final to3 T() {
        qu3 qu3 = this.D;
        qu3.getClass();
        to3 to3 = tf4.y(qu3).a;
        if (to3 != null) {
            return to3;
        }
        rf2.x("No signature for function: ", this);
        return null;
    }

    public final vp7 U() {
        return (vp7) this.E.getValue();
    }

    public final List V() {
        return this.D.f;
    }

    public final ls3 f() {
        yr3[] yr3Arr = su.a;
        qu3 qu3 = this.D;
        qu3.getClass();
        return pd8.O((k78) su.h.I(su.a[22], qu3));
    }

    public final String getName() {
        return this.D.b;
    }

    public final boolean i() {
        yr3[] yr3Arr = su.a;
        qu3 qu3 = this.D;
        qu3.getClass();
        return su.n.C(su.a[29], qu3);
    }

    public final boolean j() {
        yr3[] yr3Arr = su.a;
        qu3 qu3 = this.D;
        qu3.getClass();
        return su.l.C(su.a[26], qu3);
    }

    public final as3 k() {
        return (as3) this.F.getValue();
    }

    public final boolean m() {
        yr3[] yr3Arr = su.a;
        qu3 qu3 = this.D;
        qu3.getClass();
        return su.m.C(su.a[28], qu3);
    }

    public final el4 o() {
        yr3[] yr3Arr = su.a;
        qu3 qu3 = this.D;
        qu3.getClass();
        return (el4) su.i.I(su.a[23], qu3);
    }

    public final boolean q() {
        yr3[] yr3Arr = su.a;
        qu3 qu3 = this.D;
        qu3.getClass();
        return su.j.C(su.a[24], qu3);
    }

    public final boolean w() {
        yr3[] yr3Arr = su.a;
        qu3 qu3 = this.D;
        qu3.getClass();
        return su.k.C(su.a[25], qu3);
    }

    public final p16 x(yq3 yq3, fq3 fq3) {
        yq3.getClass();
        fq3.getClass();
        return new dw3(yq3, this.y, si0.w, this.D, fq3);
    }
}
