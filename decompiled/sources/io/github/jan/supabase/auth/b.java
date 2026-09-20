package io.github.jan.supabase.auth;

import io.github.jan.supabase.auth.GoTrueErrorResponse;
import kotlinx.serialization.json.JsonElement;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class b implements zr3 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: io.github.jan.supabase.auth.GoTrueErrorResponse$WeakPassword} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object deserialize(ok1 ok1) {
        String str;
        String str2;
        JsonElement l = ((bm3) ok1).l();
        JsonElement jsonElement = (JsonElement) em3.e(l).get((Object) "error_code");
        GoTrueErrorResponse.WeakPassword weakPassword = null;
        if (jsonElement != null) {
            str = em3.f(jsonElement).getContent();
        } else {
            str = null;
        }
        JsonElement jsonElement2 = (JsonElement) em3.e(l).get((Object) "error_description");
        if (jsonElement2 == null || (str2 = em3.f(jsonElement2).getContent()) == null) {
            JsonElement jsonElement3 = (JsonElement) em3.e(l).get((Object) "msg");
            if (jsonElement3 != null) {
                str2 = em3.f(jsonElement3).getContent();
            } else {
                JsonElement jsonElement4 = (JsonElement) em3.e(l).get((Object) "message");
                if (jsonElement4 != null) {
                    str2 = em3.f(jsonElement4).getContent();
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    str2 = l.toString();
                }
            }
        }
        if (em3.e(l).containsKey((Object) "weak_password")) {
            ol3 ol3 = pl3.d;
            Object obj = em3.e(l).get((Object) "weak_password");
            obj.getClass();
            ol3.getClass();
            weakPassword = ol3.a(GoTrueErrorResponse.WeakPassword.Companion.serializer(), (JsonElement) obj);
        }
        return new GoTrueErrorResponse(str, str2, weakPassword);
    }

    public final ll6 getDescriptor() {
        return GoTrueErrorResponse.descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        ((GoTrueErrorResponse) obj).getClass();
        throw new UnsupportedOperationException();
    }

    public final zr3 serializer() {
        return GoTrueErrorResponse.Companion;
    }
}
