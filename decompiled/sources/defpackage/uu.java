package defpackage;

import io.github.jan.supabase.auth.a;
import io.github.jan.supabase.auth.user.UserInfo;
import io.github.jan.supabase.auth.user.UserSession;

/* renamed from: uu  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public interface uu extends qe4 {
    public static final tu a = tu.w;

    static Object b(uu uuVar, fl1 fl1, vr2 vr2, a97 a97) {
        ((a) uuVar).c.getClass();
        a aVar = (a) uuVar;
        Object c = fl1.c(fl1, aVar.b, new p0((Object) aVar, (Object) fl1, (f61) null, 9), (String) null, vr2, a97);
        if (c == p81.w) {
            return c;
        }
        return vs7.a;
    }

    static Object c(uu uuVar, UserSession userSession, hn6 hn6, h61 h61) {
        Object o = ((a) uuVar).o(userSession, ((a) uuVar).c.v, hn6, false, h61);
        if (o == p81.w) {
            return o;
        }
        return vs7.a;
    }

    static Object k(uu uuVar, c85 c85, String str, String str2, a97 a97) {
        return ((a) uuVar).z(c85.w, str2, new cb(str, 1), a97);
    }

    UserSession i() {
        mn6 mn6 = (mn6) ((a) this).f.w.getValue();
        if (mn6 instanceof in6) {
            return ((in6) mn6).a;
        }
        return null;
    }

    UserInfo j() {
        UserSession i = i();
        if (i != null) {
            return i.getUser();
        }
        return null;
    }
}
