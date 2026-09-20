package defpackage;

/* renamed from: du3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class du3 extends xt3 {
    public final long a;

    public du3(long j) {
        this.a = j;
    }

    public final Object a() {
        return new qr7(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof du3) && this.a == ((du3) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
