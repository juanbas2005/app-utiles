package defpackage;

import java.util.List;

/* renamed from: bz4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bz4 extends fu6 implements nl0 {
    public final ro7 A;
    public final boolean B;
    public final boolean C;
    public final cl0 x;
    public final cz4 y;
    public final du7 z;

    /* JADX WARNING: Illegal instructions before constructor call */
    public bz4(cl0 cl0, cz4 cz4, du7 du7, ro7 ro7, boolean z2, int i) {
        this(cl0, cz4, du7, ro7, (i & 16) != 0 ? false : z2, false);
        if ((i & 8) != 0) {
            ro7.x.getClass();
            ro7 = ro7.y;
        }
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
        return this.B;
    }

    public final ji4 R() {
        return z62.a(u62.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    public final du7 o0(boolean z2) {
        return new bz4(this.x, this.y, this.z, this.A, z2, 32);
    }

    public final fu6 w0(boolean z2) {
        return new bz4(this.x, this.y, this.z, this.A, z2, 32);
    }

    public final fu6 x0(ro7 ro7) {
        ro7.getClass();
        return new bz4(this.x, this.y, this.z, ro7, this.B, this.C);
    }

    /* renamed from: y0 */
    public final bz4 p0(ax3 ax3) {
        p3 p3Var;
        du7 du7;
        ax3.getClass();
        cz4 cz4 = this.y;
        cz4.getClass();
        xp7 d = cz4.w.d(ax3);
        if (cz4.x != null) {
            p3Var = new p3(cz4, false, ax3, 23);
        } else {
            p3Var = null;
        }
        cz4 cz42 = cz4.y;
        if (cz42 == null) {
            cz42 = cz4;
        }
        cz4 cz43 = new cz4(d, (sr2) p3Var, cz42, cz4.z);
        du7 du72 = this.z;
        if (du72 != null) {
            du7 = du72;
        } else {
            du7 = null;
        }
        return new bz4(this.x, cz43, du7, this.A, this.B, 32);
    }

    public bz4(cl0 cl0, cz4 cz4, du7 du7, ro7 ro7, boolean z2, boolean z3) {
        cl0.getClass();
        cz4.getClass();
        ro7.getClass();
        this.x = cl0;
        this.y = cz4;
        this.z = du7;
        this.A = ro7;
        this.B = z2;
        this.C = z3;
    }
}
