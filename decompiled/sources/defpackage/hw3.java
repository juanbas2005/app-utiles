package defpackage;

import java.util.List;

/* renamed from: hw3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class hw3 extends gw3 implements sr3 {
    public final nz3 x = rg3.y(i44.w, new xo3(7, this));

    public final tu3 P() {
        return Q().A.c;
    }

    public final List a() {
        return Q().a();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hw3) || !sg3.e(Q(), ((hw3) obj).Q())) {
            return false;
        }
        return true;
    }

    public final String getName() {
        return hl6.o(new StringBuilder("<get-"), Q().A.b, '>');
    }

    public final List getParameters() {
        return Q().getParameters();
    }

    public final int hashCode() {
        return Q().hashCode();
    }

    public final as3 k() {
        return Q().k();
    }

    public final dj0 n() {
        return (dj0) this.x.getValue();
    }

    public final String toString() {
        return "getter of " + Q();
    }
}
