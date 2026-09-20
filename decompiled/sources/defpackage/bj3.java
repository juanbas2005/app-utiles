package defpackage;

import java.util.List;

/* renamed from: bj3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bj3 extends hj3 implements gr3, fr3 {
    public final nz3 x;
    public final nz3 y;
    public final cj3 z;

    public bj3(cj3 cj3) {
        ij3 ij3 = new ij3(this, 0);
        i44 i44 = i44.w;
        this.x = rg3.y(i44, ij3);
        this.y = rg3.y(i44, new ij3(this, 1));
        this.z = cj3;
    }

    public final yr3 N() {
        return this.z;
    }

    public final kj3 P() {
        return this.z;
    }

    public final List a() {
        return dt0.N0(this.z.a(), this.x.getValue());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bj3)) {
            return false;
        }
        if (sg3.e(this.z, ((bj3) obj).z)) {
            return true;
        }
        return false;
    }

    public final String getName() {
        return "<set-" + this.z.getName() + '>';
    }

    public final List getParameters() {
        return dt0.N0(this.z.getParameters(), this.x.getValue());
    }

    public final int hashCode() {
        return this.z.hashCode();
    }

    public final as3 k() {
        as3 as3 = k27.a;
        return k27.e;
    }

    public final dj0 n() {
        return (dj0) this.y.getValue();
    }

    public final String toString() {
        return "setter of " + this.z;
    }

    public final Object y(Object obj) {
        ((bj3) this.z.E.getValue()).O(obj);
        return vs7.a;
    }
}
