package defpackage;

/* renamed from: ux1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ux1 extends ll4 implements ln7, by3 {
    public ux1 K;
    public ux1 L;
    public long M;

    public final void O0() {
        this.L = null;
        this.K = null;
    }

    public final boolean V0() {
        ux1 ux1 = this.K;
        if (ux1 != null) {
            return ux1.V0();
        }
        ux1 ux12 = this.L;
        if (ux12 != null) {
            return ux12.V0();
        }
        return false;
    }

    public final void W0() {
        ux1 ux1 = this.L;
        if (ux1 == null) {
            ux1 ux12 = this.K;
            if (ux12 != null) {
                ux12.W0();
                return;
            }
            return;
        }
        ux1.W0();
    }

    public final void X0() {
        ux1 ux1 = this.L;
        if (ux1 != null) {
            ux1.X0();
        }
        ux1 ux12 = this.K;
        if (ux12 != null) {
            ux12.X0();
        }
        this.K = null;
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [java.lang.Object, h06] */
    public final void Y0(f96 f96) {
        ux1 ux1;
        ln7 ln7;
        ux1 ux12 = this.K;
        if (ux12 == null || !gw8.f(ux12, h49.C(f96))) {
            if (!this.w.J) {
                ln7 = null;
            } else {
                ? obj = new Object();
                h75.w(this, new zj(obj, this, f96, 1));
                ln7 = (ln7) obj.w;
            }
            ux1 = (ux1) ln7;
        } else {
            ux1 = ux12;
        }
        if (ux1 != null && ux12 == null) {
            ux1.W0();
            ux1.Y0(f96);
            ux1 ux13 = this.L;
            if (ux13 != null) {
                ux13.X0();
            }
        } else if (ux1 == null && ux12 != null) {
            ux1 ux14 = this.L;
            if (ux14 != null) {
                ux14.W0();
                ux14.Y0(f96);
            }
            ux12.X0();
        } else if (!sg3.e(ux1, ux12)) {
            if (ux1 != null) {
                ux1.W0();
                ux1.Y0(f96);
            }
            if (ux12 != null) {
                ux12.X0();
            }
        } else if (ux1 != null) {
            ux1.Y0(f96);
        } else {
            ux1 ux15 = this.L;
            if (ux15 != null) {
                ux15.Y0(f96);
            }
        }
        this.K = ux1;
    }

    public final void Z0() {
        ux1 ux1 = this.L;
        if (ux1 == null) {
            ux1 ux12 = this.K;
            if (ux12 != null) {
                ux12.Z0();
                return;
            }
            return;
        }
        ux1.Z0();
    }

    public final void a(long j) {
        this.M = j;
    }

    public final Object m() {
        return xb4.Q;
    }
}
