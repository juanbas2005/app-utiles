package defpackage;

/* renamed from: sh2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sh2 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public sh2(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof sh2)) {
            return false;
        }
        sh2 sh2 = (sh2) obj;
        if (lx1.b(this.a, sh2.a) && lx1.b(this.b, sh2.b) && lx1.b(this.c, sh2.c)) {
            return lx1.b(this.d, sh2.d);
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + f21.d(this.c, f21.d(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }
}
