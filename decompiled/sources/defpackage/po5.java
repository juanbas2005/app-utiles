package defpackage;

import java.util.List;

/* renamed from: po5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class po5 implements ll6 {
    public final String a;
    public final no5 b;

    public po5(String str, no5 no5) {
        no5.getClass();
        this.a = str;
        this.b = no5;
    }

    public final String a() {
        return this.a;
    }

    public final void b() {
        throw new IllegalStateException(f21.l(new StringBuilder("Primitive descriptor "), this.a, " does not have elements"));
    }

    public final int d(String str) {
        str.getClass();
        b();
        throw null;
    }

    public final int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof po5)) {
            return false;
        }
        po5 po5 = (po5) obj;
        if (!this.a.equals(po5.a) || !sg3.e(this.b, po5.b)) {
            return false;
        }
        return true;
    }

    public final String f(int i) {
        b();
        throw null;
    }

    public final List g(int i) {
        b();
        throw null;
    }

    public final ll6 h(int i) {
        b();
        throw null;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final boolean i(int i) {
        b();
        throw null;
    }

    public final String toString() {
        return hl6.o(new StringBuilder("PrimitiveDescriptor("), this.a, ')');
    }

    public final n85 u() {
        return this.b;
    }
}
