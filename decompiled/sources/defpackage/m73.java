package defpackage;

import io.github.jan.supabase.auth.providers.IDTokenProvider;
import io.github.jan.supabase.auth.providers.builtin.IDToken$Config;
import io.github.jan.supabase.auth.user.UserInfo;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.json.JsonObject;

/* renamed from: m73  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class m73 implements fl1 {
    public static final m73 a = new Object();

    public final UserInfo b(JsonObject jsonObject) {
        jsonObject.getClass();
        try {
            km3 km3 = l18.a;
            km3.getClass();
            return (UserInfo) km3.a(UserInfo.Companion.serializer(), jsonObject);
        } catch (MissingFieldException unused) {
            throw new Exception("Couldn't decode sign up id token result. Input: " + jsonObject);
        }
    }

    public final JsonObject d(vr2 vr2) {
        vr2.getClass();
        km3 km3 = l18.a;
        IDToken$Config iDToken$Config = new IDToken$Config((String) null, (IDTokenProvider) null, (String) null, (String) null, false, 31, (hl1) null);
        vr2.y(iDToken$Config);
        km3.getClass();
        return em3.e(km3.c(IDToken$Config.Companion.serializer(), iDToken$Config));
    }

    public final String e() {
        return "id_token";
    }

    public final boolean equals(Object obj) {
        if (this != obj && !(obj instanceof m73)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 624623153;
    }

    public final String toString() {
        return "IDToken";
    }
}
