package defpackage;

/* renamed from: ic1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ic1 implements cm7 {
    public final int b;

    public ic1(int i) {
        this.b = i;
        if (i <= 0) {
            h.q("durationMillis must be > 0.");
            throw null;
        }
    }

    public final lm7 a(rt rtVar, t83 t83) {
        if (!(t83 instanceof f77)) {
            return new m05(rtVar, t83);
        }
        if (((f77) t83).c == pe1.w) {
            return new m05(rtVar, t83);
        }
        return new jc1(rtVar, t83, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ic1) || this.b != ((ic1) obj).b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.b * 31);
    }
}
