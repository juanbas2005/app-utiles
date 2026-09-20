package defpackage;

import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonException;

/* renamed from: om3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class om3 implements zr3 {
    public static final om3 a = new Object();
    public static final po5 b = b85.b("kotlinx.serialization.json.JsonLiteral");

    public final Object deserialize(ok1 ok1) {
        String str;
        bm3 N = mp7.N(ok1);
        JsonElement l = N.l();
        if (l instanceof nm3) {
            return (nm3) l;
        }
        String m = hl6.m(b26.a, l.getClass(), new StringBuilder("Unexpected JSON element, expected JsonLiteral, had "));
        if (N.y().a.k) {
            str = ar7.J(-1, l.toString()).toString();
        } else {
            str = null;
        }
        throw new JsonException(ar7.t(-1, m, (String) null, (String) null, str));
    }

    public final ll6 getDescriptor() {
        return b;
    }

    public final void serialize(j42 j42, Object obj) {
        Boolean bool;
        nm3 nm3 = (nm3) obj;
        nm3.getClass();
        String str = nm3.y;
        mp7.M(j42);
        if (nm3.w) {
            j42.D(str);
            return;
        }
        ll6 ll6 = nm3.x;
        if (ll6 != null) {
            j42.m(ll6).D(str);
            return;
        }
        Long w0 = k57.w0(str);
        if (w0 != null) {
            j42.B(w0.longValue());
            return;
        }
        qr7 u = f55.u(str);
        if (u != null) {
            j42.m(ur7.b).B(u.w);
            return;
        }
        Double i0 = j57.i0(str);
        if (i0 != null) {
            j42.h(i0.doubleValue());
            return;
        }
        if (str.equals("true")) {
            bool = Boolean.TRUE;
        } else if (str.equals("false")) {
            bool = Boolean.FALSE;
        } else {
            bool = null;
        }
        if (bool != null) {
            j42.l(bool.booleanValue());
        } else {
            j42.D(str);
        }
    }
}
