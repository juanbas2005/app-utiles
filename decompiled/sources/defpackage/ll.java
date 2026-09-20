package defpackage;

/* renamed from: ll  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ll extends ol {
    public float a;
    public float b;

    public ll(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.b;
    }

    public final int b() {
        return 2;
    }

    public final ol c() {
        return new ll(0.0f, 0.0f);
    }

    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
    }

    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        } else if (i == 1) {
            this.b = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ll)) {
            return false;
        }
        ll llVar = (ll) obj;
        if (llVar.a == this.a && llVar.b == this.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        float f = this.a;
        float f2 = this.b;
        return "AnimationVector2D: v1 = " + f + ", v2 = " + f2;
    }
}
