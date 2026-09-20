package defpackage;

/* renamed from: xo5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class xo5 implements c61 {
    public final /* synthetic */ Class annotationType() {
        return c61.class;
    }

    public final /* synthetic */ byte classIndex() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c61)) {
            return false;
        }
        c61 c61 = (c61) obj;
        if (1 == c61.classIndex() && b61.w == c61.type()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (Byte.hashCode((byte) 1) ^ -815570234) + (b61.w.hashCode() ^ 454102470);
    }

    public final String toString() {
        return "@dev.whyoleg.cryptography.serialization.asn1.ContextSpecificTag(classIndex=1, type=" + b61.w + ')';
    }

    public final /* synthetic */ b61 type() {
        return b61.w;
    }
}
