package defpackage;

/* renamed from: iu3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class iu3 extends r16 {
    public final String e0;

    public iu3(String str) {
        str.getClass();
        this.e0 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof iu3) && sg3.e(this.e0, ((iu3) obj).e0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.e0.hashCode();
    }

    public final String toString() {
        return hl6.o(new StringBuilder("TypeAlias(name="), this.e0, ')');
    }
}
