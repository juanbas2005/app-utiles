package defpackage;

/* renamed from: qi0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qi0 {
    public final up2 a;
    public final uq4 b;

    static {
        uq4 uq4 = oz6.f;
        up2 up2 = up2.c;
        dh4.I(uq4);
    }

    public qi0(up2 up2, uq4 uq4) {
        up2.getClass();
        this.a = up2;
        this.b = uq4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qi0)) {
            return false;
        }
        qi0 qi0 = (qi0) obj;
        if (!sg3.e(this.a, qi0.a) || !this.b.equals(qi0.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + 527) * 961);
    }

    public final String toString() {
        return k57.r0(this.a.a.a, '.', '/') + "/" + this.b;
    }
}
