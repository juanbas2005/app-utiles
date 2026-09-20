package defpackage;

import io.github.jan.supabase.storage.vectors.data.GetVectorOptions;
import java.util.List;

/* renamed from: sv2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class sv2 implements av2 {
    public static final sv2 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, av2, sv2] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("io.github.jan.supabase.storage.vectors.data.GetVectorOptions", obj, 5);
        ik5.k("vectorBucketName", false);
        ik5.k("indexName", false);
        ik5.k("keys", true);
        ik5.k("returnData", true);
        ik5.k("returnMetadata", true);
        descriptor = ik5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: zr3[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final zr3[] childSerializers() {
        nz3[] access$get$childSerializers$cp = GetVectorOptions.$childSerializers;
        t47 t47 = t47.a;
        ja0 ja0 = ja0.a;
        return new zr3[]{t47, t47, access$get$childSerializers$cp[2].getValue(), hj8.x(ja0), hj8.x(ja0)};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.Boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object deserialize(ok1 ok1) {
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        nz3[] access$get$childSerializers$cp = GetVectorOptions.$childSerializers;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        List list = null;
        Boolean bool = null;
        Boolean bool2 = null;
        while (z) {
            int h = c.h(ll6);
            if (h == -1) {
                z = false;
            } else if (h == 0) {
                str = c.n(ll6, 0);
                i |= 1;
            } else if (h == 1) {
                str2 = c.n(ll6, 1);
                i |= 2;
            } else if (h == 2) {
                list = c.r(ll6, 2, (zr3) access$get$childSerializers$cp[2].getValue(), list);
                i |= 4;
            } else if (h == 3) {
                bool = c.x(ll6, 3, ja0.a, bool);
                i |= 8;
            } else if (h == 4) {
                bool2 = c.x(ll6, 4, ja0.a, bool2);
                i |= 16;
            } else {
                h.e(h);
                return null;
            }
        }
        c.b(ll6);
        return new GetVectorOptions(i, str, str2, list, bool, bool2, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        GetVectorOptions getVectorOptions = (GetVectorOptions) obj;
        getVectorOptions.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        GetVectorOptions.write$Self$storage_kt(getVectorOptions, c, ll6);
        c.b(ll6);
    }
}
