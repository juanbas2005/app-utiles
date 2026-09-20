package defpackage;

import io.github.jan.supabase.storage.Bucket;
import java.util.List;

/* renamed from: nc0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class nc0 implements av2 {
    public static final nc0 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, nc0, av2] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("io.github.jan.supabase.storage.Bucket", obj, 9);
        ik5.k("created_at", false);
        ik5.k("id", false);
        ik5.k("name", false);
        ik5.k("owner", false);
        ik5.k("updated_at", false);
        ik5.k("public", false);
        ik5.k("allowed_mime_types", true);
        ik5.k("file_size_limit", true);
        ik5.k("type", true);
        descriptor = ik5;
    }

    public final zr3[] childSerializers() {
        nz3[] access$get$childSerializers$cp = Bucket.$childSerializers;
        zr3 x = hj8.x((zr3) access$get$childSerializers$cp[6].getValue());
        zr3 x2 = hj8.x(tc4.a);
        zr3 x3 = hj8.x((zr3) access$get$childSerializers$cp[8].getValue());
        wd3 wd3 = wd3.a;
        t47 t47 = t47.a;
        return new zr3[]{wd3, t47, t47, t47, wd3, ja0.a, x, x2, x3};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: qd3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: qd3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object deserialize(ok1 ok1) {
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        nz3[] access$get$childSerializers$cp = Bucket.$childSerializers;
        rc0 rc0 = null;
        boolean z = true;
        Long l = null;
        int i = 0;
        qd3 qd3 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        qd3 qd32 = null;
        boolean z2 = false;
        List list = null;
        while (z) {
            int h = c.h(ll6);
            switch (h) {
                case -1:
                    z = false;
                    break;
                case b85.b:
                    qd3 = c.r(ll6, 0, wd3.a, qd3);
                    i |= 1;
                    break;
                case 1:
                    str = c.n(ll6, 1);
                    i |= 2;
                    break;
                case 2:
                    str2 = c.n(ll6, 2);
                    i |= 4;
                    break;
                case 3:
                    str3 = c.n(ll6, 3);
                    i |= 8;
                    break;
                case 4:
                    qd32 = c.r(ll6, 4, wd3.a, qd32);
                    i |= 16;
                    break;
                case 5:
                    z2 = c.z(ll6, 5);
                    i |= 32;
                    break;
                case 6:
                    list = c.x(ll6, 6, (zr3) access$get$childSerializers$cp[6].getValue(), list);
                    i |= 64;
                    break;
                case 7:
                    l = (Long) c.x(ll6, 7, tc4.a, l);
                    i |= 128;
                    break;
                case 8:
                    rc0 = (rc0) c.x(ll6, 8, (zr3) access$get$childSerializers$cp[8].getValue(), rc0);
                    i |= 256;
                    break;
                default:
                    h.e(h);
                    return null;
            }
        }
        c.b(ll6);
        return new Bucket(i, qd3, str, str2, str3, qd32, z2, list, l, rc0, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        Bucket bucket = (Bucket) obj;
        bucket.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        Bucket.write$Self$storage_kt(bucket, c, ll6);
        c.b(ll6);
    }
}
