package defpackage;

/* renamed from: nb3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nb3 {
    public final String a = "0";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof nb3) && this.a.equals(((nb3) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f21.h("InfoUtilScreenData(balance=", this.a, ")");
    }
}
