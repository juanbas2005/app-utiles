package defpackage;

import io.ktor.http.Url;

/* renamed from: wu7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wu7 implements zr3 {
    public static final wu7 a = new Object();
    public static final po5 b = b85.b("io.ktor.http.Url");

    public final Object deserialize(ok1 ok1) {
        String t = ok1.t();
        t.getClass();
        return j45.e(t).b();
    }

    public final ll6 getDescriptor() {
        return b;
    }

    public final void serialize(j42 j42, Object obj) {
        Url url = (Url) obj;
        url.getClass();
        j42.D(url.toString());
    }
}
