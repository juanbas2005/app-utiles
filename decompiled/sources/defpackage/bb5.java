package defpackage;

/* renamed from: bb5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bb5 implements h24 {
    public final ob5 a;
    public final uq3 b;
    public final ig c;

    public bb5(ob5 ob5, ab5 ab5, ig igVar) {
        this.a = ob5;
        this.b = ab5;
        this.c = igVar;
    }

    public final int a() {
        return this.b.x().b;
    }

    public final Object b(int i) {
        Object g = this.c.g(i);
        if (g == null) {
            return this.b.y(i);
        }
        return g;
    }

    public final void d(int i, Object obj, yt2 yt2, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        yt2.g0(-1201380429);
        if (yt2.e(i)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i3 | i2;
        if (yt2.i(obj)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if (yt2.g(this)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i8 = i7 | i5;
        if ((i8 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i8 & 1, z)) {
            int i9 = i;
            ar7.d(obj, i9, this.a.z, su0.J(1142237095, new ob3(i, 4, (Object) this), yt2), yt2, ((i8 >> 3) & 14) | 3072 | ((i8 << 3) & 112));
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new dj7(this, i, obj, i2, 12);
        }
    }

    public final int e(Object obj) {
        return this.c.f(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb5)) {
            return false;
        }
        return sg3.e(this.b, ((bb5) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
