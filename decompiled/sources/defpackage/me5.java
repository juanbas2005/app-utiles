package defpackage;

/* renamed from: me5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class me5 extends we5 {
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final float h;
    public final float i;

    public me5(float f2, float f3, float f4, boolean z, boolean z2, float f5, float f6) {
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
        if (!(obj instanceof me5)) {
            return false;
        }
        me5 me5 = (me5) obj;
        if (Float.compare(this.c, me5.c) == 0 && Float.compare(this.d, me5.d) == 0 && Float.compare(this.e, me5.e) == 0 && this.f == me5.f && this.g == me5.g && Float.compare(this.h, me5.h) == 0 && Float.compare(this.i, me5.i) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.i) + f21.d(this.h, hl6.i(hl6.i(f21.d(this.e, f21.d(this.d, Float.hashCode(this.c) * 31, 31), 31), 31, this.f), 31, this.g), 31);
    }

    public final String toString() {
        StringBuilder n = f21.n("RelativeArcTo(horizontalEllipseRadius=", this.c, ", verticalEllipseRadius=", this.d, ", theta=");
        n.append(this.e);
        n.append(", isMoreThanHalf=");
        n.append(this.f);
        n.append(", isPositiveArc=");
        n.append(this.g);
        n.append(", arcStartDx=");
        n.append(this.h);
        n.append(", arcStartDy=");
        n.append(this.i);
        n.append(")");
        return n.toString();
    }
}
