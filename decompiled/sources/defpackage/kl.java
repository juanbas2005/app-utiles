package defpackage;

/* renamed from: kl  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kl extends ol {
    public float a;

    public kl(float f) {
        this.a = f;
    }

    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        return 0.0f;
    }

    public final int b() {
        return 1;
    }

    public final ol c() {
        return new kl(0.0f);
    }

    public final void d() {
        this.a = 0.0f;
    }

    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kl) || ((kl) obj).a != this.a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        float f = this.a;
        return "AnimationVector1D: value = " + f;
    }
}
