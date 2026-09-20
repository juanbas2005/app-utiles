package defpackage;

/* renamed from: yx3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yx3 implements v36, i81 {
    public final e81 w;
    public final gs2 x;
    public final ig0 y;
    public h27 z;

    public yx3(e81 e81, gs2 gs2) {
        this.w = e81;
        this.x = gs2;
        this.y = gl0.E(e81.X(this));
    }

    public final void B(e81 e81, Throwable th) {
        ny0 ny0 = (ny0) e81.a0(ny0.x);
        if (ny0 != null) {
            tf4.S(th, new f5(13, ny0, this));
        }
        i81 i81 = (i81) this.w.a0(d63.z);
        if (i81 != null) {
            i81.B(e81, th);
            return;
        }
        throw th;
    }

    public final Object G(gs2 gs2, Object obj) {
        return gs2.H(obj, this);
    }

    public final e81 L(d81 d81) {
        return rc9.A0(this, d81);
    }

    public final e81 X(e81 e81) {
        return rc9.D0(this, e81);
    }

    public final void a() {
        h27 h27 = this.z;
        if (h27 != null) {
            h27.j(new km2(1));
        }
        this.z = null;
    }

    public final c81 a0(d81 d81) {
        return rc9.J(this, d81);
    }

    public final void b() {
        h27 h27 = this.z;
        if (h27 != null) {
            h27.j(new km2(1));
        }
        this.z = null;
    }

    public final void c() {
        h27 h27 = this.z;
        if (h27 != null) {
            h27.o(rc9.b("Old job was still running!", (Throwable) null));
        }
        this.z = ar7.H(this.y, (e81) null, (r81) null, this.x, 3);
    }

    public final d81 getKey() {
        return d63.z;
    }
}
