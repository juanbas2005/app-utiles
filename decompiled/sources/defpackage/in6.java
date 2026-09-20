package defpackage;

import io.github.jan.supabase.auth.user.UserSession;

/* renamed from: in6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class in6 implements mn6 {
    public final UserSession a;
    public final hn6 b;

    public in6(UserSession userSession, hn6 hn6) {
        userSession.getClass();
        hn6.getClass();
        this.a = userSession;
        this.b = hn6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof in6)) {
            return false;
        }
        in6 in6 = (in6) obj;
        if (sg3.e(this.a, in6.a) && sg3.e(this.b, in6.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Authenticated(session=" + this.a + ", source=" + this.b + ')';
    }
}
