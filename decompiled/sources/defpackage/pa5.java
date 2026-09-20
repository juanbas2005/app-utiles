package defpackage;

/* renamed from: pa5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pa5 implements la5 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public pa5(float f, float f2, float f3, float f4) {
        boolean z;
        boolean z2;
        boolean z3;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        boolean z4 = false;
        if (f >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (f2 >= 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = z & z2;
        if (f3 >= 0.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!(z5 & z3) || !(f4 >= 0.0f ? true : z4)) {
            wb3.a("Padding must be non-negative");
        }
    }

    public final float a() {
        return this.d;
    }

    public final float b(ey3 ey3) {
        if (ey3 == ey3.w) {
            return this.a;
        }
        return this.c;
    }

    public final float c(ey3 ey3) {
        if (ey3 == ey3.w) {
            return this.c;
        }
        return this.a;
    }

    public final float d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pa5)) {
            return false;
        }
        pa5 pa5 = (pa5) obj;
        if (!lx1.b(this.a, pa5.a) || !lx1.b(this.b, pa5.b) || !lx1.b(this.c, pa5.c) || !lx1.b(this.d, pa5.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + f21.d(this.c, f21.d(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        String c2 = lx1.c(this.a);
        String c3 = lx1.c(this.b);
        return pb4.n(f21.o("PaddingValues(start=", c2, ", top=", c3, ", end="), lx1.c(this.c), ", bottom=", lx1.c(this.d), ")");
    }
}
