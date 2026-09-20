package defpackage;

import java.util.LinkedHashMap;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* renamed from: xk0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xk0 implements zr3 {
    public static final xk0 a = new Object();
    public static final nl6 b;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, xk0] */
    static {
        ll6[] ll6Arr = new ll6[0];
        if (!d57.I0("CaptchaTokenSerializer")) {
            nq0 nq0 = new nq0("CaptchaTokenSerializer");
            nq0.a("gotrue_meta_security", JsonObject.Companion.serializer().getDescriptor(), false);
            b = new nl6("CaptchaTokenSerializer", n57.l, nq0.c.size(), qs.p1(ll6Arr), nq0);
            return;
        }
        h.q("Blank serial names are prohibited");
    }

    public final Object deserialize(ok1 ok1) {
        throw new UnsupportedOperationException();
    }

    public final ll6 getDescriptor() {
        return b;
    }

    public final void serialize(j42 j42, Object obj) {
        String str = (String) obj;
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JsonPrimitive b2 = em3.b(str);
        b2.getClass();
        JsonElement jsonElement = (JsonElement) linkedHashMap.put("captcha_token", b2);
        ((im3) j42).s(new JsonObject(linkedHashMap));
    }
}
