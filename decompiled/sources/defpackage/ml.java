package defpackage;

/* renamed from: ml  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ml extends ol {
    public float a;
    public float b;
    public float c;

    public ml(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        if (i != 2) {
            return 0.0f;
        }
        return this.c;
    }

    public final int b() {
        return 3;
    }

    public final ol c() {
        return new ml(0.0f, 0.0f, 0.0f);
    }

    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
    }

    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        } else if (i == 1) {
            this.b = f;
        } else if (i == 2) {
            this.c = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ml)) {
            return false;
        }
        ml mlVar = (ml) obj;
        if (mlVar.a == this.a && mlVar.b == this.b && mlVar.c == this.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + f21.d(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        float f = this.a;
        float f2 = this.b;
        float f3 = this.c;
        StringBuilder n = f21.n("AnimationVector3D: v1 = ", f, ", v2 = ", f2, ", v3 = ");
        n.append(f3);
        return n.toString();
    }
}
