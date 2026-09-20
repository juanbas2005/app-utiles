package defpackage;

/* renamed from: l85  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class l85 extends n85 {
    public final ly5 l;

    public l85(ly5 ly5) {
        super(0);
        this.l = ly5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l85)) {
            return false;
        }
        if (!this.l.equals(((l85) obj).l)) {
            return false;
        }
        return true;
    }

    public final ly5 f() {
        return this.l;
    }

    public final int hashCode() {
        return this.l.hashCode();
    }
}
