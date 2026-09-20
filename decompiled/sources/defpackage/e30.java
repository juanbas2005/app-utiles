package defpackage;

/* renamed from: e30  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class e30 {
    public final float a;
    public final float b;
    public final float c;
    public final int d;
    public final long e;

    public e30(qv4 qv4) {
        qv4.getClass();
        float f = qv4.c;
        float f2 = qv4.d;
        float f3 = qv4.b;
        int i = qv4.a;
        long j = qv4.e;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = i;
        this.e = j;
    }

    public final String toString() {
        return "BackEventCompat(touchX=" + this.a + ", touchY=" + this.b + ", progress=" + this.c + ", swipeEdge=" + this.d + ", frameTimeMillis=" + this.e + ')';
    }
}
