package defpackage;

import java.util.List;

/* renamed from: el0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class el0 extends c2 implements nl0 {
    public final as3 x;
    public final fl0 y;
    public final boolean z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public el0(as3 as3, fl0 fl0, boolean z2) {
        super(dl0.D);
        fl0.getClass();
        this.x = as3;
        this.y = fl0;
        this.z = z2;
    }

    public final boolean C() {
        return false;
    }

    public final c2 D() {
        return null;
    }

    public final c2 F(boolean z2) {
        if (!z2) {
            return this;
        }
        rf2.x("Definitely not null captured type is not supported yet: ", this);
        return null;
    }

    public final c2 H(boolean z2) {
        if (z2 == this.z) {
            return this;
        }
        return new el0(this.x, this.y, z2);
    }

    public final List I() {
        return a42.w;
    }

    public final vq3 J() {
        return null;
    }

    public final c2 K() {
        return null;
    }

    public final as3 b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof el0)) {
            return false;
        }
        el0 el0 = (el0) obj;
        if (!sg3.e(this.x, el0.x) || !sg3.e(this.y, el0.y) || this.z != el0.z) {
            return false;
        }
        return true;
    }

    public final gq3 g() {
        return null;
    }

    public final List getAnnotations() {
        return a42.w;
    }

    public final int hashCode() {
        int i;
        as3 as3 = this.x;
        if (as3 != null) {
            i = as3.hashCode();
        } else {
            i = 0;
        }
        int hashCode = this.y.hashCode();
        return Boolean.hashCode(this.z) + ((hashCode + (i * 31)) * 31);
    }

    public final boolean s() {
        return false;
    }

    public final String toString() {
        return this.y.toString();
    }

    public final boolean u() {
        return false;
    }

    public final boolean v() {
        return this.z;
    }

    public final boolean y() {
        return false;
    }
}
