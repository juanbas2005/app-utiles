package defpackage;

import io.github.jan.supabase.storage.vectors.data.VectorData;
import io.github.jan.supabase.storage.vectors.data.VectorMatch;
import kotlinx.serialization.json.JsonObject;

/* renamed from: f38  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class f38 implements av2 {
    public static final f38 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, f38, av2] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("io.github.jan.supabase.storage.vectors.data.VectorMatch", obj, 4);
        ik5.k("key", false);
        ik5.k("data", true);
        ik5.k("metadata", true);
        ik5.k("distance", true);
        descriptor = ik5;
    }

    public final zr3[] childSerializers() {
        return new zr3[]{t47.a, hj8.x(n28.a), hj8.x(xm3.a), hj8.x(ue3.a)};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: io.github.jan.supabase.storage.vectors.data.VectorData} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: kotlinx.serialization.json.JsonObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object deserialize(ok1 ok1) {
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        boolean z = true;
        int i = 0;
        String str = null;
        VectorData vectorData = null;
        JsonObject jsonObject = null;
        Integer num = null;
        while (z) {
            int h = c.h(ll6);
            if (h == -1) {
                z = false;
            } else if (h == 0) {
                str = c.n(ll6, 0);
                i |= 1;
            } else if (h == 1) {
                vectorData = c.x(ll6, 1, n28.a, vectorData);
                i |= 2;
            } else if (h == 2) {
                jsonObject = c.x(ll6, 2, xm3.a, jsonObject);
                i |= 4;
            } else if (h == 3) {
                num = c.x(ll6, 3, ue3.a, num);
                i |= 8;
            } else {
                h.e(h);
                return null;
            }
        }
        c.b(ll6);
        return new VectorMatch(i, str, vectorData, jsonObject, num, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        VectorMatch vectorMatch = (VectorMatch) obj;
        vectorMatch.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        VectorMatch.write$Self$storage_kt(vectorMatch, c, ll6);
        c.b(ll6);
    }
}
