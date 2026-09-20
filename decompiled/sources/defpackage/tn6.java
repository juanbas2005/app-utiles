package defpackage;

/* renamed from: tn6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tn6 implements h22 {
    public final int a;
    public final int b;

    public tn6(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final void a(i22 i22) {
        boolean z;
        if (i22.z != -1) {
            z = true;
        } else {
            z = false;
        }
        xs0 xs0 = (xs0) i22.B;
        if (z) {
            i22.z = -1;
            i22.A = -1;
        }
        int p = z65.p(this.a, 0, xs0.y());
        int p2 = z65.p(this.b, 0, xs0.y());
        if (p == p2) {
            return;
        }
        if (p < p2) {
            i22.e(p, p2);
        } else {
            i22.e(p2, p);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.tn6) r5;
     */
    public final boolean equals(Object obj) {
        tn6 tn6;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof tn6) && this.a == tn6.a && this.b == tn6.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return pb4.k("SetComposingRegionCommand(start=", this.a, ", end=", this.b, ")");
    }
}
