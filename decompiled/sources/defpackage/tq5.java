package defpackage;

/* renamed from: tq5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tq5 {
    public final float a;
    public final dc2 b;

    public tq5(float f, dc2 dc2) {
        dc2.getClass();
        this.a = f;
        this.b = dc2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tq5)) {
            return false;
        }
        tq5 tq5 = (tq5) obj;
        if (Float.compare(this.a, tq5.a) == 0 && sg3.e(this.b, tq5.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ProgressableFeature(progress=" + this.a + ", feature=" + this.b + ')';
    }
}
