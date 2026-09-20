package defpackage;

/* renamed from: wu1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wu1 {
    public final boolean a;
    public final boolean b;
    public final fi6 c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final int g;

    public wu1(boolean z, boolean z2, boolean z3, boolean z4, int i) {
        z = (i & 1) != 0 ? true : z;
        z2 = (i & 2) != 0 ? true : z2;
        this.a = z;
        this.b = z2;
        this.c = fi6.w;
        this.d = z3;
        this.e = z4;
        this.f = "";
        this.g = 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r3 = (defpackage.wu1) r3;
     */
    public final boolean equals(Object obj) {
        wu1 wu1;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof wu1) && this.a == wu1.a && this.b == wu1.b && this.c == wu1.c && this.d == wu1.d && this.e == wu1.e && this.g == wu1.g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (hl6.i(hl6.i((this.c.hashCode() + hl6.i(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e) + this.g) * 31;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public wu1(int i) {
        this((i & 1) != 0, (i & 2) != 0, (i & 4) != 0, true, 224);
    }
}
