package defpackage;

/* renamed from: mx1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mx1 implements a81 {
    public final float a;

    public mx1(float f) {
        this.a = f;
    }

    public final float a(long j, tp1 tp1) {
        return tp1.e0(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof mx1) && lx1.b(this.a, ((mx1) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + ".dp)";
    }
}
