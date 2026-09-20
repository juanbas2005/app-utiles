package defpackage;

/* renamed from: vn6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vn6 implements h22 {
    public final int a;
    public final int b;

    public vn6(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final void a(i22 i22) {
        int p = z65.p(this.a, 0, ((xs0) i22.B).y());
        int p2 = z65.p(this.b, 0, ((xs0) i22.B).y());
        if (p < p2) {
            i22.f(p, p2);
        } else {
            i22.f(p2, p);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.vn6) r5;
     */
    public final boolean equals(Object obj) {
        vn6 vn6;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof vn6) && this.a == vn6.a && this.b == vn6.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return pb4.k("SetSelectionCommand(start=", this.a, ", end=", this.b, ")");
    }
}
