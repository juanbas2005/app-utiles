package defpackage;

/* renamed from: zu  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zu {
    public final i26 a;

    public zu(i26 i26) {
        i26.getClass();
        this.a = i26;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof zu) && sg3.e(this.a, ((zu) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RefreshFailure(cause=" + this.a + ')';
    }
}
