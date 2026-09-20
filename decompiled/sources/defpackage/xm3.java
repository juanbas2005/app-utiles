package defpackage;

import java.util.Map;
import kotlinx.serialization.json.JsonObject;

/* renamed from: xm3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xm3 implements zr3 {
    public static final xm3 a = new Object();
    public static final wm3 b = wm3.b;

    public final Object deserialize(ok1 ok1) {
        mp7.N(ok1);
        return new JsonObject((Map) new ty2((zr3) t47.a, (zr3) gm3.a, 1).deserialize(ok1));
    }

    public final ll6 getDescriptor() {
        return b;
    }

    public final void serialize(j42 j42, Object obj) {
        JsonObject jsonObject = (JsonObject) obj;
        jsonObject.getClass();
        mp7.M(j42);
        new ty2((zr3) t47.a, (zr3) gm3.a, 1).serialize(j42, jsonObject);
    }
}
