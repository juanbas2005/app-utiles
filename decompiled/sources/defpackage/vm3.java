package defpackage;

import java.util.LinkedHashMap;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* renamed from: vm3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vm3 {
    public final LinkedHashMap a = new LinkedHashMap();

    public final JsonObject a() {
        return new JsonObject(this.a);
    }

    public final JsonElement b(String str, JsonElement jsonElement) {
        str.getClass();
        jsonElement.getClass();
        return (JsonElement) this.a.put(str, jsonElement);
    }
}
