package defpackage;

import java.util.List;

/* renamed from: sy2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sy2 implements ll6 {
    public final String a;
    public final ll6 b;
    public final ll6 c;

    public sy2(String str, ll6 ll6, ll6 ll62) {
        this.a = str;
        this.b = ll6;
        this.c = ll62;
    }

    public final String a() {
        return this.a;
    }

    public final int d(String str) {
        str.getClass();
        Integer v0 = k57.v0(str);
        if (v0 != null) {
            return v0.intValue();
        }
        h.q(str.concat(" is not a valid map index"));
        return 0;
    }

    public final int e() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sy2)) {
            return false;
        }
        sy2 sy2 = (sy2) obj;
        if (this.a.equals(sy2.a) && this.b.equals(sy2.b) && this.c.equals(sy2.c)) {
            return true;
        }
        return false;
    }

    public final String f(int i) {
        return String.valueOf(i);
    }

    public final List g(int i) {
        if (i >= 0) {
            return a42.w;
        }
        h.j(f21.l(pb4.o(i, "Illegal index ", ", "), this.a, " expects only non-negative indices"));
        return null;
    }

    public final ll6 h(int i) {
        if (i >= 0) {
            int i2 = i % 2;
            if (i2 == 0) {
                return this.b;
            }
            if (i2 == 1) {
                return this.c;
            }
            h.s("Unreached");
            return null;
        }
        h.j(f21.l(pb4.o(i, "Illegal index ", ", "), this.a, " expects only non-negative indices"));
        return null;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final boolean i(int i) {
        if (i >= 0) {
            return false;
        }
        h.j(f21.l(pb4.o(i, "Illegal index ", ", "), this.a, " expects only non-negative indices"));
        return false;
    }

    public final String toString() {
        return this.a + '(' + this.b + ", " + this.c + ')';
    }

    public final n85 u() {
        return n57.n;
    }
}
