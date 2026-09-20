package defpackage;

/* renamed from: fg6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fg6 extends yv4 {
    public final eg6 a;

    public fg6(eg6 eg6) {
        this.a = eg6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fg6.class != obj.getClass()) {
            return false;
        }
        return sg3.e(this.a, ((fg6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SceneInfo(scene=" + this.a + ')';
    }
}
