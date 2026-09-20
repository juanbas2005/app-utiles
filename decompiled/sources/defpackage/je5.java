package defpackage;

/* renamed from: je5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class je5 extends we5 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public je5(float f2, float f3, float f4, float f5) {
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
        if (!(obj instanceof je5)) {
            return false;
        }
        je5 je5 = (je5) obj;
        if (Float.compare(this.c, je5.c) == 0 && Float.compare(this.d, je5.d) == 0 && Float.compare(this.e, je5.e) == 0 && Float.compare(this.f, je5.f) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + f21.d(this.e, f21.d(this.d, Float.hashCode(this.c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder n = f21.n("QuadTo(x1=", this.c, ", y1=", this.d, ", x2=");
        n.append(this.e);
        n.append(", y2=");
        n.append(this.f);
        n.append(")");
        return n.toString();
    }
}
