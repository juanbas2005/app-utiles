package defpackage;

import kotlinx.serialization.json.JsonObject;

/* renamed from: jv  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jv implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ q51 x;
    public final /* synthetic */ JsonObject y;

    public /* synthetic */ jv(q51 q51, JsonObject jsonObject, int i) {
        this.w = i;
        this.x = q51;
        this.y = jsonObject;
    }

    public final Object y(Object obj) {
        int i = this.w;
        vs7 vs7 = vs7.a;
        JsonObject jsonObject = this.y;
        q51 q51 = this.x;
        Class<JsonObject> cls = JsonObject.class;
        as3 as3 = null;
        switch (i) {
            case b85.b:
                y53 y53 = (y53) obj;
                y53.getClass();
                y53.d(i53.c);
                pv8.q(y53, q51);
                y53.d = jsonObject;
                gq3 b = b26.a.b(cls);
                try {
                    as3 = b26.b(cls);
                } catch (Throwable unused) {
                }
                y53.b(new fp7(b, as3));
                return vs7;
            case 1:
                y53 y532 = (y53) obj;
                y532.getClass();
                y532.d(i53.c);
                pv8.q(y532, q51);
                y532.d = jsonObject;
                gq3 b2 = b26.a.b(cls);
                try {
                    as3 = b26.b(cls);
                } catch (Throwable unused2) {
                }
                y532.b(new fp7(b2, as3));
                return vs7;
            case 2:
                y53 y533 = (y53) obj;
                y533.getClass();
                y533.d(i53.c);
                pv8.q(y533, q51);
                y533.d = jsonObject;
                gq3 b3 = b26.a.b(cls);
                try {
                    as3 = b26.b(cls);
                } catch (Throwable unused3) {
                }
                y533.b(new fp7(b3, as3));
                return vs7;
            default:
                y53 y534 = (y53) obj;
                y534.getClass();
                y534.d(i53.f);
                pv8.q(y534, q51);
                y534.d = jsonObject;
                gq3 b4 = b26.a.b(cls);
                try {
                    as3 = b26.b(cls);
                } catch (Throwable unused4) {
                }
                y534.b(new fp7(b4, as3));
                return vs7;
        }
    }
}
