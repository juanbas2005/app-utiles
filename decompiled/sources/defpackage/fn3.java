package defpackage;

import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

/* renamed from: fn3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fn3 extends a2 {
    public final JsonArray f;
    public final int g;
    public int h = -1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fn3(pl3 pl3, JsonArray jsonArray) {
        super(pl3, (String) null);
        pl3.getClass();
        jsonArray.getClass();
        this.f = jsonArray;
        this.g = jsonArray.size();
    }

    public final JsonElement F(String str) {
        str.getClass();
        return this.f.get(Integer.parseInt(str));
    }

    public final String R(ll6 ll6, int i) {
        ll6.getClass();
        return String.valueOf(i);
    }

    public final JsonElement T() {
        return this.f;
    }

    public final int h(ll6 ll6) {
        ll6.getClass();
        int i = this.h;
        if (i >= this.g - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.h = i2;
        return i2;
    }
}
