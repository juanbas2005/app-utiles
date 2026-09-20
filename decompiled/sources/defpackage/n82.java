package defpackage;

/* renamed from: n82  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class n82 {
    public final long a;
    public final long b;

    public n82(long j, long j2) {
        if (j2 == 0) {
            this.a = 0;
            this.b = 1;
            return;
        }
        this.a = j;
        this.b = j2;
    }

    public final String toString() {
        return this.a + "/" + this.b;
    }
}
