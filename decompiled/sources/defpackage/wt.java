package defpackage;

/* renamed from: wt  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wt implements zt5 {
    public final int c;

    public wt(int i) {
        this.c = i;
    }

    public final Class annotationType() {
        return zt5.class;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zt5)) {
            return false;
        }
        zt5 zt5 = (zt5) obj;
        if (this.c != zt5.tag() || !yt5.w.equals(zt5.intEncoding())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.c ^ 14552422) + (yt5.w.hashCode() ^ 2041407134);
    }

    public final yt5 intEncoding() {
        return yt5.w;
    }

    public final int tag() {
        return this.c;
    }

    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.c + "intEncoding=" + yt5.w + ')';
    }
}
