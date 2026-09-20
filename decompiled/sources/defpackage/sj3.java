package defpackage;

/* renamed from: sj3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sj3 {
    public final gq0 a;
    public final gq0 b;
    public final gq0 c;

    public sj3(gq0 gq0, gq0 gq02, gq0 gq03) {
        this.a = gq0;
        this.b = gq02;
        this.c = gq03;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sj3)) {
            return false;
        }
        sj3 sj3 = (sj3) obj;
        if (this.a.equals(sj3.a) && this.b.equals(sj3.b) && this.c.equals(sj3.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PlatformMutabilityMapping(javaClass=" + this.a + ", kotlinReadOnly=" + this.b + ", kotlinMutable=" + this.c + ')';
    }
}
