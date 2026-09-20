package defpackage;

/* renamed from: tl5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tl5 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;

    /* JADX WARNING: Illegal instructions before constructor call */
    public tl5(boolean z, fi6 fi6, boolean z2) {
        this(r2, r3);
        int i;
        boolean z3;
        yy0 yy0 = vh.a;
        if (!z) {
            i = 262152;
        } else {
            i = 262144;
        }
        i = fi6 == fi6.x ? i | 8192 : i;
        i = !z2 ? i | 512 : i;
        if (fi6 == fi6.w) {
            z3 = true;
        } else {
            z3 = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r3 = (defpackage.tl5) r3;
     */
    public final boolean equals(Object obj) {
        tl5 tl5;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof tl5) && this.a == tl5.a && this.b == tl5.b && this.c == tl5.c && this.d == tl5.d && this.e == tl5.e && this.f == tl5.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (hl6.i(hl6.i(hl6.i(hl6.i(hl6.i(this.a * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, false) + this.f) * 31;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public tl5(boolean z, int i) {
        this((i & 1) != 0 ? false : z, fi6.w, (i & 8) != 0);
    }

    public tl5(int i, boolean z) {
        this.a = i;
        this.b = z;
        this.c = true;
        this.d = true;
        this.e = true;
        this.f = 1002;
    }
}
