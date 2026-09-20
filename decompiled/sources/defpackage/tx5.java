package defpackage;

/* renamed from: tx5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tx5 implements pb0 {
    public final pb0 a;
    public final qt b;
    public final jb c;
    public final j51 d;

    public tx5(pb0 pb0, qt qtVar, jb jbVar, j51 j51) {
        this.a = pb0;
        this.b = qtVar;
        this.c = jbVar;
        this.d = j51;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tx5) {
            tx5 tx5 = (tx5) obj;
            if (sg3.e(this.a, tx5.a) && this.b == tx5.b && sg3.e(this.c, tx5.c) && sg3.e(this.d, tx5.d) && Float.compare(1.0f, 1.0f) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return Boolean.hashCode(true) + f21.d(1.0f, (this.d.hashCode() + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 961)) * 31)) * 31, 961);
    }

    public final String toString() {
        return "RealSubcomposeAsyncImageScope(parentScope=" + this.a + ", painter=" + this.b + ", contentDescription=null, alignment=" + this.c + ", contentScale=" + this.d + ", alpha=1.0, colorFilter=null, clipToBounds=true)";
    }
}
