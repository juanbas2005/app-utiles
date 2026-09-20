package defpackage;

/* renamed from: de5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class de5 extends we5 {
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final float h;
    public final float i;

    public de5(float f2, float f3, float f4, boolean z, boolean z2, float f5, float f6) {
        super(3);
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = z;
        this.g = z2;
        this.h = f5;
        this.i = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof de5)) {
            return false;
        }
        de5 de5 = (de5) obj;
        if (Float.compare(this.c, de5.c) == 0 && Float.compare(this.d, de5.d) == 0 && Float.compare(this.e, de5.e) == 0 && this.f == de5.f && this.g == de5.g && Float.compare(this.h, de5.h) == 0 && Float.compare(this.i, de5.i) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.i) + f21.d(this.h, hl6.i(hl6.i(f21.d(this.e, f21.d(this.d, Float.hashCode(this.c) * 31, 31), 31), 31, this.f), 31, this.g), 31);
    }

    public final String toString() {
        StringBuilder n = f21.n("ArcTo(horizontalEllipseRadius=", this.c, ", verticalEllipseRadius=", this.d, ", theta=");
        n.append(this.e);
        n.append(", isMoreThanHalf=");
        n.append(this.f);
        n.append(", isPositiveArc=");
        n.append(this.g);
        n.append(", arcStartX=");
        n.append(this.h);
        n.append(", arcStartY=");
        n.append(this.i);
        n.append(")");
        return n.toString();
    }
}
