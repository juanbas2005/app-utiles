package defpackage;

/* renamed from: wa7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wa7 {
    public final float a;
    public final float b;
    public final float c;

    public wa7(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wa7)) {
            return false;
        }
        wa7 wa7 = (wa7) obj;
        if (lx1.b(this.a, wa7.a) && lx1.b(this.b, wa7.b) && lx1.b(this.c, wa7.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + f21.d(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        float f = this.a;
        String c2 = lx1.c(f);
        float f2 = this.b;
        String c3 = lx1.c(f + f2);
        return pb4.n(f21.o("TabPosition(left=", c2, ", right=", c3, ", width="), lx1.c(f2), ", contentWidth=", lx1.c(this.c), ")");
    }
}
