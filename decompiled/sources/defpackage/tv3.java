package defpackage;

import java.util.List;

/* renamed from: tv3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tv3 extends vv3 {
    public final ku3 D;
    public final nz3 E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tv3(yq3 yq3, String str, Object obj, ku3 ku3) {
        super(yq3, str, obj, fq3.j);
        yq3.getClass();
        str.getClass();
        ku3.getClass();
        this.D = ku3;
        this.E = rg3.y(i44.w, new xi3(yq3, 2));
    }

    public final List R() {
        return a42.w;
    }

    public final uu3 S() {
        return null;
    }

    public final to3 T() {
        ku3 ku3 = this.D;
        ku3.getClass();
        to3 to3 = tf4.x(ku3).a;
        if (to3 != null) {
            return to3;
        }
        rf2.x("No signature for constructor: ", this);
        return null;
    }

    public final vp7 U() {
        yq3 yq3 = this.x;
        yq3.getClass();
        return ((kq3) ((oq3) yq3).y.getValue()).d();
    }

    public final List V() {
        return this.D.b;
    }

    public final ls3 f() {
        yr3[] yr3Arr = su.a;
        ku3 ku3 = this.D;
        ku3.getClass();
        return pd8.O((k78) su.g.I(su.a[17], ku3));
    }

    public final String getName() {
        return "<init>";
    }

    public final boolean i() {
        return false;
    }

    public final boolean j() {
        return false;
    }

    public final as3 k() {
        return (as3) this.E.getValue();
    }

    public final boolean m() {
        return false;
    }

    public final el4 o() {
        return el4.x;
    }

    public final boolean q() {
        return false;
    }

    public final boolean w() {
        return false;
    }

    public final p16 x(yq3 yq3, fq3 fq3) {
        yq3.getClass();
        fq3.getClass();
        if (fq3.equals(fq3.j)) {
            return new tv3(yq3, this.y, si0.w, this.D);
        }
        rf2.j("Constructors cannot have fake overrides: ", this);
        return null;
    }
}
