package defpackage;

import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* renamed from: em3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class em3 {
    public static final ub3 a = b96.a(t47.a, "kotlinx.serialization.json.JsonUnquotedLiteral");

    public static final JsonPrimitive a(Number number) {
        return new nm3(number, false, (ll6) null);
    }

    public static final JsonPrimitive b(String str) {
        if (str == null) {
            return JsonNull.INSTANCE;
        }
        return new nm3(str, true, (ll6) null);
    }

    public static final void c(String str, JsonElement jsonElement) {
        throw new IllegalArgumentException("Element " + b26.a.b(jsonElement.getClass()) + " is not a " + str);
    }

    public static final JsonArray d(JsonElement jsonElement) {
        JsonArray jsonArray;
        jsonElement.getClass();
        if (jsonElement instanceof JsonArray) {
            jsonArray = (JsonArray) jsonElement;
        } else {
            jsonArray = null;
        }
        if (jsonArray != null) {
            return jsonArray;
        }
        c("JsonArray", jsonElement);
        throw null;
    }

    public static final JsonObject e(JsonElement jsonElement) {
        JsonObject jsonObject;
        jsonElement.getClass();
        if (jsonElement instanceof JsonObject) {
            jsonObject = (JsonObject) jsonElement;
        } else {
            jsonObject = null;
        }
        if (jsonObject != null) {
            return jsonObject;
        }
        c("JsonObject", jsonElement);
        throw null;
    }

    public static final JsonPrimitive f(JsonElement jsonElement) {
        JsonPrimitive jsonPrimitive;
        if (jsonElement instanceof JsonPrimitive) {
            jsonPrimitive = (JsonPrimitive) jsonElement;
        } else {
            jsonPrimitive = null;
        }
        if (jsonPrimitive != null) {
            return jsonPrimitive;
        }
        c("JsonPrimitive", jsonElement);
        throw null;
    }

    public static final long g(JsonPrimitive jsonPrimitive) {
        int i;
        String str;
        p47 c = j45.c(pl3.d, jsonPrimitive.getContent());
        String str2 = c.C;
        long l = c.l();
        if (c.h() == 10) {
            return l;
        }
        int i2 = c.x;
        if (i2 > 0) {
            i = i2 - 1;
        } else {
            i = i2;
        }
        if (i2 == str2.length() || i < 0) {
            str = "EOF";
        } else {
            str = String.valueOf(str2.charAt(i));
        }
        z1.u(c, f21.h("Expected input to contain a single valid number, but got '", str, "' after it"), i, (String) null, 4);
        throw null;
    }
}
