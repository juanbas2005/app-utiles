package defpackage;

import java.util.Collection;
import java.util.List;

/* renamed from: ro4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ro4 implements gq3, es3, xo7 {
    public final gq3 w;
    public final String x;
    public final List y;
    public final List z;

    public ro4(gq3 gq3, String str, vr2 vr2, vr2 vr22) {
        gq3.getClass();
        str.getClass();
        this.w = gq3;
        this.x = str;
        this.y = (List) vr2.y(this);
        this.z = (List) vr22.y(this);
    }

    public final String A() {
        return d57.e1(this.x);
    }

    public final boolean L(Object obj) {
        return this.w.L(obj);
    }

    public final List e() {
        return this.z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ro4)) {
            return false;
        }
        if (sg3.e(this.w, ((ro4) obj).w)) {
            return true;
        }
        return false;
    }

    public final List getAnnotations() {
        return this.w.getAnnotations();
    }

    public final List getTypeParameters() {
        return this.y;
    }

    public final int hashCode() {
        return this.w.hashCode();
    }

    public final String l() {
        return this.x;
    }

    public final boolean p() {
        return this.w.p();
    }

    public final Collection r() {
        return this.w.r();
    }

    public final String toString() {
        return "MutableCollectionKClass(" + this.w + ')';
    }

    public final boolean z() {
        return this.w.z();
    }
}
