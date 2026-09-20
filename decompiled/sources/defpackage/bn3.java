package defpackage;

import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonException;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonPrimitive;

/* renamed from: bn3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bn3 implements zr3 {
    public static final bn3 a = new Object();
    public static final nl6 b = b85.g("kotlinx.serialization.json.JsonPrimitive", no5.t, new ll6[0]);

    public final Object deserialize(ok1 ok1) {
        String str;
        bm3 N = mp7.N(ok1);
        JsonElement l = N.l();
        if (l instanceof JsonPrimitive) {
            return (JsonPrimitive) l;
        }
        String m = hl6.m(b26.a, l.getClass(), new StringBuilder("Unexpected JSON element, expected JsonPrimitive, had "));
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
        JsonPrimitive jsonPrimitive = (JsonPrimitive) obj;
        jsonPrimitive.getClass();
        mp7.M(j42);
        if (jsonPrimitive instanceof JsonNull) {
            j42.g(sm3.a, JsonNull.INSTANCE);
        } else {
            j42.g(om3.a, (nm3) jsonPrimitive);
        }
    }
}
