package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: gg3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gg3 implements wo7, xo7 {
    public vw3 w;
    public final LinkedHashSet x;
    public final int y;

    public gg3(AbstractCollection abstractCollection) {
        abstractCollection.getClass();
        abstractCollection.isEmpty();
        LinkedHashSet linkedHashSet = new LinkedHashSet(abstractCollection);
        this.x = linkedHashSet;
        this.y = linkedHashSet.hashCode();
    }

    public final fu6 a() {
        ro7.x.getClass();
        return kl8.K(ro7.y, this, a42.w, false, i95.l("member scope for intersection type", this.x), new b0(16, this));
    }

    public final String b(vr2 vr2) {
        vr2.getClass();
        return dt0.E0(dt0.U0(this.x, new la2(2, vr2)), " & ", "{", "}", new dw2(1, vr2), 24);
    }

    public final Collection e() {
        return this.x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gg3)) {
            return false;
        }
        return sg3.e(this.x, ((gg3) obj).x);
    }

    public final fv3 g() {
        fv3 g = ((vw3) this.x.iterator().next()).L().g();
        g.getClass();
        return g;
    }

    public final List getParameters() {
        return a42.w;
    }

    public final int hashCode() {
        return this.y;
    }

    public final String toString() {
        return b(v61.X);
    }

    public final vq0 u() {
        return null;
    }

    public final boolean y() {
        return false;
    }
}
