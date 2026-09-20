package defpackage;

import java.util.List;

/* renamed from: x74  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class x74 implements ll6 {
    public final ll6 a;

    public x74(ll6 ll6) {
        this.a = ll6;
    }

    public final int d(String str) {
        str.getClass();
        Integer v0 = k57.v0(str);
        if (v0 != null) {
            return v0.intValue();
        }
        h.q(str.concat(" is not a valid list index"));
        return 0;
    }

    public final int e() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x74)) {
            return false;
        }
        x74 x74 = (x74) obj;
        if (!sg3.e(this.a, x74.a) || !sg3.e(a(), x74.a())) {
            return false;
        }
        return true;
    }

    public final String f(int i) {
        return String.valueOf(i);
    }

    public final List g(int i) {
        if (i >= 0) {
            return a42.w;
        }
        rf2.u(pb4.o(i, "Illegal index ", ", "), a(), " expects only non-negative indices");
        return null;
    }

    public final ll6 h(int i) {
        if (i >= 0) {
            return this.a;
        }
        rf2.u(pb4.o(i, "Illegal index ", ", "), a(), " expects only non-negative indices");
        return null;
    }

    public final int hashCode() {
        return a().hashCode() + (this.a.hashCode() * 31);
    }

    public final boolean i(int i) {
        if (i >= 0) {
            return false;
        }
        rf2.u(pb4.o(i, "Illegal index ", ", "), a(), " expects only non-negative indices");
        return false;
    }

    public final String toString() {
        return a() + '(' + this.a + ')';
    }

    public final n85 u() {
        return n57.m;
    }
}
