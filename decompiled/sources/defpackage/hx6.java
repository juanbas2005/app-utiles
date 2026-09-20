package defpackage;

/* renamed from: hx6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hx6 implements v02 {
    public final int a;

    public hx6(int i) {
        this.a = i;
    }

    public final o38 a(lo7 lo7) {
        return new bc4(this.a, 7);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hx6) || ((hx6) obj).a != this.a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }
}
