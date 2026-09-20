package defpackage;

/* renamed from: mt3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mt3 extends fu3 {
    public final lt3 a;

    public mt3(lt3 lt3) {
        this.a = lt3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof mt3) && this.a.equals(((mt3) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AnnotationValue(" + this.a + ')';
    }
}
