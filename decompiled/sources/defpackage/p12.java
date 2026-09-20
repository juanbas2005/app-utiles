package defpackage;

/* renamed from: p12  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class p12 implements c61 {
    public final /* synthetic */ byte c;

    public p12(byte b) {
        this.c = b;
    }

    public final /* synthetic */ Class annotationType() {
        return c61.class;
    }

    public final /* synthetic */ byte classIndex() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c61)) {
            return false;
        }
        c61 c61 = (c61) obj;
        if (this.c == c61.classIndex() && b61.x == c61.type()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (Byte.hashCode(this.c) ^ -815570234) + (b61.x.hashCode() ^ 454102470);
    }

    public final String toString() {
        return "@dev.whyoleg.cryptography.serialization.asn1.ContextSpecificTag(classIndex=" + this.c + ", type=" + b61.x + ')';
    }

    public final /* synthetic */ b61 type() {
        return b61.x;
    }
}
