package defpackage;

/* renamed from: qe5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qe5 extends we5 {
    public final float c;
    public final float d;

    public qe5(float f, float f2) {
        super(3);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qe5)) {
            return false;
        }
        qe5 qe5 = (qe5) obj;
        if (Float.compare(this.c, qe5.c) == 0 && Float.compare(this.d, qe5.d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        return "RelativeMoveTo(dx=" + this.c + ", dy=" + this.d + ")";
    }
}
