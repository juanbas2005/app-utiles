package defpackage;

import java.util.ArrayList;

/* renamed from: fv6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fv6 {
    public final gv6 a;
    public final int[] b;
    public final int c;
    public Object[] d;
    public final int e;
    public boolean f;
    public int g;
    public int h;
    public int i = -1;
    public final xe3 j = new xe3();
    public int k;
    public int l;
    public int m;
    public boolean n;

    public fv6(gv6 gv6) {
        this.a = gv6;
        this.b = gv6.w;
        int i2 = gv6.x;
        this.c = i2;
        this.d = gv6.y;
        this.e = gv6.z;
        this.h = i2;
    }

    public final st2 a(int i2) {
        ArrayList arrayList = this.a.E;
        int e2 = iv6.e(arrayList, i2, this.c);
        if (e2 >= 0) {
            return (st2) arrayList.get(e2);
        }
        st2 st2 = new st2(i2);
        arrayList.add(-(e2 + 1), st2);
        return st2;
    }

    public final Object b(int[] iArr, int i2) {
        int i3;
        int i4 = i2 * 5;
        int i5 = iArr[i4 + 1];
        if ((268435456 & i5) == 0) {
            return ay0.a;
        }
        Object[] objArr = this.d;
        if (i4 >= iArr.length) {
            i3 = iArr.length;
        } else {
            i3 = iArr[i4 + 4] + Integer.bitCount(i5 >> 29);
        }
        return objArr[i3];
    }

    public final void c() {
        this.f = true;
        gv6 gv6 = this.a;
        if (gv6.A <= 0) {
            ey0.a("Unexpected reader close()");
        }
        gv6.A--;
        this.d = new Object[0];
    }

    public final boolean d(int i2) {
        if ((this.b[(i2 * 5) + 1] & 67108864) != 0) {
            return true;
        }
        return false;
    }

    public final void e() {
        int i2;
        int i3;
        if (this.k == 0) {
            if (this.g != this.h) {
                ey0.a("endGroup() not called at the end of a group");
            }
            int[] iArr = this.b;
            int i4 = iArr[(this.i * 5) + 2];
            this.i = i4;
            int i5 = this.c;
            if (i4 < 0) {
                i2 = i5;
            } else {
                i2 = iArr[(i4 * 5) + 3] + i4;
            }
            this.h = i2;
            int b2 = this.j.b();
            if (b2 < 0) {
                this.l = 0;
                this.m = 0;
                return;
            }
            this.l = b2;
            if (i4 >= i5 - 1) {
                i3 = this.e;
            } else {
                i3 = iArr[((i4 + 1) * 5) + 4];
            }
            this.m = i3;
        }
    }

    public final Object f() {
        int i2 = this.g;
        if (i2 < this.h) {
            return b(this.b, i2);
        }
        return 0;
    }

    public final int g() {
        int i2 = this.g;
        if (i2 >= this.h) {
            return 0;
        }
        return this.b[i2 * 5];
    }

    public final Object h(int i2, int i3) {
        int i4;
        int[] iArr = this.b;
        int b2 = iv6.b(iArr, i2);
        int i5 = i2 + 1;
        if (i5 < this.c) {
            i4 = iArr[(i5 * 5) + 4];
        } else {
            i4 = this.e;
        }
        int i6 = b2 + i3;
        if (i6 < i4) {
            return this.d[i6];
        }
        return ay0.a;
    }

    public final int i(int i2) {
        return this.b[i2 * 5];
    }

    public final boolean j(int i2) {
        if ((this.b[(i2 * 5) + 1] & 134217728) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k(int i2) {
        if ((this.b[(i2 * 5) + 1] & 536870912) != 0) {
            return true;
        }
        return false;
    }

    public final boolean l(int i2) {
        if ((this.b[(i2 * 5) + 1] & 1073741824) != 0) {
            return true;
        }
        return false;
    }

    public final Object m() {
        int i2;
        if (this.k > 0 || (i2 = this.l) >= this.m) {
            this.n = false;
            return ay0.a;
        }
        this.n = true;
        Object[] objArr = this.d;
        this.l = i2 + 1;
        return objArr[i2];
    }

    public final Object n(int i2) {
        int i3 = i2 * 5;
        int[] iArr = this.b;
        int i4 = iArr[i3 + 1] & 1073741824;
        if (i4 == 0) {
            return null;
        }
        if (i4 != 0) {
            return this.d[iArr[i3 + 4]];
        }
        return ay0.a;
    }

    public final int o(int i2) {
        return this.b[(i2 * 5) + 1] & 67108863;
    }

    public final Object p(int[] iArr, int i2) {
        int i3 = i2 * 5;
        int i4 = iArr[i3 + 1];
        if ((536870912 & i4) == 0) {
            return null;
        }
        return this.d[Integer.bitCount(i4 >> 30) + iArr[i3 + 4]];
    }

    public final int q(int i2) {
        return this.b[(i2 * 5) + 2];
    }

    public final void r(int i2) {
        int i3;
        if (this.k != 0) {
            ey0.a("Cannot reposition while in an empty region");
        }
        this.g = i2;
        int[] iArr = this.b;
        int i4 = this.c;
        if (i2 < i4) {
            i3 = iArr[(i2 * 5) + 2];
        } else {
            i3 = -1;
        }
        if (i3 != this.i) {
            this.i = i3;
            if (i3 < 0) {
                this.h = i4;
            } else {
                this.h = iArr[(i3 * 5) + 3] + i3;
            }
            this.l = 0;
            this.m = 0;
        }
    }

    public final int s() {
        int i2;
        if (this.k != 0) {
            ey0.a("Cannot skip while in an empty region");
        }
        int i3 = this.g;
        int i4 = i3 * 5;
        int[] iArr = this.b;
        int i5 = iArr[i4 + 1];
        if ((1073741824 & i5) != 0) {
            i2 = 1;
        } else {
            i2 = i5 & 67108863;
        }
        this.g = iArr[i4 + 3] + i3;
        return i2;
    }

    public final void t() {
        boolean z;
        if (this.k == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            ey0.a("Cannot skip the enclosing group while in an empty region");
        }
        this.g = this.h;
        this.l = 0;
        this.m = 0;
    }

    public final String toString() {
        int i2 = this.g;
        int g2 = g();
        int i3 = this.i;
        int i4 = this.h;
        StringBuilder p = pb4.p("SlotReader(current=", i2, ", key=", g2, ", parent=");
        p.append(i3);
        p.append(", end=");
        p.append(i4);
        p.append(")");
        return p.toString();
    }

    public final void u() {
        int i2;
        if (this.k <= 0) {
            int i3 = this.i;
            int i4 = this.g;
            int i5 = i4 * 5;
            int[] iArr = this.b;
            if (iArr[i5 + 2] != i3) {
                vm5.a("Invalid slot table detected");
            }
            int i6 = this.l;
            int i7 = this.m;
            xe3 xe3 = this.j;
            if (i6 == 0 && i7 == 0) {
                xe3.c(-1);
            } else {
                xe3.c(i6);
            }
            this.i = i4;
            this.h = iArr[i5 + 3] + i4;
            int i8 = i4 + 1;
            this.g = i8;
            this.l = iv6.b(iArr, i4);
            if (i4 >= this.c - 1) {
                i2 = this.e;
            } else {
                i2 = iArr[(i8 * 5) + 4];
            }
            this.m = i2;
        }
    }
}
