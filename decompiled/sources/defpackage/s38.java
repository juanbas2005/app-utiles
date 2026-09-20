package defpackage;

/* renamed from: s38  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class s38 {
    public final ol a;
    public final i12 b;

    public s38(ol olVar, i12 i12) {
        this.a = olVar;
        this.b = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s38)) {
            return false;
        }
        s38 s38 = (s38) obj;
        if (sg3.e(this.a, s38.a) && sg3.e(this.b, s38.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return Integer.hashCode(0) + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.a + ", easing=" + this.b + ", arcMode=ArcMode(value=0))";
    }
}
