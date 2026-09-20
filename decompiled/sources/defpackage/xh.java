package defpackage;

/* renamed from: xh  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xh {
    public boolean a;
    public long b;

    public long a() {
        if (this.a) {
            return Long.MAX_VALUE;
        }
        return Math.max(0, this.b - System.nanoTime());
    }
}
