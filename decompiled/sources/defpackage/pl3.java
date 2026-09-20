package defpackage;

import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* renamed from: pl3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class pl3 {
    public static final ol3 d = new pl3(new wl3(false, false, false, false, true, "    ", "type", false, true, fq0.y, true), wl6.a);
    public final wl3 a;
    public final z53 b;
    public final f96 c = new f96(18);

    public pl3(wl3 wl3, z53 z53) {
        this.a = wl3;
        this.b = z53;
    }

    public final Object a(zr3 zr3, JsonElement jsonElement) {
        a2 a2Var;
        zr3.getClass();
        jsonElement.getClass();
        if (jsonElement instanceof JsonObject) {
            a2Var = new en3(this, (JsonObject) jsonElement, (String) null, 12);
        } else if (jsonElement instanceof JsonArray) {
            a2Var = new fn3(this, (JsonArray) jsonElement);
        } else if ((jsonElement instanceof nm3) || jsonElement.equals(JsonNull.INSTANCE)) {
            a2Var = new zm3(this, (JsonPrimitive) jsonElement, (String) null);
        } else {
            h.c();
            return null;
        }
        return a2Var.g(zr3);
    }

    public final Object b(zr3 zr3, String str) {
        zr3.getClass();
        str.getClass();
        p47 c2 = j45.c(this, str);
        Object g = new l47(this, ef8.OBJ, c2, zr3.getDescriptor(), (py2) null).g(zr3);
        c2.s();
        return g;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, h06] */
    public final JsonElement c(zr3 zr3, Object obj) {
        zr3.getClass();
        ? obj2 = new Object();
        new an3(this, (vr2) new mr0(3, obj2), 1).g(zr3, obj);
        Object obj3 = obj2.w;
        if (obj3 != null) {
            return (JsonElement) obj3;
        }
        sg3.a0("result");
        throw null;
    }

    public final String d(zr3 zr3, Object obj) {
        char[] cArr;
        Object obj2;
        zr3.getClass();
        qa qaVar = new qa(5, (byte) 0);
        xn0 xn0 = xn0.c;
        synchronized (xn0) {
            as asVar = xn0.a;
            cArr = null;
            if (asVar.isEmpty()) {
                obj2 = null;
            } else {
                obj2 = asVar.removeLast();
            }
            char[] cArr2 = (char[]) obj2;
            if (cArr2 != null) {
                xn0.b -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        qaVar.y = cArr;
        try {
            new m47(new v70(3, (Object) qaVar), this, ef8.OBJ, new im3[ef8.D.f()]).g(zr3, obj);
            return qaVar.toString();
        } finally {
            qaVar.j();
        }
    }
}
