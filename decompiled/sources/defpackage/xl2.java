package defpackage;

import java.util.Arrays;

/* renamed from: xl2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xl2 implements vl2 {
    public final float[] a;
    public final float[] b;

    public xl2(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            h.q("Array lengths must match and be nonzero");
            throw null;
        }
        this.a = fArr;
        this.b = fArr2;
    }

    public final float a(float f) {
        return kw5.h(f, this.b, this.a);
    }

    public final float b(float f) {
        return kw5.h(f, this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof xl2)) {
            return false;
        }
        xl2 xl2 = (xl2) obj;
        if (!Arrays.equals(this.a, xl2.a) || !Arrays.equals(this.b, xl2.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.a);
        arrays.getClass();
        String arrays2 = Arrays.toString(this.b);
        arrays2.getClass();
        return "FontScaleConverter{fromSpValues=" + arrays + ", toDpValues=" + arrays2 + "}";
    }
}
