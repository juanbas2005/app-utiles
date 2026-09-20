package defpackage;

/* renamed from: os7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class os7 extends sg6 {
    public final ThreadLocal C;
    private volatile boolean threadLocalIsSet;

    /* JADX WARNING: Illegal instructions before constructor call */
    public os7(f61 f61, e81 e81) {
        super(f61, r0);
        e81 e812;
        pk0 pk0 = pk0.z;
        if (e81.a0(pk0) == null) {
            e812 = e81.X(pk0);
        } else {
            e812 = e81;
        }
        this.C = new ThreadLocal();
        if (!(f61.r().a0(hz2.z) instanceof h81)) {
            Object c = gh7.c(e81, (Object) null);
            gh7.a(e81, c);
            B0(e81, c);
        }
    }

    public final void A0() {
        if (this.threadLocalIsSet) {
            yb5 yb5 = (yb5) this.C.get();
            if (yb5 != null) {
                gh7.a((e81) yb5.w, yb5.x);
            }
            this.C.remove();
        }
    }

    public final void B0(e81 e81, Object obj) {
        this.threadLocalIsSet = true;
        this.C.set(new yb5(e81, obj));
    }

    public final void g(Object obj) {
        A0();
        Object E = hj8.E(obj);
        f61 f61 = this.B;
        e81 r = f61.r();
        os7 os7 = null;
        Object c = gh7.c(r, (Object) null);
        if (c != gh7.a) {
            os7 = su0.R(f61, r, c);
        }
        try {
            f61.f(E);
            if (os7 == null || os7.z0()) {
                gh7.a(r, c);
            }
        } catch (Throwable th) {
            if (os7 == null || os7.z0()) {
                gh7.a(r, c);
            }
            throw th;
        }
    }

    public final void y0() {
        A0();
    }

    public final boolean z0() {
        boolean z;
        if (!this.threadLocalIsSet || this.C.get() != null) {
            z = false;
        } else {
            z = true;
        }
        this.C.remove();
        return !z;
    }
}
