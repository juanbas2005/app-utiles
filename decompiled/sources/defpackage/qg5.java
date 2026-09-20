package defpackage;

import io.github.jan.supabase.auth.providers.builtin.Phone$Channel;
import io.github.jan.supabase.auth.providers.builtin.Phone$Config;
import io.github.jan.supabase.auth.user.UserInfo;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.json.JsonObject;

/* renamed from: qg5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qg5 implements fl1 {
    public static final qg5 a = new Object();

    public final UserInfo b(JsonObject jsonObject) {
        jsonObject.getClass();
        try {
            km3 km3 = l18.a;
            km3.getClass();
            return (UserInfo) km3.a(UserInfo.Companion.serializer(), jsonObject);
        } catch (MissingFieldException unused) {
            throw new Exception("Couldn't decode sign up phone result. Input: " + jsonObject);
        }
    }

    public final JsonObject d(vr2 vr2) {
        vr2.getClass();
        km3 km3 = l18.a;
        Phone$Config phone$Config = new Phone$Config((String) null, (String) null, (Phone$Channel) null, (JsonObject) null, 15, (hl1) null);
        vr2.y(phone$Config);
        km3.getClass();
        return em3.e(km3.c(Phone$Config.Companion.serializer(), phone$Config));
    }

    public final String e() {
        return "password";
    }

    public final boolean equals(Object obj) {
        if (this != obj && !(obj instanceof qg5)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -179496287;
    }

    public final String toString() {
        return "Phone";
    }
}
