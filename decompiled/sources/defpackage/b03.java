package defpackage;

/* renamed from: b03  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class b03 {
    public final long a;
    public final long b;
    public final float c;
    public final long d;
    public final long e;

    public b03(long j, long j2, float f, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = f;
        this.d = j3;
        this.e = j4;
    }

    public final String toString() {
        String g = l35.g(this.b);
        String g2 = l35.g(this.d);
        return "HistoricalChange(uptimeMillis=" + this.a + ", position=" + g + ", scaleFactor=" + this.c + ", panOffset=" + g2 + ")";
    }
}
