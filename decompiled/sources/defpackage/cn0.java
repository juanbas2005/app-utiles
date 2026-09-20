package defpackage;

/* renamed from: cn0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cn0 {
    public final jb a;
    public final vr2 b;
    public final je2 c;

    public cn0(jb jbVar, je2 je2, vr2 vr2) {
        this.a = jbVar;
        this.b = vr2;
        this.c = je2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn0)) {
            return false;
        }
        cn0 cn0 = (cn0) obj;
        if (sg3.e(this.a, cn0.a) && sg3.e(this.b, cn0.b) && sg3.e(this.c, cn0.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return Boolean.hashCode(true) + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.a + ", size=" + this.b + ", animationSpec=" + this.c + ", clip=true)";
    }
}
