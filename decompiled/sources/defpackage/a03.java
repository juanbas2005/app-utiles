package defpackage;

/* renamed from: a03  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class a03 {
    public final ly5 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public a03(ly5 ly5, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = ly5;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a03)) {
            return false;
        }
        a03 a03 = (a03) obj;
        if (this.a.equals(a03.a) && this.b == a03.b && this.c == a03.c && this.d == a03.d && this.e == a03.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + hl6.i(hl6.i(hl6.i(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "HingeInfo(bounds=" + this.a + ", isFlat=" + this.b + ", isVertical=" + this.c + ", isSeparating=" + this.d + ", isOccluding=" + this.e + ')';
    }
}
