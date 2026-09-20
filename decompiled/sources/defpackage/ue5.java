package defpackage;

/* renamed from: ue5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ue5 extends we5 {
    public final float c;

    public ue5(float f) {
        super(3);
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ue5) && Float.compare(this.c, ((ue5) obj).c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.c);
    }

    public final String toString() {
        return "RelativeVerticalTo(dy=" + this.c + ")";
    }
}
