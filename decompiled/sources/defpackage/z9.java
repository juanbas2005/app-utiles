package defpackage;

import io.github.jan.supabase.auth.admin.AdminUserBuilder;
import java.util.LinkedHashMap;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* renamed from: z9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class z9 implements zr3 {
    public final Object deserialize(ok1 ok1) {
        throw new IllegalStateException("This serializer is only used for serialization");
    }

    public final ll6 getDescriptor() {
        return AdminUserBuilder.descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        AdminUserBuilder adminUserBuilder = (AdminUserBuilder) obj;
        adminUserBuilder.getClass();
        im3 im3 = (im3) j42;
        if (!d57.I0(adminUserBuilder.getPassword())) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            JsonPrimitive b = em3.b(adminUserBuilder.getPassword());
            b.getClass();
            JsonElement jsonElement = (JsonElement) linkedHashMap.put("password", b);
            JsonObject userMetadata = adminUserBuilder.getUserMetadata();
            if (userMetadata != null) {
                JsonElement jsonElement2 = (JsonElement) linkedHashMap.put("user_metadata", userMetadata);
            }
            JsonObject appMetadata = adminUserBuilder.getAppMetadata();
            if (appMetadata != null) {
                JsonElement jsonElement3 = (JsonElement) linkedHashMap.put("app_metadata", appMetadata);
            }
            throw new RuntimeException();
        }
        throw new IllegalArgumentException("Password must not be blank");
    }

    public final zr3 serializer() {
        return AdminUserBuilder.Companion;
    }
}
