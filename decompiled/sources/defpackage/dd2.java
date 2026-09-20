package defpackage;

import io.github.jan.supabase.storage.FileObjectV2;
import kotlinx.serialization.json.JsonObject;

/* renamed from: dd2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class dd2 implements av2 {
    public static final dd2 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [dd2, java.lang.Object, av2] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("io.github.jan.supabase.storage.FileObjectV2", obj, 13);
        ik5.k("name", false);
        ik5.k("id", false);
        ik5.k("version", false);
        ik5.k("bucket_id", true);
        ik5.k("updated_at", true);
        ik5.k("created_at", false);
        ik5.k("last_accessed_at", true);
        ik5.k("metadata", true);
        ik5.k("size", false);
        ik5.k("content_type", false);
        ik5.k("etag", true);
        ik5.k("last_modified", true);
        ik5.k("cache_control", true);
        descriptor = ik5;
    }

    public final zr3[] childSerializers() {
        t47 t47 = t47.a;
        zr3 x = hj8.x(t47);
        zr3 x2 = hj8.x(t47);
        wd3 wd3 = wd3.a;
        return new zr3[]{t47, x, t47, x2, hj8.x(wd3), wd3, hj8.x(wd3), hj8.x(xm3.a), tc4.a, t47, hj8.x(t47), hj8.x(wd3), hj8.x(t47)};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: qd3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: qd3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: qd3} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object deserialize(ok1 ok1) {
        boolean z;
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        long j = 0;
        String str = null;
        qd3 qd3 = null;
        boolean z2 = true;
        JsonObject jsonObject = null;
        String str2 = null;
        int i = 0;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        qd3 qd32 = null;
        qd3 qd33 = null;
        qd3 qd34 = null;
        String str7 = null;
        while (z2) {
            int h = c.h(ll6);
            switch (h) {
                case -1:
                    z2 = false;
                    continue;
                case b85.b:
                    z = z2;
                    str3 = c.n(ll6, 0);
                    i |= 1;
                    break;
                case 1:
                    z = z2;
                    str4 = c.x(ll6, 1, t47.a, str4);
                    i |= 2;
                    break;
                case 2:
                    boolean z3 = z2;
                    str5 = c.n(ll6, 2);
                    i |= 4;
                    continue;
                case 3:
                    z = z2;
                    str6 = c.x(ll6, 3, t47.a, str6);
                    i |= 8;
                    break;
                case 4:
                    z = z2;
                    qd32 = c.x(ll6, 4, wd3.a, qd32);
                    i |= 16;
                    break;
                case 5:
                    z = z2;
                    qd33 = c.r(ll6, 5, wd3.a, qd33);
                    i |= 32;
                    break;
                case 6:
                    z = z2;
                    qd34 = c.x(ll6, 6, wd3.a, qd34);
                    i |= 64;
                    break;
                case 7:
                    z = z2;
                    jsonObject = (JsonObject) c.x(ll6, 7, xm3.a, jsonObject);
                    i |= 128;
                    break;
                case 8:
                    boolean z4 = z2;
                    j = c.D(ll6, 8);
                    i |= 256;
                    continue;
                case 9:
                    boolean z5 = z2;
                    str7 = c.n(ll6, 9);
                    i |= 512;
                    continue;
                case 10:
                    z = z2;
                    str2 = (String) c.x(ll6, 10, t47.a, str2);
                    i |= 1024;
                    break;
                case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                    z = z2;
                    qd3 = (qd3) c.x(ll6, 11, wd3.a, qd3);
                    i |= 2048;
                    break;
                case 12:
                    z = z2;
                    str = (String) c.x(ll6, 12, t47.a, str);
                    i |= 4096;
                    break;
                default:
                    h.e(h);
                    return null;
            }
            z2 = z;
        }
        c.b(ll6);
        return new FileObjectV2(i, str3, str4, str5, str6, qd32, qd33, qd34, jsonObject, j, str7, str2, qd3, str, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        FileObjectV2 fileObjectV2 = (FileObjectV2) obj;
        fileObjectV2.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        FileObjectV2.write$Self$storage_kt(fileObjectV2, c, ll6);
        c.b(ll6);
    }
}
