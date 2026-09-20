package defpackage;

import java.util.ArrayList;

/* renamed from: by0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class by0 {
    public final yt2 a;
    public bn0 b;
    public boolean c;
    public final xe3 d = new xe3();
    public boolean e = true;
    public int f;
    public int g;
    public final ArrayList h = new ArrayList();
    public int i = -1;
    public int j = -1;
    public int k = -1;
    public int l;

    public by0(yt2 yt2, bn0 bn0) {
        this.a = yt2;
        this.b = bn0;
    }

    public final void a() {
        c();
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            arrayList.remove(arrayList.size() - 1);
        } else {
            this.g++;
        }
    }

    public final void b() {
        int i2 = this.g;
        if (i2 > 0) {
            j75 j75 = this.b.u;
            j75.s(d75.d);
            j75.i[j75.j - j75.g[j75.h - 1].b] = i2;
            this.g = 0;
        }
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            bn0 bn0 = this.b;
            int size = arrayList.size();
            Object[] objArr = new Object[size];
            for (int i3 = 0; i3 < size; i3++) {
                objArr[i3] = arrayList.get(i3);
            }
            bn0.getClass();
            if (size != 0) {
                j75 j752 = bn0.u;
                j752.s(c65.d);
                i75.l(j752, 0, objArr);
            }
            arrayList.clear();
        }
    }

    public final void c() {
        int i2 = this.l;
        if (i2 > 0) {
            int i3 = this.i;
            if (i3 >= 0) {
                b();
                j75 j75 = this.b.u;
                j75.s(s65.d);
                int i4 = j75.j - j75.g[j75.h - 1].b;
                int[] iArr = j75.i;
                iArr[i4] = i3;
                iArr[i4 + 1] = i2;
                this.i = -1;
            } else {
                int i5 = this.k;
                int i6 = this.j;
                b();
                j75 j752 = this.b.u;
                j752.s(n65.d);
                int i7 = j752.j - j752.g[j752.h - 1].b;
                int[] iArr2 = j752.i;
                iArr2[i7 + 1] = i5;
                iArr2[i7] = i6;
                iArr2[i7 + 2] = i2;
                this.j = -1;
                this.k = -1;
            }
            this.l = 0;
        }
    }

    public final void d(boolean z) {
        int i2;
        fv6 fv6 = this.a.G;
        if (z) {
            i2 = fv6.i;
        } else {
            i2 = fv6.g;
        }
        int i3 = i2 - this.f;
        if (i3 < 0) {
            ey0.a("Tried to seek backward");
        }
        if (i3 > 0) {
            j75 j75 = this.b.u;
            j75.s(v55.d);
            j75.i[j75.j - j75.g[j75.h - 1].b] = i3;
            this.f = i2;
        }
    }

    public final void e() {
        fv6 fv6 = this.a.G;
        if (fv6.c > 0) {
            int i2 = fv6.i;
            xe3 xe3 = this.d;
            if (xe3.a(-2) != i2) {
                if (!this.c && this.e) {
                    d(false);
                    this.b.u.s(i65.d);
                    this.c = true;
                }
                if (i2 > 0) {
                    st2 a2 = fv6.a(i2);
                    xe3.c(i2);
                    d(false);
                    j75 j75 = this.b.u;
                    j75.s(h65.d);
                    i75.l(j75, 0, a2);
                    this.c = true;
                }
            }
        }
    }

    public final void f(int i2, int i3) {
        boolean z;
        if (i3 > 0) {
            if (i2 >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                ey0.a("Invalid remove index " + i2);
            }
            if (this.i == i2) {
                this.l += i3;
                return;
            }
            c();
            this.i = i2;
            this.l = i3;
        }
    }
}
