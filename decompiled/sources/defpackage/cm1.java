package defpackage;

import java.util.concurrent.Executor;

/* renamed from: cm1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cm1 extends f82 implements Executor {
    public static final cm1 y = new h81();
    public static final h81 z;

    /* JADX WARNING: type inference failed for: r0v0, types: [h81, cm1] */
    static {
        zs7 zs7 = zs7.y;
        int i = pa7.a;
        if (64 >= i) {
            i = 64;
        }
        z = zs7.n0(ya5.u(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    public final void D(e81 e81, Runnable runnable) {
        z.D(e81, runnable);
    }

    public final void V(e81 e81, Runnable runnable) {
        z.V(e81, runnable);
    }

    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    public final void execute(Runnable runnable) {
        D(x32.w, runnable);
    }

    public final h81 n0(int i) {
        return zs7.y.n0(1);
    }

    public final String toString() {
        return "Dispatchers.IO";
    }
}
