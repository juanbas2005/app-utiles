package defpackage;

import kotlinx.serialization.json.JsonException;
import kotlinx.serialization.json.JsonNull;

/* renamed from: sm3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sm3 implements zr3 {
    public static final sm3 a = new Object();
    public static final nl6 b = b85.g("kotlinx.serialization.json.JsonNull", ql6.l, new ll6[0]);

    public final Object deserialize(ok1 ok1) {
        mp7.N(ok1);
        if (!ok1.w()) {
            return JsonNull.INSTANCE;
        }
        throw new JsonException(ar7.t(-1, "Expected 'null' literal", (String) null, (String) null, (String) null));
    }

    public final ll6 getDescriptor() {
        return b;
    }

    public final void serialize(j42 j42, Object obj) {
        ((JsonNull) obj).getClass();
        mp7.M(j42);
        j42.e();
    }
}
