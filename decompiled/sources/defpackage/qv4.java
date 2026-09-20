package defpackage;

/* renamed from: qv4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qv4 {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;

    public qv4(int i, float f, float f2, float f3, long j) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qv4.class == obj.getClass()) {
            qv4 qv4 = (qv4) obj;
            if (this.c == qv4.c && this.d == qv4.d && this.b == qv4.b && this.a == qv4.a && this.e == qv4.e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + f21.e(this.a, f21.d(this.b, f21.d(this.d, Float.hashCode(this.c) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.c + ", touchY=" + this.d + ", progress=" + this.b + ", swipeEdge=" + this.a + ", frameTimeMillis=" + this.e + ')';
    }
}
