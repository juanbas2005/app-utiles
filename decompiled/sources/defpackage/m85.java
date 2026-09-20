package defpackage;

/* renamed from: m85  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class m85 extends n85 {
    public final l96 l;
    public final eh m;

    public m85(l96 l96) {
        super(0);
        eh ehVar;
        this.l = l96;
        if (!p25.t(l96)) {
            ehVar = gh.a();
            eh.c(ehVar, l96);
        } else {
            ehVar = null;
        }
        this.m = ehVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m85)) {
            return false;
        }
        if (!this.l.equals(((m85) obj).l)) {
            return false;
        }
        return true;
    }

    public final ly5 f() {
        l96 l96 = this.l;
        return new ly5(l96.a, l96.b, l96.c, l96.d);
    }

    public final int hashCode() {
        return this.l.hashCode();
    }
}
