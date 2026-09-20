package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: tl4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tl4 extends wj1 implements sl4 {
    public final Map A;
    public final ha5 B;
    public wv1 C;
    public ba5 D;
    public final boolean E;
    public final fb4 F;
    public final z97 G;
    public final kb4 y;
    public final fv3 z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tl4(uq4 uq4, kb4 kb4, fv3 fv3, int i) {
        super(me6.x, uq4);
        uq4.getClass();
        this.y = kb4;
        this.z = fv3;
        if (uq4.x) {
            this.A = b42.w;
            ha5.a.getClass();
            ha5 ha5 = (ha5) Z(d63.I);
            this.B = ha5 == null ? ga5.b : ha5;
            this.E = true;
            this.F = kb4.b(new b0(24, this));
            this.G = new z97(new sn3(this, 1));
            return;
        }
        kj6.o("Module name must be special: ", uq4);
        throw null;
    }

    public final boolean F(sl4 sl4) {
        sl4.getClass();
        if (this == sl4) {
            return true;
        }
        this.C.getClass();
        if (dt0.q0(g42.w, sl4)) {
            return true;
        }
        j0();
        if (sl4.j0().contains(this)) {
            return true;
        }
        return false;
    }

    public final Object P(zj1 zj1, Object obj) {
        return zj1.x(this, obj);
    }

    public final Object Z(py2 py2) {
        py2.getClass();
        Object obj = this.A.get(py2);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public final void e1() {
        if (!this.E) {
            if (Z(ah3.a) != null) {
                ku4.a();
                return;
            }
            throw new IllegalStateException("Accessing invalid module descriptor " + this);
        }
    }

    public final fv3 g() {
        return this.z;
    }

    public final List j0() {
        if (this.C != null) {
            return a42.w;
        }
        String str = getName().w;
        str.getClass();
        rf2.v(str, " were not set", "Dependencies of module ");
        return null;
    }

    public final v34 k0(up2 up2) {
        up2.getClass();
        e1();
        return (v34) this.F.y(up2);
    }

    public final /* bridge */ vj1 r() {
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(wj1.d1(this));
        if (!this.E) {
            sb.append(" !isValid");
        }
        sb.append(" packageFragmentProvider: ");
        ba5 ba5 = this.D;
        if (ba5 != null) {
            str = ba5.getClass().getSimpleName();
        } else {
            str = null;
        }
        sb.append(str);
        return sb.toString();
    }

    public final Collection x(up2 up2, vr2 vr2) {
        up2.getClass();
        e1();
        e1();
        return ((iy0) this.G.getValue()).x(up2, vr2);
    }
}
