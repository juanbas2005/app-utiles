package defpackage;

/* renamed from: al7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class al7 {
    public final long a;
    public final long b;
    public final boolean c;

    public al7(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final al7 a(al7 al7) {
        boolean z;
        long e = l35.e(this.a, al7.a);
        long max = Math.max(this.b, al7.b);
        if (this.c || al7.c) {
            z = true;
        } else {
            z = false;
        }
        return new al7(e, max, z);
    }
}
