package defpackage;

import java.util.Arrays;

/* renamed from: og8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class og8 {
    public final ln a;
    public final cc2 b;

    public /* synthetic */ og8(ln lnVar, cc2 cc2) {
        this.a = lnVar;
        this.b = cc2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof og8)) {
            return false;
        }
        og8 og8 = (og8) obj;
        if (!b35.j(this.a, og8.a) || !b35.j(this.b, og8.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        hv2 hv2 = new hv2(20, (Object) this);
        hv2.k0("key", this.a);
        hv2.k0("feature", this.b);
        return hv2.toString();
    }
}
