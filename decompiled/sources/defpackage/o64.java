package defpackage;

/* renamed from: o64  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class o64 implements vl2 {
    public final float a;

    public o64(float f) {
        this.a = f;
    }

    public final float a(float f) {
        return f / this.a;
    }

    public final float b(float f) {
        return f * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof o64) && Float.compare(this.a, ((o64) obj).a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "LinearFontScaleConverter(fontScale=" + this.a + ")";
    }
}
