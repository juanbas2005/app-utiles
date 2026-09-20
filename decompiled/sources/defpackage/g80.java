package defpackage;

/* renamed from: g80  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class g80 implements ib {
    public final float a;

    public g80(float f) {
        this.a = f;
    }

    public final int a(int i, int i2, ey3 ey3) {
        float f = ((float) (i2 - i)) / 2.0f;
        ey3 ey32 = ey3.w;
        float f2 = this.a;
        if (ey3 != ey32) {
            f2 *= -1.0f;
        }
        return Math.round((1.0f + f2) * f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof g80) && Float.compare(this.a, ((g80) obj).a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "Horizontal(bias=" + this.a + ")";
    }
}
