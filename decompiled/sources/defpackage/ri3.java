package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;

/* renamed from: ri3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ri3 implements dj0 {
    public final /* synthetic */ si3 a;

    public ri3(si3 si3) {
        this.a = si3;
    }

    public final List a() {
        return a42.w;
    }

    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    public final /* bridge */ boolean c() {
        return false;
    }

    public final Object d(Object[] objArr) {
        u52 u52 = this.a.y;
        int length = objArr.length;
        if (length == 0) {
            return u52;
        }
        h.q(pb4.i(length, "Callable expects 0 arguments, but ", " were provided."));
        return null;
    }

    public final Type k() {
        Type type;
        as3 k = this.a.k();
        k.getClass();
        if (k instanceof c2) {
            y16 y16 = ((c2) k).w;
            if (y16 != null) {
                type = (Type) y16.b();
            } else {
                type = null;
            }
            if (type != null) {
                return type;
            }
        }
        return ar7.n(k, false);
    }
}
