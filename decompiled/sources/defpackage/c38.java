package defpackage;

import io.github.jan.supabase.storage.vectors.index.MetadataConfiguration;
import io.github.jan.supabase.storage.vectors.index.VectorIndex;

/* renamed from: c38  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class c38 implements av2 {
    public static final c38 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [c38, java.lang.Object, av2] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("io.github.jan.supabase.storage.vectors.index.VectorIndex", obj, 7);
        ik5.k("indexName", false);
        ik5.k("vectorBucketName", false);
        ik5.k("dataType", false);
        ik5.k("dimension", false);
        ik5.k("distanceMetric", false);
        ik5.k("metadataConfiguration", true);
        ik5.k("creationTime", true);
        descriptor = ik5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: zr3[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final zr3[] childSerializers() {
        nz3[] access$get$childSerializers$cp = VectorIndex.$childSerializers;
        t47 t47 = t47.a;
        return new zr3[]{t47, t47, access$get$childSerializers$cp[2].getValue(), ue3.a, access$get$childSerializers$cp[4].getValue(), hj8.x(kk4.a), hj8.x(xs7.a)};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: p28} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: qw1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: io.github.jan.supabase.storage.vectors.index.MetadataConfiguration} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: qd3} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object deserialize(ok1 ok1) {
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        nz3[] access$get$childSerializers$cp = VectorIndex.$childSerializers;
        Object obj = null;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
        p28 p28 = null;
        qw1 qw1 = null;
        MetadataConfiguration metadataConfiguration = null;
        qd3 qd3 = null;
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
                    p28 = c.r(ll6, 2, (zr3) access$get$childSerializers$cp[2].getValue(), p28);
                    i |= 4;
                    break;
                case 3:
                    i2 = c.s(ll6, 3);
                    i |= 8;
                    break;
                case 4:
                    qw1 = c.r(ll6, 4, (zr3) access$get$childSerializers$cp[4].getValue(), qw1);
                    i |= 16;
                    break;
                case 5:
                    metadataConfiguration = c.x(ll6, 5, kk4.a, metadataConfiguration);
                    i |= 32;
                    break;
                case 6:
                    qd3 = c.x(ll6, 6, xs7.a, qd3);
                    i |= 64;
                    break;
                default:
                    h.e(h);
                    return obj;
            }
            obj = null;
        }
        c.b(ll6);
        return new VectorIndex(i, str, str2, p28, i2, qw1, metadataConfiguration, qd3, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        VectorIndex vectorIndex = (VectorIndex) obj;
        vectorIndex.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        VectorIndex.write$Self$storage_kt(vectorIndex, c, ll6);
        c.b(ll6);
    }
}
