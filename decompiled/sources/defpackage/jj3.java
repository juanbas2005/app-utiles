package defpackage;

import java.util.List;

/* renamed from: jj3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jj3 extends hj3 implements tr3, sr3 {
    public final nz3 x = rg3.y(i44.w, new k3(25, this));
    public final kj3 y;

    public jj3(kj3 kj3) {
        this.y = kj3;
    }

    public final yr3 N() {
        return this.y;
    }

    public final kj3 P() {
        return this.y;
    }

    public final List a() {
        return this.y.a();
    }

    public final Object b() {
        return this.y.get();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jj3)) {
            return false;
        }
        if (sg3.e(this.y, ((jj3) obj).y)) {
            return true;
        }
        return false;
    }

    public final String getName() {
        return "<get-" + this.y.getName() + '>';
    }

    public final List getParameters() {
        return this.y.getParameters();
    }

    public final int hashCode() {
        return this.y.hashCode();
    }

    public final as3 k() {
        return this.y.k();
    }

    public final dj0 n() {
        return (dj0) this.x.getValue();
    }

    public final String toString() {
        return "getter of " + this.y;
    }
}
