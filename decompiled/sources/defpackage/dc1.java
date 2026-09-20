package defpackage;

/* renamed from: dc1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dc1 extends ie1 {
    public final ib i0;

    public dc1(g80 g80) {
        this.i0 = g80;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof dc1) && sg3.e(this.i0, ((dc1) obj).i0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.i0.hashCode();
    }

    public final int o(int i, int i2, ey3 ey3, eh5 eh5, int i3) {
        return this.i0.a(i2, i, ey3);
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.i0 + ")";
    }
}
