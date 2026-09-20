package defpackage;

/* renamed from: mc0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mc0 implements kf7 {
    public final iq6 a;
    public final float b;

    public mc0(iq6 iq6, float f) {
        this.a = iq6;
        this.b = f;
    }

    public final float a() {
        return this.b;
    }

    public final long b() {
        int i = jt0.h;
        return jt0.g;
    }

    public final kc0 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mc0)) {
            return false;
        }
        mc0 mc0 = (mc0) obj;
        if (sg3.e(this.a, mc0.a) && Float.compare(this.b, mc0.b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BrushStyle(value=" + this.a + ", alpha=" + this.b + ")";
    }
}
