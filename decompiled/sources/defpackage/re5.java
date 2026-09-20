package defpackage;

/* renamed from: re5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class re5 extends we5 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public re5(float f2, float f3, float f4, float f5) {
        super(1);
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof re5)) {
            return false;
        }
        re5 re5 = (re5) obj;
        if (Float.compare(this.c, re5.c) == 0 && Float.compare(this.d, re5.d) == 0 && Float.compare(this.e, re5.e) == 0 && Float.compare(this.f, re5.f) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + f21.d(this.e, f21.d(this.d, Float.hashCode(this.c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder n = f21.n("RelativeQuadTo(dx1=", this.c, ", dy1=", this.d, ", dx2=");
        n.append(this.e);
        n.append(", dy2=");
        n.append(this.f);
        n.append(")");
        return n.toString();
    }
}
