package defpackage;

import java.util.List;

/* renamed from: gu6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gu6 extends fu6 {
    public final ji4 A;
    public final vr2 B;
    public final wo7 x;
    public final List y;
    public final boolean z;

    public gu6(wo7 wo7, List list, boolean z2, ji4 ji4, vr2 vr2) {
        wo7.getClass();
        list.getClass();
        ji4.getClass();
        this.x = wo7;
        this.y = list;
        this.z = z2;
        this.A = ji4;
        this.B = vr2;
        if ((ji4 instanceof t62) && !(ji4 instanceof uh7)) {
            throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + ji4 + 10 + wo7);
        }
    }

    public final List G() {
        return this.y;
    }

    public final ro7 J() {
        ro7.x.getClass();
        return ro7.y;
    }

    public final wo7 L() {
        return this.x;
    }

    public final boolean Q() {
        return this.z;
    }

    public final ji4 R() {
        return this.A;
    }

    public final vw3 Y(ax3 ax3) {
        ax3.getClass();
        fu6 fu6 = (fu6) this.B.y(ax3);
        if (fu6 == null) {
            return this;
        }
        return fu6;
    }

    public final du7 p0(ax3 ax3) {
        ax3.getClass();
        fu6 fu6 = (fu6) this.B.y(ax3);
        if (fu6 == null) {
            return this;
        }
        return fu6;
    }

    public final fu6 w0(boolean z2) {
        if (z2 == this.z) {
            return this;
        }
        if (z2) {
            return new u05(this, 1);
        }
        return new u05(this, 0);
    }

    public final fu6 x0(ro7 ro7) {
        ro7.getClass();
        if (ro7.isEmpty()) {
            return this;
        }
        return new iu6(this, ro7);
    }
}
