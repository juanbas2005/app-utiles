package defpackage;

/* renamed from: ec1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ec1 extends ie1 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec1)) {
            return false;
        }
        h80 h80 = xb4.H;
        if (!h80.equals(h80)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f);
    }

    public final int o(int i, int i2, ey3 ey3, eh5 eh5, int i3) {
        return Math.round((1.0f - 4.0f) * (((float) (i - i2)) / 2.0f));
    }

    public final String toString() {
        h80 h80 = xb4.H;
        return "VerticalCrossAxisAlignment(vertical=" + h80 + ")";
    }
}
