package defpackage;

/* renamed from: x36  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class x36 implements o81, v36 {
    public static final pk0 z = new pk0(0);
    public final e81 w;
    public final x36 x = this;
    public volatile e81 y;

    public x36(e81 e81) {
        this.w = e81;
    }

    public final void a() {
        d();
    }

    public final void b() {
        d();
    }

    public final void d() {
        synchronized (this.x) {
            try {
                e81 e81 = this.y;
                if (e81 == null) {
                    this.y = z;
                } else {
                    r16.u(e81, new km2(0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final e81 k() {
        e81 e81;
        e81 e812;
        e81 e813 = this.y;
        if (e813 == null || e813 == z) {
            ny0 ny0 = (ny0) this.w.a0(ny0.x);
            if (ny0 != null) {
                e81 = new w36(ny0, this);
            } else {
                e81 = x32.w;
            }
            synchronized (this.x) {
                try {
                    e81 e814 = this.y;
                    if (e814 == null) {
                        e81 e815 = this.w;
                        e812 = e815.X(new fl3((el3) e815.a0(me6.E))).X(x32.w).X(e81);
                    } else if (e814 == z) {
                        e81 e816 = this.w;
                        fl3 fl3 = new fl3((el3) e816.a0(me6.E));
                        fl3.i(new km2(0));
                        e812 = e816.X(fl3).X(x32.w).X(e81);
                    } else {
                        e812 = e814;
                    }
                    this.y = e812;
                } catch (Throwable th) {
                    throw th;
                }
            }
            e813 = e812;
        }
        e813.getClass();
        return e813;
    }

    public final void c() {
    }
}
