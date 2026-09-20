package defpackage;

/* renamed from: ju3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ju3 extends r16 {
    public final int e0;

    public ju3(int i) {
        this.e0 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ju3) && this.e0 == ((ju3) obj).e0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e0);
    }

    public final String toString() {
        return f21.j(new StringBuilder("TypeParameter(id="), this.e0, ')');
    }
}
