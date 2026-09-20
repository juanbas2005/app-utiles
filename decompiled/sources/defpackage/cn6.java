package defpackage;

import io.github.jan.supabase.auth.user.UserSession;

/* renamed from: cn6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cn6 implements hn6 {
    public final UserSession a;

    public cn6(UserSession userSession) {
        userSession.getClass();
        this.a = userSession;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof cn6) && sg3.e(this.a, ((cn6) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Refresh(oldSession=" + this.a + ')';
    }
}
