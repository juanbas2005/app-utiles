package defpackage;

import java.util.LinkedHashMap;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* renamed from: hn3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hn3 extends an3 {
    public String i;
    public boolean j;

    public final JsonElement I() {
        return new JsonObject((LinkedHashMap) this.h);
    }

    public final void L(String str, JsonElement jsonElement) {
        str.getClass();
        jsonElement.getClass();
        if (!this.j) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.h;
            String str2 = this.i;
            if (str2 != null) {
                linkedHashMap.put(str2, jsonElement);
                this.j = true;
                return;
            }
            sg3.a0("tag");
            throw null;
        } else if (jsonElement instanceof JsonPrimitive) {
            this.i = ((JsonPrimitive) jsonElement).getContent();
            this.j = false;
        } else if (jsonElement instanceof JsonObject) {
            throw ar7.c(xm3.b);
        } else if (!(jsonElement instanceof JsonArray)) {
            h.c();
        } else {
            throw ar7.c(sl3.b);
        }
    }
}
