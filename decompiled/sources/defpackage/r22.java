package defpackage;

import io.github.jan.supabase.auth.providers.builtin.Email$Config;
import io.github.jan.supabase.auth.user.UserInfo;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.json.JsonObject;

/* renamed from: r22  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class r22 implements fl1 {
    public static final r22 a = new Object();

    public final UserInfo b(JsonObject jsonObject) {
        jsonObject.getClass();
        try {
            km3 km3 = l18.a;
            km3.getClass();
            return (UserInfo) km3.a(UserInfo.Companion.serializer(), jsonObject);
        } catch (MissingFieldException unused) {
            throw new Exception("Couldn't decode sign up email result. Input: " + jsonObject);
        }
    }

    public final JsonObject d(vr2 vr2) {
        vr2.getClass();
        km3 km3 = l18.a;
        Email$Config email$Config = new Email$Config((String) null, (String) null, (JsonObject) null, 7, (hl1) null);
        vr2.y(email$Config);
        km3.getClass();
        return em3.e(km3.c(Email$Config.Companion.serializer(), email$Config));
    }

    public final String e() {
        return "password";
    }

    public final boolean equals(Object obj) {
        if (this != obj && !(obj instanceof r22)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -189519665;
    }

    public final String toString() {
        return "Email";
    }
}
