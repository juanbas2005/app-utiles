package defpackage;

/* renamed from: fr7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fr7 implements Comparable {
    public final byte w;

    public /* synthetic */ fr7(byte b) {
        this.w = b;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return sg3.k(this.w & 255, ((fr7) obj).w & 255);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof fr7) && this.w == ((fr7) obj).w) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.w);
    }

    public final String toString() {
        return String.valueOf(this.w & 255);
    }
}
