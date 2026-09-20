package defpackage;

import io.github.jan.supabase.exceptions.RestException;

/* renamed from: g26  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class g26 implements i26 {
    public final RestException a;

    public g26(RestException restException) {
        this.a = restException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof g26) && this.a.equals(((g26) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "InternalServerError(exception=" + this.a + ')';
    }
}
