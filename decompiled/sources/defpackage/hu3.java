package defpackage;

/* renamed from: hu3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hu3 extends r16 {
    public final String e0;

    public hu3(String str) {
        str.getClass();
        this.e0 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof hu3) && sg3.e(this.e0, ((hu3) obj).e0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.e0.hashCode();
    }

    public final String toString() {
        return hl6.o(new StringBuilder("Class(name="), this.e0, ')');
    }
}
