package defpackage;

import java.util.List;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* renamed from: gn3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gn3 extends en3 {
    public final JsonObject j;
    public final List k;
    public final int l;
    public int m = -1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gn3(pl3 pl3, JsonObject jsonObject) {
        super(pl3, jsonObject, (String) null, 12);
        pl3.getClass();
        this.j = jsonObject;
        List b1 = dt0.b1(jsonObject.keySet());
        this.k = b1;
        this.l = b1.size() * 2;
    }

    public final JsonElement F(String str) {
        str.getClass();
        if (this.m % 2 == 0) {
            return em3.b(str);
        }
        return (JsonElement) sf4.U(str, this.j);
    }

    public final String R(ll6 ll6, int i) {
        ll6.getClass();
        return (String) this.k.get(i / 2);
    }

    public final JsonElement T() {
        return this.j;
    }

    public final JsonObject Y() {
        return this.j;
    }

    public final void b(ll6 ll6) {
        ll6.getClass();
    }

    public final int h(ll6 ll6) {
        ll6.getClass();
        int i = this.m;
        if (i >= this.l - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.m = i2;
        return i2;
    }
}
