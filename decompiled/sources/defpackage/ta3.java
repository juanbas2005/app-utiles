package defpackage;

/* renamed from: ta3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ta3 {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final float e;
    public final long f;
    public final long g;
    public final boolean h;
    public boolean i;

    public ta3(long j, long j2, long j3, boolean z, float f2, long j4, long j5, boolean z2) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = f2;
        this.f = j4;
        this.g = j5;
        this.h = z2;
    }

    public final String toString() {
        String n = a35.n(this.a);
        String g2 = l35.g(this.c);
        String g3 = l35.g(this.g);
        boolean z = this.i;
        return "IndirectPointerInputChange(id=" + n + ", uptimeMillis=" + this.b + ", position=" + g2 + ", pressed=" + this.d + ", pressure=" + this.e + ", previousUptimeMillis=" + this.f + ", previousPosition=" + g3 + ", previousPressed=" + this.h + ", isConsumed=" + z + ")";
    }
}
