package defpackage;

/* renamed from: e14  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class e14 {
    public final uq4 a;
    public final x06 b;

    public e14(uq4 uq4, x06 x06) {
        uq4.getClass();
        this.a = uq4;
        this.b = x06;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e14)) {
            return false;
        }
        if (sg3.e(this.a, ((e14) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
