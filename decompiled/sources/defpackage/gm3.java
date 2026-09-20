package defpackage;

import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* renamed from: gm3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gm3 implements zr3 {
    public static final gm3 a = new Object();
    public static final nl6 b = b85.f("kotlinx.serialization.json.JsonElement", yk5.m, new ll6[0], new vd2(29));

    public final Object deserialize(ok1 ok1) {
        return mp7.N(ok1).l();
    }

    public final ll6 getDescriptor() {
        return b;
    }

    public final void serialize(j42 j42, Object obj) {
        JsonElement jsonElement = (JsonElement) obj;
        jsonElement.getClass();
        mp7.M(j42);
        if (jsonElement instanceof JsonPrimitive) {
            j42.g(bn3.a, jsonElement);
        } else if (jsonElement instanceof JsonObject) {
            j42.g(xm3.a, jsonElement);
        } else if (jsonElement instanceof JsonArray) {
            j42.g(sl3.a, jsonElement);
        } else {
            h.c();
        }
    }
}
