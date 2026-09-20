package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: ze3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ze3 implements wo7 {
    public final Set w;
    public final z97 x = new z97(new x10(this));

    public ze3(Set set) {
        ro7.x.getClass();
        ro7 ro7 = ro7.y;
        ro7.getClass();
        kl8.J(z62.a(u62.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"), ro7, this, a42.w, false);
        this.w = set;
    }

    public final Collection e() {
        return (List) this.x.getValue();
    }

    public final fv3 g() {
        throw null;
    }

    public final List getParameters() {
        return a42.w;
    }

    public final String toString() {
        return "IntegerLiteralType".concat("[" + dt0.E0(this.w, ",", (String) null, (String) null, v61.W, 30) + ']');
    }

    public final vq0 u() {
        return null;
    }

    public final boolean y() {
        return false;
    }
}
