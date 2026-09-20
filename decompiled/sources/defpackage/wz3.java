package defpackage;

/* renamed from: wz3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wz3 implements h24 {
    public final n04 a;
    public final vz3 b;
    public final ig c;

    public wz3(n04 n04, vz3 vz3, ig igVar) {
        this.a = n04;
        this.b = vz3;
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

    public final Object c(int i) {
        return this.b.t(i);
    }

    public final void d(int i, Object obj, yt2 yt2, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        yt2 yt22;
        Object obj2;
        int i6;
        yt2.g0(1493551140);
        if (yt2.e(i)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i3 | i2;
        if (yt2.i(obj)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i8 = i7 | i4;
        if (yt2.g(this)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i9 = i8 | i5;
        if ((i9 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i9 & 1, z)) {
            int i10 = i;
            Object obj3 = obj;
            yt22 = yt2;
            ar7.d(obj3, i10, this.a.q, su0.J(726189336, new ob3(i, 1, (Object) this), yt2), yt22, ((i9 >> 3) & 14) | 3072 | ((i9 << 3) & 112));
            obj2 = obj3;
            i6 = i10;
        } else {
            i6 = i;
            obj2 = obj;
            yt22 = yt2;
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new dj7(this, i6, obj2, i2, 8);
        }
    }

    public final int e(Object obj) {
        return this.c.f(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wz3)) {
            return false;
        }
        return sg3.e(this.b, ((wz3) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
