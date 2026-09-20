package defpackage;

/* renamed from: yx5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yx5 {
    public zx5 a;
    public int b;
    public st2 c;
    public gs2 d;
    public int e;
    public hp4 f;
    public tp4 g;

    public yx5(zx5 zx5) {
        this.a = zx5;
    }

    public final boolean a() {
        boolean z;
        if (this.a != null) {
            st2 st2 = this.c;
            if (st2 != null) {
                z = st2.a();
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final dh3 b(Object obj) {
        dh3 p;
        zx5 zx5 = this.a;
        if (zx5 == null || (p = zx5.p(this, obj)) == null) {
            return dh3.w;
        }
        return p;
    }

    public final void c() {
        zx5 zx5 = this.a;
        if (zx5 != null) {
            zx5.d();
        }
        this.a = null;
        this.f = null;
        this.g = null;
        this.d = null;
    }

    public final void d(boolean z) {
        int i;
        int i2 = this.b;
        if (z) {
            i = i2 | 32;
        } else {
            i = i2 & -33;
        }
        this.b = i;
    }

    public final void e(gs2 gs2) {
        this.d = gs2;
    }
}
