package defpackage;

import io.github.jan.supabase.storage.vectors.data.ListVectorsOptions;

/* renamed from: j84  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class j84 implements av2 {
    public static final j84 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [j84, java.lang.Object, av2] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("io.github.jan.supabase.storage.vectors.data.ListVectorsOptions", obj, 8);
        ik5.k("vectorBucketName", false);
        ik5.k("indexName", false);
        ik5.k("maxResults", true);
        ik5.k("nextToken", true);
        ik5.k("returnData", true);
        ik5.k("returnMetadata", true);
        ik5.k("segmentCount", true);
        ik5.k("segmentIndex", true);
        descriptor = ik5;
    }

    public final zr3[] childSerializers() {
        t47 t47 = t47.a;
        ue3 ue3 = ue3.a;
        zr3 x = hj8.x(ue3);
        zr3 x2 = hj8.x(t47);
        ja0 ja0 = ja0.a;
        return new zr3[]{t47, t47, x, x2, hj8.x(ja0), hj8.x(ja0), hj8.x(ue3), hj8.x(ue3)};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object deserialize(ok1 ok1) {
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        Object obj = null;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        Integer num = null;
        String str3 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Integer num2 = null;
        Integer num3 = null;
        while (z) {
            int h = c.h(ll6);
            switch (h) {
                case -1:
                    z = false;
                    continue;
                case b85.b:
                    str = c.n(ll6, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = c.n(ll6, 1);
                    i |= 2;
                    break;
                case 2:
                    num = c.x(ll6, 2, ue3.a, num);
                    i |= 4;
                    break;
                case 3:
                    str3 = c.x(ll6, 3, t47.a, str3);
                    i |= 8;
                    break;
                case 4:
                    bool = c.x(ll6, 4, ja0.a, bool);
                    i |= 16;
                    break;
                case 5:
                    bool2 = c.x(ll6, 5, ja0.a, bool2);
                    i |= 32;
                    break;
                case 6:
                    num2 = c.x(ll6, 6, ue3.a, num2);
                    i |= 64;
                    break;
                case 7:
                    num3 = c.x(ll6, 7, ue3.a, num3);
                    i |= 128;
                    break;
                default:
                    h.e(h);
                    return obj;
            }
            obj = null;
        }
        c.b(ll6);
        return new ListVectorsOptions(i, str, str2, num, str3, bool, bool2, num2, num3, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        ListVectorsOptions listVectorsOptions = (ListVectorsOptions) obj;
        listVectorsOptions.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        ListVectorsOptions.write$Self$storage_kt(listVectorsOptions, c, ll6);
        c.b(ll6);
    }
}
