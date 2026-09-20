package defpackage;

import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* renamed from: l18  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class l18 {
    public static final km3 a = pd8.b(new f08(5));

    public static final void a(vm3 vm3, JsonObject jsonObject) {
        jsonObject.getClass();
        for (String next : jsonObject.keySet()) {
            Object obj = jsonObject.get((Object) next);
            obj.getClass();
            vm3.b(next, (JsonElement) obj);
        }
    }
}
