package defpackage;

/* renamed from: l57  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class l57 extends iz1 {
    public final float a;
    public final float b;
    public final int c;
    public final int d;

    public l57(float f, float f2, int i, int i2, int i3) {
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l57)) {
            return false;
        }
        l57 l57 = (l57) obj;
        if (this.a == l57.a && this.b == l57.b && this.c == l57.c && this.d == l57.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return f21.e(this.d, f21.e(this.c, f21.d(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        String str;
        String str2 = "Unknown";
        int i = this.c;
        if (i == 0) {
            str = "Butt";
        } else if (i == 1) {
            str = "Round";
        } else if (i == 2) {
            str = "Square";
        } else {
            str = str2;
        }
        int i2 = this.d;
        if (i2 == 0) {
            str2 = "Miter";
        } else if (i2 == 1) {
            str2 = "Round";
        } else if (i2 == 2) {
            str2 = "Bevel";
        }
        return pb4.n(f21.n("Stroke(width=", this.a, ", miter=", this.b, ", cap="), str, ", join=", str2, ", pathEffect=null)");
    }
}
