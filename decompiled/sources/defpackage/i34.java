package defpackage;

/* renamed from: i34  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class i34 implements h24 {
    public final s34 a;
    public final h34 b;
    public final r04 c;
    public final ig d;

    public i34(s34 s34, h34 h34, r04 r04, ig igVar) {
        this.a = s34;
        this.b = h34;
        this.c = r04;
        this.d = igVar;
    }

    public final int a() {
        return this.b.x().b;
    }

    public final Object b(int i) {
        Object g = this.d.g(i);
        if (g == null) {
            return this.b.y(i);
        }
        return g;
    }

    public final Object c(int i) {
        return this.b.t(i);
    }

    public final void d(int i, Object obj, yt2 yt2, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        yt2.g0(-462424778);
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
            ar7.d(obj, i9, this.a.s, su0.J(-824725566, new ob3(i, 2, (Object) this), yt2), yt2, ((i8 >> 3) & 14) | 3072 | ((i8 << 3) & 112));
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new dj7(this, i, obj, i2, 10);
        }
    }

    public final int e(Object obj) {
        return this.d.f(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i34)) {
            return false;
        }
        return sg3.e(this.b, ((i34) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
