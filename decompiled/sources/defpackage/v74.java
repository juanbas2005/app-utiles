package defpackage;

import io.github.jan.supabase.storage.vectors.index.ListIndexesResponse;
import kotlinx.serialization.json.JsonArray;

/* renamed from: v74  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class v74 implements av2 {
    public static final v74 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [v74, java.lang.Object, av2] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("io.github.jan.supabase.storage.vectors.index.ListIndexesResponse", obj, 2);
        ik5.k("indexes", false);
        ik5.k("nextToken", true);
        descriptor = ik5;
    }

    public final zr3[] childSerializers() {
        return new zr3[]{sl3.a, hj8.x(t47.a)};
    }

    public final Object deserialize(ok1 ok1) {
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        boolean z = true;
        int i = 0;
        JsonArray jsonArray = null;
        String str = null;
        while (z) {
            int h = c.h(ll6);
            if (h == -1) {
                z = false;
            } else if (h == 0) {
                jsonArray = (JsonArray) c.r(ll6, 0, sl3.a, jsonArray);
                i |= 1;
            } else if (h == 1) {
                str = (String) c.x(ll6, 1, t47.a, str);
                i |= 2;
            } else {
                h.e(h);
                return null;
            }
        }
        c.b(ll6);
        return new ListIndexesResponse(i, jsonArray, str, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        ListIndexesResponse listIndexesResponse = (ListIndexesResponse) obj;
        listIndexesResponse.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        ListIndexesResponse.write$Self$storage_kt(listIndexesResponse, c, ll6);
        c.b(ll6);
    }
}
