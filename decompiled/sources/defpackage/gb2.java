package defpackage;

/* renamed from: gb2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gb2 {
    public final float a;
    public final je2 b;

    public gb2(float f, je2 je2) {
        this.a = f;
        this.b = je2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb2)) {
            return false;
        }
        gb2 gb2 = (gb2) obj;
        if (Float.compare(this.a, gb2.a) == 0 && sg3.e(this.b, gb2.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Fade(alpha=" + this.a + ", animationSpec=" + this.b + ")";
    }
}
