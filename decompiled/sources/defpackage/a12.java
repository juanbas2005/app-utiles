package defpackage;

/* renamed from: a12  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class a12 implements la5 {
    public final la5 a;
    public final la5 b;
    public float c;

    public a12(la5 la5, la5 la52, boolean z) {
        float f;
        this.a = la5;
        this.b = la52;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        this.c = f;
    }

    public final float a() {
        return we.E(this.a.a(), this.b.a(), this.c);
    }

    public final float b(ey3 ey3) {
        return we.E(this.a.b(ey3), this.b.b(ey3), this.c);
    }

    public final float c(ey3 ey3) {
        return we.E(this.a.c(ey3), this.b.c(ey3), this.c);
    }

    public final float d() {
        return we.E(this.a.d(), this.b.d(), this.c);
    }
}
