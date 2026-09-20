package defpackage;

import kotlinx.serialization.json.JsonElement;

/* renamed from: zm3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zm3 extends a2 {
    public final JsonElement f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zm3(pl3 pl3, JsonElement jsonElement, String str) {
        super(pl3, str);
        pl3.getClass();
        jsonElement.getClass();
        this.f = jsonElement;
        this.a.add("primitive");
    }

    public final JsonElement F(String str) {
        str.getClass();
        if (str == "primitive") {
            return this.f;
        }
        h.q("This input can only handle primitives with 'primitive' tag");
        return null;
    }

    public final JsonElement T() {
        return this.f;
    }

    public final int h(ll6 ll6) {
        ll6.getClass();
        return 0;
    }
}
