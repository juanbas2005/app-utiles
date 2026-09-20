package defpackage;

/* renamed from: s27  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class s27 implements hl {
    public final hl a;
    public final long b;

    public s27(je2 je2, long j) {
        this.a = je2;
        this.b = j;
    }

    public final m38 a(lo7 lo7) {
        return new t27(this.a.a(lo7), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s27)) {
            return false;
        }
        s27 s27 = (s27) obj;
        if (s27.b != this.b || !sg3.e(s27.a, this.a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
