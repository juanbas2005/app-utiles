package defpackage;

/* renamed from: bu3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bu3 extends xt3 {
    public final byte a;

    public bu3(byte b) {
        this.a = b;
    }

    public final Object a() {
        return new fr7(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof bu3) && this.a == ((bu3) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.a);
    }
}
