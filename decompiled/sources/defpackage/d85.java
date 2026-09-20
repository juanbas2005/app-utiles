package defpackage;

import io.github.jan.supabase.auth.user.UserSession;

/* renamed from: d85  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class d85 {
    public final UserSession a;

    public d85(UserSession userSession) {
        userSession.getClass();
        this.a = userSession;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof d85) && sg3.e(this.a, ((d85) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Authenticated(session=" + this.a + ')';
    }
}
