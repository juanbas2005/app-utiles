package defpackage;

/* renamed from: ua0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ua0 {
    public final float a;
    public final ky6 b;

    public ua0(float f, ky6 ky6) {
        this.a = f;
        this.b = ky6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ua0)) {
            return false;
        }
        ua0 ua0 = (ua0) obj;
        if (lx1.b(this.a, ua0.a) && this.b.equals(ua0.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        String c = lx1.c(this.a);
        return "BorderStroke(width=" + c + ", brush=" + this.b + ")";
    }
}
