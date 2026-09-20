package defpackage;

/* renamed from: dn1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dn1 extends f82 {
    public static final dn1 z;
    public n81 y;

    /* JADX WARNING: type inference failed for: r0v0, types: [h81, dn1] */
    static {
        int i = cc7.c;
        int i2 = cc7.d;
        long j = cc7.e;
        String str = cc7.a;
        ? h81 = new h81();
        h81.y = new n81(i, i2, j, str);
        z = h81;
    }

    public final void D(e81 e81, Runnable runnable) {
        n81.l(this.y, runnable, 6);
    }

    public final void V(e81 e81, Runnable runnable) {
        n81.l(this.y, runnable, 2);
    }

    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    public final h81 n0(int i) {
        su0.g(1);
        if (1 >= cc7.c) {
            return this;
        }
        return super.n0(1);
    }

    public final String toString() {
        return "Dispatchers.Default";
    }
}
