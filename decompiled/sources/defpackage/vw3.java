package defpackage;

import java.util.List;

/* renamed from: vw3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class vw3 implements ql, zw3 {
    public int w;

    public abstract List G();

    public abstract ro7 J();

    public abstract wo7 L();

    public abstract boolean Q();

    public abstract ji4 R();

    public abstract vw3 Y(ax3 ax3);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vw3)) {
            return false;
        }
        vw3 vw3 = (vw3) obj;
        if (Q() != vw3.Q()) {
            return false;
        }
        if (rg3.C(hz2.L, n0(), vw3.n0())) {
            return true;
        }
        return false;
    }

    public final rm getAnnotations() {
        return vm.a(J());
    }

    public final int hashCode() {
        int i;
        int i2 = this.w;
        if (i2 != 0) {
            return i2;
        }
        if (gr8.N(this)) {
            i = super.hashCode();
        } else {
            int hashCode = G().hashCode();
            i = (Q() ? 1 : 0) + ((hashCode + (L().hashCode() * 31)) * 31);
        }
        this.w = i;
        return i;
    }

    public abstract du7 n0();
}
