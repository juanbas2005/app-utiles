package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: h21  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class h21 {
    public HashSet a = null;
    public int b;
    public boolean c;
    public final g31 d;
    public final int e;
    public h21 f;
    public int g = 0;
    public int h = Integer.MIN_VALUE;
    public ly6 i;

    public h21(g31 g31, int i2) {
        this.d = g31;
        this.e = i2;
    }

    public final void a(h21 h21, int i2) {
        b(h21, i2, Integer.MIN_VALUE, false);
    }

    public final boolean b(h21 h21, int i2, int i3, boolean z) {
        if (h21 == null) {
            j();
            return true;
        } else if (!z && !i(h21)) {
            return false;
        } else {
            this.f = h21;
            if (h21.a == null) {
                h21.a = new HashSet();
            }
            HashSet hashSet = this.f.a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.g = i2;
            this.h = i3;
            return true;
        }
    }

    public final void c(int i2, g98 g98, ArrayList arrayList) {
        HashSet hashSet = this.a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                su0.n(((h21) it.next()).d, i2, arrayList, g98);
            }
        }
    }

    public final int d() {
        if (!this.c) {
            return 0;
        }
        return this.b;
    }

    public final int e() {
        h21 h21;
        if (this.d.f0 == 8) {
            return 0;
        }
        int i2 = this.h;
        if (i2 == Integer.MIN_VALUE || (h21 = this.f) == null || h21.d.f0 != 8) {
            return this.g;
        }
        return i2;
    }

    public final h21 f() {
        int i2 = this.e;
        int B = b81.B(i2);
        g31 g31 = this.d;
        switch (B) {
            case b85.b:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return g31.J;
            case 2:
                return g31.K;
            case 3:
                return g31.H;
            case 4:
                return g31.I;
            default:
                throw new AssertionError(f21.x(i2));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((h21) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        if (this.f != null) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0063 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0065 A[RETURN] */
    public final boolean i(h21 h21) {
        boolean z;
        boolean z2;
        if (h21 != null) {
            g31 g31 = h21.d;
            int i2 = h21.e;
            int i3 = this.e;
            if (i2 != i3) {
                switch (b81.B(i3)) {
                    case b85.b:
                    case 7:
                    case 8:
                        break;
                    case 1:
                    case 3:
                        if (i2 == 2 || i2 == 4) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!(g31 instanceof zx2)) {
                            return z;
                        }
                        if (z || i2 == 8) {
                        }
                        break;
                    case 2:
                    case 4:
                        if (i2 == 3 || i2 == 5) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!(g31 instanceof zx2)) {
                            return z2;
                        }
                        if (z2 || i2 == 9) {
                        }
                        break;
                    case 5:
                        if (i2 == 2 || i2 == 4) {
                            return false;
                        }
                    case 6:
                        if (i2 == 6 || i2 == 8 || i2 == 9) {
                        }
                        break;
                    default:
                        throw new AssertionError(f21.x(i3));
                }
            } else if (i3 != 6 || (g31.D && this.d.D)) {
                return true;
            }
            return true;
        }
        return false;
    }

    public final void j() {
        HashSet hashSet;
        h21 h21 = this.f;
        if (!(h21 == null || (hashSet = h21.a) == null)) {
            hashSet.remove(this);
            if (this.f.a.size() == 0) {
                this.f.a = null;
            }
        }
        this.a = null;
        this.f = null;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public final void k() {
        ly6 ly6 = this.i;
        if (ly6 == null) {
            this.i = new ly6(1);
        } else {
            ly6.c();
        }
    }

    public final void l(int i2) {
        this.b = i2;
        this.c = true;
    }

    public final String toString() {
        return this.d.g0 + ":" + f21.x(this.e);
    }
}
