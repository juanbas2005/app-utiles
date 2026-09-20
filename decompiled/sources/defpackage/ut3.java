package defpackage;

/* renamed from: ut3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ut3 extends xt3 {
    public final float a;

    public ut3(float f) {
        this.a = f;
    }

    public final Object a() {
        return Float.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ut3) && Float.compare(this.a, ((ut3) obj).a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }
}
