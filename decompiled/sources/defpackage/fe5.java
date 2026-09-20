package defpackage;

/* renamed from: fe5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fe5 extends we5 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public fe5(float f2, float f3, float f4, float f5, float f6, float f7) {
        super(2);
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = f6;
        this.h = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fe5)) {
            return false;
        }
        fe5 fe5 = (fe5) obj;
        if (Float.compare(this.c, fe5.c) == 0 && Float.compare(this.d, fe5.d) == 0 && Float.compare(this.e, fe5.e) == 0 && Float.compare(this.f, fe5.f) == 0 && Float.compare(this.g, fe5.g) == 0 && Float.compare(this.h, fe5.h) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + f21.d(this.g, f21.d(this.f, f21.d(this.e, f21.d(this.d, Float.hashCode(this.c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder n = f21.n("CurveTo(x1=", this.c, ", y1=", this.d, ", x2=");
        n.append(this.e);
        n.append(", y2=");
        n.append(this.f);
        n.append(", x3=");
        n.append(this.g);
        n.append(", y3=");
        n.append(this.h);
        n.append(")");
        return n.toString();
    }
}
