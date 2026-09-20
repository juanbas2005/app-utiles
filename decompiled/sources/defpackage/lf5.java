package defpackage;

/* renamed from: lf5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lf5 implements a81 {
    public final float a;

    public lf5(float f) {
        this.a = f;
        if (f < 0.0f || f > 100.0f) {
            bc3.a("The percent should be in the range of [0, 100]");
        }
    }

    public final float a(long j, tp1 tp1) {
        return (this.a / 100.0f) * wu6.c(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof lf5) && Float.compare(this.a, ((lf5) obj).a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + "%)";
    }
}
