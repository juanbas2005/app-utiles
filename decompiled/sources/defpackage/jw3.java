package defpackage;

import java.util.List;

/* renamed from: jw3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class jw3 extends gw3 implements fr3 {
    public final nz3 x;
    public final nz3 y;

    public jw3() {
        iw3 iw3 = new iw3(this, 0);
        i44 i44 = i44.w;
        this.x = rg3.y(i44, iw3);
        this.y = rg3.y(i44, new iw3(this, 1));
    }

    public final tu3 P() {
        return Q().A.d;
    }

    public final List a() {
        return dt0.N0(Q().a(), this.x.getValue());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jw3) || !sg3.e(Q(), ((jw3) obj).Q())) {
            return false;
        }
        return true;
    }

    public final String getName() {
        return hl6.o(new StringBuilder("<set-"), Q().A.b, '>');
    }

    public final List getParameters() {
        return dt0.N0(Q().getParameters(), this.x.getValue());
    }

    public final int hashCode() {
        return Q().hashCode();
    }

    public final as3 k() {
        as3 as3 = k27.a;
        return k27.e;
    }

    public final dj0 n() {
        return (dj0) this.y.getValue();
    }

    public final String toString() {
        return "setter of " + Q();
    }
}
