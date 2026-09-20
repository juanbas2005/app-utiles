package defpackage;

import java.util.List;

/* renamed from: hl0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hl0 extends fu6 implements nl0 {
    public final ro7 A;
    public final xp7 x;
    public final kl0 y;
    public final boolean z;

    public hl0(xp7 xp7, kl0 kl0, boolean z2, ro7 ro7) {
        xp7.getClass();
        ro7.getClass();
        this.x = xp7;
        this.y = kl0;
        this.z = z2;
        this.A = ro7;
    }

    public final List G() {
        return a42.w;
    }

    public final ro7 J() {
        return this.A;
    }

    public final wo7 L() {
        return this.y;
    }

    public final boolean Q() {
        return this.z;
    }

    public final ji4 R() {
        return z62.a(u62.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    public final vw3 Y(ax3 ax3) {
        ax3.getClass();
        return new hl0(this.x.d(ax3), this.y, this.z, this.A);
    }

    public final du7 o0(boolean z2) {
        if (z2 == this.z) {
            return this;
        }
        return new hl0(this.x, this.y, z2, this.A);
    }

    public final du7 p0(ax3 ax3) {
        ax3.getClass();
        return new hl0(this.x.d(ax3), this.y, this.z, this.A);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Captured(");
        sb.append(this.x);
        sb.append(')');
        if (this.z) {
            str = "?";
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    public final fu6 w0(boolean z2) {
        if (z2 == this.z) {
            return this;
        }
        return new hl0(this.x, this.y, z2, this.A);
    }

    public final fu6 x0(ro7 ro7) {
        ro7.getClass();
        return new hl0(this.x, this.y, this.z, ro7);
    }
}
